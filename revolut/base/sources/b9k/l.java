package b9k;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ skm.l f13830b;

    public /* synthetic */ l(skm.l lVar, int i) {
        this.f13829a = i;
        this.f13830b = lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f13829a;
        skm.l lVar = this.f13830b;
        switch (i) {
            case 0:
                oki.g showModalSticky = (oki.g) obj2;
                ExchangeGlobalAccessOutput flowResult = (ExchangeGlobalAccessOutput) obj3;
                Intrinsics.checkNotNullParameter(showModalSticky, "$this$showModalSticky");
                Intrinsics.checkNotNullParameter(flowResult, "flowResult");
                if (lVar.d()) {
                    m.Companion companion = yhm.m.INSTANCE;
                    lVar.resumeWith(Boolean.valueOf(flowResult instanceof ExchangeGlobalAccessOutput.FeatureAvailable));
                    showModalSticky.pop();
                }
                break;
            default:
                oki.g showModalSticky2 = (oki.g) obj2;
                dii.g output = (dii.g) obj3;
                Intrinsics.checkNotNullParameter(showModalSticky2, "$this$showModalSticky");
                Intrinsics.checkNotNullParameter(output, "output");
                t1.H(lVar, Boolean.valueOf(output instanceof dii.f));
                showModalSticky2.pop();
                break;
        }
        return Unit.f186387a;
    }
}
