package uyl;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements koi.j, o31.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f284472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f284473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f284474c;
    public p31.c d;

    public q(String listId, Image image) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f284472a = listId;
        this.f284473b = image;
        this.f284474c = null;
        this.d = null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52973a() {
        return this.f284472a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f284472a, qVar.f284472a) && this.f284473b.equals(qVar.f284473b) && Intrinsics.f(this.f284474c, qVar.f284474c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        int iC = a10.b.c(this.f284473b, this.f284472a.hashCode() * 31, 28629151);
        p31.c cVar = this.f284474c;
        int iHashCode = (iC + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.d;
        return (iHashCode + (cVar2 != null ? cVar2.hashCode() : 0)) * 961;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52979l() {
        return this.f284474c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52980m() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return null;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52981n() {
        return null;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f284474c = cVar;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.d = cVar;
    }
}
