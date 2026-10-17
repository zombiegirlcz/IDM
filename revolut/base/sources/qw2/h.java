package qw2;

import cli.y;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import qw2.l;
import vkm.j2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        i iVar = this.v;
        y yVar = iVar.f249751q;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        if (i == 0) {
            o.b(obj2);
            f03.b bVar = new f03.b(((k) ((j2) yVar.f22677a).getValue()).f249752a, 2);
            e eVar = new e(iVar, continuation, 1);
            this.u = 1;
            obj2 = n14.k.V(iVar, null, null, bVar, eVar, this, 3);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (((nii.h) obj2) instanceof nii.g) {
            if (((k) ((j2) yVar.f22677a).getValue()).f249753b) {
                iVar.C1(u0.b(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6)))));
            } else {
                iVar.C2(l.b.f249756a);
            }
        }
        return Unit.f186387a;
    }
}
