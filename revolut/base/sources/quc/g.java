package quc;

import cli.y;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qu4.s;
import wtc.u;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends oki.h implements d {

    @NotNull
    private static final f Companion = new f();
    public final u o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f249347p;

    public g(i stateMapper, u securityHubChecklistInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(securityHubChecklistInteractor, "securityHubChecklistInteractor");
        this.o = securityHubChecklistInteractor;
        this.f249347p = mra.d.b(this, c.f249345a, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, mo3.a.g(this.o.f299909a.d.b(Unit.f186387a, w4l.h.f294642c), null, null, 3), null, null, new s(this, (Continuation) null, 2), 3);
    }

    public final void I2(String str) {
        C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(str, 14), (SharedFaqDestination.PassthroughData) null, false, 14));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f249347p;
    }
}
