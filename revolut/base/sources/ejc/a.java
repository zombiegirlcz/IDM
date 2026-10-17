package ejc;

import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.rewards.impl.R$string;
import dj0.d;
import org.jetbrains.annotations.NotNull;
import sx4.f;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    @NotNull
    public static final C0732a Companion = new C0732a();

    /* JADX INFO: renamed from: ejc.a$a, reason: collision with other inner class name */
    public static final class C0732a {
        private C0732a() {
        }
    }

    public static eii.b a(String str, int i, double d, xi0.b bVar) {
        return new eii.b(new CellDetailsDelegate.Model(str, new t0((Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.rent_and_bills_allowance_details_cell_value_amount_per_month, u.c(f.b(3, null, null, new d(rim.d.d(d), bVar))), null, 12), null, null, null, null, 0, null, false, false, null, null, 30712));
    }
}
