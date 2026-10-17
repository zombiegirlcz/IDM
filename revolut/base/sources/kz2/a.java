package kz2;

import aii.u;
import com.revolut.feature.card_management.api.cardlimit.CardLimitDestination;
import com.revolut.feature.card_management.impl.cardlimit.flow.CardLimitFlow;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mz2.c;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CardLimitDestination) {
            return new CardLimitFlow(new c(((CardLimitDestination) destination).f64801a));
        }
        return null;
    }
}
