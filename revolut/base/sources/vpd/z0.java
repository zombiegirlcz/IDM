package vpd;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.IncomeSorterDestinationsContract$SectionInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class z0 implements cli.n {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xpd.b f291198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cqd.b f291199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f291200c;
    public final Lazy d;

    public z0(xpd.b incomeSorterDestinationsInfoMapper, end.f investmentsDestinationUiMapper, cqd.b incomeSorterCrossSellMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(incomeSorterDestinationsInfoMapper, "incomeSorterDestinationsInfoMapper");
        Intrinsics.checkNotNullParameter(investmentsDestinationUiMapper, "investmentsDestinationUiMapper");
        Intrinsics.checkNotNullParameter(incomeSorterCrossSellMapper, "incomeSorterCrossSellMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f291198a = incomeSorterDestinationsInfoMapper;
        this.f291199b = incomeSorterCrossSellMapper;
        this.f291200c = featureToggleInteractor;
        this.d = yhm.j.b(new vch.a(this, 17));
    }

    public static final int a(z0 z0Var, mqd.i iVar) {
        if (iVar instanceof mqd.g) {
            return 0;
        }
        if ((iVar instanceof mqd.h) || (iVar instanceof mqd.f)) {
            return 1;
        }
        if (iVar instanceof mqd.c) {
            return 2;
        }
        if (iVar instanceof mqd.d) {
            return 3;
        }
        if (iVar instanceof mqd.b) {
            return 4;
        }
        if ((iVar instanceof mqd.a) || (iVar instanceof mqd.e)) {
            return 5;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static LargeActionButtonDelegate.Model b(com.revolut.feature.spending_analytics.api.models.income_sorter.a aVar, String str, ArrayList arrayList) {
        Object next;
        LargeActionButton.ButtonStyle.FlatButton flatButton = LargeActionButton.ButtonStyle.o;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.analytics_income_sorter_destinations_see_all, null, null, 14);
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((IncomeSorterDestinationInfo.Investment) next).getK() == aVar) {
                break;
            }
        }
        IncomeSorterDestinationInfo.Investment investment = (IncomeSorterDestinationInfo.Investment) next;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model(str, flatButton, null, textLocalisedClause, false, null, null, new e(aVar, investment != null ? investment.getF87475j() : null, arrayList), null, 744);
        int i = R$attr.uikit_dp16;
        yp0.b.r(model, i, i, 0, 0, 12);
        return model;
    }

    public static List d(LinkedHashMap linkedHashMap, x0 x0Var, TextLocalisedClause textLocalisedClause, String str, List list, boolean z, Object obj2) {
        List list2 = (List) linkedHashMap.getOrDefault(x0Var, zhm.f0.f322471a);
        if (list2.isEmpty()) {
            return list2;
        }
        return yp0.b.g(i2b.a.o(list2, list), new ListSubheaderDelegate.Model(str, (Image) null, (Clause) textLocalisedClause, (Image) (z ? new ResourceImage(R$drawable.uikit_icn_24_info_legacy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) (z ? new ListSubheaderDelegate.Model.a.b(true, false, false, 6) : null), false, false, obj2, (Parcelable) null, 0, 0, 0, 0, 64434), yp0.e0.INSIDE_BOX, 0, 0, 124);
    }

    public static List e(LinkedHashMap linkedHashMap, x0 x0Var, TextLocalisedClause textLocalisedClause, String str, List list, boolean z, IncomeSorterDestinationsContract$SectionInfoParcel incomeSorterDestinationsContract$SectionInfoParcel, int i) {
        if ((i & 16) != 0) {
            list = zhm.f0.f322471a;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            incomeSorterDestinationsContract$SectionInfoParcel = null;
        }
        return d(linkedHashMap, x0Var, textLocalisedClause, str, list2, z3, incomeSorterDestinationsContract$SectionInfoParcel);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        l lVar = domainState.f291157b;
        if (lVar instanceof j) {
            textLocalisedClause = new TextLocalisedClause(R$string.analytics_income_sorter_destinations_add_title, null, null, 14);
        } else {
            if (!(lVar instanceof k)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.analytics_income_sorter_destinations_rest_goes_title, null, null, 14);
        }
        l lVar2 = domainState.f291157b;
        if (lVar2 instanceof j) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.analytics_income_sorter_destinations_add_subtitle, null, null, 14);
        } else {
            if (!(lVar2 instanceof k)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.analytics_income_sorter_destinations_rest_goes_subtitle, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause3 = textLocalisedClause2;
        return (p) iii.c.f(domainState.f291156a, new vgk.f(this, textLocalisedClause, textLocalisedClause3), new u3a.p(textLocalisedClause, textLocalisedClause3, 13), new ccg.b(this, domainState, textLocalisedClause, textLocalisedClause3, 13));
    }
}
