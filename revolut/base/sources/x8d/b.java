package x8d;

import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lde.n;
import x8d.a;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f303315m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Data f303316n;

    public b(n widgetsInteractor) {
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        this.f303315m = widgetsInteractor;
        this.f303316n = new Data(f0.f322471a, null, false, 6, null);
    }

    @Override // cki.a
    public final Object Z2() {
        return this.f303316n;
    }

    @Override // x8d.a
    public final void e3(FaqNodeBase node, NewTicketContext newTicketContext) {
        Intrinsics.checkNotNullParameter(node, "node");
        g3(node);
        Object obj2 = a.AbstractC1686a.b.f303314a;
        if (obj2.equals(obj2)) {
            A2(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqByNode(node, true), new SharedFaqDestination.PassthroughData(newTicketContext, false, false, 6), false, 12));
        } else {
            if (!obj2.equals(a.AbstractC1686a.C1687a.f303313a)) {
                throw new NoWhenBranchMatchedException();
            }
            A2(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.CardsTroubleshooter(node.getF51434a()), new SharedFaqDestination.PassthroughData(newTicketContext, false, false, 6), false, 12));
        }
    }

    @Override // x8d.a
    public final void f3(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        A2(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(key, 6), new SharedFaqDestination.PassthroughData(null, false, false, 6), false, 12));
    }

    @Override // x8d.a
    public final void g3(FaqNodeBase node) {
        Intrinsics.checkNotNullParameter(node, "node");
        String key = node.getF51434a();
        this.f303315m.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
    }
}
