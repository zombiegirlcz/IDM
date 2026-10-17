package w8l;

import android.os.Parcelable;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.decorator.models.CircleImageDecorator;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.offboarding.api.domain.model.OffboardingActionIcon;
import com.revolut.shared.feature.offboarding.api.domain.model.OffboardingInfo;
import com.revolut.shared.feature.offboarding.api.domain.model.OffboardingRestriction;
import com.revolut.shared.feature.offboarding.api.domain.model.OffboardingScreen;
import com.revolut.shared.feature.offboarding.api.domain.model.OffboardingScreenAction;
import ip0.gu;
import ip0.p10;
import ip0.pb0;
import ip0.t10;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mx0.s5;
import mx0.u5;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11, types: [com.revolut.core.ui_kit.models.badge.CircleBadgeModel] */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r41v4, types: [java.util.List] */
    @Override // cli.n
    public final o c(cli.j jVar) throws Throwable {
        Pair pair;
        Iterable iterable;
        Image urlImage;
        Throwable th10;
        ?? dangerCircleBadge;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f295653a;
        OffboardingScreen offboardingScreen = (OffboardingScreen) data.getContent();
        int i = 0;
        if (data.getLoading()) {
            v8l.b.Companion.getClass();
            v8l.b bVar = v8l.b.f286902c;
            t10 t10Var = new t10("LIST_ID_MORE_INFO_LOADING", p10.f165755a);
            yp0.b.l(t10Var, 0, 0, 0, 0, null, false, 63);
            pb0 pb0Var = new pb0("1");
            yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
            gu guVar = new gu("2", 0, 0, 30);
            pb0 pb0Var2 = new pb0("3");
            yp0.b.l(pb0Var2, 0, 0, 0, 0, null, false, 63);
            pb0 pb0Var3 = new pb0("4");
            yp0.b.l(pb0Var3, 0, 0, 0, 0, null, false, 63);
            pb0 pb0Var4 = new pb0("5");
            yp0.b.l(pb0Var4, 0, 0, 0, 0, null, false, 63);
            pair = new Pair(bVar, v.k(t10Var, pb0Var, guVar, pb0Var2, pb0Var3, pb0Var4));
        } else {
            Throwable th11 = null;
            if (offboardingScreen != null) {
                Set set = domainState.f295654b;
                v8l.b bVar2 = new v8l.b(new TextClause(offboardingScreen.f104876c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(offboardingScreen.f104874a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = offboardingScreen.f;
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                int i2 = 0;
                for (Object obj2 : arrayList2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        v.s();
                        throw null;
                    }
                    OffboardingInfo offboardingInfo = (OffboardingInfo) obj2;
                    String strN = a0.d.n("LIST_ID_MORE_INFO_", i2);
                    PlainTextDelegate.Model model = new PlainTextDelegate.Model(strN, (UrlImage) null, new TextClause(offboardingInfo.f104870a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(offboardingInfo.f104871b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, new Custom.LinkifyMode.Enabled(1, false, null), 222), (Integer) null, false, (o9) null, (List) null, 124), set.contains(strN) ? new u5(2, new TextLocalisedClause(R$string.uikit_compact_list_show_less, null, null, 14)) : new s5(3, new TextLocalisedClause(R$string.uikit_compact_list_show_more, null, null, 14)), (List) null, (String) null, strN, (AnalyticsContext) null, 0, 0, 0, 0, 32202);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    arrayList3.add(model);
                    i2 = i3;
                }
                a0.x(arrayList3, arrayList);
                NotificationCentreItemDelegate.Model model2 = new NotificationCentreItemDelegate.Model("LIST_ID_DESCRIPTION", new TextClause(offboardingScreen.f104875b, (Style) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), false, (o9) null, (List) null, 122), null, null, new ResourceImage(R$drawable.uikit_icn_24_document_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 261492);
                yp0.b.l(model2, R$attr.uikit_dp16, 0, 0, 0, null, false, 62);
                arrayList.add(model2);
                ArrayList arrayList4 = offboardingScreen.e;
                if (arrayList4.isEmpty()) {
                    iterable = f0.f322471a;
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    int size = arrayList4.size();
                    arrayList5.add(new ListSubheaderDelegate.Model("LIST_ID_TO_DO", (Image) null, (Clause) (size > 1 ? new TextLocalisedClause(com.revolut.shared.feature.offboarding.api.R$string.offboarding_home_screen_actions_section_title_multiple, u.c(Integer.valueOf(size)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8) : new TextLocalisedClause(com.revolut.shared.feature.offboarding.api.R$string.offboarding_home_screen_actions_section_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10)), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                    int i5 = 0;
                    for (Object obj3 : arrayList4) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            Throwable th12 = th11;
                            v.s();
                            throw th12;
                        }
                        OffboardingScreenAction offboardingScreenAction = (OffboardingScreenAction) obj3;
                        int i21 = size == i6 ? 1 : i;
                        Integer numValueOf = Integer.valueOf(R$attr.uikit_dp8);
                        Integer numValueOf2 = Integer.valueOf(R$attr.uikit_dp0);
                        if (i21 == 0) {
                            numValueOf = numValueOf2;
                        }
                        int iIntValue = numValueOf.intValue();
                        String strN2 = a0.d.n("LIST_ID_TO_DO_", i5);
                        OffboardingActionIcon offboardingActionIcon = offboardingScreenAction.f104879c;
                        s8l.b bVar3 = offboardingScreenAction.d;
                        int i22 = i;
                        if (offboardingActionIcon instanceof OffboardingActionIcon.Named) {
                            urlImage = new ResourceImage(((OffboardingActionIcon.Named) offboardingActionIcon).f104868a, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246);
                        } else {
                            if (!(offboardingActionIcon instanceof OffboardingActionIcon.Remote)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            urlImage = new UrlImage(((OffboardingActionIcon.Remote) offboardingActionIcon).f104869a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
                        }
                        CircleImageDecorator circleImageDecorator = new CircleImageDecorator(urlImage, (Float) null, 8.0f, 0, R$attr.uikit_colorAccentNeutral_10, 26);
                        int[] iArr = l.f295660a;
                        if (iArr[bVar3.ordinal()] == 1) {
                            th10 = th11;
                            dangerCircleBadge = new DangerCircleBadge(dw0.a.Alert);
                        } else {
                            th10 = th11;
                            dangerCircleBadge = th10;
                        }
                        RowDelegate.Model model3 = new RowDelegate.Model(strN2, new RowDelegate.Model.MainImage.Image40(circleImageDecorator, dangerCircleBadge, null, false, null, false, 60), new TextClause(offboardingScreenAction.f104877a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(offboardingScreenAction.f104878b, (Style) null, (Integer) (iArr[bVar3.ordinal()] == 1 ? Integer.valueOf(R$attr.uikit_colorOrange) : th10), false, (o9) null, (List) null, 122), null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, offboardingScreenAction, null, 0, 0, 0, 0, 532675544);
                        yp0.b.l(model3, 0, iIntValue, 0, 0, null, false, 61);
                        arrayList5.add(model3);
                        i5 = i6;
                        i = i22;
                        th11 = th10;
                    }
                    iterable = arrayList5;
                }
                int i32 = i;
                ?? r412 = th11;
                a0.x(iterable, arrayList);
                List list = (List) ue0.e.M(offboardingScreen.d);
                if (list != null) {
                    arrayList.add(new ListSubheaderDelegate.Model("LIST_ID_RESTRICTIONS", (Image) null, (Clause) new TextLocalisedClause(com.revolut.shared.feature.offboarding.api.R$string.offboarding_home_screen_restrictions_section_title, r412, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                    List list2 = list;
                    ArrayList arrayList6 = new ArrayList(w.t(list2, 10));
                    int i33 = i32;
                    for (Object obj4 : list2) {
                        int i43 = i33 + 1;
                        if (i33 < 0) {
                            v.s();
                            throw null;
                        }
                        OffboardingRestriction offboardingRestriction = (OffboardingRestriction) obj4;
                        arrayList6.add(new RowDelegate.Model(a0.d.n("LIST_ID_RESTRICTIONS_", i33), new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(offboardingRestriction.f104873b, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), new DangerCircleBadge(dw0.a.Suspicious), null, false, null, false, 60), new TextClause(offboardingRestriction.f104872a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextLocalisedClause(com.revolut.shared.feature.offboarding.api.R$string.offboarding_home_screen_restriction_subtitle_blocked, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
                        i33 = i43;
                    }
                    yp0.b.k(arrayList6, 0, 0, 0, 0, 31);
                    a0.x(arrayList6, arrayList);
                }
                pair = new Pair(bVar2, arrayList);
            } else {
                v8l.b.Companion.getClass();
                v8l.b bVar4 = v8l.b.f286902c;
                FullScreenStateDelegate.Model model4 = new FullScreenStateDelegate.Model("ERROR_ITEM_LIST_ID", new TextLocalisedClause(com.revolut.shared.feature.offboarding.api.R$string.offboarding_error_common, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new CompositeClause(v.k(new ImageClause(R$drawable.uikit_icn_24_retry, Integer.valueOf(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28), new TextLocalisedClause(com.revolut.shared.feature.offboarding.api.R$string.offboarding_home_screen_action_try_again, null, null, 14)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, null, null, false, 0, 0, 31684);
                yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
                pair = new Pair(bVar4, u.c(model4));
            }
        }
        return new g((List) pair.f186386b, (v8l.b) pair.f186385a);
    }
}
