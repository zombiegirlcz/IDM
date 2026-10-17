package wp9;

import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ai;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreen;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreenContract$SplitSummaryTab;
import com.revolut.feature.payments.splitbill.api.R$string;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import grl.k9;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SplitBillsSummaryScreen f299192w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(SplitBillsSummaryScreen splitBillsSummaryScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f299192w = splitBillsSummaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n nVar = new n(this.f299192w, continuation, 0);
                nVar.v = obj2;
                return nVar;
            case 1:
                n nVar2 = new n(this.f299192w, continuation, 1);
                nVar2.v = obj2;
                return nVar2;
            case 2:
                n nVar3 = new n(this.f299192w, continuation, 2);
                nVar3.v = obj2;
                return nVar3;
            case 3:
                n nVar4 = new n(this.f299192w, continuation, 3);
                nVar4.v = obj2;
                return nVar4;
            default:
                n nVar5 = new n(this.f299192w, continuation, 4);
                nVar5.v = obj2;
                return nVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((n) create((zp9.u) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((n) create((p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((n) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((n) create((g0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((n) create((ai) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        int i = this.u;
        Object common = null;
        SplitBillsSummaryScreen splitBillsSummaryScreen = this.f299192w;
        switch (i) {
            case 0:
                zp9.u uVar = (zp9.u) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVarD = splitBillsSummaryScreen.d();
                SplitMemberType member = uVar.f324214a;
                com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c cVar = (com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c) yVarD;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(member, "member");
                j60.a.v(cVar.f79252s, false, null, 3);
                cli.y yVar = cVar.z;
                SplitMembersType splitMembersType = ((v) ((j2) yVar.f22677a).getValue()).d;
                if (splitMembersType instanceof SplitMembersType.Group) {
                    if (!(member instanceof SplitMemberType.GroupMember)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    objA = SplitMembersType.Group.a((SplitMembersType.Group) splitMembersType, (SplitMemberType.GroupMember) member, null, 2);
                } else {
                    if (!(splitMembersType instanceof SplitMembersType.Split)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!(member instanceof SplitMemberType.SplitMember)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    objA = SplitMembersType.Split.a((SplitMembersType.Split) splitMembersType, (SplitMemberType.SplitMember) member, null, 2);
                }
                cVar.H2(yVar, new wk2.x(objA, 26));
                return Unit.f186387a;
            case 1:
                p data = (p) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVarD2 = splitBillsSummaryScreen.d();
                Intrinsics.h(data);
                com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c cVar2 = (com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c) yVarD2;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                cp9.a aVarI2 = cVar2.I2();
                if (aVarI2 != null) {
                    cVar2.H2(cVar2.z, new vx9.v(cVar2, 27, data, aVarI2));
                }
                return Unit.f186387a;
            case 2:
                String itemId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVarD3 = splitBillsSummaryScreen.d();
                Intrinsics.h(itemId);
                com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c cVar3 = (com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c) yVarD3;
                cVar3.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("RESET_BUTTON_LIST_ID")) {
                    cp9.a aVarI22 = cVar3.I2();
                    if (aVarI22 != null) {
                        cVar3.H2(cVar3.z, new wp5.v(cVar3, aVarI22, 4));
                    }
                } else if (itemId.equals("INFO_ITEM_MENU_ID")) {
                    cVar3.u.getClass();
                    lw0.a aVar4 = new lw0.a(new TextLocalisedClause(R$string.split_bill_summary_how_it_works_bottom_sheet_title, null, null, 14), null, null, null, false, 30);
                    List listK = zhm.v.k(new eii.l((Clause) new TextLocalisedClause(R$string.split_bill_summary_how_it_works_bottom_sheet_full_amount_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.split_bill_summary_how_it_works_bottom_sheet_full_amount_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_user, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), false, false, (RowDelegate.Model.c) null, (Object) null, 488), new eii.l((Clause) new TextLocalisedClause(R$string.split_bill_summary_how_it_works_bottom_sheet_auto_split_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.split_bill_summary_how_it_works_bottom_sheet_auto_split_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_split, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), false, false, (RowDelegate.Model.c) null, (Object) null, 488), new eii.l((Clause) new TextLocalisedClause(R$string.split_bill_summary_how_it_works_bottom_sheet_paid_back_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.split_bill_summary_how_it_works_bottom_sheet_paid_back_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_people, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), false, false, (RowDelegate.Model.c) null, (Object) null, 488));
                    aw0.e eVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.split_bill_summary_how_it_works_bottom_sheet_footer_action_title, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, 55);
                    k9 value = k9.Payments;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    Intrinsics.checkNotNullParameter(value, "value");
                    cVar3.C1(new com.revolut.kompot.common.b(new RowActionsBottomSheetController(new eii.c(aVar4, eVar, listK, new AnalyticsProduct.Retail(value), null)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, 4));
                }
                return Unit.f186387a;
            case 3:
                g0 parcel = (g0) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVarD4 = splitBillsSummaryScreen.d();
                Intrinsics.h(parcel);
                com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c cVar4 = (com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c) yVarD4;
                cVar4.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                cp9.a aVarI23 = cVar4.I2();
                if (aVarI23 != null) {
                    cVar4.H2(cVar4.z, new vx9.v(cVar4, 28, parcel, aVarI23));
                }
                return Unit.f186387a;
            default:
                ai aiVar = (ai) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVarD5 = splitBillsSummaryScreen.d();
                String name = aiVar.f53687a;
                com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c cVar5 = (com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c) yVarD5;
                cVar5.getClass();
                Intrinsics.checkNotNullParameter(name, "selectedTab");
                SplitBillsSummaryScreenContract$SplitSummaryTab.INSTANCE.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                switch (name.hashCode()) {
                    case -1460769471:
                        if (name.equals("ITEMIZE")) {
                            common = SplitBillsSummaryScreenContract$SplitSummaryTab.Itemize.f79242a;
                        }
                        break;
                    case 39055397:
                        if (name.equals("PERCENT")) {
                            common = new SplitBillsSummaryScreenContract$SplitSummaryTab.Common(cp9.a.PERCENT);
                        }
                        break;
                    case 78862271:
                        if (name.equals("SHARE")) {
                            common = new SplitBillsSummaryScreenContract$SplitSummaryTab.Common(cp9.a.SHARE);
                        }
                        break;
                    case 1934443608:
                        if (name.equals("AMOUNT")) {
                            common = new SplitBillsSummaryScreenContract$SplitSummaryTab.Common(cp9.a.AMOUNT);
                        }
                        break;
                }
                if (common == null) {
                    hx7.e.h(new IllegalArgumentException("Unknown tab id: ".concat(name)));
                } else {
                    cVar5.H2(cVar5.z, new wp5.v(common, cVar5, 5));
                    cVar5.f79251r.R();
                }
                return Unit.f186387a;
        }
    }
}
