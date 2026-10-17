package z0f;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.topup_screen.api.TopupApi$Toggles;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 implements cli.n {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zjh.j f318263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xte.a f318264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f318265c;

    public i0(zjh.j legalEntityDisclaimerMapper, sze.d imageFactory, uze.a topUpMethodsOrderManager, xte.a topUpMethodsItemsMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        Intrinsics.checkNotNullParameter(imageFactory, "imageFactory");
        Intrinsics.checkNotNullParameter(topUpMethodsOrderManager, "topUpMethodsOrderManager");
        Intrinsics.checkNotNullParameter(topUpMethodsItemsMapper, "topUpMethodsItemsMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f318263a = legalEntityDisclaimerMapper;
        this.f318264b = topUpMethodsItemsMapper;
        this.f318265c = featureToggleInteractor;
    }

    public static LargeActionButtonDelegate.Model a(boolean z) {
        return new LargeActionButtonDelegate.Model("LIST_ID_BUTTON_EXPAND", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(z ? R.string.common_show_less : R.string.common_show_more, null, null, 14), false, null, null, null, null, 744);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Boolean boolValueOf;
        boolean z;
        q domainState = (q) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f318273a, new yy9.s(25), new a0(1), new y66.q(this, domainState, 21));
        List listV = zjh.j.v(this.f318263a, domainState.k);
        int i = R$attr.uikit_dp16;
        yp0.b.q(listV, i, i, 0, 0, 12);
        boolean zC = ((jte.d) this.f318265c).c(TopupApi$Toggles.PayByBank.f90470c);
        ArrayList arrayListE0 = zhm.d0.E0(listV, list);
        boolean z3 = false;
        if (!zC && domainState.f318274b != null) {
            com.revolut.domain.models.topup.methods.b bVar = (com.revolut.domain.models.topup.methods.b) domainState.f318273a.getContent();
            if (bVar == null) {
                boolValueOf = null;
            } else if (bVar.f60525a.isEmpty()) {
                ArrayList<TopupMethod.OtherMethod> arrayList = bVar.f60526b;
                if (!arrayList.isEmpty()) {
                    for (TopupMethod.OtherMethod otherMethod : arrayList) {
                        Intrinsics.checkNotNullParameter(otherMethod, "<this>");
                        switch (g0.f318261a[otherMethod.f60440a.ordinal()]) {
                        }
                        z = true;
                        boolValueOf = Boolean.valueOf(z);
                    }
                }
                z = false;
                boolValueOf = Boolean.valueOf(z);
            } else {
                z = true;
                boolValueOf = Boolean.valueOf(z);
            }
            if (pd.b.j(boolValueOf)) {
                z3 = true;
            }
        }
        return new z(arrayListE0, z3, !zC);
    }
}
