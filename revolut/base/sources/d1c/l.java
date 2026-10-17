package d1c;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.decoration.AlphaDecoration;
import com.revolut.core.ui_kit_core.displayers.image.decoration.DecoratedImage;
import com.revolut.core.ui_kit_core.displayers.image.decoration.GrayedOutDecoration;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.lifestyle.core.api.model.savings.LifestyleSavingsSummary$SavingsHighlight;
import com.revolut.feature.rev_points.api.R$string;
import ip0.m4;
import ip0.o4;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f110640a;

    public l(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f110640a = uiKitResources;
    }

    public static boolean a(y19.h hVar, y19.i iVar) {
        Object next;
        List list = hVar.f310346a.f310342b;
        dj0.d dVar = null;
        if (list != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (((y19.g) next).f310343a == iVar) {
                    break;
                }
            }
            y19.g gVar = (y19.g) next;
            if (gVar != null) {
                dVar = gVar.f310344b;
            }
        }
        return (dVar == null || dVar.k()) ? false : true;
    }

    public static ListSubheaderDelegate.Model c() {
        return new ListSubheaderDelegate.Model("HIGHLIGHTS_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.rev_points_trophy_room_highlights_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public final koi.j b(LayeredImage layeredImage, LifestyleSavingsSummary$SavingsHighlight lifestyleSavingsSummary$SavingsHighlight, int i) {
        List listC;
        ResourceImage resourceImage;
        UrlImage urlImage = new UrlImage(lifestyleSavingsSummary$SavingsHighlight.f78056c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
        String str = lifestyleSavingsSummary$SavingsHighlight.f78057g;
        String strN = a0.d.n("HIGHLIGHT_ITEM_ID_PREFIX_", i);
        TextClause textClause = new TextClause(lifestyleSavingsSummary$SavingsHighlight.f78054a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        boolean z = lifestyleSavingsSummary$SavingsHighlight.d;
        Image decoratedImage = !z ? new DecoratedImage(urlImage, v.k(GrayedOutDecoration.f59812a, new AlphaDecoration(0.5f))) : urlImage;
        m4 m4Var = m4.SQUARE;
        LifestyleSavingsSummary$SavingsHighlight.Cta cta2 = lifestyleSavingsSummary$SavingsHighlight.f;
        String str2 = cta2 != null ? cta2.f78058a : null;
        if (str2 != null) {
            TextClause textClause2 = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str3 = cta2.f78059b;
            if (str3 != null) {
                int iA = this.f110640a.a(str3);
                if (iA == 0) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Icon ", str3, " not found"));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                    iA = R$drawable.uikit_icn_24_revolut;
                }
                resourceImage = new ResourceImage(iA, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            } else {
                resourceImage = null;
            }
            listC = u.c(new ActionsView.Item("HIGHLIGHT_ACTION_ITEM_ID", null, false, null, null, textClause2, resourceImage, null, null, null, false, null, null, null, null, 32670));
        } else {
            listC = f0.f322471a;
        }
        BigTileDelegate.Model model = new BigTileDelegate.Model(strN, textClause, layeredImage, null, decoratedImage, null, new o4(new TextClause(lifestyleSavingsSummary$SavingsHighlight.f78055b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), listC, null, str != null || z, false, null, new i(str, i), null, m4Var, null, 66452520);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
