package iuc;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import ip0.nb0;
import ip0.pb0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        kuc.d dVar = domainState.f168547a;
        Object model = null;
        if (!(dVar instanceof kuc.a)) {
            if (dVar instanceof kuc.b) {
                model = nb0.a(pb0.Companion, "ID_GAMBLING", false, 6);
            } else {
                if (!(dVar instanceof kuc.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                Integer numValueOf = Integer.valueOf(R$string.security_hub_gambling_cell_subtitle);
                kuc.c cVar = (kuc.c) dVar;
                if (!cVar.f189769b) {
                    numValueOf = null;
                }
                model = new RowDelegate.Model("ID_GAMBLING", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_game_cube, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.security_hub_home_gambling_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 0, numValueOf != null ? new TextLocalisedClause(numValueOf.intValue(), null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10) : null, null, null, 0, new vf(cVar.f189768a, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
            }
        }
        List listL = v.l(model);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new d(listL);
    }
}
