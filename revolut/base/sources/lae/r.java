package lae;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.subscriptions.impl.list.CardSubscriptionListScreenContract$InputData;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import h93.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mae.o f193384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m93.d f193385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CardSubscriptionListScreenContract$InputData f193386c;

    public r(mae.o subscriptionsItemMapper, m93.d cardThumbnailImageProvider, CardSubscriptionListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(subscriptionsItemMapper, "subscriptionsItemMapper");
        Intrinsics.checkNotNullParameter(cardThumbnailImageProvider, "cardThumbnailImageProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f193384a = subscriptionsItemMapper;
        this.f193385b = cardThumbnailImageProvider;
        this.f193386c = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        final int i = 0;
        RowDelegate.Model model = (RowDelegate.Model) iii.c.f(domainState.f193367a, new l9j.k(14), new l9j.j(3), new Function3(this) { // from class: lae.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f193382b;

            {
                this.f193382b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                switch (i) {
                    case 0:
                        f0 card = (f0) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(card, "card");
                        String str = card.f150110a;
                        String str2 = card.f150111b;
                        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(((ia3.h) this.f193382b.f193385b).c(card), null, null, false, null, false, 62);
                        String str3 = card.f150115j;
                        CompositeClause compositeClause = str3 != null ? new CompositeClause(v.k(v04.b.J(card, str2, null, null, 14), new TextClause(" ··", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14) : v04.b.J(card, str2, null, null, 14);
                        String upperCase = card.f150114h.f13640b.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        RowDelegate.Model model2 = new RowDelegate.Model(str, image40, compositeClause, null, 0, new TextClause(upperCase, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
                        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                        return model2;
                    default:
                        List subscriptions = (List) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
                        aim.e eVarB = u.b();
                        if (subscriptions.isEmpty()) {
                            List listC = u.c(new FullScreenStateDelegate.Model("NO_SUBSCRIPTIONS_LIST_ID", new TextLocalisedClause(R$string.card_subscription_list_empty_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D094", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32756));
                            yp0.b.k(listC, 0, 0, 0, 0, 31);
                            eVarB.addAll(listC);
                        } else {
                            List list = subscriptions;
                            ArrayList arrayList = new ArrayList(w.t(list, 10));
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(a9e.h.c(this.f193382b.f193384a, (qua.p) it8.next()));
                            }
                            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                            eVarB.addAll(arrayList);
                        }
                        return u.a(eVarB);
                }
            }
        });
        final int i2 = 1;
        List list = (List) iii.c.f(domainState.f193368b, new l9j.k(this, 15), new l9j.j(4), new Function3(this) { // from class: lae.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f193382b;

            {
                this.f193382b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                switch (i2) {
                    case 0:
                        f0 card = (f0) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(card, "card");
                        String str = card.f150110a;
                        String str2 = card.f150111b;
                        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(((ia3.h) this.f193382b.f193385b).c(card), null, null, false, null, false, 62);
                        String str3 = card.f150115j;
                        CompositeClause compositeClause = str3 != null ? new CompositeClause(v.k(v04.b.J(card, str2, null, null, 14), new TextClause(" ··", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14) : v04.b.J(card, str2, null, null, 14);
                        String upperCase = card.f150114h.f13640b.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        RowDelegate.Model model2 = new RowDelegate.Model(str, image40, compositeClause, null, 0, new TextClause(upperCase, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
                        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                        return model2;
                    default:
                        List subscriptions = (List) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
                        aim.e eVarB = u.b();
                        if (subscriptions.isEmpty()) {
                            List listC = u.c(new FullScreenStateDelegate.Model("NO_SUBSCRIPTIONS_LIST_ID", new TextLocalisedClause(R$string.card_subscription_list_empty_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D094", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32756));
                            yp0.b.k(listC, 0, 0, 0, 0, 31);
                            eVarB.addAll(listC);
                        } else {
                            List list2 = subscriptions;
                            ArrayList arrayList = new ArrayList(w.t(list2, 10));
                            Iterator it8 = list2.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(a9e.h.c(this.f193382b.f193384a, (qua.p) it8.next()));
                            }
                            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                            eVarB.addAll(arrayList);
                        }
                        return u.a(eVarB);
                }
            }
        });
        aim.e eVarB = u.b();
        if (model != null) {
            eVarB.add(model);
        }
        eVarB.addAll(list);
        aim.e eVarA = u.a(eVarB);
        int i3 = q.f193383a[this.f193386c.f89209b.ordinal()];
        TextLocalisedClause textLocalisedClause = null;
        if (i3 != 1) {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f0 f0Var = (f0) domainState.f193367a.getContent();
            textLocalisedClause = (f0Var == null || !f0Var.P()) ? new TextLocalisedClause(R$string.card_subscription_list_unlink_subtitle, null, null, 14) : new TextLocalisedClause(R$string.card_subscription_list_unlink_joint_subtitle, null, null, 14);
        }
        return new i(eVarA, textLocalisedClause, model != null);
    }
}
