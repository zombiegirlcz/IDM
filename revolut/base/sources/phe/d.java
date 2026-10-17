package phe;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f236286a = new d();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List items = (List) obj2;
        Intrinsics.checkNotNullParameter(items, "items");
        return u.c(new ohe.b(TotalWealthCategoryKey.Joint.INSTANCE, items, (Clause) null, 12));
    }
}
