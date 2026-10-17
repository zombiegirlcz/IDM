package azi;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.airportlounges.api.model.SchemeAirportLoungesCell;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f11475a;

    public l(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f11475a = uiKitResources;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        CompositeClause compositeClause;
        int i;
        int i2;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList<SchemeAirportLoungesCell> arrayList = domainState.f11462a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (SchemeAirportLoungesCell schemeAirportLoungesCell : arrayList) {
            String str = schemeAirportLoungesCell.f98935b;
            TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause2 = new TextClause(schemeAirportLoungesCell.f98936c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            SchemeAirportLoungesCell.Action action = schemeAirportLoungesCell.d;
            if (action != null) {
                Float fValueOf = Float.valueOf(16.0f);
                boolean z = action instanceof SchemeAirportLoungesCell.Action.CopyCardNumber;
                if (z) {
                    i = R$drawable.uikit_icn_24_profile;
                } else {
                    if (!(action instanceof SchemeAirportLoungesCell.Action.OpenApp)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$drawable.uikit_icn_24_qr;
                }
                ImageClause imageClause = new ImageClause(i, new ImageClauseTint.Color(R$attr.uikit_colorAccent), fValueOf, fValueOf, 16);
                if (z) {
                    i2 = R$string.airport_lounges_scheme_action_copy_card_number;
                } else {
                    if (!(action instanceof SchemeAirportLoungesCell.Action.OpenApp)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R$string.airport_lounges_scheme_action_get_app;
                }
                compositeClause = new CompositeClause(v.k(imageClause, new TextLocalisedClause(i2, null, null, 14)), new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Click(28, (Integer) null, (Object) action, "CLICK_ACTION_ID", false), null, 8);
            } else {
                compositeClause = null;
            }
            String str2 = schemeAirportLoungesCell.f98934a;
            Integer numValueOf = Integer.valueOf(R$attr.uikit_colorForeground);
            int iIntValue = R$drawable.uikit_icn_24_statement;
            int iA = this.f11475a.a(str2);
            Integer numValueOf2 = iA != 0 ? Integer.valueOf(iA) : null;
            if (numValueOf2 != null) {
                iIntValue = numValueOf2.intValue();
            }
            arrayList2.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(iIntValue, (Integer) null, (Integer) null, numValueOf, (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), textClause, null, 0, textClause2, compositeClause, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868760));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return new e(arrayList2);
    }
}
