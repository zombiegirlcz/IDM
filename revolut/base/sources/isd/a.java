package isd;

import amd.d;
import amd.j;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.pincode.FingerPrintView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.cards_core.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.tracking.v3.CreditApplicationCommonContext;
import com.revolut.tracking.v3.OpenCreditEntryPointContext;
import ft3.q0;
import go.g;
import grl.m2;
import grl.r2;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ise.j0;
import ise.m0;
import iuf.l;
import iuf.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ll4.f;
import ll4.h;
import od0.i;
import org.bouncycastle.asn1.BERTags;
import ue0.e;
import yhm.r;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168183a;

    public /* synthetic */ a(int i) {
        this.f168183a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        RawImageBadge rawImageBadge;
        TextLocalisedClause textLocalisedClause;
        hrf.c cVar;
        switch (this.f168183a) {
            case 0:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                d dVar = (d) rVar.f314201a;
                i iVar = (i) rVar.f314202b;
                com.revolut.feature.junior_profile.api.models.a aVar = (com.revolut.feature.junior_profile.api.models.a) rVar.f314203c;
                d dVar2 = (d) iVar.g();
                boolean zN = e.n(dVar2 != null ? dVar2.f6313b : null);
                boolean z = !zN;
                amd.b bVar = amd.b.CASH;
                d[] elements = new d[2];
                elements[0] = (dVar.d.f(dj0.d.e) || !zN) ? dVar : null;
                elements[1] = iVar.g();
                Intrinsics.checkNotNullParameter(elements, "elements");
                return new j(bVar, kotlin.collections.d.L(elements), null, true, new b(aVar.getF77099b(), z), 4);
            case 1:
                fo3.c it8 = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.d;
            case 2:
                j0 update = (j0) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return j0.a(update, null, null, m0.REQUESTED_FOR_TWO_STEP_FLOW, null, null, null, null, null, null, false, 8183);
            case 3:
                j0 update2 = (j0) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return j0.a(update2, null, null, m0.NOT_REQUESTED, null, null, null, null, null, null, false, 8183);
            case 4:
                h61.a it9 = (h61.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return zi0.c.P(it9.f149581a, false, null, 3);
            case 5:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return new Data(null, error, false, 5, null);
            case 6:
                j0 update3 = (j0) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return j0.a(update3, null, new Data(null, null, false, 3, null), null, null, new Data(null, null, false, 3, null), new Data(null, null, false, 3, null), new Data(null, null, false, 3, null), new Data(null, null, false, 3, null), null, false, 6267);
            case 7:
                j0 update4 = (j0) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return j0.a(update4, null, null, m0.REQUESTED_FOR_ONE_STEP_FLOW, null, null, null, null, null, null, false, 8183);
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return u.c(new pb0("ADD_MONEY_WIDGET_LOADING_LIST_ID"));
            case 9:
                Pair pair = (Pair) obj2;
                return new isl.e((jel.c) pair.f186386b, (InstrumentTicker) pair.f186385a);
            case 10:
                return (InstrumentTicker) d0.b0((List) obj2);
            case 11:
                List details = (List) obj2;
                Intrinsics.checkNotNullParameter(details, "details");
                List<f> list = details;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (f fVar : list) {
                    Image imageE = h.e(fVar, R$drawable.ic_revolut_card_placeholder);
                    Integer numA = h.a(fVar);
                    RawImageBadge rawImageBadge2 = numA != null ? new RawImageBadge(LayeredImage.INSTANCE.h(numA.intValue(), R$attr.uikit_colorPopoverBackground, h.d(fVar))) : null;
                    TextLocalisedClause textLocalisedClauseF = h.f(fVar);
                    TextLocalisedClause textLocalisedClauseC = h.c(fVar);
                    AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                    CreditApplicationCommonContext creditApplicationCommonContextC = zr3.b.c(r2.CARDS_WIDGET, fVar.f196520h, fVar.i);
                    companion.getClass();
                    arrayList.add(new em4.a(imageE, rawImageBadge2, textLocalisedClauseF, textLocalisedClauseC, AnalyticsContext.Companion.a(creditApplicationCommonContextC), (TextLocalisedClause) null, (q0) null, BERTags.FLAGS));
                }
                return arrayList;
            case 12:
                List legacyItems = (List) obj2;
                Intrinsics.checkNotNullParameter(legacyItems, "legacyItems");
                return !legacyItems.isEmpty() ? u.c(it4.b.b()) : f0.f322471a;
            case 13:
                List details2 = (List) obj2;
                Intrinsics.checkNotNullParameter(details2, "details");
                List<f> list2 = details2;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                for (f fVar2 : list2) {
                    ResourceImage resourceImage = new ResourceImage(com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_credit_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                    Integer numA2 = h.a(fVar2);
                    if (numA2 != null) {
                        int iIntValue = numA2.intValue();
                        LayeredImage.Companion companion2 = LayeredImage.INSTANCE;
                        int iD = h.d(fVar2);
                        int i = R$attr.uikit_colorPopoverBackground;
                        rawImageBadge = new RawImageBadge(companion2.d(iIntValue, iD, i, Integer.valueOf(i), 4.0f, 4.0f, Float.valueOf(12.0f)));
                    } else {
                        rawImageBadge = null;
                    }
                    TextLocalisedClause textLocalisedClauseF2 = h.f(fVar2);
                    TextLocalisedClause textLocalisedClauseC2 = h.c(fVar2);
                    AnalyticsContext.Companion companion3 = AnalyticsContext.INSTANCE;
                    CreditApplicationCommonContext creditApplicationCommonContextC2 = zr3.b.c(r2.ADD_NEW_PRODUCT_WIDGET, fVar2.f196520h, fVar2.i);
                    companion3.getClass();
                    arrayList2.add(new em4.a(resourceImage, rawImageBadge, textLocalisedClauseF2, textLocalisedClauseC2, AnalyticsContext.Companion.a(creditApplicationCommonContextC2), h.b(fVar2), (q0) null, 192));
                }
                return arrayList2;
            case 14:
                cl4.d cashback = (cl4.d) obj2;
                Intrinsics.checkNotNullParameter(cashback, "cashback");
                if (cashback instanceof cl4.c) {
                    textLocalisedClause = new TextLocalisedClause(R$string.credit_card_add_new_widget_description, u.c(((cl4.c) cashback).f24932a), null, 12);
                } else {
                    if (!(cashback instanceof cl4.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.credit_discover_credit_card_header_subtitle_no_cashback, null, null, 14);
                }
                TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
                ResourceImage resourceImage2 = new ResourceImage(com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_credit_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_card_add_new_widget_title, null, null, 14);
                AnalyticsContext.Companion companion4 = AnalyticsContext.INSTANCE;
                OpenCreditEntryPointContext.a aVarNewBuilder = OpenCreditEntryPointContext.newBuilder();
                aVarNewBuilder.h(r2.ADD_NEW_PRODUCT_WIDGET);
                aVarNewBuilder.i(m2.CREDIT_CARD);
                w0 w0VarA = aVarNewBuilder.a();
                companion4.getClass();
                return u.c(new em4.a(resourceImage2, (CircleBadgeModel) null, textLocalisedClause3, textLocalisedClause2, AnalyticsContext.Companion.a(w0VarA), new TextLocalisedClause(R$string.credit_card_add_new_widget_action, null, null, 14), (q0) null, 192));
            case 15:
                hdh.e instrumentActions = (hdh.e) obj2;
                Intrinsics.checkNotNullParameter(instrumentActions, "instrumentActions");
                return !instrumentActions.f151437a.isEmpty() ? new g(new itk.c(instrumentActions), 2) : vkm.i.f290039a;
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                gu guVar = new gu("trade-cfds-header-loading", 0, 0, 30);
                ArrayList arrayList3 = new ArrayList(2);
                for (int i2 = 0; i2 < 2; i2++) {
                    arrayList3.add(nb0.b(pb0.Companion, a0.d.n("trade-cfds-loading-item-", i2), false, 0, false, 28));
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                return e.J(guVar, arrayList3);
            case 17:
                ListSubheaderDelegate.Model it10 = (ListSubheaderDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object obj3 = it10.f52715m;
                if (obj3 instanceof itk.d) {
                    return (itk.d) obj3;
                }
                return null;
            case 18:
                Intrinsics.checkNotNullParameter((itk.d) obj2, "it");
                return Unit.f186387a;
            case 19:
                RowDelegate.Model it11 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                Object obj4 = it11.u;
                if (obj4 instanceof itk.b) {
                    return (itk.b) obj4;
                }
                return null;
            case 20:
                Intrinsics.checkNotNullParameter((itk.b) obj2, "it");
                return Unit.f186387a;
            case 21:
                Intrinsics.checkNotNullParameter((Animator) obj2, "it");
                return Unit.f186387a;
            case 22:
                Intrinsics.checkNotNullParameter((Animator) obj2, "it");
                return Unit.f186387a;
            case 23:
                View view = (View) obj2;
                int i3 = FingerPrintView.f57446g;
                Intrinsics.checkNotNullParameter(view, "view");
                return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, BitmapDescriptorFactory.HUE_RED);
            case 24:
                ManualTransferData updateTransferData = (ManualTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                return ManualTransferData.a(updateTransferData, null, null, com.revolut.feature.transfer.models.transfer.a.b(updateTransferData.f92457c), null, 27);
            case 25:
                l it12 = (l) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f168569c;
            case 26:
                l it13 = (l) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new Pair(it13.f168568b.d, it13.d);
            case 27:
                l it14 = (l) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                m mVar = it14.d;
                if (mVar == null || (cVar = mVar.f168571a) == null) {
                    return null;
                }
                return foh.i.s(cVar);
            case 28:
                l it15 = (l) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f168567a;
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14);
                List listK = v.k(new pb0("ACCOUNT_CLOSURE_CONSENT_LOADING_ID"), new pb0("ACCOUNT_CLOSURE_CONSENT_LOADING_ID"), new pb0("ACCOUNT_CLOSURE_CONSENT_LOADING_ID"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return new iug.i(textLocalisedClause4, listK);
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f168183a = i;
    }
}
