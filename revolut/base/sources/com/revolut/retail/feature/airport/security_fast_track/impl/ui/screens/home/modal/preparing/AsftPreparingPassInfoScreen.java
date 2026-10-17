package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.modal.preparing;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lw0.c;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/home/modal/preparing/AsftPreparingPassInfoScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Laii/q;", "<init>", "()V", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AsftPreparingPassInfoScreen extends SimpleViewController<q> {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(AsftPreparingPassInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final int N = R$layout.screen_recycler_navbar_bottomsheet;
    public final h O = s.t(this, a.f);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, n.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return n.a(p0);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.asft_home_preparing_pass_title, null, null, 14), new TextLocalisedClause(R$string.asft_home_preparing_pass_subtitle, null, null, 14), new c(new GlyphImage(R$drawable.uikit_icn_24_time, null, null, 6)), null, false, 24));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }
}
