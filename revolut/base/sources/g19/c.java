package g19;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f139565c = {null, j.c(k.PUBLICATION, new fyh.k(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f139567b;

    public /* synthetic */ c(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(a.f139564a.getDescriptor(), i, 3);
            throw null;
        }
        this.f139566a = str;
        this.f139567b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f139566a, cVar.f139566a) && Intrinsics.f(this.f139567b, cVar.f139567b);
    }

    public final int hashCode() {
        return this.f139567b.hashCode() + (this.f139566a.hashCode() * 31);
    }

    public c(String id10, List slots) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(slots, "slots");
        this.f139566a = id10;
        this.f139567b = slots;
    }
}
