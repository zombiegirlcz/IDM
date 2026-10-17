package ea4;

import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.summary.SummaryScreenContract$InputData;
import ht3.l0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends oki.h implements r {

    @NotNull
    private static final t Companion = new t();
    public final SummaryScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jw3.a f124144p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f124145q;

    public u(SummaryScreenContract$InputData inputData, jw3.a interactor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f124144p = interactor;
        this.f124145q = mra.d.b(this, new f(0), stateMapper, null, false, 12);
    }

    public final void I2(l event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof g;
        m mVar = m.f124136a;
        if (z) {
            C2(mVar);
            return;
        }
        if (event instanceof j) {
            C2(mVar);
            return;
        }
        if (event instanceof k) {
            Object obj2 = ((k) event).f124135a.d;
            if (obj2 instanceof l0) {
                C2(new o((l0) obj2));
                return;
            }
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "SummaryScreenModel", "Unsupported event type: ".concat(k.class.getSimpleName()), null, h0Var);
            return;
        }
        if (!(event instanceof i)) {
            if (!(event instanceof h)) {
                throw new NoWhenBranchMatchedException();
            }
            C2(new p(((f) ((j2) this.f124145q.f22677a).getValue()).f124130a));
            return;
        }
        Object obj3 = ((i) event).f124133a.u;
        if (obj3 instanceof ny3.m) {
            C2(new n(((ny3.m) obj3).f220648a));
            return;
        }
        h0 h0Var2 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "SummaryScreenModel", "Unsupported event type: ".concat(i.class.getSimpleName()), null, h0Var2);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, this.f124144p.a(this.o.f67596a), null, new d(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f124145q;
    }
}
