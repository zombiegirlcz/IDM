package zki;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f323049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlowStep f323050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f323051c;
    public final ModalDestination.Style d;
    public final boolean e;

    public c(int i, FlowStep step, com.revolut.kompot.navigable.a controller, ModalDestination.Style style, boolean z) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f323049a = i;
        this.f323050b = step;
        this.f323051c = controller;
        this.d = style;
        this.e = z;
    }
}
