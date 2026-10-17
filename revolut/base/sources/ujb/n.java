package ujb;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f280572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f280573c;
    public final List d;
    public final List e;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{null, null, null, yhm.j.c(kVar, new u9a.b(28)), yhm.j.c(kVar, new u9a.b(29))};
    }

    public /* synthetic */ n(int i, dj0.d dVar, String str, String str2, List list, List list2) {
        if (31 != (i & 31)) {
            j1.f(l.f280567a.getDescriptor(), i, 31);
            throw null;
        }
        this.f280571a = str;
        this.f280572b = str2;
        this.f280573c = dVar;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f280571a, nVar.f280571a) && Intrinsics.f(this.f280572b, nVar.f280572b) && Intrinsics.f(this.f280573c, nVar.f280573c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f280571a.hashCode() * 31, 31, this.f280572b);
        dj0.d dVar = this.f280573c;
        return this.e.hashCode() + p.a.d((iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.d);
    }

    public n(String description, String trackingDescription, dj0.d dVar, ArrayList checkpoints, ArrayList rewards) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(trackingDescription, "trackingDescription");
        Intrinsics.checkNotNullParameter(checkpoints, "checkpoints");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        this.f280571a = description;
        this.f280572b = trackingDescription;
        this.f280573c = dVar;
        this.d = checkpoints;
        this.e = rewards;
    }
}
