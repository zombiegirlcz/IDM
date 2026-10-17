package bt2;

import android.os.Parcelable;
import bn4.y;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.business.feature.referrals.model.RewardTargetAccount;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import ru.a0;
import ru.b0;
import ru.c0;
import ru.d0;
import ru.z;
import yhm.r;
import yp0.e0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ws2.f f18274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vu.g f18275b;

    public n(ws2.f rewardTargetAccountMapper, vu.g resourceProvider) {
        Intrinsics.checkNotNullParameter(rewardTargetAccountMapper, "rewardTargetAccountMapper");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.f18274a = rewardTargetAccountMapper;
        this.f18275b = resourceProvider;
    }

    public final aim.e a(List list) {
        aim.e eVarB = u.b();
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(this.f18274a.a((a0) it8.next(), false));
        }
        eVarB.addAll(yp0.b.g(arrayList, new ListSubheaderDelegate.Model("SEND_TO_BUSINESS_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(((n5j.b) this.f18275b).b(vu.f.business_referrals_referral_account_send_to_business_title), null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.OUTSIDE_BOX, 0, 0, 124));
        return u.a(eVarB);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        List list;
        final e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (domainState.f) {
            final int i = 1;
            list = (List) iii.c.f(domainState.f18262g, new bs9.e(23), new y(19), new Function3(this) { // from class: bt2.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f18272b;

                {
                    this.f18272b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    switch (i) {
                        case 0:
                            n nVar = this.f18272b;
                            vu.g gVar = nVar.f18275b;
                            ws2.f fVar = nVar.f18274a;
                            r content = (r) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(content, "content");
                            List list2 = (List) content.f314201a;
                            List list3 = (List) content.f314202b;
                            List list4 = (List) content.f314203c;
                            boolean zIsEmpty = list4.isEmpty();
                            e eVar = domainState;
                            if (!zIsEmpty) {
                                RewardTargetAccount rewardTargetAccount = eVar.f18259a;
                                aim.e eVarB = u.b();
                                List list5 = list4;
                                ArrayList arrayList = new ArrayList(w.t(list5, 10));
                                Iterator it8 = list5.iterator();
                                while (it8.hasNext()) {
                                    arrayList.add(fVar.a((a0) it8.next(), false));
                                }
                                eVarB.addAll(yp0.b.g(arrayList, new ListSubheaderDelegate.Model("RECENT_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(((n5j.b) gVar).b(vu.f.business_referrals_referral_account_recent_title), null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.OUTSIDE_BOX, 0, 0, 124));
                                if ((rewardTargetAccount != null ? rewardTargetAccount.d : null) == z.PERSONAL) {
                                    eVarB.addAll(nVar.a(list3));
                                }
                                return u.a(eVarB);
                            }
                            RewardTargetAccount rewardTargetAccount2 = eVar.f18259a;
                            if ((rewardTargetAccount2 != null ? rewardTargetAccount2.d : null) == z.PERSONAL) {
                                return nVar.a(list3);
                            }
                            aim.e eVarB2 = u.b();
                            if (list2.isEmpty()) {
                                n5j.b bVar = (n5j.b) gVar;
                                eVarB2.addAll(yp0.b.i(new RowDelegate.Model("SIGN_UP_PERSONAL_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_revolut, R$attr.uikit_colorBlack, R$attr.uikit_colorWhite), null, null, false, null, false, 60), new TextLocalisedClause(bVar.b(vu.f.business_referrals_referral_account_sign_up_action), null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), new ListSubheaderDelegate.Model("SIGN_UP_PERSONAL_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(bVar.b(vu.f.business_referrals_referral_account_sign_up_title), null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.OUTSIDE_BOX, 0, 0, 124));
                            } else {
                                List list6 = list2;
                                ArrayList arrayList2 = new ArrayList(w.t(list6, 10));
                                Iterator it9 = list6.iterator();
                                while (it9.hasNext()) {
                                    arrayList2.add(fVar.a((a0) it9.next(), false));
                                }
                                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                                eVarB2.addAll(arrayList2);
                            }
                            return u.a(eVarB2);
                        default:
                            n nVar2 = this.f18272b;
                            vu.g gVar2 = nVar2.f18275b;
                            d0 content2 = (d0) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(content2, "content");
                            if (content2 instanceof c0) {
                                n5j.b bVar2 = (n5j.b) gVar2;
                                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("SEARCH_SUBHEADER_ID", new TextLocalisedClause(bVar2.b(vu.f.referrals_select_retail_account_invalid_revtag), null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), new l6(12, new TextLocalisedClause(bVar2.b(vu.f.referrals_select_retail_account_no_results_clear), null, null, 14), null, h4.ACCENT), null, false, null, null, null, 2020);
                                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                                return u.c(model);
                            }
                            if (!(content2 instanceof b0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List list7 = ((b0) content2).f257355a;
                            if (list7.isEmpty()) {
                                n5j.b bVar3 = (n5j.b) gVar2;
                                FullScreenStateDelegate.Model model2 = new FullScreenStateDelegate.Model("SEARCH_SUBHEADER_ID", new TextLocalisedClause(bVar3.b(vu.f.referrals_select_retail_account_no_results_title), null, null, 14), new TextLocalisedClause(bVar3.b(vu.f.referrals_select_retail_account_no_results_subtitle), u.c(domainState.e), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), new l6(12, new TextLocalisedClause(bVar3.b(vu.f.referrals_select_retail_account_no_results_clear), null, null, 14), null, h4.ACCENT), null, false, null, null, null, YearClass.CLASS_2016);
                                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                                return u.c(model2);
                            }
                            List list8 = list7;
                            ArrayList arrayList3 = new ArrayList(w.t(list8, 10));
                            Iterator it10 = list8.iterator();
                            while (it10.hasNext()) {
                                arrayList3.add(nVar2.f18274a.a((a0) it10.next(), false));
                            }
                            return yp0.b.g(arrayList3, new ListSubheaderDelegate.Model("SEARCH_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(((n5j.b) gVar2).b(vu.f.business_referrals_referral_account_search_title), null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.OUTSIDE_BOX, 0, 0, 124);
                    }
                }
            });
        } else {
            final int i2 = 0;
            list = (List) iii.c.f(t1.u(domainState.f18260b, domainState.f18261c, domainState.d), new bs9.e(22), new y(18), new Function3(this) { // from class: bt2.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f18272b;

                {
                    this.f18272b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    switch (i2) {
                        case 0:
                            n nVar = this.f18272b;
                            vu.g gVar = nVar.f18275b;
                            ws2.f fVar = nVar.f18274a;
                            r content = (r) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(content, "content");
                            List list2 = (List) content.f314201a;
                            List list3 = (List) content.f314202b;
                            List list4 = (List) content.f314203c;
                            boolean zIsEmpty = list4.isEmpty();
                            e eVar = domainState;
                            if (!zIsEmpty) {
                                RewardTargetAccount rewardTargetAccount = eVar.f18259a;
                                aim.e eVarB = u.b();
                                List list5 = list4;
                                ArrayList arrayList = new ArrayList(w.t(list5, 10));
                                Iterator it8 = list5.iterator();
                                while (it8.hasNext()) {
                                    arrayList.add(fVar.a((a0) it8.next(), false));
                                }
                                eVarB.addAll(yp0.b.g(arrayList, new ListSubheaderDelegate.Model("RECENT_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(((n5j.b) gVar).b(vu.f.business_referrals_referral_account_recent_title), null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.OUTSIDE_BOX, 0, 0, 124));
                                if ((rewardTargetAccount != null ? rewardTargetAccount.d : null) == z.PERSONAL) {
                                    eVarB.addAll(nVar.a(list3));
                                }
                                return u.a(eVarB);
                            }
                            RewardTargetAccount rewardTargetAccount2 = eVar.f18259a;
                            if ((rewardTargetAccount2 != null ? rewardTargetAccount2.d : null) == z.PERSONAL) {
                                return nVar.a(list3);
                            }
                            aim.e eVarB2 = u.b();
                            if (list2.isEmpty()) {
                                n5j.b bVar = (n5j.b) gVar;
                                eVarB2.addAll(yp0.b.i(new RowDelegate.Model("SIGN_UP_PERSONAL_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_revolut, R$attr.uikit_colorBlack, R$attr.uikit_colorWhite), null, null, false, null, false, 60), new TextLocalisedClause(bVar.b(vu.f.business_referrals_referral_account_sign_up_action), null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), new ListSubheaderDelegate.Model("SIGN_UP_PERSONAL_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(bVar.b(vu.f.business_referrals_referral_account_sign_up_title), null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.OUTSIDE_BOX, 0, 0, 124));
                            } else {
                                List list6 = list2;
                                ArrayList arrayList2 = new ArrayList(w.t(list6, 10));
                                Iterator it9 = list6.iterator();
                                while (it9.hasNext()) {
                                    arrayList2.add(fVar.a((a0) it9.next(), false));
                                }
                                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                                eVarB2.addAll(arrayList2);
                            }
                            return u.a(eVarB2);
                        default:
                            n nVar2 = this.f18272b;
                            vu.g gVar2 = nVar2.f18275b;
                            d0 content2 = (d0) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(content2, "content");
                            if (content2 instanceof c0) {
                                n5j.b bVar2 = (n5j.b) gVar2;
                                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("SEARCH_SUBHEADER_ID", new TextLocalisedClause(bVar2.b(vu.f.referrals_select_retail_account_invalid_revtag), null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), new l6(12, new TextLocalisedClause(bVar2.b(vu.f.referrals_select_retail_account_no_results_clear), null, null, 14), null, h4.ACCENT), null, false, null, null, null, 2020);
                                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                                return u.c(model);
                            }
                            if (!(content2 instanceof b0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List list7 = ((b0) content2).f257355a;
                            if (list7.isEmpty()) {
                                n5j.b bVar3 = (n5j.b) gVar2;
                                FullScreenStateDelegate.Model model2 = new FullScreenStateDelegate.Model("SEARCH_SUBHEADER_ID", new TextLocalisedClause(bVar3.b(vu.f.referrals_select_retail_account_no_results_title), null, null, 14), new TextLocalisedClause(bVar3.b(vu.f.referrals_select_retail_account_no_results_subtitle), u.c(domainState.e), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), new l6(12, new TextLocalisedClause(bVar3.b(vu.f.referrals_select_retail_account_no_results_clear), null, null, 14), null, h4.ACCENT), null, false, null, null, null, YearClass.CLASS_2016);
                                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                                return u.c(model2);
                            }
                            List list8 = list7;
                            ArrayList arrayList3 = new ArrayList(w.t(list8, 10));
                            Iterator it10 = list8.iterator();
                            while (it10.hasNext()) {
                                arrayList3.add(nVar2.f18274a.a((a0) it10.next(), false));
                            }
                            return yp0.b.g(arrayList3, new ListSubheaderDelegate.Model("SEARCH_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(((n5j.b) gVar2).b(vu.f.business_referrals_referral_account_search_title), null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.OUTSIDE_BOX, 0, 0, 124);
                    }
                }
            });
        }
        return new i(list);
    }
}
