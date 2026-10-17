package gx2;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_contactless_limit.api.Mode;
import com.revolut.feature.card_contactless_limit.impl.ui.mvp.RevolutCardResetScaScreenContract$Configuration;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.support.api.navigation.SupportFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import h93.f0;
import ip0.w30;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f147618b;

    public /* synthetic */ b(k kVar, int i) {
        this.f147617a = i;
        this.f147618b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Clause compositeClause;
        p pVar;
        cx2.a aVar;
        switch (this.f147617a) {
            case 0:
                q data = (q) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                k kVar = this.f147618b;
                RevolutCardResetScaScreenContract$Configuration configuration = kVar.k;
                if (configuration.f64530a instanceof Mode.SingleCard) {
                    Intrinsics.i(data, "null cannot be cast to non-null type com.revolut.feature.card_contactless_limit.impl.ui.mvp.RevolutCardResetScaScreenContract.ScaData.SingleCardProgress");
                    cx2.a aVar2 = ((p) data).f147636a;
                    Long lValueOf = aVar2 != null ? Long.valueOf(aVar2.f109884a.f150154a.f115082a) : null;
                    ((iqi.b) kVar.f147627l).Z((lValueOf != null ? lValueOf.longValue() : Long.MAX_VALUE) >= 0);
                }
                ((u) kVar.o).getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ComplexImage.Regular regular = new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D013", null, null, null, 30));
                int i = 14;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(configuration.f64531b, null, null, 14);
                Mode mode = configuration.f64530a;
                boolean z = mode instanceof Mode.SingleCard;
                if (z) {
                    compositeClause = new TextLocalisedClause(((Mode.SingleCard) mode).f64514b, null, null, 14);
                } else {
                    if (!(mode instanceof Mode.AllCardsLimitWarning)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Intrinsics.i(data, "null cannot be cast to non-null type com.revolut.feature.card_contactless_limit.impl.ui.mvp.RevolutCardResetScaScreenContract.ScaData.Cards");
                    List list = ((o) data).f147635a;
                    Mode.AllCardsLimitWarning allCardsLimitWarning = (Mode.AllCardsLimitWarning) mode;
                    int i2 = allCardsLimitWarning.f64511b;
                    int i3 = allCardsLimitWarning.f64512c;
                    List<f0> list2 = list;
                    ArrayList<Pair> arrayList3 = new ArrayList(w.t(list2, 10));
                    for (f0 f0Var : list2) {
                        arrayList3.add(new Pair(f0Var, v04.b.J(f0Var, f0Var.f150111b, null, null, i)));
                        i = 14;
                    }
                    ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                    for (Pair pair : arrayList3) {
                        f0 f0Var2 = (f0) pair.f186385a;
                        CompositeClause compositeClause2 = (CompositeClause) pair.f186386b;
                        String str = f0Var2.f150115j;
                        if (str != null && str.length() > 0) {
                            compositeClause2 = new CompositeClause(v.k(compositeClause2, new TextClause(j6.a.q(" ··", f0Var2.f150115j), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14);
                        }
                        arrayList4.add(compositeClause2);
                    }
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(new HtmlLocalisedClause(i2, (List) null, (Integer) null, (Object) null, 30));
                    arrayList5.add(new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                    int i5 = 0;
                    for (Object obj3 : arrayList4) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            v.s();
                            throw null;
                        }
                        arrayList5.add((CompositeClause) obj3);
                        if (i5 < arrayList4.size() - 1) {
                            arrayList5.add(new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                        }
                        i5 = i6;
                    }
                    arrayList5.add(new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                    arrayList5.add(new HtmlLocalisedClause(i3, (List) null, (Integer) null, (Object) null, 30));
                    compositeClause = new CompositeClause(arrayList5, null, null, null, 14);
                }
                arrayList.add(new FullScreenStateDelegate.Model("FULL_SCREEN_STATE_ID", textLocalisedClause, compositeClause, regular, null, null, false, null, null, false, 0, 0, 32752));
                if (z && (aVar = (pVar = (p) data).f147636a) != null) {
                    dj0.d dVar = aVar.f109885b;
                    long j2 = aVar.f109884a.f150154a.f115082a;
                    long j3 = dVar.f115082a;
                    xi0.b bVar = dVar.f115083b;
                    arrayList2.add(new w30(new TextLocalisedClause(R$string.card_sca_limit_reset_out_of, v.k(new MoneyClause(pVar.f147636a.f109884a.f150154a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 8), new TextLocalisedClause(R$string.card_sca_limit_reset_amount_left, zhm.u.c(new MoneyClause(j2 <= j3 ? new dj0.d(j3 - j2, bVar) : new dj0.d(0L, bVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), (int) j3, (int) j2));
                }
                return new m(arrayList, arrayList2);
            case 1:
                k kVar2 = this.f147618b;
                return kVar2.k.e ? ((cx2.f) kVar2.f147629n).a() : pfm.m.f235744a;
            case 2:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f147618b.Q();
            case 3:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return ((cx2.f) this.f147618b.f147629n).f109888a.a(new FeatureCommand(SupportFeatureConfig.f89363a));
            case 4:
                Boolean it10 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                k kVar3 = this.f147618b;
                cx2.e eVar = (cx2.e) kVar3.f147626j;
                eVar.getClass();
                pfm.h hVar = new pfm.h(new a08.d(eVar, 9), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar.e(kVar3.Q());
            case 5:
                kpi.a it11 = (kpi.a) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                pfm.h hVar2 = new pfm.h(new a08.d(this.f147618b, 26), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                return hVar2;
            case 6:
                Unit it12 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return ((cx2.f) this.f147618b.f147629n).a();
            default:
                String itemId = (String) obj2;
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                return Intrinsics.f(itemId, "IGNORE_MENU_ITEM_ID") ? ((cx2.f) this.f147618b.f147629n).a() : pfm.m.f235744a;
        }
    }
}
