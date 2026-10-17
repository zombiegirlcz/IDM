package mg7;

import android.os.Parcelable;
import aw0.o9;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.feature.incentive_reward.impl.model.IncentiveRewardDetailsParams;
import com.revolut.feature.incentive_reward.impl.ui.incentive_selection.flow.IncentiveSelectionFlowContract$InputData;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m2f.b0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends oki.h implements k {

    @NotNull
    public static final s Companion = new s();
    public final r10.q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o7.d f205187p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f205188q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w f205189r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sf7.a f205190s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final IncentiveSelectionFlowContract$InputData f205191t;
    public final y u;

    public u(cli.n mapper, r10.q incentiveRewardInteractor, o7.d transactionCategoryProvider, j60.a bottomDialogController, w dialogConfigurationFactory, sf7.a genericDialogConfigurationFactory, IncentiveSelectionFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(incentiveRewardInteractor, "incentiveRewardInteractor");
        Intrinsics.checkNotNullParameter(transactionCategoryProvider, "transactionCategoryProvider");
        Intrinsics.checkNotNullParameter(bottomDialogController, "bottomDialogController");
        Intrinsics.checkNotNullParameter(dialogConfigurationFactory, "dialogConfigurationFactory");
        Intrinsics.checkNotNullParameter(genericDialogConfigurationFactory, "genericDialogConfigurationFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = incentiveRewardInteractor;
        this.f205187p = transactionCategoryProvider;
        this.f205188q = bottomDialogController;
        this.f205189r = dialogConfigurationFactory;
        this.f205190s = genericDialogConfigurationFactory;
        this.f205191t = inputData;
        this.u = mra.d.b(this, new j(new Data(null, null, true, 3, null)), mapper, null, false, 12);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:36|62|37|38|64|39|(1:72)(11:42|66|43|44|45|53|(1:54)|68|57|34|(2:58|59)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0109, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010a, code lost:
    
        r17 = r10;
     */
    /* JADX WARN: Path cross not found for [B:32:0x0097, B:22:0x0077], limit reached: 70 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013c A[LOOP:0: B:54:0x0136->B:56:0x013c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00fa -> B:66:0x00fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0110 -> B:45:0x0102). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(mg7.u r25, gf7.h r26, gim.c r27) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mg7.u.I2(mg7.u, gf7.h, gim.c):java.lang.Object");
    }

    public static final void J2(u uVar, g gVar, IncentiveRewardDetailsParams incentiveRewardDetailsParams) {
        w wVar = uVar.f205189r;
        String message = gVar.d;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        yji.l.b1(uVar, uVar.X1(new y0("OPT_IN_SUCCESS_DIALOG_ID", new j0((Clause) new TextClause(message, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4)), null, new m75.i(uVar, incentiveRewardDetailsParams, null, 24), 3);
    }

    @Override // yji.l
    public final void I1() {
        Map contextParams = this.f205191t.f74869b;
        r10.q qVar = this.o;
        qVar.getClass();
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(contextParams, "contextParams");
        qf7.i iVar = (qf7.i) qVar.f250849b;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(contextParams, "contextParams");
        yji.l.a1(this, iVar.e.b(contextParams, loadingStrategy), null, null, new b0(this, (Continuation) null, 27), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
