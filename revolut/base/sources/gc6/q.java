package gc6;

import aw0.j0;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.donations.impl.R$string;
import ip0.gu;
import ip0.og;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements jki.p {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f142365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f142366b;

    public q(b transactionItemsMapper, a31.a donationsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(transactionItemsMapper, "transactionItemsMapper");
        Intrinsics.checkNotNullParameter(donationsAvailabilityInteractor, "donationsAvailabilityInteractor");
        this.f142365a = transactionItemsMapper;
        this.f142366b = donationsAvailabilityInteractor;
    }

    public static List b(int i) {
        gu guVar = new gu(a0.d.n("LOADING_SUBHEADER_ITEM_ID_", i), 0, 0, 30);
        og ogVar = new og(a0.d.n("LOADING_ITEM_ID_", i));
        yp0.b.l(ogVar, 0, 0, 0, 0, null, false, 63);
        return v.k(guVar, ogVar);
    }

    public static ListSubheaderDelegate.Model c() {
        return new ListSubheaderDelegate.Model("DONATIONS_RECURRING_PAYMENTS_SUBHEADER_ID", null, new TextLocalisedClause(R$string.donations_overview_contribution_recurring_section_title, null, null, 14), null, null, null, j0.TRANSPARENT, null, null, false, false, null, null, R$attr.uikit_dp24, 0, 0, 0, 15728570);
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.Map] */
    public static RowDelegate.Model d(Pair pair) {
        Clause textClause;
        ba6.l lVar = (ba6.l) pair.f186385a;
        yvh.b bVar = (yvh.b) pair.f186386b;
        UrlImage urlImage = new UrlImage(lVar.f, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) bb6.a.f14169a, false, false, new ImageTransformations(null, new CircleTransformation(Float.valueOf(0.5f), Integer.valueOf(R$attr.uikit_colorGreyTone10), false, 12), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 515578);
        LayeredImage layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_coins, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorAccent, 4.0f, null, null, 48);
        TextClause textClause2 = new TextClause(lVar.f13939b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Float f = bVar.i;
        Clause[] clauseArr = new Clause[3];
        clauseArr[0] = new TextLocalisedClause(R$string.donations_settings_spare_title, null, null, 14);
        t0 t0Var = t0.f186434a;
        m70.a.t(t0Var);
        clauseArr[1] = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Integer num = (Integer) ib6.e.f160095a.get(Float.valueOf(f != null ? f.floatValue() : BitmapDescriptorFactory.HUE_RED));
        if (num != null) {
            textClause = new TextLocalisedClause(num.intValue(), null, null, 14);
        } else {
            Intrinsics.checkNotNullParameter(t0Var, "<this>");
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        clauseArr[2] = textClause;
        return new RowDelegate.Model("DONATIONS_SPARE_CHANGE_ITEM_ID", urlImage, null, null, textClause2, new CompositeClause(v.k(clauseArr), null, null, null, 14), null, null, 0, null, false, false, layeredImageB, null, null, null, null, new g(lVar, bVar), null, 0, 0, 0, 0, 1056948076);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0132  */
    @Override // jki.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jki.m a(jki.i r24) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gc6.q.a(jki.i):jki.m");
    }
}
