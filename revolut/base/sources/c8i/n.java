package c8i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f22210a;

    public n(n8b.a countryInteractor, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
                this.f22210a = countryInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
                this.f22210a = countryInteractor;
                break;
        }
    }

    public static kq2.d a(kq2.d dVar, double d, xi0.b bVar) {
        dj0.d fee2 = pyd.c.K(dVar.f188299b, d, bVar);
        double d5 = dVar.f188298a;
        Intrinsics.checkNotNullParameter(fee2, "fee");
        return new kq2.d(d5, fee2);
    }

    public boolean b(xi0.b firstCurrency, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(firstCurrency, "firstCurrency");
        if (bVar != null && ((o8b.c) this.f22210a).g()) {
            xi0.a aVar = xi0.b.Companion;
            aVar.getClass();
            xi0.b bVar2 = xi0.b.E;
            if (Intrinsics.f(firstCurrency, bVar2)) {
                aVar.getClass();
                if (!bVar.equals(bVar2)) {
                    return true;
                }
            }
            aVar.getClass();
            if (!Intrinsics.f(firstCurrency, bVar2)) {
                aVar.getClass();
                if (bVar.equals(bVar2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
