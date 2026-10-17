package z55;

import android.os.Parcelable;
import aw0.o9;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class d0 implements cli.n {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f319495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f319496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m35.k f319497c;
    public final b65.b d;
    public final b65.f e;
    public final b65.e f;

    public d0(b headerMapper, l75.a pendingLoanDetailsMapper, e loanAccountDetailsRepaymentMethodsMapper, m35.k loanSharedItemsFactory, b65.b refurbishmentMapper, b65.f mortgageInterestRateMapper, b65.e loanRepaymentDetailsSectionMapper) {
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(pendingLoanDetailsMapper, "pendingLoanDetailsMapper");
        Intrinsics.checkNotNullParameter(loanAccountDetailsRepaymentMethodsMapper, "loanAccountDetailsRepaymentMethodsMapper");
        Intrinsics.checkNotNullParameter(loanSharedItemsFactory, "loanSharedItemsFactory");
        Intrinsics.checkNotNullParameter(refurbishmentMapper, "refurbishmentMapper");
        Intrinsics.checkNotNullParameter(mortgageInterestRateMapper, "mortgageInterestRateMapper");
        Intrinsics.checkNotNullParameter(loanRepaymentDetailsSectionMapper, "loanRepaymentDetailsSectionMapper");
        this.f319495a = headerMapper;
        this.f319496b = loanAccountDetailsRepaymentMethodsMapper;
        this.f319497c = loanSharedItemsFactory;
        this.d = refurbishmentMapper;
        this.e = mortgageInterestRateMapper;
        this.f = loanRepaymentDetailsSectionMapper;
    }

    public static List a(ux4.b bVar) {
        boolean z;
        TextLocalisedClause textLocalisedClause;
        Clause clauseW;
        List list = bVar.f283864a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((ux4.d) obj2).f283870j == ux4.f.PDF) {
                arrayList.add(obj2);
            }
        }
        List listP0 = zhm.d0.P0(arrayList, new c0());
        if (listP0.isEmpty()) {
            listP0 = null;
        }
        if (listP0 == null) {
            return f0.f322471a;
        }
        List list2 = bVar.f283864a;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z = false;
        } else {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (((ux4.d) it8.next()).f == ux4.h.FORBEARANCE) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        List<ux4.d> list3 = listP0;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
        for (ux4.d dVar : list3) {
            if (z) {
                int i = b0.f319493b[dVar.f.ordinal()];
                if (i == 1) {
                    textLocalisedClause = new TextLocalisedClause(R$string.credit_common_document_type_original, null, null, 14);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.credit_common_document_type_forbearance, null, null, 14);
                }
                clauseW = yoj.b.w(yoj.b.w(textLocalisedClause, new DotDividerClause((Integer) null)), sx4.a.b(dVar.f283869h));
            } else {
                clauseW = null;
            }
            String str = dVar.f283867c;
            arrayList2.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_document, R$attr.uikit_colorBlue, R$attr.uikit_colorBlue_10), null, null, false, null, false, 62), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, clauseW, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, dVar, null, 0, 0, 0, 0, 532675544));
        }
        return yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("id_documents", (Image) null, (Clause) new TextLocalisedClause(R$string.credit_management_account_documents, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }

    public static ResourceImage d(d0 d0Var) {
        int i = R$attr.uikit_colorGreyTone50;
        d0Var.getClass();
        return new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, (ImageTransformations) null, (Clause) null, 246);
    }

    public static final RowDelegate.Model e(Clause clause, boolean z) {
        return new RowDelegate.Model("ID_REFINANCED_CREDITS", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_bank, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, z, null, false, 54), new TextLocalisedClause(R$string.loan_management_account_credit_refinanced, null, null, 14), null, 0, clause, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
    }

    public static ArrayList f(ux4.b bVar) {
        List list = bVar.f283864a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((ux4.d) obj2).f == ux4.h.ORIGINAL) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            Long l2 = ((ux4.d) it8.next()).i;
            if (l2 != null) {
                arrayList2.add(l2);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(com.revolut.feature.credit.loan.api.models.rev10.LoanDetails r53) {
        /*
            Method dump skipped, instruction units count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z55.d0.b(com.revolut.feature.credit.loan.api.models.rev10.LoanDetails):java.util.ArrayList");
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        q domainState = (q) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(t1.v(domainState.f319503b, domainState.f319504c, domainState.d, domainState.e), new w(2), new z0f.a0(15), new y66.q(this, domainState, 22));
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new u(list, (s) iii.c.f(domainState.f319502a, new z1i.l(29), new z0f.a0(14), new ymk.y(this.f319495a, 7)));
    }
}
