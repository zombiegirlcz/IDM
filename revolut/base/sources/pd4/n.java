package pd4;

import android.os.Parcelable;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.application.plugins.api.models.config.ManualUnderwritingDocsSentPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentValidationResult;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentWithValidation;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.io.File;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.j0;
import nii.m0;
import nii.u1;
import nii.v1;
import nii.y0;
import nii.z;
import vd4.f;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d f235080b;

    public /* synthetic */ n(com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d dVar, int i) {
        this.f235079a = i;
        this.f235080b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        m0 g0Var;
        boolean z = true;
        Continuation continuation = null;
        int i = 0;
        switch (this.f235079a) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d dVar = this.f235080b;
                if (dVar.f67932q.a(error)) {
                    z = false;
                } else {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                    dVar.f67933r.getClass();
                    yji.l.a1(dVar, dVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.credit_manual_underwriting_upload_screen_status_error_title, null, null, 14), new TextLocalisedClause(R$string.credit_manual_underwriting_upload_screen_status_error_subtitle, null, null, 14), new TextLocalisedClause(R$string.credit_manual_underwriting_upload_screen_status_error_button, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 5)), null, null, new s(dVar, continuation, 2), 3);
                }
                return Boolean.valueOf(z);
            case 1:
                vd4.f outputData = (vd4.f) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d dVar2 = this.f235080b;
                y yVar = dVar2.f67938y;
                if (outputData instanceof vd4.g) {
                    Map map = ((i) ((j2) yVar.f22677a).getValue()).e;
                    vd4.g gVar = (vd4.g) outputData;
                    String str = gVar.f287781a;
                    if (((DocumentWithValidation) map.get(str)) != null) {
                        File file = new File(str);
                        DocumentValidationResult documentValidationResult = gVar.f287783c;
                        String str2 = gVar.f287782b;
                        String absolutePath = file.getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        dVar2.H2(yVar, new p5e.h(file, new DocumentWithValidation(absolutePath, name, documentValidationResult, str2), 12));
                    }
                } else {
                    if (!(outputData instanceof f.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i2 = jli.h.f175850a;
                }
                return Unit.f186387a;
            default:
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d dVar3 = this.f235080b;
                ServerError serverErrorA = dVar3.f67936w.a(error2);
                if ((serverErrorA != null ? serverErrorA.f51362a : 1) == 32076) {
                    o oVar = new o(dVar3, i);
                    b bVar = dVar3.f67933r;
                    ManualUnderwritingDocsSentPopupScreenConfig dialogConfig = dVar3.f67937x.f67922c;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(dialogConfig, "dialogConfig");
                    if (dialogConfig instanceof ManualUnderwritingDocsSentPopupScreenConfig.RequestSent) {
                        ManualUnderwritingDocsSentPopupScreenConfig.RequestSent requestSent = (ManualUnderwritingDocsSentPopupScreenConfig.RequestSent) dialogConfig;
                        g0Var = new j0(requestSent.f66368a, requestSent.f66369b, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new v1(requestSent.f66370c, null), true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4044);
                    } else {
                        if (!(dialogConfig instanceof ManualUnderwritingDocsSentPopupScreenConfig.DocsInReview)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ManualUnderwritingDocsSentPopupScreenConfig.DocsInReview docsInReview = (ManualUnderwritingDocsSentPopupScreenConfig.DocsInReview) dialogConfig;
                        g0Var = new g0(docsInReview.f66366a, docsInReview.f66367b, null, null, null, null, null, null, true, null, false, null, 16124);
                    }
                    yji.l.a1(dVar3, dVar3.X1(new y0(null, g0Var, false, 5)), null, null, new ox5.r(oVar, continuation, 24), 3);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
