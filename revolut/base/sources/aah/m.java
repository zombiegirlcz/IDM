package aah;

import a2f.q;
import a9d.p;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import ip0.ak0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import z0h.q1;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f2835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f2836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f2837c;

    public m(Set appDisclaimerFactories, Set disclaimersFactories, Map comparators) {
        Intrinsics.checkNotNullParameter(appDisclaimerFactories, "appDisclaimerFactories");
        Intrinsics.checkNotNullParameter(disclaimersFactories, "disclaimersFactories");
        Intrinsics.checkNotNullParameter(comparators, "comparators");
        this.f2835a = appDisclaimerFactories;
        this.f2836b = disclaimersFactories;
        this.f2837c = comparators;
    }

    public final List b(Data domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (List) iii.c.f(domainState, new a9h.b(13), new p(3), new q(this, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List c(List disclaimers, hel.b bVar) {
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        CompositeClause compositeClauseA = q1.a(this, disclaimers, bVar);
        if (compositeClauseA == null) {
            return f0.f322471a;
        }
        List listC = u.c(new TextDelegate.Model("WEALTH_DISCLAIMERS_LIST_ID", compositeClauseA, false, new ak0(null, 0 == true ? 1 : 0, 3), null, null, 0, R$attr.uikit_dp8, 0, 0, 1780));
        yp0.b.q(listC, 0, 0, 0, 0, 15);
        return listC;
    }
}
