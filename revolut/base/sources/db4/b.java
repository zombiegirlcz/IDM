package db4;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.ExpiredPopupController;
import com.revolut.retail.core.navigation.FeatureCommand;
import ft3.a1;
import ft3.j1;
import ft3.r0;
import ft3.s0;
import ft3.t0;
import ft3.v0;
import ft3.w0;
import ft3.x0;
import ft3.y0;
import grl.r2;
import it3.k;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ExpiredPopupController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ExpiredPopupController expiredPopupController, Continuation continuation) {
        super(2, continuation);
        this.v = expiredPopupController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = (c) this.v.O.getValue();
        Intrinsics.h(model);
        i iVar = (i) cVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        y0 y0Var = null;
        if (Intrinsics.f(str, "ID_BUTTON_START_NEW_APPLICATION")) {
            CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = iVar.o.f67654a;
            j1 j1Var = creditApplicationPluginFlowContract$Configuration.d;
            gt3.f fVar = creditApplicationPluginFlowContract$Configuration.e;
            wp3.a aVar2 = wp3.a.START_FORCE;
            String str2 = creditApplicationPluginFlowContract$Configuration.k;
            r2 r2Var = r2.APPLICATION_EXPIRED;
            k kVar = creditApplicationPluginFlowContract$Configuration.f66898m;
            switch (kVar == null ? -1 : h.f112666a[kVar.ordinal()]) {
                case -1:
                    iVar.C2(new e(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(j1Var, fVar, aVar2, str2, new a1(r2Var, null, null, y0Var, null, 22), 6648))));
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    try {
                        m.Companion companion = m.INSTANCE;
                        throw new IllegalStateException("Expired plugin is not supported for family credit card invitee application");
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = m.INSTANCE;
                        Throwable thA = m.a(o.a(th10));
                        if (thA != null) {
                            hx7.e.n(thA);
                        }
                    }
                    break;
                case 2:
                    y0Var = x0.f137890a;
                    iVar.C2(new e(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(j1Var, fVar, aVar2, str2, new a1(r2Var, null, null, y0Var, null, 22), 6648))));
                    break;
                case 3:
                    y0Var = v0.f137882a;
                    iVar.C2(new e(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(j1Var, fVar, aVar2, str2, new a1(r2Var, null, null, y0Var, null, 22), 6648))));
                    break;
                case 4:
                    y0Var = w0.f137887a;
                    iVar.C2(new e(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(j1Var, fVar, aVar2, str2, new a1(r2Var, null, null, y0Var, null, 22), 6648))));
                    break;
                case 5:
                    y0Var = t0.f137874a;
                    iVar.C2(new e(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(j1Var, fVar, aVar2, str2, new a1(r2Var, null, null, y0Var, null, 22), 6648))));
                    break;
                case 6:
                    y0Var = s0.f137872a;
                    iVar.C2(new e(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(j1Var, fVar, aVar2, str2, new a1(r2Var, null, null, y0Var, null, 22), 6648))));
                    break;
                case 7:
                    y0Var = r0.f137867a;
                    iVar.C2(new e(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(j1Var, fVar, aVar2, str2, new a1(r2Var, null, null, y0Var, null, 22), 6648))));
                    break;
            }
        } else if (Intrinsics.f(str, "ID_BUTTON_GOT_IT")) {
            j60.a.v(iVar.f112667p, false, null, 3);
        }
        return Unit.f186387a;
    }
}
