package bzc;

import android.os.Parcelable;
import aw0.k7;
import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.ck0;
import ip0.dg;
import ip0.m00;
import ip0.pb0;
import ip0.yj0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import tof.a3;
import tof.w5;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 implements cli.n {

    @NotNull
    private static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f19954a;

    public d0(v mapper, xyc.a flowReviewStateCalculator) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(flowReviewStateCalculator, "flowReviewStateCalculator");
        this.f19954a = mapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        ?? C;
        int i;
        Integer numValueOf;
        qv0.i m00Var;
        qv0.i iVar;
        char c2;
        LayeredImage layeredImageB;
        Image resourceImage;
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f19958b;
        boolean z = domainState.f19959c;
        List transactionsWithState = (List) data.getContent();
        xyc.e reviewState = xyc.a.a(transactionsWithState == null ? f0.f322471a : transactionsWithState);
        int i2 = 0;
        int i3 = 1;
        if (transactionsWithState != null) {
            Intrinsics.checkNotNullParameter(reviewState, "reviewState");
            int i5 = u.f19978a[reviewState.ordinal()];
            if (i5 != 1) {
                numValueOf = i5 != 2 ? Integer.valueOf(R$string.sot_home_header_subtitle_confirmed) : Integer.valueOf(R$string.sot_home_header_subtitle_under_review);
            } else {
                numValueOf = Integer.valueOf(R$string.sow_home_info_section_v2_initial_locked_text);
                if (!z) {
                    numValueOf = null;
                }
            }
            TextLocalisedClause textLocalisedClause = numValueOf != null ? new TextLocalisedClause(numValueOf.intValue(), null, null, 14) : null;
            if (textLocalisedClause == null) {
                iVar = null;
            } else {
                if (z) {
                    m00Var = new TextDelegate.Model("STATUS_WARNING_LIST_ID", textLocalisedClause, false, new ck0(yj0.START), null, null, R$attr.uikit_dp0, 0, 0, 0, 1908);
                } else {
                    m00Var = new m00("STATUS_WARNING_LIST_ID", null, textLocalisedClause, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D067", null, null, null, 30), null, null, null, 2032);
                    yp0.b.l(m00Var, 0, 0, 0, 0, null, false, 63);
                }
                if (reviewState == xyc.e.UNDER_REVIEW && !z) {
                    m00Var = null;
                }
                iVar = m00Var;
            }
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("TRANSACTIONS_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.sot_status_transaction_list_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            Intrinsics.checkNotNullParameter(transactionsWithState, "transactionsWithState");
            List<Pair> list = transactionsWithState;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Pair pair : list) {
                a3 a3Var = (a3) pair.f186385a;
                hyc.c cVar = (hyc.c) pair.f186386b;
                String strQ = j6.a.q("transaction_", a3Var.f272579a);
                v vVar = this.f19954a;
                Image imageA = thf.d.a(vVar.f19981b, a3Var, r0.g(), r0.g(), null, null, null, null, null, null, null, null, 2040);
                TextClause textClause = new TextClause(thf.m.a(vVar.f19980a, a3Var, r0.g(), r0.g(), r0.g(), null, null, null, 240), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                w5 w5Var = a3Var.f272624y;
                DateTime dateTime = a3Var.f272593h;
                TimeClause timeClause = w5Var.f273145c == io3.i.EXTERNAL ? new TimeClause(dateTime.getMillis(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12) : new TimeClause(dateTime.getMillis(), new TimeClause.Format.Pretty(i2), null, null, 12);
                ArrayList arrayList2 = new ArrayList();
                int i6 = cVar == null ? -1 : u.f19979b[cVar.ordinal()];
                if (i6 != -1) {
                    if (i6 == i3) {
                        arrayList2.add(timeClause);
                        arrayList2.add(new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                        arrayList2.add(new TextLocalisedClause(R$string.transaction_verification_items_header_action_required, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10));
                    } else if (i6 == 2) {
                        arrayList2.add(timeClause);
                        arrayList2.add(new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                        arrayList2.add(new TextLocalisedClause(R$string.sot_summary_to_be_reviewed, null, null, 14));
                    } else if (i6 == 3) {
                        arrayList2.add(timeClause);
                        arrayList2.add(new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                        arrayList2.add(new TextLocalisedClause(R$string.sot_state_under_review, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10));
                    } else if (i6 != 4) {
                        arrayList2.add(timeClause);
                    } else {
                        arrayList2.add(new TextLocalisedClause(R$string.sot_state_verified, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10));
                    }
                    c2 = '\n';
                } else {
                    arrayList2.add(timeClause);
                    arrayList2.add(new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                    c2 = '\n';
                    arrayList2.add(new TextLocalisedClause(R$string.sot_state_need_verification, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10));
                }
                CompositeClause compositeClause = new CompositeClause(arrayList2, null, null, null, 14);
                RowDelegate.Model.c.b bVar = new RowDelegate.Model.c.b(new MoneyClause(k71.k.b(a3Var), new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, null, 12), null, null, false, 126);
                int i21 = cVar == null ? -1 : u.f19979b[cVar.ordinal()];
                if (i21 == -1 || i21 == 1) {
                    layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_exclamation_mark, Integer.valueOf(R$attr.uikit_colorOrange), R$attr.uikit_colorBackground, 2.0f, null, null, 48);
                } else {
                    if (i21 == 2) {
                        resourceImage = new ResourceImage(R$drawable.uikit_icn_20_transfer_pending, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                    } else if (i21 == 3) {
                        resourceImage = new ResourceImage(R$drawable.uikit_icn_20_awaiting_approval, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                    } else if (i21 != 4) {
                        resourceImage = null;
                    } else {
                        layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_check_legacy, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorBackground, 2.0f, null, null, 48);
                    }
                    arrayList.add(new RowDelegate.Model(strQ, imageA, null, null, textClause, compositeClause, null, null, 0, bVar, true, false, resourceImage, null, null, null, null, new hyc.d(a3Var), null, 0, 0, 0, 0, 1056941932));
                    i2 = 0;
                    i3 = 1;
                }
                resourceImage = layeredImageB;
                arrayList.add(new RowDelegate.Model(strQ, imageA, null, null, textClause, compositeClause, null, null, 0, bVar, true, false, resourceImage, null, null, null, null, new hyc.d(a3Var), null, 0, 0, 0, 0, 1056941932));
                i2 = 0;
                i3 = 1;
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            C = zhm.d0.E0(arrayList, zhm.d0.E0(zhm.u.c(model), zhm.v.l(iVar)));
        } else if (data.getLoading()) {
            C = new ArrayList(8);
            for (int i22 = 0; i22 < 8; i22++) {
                C.add(new pb0(a0.d.n("loading_", i22)));
            }
        } else {
            C = zhm.u.c(new dg("ERROR_ITEM_LIST_ID", new TextLocalisedClause(R.string.error_generic, null, null, 14), new TextLocalisedClause(R.string.common_action_try_again, null, null, 14)));
        }
        Intrinsics.checkNotNullParameter(reviewState, "reviewState");
        int i32 = u.f19978a[reviewState.ordinal()];
        if (i32 == 1) {
            i = R$string.transaction_verification_items_header_verify_payments;
        } else if (i32 == 2) {
            i = R$string.transaction_verification_items_header_information_is_being_reviewed;
        } else {
            if (i32 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.transaction_verification_items_header_verification_completed;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, null, null, 14);
        xyc.e eVar = xyc.e.USER_ACTION_REQUIRED;
        return new p(new k(textLocalisedClause2, textLocalisedClause2, (reviewState != eVar || z) ? null : new TextLocalisedClause(R$string.flows_home_screen_description_initial_sot_active, null, null, 14), (reviewState != eVar || z) ? null : com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D310", null, null, null, 30)), reviewState, C);
    }
}
