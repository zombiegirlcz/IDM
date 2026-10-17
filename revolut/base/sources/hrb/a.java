package hrb;

import aw0.s;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.tips.R$string;
import hl7.ma;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements wse.a {

    @NotNull
    public static final C0886a Companion = new C0886a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f154804a = j.b(new ma(17));

    /* JADX INFO: renamed from: hrb.a$a, reason: collision with other inner class name */
    public static final class C0886a {
        private C0886a() {
        }
    }

    @Override // wse.a
    public final AppTipUIModel a(cte.a appTip) {
        Intrinsics.checkNotNullParameter(appTip, "appTip");
        return new AppTipUIModel("cryptoReceiveXrp", null, new TextLocalisedClause(R$string.retail_tips_crypto_receive_tag_title, null, null, 14), new TextLocalisedClause(R$string.retail_tips_crypto_receive_tag_subtitle, null, null, 14), new s(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_warning, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 10.0f, Float.valueOf(20.0f), null, 32)), null, null, new wse.b(), 738);
    }

    @Override // wse.a
    public final void b(cte.a appTip) {
        Intrinsics.checkNotNullParameter(appTip, "appTip");
    }

    @Override // wse.a
    public final cte.a c() {
        return (cte.a) this.f154804a.getValue();
    }
}
