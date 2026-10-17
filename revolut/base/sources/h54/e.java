package h54;

import com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditApplicationFlowContract$Step f149459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ModalDestination.Style f149460c;

    public e(CreditApplicationFlowContract$Step step, ModalDestination.Style style) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f149459b = step;
        this.f149460c = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f149459b, eVar.f149459b) && Intrinsics.f(this.f149460c, eVar.f149460c);
    }

    public final int hashCode() {
        return this.f149460c.hashCode() + (this.f149459b.hashCode() * 31);
    }
}
