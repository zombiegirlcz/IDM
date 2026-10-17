package iyd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new iw4.b(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f169692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f169693c;

    public /* synthetic */ u(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            j1.f(s.f169690a.getDescriptor(), i, 7);
            throw null;
        }
        this.f169691a = str;
        this.f169692b = str2;
        this.f169693c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f169691a, uVar.f169691a) && Intrinsics.f(this.f169692b, uVar.f169692b) && Intrinsics.f(this.f169693c, uVar.f169693c);
    }

    public final int hashCode() {
        int iHashCode = this.f169691a.hashCode() * 31;
        String str = this.f169692b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f169693c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public u(String value, String str, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f169691a = value;
        this.f169692b = str;
        this.f169693c = arrayList;
    }
}
