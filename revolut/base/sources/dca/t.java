package dca;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.u;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import d7j.o0;
import ip0.c0;
import ip0.i70;
import ip0.s7;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class t implements cli.n {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j8a.a f112847a;

    public t(j8a.a pixKeyFormatter) {
        Intrinsics.checkNotNullParameter(pixKeyFormatter, "pixKeyFormatter");
        this.f112847a = pixKeyFormatter;
    }

    public static List a() {
        List listC = u.c(new FullScreenStateDelegate.Model("RETRY_ID", new TextLocalisedClause(R$string.pix_qr_request_error, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D038A", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R.string.common_action_retry, null, null, 14), false, Integer.valueOf(R$drawable.uikit_icn_24_retry), null, false, 0, 0, 31556));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    public static ArrayList b() {
        List listC = u.c(new i70("LOADING_QR_CODE_ID", null, 6));
        int i = R$attr.uikit_dp32;
        yp0.b.q(listC, 0, 0, i, i, 3);
        List listC2 = u.c(new c0("LOADING_ACTIONS_ID", new u.a(3, true), 0, 0, 60));
        yp0.b.q(listC2, 0, 0, 0, 0, 15);
        ArrayList arrayListE0 = d0.E0(listC2, listC);
        List listK = v.k(new s7("LOADING_DETAILS_ID_1", 0, 0, 0, 0, false, null, 126), new s7("LOADING_DETAILS_ID_2", 0, 0, 0, 0, false, null, 126));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        ArrayList arrayListE02 = d0.E0(listK, arrayListE0);
        List listC3 = zhm.u.c(new s7("LOADING_DETAILS_ID_3", 0, 0, 0, 0, false, null, 126));
        yp0.b.k(listC3, 0, 0, 0, 0, 31);
        return d0.E0(listC3, arrayListE02);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List listB;
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (domainState instanceof g) {
            listB = (List) iii.c.f(((g) domainState).f112827a, new dak.c(this, 11), new o0(this, 23), new cab.m(this, domainState, 19));
        } else {
            if (!Intrinsics.f(domainState, h.f112830a)) {
                throw new NoWhenBranchMatchedException();
            }
            listB = b();
        }
        return new o(listB);
    }
}
