package q97;

import com.revolut.feature.credit.card.api.navigation.AdditionalCardsDestination;
import com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al4.d f243666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gz3.a f243667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t97.d f243668c;

    public d(t97.c productCellProvider, al4.d creditCardAdditionalCardholdersInteractor, gz3.a startCreditApplicationNavigationDestinationProvider) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(creditCardAdditionalCardholdersInteractor, "creditCardAdditionalCardholdersInteractor");
        Intrinsics.checkNotNullParameter(startCreditApplicationNavigationDestinationProvider, "startCreditApplicationNavigationDestinationProvider");
        this.f243666a = creditCardAdditionalCardholdersInteractor;
        this.f243667b = startCreditApplicationNavigationDestinationProvider;
        this.f243668c = t97.d.ADDITIONAL_CREDIT_CARD;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return id10 == this.f243668c;
    }

    @Override // p97.c
    public final efm.r b() {
        om4.l lVar = (om4.l) this.f243666a;
        return rd0.e.c(rd0.e.e(new pkg.e(vkm.q.q(mo3.a.g(xam.a.h(new jkh.g((Continuation) null, lVar, 18), vkm.q.q(lVar.f226626c.d())), null, new q92.f(2), 1)), this, 12), zhm.h0.f322473a, new otd.a(3, 14, null)), skm.p0.f264003c);
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        if (productCell.f234280a != this.f243668c) {
            throw new IllegalArgumentException(prk.o.q("Unsupported: ", productCell.f234280a));
        }
        Object obj2 = productCell.f234283g;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState.Available");
        AdditionalCardholdersState.Available available = (AdditionalCardholdersState.Available) obj2;
        String str = available.f69809a;
        ufm.b bVarM = efm.d0.m(available.f69810b == 0 ? new o97.d(this.f243667b.c(new ft3.r(str), new ft3.a1(grl.r2.GLOBAL_SEARCH, null, null, null, null, 30), wp3.a.OPEN_EXISTING_APPLICATION, yp3.d.DEFAULT, (1916 & 16) != 0 ? null : null, (1916 & 32) != 0 ? yp3.f.SHOW_ALL : null, yp3.c.DEFAULT, (1916 & 128) != 0 ? yp3.e.SKIP_ON_TOGGLE_DISABLED : null, yp3.b.DEFAULT, (1916 & 512) != 0 ? null : null, null)) : new o97.d(new AdditionalCardsDestination(str, null)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
