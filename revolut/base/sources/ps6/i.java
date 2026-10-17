package ps6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f239409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f239410c;
    public final boolean d;
    public final String e;

    public i(String id10, String taxType, h schedulingOptions, boolean z, String state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        Intrinsics.checkNotNullParameter(schedulingOptions, "schedulingOptions");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f239408a = id10;
        this.f239409b = taxType;
        this.f239410c = schedulingOptions;
        this.d = z;
        this.e = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f239408a, iVar.f239408a) && Intrinsics.f(this.f239409b, iVar.f239409b) && Intrinsics.f(this.f239410c, iVar.f239410c) && this.d == iVar.d && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c((this.f239410c.hashCode() + p.a.c(this.f239408a.hashCode() * 31, 31, this.f239409b)) * 31, 31, this.d);
    }
}
