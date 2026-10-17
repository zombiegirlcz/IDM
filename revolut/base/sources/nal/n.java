package nal;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.shared.feature.suspicious_transaction.api.models.Action;
import com.revolut.shared.feature.suspicious_transaction.api.models.RequestSuccessDialog;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.v1;
import nii.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.shared.feature.suspicious_transaction.impl.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Action.Request f213937w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar, Action.Request request, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f213937w = request;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.v, this.f213937w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Action.Request request = this.f213937w;
        com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            m mVar = new m(aVar2, request, null);
            this.u = 1;
            if (aVar2.p2(this, mVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        RequestSuccessDialog requestSuccessDialog = request.f104898c;
        TextClause textClause = new TextClause(requestSuccessDialog.f104910a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = requestSuccessDialog.f104911b;
        TextClause textClause2 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        RequestSuccessDialog.Button button = requestSuccessDialog.f104912c;
        yji.l.a1(aVar2, aVar2.X1(new y0("ID_STATUS_DIALOG_SUCCESS", new j0((Clause) textClause, (Clause) textClause2, (StatusDialogDescriptionProgress) null, (Parcelable) null, button == null ? u1.b.f216225a : new v1(new TextClause(button.f104913a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076), false, 4)), null, null, new q(aVar2, requestSuccessDialog, null), 3);
        return Unit.f186387a;
    }
}
