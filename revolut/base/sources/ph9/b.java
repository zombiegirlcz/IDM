package ph9;

import android.os.Parcelable;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import yji.n;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends n implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f236247l;

    public b(c provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f236247l = provider;
    }

    public final void Z2(n1 dialogResult, Function0 onFinish) {
        Intrinsics.checkNotNullParameter(dialogResult, "dialogResult");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        if ((dialogResult instanceof j1) || (dialogResult instanceof k1) || (dialogResult instanceof m1)) {
            onFinish.invoke();
        } else {
            if (!(dialogResult instanceof l1)) {
                throw new NoWhenBranchMatchedException();
            }
            FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
            Parcelable parcelableA = ((l1) dialogResult).f216190a.a();
            FeatureConfig featureConfig = parcelableA instanceof FeatureConfig ? (FeatureConfig) parcelableA : null;
            A2(u0.b(com.revolut.retail.core.navigation.a.c(finishCommand, featureConfig != null ? gc0.c.f(featureConfig) : null)));
        }
    }
}
