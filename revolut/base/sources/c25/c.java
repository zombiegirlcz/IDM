package c25;

import al4.p;
import al4.q;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import mt8.d;
import o97.l;
import o97.r;
import o97.y;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import t70.g;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements qp3.a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f20667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f20668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f20669c;
    public final f73.c d;
    public final g e;
    public final p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d25.c f20670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f20671h;
    public final j2 i;

    public c(q creditCardProductInteractor, d kycInteractor, f cardsInteractor, f73.c cardsNavigationFactory, g localization, p creditCardProductFeatureTogglesInteractor, d25.c creditCardsSearchSourceUiProvider) {
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(cardsNavigationFactory, "cardsNavigationFactory");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditCardsSearchSourceUiProvider, "creditCardsSearchSourceUiProvider");
        this.f20667a = creditCardProductInteractor;
        this.f20668b = kycInteractor;
        this.f20669c = cardsInteractor;
        this.d = cardsNavigationFactory;
        this.e = localization;
        this.f = creditCardProductFeatureTogglesInteractor;
        this.f20670g = creditCardsSearchSourceUiProvider;
        this.f20671h = r.CREDIT_CARDS;
        this.i = vkm.q.c(new Data(Boolean.FALSE, null, false, 6, null));
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        return e.c(xam.a.h(new an8.a(1, f0.f322471a, this, searchQuery, (Continuation) null), ((qx4.f) this.f).j()), kotlin.coroutines.g.f186406a);
    }

    @Override // z87.f
    public final r h() {
        return this.f20671h;
    }

    @Override // z87.f
    public final Object l(String str, y yVar, Continuation continuation) {
        j2 j2Var;
        Object value;
        Data data;
        Object obj2 = yVar.f223136b;
        if (obj2 instanceof n93.b) {
            return new l(this.d.c(new CardScreenAction.Select(((n93.b) obj2).f213547a, 6, false, false), AccountId.Personal.f51414a));
        }
        if (obj2 instanceof d25.a) {
            do {
                j2Var = this.i;
                value = j2Var.getValue();
                Data data2 = (Data) value;
                try {
                    data = new Data(data2.getContent() != null ? Boolean.valueOf(!((Boolean) r1).booleanValue()) : null, data2.getError(), data2.getLoading());
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
            } while (!j2Var.h(value, data));
        }
        return o97.e.f223096a;
    }
}
