package tjj;

import aw0.n6;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.f2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPortingStep;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet.EsimCompleteNumberTransferBottomSheetScreenContract$Action;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet.EsimCompleteNumberTransferBottomSheetScreenContract$InputData;
import dej.k1;
import ip0.b50;
import ip0.c50;
import ip0.f50;
import ip0.g50;
import ip0.h50;
import ip0.i50;
import ip0.j50;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimCompleteNumberTransferBottomSheetScreenContract$InputData f271800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ugc.a f271801b;

    public k(EsimCompleteNumberTransferBottomSheetScreenContract$InputData inputData, ugc.a giftRecipientNameResolver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(giftRecipientNameResolver, "giftRecipientNameResolver");
        this.f271800a = inputData;
        this.f271801b = giftRecipientNameResolver;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        i50 h50Var;
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        EsimCompleteNumberTransferBottomSheetScreenContract$InputData esimCompleteNumberTransferBottomSheetScreenContract$InputData = this.f271800a;
        Clause clause = esimCompleteNumberTransferBottomSheetScreenContract$InputData.f101187a;
        EsimGiftRecipient esimGiftRecipient = esimCompleteNumberTransferBottomSheetScreenContract$InputData.f;
        lw0.a aVar = new lw0.a(clause, esimCompleteNumberTransferBottomSheetScreenContract$InputData.f101189c, null, null, false, 28);
        List list = esimCompleteNumberTransferBottomSheetScreenContract$InputData.f101188b;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it8.hasNext()) {
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                List list3 = esimCompleteNumberTransferBottomSheetScreenContract$InputData.d;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                for (Object obj2 : list3) {
                    int i3 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    EsimCompleteNumberTransferBottomSheetScreenContract$Action esimCompleteNumberTransferBottomSheetScreenContract$Action = (EsimCompleteNumberTransferBottomSheetScreenContract$Action) obj2;
                    arrayList2.add(new CellDetailsChevronDelegate.Model(a0.d.n("ID_PROGRESS_INLINE_ACTION_", i), esimCompleteNumberTransferBottomSheetScreenContract$Action.f101185a, f2.INTERNAL, 0, esimCompleteNumberTransferBottomSheetScreenContract$Action.f101186b, null, 2024));
                    i = i3;
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                ArrayList arrayListE0 = d0.E0(arrayList2, arrayList);
                EsimCompleteNumberTransferBottomSheetScreenContract$Action esimCompleteNumberTransferBottomSheetScreenContract$Action2 = esimCompleteNumberTransferBottomSheetScreenContract$InputData.e;
                return new cii.b(esimCompleteNumberTransferBottomSheetScreenContract$Action2 != null ? new aw0.e(false, null, null, new n6(esimCompleteNumberTransferBottomSheetScreenContract$Action2.f101185a, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, esimCompleteNumberTransferBottomSheetScreenContract$Action2.f101186b, 508), null, null, 55) : null, arrayListE0, aVar);
            }
            Object next = it8.next();
            int i5 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            EsimPortingStep esimPortingStep = (EsimPortingStep) next;
            String strN = a0.d.n("ID_PROGRESS_TRANSFER_STEPS_", i2);
            k1 k1Var = esimPortingStep.f100418c;
            b50 b50Var = c50.Companion;
            int size = list.size();
            b50Var.getClass();
            c50 c50VarA = b50.a(i2, size);
            int i6 = j.f271799a[k1Var.ordinal()];
            if (i6 == 1) {
                h50Var = new h50(j50.NORMAL, c50VarA);
            } else if (i6 == 2) {
                h50Var = new f50(j50.NORMAL, c50VarA, false);
            } else {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                h50Var = new g50(c50VarA);
            }
            i50 i50Var = h50Var;
            String str = esimPortingStep.f100416a;
            ugc.a aVar2 = this.f271801b;
            arrayList.add(new ProgressStepVerticalV2Delegate.Model(strN, ugc.a.p(aVar2, str, esimGiftRecipient), aVar2.o(esimPortingStep.f100417b, esimGiftRecipient, null), i50Var, false, null, 0, 0, 0, null, false, false, 32752));
            i2 = i5;
        }
    }
}
