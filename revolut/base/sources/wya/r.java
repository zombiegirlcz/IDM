package wya;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.f2;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.ReferralsTroubleshooterTopLevelScreenContract$InputData;
import com.revolut.feature.shared.referrals.ui.impl.R$string;
import ip0.nb0;
import ip0.pb0;
import ip0.zj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rya.v;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferralsTroubleshooterTopLevelScreenContract$InputData f301200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cya.b f301201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f301202c;

    public r(ReferralsTroubleshooterTopLevelScreenContract$InputData inputData, cya.b activeOrPastInviteItemsProvider, v paginatedInviteRowMapper, tya.c inviteStatusUIMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(activeOrPastInviteItemsProvider, "activeOrPastInviteItemsProvider");
        Intrinsics.checkNotNullParameter(paginatedInviteRowMapper, "paginatedInviteRowMapper");
        Intrinsics.checkNotNullParameter(inviteStatusUIMapper, "inviteStatusUIMapper");
        this.f301200a = inputData;
        this.f301201b = activeOrPastInviteItemsProvider;
        this.f301202c = paginatedInviteRowMapper;
    }

    public static LargeActionButtonDelegate.Model a() {
        return new LargeActionButtonDelegate.Model("ALL_REFERRALS_LIST_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.referrals_quick_help_action_see_all, null, null, 14), false, null, null, null, null, 1000);
    }

    public final List b(boolean z) {
        if (z) {
            return yp0.b.i(new FullScreenStateDelegate.Model("NO_REFERRALS_ITEM_ID", new TextLocalisedClause(R$string.referrals_quick_help_invitees_empty_state_title, null, null, 14), new TextLocalisedClause(R$string.referrals_quick_help_invitees_empty_state_subtitle, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_add_contact, null, null, 6)), zj.REGULAR, null, false, null, null, false, 0, 0, 31712), tya.c.j(new TextLocalisedClause(R$string.referrals_quick_help_invitees_header_title, null, null, 14)), null, 0, 0, 126);
        }
        return yp0.b.i(new RowDelegate.Model("NO_REFERRALS_ITEM_ID", new RowDelegate.Model.MainImage.Image56((Image) new GlyphImage(R$drawable.uikit_icn_24_add_contact, null, null, 6), (CircleBadgeModel) null, false, 12), new TextLocalisedClause(R$string.referrals_quick_help_invitees_empty_state_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), tya.c.j(new TextLocalisedClause(R$string.referrals_quick_help_invitees_header_title, null, null, 14)), null, 0, 0, 126);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Collection collectionG;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        Data data = domainState.d;
        final boolean z = domainState.f301187c;
        if (data != null) {
            final int i = 1;
            final int i2 = 1;
            final int i3 = 1;
            eVarB.addAll((List) iii.c.f(data, new Function1(this) { // from class: wya.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f301193b;

                {
                    this.f301193b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Function0 it8 = (Function0) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            break;
                    }
                    return this.f301193b.d();
                }
            }, new Function2(this) { // from class: wya.o

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f301195b;

                {
                    this.f301195b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Throwable th10 = (Throwable) obj2;
                    Function1 function1 = (Function1) obj3;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(function1, "<unused var>");
                            if (th10 == null || (r2 = iii.c.b(null, null, 6, false)) == null) {
                            }
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(function1, "<unused var>");
                            if (th10 == null || (r2 = iii.c.b(null, null, 6, false)) == null) {
                            }
                            break;
                    }
                    return this.f301195b.b(z);
                }
            }, new Function3(this) { // from class: wya.p

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f301198b;

                {
                    this.f301198b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    switch (i3) {
                        case 0:
                            List content = (List) obj2;
                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                            Intrinsics.checkNotNullParameter(content, "content");
                            boolean zIsEmpty = content.isEmpty();
                            r rVar = this.f301198b;
                            if (zIsEmpty) {
                                return zBooleanValue ? rVar.d() : rVar.b(z);
                            }
                            aim.e eVarB2 = u.b();
                            eVarB2.addAll(rVar.f301201b.a(tya.d.RECENT_UI_TYPE, d0.V0(content, 3), rVar.f301200a.f81910b));
                            if (content.size() > 3) {
                                eVarB2.add(r.a());
                            }
                            return yp0.b.g(u.a(eVarB2), tya.c.j(new TextLocalisedClause(R$string.referrals_quick_help_invitees_header_title, null, null, 14)), null, 0, 0, 126);
                        default:
                            pwa.k content2 = (pwa.k) obj2;
                            boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                            Intrinsics.checkNotNullParameter(content2, "content");
                            ArrayList arrayList = content2.f240367a;
                            boolean zIsEmpty2 = arrayList.isEmpty();
                            r rVar2 = this.f301198b;
                            if (zIsEmpty2) {
                                return zBooleanValue2 ? rVar2.d() : rVar2.b(z);
                            }
                            aim.e eVarB3 = u.b();
                            List listV0 = d0.V0(arrayList, 3);
                            ArrayList arrayList2 = new ArrayList(w.t(listV0, 10));
                            Iterator it8 = listV0.iterator();
                            while (it8.hasNext()) {
                                arrayList2.add(rVar2.f301202c.a((pwa.j) it8.next(), tya.d.RECENT_UI_TYPE, rVar2.f301200a.f81910b));
                            }
                            eVarB3.addAll(arrayList2);
                            if (arrayList.size() > 3 || content2.f240368b != null) {
                                eVarB3.add(r.a());
                            }
                            return yp0.b.g(u.a(eVarB3), tya.c.j(new TextLocalisedClause(R$string.referrals_quick_help_invitees_header_title, null, null, 14)), null, 0, 0, 126);
                    }
                }
            }));
        } else {
            Data data2 = domainState.f301185a;
            if (data2 != null) {
                final int i5 = 0;
                final int i6 = 0;
                final int i21 = 0;
                eVarB.addAll((List) iii.c.f(data2, new Function1(this) { // from class: wya.n

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ r f301193b;

                    {
                        this.f301193b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Function0 it8 = (Function0) obj2;
                        switch (i5) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                break;
                        }
                        return this.f301193b.d();
                    }
                }, new Function2(this) { // from class: wya.o

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ r f301195b;

                    {
                        this.f301195b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Throwable th10 = (Throwable) obj2;
                        Function1 function1 = (Function1) obj3;
                        switch (i6) {
                            case 0:
                                Intrinsics.checkNotNullParameter(function1, "<unused var>");
                                if (th10 == null || (r2 = iii.c.b(null, null, 6, false)) == null) {
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(function1, "<unused var>");
                                if (th10 == null || (r2 = iii.c.b(null, null, 6, false)) == null) {
                                }
                                break;
                        }
                        return this.f301195b.b(z);
                    }
                }, new Function3(this) { // from class: wya.p

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ r f301198b;

                    {
                        this.f301198b = this;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        switch (i21) {
                            case 0:
                                List content = (List) obj2;
                                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                                Intrinsics.checkNotNullParameter(content, "content");
                                boolean zIsEmpty = content.isEmpty();
                                r rVar = this.f301198b;
                                if (zIsEmpty) {
                                    return zBooleanValue ? rVar.d() : rVar.b(z);
                                }
                                aim.e eVarB2 = u.b();
                                eVarB2.addAll(rVar.f301201b.a(tya.d.RECENT_UI_TYPE, d0.V0(content, 3), rVar.f301200a.f81910b));
                                if (content.size() > 3) {
                                    eVarB2.add(r.a());
                                }
                                return yp0.b.g(u.a(eVarB2), tya.c.j(new TextLocalisedClause(R$string.referrals_quick_help_invitees_header_title, null, null, 14)), null, 0, 0, 126);
                            default:
                                pwa.k content2 = (pwa.k) obj2;
                                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                                Intrinsics.checkNotNullParameter(content2, "content");
                                ArrayList arrayList = content2.f240367a;
                                boolean zIsEmpty2 = arrayList.isEmpty();
                                r rVar2 = this.f301198b;
                                if (zIsEmpty2) {
                                    return zBooleanValue2 ? rVar2.d() : rVar2.b(z);
                                }
                                aim.e eVarB3 = u.b();
                                List listV0 = d0.V0(arrayList, 3);
                                ArrayList arrayList2 = new ArrayList(w.t(listV0, 10));
                                Iterator it8 = listV0.iterator();
                                while (it8.hasNext()) {
                                    arrayList2.add(rVar2.f301202c.a((pwa.j) it8.next(), tya.d.RECENT_UI_TYPE, rVar2.f301200a.f81910b));
                                }
                                eVarB3.addAll(arrayList2);
                                if (arrayList.size() > 3 || content2.f240368b != null) {
                                    eVarB3.add(r.a());
                                }
                                return yp0.b.g(u.a(eVarB3), tya.c.j(new TextLocalisedClause(R$string.referrals_quick_help_invitees_header_title, null, null, 14)), null, 0, 0, 126);
                        }
                    }
                }));
            }
        }
        List list = (List) domainState.f301186b.getContent();
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            collectionG = f0.f322471a;
        } else {
            List list3 = list;
            ArrayList arrayList = new ArrayList(w.t(list3, 10));
            int i22 = 0;
            for (Object obj2 : list3) {
                int i32 = i22 + 1;
                if (i22 < 0) {
                    zhm.v.s();
                    throw null;
                }
                fya.a aVar = (fya.a) obj2;
                arrayList.add(new CellDetailsChevronDelegate.Model(a0.d.n("TROUBLESHOOT_ACTION_ID_", i22), new TextClause(aVar.f138978a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), f2.INTERNAL, 0, aVar.f138979b, null, 2024));
                i22 = i32;
            }
            collectionG = yp0.b.g(arrayList, new ListSubheaderDelegate.Model("ACTIONS_TITLE_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.referrals_quick_help_faq_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        }
        eVarB.addAll(collectionG);
        if (domainState.d != null && domainState.e) {
            eVarB.addAll(tya.c.g());
        }
        return new m(u.a(eVarB));
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(nb0.b(pb0.Companion, "LOADING_ITEM_ID", false, 0, false, 30));
        }
        return yp0.b.g(arrayList, tya.c.j(new TextLocalisedClause(R$string.referrals_quick_help_invitees_header_title, null, null, 14)), null, 0, 0, 126);
    }
}
