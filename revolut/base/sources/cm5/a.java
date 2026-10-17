package cm5;

import ch6.d;
import cjj.j;
import com.revolut.feature.crypto.strategies.api.navigation.CryptoStrategiesKompotFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import ji5.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ufm.i;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f25141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f25142c;

    public /* synthetic */ a(c cVar, boolean z, int i) {
        this.f25140a = i;
        this.f25141b = cVar;
        this.f25142c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        FeatureCommand featureCommandG;
        switch (this.f25140a) {
            case 0:
                Boolean deeplinkWasHandled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(deeplinkWasHandled, "deeplinkWasHandled");
                if (deeplinkWasHandled.booleanValue()) {
                    return d0.m(Boolean.TRUE);
                }
                c cVar = this.f25141b;
                d0 d0VarC = ((e) cVar.f25146c).c();
                d dVar = new d(new a(cVar, this.f25142c, 1), 17);
                d0VarC.getClass();
                i iVar = new i(new i(d0VarC, dVar, 1), new d(new j(19), 18), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            default:
                yh5.a cryptoFeatureState = (yh5.a) obj2;
                Intrinsics.checkNotNullParameter(cryptoFeatureState, "cryptoFeatureState");
                boolean zW = yh5.b.w(cryptoFeatureState);
                c cVar2 = this.f25141b;
                if (zW) {
                    featureCommandG = new FeatureCommand(CryptoStrategiesKompotFeatureConfig.CryptoStrategies.f70998g);
                    if (this.f25142c) {
                        featureCommandG = c.g(cVar2, featureCommandG, null, 2);
                    }
                } else {
                    featureCommandG = c.g(cVar2, null, u49.a.f277275a, 1);
                }
                cVar2.f25145b.c(featureCommandG);
                return Unit.f186387a;
        }
    }
}
