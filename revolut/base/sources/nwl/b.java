package nwl;

import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.k1;
import nii.l1;
import nii.n1;
import sri.m;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f220008b;

    public /* synthetic */ b(l lVar, int i) {
        this.f220007a = i;
        this.f220008b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f220007a) {
            case 0:
                n1 statusResult = (n1) obj2;
                Intrinsics.checkNotNullParameter(statusResult, "statusResult");
                if ((statusResult instanceof l1) || (statusResult instanceof k1)) {
                    this.f220008b.T();
                }
                break;
            default:
                FeatureConfig featureConfig = (FeatureConfig) obj2;
                m mVar = this.f220008b.f220027m;
                FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
                Intrinsics.h(featureConfig);
                mVar.c(com.revolut.retail.core.navigation.a.c(finishCommand, new FeatureCommand(featureConfig)));
                break;
        }
        return Unit.f186387a;
    }
}
