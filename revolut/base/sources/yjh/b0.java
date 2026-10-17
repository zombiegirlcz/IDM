package yjh;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.tax_residency.impl.v2.models.WhereToFindTinHint;
import com.revolut.feature.tax_residency.impl.v2.ui.tin_input.TinInputScreenContract$ModalStep;
import com.revolut.feature.tax_residency.impl.v2.ui.where_to_find_tin.WhereToFindTinBottomSheetScreen;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f314456a;

    public /* synthetic */ b0(int i) {
        this.f314456a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f314456a) {
            case 0:
                Throwable error = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 1:
                Throwable th10 = (Throwable) obj2;
                if (((lha.g) obj3) == null) {
                    return th10;
                }
                return null;
            case 2:
                Throwable th11 = (Throwable) obj2;
                if (((qha.a) obj3) == null) {
                    return th11;
                }
                return null;
            case 3:
                Function1 defaultFactory = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return new yk6.k(yk6.g.f314584a, (List) defaultFactory.invoke(new iii.d(14, null, false, false, null)));
            case 4:
                Throwable error2 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (bool == null) {
                    return error2;
                }
                return null;
            case 5:
                Throwable error3 = (Throwable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (bool2 == null) {
                    return error3;
                }
                return null;
            case 6:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ymk.p.DEFAULT;
            case 10:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, false, false, null));
            case 11:
                Throwable error4 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list2 == null) {
                    return error4;
                }
                return null;
            case 12:
                Throwable error5 = (Throwable) obj2;
                qla.a aVar = (qla.a) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (aVar == null) {
                    return error5;
                }
                return null;
            case 13:
                Throwable error6 = (Throwable) obj2;
                do3.n nVar = (do3.n) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (nVar == null) {
                    return error6;
                }
                return null;
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 15:
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, (Throwable) obj2, h0Var);
                return null;
            case 16:
                Throwable error7 = (Throwable) obj2;
                pcd.s sVar = (pcd.s) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (sVar == null) {
                    return error7;
                }
                return null;
            case 17:
                Throwable error8 = (Throwable) obj2;
                SavingsAccountDetails savingsAccountDetails = (SavingsAccountDetails) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (savingsAccountDetails == null) {
                    return error8;
                }
                return null;
            case 18:
                Throwable error9 = (Throwable) obj2;
                qib.i iVar = (qib.i) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (iVar == null) {
                    return error9;
                }
                return null;
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 20:
                ((Boolean) obj2).booleanValue();
                return zhm.f0.f322471a;
            case 21:
                Throwable error10 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (list3 == null) {
                    return error10;
                }
                return null;
            case 22:
                Throwable error11 = (Throwable) obj2;
                k71.q qVar = (k71.q) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (qVar == null) {
                    return error11;
                }
                return null;
            case 23:
                ((Boolean) obj2).booleanValue();
                return new snf.y(null, null);
            case 24:
                Throwable error12 = (Throwable) obj2;
                snf.y yVar = (snf.y) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (yVar == null) {
                    return error12;
                }
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 26:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 27:
                Throwable error13 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error13, "error");
                if (model == null) {
                    return error13;
                }
                return null;
            case 28:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TinInputScreenContract$ModalStep step = (TinInputScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof TinInputScreenContract$ModalStep.WhereToFindHelp)) {
                    throw new NoWhenBranchMatchedException();
                }
                WhereToFindTinHint whereToFindTinHint = ((TinInputScreenContract$ModalStep.WhereToFindHelp) step).f90315a;
                return new WhereToFindTinBottomSheetScreen(new aqe.b(whereToFindTinHint.f90189a, whereToFindTinHint.f90190b, whereToFindTinHint.d));
            default:
                Throwable error14 = (Throwable) obj2;
                pcd.s sVar2 = (pcd.s) obj3;
                Intrinsics.checkNotNullParameter(error14, "error");
                if (sVar2 == null) {
                    return error14;
                }
                return null;
        }
    }
}
