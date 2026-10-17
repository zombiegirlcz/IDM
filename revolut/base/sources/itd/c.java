package itd;

import a0.d;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import egk.e;
import java.util.List;
import jtd.g;
import jtd.i;
import jtd.j;
import jtd.k;
import jtd.l;
import jtd.m;
import jtd.n;
import jtd.o;
import jtd.q;
import jtd.r;
import jtd.s;
import jtd.t;
import jtd.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yy0.h;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gej.a f168364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f168365b;

    public c(gej.a esimBytesFormatter, e pricingPlansUiInteractor) {
        Intrinsics.checkNotNullParameter(esimBytesFormatter, "esimBytesFormatter");
        Intrinsics.checkNotNullParameter(pricingPlansUiInteractor, "pricingPlansUiInteractor");
        this.f168364a = esimBytesFormatter;
        this.f168365b = pricingPlansUiInteractor;
    }

    public static RowDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, Clause clause, Image image, ProgressStyle progressStyle, Object obj2) {
        return new RowDelegate.Model(str, image, null, progressStyle, textLocalisedClause, clause, null, null, 0, new tf(new h(textLocalisedClause, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))), false, false, null, null, null, null, null, obj2, null, 0, 0, 0, 0, 1056962404);
    }

    public static LayeredImage b(int i) {
        return LayeredImage.INSTANCE.i(i, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10);
    }

    public static String c(u uVar) {
        if (uVar instanceof q) {
            q qVar = (q) uVar;
            return d.s("tool_exchange_", qVar.f178487a.f306286a, "_", qVar.f178488b.f306286a);
        }
        if (uVar instanceof m) {
            l lVar = ((m) uVar).f178484a;
            if (!(lVar instanceof j)) {
                if (lVar.equals(k.f178483a)) {
                    return "tool_esim_active_unlimited";
                }
                throw new NoWhenBranchMatchedException();
            }
            j jVar = (j) lVar;
            return "tool_esim_active_" + jVar.f178481a + "_" + jVar.f178482b;
        }
        if (uVar instanceof o) {
            return j6.a.q("tool_esim_available_to_buy_", ((o) uVar).f178486a.f297794a);
        }
        if (uVar instanceof n) {
            return "tool_esim_available_to_activate";
        }
        if (Intrinsics.f(uVar, s.f178491a)) {
            return "tool_split_bill";
        }
        if (uVar instanceof jtd.h) {
            return j6.a.q("tool_atm_", ((jtd.h) uVar).f178479a.f297794a);
        }
        if (Intrinsics.f(uVar, t.f178492a)) {
            return "tool_transport_hubs";
        }
        if (Intrinsics.f(uVar, i.f178480a)) {
            return "tool_bizum";
        }
        if (Intrinsics.f(uVar, r.f178490a)) {
            return "tool_pix";
        }
        if (Intrinsics.f(uVar, g.f178478a)) {
            return "tool_alipay";
        }
        throw new NoWhenBranchMatchedException();
    }
}
