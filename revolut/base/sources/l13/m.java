package l13;

import cli.n;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CustomColors;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import k8d.t;
import kotlin.jvm.internal.Intrinsics;
import kye.l0;
import l0c.s;
import mx0.i1;
import mx0.pc;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements n {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CdnImage f191444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ResourceImage f191445b;

    public static final class a {
        private a() {
        }
    }

    static {
        gz0.b bVar = gz0.b.CenterInside;
        f191444a = new CdnImage("flag_br", "mobile/flags", null, new ImageTransformations(null, null, null, bVar, null, 24, 24, 23), null, null, Constants.TAG_E4_CUSTOMER_DATA);
        f191445b = new ResourceImage(R$drawable.uikit_icn_rounded_background, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, new CustomColors(1, null, new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorForeground), 0.1f)), bVar, null, 40, 40, 19), (Clause) null, 190);
    }

    public static RowDelegate.Model a(String str, Image image, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, boolean z) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Avatar(new AvatarModel.Layered(v.k(f191445b, image), null, com.revolut.core.ui_kit.models.avatar.a.UNCLIPPED, 126), (i1) null, 6), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, null, false, null, false, null, z ? u.c(new pc("limit-reached-tag", new TagViewData(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.card_design_tag_limit_reached, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new Color.Solid(R$attr.uikit_colorShimmer), R$attr.uikit_colorTransparent, null, 1000), null)) : f0.f322471a, null, null, null, null, null, null, 0, 0, 0, 0, 536838104);
    }

    public static h b(g gVar) {
        RowDelegate.Model modelA;
        boolean z = gVar.f191433c;
        boolean z3 = gVar.f191431a;
        CdnImage cdnImage = f191444a;
        if (z) {
            modelA = a("ID_LOCAL_CARD_PICKER_ITEM", cdnImage, new TextLocalisedClause(R$string.card_subtype_picker_combo, null, null, 14), new TextLocalisedClause(R$string.card_subtype_picker_combo_subtitle, null, null, 14), z3);
        } else {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_subtype_picker_local, null, null, 14);
            int i = R$string.card_subtype_picker_local_subtitle;
            xi0.b.Companion.getClass();
            modelA = a("ID_LOCAL_CARD_PICKER_ITEM", cdnImage, textLocalisedClause, new TextLocalisedClause(i, u.c(xi0.b.D.f306286a), null, 12), z3);
        }
        return new h(v.k(modelA, a("ID_GLOBAL_CARD_PICKER_ITEM", new ResourceImage(R$drawable.uikit_icn_24_globe, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.card_subtype_picker_global, null, null, 14), new TextLocalisedClause(gVar.f191433c ? R$string.card_subtype_picker_global_subtitle : R$string.card_subtype_picker_global_without_credit_subtitle, null, null, 14), gVar.f191432b)));
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) iii.c.f(domainState.f191430b, new s(this, 3), new l0(this, 14), new t(this, 17));
    }
}
