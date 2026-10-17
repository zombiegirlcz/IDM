package o2e;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.ej;
import mx0.c7;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    @NotNull
    public static final C1232a Companion = new C1232a();

    /* JADX INFO: renamed from: o2e.a$a, reason: collision with other inner class name */
    public static final class C1232a {
        private C1232a() {
        }
    }

    public static ej a(Clause clause) {
        if (clause == null) {
            return null;
        }
        ej ejVar = new ej("STORE_BRAND_DETAIL_TERMS_LIST_ID", new c7(clause, false, null, 6));
        int i = R$attr.uikit_dp72;
        int i2 = R$attr.uikit_dp32;
        yp0.b.r(ejVar, 0, i, i2, i2, 1);
        return ejVar;
    }
}
