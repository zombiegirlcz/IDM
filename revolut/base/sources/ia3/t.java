package ia3;

import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.revolut.feature_fourthline_impl.R;
import h93.f0;
import h93.h0;
import h93.l0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class t implements m93.g {

    @NotNull
    public static final s Companion = new s();
    public static final TextClause e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.g f159948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.a f159949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m93.d f159950c;
    public final gte.a d;

    static {
        m70.a.c(t0.f186434a);
        e = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public t(t70.g localization, l80.a datePrinter, m93.d cardThumbnailImageProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(datePrinter, "datePrinter");
        Intrinsics.checkNotNullParameter(cardThumbnailImageProvider, "cardThumbnailImageProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f159948a = localization;
        this.f159949b = datePrinter;
        this.f159950c = cardThumbnailImageProvider;
        this.d = featureToggleInteractor;
    }

    public final String c(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        String strB = jli.g.b(card.f150114h.f13640b);
        String str = card.f150115j;
        return (str == null || str.length() <= 0) ? strB : com.google.android.gms.internal.mlkit_vision_face.a.o(strB, " ··", str);
    }

    public final Image d(f0 card, boolean z) {
        Intrinsics.checkNotNullParameter(card, "card");
        return ((h) this.f159950c).b(card.f150114h, h0.f(card) || !z || card.U());
    }

    public final Image e(boolean z, f0 card, yt8.i kycStatus) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(kycStatus, "kycStatus");
        boolean z3 = true;
        boolean z4 = card.G() || card.F() || !ngm.n.p(kycStatus) || h0.f(card) || Intrinsics.f(card.f150122s, Boolean.TRUE) || card.U() || card.a() || (card.f150126y && !card.d) || h0.b(card);
        b93.j jVar = card.f150114h;
        if (z && !z4) {
            z3 = false;
        }
        return ((h) this.f159950c).b(jVar, z3);
    }

    public final n93.c f(boolean z, f0 card, Boolean bool) {
        Pair pair;
        Boolean bool2;
        Intrinsics.checkNotNullParameter(card, "card");
        h93.h hVar = card.k;
        h93.r rVar = card.f;
        h93.f fVar = hVar.f150137j;
        LocalDate localDate = fVar != null ? fVar.f150109b : hVar.i;
        LocalDate time = card.f150120q;
        TextClause textClause = e;
        t70.g gVar = this.f159948a;
        if (!z) {
            pair = new Pair(new TextClause(gVar.getString(R$string.dashboard_widgets_cards_inactive), (Style) null, Integer.valueOf(R$attr.uikit_colorPink), false, (o9) null, (List) null, 122), textClause);
        } else if (rVar == h93.r.EXPIRED) {
            pair = new Pair(new TextClause(gVar.getString(R$string.card_state_expired_title), (Style) null, Integer.valueOf(R$attr.uikit_colorPink), false, (o9) null, (List) null, 122), textClause);
        } else if (rVar == h93.r.BLOCKED) {
            pair = new Pair(new TextClause(gVar.getString(R$string.dashboard_widgets_cards_status_blocked), (Style) null, Integer.valueOf(R$attr.uikit_colorRed), false, (o9) null, (List) null, 122), textClause);
        } else if (hVar.f150132a != h93.g.DELIVERED && !card.R() && localDate != null) {
            pair = new Pair(new TextClause(gVar.getString(R.string.card_delivery_expected), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TimeClause(jli.b.b(localDate), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12));
        } else if (time == null || !Intrinsics.f(card.f150122s, Boolean.TRUE)) {
            pair = new Pair(textClause, textClause);
        } else {
            TextClause textClause2 = new TextClause(gVar.getString(R$string.dashboard_widgets_cards_expires_on), (Style) null, Integer.valueOf(R$attr.uikit_colorPink), false, (o9) null, (List) null, 122);
            l80.c cVar = (l80.c) this.f159949b;
            Intrinsics.checkNotNullParameter(time, "time");
            Intrinsics.checkNotNullParameter("d MMM", "pattern");
            long millis = time.toDateTimeAtStartOfDay(DateTimeZone.UTC).getMillis();
            Intrinsics.checkNotNullParameter("d MMM", "pattern");
            String strPrint = DateTimeFormat.forPattern("d MMM").withLocale(((s80.b) cVar.f192762a).b()).print(millis);
            Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
            pair = new Pair(textClause2, new TextClause(strPrint, (Style) null, Integer.valueOf(R$attr.uikit_colorPink), false, (o9) null, (List) null, 122));
        }
        TextClause textClause3 = (TextClause) pair.f186385a;
        Pair pair2 = (rVar == h93.r.EXPIRED || rVar == h93.r.BLOCKED || !z) ? new Pair(Integer.valueOf(R$attr.uikit_colorForeground_30), Integer.valueOf(R$attr.uikit_colorGreyTone50_30)) : new Pair(Integer.valueOf(R$attr.uikit_colorForeground), Integer.valueOf(R$attr.uikit_colorGreyTone50));
        int iIntValue = ((Number) pair2.f186385a).intValue();
        int iIntValue2 = ((Number) pair2.f186386b).intValue();
        Image imageD = d(card, z);
        String strC = c(card);
        String str = card.f150111b;
        Custom custom = new Custom(Integer.valueOf(iIntValue2), false, null, false, null, 254);
        if (card.G != l0.BRAZIL_LOCAL) {
            bool2 = null;
        } else {
            bool2 = ((jte.d) this.d).c(CardsCoreApi$Toggles.LocalComboCardsImprovements.f65565c) ? bool : Boolean.TRUE;
        }
        return new n93.c(card.f150110a, new TextClause(strC, (Style) null, Integer.valueOf(iIntValue), false, (o9) null, (List) null, 122), v04.b.J(card, str, custom, bool2, 4), textClause3, (Clause) pair.f186386b, imageD, new n93.b(card.f150110a));
    }

    public final RowDelegate.Model g(boolean z, f0 card, boolean z3, Boolean bool) {
        TextClause textClause;
        Intrinsics.checkNotNullParameter(card, "card");
        n93.c cVarF = f(z, card, bool);
        CompositeClause compositeClause = cVarF.f213550c;
        int i = 0;
        RowDelegate.Model.c tfVar = z3 ? new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false) : new RowDelegate.Model.c.b(null, null, null, false, CertificateBody.profileType);
        ArrayList arrayListN = v.n(compositeClause);
        TextClause textClause2 = cVarF.d;
        TextClause textClause3 = e;
        if (Intrinsics.f(textClause2, textClause3)) {
            textClause2 = null;
        }
        Clause clause = cVarF.e;
        if (Intrinsics.f(clause, textClause3)) {
            clause = null;
        }
        Clause[] elements = {textClause2, clause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (Object obj2 : kotlin.collections.d.L(elements)) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            Clause clause2 = (Clause) obj2;
            if (i == 0) {
                m70.a.a(t0.f186434a);
                textClause = new TextClause(" · ", compositeClause.f57749c, (Integer) null, false, (o9) null, (List) null, 124);
            } else {
                textClause = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            arrayListN.add(textClause);
            arrayListN.add(clause2);
            i = i2;
        }
        return new RowDelegate.Model(cVarF.f213548a, cVarF.f, null, null, cVarF.f213549b, new CompositeClause(arrayListN, null, null, null, 14), null, null, 0, tfVar, z3, false, null, null, null, null, null, cVarF.f213551g, null, 0, 0, 0, 0, 1056958316);
    }
}
