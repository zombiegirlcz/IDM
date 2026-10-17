package k19;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class t {

    @NotNull
    public static final s Companion = new s();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new k16.d(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f180168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f180169c;

    public /* synthetic */ t(int i, String str, c cVar, List list) {
        if (3 != (i & 3)) {
            j1.f(r.f180166a.getDescriptor(), i, 3);
            throw null;
        }
        this.f180167a = str;
        this.f180168b = cVar;
        if ((i & 4) == 0) {
            this.f180169c = null;
        } else {
            this.f180169c = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f180167a, tVar.f180167a) && Intrinsics.f(this.f180168b, tVar.f180168b) && Intrinsics.f(this.f180169c, tVar.f180169c);
    }

    public final int hashCode() {
        int iHashCode = (this.f180168b.hashCode() + (this.f180167a.hashCode() * 31)) * 31;
        List list = this.f180169c;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
