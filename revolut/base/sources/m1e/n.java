package m1e;

import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;

/* JADX INFO: loaded from: classes7.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PercentageClause f201488a = new PercentageClause(1.5d, (PercentageClause.Format) null, (Custom) null, 6);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final MoneyClause f201489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final MoneyClause f201490c;

    static {
        xi0.b.Companion.getClass();
        xi0.b bVar = xi0.b.i;
        f201489b = new MoneyClause(new dj0.d(MotionCaptureViewModelImpl.MAX_RECORDING_TIME_MILLISECONDS, bVar), new MoneyClause.Format.Asset(0), null, null, 12);
        f201490c = new MoneyClause(new dj0.d(1000000L, bVar), new MoneyClause.Format.Asset(0), null, null, 12);
    }
}
