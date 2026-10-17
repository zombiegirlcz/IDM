package r1a;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.contacts_chooser.api.context.ContextAction;
import com.revolut.feature.payments.splitbill.api.R$string;
import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.SplitBillLinkAction;
import fnc.s;
import go.g;
import ip0.z;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l1a.i;
import ms0.e4;
import ms0.m;
import mx0.l;
import nb6.p;
import nd.o;
import s1a.f;
import tof.a3;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends bn3.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a3 f250940l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c70.a f250941m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o f250942n;
    public final f01.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f250943p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f250944q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f250945r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f250946s;

    public d(a3 transaction, c70.a clipboard, o chooserCommandFactory, f01.c uiKitResources, s splitBillLinkInteractor, f splitBillLinkBottomSheetProvider, com.revolut.domain.interactors.transactions.a transactionsInteractor, i splitBillQrStateProvider) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(chooserCommandFactory, "chooserCommandFactory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(splitBillLinkInteractor, "splitBillLinkInteractor");
        Intrinsics.checkNotNullParameter(splitBillLinkBottomSheetProvider, "splitBillLinkBottomSheetProvider");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(splitBillQrStateProvider, "splitBillQrStateProvider");
        this.f250940l = transaction;
        this.f250941m = clipboard;
        this.f250942n = chooserCommandFactory;
        this.o = uiKitResources;
        this.f250943p = splitBillLinkInteractor;
        this.f250944q = splitBillLinkBottomSheetProvider;
        this.f250945r = transactionsInteractor;
        this.f250946s = splitBillQrStateProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d3(r1a.d r16, com.revolut.feature.payments.splitbill.impl.ui_new.link_context.SplitBillLinkAction r17, com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink r18, gim.c r19) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof r1a.c
            if (r3 == 0) goto L19
            r3 = r2
            r1a.c r3 = (r1a.c) r3
            int r4 = r3.f250939x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f250939x = r4
            goto L1e
        L19:
            r1a.c r3 = new r1a.c
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.v
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f250939x
            r6 = 0
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L39
            if (r5 != r8) goto L31
            com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink r1 = r3.u
            yhm.o.b(r2)
            goto L69
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            yhm.o.b(r2)
            int[] r2 = r1a.b.f250937a
            int r5 = r17.ordinal()
            r2 = r2[r5]
            if (r2 == r8) goto Laf
            if (r2 == r7) goto L91
            r5 = 3
            if (r2 != r5) goto L8b
            com.revolut.domain.interactors.transactions.a r9 = r0.f250945r
            tof.ra r10 = new tof.ra
            java.lang.String r2 = r1.f79939a
            r10.<init>(r2)
            r14 = 0
            r15 = 30
            r11 = 0
            r12 = 0
            r13 = 0
            ufm.i r2 = com.revolut.domain.interactors.transactions.a.b(r9, r10, r11, r12, r13, r14, r15)
            r3.u = r1
            r3.f250939x = r8
            java.lang.Object r2 = nim.a.b(r2, r3)
            if (r2 != r4) goto L69
            return r4
        L69:
            java.util.List r2 = (java.util.List) r2
            l1a.i r3 = r0.f250946s
            tof.a3 r4 = r0.f250940l
            kotlin.jvm.internal.Intrinsics.h(r2)
            com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillQrState r1 = r3.a(r1, r4, r2)
            com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.SplitBillQrFlow r2 = new com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.SplitBillQrFlow
            com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.SplitBillQrFlowContract$InputData r3 = new com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.SplitBillQrFlowContract$InputData
            com.revolut.feature.payments.splitbill.api.navigation.SplitBillQrInputData r4 = new com.revolut.feature.payments.splitbill.api.navigation.SplitBillQrInputData
            r4.<init>(r1)
            r3.<init>(r4)
            r2.<init>(r3)
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_FADE r1 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_FADE.f98307a
            yji.n.P2(r0, r2, r1, r6, r7)
            goto Lbd
        L8b:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L91:
            nd.o r2 = r0.f250942n
            f01.c r3 = r0.o
            r4 = 2131962022(0x7f1328a6, float:1.9560757E38)
            r5 = 14
            java.lang.String r3 = a10.b.o(r4, r6, r6, r5, r3)
            java.lang.String r1 = r1.f79940b
            r2.getClass()
            com.revolut.retail.core.navigation.ActivityNavigateCommand r1 = nd.o.i(r3, r1)
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = zh9.u0.b(r1)
            r0.A2(r1)
            goto Lbd
        Laf:
            c70.a r2 = r0.f250941m
            java.lang.String r1 = r1.f79940b
            r1a.a r3 = new r1a.a
            r4 = 0
            r3.<init>(r0, r4)
            r0 = 0
            r2.c(r6, r1, r0, r3)
        Lbd:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r1a.d.d3(r1a.d, com.revolut.feature.payments.splitbill.impl.ui_new.link_context.SplitBillLinkAction, com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink, gim.c):java.lang.Object");
    }

    @Override // bn3.a
    public final Object Z2(List list, p pVar, Continuation continuation) {
        pVar.invoke(new cn3.c(list, false));
        return Unit.f186387a;
    }

    @Override // bn3.a
    public final void b3(ContextAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof SplitBillLinkAction)) {
            hx7.e.h(new IllegalArgumentException("SplitBillLinkAction is required"));
        } else {
            x2(new qu4.s(this, action, null, 18), new yi5.b(28));
        }
    }

    @Override // bn3.a
    public final Flow c3() {
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("SPLIT_BILL_QR_WIDGET_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.split_bill_choose_contact_share_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        l lVar = l.DYNAMIC_CIRCLE_ACTIONS;
        mx0.d dVar = mx0.d.CONTEXTUAL;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.split_bill_choose_contact_show_qr, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_scan_qr, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        SplitBillLinkAction splitBillLinkAction = SplitBillLinkAction.SHOW_QR;
        Parcelable parcelable = null;
        int i = 22428;
        boolean z = false;
        e4 e4Var = null;
        Clause clause = null;
        Image image = null;
        mx0.e eVar = null;
        m mVar = null;
        boolean z3 = false;
        Float f = null;
        ActionsView.Item item = new ActionsView.Item("SPLIT_BILL_QR_WIDGET_QR_BUTTON_LIST_ID", dVar, z, e4Var, clause, textLocalisedClause, resourceImage, image, eVar, mVar, z3, splitBillLinkAction.getTag(), f, splitBillLinkAction, parcelable, i);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.split_bill_choose_contact_copy_link, null, null, 14);
        ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_link, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        SplitBillLinkAction splitBillLinkAction2 = SplitBillLinkAction.COPY;
        ActionsView.Item item2 = new ActionsView.Item("SPLIT_BILL_QR_WIDGET_COPY_LINK_BUTTON_LIST_ID", dVar, z, e4Var, clause, textLocalisedClause2, resourceImage2, image, eVar, mVar, z3, splitBillLinkAction2.getTag(), f, splitBillLinkAction2, parcelable, i);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.split_bill_choose_contact_share, null, null, 14);
        ResourceImage resourceImage3 = new ResourceImage(R$drawable.uikit_icn_24_share_android, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        SplitBillLinkAction splitBillLinkAction3 = SplitBillLinkAction.SHARE;
        z zVar = new z("SPLIT_BILL_QR_WIDGET_LIST_ID", v.k(item, item2, new ActionsView.Item("SPLIT_BILL_QR_WIDGET_SHARE_BUTTON_LIST_ID", dVar, z, e4Var, clause, textLocalisedClause3, resourceImage3, image, eVar, mVar, z3, splitBillLinkAction3.getTag(), f, splitBillLinkAction3, parcelable, i)), null, lVar, 0, 0, 116);
        yp0.b.l(zVar, 0, 0, 0, 0, null, false, 63);
        return new g(v.k(model, zVar), 2);
    }
}
