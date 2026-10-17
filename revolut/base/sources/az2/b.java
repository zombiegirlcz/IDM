package az2;

import aim.e;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import h93.f0;
import ip0.m00;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.l;
import rp0.t;
import rp0.y;
import yt8.i;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public interface b {

    @NotNull
    public static final a Companion = a.f11382a;

    static y b(b bVar, f0 card, i kycStatus, List list, boolean z, boolean z3, int i) {
        boolean z4 = (i & 8) != 0 ? true : z;
        boolean z6 = (i & 16) != 0 ? true : z3;
        vz2.b bVar2 = (vz2.b) bVar;
        bVar2.getClass();
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(kycStatus, "kycStatus");
        if (!card.Y) {
            return vz2.b.d(bVar2, card, kycStatus, list, null, null, z4, z6, 24);
        }
        t tVar = new t(new TextLocalisedClause(R$string.card_terminate_confirm_title, null, null, 14), null, null, 30);
        l lVar = l.WINDOW;
        e eVarB = u.b();
        m00 m00Var = new m00("MULTIBANCO_TERMINATE_WIDGET_LIST_ID", new TextLocalisedClause(R$string.card_terminate_confirm_multibanco_widget_title, null, null, 14), new TextLocalisedClause(R$string.card_terminate_confirm_multibanco_widget_subtitle, null, null, 14), new GlyphImage(R$drawable.uikit_icn_24_warning, null, null, 6), null, null, null, 2032);
        yp0.b.l(m00Var, 0, 0, 0, 0, null, false, 63);
        eVarB.add(m00Var);
        eVarB.addAll(vz2.b.c(card, kycStatus, z4, z6));
        return new y(u.a(eVarB), tVar, lVar, null, null, null, 1016);
    }
}
