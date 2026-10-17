package e7b;

import cli.j;
import cli.n;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.cobranded.cards.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model.MainImage.Image40 a(int i) {
        return new RowDelegate.Model.MainImage.Image40(new LayeredImage(v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_rounded_background, Integer.valueOf(R$attr.uikit_colorColdBlue), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124), new LayeredImage.Layer.Drawable(i, Integer.valueOf(R$attr.uikit_colorWhite), 8.0f, 8.0f, 8.0f, 8.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64)), (Float) null, (Float) null, 14), null, null, false, null, false, 62);
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new f(v.k(new RowDelegate.Model("list_id_physical_card", a(R$drawable.uikit_icn_24_card), new TextLocalisedClause(R$string.cobrand_card_type_picker_physical_card_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.cobrand_card_type_picker_physical_card_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("list_id_virtual_card", a(R$drawable.uikit_icn_24_smartphone), new TextLocalisedClause(R$string.cobrand_card_type_picker_virtual_card_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.cobrand_card_type_picker_virtual_card_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872)));
    }
}
