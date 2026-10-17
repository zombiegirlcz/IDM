package elf;

import android.os.Parcelable;
import android.widget.TextView;
import ch.qos.logback.core.util.FileSize;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import com.onfido.workflow.internal.ui.WorkflowLoadingFragment;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig$Lesson$Destination;
import com.revolut.feature.learn.shared.impl.ui.course.overview.CourseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload;
import com.revolut.retail.common.ui.R$string;
import kotlin.Function;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import t80.m;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r1 implements FlowCollector, kotlin.jvm.internal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f127405b;

    public /* synthetic */ r1(Object obj2, int i) {
        this.f127404a = i;
        this.f127405b = obj2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) throws Throwable {
        Object objZ2;
        int i = this.f127404a;
        Object obj3 = this.f127405b;
        switch (i) {
            case 0:
                e60.l lVar = (e60.l) obj2;
                s1 s1Var = (s1) obj3;
                if (lVar instanceof e60.m) {
                    objZ2 = s1Var.Z2((e60.m) lVar, continuation);
                    if (objZ2 != fim.a.COROUTINE_SUSPENDED) {
                        objZ2 = Unit.f186387a;
                    }
                } else {
                    if (lVar instanceof e60.j) {
                        t80.m mVar = ((e60.j) lVar).f122857a;
                        if (mVar instanceof t80.o) {
                            s1Var.L2(new mii.h(new TextLocalisedClause(R$string.common_attachments_error_unknown, null, null, 14), "ERROR_TOAST_ID"));
                        } else if (mVar.equals(m.e.f268771a)) {
                            s1Var.L2(new mii.h(new TextLocalisedClause(R$string.common_attachments_error_not_valid, null, null, 14), "ERROR_TOAST_ID"));
                        } else if (mVar instanceof t80.n) {
                            s1Var.L2(new mii.h(new TextLocalisedClause(R$string.common_attachments_error_too_large, zhm.u.c(ch.qos.logback.core.util.a.p((s1Var.o.f268762b / FileSize.KB_COEFFICIENT) / FileSize.KB_COEFFICIENT, " MB")), null, 12), "ERROR_TOAST_ID"));
                        } else if (!mVar.equals(m.d.f268770a) && !mVar.equals(m.a.f268767a) && !mVar.equals(m.c.f268769a) && !mVar.equals(m.b.f268768a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    objZ2 = Unit.f186387a;
                }
                return objZ2 == fim.a.COROUTINE_SUSPENDED ? objZ2 : Unit.f186387a;
            case 1:
                nii.n1 n1Var = (nii.n1) obj2;
                k09.m mVar2 = (k09.m) obj3;
                if (n1Var instanceof nii.l1) {
                    Parcelable parcelableA = ((nii.l1) n1Var).f216190a.a();
                    if (parcelableA instanceof CourseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload) {
                        CourseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload courseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload = (CourseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload) parcelableA;
                        u09.q qVar = courseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload.f77985c;
                        u09.v vVar = courseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload.f77984b;
                        i09.k kVar = courseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload.d;
                        int i2 = kVar == null ? -1 : k09.i.f179997a[kVar.ordinal()];
                        if (i2 != -1) {
                            if (i2 == 1) {
                                mVar2.K1(vVar, qVar);
                            } else {
                                if (i2 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                mVar2.A2(new LearnKompotFeatureConfig$Lesson$Destination(qVar.f276145a, vVar));
                            }
                        }
                    }
                }
                Unit unit = Unit.f186387a;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                return unit;
            case 2:
                kl.a0 a0Var = (kl.a0) obj2;
                fl.a aVar2 = ((WorkflowLoadingFragment) obj3).f50199a0;
                if (aVar2 == null) {
                    Intrinsics.r("binding");
                    throw null;
                }
                TextView subtitle = aVar2.f135874b;
                TextView title = aVar2.f135875c;
                if (Intrinsics.f(a0Var, kl.y.f185251a)) {
                    Intrinsics.checkNotNullExpressionValue(title, "title");
                    ViewExtensionsKt.toInvisible$default(title, false, 1, null);
                    Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
                    ViewExtensionsKt.toInvisible$default(subtitle, false, 1, null);
                } else if (a0Var instanceof kl.z) {
                    Intrinsics.checkNotNullExpressionValue(title, "title");
                    ViewExtensionsKt.toVisible$default(title, false, 1, null);
                    Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
                    ViewExtensionsKt.toVisible$default(subtitle, false, 1, null);
                    Intrinsics.checkNotNullExpressionValue(title, "title");
                    kl.z zVar = (kl.z) a0Var;
                    czi.c.J(title, zVar.f185253a);
                    Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
                    czi.c.J(subtitle, zVar.f185254b);
                }
                Unit unit2 = Unit.f186387a;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                return unit2;
            default:
                Object objA = ((et6.q1) obj3).a((tr6.a) obj2, continuation);
                return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
        }
    }

    public final boolean equals(Object obj2) {
        switch (this.f127404a) {
            case 0:
                if ((obj2 instanceof FlowCollector) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    return Intrinsics.f(getFunctionDelegate(), ((kotlin.jvm.internal.n) obj2).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj2 instanceof FlowCollector) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    return Intrinsics.f(getFunctionDelegate(), ((kotlin.jvm.internal.n) obj2).getFunctionDelegate());
                }
                return false;
            case 2:
                if ((obj2 instanceof FlowCollector) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    return getFunctionDelegate().equals(((kotlin.jvm.internal.n) obj2).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj2 instanceof FlowCollector) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    return Intrinsics.f(getFunctionDelegate(), ((kotlin.jvm.internal.n) obj2).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // kotlin.jvm.internal.n
    public final Function getFunctionDelegate() {
        switch (this.f127404a) {
            case 0:
                return new kotlin.jvm.internal.q(2, 0, s1.class, (s1) this.f127405b, "handleMediaPickerResult", "handleMediaPickerResult(Lcom/revolut/controller_extension_media_picker/media/MediaPickerControllerExtensionContract$OutputData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
            case 1:
                return new kotlin.jvm.internal.a(2, 4, k09.m.class, (k09.m) this.f127405b, "handleDialogResult", "handleDialogResult(Lcom/revolut/kompot/common/dialog/status/StatusDialogResult;)V");
            case 2:
                return new kotlin.jvm.internal.a(2, 4, WorkflowLoadingFragment.class, (WorkflowLoadingFragment) this.f127405b, "renderState", "renderState(Lcom/onfido/workflow/internal/ui/WorkflowLoadingViewModel$ViewState;)V");
            default:
                return new kotlin.jvm.internal.q(2, 0, et6.q1.class, (et6.q1) this.f127405b, "saveJoinCampaignParams", "saveJoinCampaignParams(Lcom/revolut/feature/freelancer/common/models/join_campaign/JoinCampaignParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }
    }

    public final int hashCode() {
        switch (this.f127404a) {
            case 0:
                return getFunctionDelegate().hashCode();
            case 1:
                return getFunctionDelegate().hashCode();
            case 2:
                return getFunctionDelegate().hashCode();
            default:
                return getFunctionDelegate().hashCode();
        }
    }
}
