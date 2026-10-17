package m1a;

import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsAttachmentDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.bf;
import com.revolut.core.ui_kit.delegates.df;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.api.PaymentsToggles$ScanBill;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData;
import cw0.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements w0a.g {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f201325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f201326b;

    public q(a avatarImageMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(avatarImageMapper, "avatarImageMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f201325a = avatarImageMapper;
        this.f201326b = featureToggleInteractor;
    }

    public final bf a(List list) {
        ContactImage contactImage;
        List members = list;
        Intrinsics.checkNotNullParameter(members, "members");
        Integer numValueOf = null;
        if (members.isEmpty()) {
            return null;
        }
        if (members.size() > 4) {
            List listV0 = d0.V0(members, 3);
            numValueOf = Integer.valueOf(members.size() - listV0.size());
            members = listV0;
        }
        List<SplitMemberType> list2 = members;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (SplitMemberType member : list2) {
            Intrinsics.checkNotNullParameter(member, "member");
            boolean z = member instanceof SplitMemberType.SplitMember.ContactMember;
            a aVar = this.f201325a;
            if (z) {
                contactImage = ((xl3.d) aVar.f201295a).h(((SplitMemberType.SplitMember.ContactMember) member).f79217a);
            } else if (member instanceof SplitMemberType.SplitMember.UserMember) {
                do3.n nVar = ((SplitMemberType.SplitMember.UserMember) member).f79219a;
                contactImage = new ContactImage((String) null, (String) null, do3.q.k(nVar), (String) null, (String) null, te0.w.I(nVar), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4059);
            } else {
                if (!(member instanceof SplitMemberType.GroupMember)) {
                    throw new NoWhenBranchMatchedException();
                }
                oq9.o oVar = ((SplitMemberType.GroupMember) member).f79216a;
                if (oVar instanceof oq9.l) {
                    oq9.l lVar = (oq9.l) oVar;
                    contactImage = aVar.a(lVar.i, lVar.f227836a, lVar.e, lVar.f);
                } else if (oVar instanceof oq9.m) {
                    oq9.m mVar = (oq9.m) oVar;
                    contactImage = aVar.a(mVar.i, mVar.f227841a, mVar.e, mVar.f);
                } else {
                    if (!(oVar instanceof oq9.n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    contactImage = new ContactImage(((oq9.n) oVar).f227846a, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4094);
                }
            }
            arrayList.add(contactImage);
        }
        return new bf(new df(arrayList, numValueOf, 4));
    }

    public final dii.a b(AnalyticsProduct.Retail analyticsProduct) {
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        return new dii.a(new lw0.a(new TextLocalisedClause(R$string.split_bill_itemize_delete_receipt_dialog_title, null, null, 14), new TextLocalisedClause(R$string.split_bill_itemize_delete_receipt_dialog_subtitle, null, null, 14), null, null, false, 28), new aw0.g(new n6(new TextLocalisedClause(R$string.split_bill_itemize_delete_receipt_dialog_action_go_back, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.split_bill_itemize_delete_receipt_dialog_action_remove, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25), analyticsProduct, null, null, 24);
    }

    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final List c(w0a.e detailsParams) {
        List list;
        int i;
        ?? r3;
        Intrinsics.checkNotNullParameter(detailsParams, "detailsParams");
        if (!((jte.d) this.f201326b).c(PaymentsToggles$ScanBill.f79163c)) {
            return f0.f322471a;
        }
        String str = detailsParams.f293674a;
        List list2 = detailsParams.f293675b;
        if (str == null && list2.isEmpty()) {
            return f0.f322471a;
        }
        aim.e eVarB = u.b();
        String str2 = detailsParams.f293674a;
        if (str2 != null) {
            ItemizationReceiptDeletionData itemizationReceiptDeletionData = detailsParams.f293676c;
            list = list2;
            r3 = 0;
            i = 14;
            eVarB.add(new CellDetailsAttachmentDelegate.Model("ID_GROUP_BILL_RECEIPT_THUMBNAIL", new TextLocalisedClause(R$string.split_bill_itemize_receipt_thumbnail, null, null, 14), u.c(new cw0.i("ID_GROUP_BILL_RECEIPT", new UrlImage(str2, null, null, null, 0L, null, null, null, null, null, true, new ImageTransformations(null, new RoundedRectTransformation(12.0f), null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_DG2_TAG), 40, 40, false, false, 405502), new g.c(itemizationReceiptDeletionData != null ? cw0.h.REMOVABLE : cw0.h.DEFAULT), new w0a.a(str2, itemizationReceiptDeletionData), 8)), null, false, 0, 0, R$attr.uikit_dp0, 8168));
        } else {
            list = list2;
            i = 14;
            r3 = 0;
        }
        if (!list.isEmpty()) {
            eVarB.add(new CellDetailsChevronDelegate.Model("ID_GROUP_BILL_SEE_ALL_ITEMS", new TextLocalisedClause(R$string.split_bill_itemize_see_all, r3, r3, i), 0, true, new w0a.b(list), null, null, 2020));
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }
}
