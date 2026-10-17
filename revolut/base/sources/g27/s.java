package g27;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage;
import com.revolut.retail.core.navigation.BrowserCommand;
import com.revolut.retail.core.navigation.IntentCommand;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.CoroutineScope;
import rp0.k1;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ t A;
    public final /* synthetic */ OrderInitiationPage B;
    public t u;
    public s70.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f139929w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public l17.a f139930x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f139931y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, t tVar, OrderInitiationPage orderInitiationPage, Continuation continuation) {
        super(2, continuation);
        this.z = str;
        this.A = tVar;
        this.B = orderInitiationPage;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new s(this.z, this.A, this.B, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        s70.a aVar;
        l17.a aVar2;
        String str;
        t tVar;
        fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f139931y;
        OrderInitiationPage orderInitiationPage = this.B;
        if (i == 0) {
            yhm.o.b(obj2);
            String str2 = this.z;
            int iHashCode = str2.hashCode();
            t tVar2 = this.A;
            switch (iHashCode) {
                case -2132104060:
                    if (str2.equals("ITEM_ID_SHARE_EMAIL")) {
                        s70.a aVar4 = tVar2.v;
                        m70.a.c(t0.f186434a);
                        l17.a aVar5 = tVar2.f139935s;
                        d0 d0VarF = tVar2.f139934r.f(false);
                        this.u = tVar2;
                        this.v = aVar4;
                        this.f139929w = "";
                        this.f139930x = aVar5;
                        this.f139931y = 1;
                        Object objB = nim.a.b(d0VarF, this);
                        if (objB == aVar3) {
                            return aVar3;
                        }
                        aVar = aVar4;
                        obj2 = objB;
                        aVar2 = aVar5;
                        str = "";
                        tVar = tVar2;
                        break;
                    }
                    return Unit.f186387a;
                case -1474064871:
                    if (str2.equals("ITEM_ID_SHARE_QR")) {
                        return tVar2.C1(new FreelancerBizFeatureConfig.QrShare(orderInitiationPage.f, orderInitiationPage.f86431h));
                    }
                    return Unit.f186387a;
                case 762449261:
                    if (str2.equals("ITEM_ID_SHARE_COPY")) {
                        String str3 = orderInitiationPage.f86431h;
                        c70.a aVar6 = tVar2.f139937w;
                        m70.a.c(t0.f186434a);
                        aVar6.a("", str3, false);
                        if (!c70.a.g()) {
                            ((k1) tVar2.f139938x).d(new ShotDialogDisplayer$Configuration("COPY_TO_CLIPBOARD_SHOT_ID", new TextLocalisedClause(R$string.freelancer_sale_payment_link_copied_message, null, null, 14), null, null, null, null, null, Constants.TAG_FC_SPEED_MODE));
                        }
                        return Unit.f186387a;
                    }
                    return Unit.f186387a;
                case 762711538:
                    if (str2.equals("ITEM_ID_SHARE_LINK")) {
                        return tVar2.C1(u0.b(new BrowserCommand(((f80.b) tVar2.f139939y).f(orderInitiationPage.f86431h))));
                    }
                    return Unit.f186387a;
                default:
                    return Unit.f186387a;
            }
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aVar2 = this.f139930x;
        str = this.f139929w;
        aVar = this.v;
        tVar = this.u;
        yhm.o.b(obj2);
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        return tVar.C1(u0.b(new IntentCommand(((s70.b) aVar).d(str, aVar2.a((do3.n) obj2, orderInitiationPage.f, orderInitiationPage.f86431h), new String[0]), null)));
    }
}
