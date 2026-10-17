package c59;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f21480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f21481b;

    public /* synthetic */ i(int i, d dVar, d dVar2) throws Throwable {
        if ((i & 1) == 0) {
            this.f21480a = null;
        } else {
            this.f21480a = dVar;
        }
        if ((i & 2) == 0) {
            this.f21481b = null;
        } else {
            this.f21481b = dVar2;
        }
        if (this.f21480a == null && this.f21481b == null) {
            y.B("All fields can't be null in request");
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f21480a, iVar.f21480a) && Intrinsics.f(this.f21481b, iVar.f21481b);
    }

    public final int hashCode() {
        d dVar = this.f21480a;
        int iHashCode = (dVar == null ? 0 : dVar.f21476a.hashCode()) * 31;
        d dVar2 = this.f21481b;
        return iHashCode + (dVar2 != null ? dVar2.f21476a.hashCode() : 0);
    }

    public i(a59.a aVar, a59.a aVar2, int i) throws Throwable {
        String strName;
        String strName2;
        d dVar = null;
        aVar = (i & 1) != 0 ? null : aVar;
        aVar2 = (i & 2) != 0 ? null : aVar2;
        d dVar2 = (aVar == null || (strName2 = aVar.name()) == null) ? null : new d(strName2);
        if (aVar2 != null && (strName = aVar2.name()) != null) {
            dVar = new d(strName);
        }
        this.f21480a = dVar2;
        this.f21481b = dVar;
        if (dVar2 == null && dVar == null) {
            y.B("All fields can't be null in request");
        }
    }
}
