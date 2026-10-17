package dx1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public interface h {
    default boolean a(String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return Intrinsics.f(currency, b().f306286a);
    }

    xi0.b b();

    List c();

    int d();

    TextLocalisedClause e();
}
