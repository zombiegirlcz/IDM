package g5k;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.management.impl.R$string;
import d2k.i;
import ip0.zj;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ms0.h4;
import ox0.b0;
import whf.p;
import zhm.f0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140806a;

    public /* synthetic */ f(int i) {
        this.f140806a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Throwable {
        switch (this.f140806a) {
            case 0:
                Throwable error = (Throwable) obj2;
                i iVar = (i) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (iVar == null) {
                    return error;
                }
                return null;
            case 1:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 2:
                Throwable error2 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list == null) {
                    return error2;
                }
                return null;
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 4:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 5:
                ((Boolean) obj2).booleanValue();
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 6:
                Throwable error3 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error3, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error3, h0Var);
                return null;
            case 7:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return hx7.a.p(getDefaultErrorItems2);
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 9:
                return null;
            case 10:
                return null;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 12:
                Throwable error4 = (Throwable) obj2;
                e7l.f fVar = (e7l.f) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (fVar == null) {
                    return error4;
                }
                return null;
            case 13:
                Throwable error5 = (Throwable) obj2;
                Set set = (Set) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (set == null) {
                    return error5;
                }
                return null;
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                List listC = u.c(new FullScreenStateDelegate.Model("ID_PREFERENCES_LOADING_ERROR", new TextLocalisedClause(R$string.revolut_pay_management_home_error_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), new l6(12, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_offline_state_action, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1860));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return listC;
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 17:
                Throwable error6 = (Throwable) obj2;
                p pVar = (p) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (pVar == null) {
                    return error6;
                }
                return null;
            case 18:
                Throwable th10 = (Throwable) obj3;
                if (((Boolean) obj2).booleanValue() || th10 == null) {
                    return null;
                }
                throw th10;
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new aw0.e(false, null, b0.ABOVE_BUTTONS, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 51);
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return u.c(new FullScreenStateDelegate.Model("WEALTH_DISCLAIMER_ERROR_LIST_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_disclaimers_error_message, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), new l6(12, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), null, h4.ACCENT), null, false, d1h.i.f110650a, null, null, 1764));
            case 21:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null));
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 26:
                return new ReferralContactDelegate.Model(a0.d.n("RECENT_CONTACT_STUB_", ((Integer) obj2).intValue()), LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_profile, Integer.valueOf(R$attr.uikit_colorBackground), ((Integer) obj3).intValue(), 11.0f, Float.valueOf(34.0f), null, 32), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, null, null, null, null, 522232);
            case 27:
                List dto = (List) obj3;
                Intrinsics.checkNotNullParameter((gcc.e) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(dto, "dto");
                return dto;
            case 28:
                List dto2 = (List) obj3;
                Intrinsics.checkNotNullParameter((gcc.e) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(dto2, "dto");
                return dto2;
            default:
                ((Boolean) obj2).getClass();
                return new fcc.f(((Boolean) obj3).booleanValue());
        }
    }
}
