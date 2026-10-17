package bzc;

import android.os.Parcelable;
import bs9.i0;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import ip0.ck0;
import ip0.dg;
import ip0.m00;
import ip0.pb0;
import ip0.yj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.ranges.IntRange;
import pyc.h0;
import tof.a3;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f19983b;

    public /* synthetic */ w(b0 b0Var, int i) {
        this.f19982a = i;
        this.f19983b = b0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object itemPayload) {
        Integer numValueOf;
        qv0.i m00Var;
        qv0.i iVar;
        switch (this.f19982a) {
            case 0:
                Data transactionsWithStateData = (Data) itemPayload;
                Intrinsics.checkNotNullParameter(transactionsWithStateData, "transactionsWithStateData");
                Object content = transactionsWithStateData.getContent();
                b0 b0Var = this.f19983b;
                if (content == null) {
                    if (!transactionsWithStateData.getLoading()) {
                        gom.e.f145194a.e(transactionsWithStateData.getError());
                        return ((mxc.c) b0Var.f19953m).a();
                    }
                    IntRange intRange = new IntRange(0, 7, 1);
                    ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
                    vim.f it8 = intRange.iterator();
                    while (it8.f289625c) {
                        arrayList.add(new pb0(a0.d.n("LOADING_ITEM_LIST_ID", it8.nextInt())));
                    }
                    return arrayList;
                }
                Object content2 = transactionsWithStateData.getContent();
                Intrinsics.h(content2);
                List list = (List) content2;
                pyc.f fVar = b0Var.k;
                ArrayList arrayList2 = new ArrayList();
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    hyc.c cVar = (hyc.c) ((Pair) it9.next()).f186386b;
                    if (cVar != null) {
                        arrayList2.add(cVar);
                    }
                }
                pyc.b reviewState = (arrayList2.isEmpty() || arrayList2.size() < list.size() || arrayList2.contains(hyc.c.UPDATE_REQUESTED) || arrayList2.contains(hyc.c.UPDATE_REQUIRED) || arrayList2.contains(hyc.c.REJECTED)) ? pyc.b.USER_ACTION_REQUIRED : (arrayList2.contains(hyc.c.UNDER_REVIEW) || arrayList2.contains(hyc.c.UPLOADED)) ? pyc.b.UNDER_REVIEW : pyc.b.VERIFICATION_COMPLETED;
                pyc.t tVar = (pyc.t) fVar;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(reviewState, "flowReviewState");
                h0 h0Var = (h0) tVar.f240799b;
                h0Var.f240783j.getValue(h0Var, h0.f240778q[8]).set(reviewState);
                Object content3 = transactionsWithStateData.getContent();
                Intrinsics.h(content3);
                List transactionsWithState = (List) content3;
                b bVar = b0Var.f19952l;
                boolean zR3 = tVar.r3();
                pyc.n nVar = (pyc.n) bVar;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(reviewState, "reviewState");
                int i = pyc.m.f240788a[reviewState.ordinal()];
                if (i != 1) {
                    numValueOf = i != 2 ? Integer.valueOf(R$string.sot_home_header_subtitle_confirmed) : Integer.valueOf(R$string.sot_home_header_subtitle_under_review);
                } else {
                    numValueOf = Integer.valueOf(R$string.sow_home_info_section_v2_initial_locked_text);
                    if (!zR3) {
                        numValueOf = null;
                    }
                }
                TextLocalisedClause textLocalisedClause = numValueOf != null ? new TextLocalisedClause(numValueOf.intValue(), null, null, 14) : null;
                if (textLocalisedClause == null) {
                    iVar = null;
                } else {
                    if (zR3) {
                        m00Var = new TextDelegate.Model("STATUS_WARNING_LIST_ID", textLocalisedClause, false, new ck0(yj0.START), null, null, R$attr.uikit_dp0, 0, 0, 0, 1908);
                    } else {
                        m00Var = new m00("STATUS_WARNING_LIST_ID", null, textLocalisedClause, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D067", null, null, null, 30), null, null, null, 2032);
                        yp0.b.l(m00Var, 0, 0, 0, 0, null, false, 63);
                    }
                    if (reviewState == pyc.b.UNDER_REVIEW && !zR3) {
                        m00Var = null;
                    }
                    iVar = m00Var;
                }
                ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("TRANSACTIONS_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.sot_status_transaction_list_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                Intrinsics.checkNotNullParameter(transactionsWithState, "transactionsWithState");
                List<Pair> list2 = transactionsWithState;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                for (Pair pair : list2) {
                    arrayList3.add(nVar.a((a3) pair.f186385a, (hyc.c) pair.f186386b, true));
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                return i2b.a.o(i2b.a.r(iVar, model), arrayList3);
            case 1:
                List list3 = (List) itemPayload;
                rri.a aVar = (d) this.f19983b.L();
                if (aVar != null) {
                    Intrinsics.h(list3);
                    ((BaseLayoutBuilderFragment) aVar).setItems(list3);
                }
                return Unit.f186387a;
            case 2:
                Intrinsics.checkNotNullParameter(itemPayload, "itemPayload");
                if (!(itemPayload instanceof hyc.d)) {
                    throw new UnsupportedOperationException(j6.a.q("No click handler found for payloadType=", o0.f186429a.b(itemPayload.getClass()).m()));
                }
                a3 a3Var = ((hyc.d) itemPayload).f156779a;
                b0 b0Var2 = this.f19983b;
                efm.d0 d0VarFirstOrError = zi0.c.q(nim.a.w(((pyc.t) b0Var2.k).d.l(), new bxg.t(11)), f0.f322471a).firstOrError();
                i0 i0Var = new i0(23, new aqd.g(b0Var2, a3Var, 2));
                d0VarFirstOrError.getClass();
                rfm.j jVar = new rfm.j(d0VarFirstOrError, i0Var, 0);
                i0 i0Var2 = new i0(24, new byc.a(b0Var2, a3Var, 3));
                dfm.c cVar2 = mfm.f.d;
                return new pfm.a(new rfm.y(jVar, cVar2, i0Var2, cVar2, mfm.f.f205043c), new i0(19, new w(b0Var2, 4)), 3);
            case 3:
                dg model2 = (dg) itemPayload;
                Intrinsics.checkNotNullParameter(model2, "model");
                if (Intrinsics.f(model2.f163888a, "ERROR_ITEM_LIST_ID")) {
                    return this.f19983b.R();
                }
                throw new UnsupportedOperationException(j6.a.q("No click handler found for listId=", model2.f163888a));
            default:
                List it10 = (List) itemPayload;
                Intrinsics.checkNotNullParameter(it10, "it");
                return ((qri.b) this.f19983b.f19951j).m();
        }
    }
}
