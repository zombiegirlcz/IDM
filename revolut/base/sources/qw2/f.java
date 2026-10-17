package qw2;

import cli.y;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.card_screen.api.navigation.CardsCarouselFlowDestination;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import qw2.l;
import vkm.j2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objV;
        i iVar = this.v;
        y yVar = iVar.f249751q;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        if (i == 0) {
            o.b(obj2);
            f03.b bVar = new f03.b(((k) ((j2) yVar.f22677a).getValue()).f249752a, 1);
            e eVar = new e(iVar, continuation, 0);
            this.u = 1;
            objV = n14.k.V(iVar, null, null, bVar, eVar, this, 3);
            if (objV == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objV = obj2;
        }
        if (((nii.h) objV) instanceof nii.g) {
            if (((k) ((j2) yVar.f22677a).getValue()).f249753b) {
                iVar.C1(u0.b(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CardsCarouselFlowDestination(null, null, null, null, new CardScreenAction.Select(((k) ((j2) yVar.f22677a).getValue()).f249752a.f150110a, 6, false, false), null, 47), false, (Integer) null, 0, 61)), 2)))));
            } else {
                iVar.C2(l.a.f249755a);
            }
        }
        return Unit.f186387a;
    }
}
