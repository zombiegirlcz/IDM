package qz7;

import com.revolut.core.ui_kit_resources.R$attr;
import ip0.gu;
import ip0.u20;
import ip0.w20;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import yp0.b;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    @NotNull
    public static final C1377a Companion = new C1377a();

    /* JADX INFO: renamed from: qz7.a$a, reason: collision with other inner class name */
    public static final class C1377a {
        private C1377a() {
        }
    }

    public static List a() {
        gu guVar = new gu("LOADING_SUBHEADER_ITEM", 0, R$attr.uikit_dp12, 26);
        w20 w20Var = w20.PICTURE_80DP;
        u20 u20Var = new u20("LOADING_ROW_ITEM_1", w20Var);
        b.l(u20Var, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
        u20 u20Var2 = new u20("LOADING_ROW_ITEM_2", w20Var);
        b.l(u20Var2, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
        return v.k(guVar, u20Var, u20Var2);
    }
}
