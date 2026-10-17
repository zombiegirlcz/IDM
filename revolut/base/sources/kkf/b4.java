package kkf;

import com.revolut.domain.models.joint.JointAccountData;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.profile.impl.ui.documents_redesigned.document_selector.DocumentSelectorScreen;
import com.revolut.feature.profile.impl.ui.documents_redesigned.document_selector.DocumentSelectorScreenContract$InputData;
import com.revolut.feature.profile.impl.ui.documents_redesigned.flow.DocumentsFlowContract$Step;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184608a;

    public /* synthetic */ b4(int i) {
        this.f184608a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f184608a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 2:
                Throwable error = (Throwable) obj2;
                dj0.d dVar = (dj0.d) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (dVar == null) {
                    return error;
                }
                return null;
            case 3:
                Throwable error2 = (Throwable) obj2;
                JointAccountData jointAccountData = (JointAccountData) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (jointAccountData == null) {
                    return error2;
                }
                return null;
            case 4:
                Throwable error3 = (Throwable) obj2;
                LoanDetails loanDetails = (LoanDetails) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (loanDetails == null) {
                    return error3;
                }
                return null;
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 6:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new kkk.p((List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null)), null, null, null, null);
            case 7:
                Throwable error4 = (Throwable) obj2;
                do3.n nVar = (do3.n) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (nVar == null) {
                    return error4;
                }
                return null;
            case 8:
                Throwable error5 = (Throwable) obj2;
                lr6.w wVar = (lr6.w) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (wVar == null) {
                    return error5;
                }
                return null;
            case 9:
                Throwable error6 = (Throwable) obj2;
                rnf.q qVar = (rnf.q) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (qVar == null) {
                    return error6;
                }
                return null;
            case 10:
                Throwable error7 = (Throwable) obj2;
                Set set = (Set) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (set == null) {
                    return error7;
                }
                return null;
            case 11:
                Throwable error8 = (Throwable) obj2;
                Set set2 = (Set) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (set2 == null) {
                    return error8;
                }
                return null;
            case 12:
                Function1 defaultFactory = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke(new iii.d(14, null, true, false, null));
            case 13:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return (List) defaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 14:
                Function1 defaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems2, "defaultErrorItems");
                return (List) defaultErrorItems2.invoke(new iii.d(14, null, true, false, null));
            case 15:
                ((Boolean) obj2).getClass();
                kmc.l lVar = kmc.s.Companion;
                return kmc.i.f185766a;
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 17:
                yki.l FlowCoordinator = (yki.l) obj2;
                DocumentsFlowContract$Step step = (DocumentsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof DocumentsFlowContract$Step.DocumentSelector) {
                    return new DocumentSelectorScreen(new DocumentSelectorScreenContract$InputData(((DocumentsFlowContract$Step.DocumentSelector) step).f81420a));
                }
                throw new NoWhenBranchMatchedException();
            case 18:
                Throwable error9 = (Throwable) obj2;
                DateTime dateTime = (DateTime) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (dateTime == null) {
                    return error9;
                }
                return null;
            case 19:
                Throwable error10 = (Throwable) obj2;
                tof.i7 i7Var = (tof.i7) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (i7Var == null) {
                    return error10;
                }
                return null;
            case 20:
                Throwable error11 = (Throwable) obj2;
                Map map = (Map) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (map == null) {
                    return error11;
                }
                return null;
            case 21:
                Throwable error12 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (list == null) {
                    return error12;
                }
                return null;
            case 22:
                Throwable error13 = (Throwable) obj2;
                lzi.h hVar = (lzi.h) obj3;
                Intrinsics.checkNotNullParameter(error13, "error");
                if (hVar == null) {
                    return error13;
                }
                return null;
            case 23:
                Throwable error14 = (Throwable) obj2;
                lzi.j jVar = (lzi.j) obj3;
                Intrinsics.checkNotNullParameter(error14, "error");
                if (jVar == null) {
                    return error14;
                }
                return null;
            case 24:
                Throwable error15 = (Throwable) obj2;
                xme.e eVar = (xme.e) obj3;
                Intrinsics.checkNotNullParameter(error15, "error");
                if (eVar == null) {
                    return error15;
                }
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 28:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null));
            default:
                Function1 getDefaultErrorItem = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItem, "getDefaultErrorItem");
                return new ko7.g((List) getDefaultErrorItem.invoke(new iii.d(12, null, true, true, null)));
        }
    }
}
