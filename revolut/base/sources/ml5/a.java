package ml5;

import com.revolut.feature.tab.crypto.api.navigation.CryptoSettingsInputData;
import com.revolut.feature.tab.crypto.api.navigation.TabCryptoKompotFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import ji5.e;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ufm.f;
import ufm.i;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f206635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f206636c;

    public /* synthetic */ a(c cVar, boolean z, int i) {
        this.f206634a = i;
        this.f206635b = cVar;
        this.f206636c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        FeatureCommand featureCommandG;
        switch (this.f206634a) {
            case 0:
                Boolean deeplinkWasHandled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(deeplinkWasHandled, "deeplinkWasHandled");
                if (deeplinkWasHandled.booleanValue()) {
                    return d0.m(Boolean.TRUE);
                }
                c cVar = this.f206635b;
                ufm.c cVar2 = new ufm.c(new h4d.d(cVar, 25), 2);
                Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
                i iVar = new i(new f(w.H0(cVar2, ((e) cVar.d).c()), new mhd.c(new a(cVar, this.f206636c, 1), 23), 3), new mhd.c(new mk3.c(24), 24), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            default:
                Pair pair = (Pair) obj2;
                Boolean bool = (Boolean) pair.f186385a;
                yh5.a aVar = (yh5.a) pair.f186386b;
                boolean zBooleanValue = bool.booleanValue();
                c cVar3 = this.f206635b;
                if (zBooleanValue && yh5.b.w(aVar)) {
                    featureCommandG = new FeatureCommand(new TabCryptoKompotFeatureConfig.CryptoSettingsConfig(new CryptoSettingsInputData.OpenSpareChangeAtTop(null)));
                    if (this.f206636c) {
                        featureCommandG = c.g(cVar3, featureCommandG, null, 2);
                    }
                } else {
                    featureCommandG = c.g(cVar3, null, yh5.b.w(aVar) ? u49.b.f277278a : u49.a.f277275a, 1);
                }
                cVar3.f206640b.c(featureCommandG);
                return Unit.f186387a;
        }
    }
}
