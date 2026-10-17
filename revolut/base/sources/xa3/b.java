package xa3;

import aw0.ka;
import aw0.o9;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
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
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.support.impl.R$string;
import com.revolut.tracking.v3.IdContext;
import h93.f0;
import h93.g;
import ia3.h;
import ia3.r;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m93.d;
import m93.f;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import yt8.i;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f303772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f303773b;

    public b(r detailedMapper, d cardThumbnailImageProvider) {
        Intrinsics.checkNotNullParameter(detailedMapper, "detailedMapper");
        Intrinsics.checkNotNullParameter(cardThumbnailImageProvider, "cardThumbnailImageProvider");
        this.f303772a = detailedMapper;
        this.f303773b = cardThumbnailImageProvider;
    }

    public static boolean a(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        return !card.a0() && card.u() == h93.r.ACTIVE && card.e().d().compareTo(g.NONE) > 0;
    }

    public static RowDelegate.Model b(b bVar, f0 f0Var, i iVar, List list, boolean z, boolean z3, boolean z4, boolean z6, int i) {
        Object next;
        LocalDate localDateB;
        Clause clauseM;
        boolean z11 = (i & 8) != 0 ? true : z3;
        boolean z12 = (i & 16) != 0 ? false : z4;
        bVar.getClass();
        r rVar = bVar.f303772a;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            pi3.d d = ((CheckoutOrder) next).getD();
            if (Intrinsics.f(d != null ? d.a() : null, f0Var.getId())) {
                break;
            }
        }
        CheckoutOrder checkoutOrder = (CheckoutOrder) next;
        Clause clauseB = f.b(rVar, f0Var, null, Boolean.valueOf(z6), 10);
        Clause clause = clauseB instanceof Clause ? clauseB : null;
        if (clause != null) {
            clauseB = z12 ? new CompositeClause(v.k(clause, new TextClause(j6.a.q("··", f0Var.k()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12) : clause;
        }
        h93.f fVarC = f0Var.e().c();
        if (fVarC == null || (localDateB = fVarC.a()) == null) {
            localDateB = f0Var.e().b();
        }
        if (f0Var.e().d() == g.DELIVERED || localDateB == null) {
            clauseM = rVar.m(f0Var, iVar, checkoutOrder);
        } else {
            clauseM = new CompositeClause(v.k(new TextLocalisedClause(R$string.card_state_ordered_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), new TextLocalisedClause(localDateB.isBefore(LocalDate.now()) ? R$string.card_state_should_have_arrived_title : R$string.card_state_est_delivery_date_title, u.c(new TimeClause(jli.b.b(localDateB), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), null, 12)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        Clause clause2 = clauseM;
        LayeredImage layeredImageJ = rVar.j(f0Var, iVar, checkoutOrder);
        tf tfVar = z ? new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false) : null;
        Image imageC = ((h) bVar.f303773b).c(f0Var);
        String id10 = f0Var.getId();
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        IdContext.a aVarNewBuilder = IdContext.newBuilder();
        aVarNewBuilder.h(f0Var.getId());
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return new RowDelegate.Model("CARD_LIST_ITEM_ID", imageC, null, null, clauseB, clause2, null, null, 0, tfVar, z11, false, layeredImageJ, null, null, null, null, id10, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA)), 0, 0, 0, 0, 1023387500);
    }
}
