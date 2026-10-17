package iv5;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import mu5.p;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ LargeActionButtonDelegate.Model v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f168742w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(LargeActionButtonDelegate.Model model, o oVar, Continuation continuation) {
        super(2, continuation);
        this.v = model;
        this.f168742w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.v, this.f168742w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        o oVar = this.f168742w;
        if (i == 0) {
            yhm.o.b(obj2);
            if (Intrinsics.f(this.v.f52613a, "SORTING_BOTTOM_DIALOG_BUTTON_ID")) {
                CryptoInvestmentsSortingType cryptoInvestmentsSortingType = oVar.f168750r;
                if (cryptoInvestmentsSortingType != null) {
                    p pVar = oVar.o;
                    this.u = 1;
                    pVar.getClass();
                    mpd.p pVar2 = new mpd.p(pVar, cryptoInvestmentsSortingType, null, 9);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, pVar2, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                }
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yhm.o.b(obj2);
        j60.a.v(oVar.f168746m, false, null, 3);
        return Unit.f186387a;
    }
}
