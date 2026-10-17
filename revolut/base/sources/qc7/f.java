package qc7;

import com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.retail.core.navigation.FeatureCommand;
import h93.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ngm.n;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f244597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f244598c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ f(h hVar, f0 f0Var, boolean z, int i) {
        this.f244596a = i;
        this.f244597b = hVar;
        this.f244598c = f0Var;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        yt8.c kyc2 = (yt8.c) obj2;
        switch (this.f244596a) {
            case 0:
                Intrinsics.checkNotNullParameter(kyc2, "kyc");
                return new pfm.h(new fg8.h(this.f244597b, this.f244598c, this.d, kyc2), 2);
            default:
                Intrinsics.checkNotNullParameter(kyc2, "kyc");
                k39.b bVar = this.f244597b.f244600a;
                f0 f0Var = this.f244598c;
                return bVar.a(new FeatureCommand(new CardsScreenFeatureConfig(null, null, null, null, new CardScreenAction.Select(f0Var.f150110a, 4, f0Var.d() && this.d && n.p(kyc2.f316662a), false), 15)));
        }
    }
}
