package mx4;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210168a;

    public c(String buttonTitle) {
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f210168a = buttonTitle;
    }

    @Override // mx4.b
    public final boolean a() {
        return false;
    }

    @Override // mx4.b
    public final RowDelegate.Model.c b() {
        return new pf(new TextLocalisedClause(R$string.credit_application_constructor_action_cell_button_title, zhm.u.c(new TextClause(this.f210168a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, false, null, null, 508);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f210168a, ((c) obj2).f210168a);
    }

    public final int hashCode() {
        return this.f210168a.hashCode();
    }
}
