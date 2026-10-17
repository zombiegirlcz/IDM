package jme;

import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.airtip.AirTipDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jnc.k;
import jq4.j;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import zhm.f0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176611a;

    public /* synthetic */ f(int i) {
        this.f176611a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        switch (this.f176611a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 1:
                ((Boolean) obj2).getClass();
                return 0;
            case 2:
                Throwable error = (Throwable) obj2;
                Integer num = (Integer) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (num == null) {
                    return error;
                }
                return null;
            case 3:
                Function1 defaultItems = (Function1) data;
                Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
                return new jnb.h((List) defaultItems.invoke(new iii.d(14, null, true, false, null)), jnb.d.f176671a);
            case 4:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return k.f176696a;
            case 5:
                Function1 getDefaultErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null));
            case 6:
                Throwable error2 = (Throwable) obj2;
                Pair pair = (Pair) data;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (pair == null) {
                    return error2;
                }
                return null;
            case 7:
                Throwable th10 = (Throwable) obj2;
                Function1 getDefaultErrorItems2 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                if (th10 != null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                }
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null));
            case 8:
                Function1 getDefaultErrorItems3 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null));
            case 9:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 10:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof AirTipDelegate.Model);
            case 11:
                Function1 getDefaultErrorItems4 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                aim.e eVarB = u.b();
                eVarB.add(jpl.f.b());
                eVarB.addAll((Collection) getDefaultErrorItems4.invoke(new iii.d(12, null, false, true, null)));
                return u.a(eVarB);
            case 12:
                Throwable error3 = (Throwable) obj2;
                List list = (List) data;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list == null) {
                    return error3;
                }
                return null;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_cashback_cashback, null, null, 14);
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                f0 f0Var = f0.f322471a;
                j jVar = new j(textLocalisedClause, null, resourceImage, f0Var, f0Var);
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("id_error", new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R.string.error_network_connection_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32624);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return new jq4.k(jVar, u.c(model));
            case 14:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 15:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                boolean zA = tj0.a.a((Throwable) obj2);
                return new jqg.f(new FullScreenStateDelegate.Model("vault_terms_viewer_error", new TextLocalisedClause(zA ? com.revolut.kompot.common.R$string.common_offline_state_title : com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), zA ? new TextLocalisedClause(com.revolut.kompot.common.R$string.common_offline_state_description, null, null, 14) : null, new ComplexImage.Regular(zA ? new GlyphImage(R$drawable.uikit_icn_24_communication, null, null, 6) : com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), new l6(12, new TextLocalisedClause(zA ? com.revolut.kompot.common.R$string.common_offline_state_action : com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), null, h4.ACCENT), null, false, null, null, null, YearClass.CLASS_2016));
            case 16:
                int iIntValue = ((Integer) obj2).intValue();
                int numericValue = Character.getNumericValue(((Character) data).charValue());
                if (iIntValue % 2 != 0) {
                    numericValue = numericValue < 5 ? numericValue * 2 : (numericValue * 2) - 9;
                }
                return Integer.valueOf(numericValue);
            case 17:
                Function1 getDefaultErrorItems5 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return new js4.h((List) getDefaultErrorItems5.invoke(new iii.d(14, null, true, false, null)), new js4.g(new TextLocalisedClause(R$string.credit_card_instalment_edit_quote_action_confirm, null, null, 14), false, false));
            case 18:
                Function1 getErrorItems = (Function1) data;
                Intrinsics.checkNotNullParameter(getErrorItems, "getErrorItems");
                return (List) getErrorItems.invoke(new iii.d(14, null, false, false, null));
            case 19:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return Boolean.FALSE;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            case 22:
                Function1 getDefaultErrorItems6 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return (List) getDefaultErrorItems6.invoke(new iii.d(14, null, true, false, null));
            case 23:
                Function1 getDefaultErrorItems7 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                return new jt4.c(null, (List) getDefaultErrorItems7.invoke(new iii.d(14, null, true, false, null)), null);
            case 24:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 25:
                Function1 getDefaultErrorItems8 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems8, "getDefaultErrorItems");
                return new ju4.j((List) getDefaultErrorItems8.invoke(new iii.d(14, null, true, false, null)), ju4.g.f178583a);
            case 26:
                Function1 getDefaultErrorItems9 = (Function1) data;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems9, "getDefaultErrorItems");
                return (List) getDefaultErrorItems9.invoke(new iii.d(12, null, true, true, null));
            case 27:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return f0.f322471a;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                return null;
            default:
                Intrinsics.checkNotNullParameter((Function1) data, "<unused var>");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
        }
    }

    public /* synthetic */ f(Object obj2, int i) {
        this.f176611a = i;
    }
}
