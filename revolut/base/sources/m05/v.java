package m05;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new d(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f201083c;

    public /* synthetic */ v(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            j1.f(t.f201080a.getDescriptor(), i, 7);
            throw null;
        }
        this.f201081a = str;
        this.f201082b = str2;
        this.f201083c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f201081a, vVar.f201081a) && Intrinsics.f(this.f201082b, vVar.f201082b) && Intrinsics.f(this.f201083c, vVar.f201083c);
    }

    public final int hashCode() {
        return this.f201083c.hashCode() + p.a.c(this.f201081a.hashCode() * 31, 31, this.f201082b);
    }

    public v(String type, String status, ArrayList actions) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f201081a = type;
        this.f201082b = status;
        this.f201083c = actions;
    }
}
