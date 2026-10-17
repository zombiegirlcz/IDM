package wsg;

import com.revolut.feature.payments.messaging.common.api.reactions.ReactionsAuthorsViewer$ReactionAuthor;
import com.revolut.feature.payments.messaging.common.impl.reactions.ReactionsAuthorsBottomSheetController;
import com.revolut.feature.security_hub.api.models.StreetModeInfo;
import com.revolut.feature.workflow.engine.product_closures.modal.CloseProductScreen;
import com.revolut.feature.workflow.engine.product_closures.modal.CloseProductScreenContract$InputData;
import com.revolut.feature.workflow.engine.product_closures.screen.ProductClosuresScreenContract$ModalStep;
import ip0.yl;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import wtk.r;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299717a;

    public /* synthetic */ e(int i) {
        this.f299717a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Throwable {
        switch (this.f299717a) {
            case 0:
                Throwable error = (Throwable) obj2;
                fo3.c cVar = (fo3.c) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (cVar == null) {
                    return error;
                }
                return null;
            case 1:
                Throwable error2 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list == null) {
                    return error2;
                }
                return null;
            case 2:
                Throwable error3 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list2 == null) {
                    return error3;
                }
                return null;
            case 3:
                Throwable error4 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list3 == null) {
                    return error4;
                }
                return null;
            case 4:
                Throwable error5 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list4 == null) {
                    return error5;
                }
                return null;
            case 5:
                Throwable error6 = (Throwable) obj2;
                fo3.c cVar2 = (fo3.c) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (cVar2 == null) {
                    return error6;
                }
                return null;
            case 6:
                Throwable th10 = (Throwable) obj3;
                if (((Boolean) obj2).booleanValue() || th10 == null) {
                    return null;
                }
                throw th10;
            case 7:
                Throwable error7 = (Throwable) obj2;
                fo3.c cVar3 = (fo3.c) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (cVar3 == null) {
                    return error7;
                }
                return null;
            case 8:
                Throwable error8 = (Throwable) obj2;
                List list5 = (List) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (list5 == null) {
                    return error8;
                }
                return null;
            case 9:
                Throwable error9 = (Throwable) obj2;
                List list6 = (List) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (list6 == null) {
                    return error9;
                }
                return null;
            case 10:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 11:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 12:
                Throwable error10 = (Throwable) obj2;
                fo3.c cVar4 = (fo3.c) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (cVar4 == null) {
                    return error10;
                }
                return null;
            case 13:
                Throwable error11 = (Throwable) obj2;
                do3.n nVar = (do3.n) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (nVar == null) {
                    return error11;
                }
                return null;
            case 14:
                Throwable th11 = (Throwable) obj3;
                if (((Boolean) obj2).booleanValue() || th11 == null) {
                    return null;
                }
                throw th11;
            case 15:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new wt4.j((List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), wt4.g.f299775a, wt4.b.f299769a);
            case 16:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return wt7.j.a((List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null)), false);
            case 17:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 18:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 19:
                e7l.f config = (e7l.f) obj2;
                do3.n profile = (do3.n) obj3;
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(profile, "profile");
                List list7 = config.c0;
                return Boolean.valueOf(!d0.T(list7, profile.k != null ? nz8.d.g(r12) : null));
            case 20:
                Throwable error12 = (Throwable) obj2;
                List list8 = (List) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (list8 == null) {
                    return error12;
                }
                return null;
            case 21:
                Throwable error13 = (Throwable) obj2;
                StreetModeInfo streetModeInfo = (StreetModeInfo) obj3;
                Intrinsics.checkNotNullParameter(error13, "error");
                if (streetModeInfo == null) {
                    return error13;
                }
                return null;
            case 22:
                Throwable error14 = (Throwable) obj2;
                StreetModeInfo streetModeInfo2 = (StreetModeInfo) obj3;
                Intrinsics.checkNotNullParameter(error14, "error");
                if (streetModeInfo2 == null) {
                    return error14;
                }
                return null;
            case 23:
                Throwable error15 = (Throwable) obj2;
                StreetModeInfo streetModeInfo3 = (StreetModeInfo) obj3;
                Intrinsics.checkNotNullParameter(error15, "error");
                if (streetModeInfo3 == null) {
                    return error15;
                }
                return null;
            case 24:
                Throwable error16 = (Throwable) obj2;
                List list9 = (List) obj3;
                Intrinsics.checkNotNullParameter(error16, "error");
                if (list9 == null) {
                    return error16;
                }
                return null;
            case 25:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ProductClosuresScreenContract$ModalStep step = (ProductClosuresScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof ProductClosuresScreenContract$ModalStep.CloseProductGuide) {
                    return new CloseProductScreen(new CloseProductScreenContract$InputData(((ProductClosuresScreenContract$ModalStep.CloseProductGuide) step).f96507a));
                }
                throw new NoWhenBranchMatchedException();
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, true);
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return r.a();
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return u.c(new yl("header-loading-sharpe-ratio", 0, 30));
            default:
                KProperty[] kPropertyArr = ReactionsAuthorsBottomSheetController.U;
                return Integer.valueOf(Boolean.compare(((ReactionsAuthorsViewer$ReactionAuthor) obj2).d, ((ReactionsAuthorsViewer$ReactionAuthor) obj3).d) * (-1));
        }
    }

    public /* synthetic */ e(Object obj2, int i) {
        this.f299717a = i;
    }
}
