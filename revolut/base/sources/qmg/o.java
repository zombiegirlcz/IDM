package qmg;

import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.collect.ImmutableMap;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.user.checklist.api.UserChecklistContentType;
import com.revolut.feature.user.checklist.impl.ui.screen.UserChecklistContract$InputData;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ke0;
import ip0.le0;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f247838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UserChecklistContract$InputData f247839b;

    public o(ImmutableMap itemsProviders, UserChecklistContract$InputData inputData, tmg.c userChecklistErrorMapper) {
        Intrinsics.checkNotNullParameter(itemsProviders, "itemsProviders");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userChecklistErrorMapper, "userChecklistErrorMapper");
        this.f247838a = itemsProviders;
        this.f247839b = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        final int i = 0;
        List list = (List) iii.c.f(domainState.f247824a, new Function1(this) { // from class: qmg.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f247837b;

            {
                this.f247837b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                o oVar = this.f247837b;
                Function0 it8 = (Function0) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        UserChecklistContentType userChecklistContentType = oVar.f247839b.f94613b;
                        if (!Intrinsics.f(userChecklistContentType, UserChecklistContentType.AdoptionJourney.f94595a)) {
                            if (!Intrinsics.f(userChecklistContentType, UserChecklistContentType.FincrimeChecklist.f94596a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List listC = u.c(nb0.a(pb0.Companion, "LOADING_STATE_ID", false, 6));
                            yp0.b.k(listC, R$attr.uikit_dp16, 0, 0, 0, 30);
                            return listC;
                        }
                        TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        int i3 = R$attr.uikit_colorShimmer;
                        le0 le0Var = new le0("LOADING_CHART_ID", textClause, new ke0(1.0f, i3, BitmapDescriptorFactory.HUE_RED, i3, i3), 0, 0, Constants.TAG_FULL_SVPP_IDENTIFICATION);
                        yp0.b.r(le0Var, 0, 0, 0, 0, 15);
                        ArrayList arrayListN = v.n(le0Var);
                        a0.x(iii.c.c(4), arrayListN);
                        return arrayListN;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        if (oVar.f247839b.f94613b instanceof UserChecklistContentType.FincrimeChecklist) {
                            return new lw0.h(lw0.i.CENTER_WITH_IMAGE);
                        }
                        return null;
                }
            }
        }, new qjj.g(this, 10), new qbg.j(this, 8));
        final int i2 = 1;
        return new c(list, (lw0.m) iii.c.f(domainState.f247824a, new Function1(this) { // from class: qmg.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f247837b;

            {
                this.f247837b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                o oVar = this.f247837b;
                Function0 it8 = (Function0) obj2;
                switch (i22) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        UserChecklistContentType userChecklistContentType = oVar.f247839b.f94613b;
                        if (!Intrinsics.f(userChecklistContentType, UserChecklistContentType.AdoptionJourney.f94595a)) {
                            if (!Intrinsics.f(userChecklistContentType, UserChecklistContentType.FincrimeChecklist.f94596a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List listC = u.c(nb0.a(pb0.Companion, "LOADING_STATE_ID", false, 6));
                            yp0.b.k(listC, R$attr.uikit_dp16, 0, 0, 0, 30);
                            return listC;
                        }
                        TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        int i3 = R$attr.uikit_colorShimmer;
                        le0 le0Var = new le0("LOADING_CHART_ID", textClause, new ke0(1.0f, i3, BitmapDescriptorFactory.HUE_RED, i3, i3), 0, 0, Constants.TAG_FULL_SVPP_IDENTIFICATION);
                        yp0.b.r(le0Var, 0, 0, 0, 0, 15);
                        ArrayList arrayListN = v.n(le0Var);
                        a0.x(iii.c.c(4), arrayListN);
                        return arrayListN;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        if (oVar.f247839b.f94613b instanceof UserChecklistContentType.FincrimeChecklist) {
                            return new lw0.h(lw0.i.CENTER_WITH_IMAGE);
                        }
                        return null;
                }
            }
        }, new qjj.g(11), new qk2.h(2)));
    }
}
