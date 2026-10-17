package pf4;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ShimmerImage;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.OfferContentScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mx4.z f235432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OfferContentScreenContract$InputData f235433b;

    public b(mx4.z creditScreenConstructorMapper, ae4.a screenHeaderTagMapper, OfferContentScreenContract$InputData inputData, q74.b creditNavigationIconMapper) {
        Intrinsics.checkNotNullParameter(creditScreenConstructorMapper, "creditScreenConstructorMapper");
        Intrinsics.checkNotNullParameter(screenHeaderTagMapper, "screenHeaderTagMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditNavigationIconMapper, "creditNavigationIconMapper");
        this.f235432a = creditScreenConstructorMapper;
        this.f235433b = inputData;
    }

    public static List d(cv3.w wVar) {
        return wVar == null ? f0.f322471a : zhm.u.c(new TextNavBarMenuItem(wVar.f109274b.f120542a, new TextLocalisedClause(R$string.credit_application_manual_input_title_value, zhm.u.c(wVar.f109273a), null, 12), null, null, 12));
    }

    public static TextLocalisedClause e(String str) {
        return new TextLocalisedClause(R$string.credit_application_offer_title, zhm.u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }

    public final s a() {
        ResourceImage resourceImageA = q74.b.a(this.f235433b.f68136g);
        m70.a.c(t0.f186434a);
        return new s(resourceImageA, e(""), null, ShimmerImage.f60002a, null, f0.f322471a);
    }

    public final p b() {
        ResourceImage resourceImageA = q74.b.a(this.f235433b.f68136g);
        m70.a.c(t0.f186434a);
        return new p(resourceImageA, e(""), null, null, null, null, f0.f322471a);
    }

    public final List c(cv3.s offerContent, ax4.b constructorState) {
        Intrinsics.checkNotNullParameter(offerContent, "offerContent");
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        ArrayList arrayList = offerContent.f109268b;
        mx4.z zVar = this.f235432a;
        ArrayList arrayListB = zVar.b(arrayList, constructorState);
        String str = offerContent.f109269c;
        return i2b.a.o(arrayListB, zhm.v.l(str != null ? zVar.a(str) : null));
    }
}
