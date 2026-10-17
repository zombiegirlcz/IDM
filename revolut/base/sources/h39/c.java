package h39;

import com.revolut.feature.lifestyle_feed.api.models.LifestyleWidgetContext;
import csh.g;
import dsh.e;
import dsh.i;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements g {
    @Override // csh.g
    public final List a(Class contextClass) {
        Intrinsics.checkNotNullParameter(contextClass, "contextClass");
        return contextClass.equals(LifestyleWidgetContext.class) ? f0.f322471a : f0.f322471a;
    }

    @Override // csh.g
    public final List b(Class cls) {
        if (!cls.equals(LifestyleWidgetContext.class)) {
            return f0.f322471a;
        }
        e.Companion.getClass();
        return u.c(new i("LoyaltyTransactionsDynamic", dsh.d.a()));
    }
}
