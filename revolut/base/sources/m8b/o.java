package m8b;

import android.graphics.Path;
import android.graphics.RectF;
import com.revolut.core.ui_kit.internal.views.slider.SliderView;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import ffk.t;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f203465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f203466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f203467c;
    public final Object d;

    public o(p pVar, p pVar2, p pVar3, p pVar4) {
        this.f203465a = pVar;
        this.f203466b = pVar2;
        this.f203467c = pVar3;
        this.d = pVar4;
    }

    public abstract wga.i a(PricingPlanSubscription pricingPlanSubscription, List list, List list2);

    public boolean b(do3.n user) {
        Intrinsics.checkNotNullParameter(user, "user");
        return false;
    }

    public abstract void c(List list, float f, RectF rectF, Path path, Path path2);

    public o(ffk.j pricingPlanLimitsInteractor, t pricingPlanInteractor, l80.e dateProvider, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanLimitsInteractor, "pricingPlanLimitsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f203465a = pricingPlanLimitsInteractor;
        this.f203466b = pricingPlanInteractor;
        this.f203467c = dateProvider;
        this.d = userInteractor;
    }

    public o(SliderView sliderView) {
        this.d = sliderView;
        this.f203465a = new RectF();
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = 0.0f;
        }
        this.f203466b = fArr;
        float[] fArr2 = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr2[i2] = 0.0f;
        }
        this.f203467c = fArr2;
    }
}
