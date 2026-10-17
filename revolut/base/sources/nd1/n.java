package nd1;

import id1.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f214305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hf1.f f214306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ad1.a f214307c;

    public n(p shoppingCartRepository, hf1.f shoppingCartCalculator, ad1.a amountInteractor) {
        Intrinsics.checkNotNullParameter(shoppingCartRepository, "shoppingCartRepository");
        Intrinsics.checkNotNullParameter(shoppingCartCalculator, "shoppingCartCalculator");
        Intrinsics.checkNotNullParameter(amountInteractor, "amountInteractor");
        this.f214305a = shoppingCartRepository;
        this.f214306b = shoppingCartCalculator;
        this.f214307c = amountInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x012e, code lost:
    
        if (kotlin.Unit.f186387a == r3) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct r21, int r22, com.revolut.feature.acquiring.lite_pos.api.model.TaxRate r23, gim.c r24) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nd1.n.a(com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct, int, com.revolut.feature.acquiring.lite_pos.api.model.TaxRate, gim.c):java.lang.Object");
    }

    public final void b() {
        p pVar = this.f214305a;
        pVar.f160409c.clear();
        pVar.a();
        pVar.d.setValue(null);
        pVar.e.setValue(null);
    }

    public final n1g.p c() {
        return new n1g.p(this.f214305a.f160408b, this, 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0108, code lost:
    
        if (kotlin.Unit.f186387a != r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014b, code lost:
    
        if (kotlin.Unit.f186387a != r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0197, code lost:
    
        if (kotlin.Unit.f186387a != r3) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(dj0.d r20, java.lang.String r21, java.lang.String r22, com.revolut.feature.acquiring.lite_pos.api.model.TaxRate r23, int r24, gim.c r25) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nd1.n.d(dj0.d, java.lang.String, java.lang.String, com.revolut.feature.acquiring.lite_pos.api.model.TaxRate, int, gim.c):java.lang.Object");
    }
}
