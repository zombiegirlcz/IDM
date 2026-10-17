package fg8;

import com.revolut.feature.junior_settings.api.navigation.JuniorSettingsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import sk8.b;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends gim.i implements Function2 {
    public final /* synthetic */ psg.a A;
    public FeatureCommand u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ sk8.b f134994w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t0 f134995x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f134996y;
    public final /* synthetic */ com.revolut.feature.junior_profile.api.models.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(sk8.b bVar, t0 t0Var, String str, com.revolut.feature.junior_profile.api.models.a aVar, psg.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.f134994w = bVar;
        this.f134995x = t0Var;
        this.f134996y = str;
        this.z = aVar;
        this.A = aVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new s0(this.f134994w, this.f134995x, this.f134996y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FeatureCommand featureCommand;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            sk8.b bVar = this.f134994w;
            boolean z = bVar instanceof sk8.a;
            FeatureCommand featureCommand2 = null;
            String str = this.f134996y;
            if (z) {
                String f77099b = this.z.getF77099b();
                sk8.a aVar2 = (sk8.a) bVar;
                dj0.d dVar = aVar2.f263778a;
                boolean zA = ta6.a.A(this.A);
                String str2 = aVar2.f263779b;
                if (zA) {
                    featureCommand2 = new FeatureCommand(new JuniorSettingsFeatureConfig.ReferralCampaignAccess(dVar, str, f77099b, str2));
                }
            } else if (!Intrinsics.f(bVar, b.a.f263780a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.u = featureCommand2;
            this.v = 1;
            obj2 = u68.b.b(this.f134995x.f135002g, str, null, null, this, 14);
            if (obj2 == aVar) {
                return aVar;
            }
            featureCommand = featureCommand2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            featureCommand = this.u;
            yhm.o.b(obj2);
        }
        NaviCommand naviCommand = (NaviCommand) obj2;
        return featureCommand != null ? com.revolut.retail.core.navigation.a.c(naviCommand, featureCommand) : naviCommand;
    }
}
