package rk6;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(String str, int i, int i2, LayeredImage layeredImage) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(layeredImage, null, null, false, null, false, 62), new TextLocalisedClause(i, null, null, 14), null, 0, new TextLocalisedClause(i2, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = R$string.open_banking_choose_app_personal_title;
        int i2 = R$string.open_banking_choose_app_personal_subtitle;
        int i3 = R$drawable.uikit_icn_16_revolut;
        Color.Solid solid = new Color.Solid(R$attr.uikit_colorBlack);
        Color.Solid solid2 = new Color.Solid(R$attr.uikit_colorWhite);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        Float fValueOf = Float.valueOf(32.0f);
        List listK = v.k(a("retail_id", i, i2, LayeredImage.Companion.a(companion, i3, solid, solid2, 8.0f, fValueOf, 32)), a("business_id", R$string.open_banking_choose_app_business_title, R$string.open_banking_choose_app_business_subtitle, LayeredImage.Companion.a(companion, R$drawable.uikit_icn_16_revolut, new Color.Solid(R$attr.uikit_colorWhite), new Color.Solid(R$attr.uikit_colorBlack), 8.0f, fValueOf, 32)));
        int i5 = R$attr.uikit_dp16;
        int i6 = R$attr.uikit_dp0;
        yp0.b.o(i5, i6, i6, i6, listK);
        return new cii.b(null, listK, new lw0.a(new TextLocalisedClause(R$string.open_banking_choose_app_title, null, null, 14), null, null, null, false, 30));
    }
}
