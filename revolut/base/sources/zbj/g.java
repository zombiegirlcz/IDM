package zbj;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CryptoDepositsOverviewController f320906w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(CryptoDepositsOverviewController cryptoDepositsOverviewController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f320906w = cryptoDepositsOverviewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f320906w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f320906w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            case 2:
                g gVar3 = new g(this.f320906w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
            case 3:
                g gVar4 = new g(this.f320906w, continuation, 3);
                gVar4.v = obj2;
                return gVar4;
            case 4:
                g gVar5 = new g(this.f320906w, continuation, 4);
                gVar5.v = obj2;
                return gVar5;
            default:
                g gVar6 = new g(this.f320906w, continuation, 5);
                gVar6.v = obj2;
                return gVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((AppTipUIModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g) create((AppTipUIModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((g) create((AppTipUIModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((g) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zbj.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
