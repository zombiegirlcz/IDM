package zng;

import bog.u;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f323819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f323820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f323821c;
    public final pbl.b d;
    public final pbl.a e;
    public final WorkflowScreenConfiguration f;

    public g(u layout, wi0.b country, boolean z, pbl.b screenMode, pbl.a aVar, WorkflowScreenConfiguration workflowScreenConfiguration) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(screenMode, "screenMode");
        this.f323819a = layout;
        this.f323820b = country;
        this.f323821c = z;
        this.d = screenMode;
        this.e = aVar;
        this.f = workflowScreenConfiguration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f323819a, gVar.f323819a) && Intrinsics.f(this.f323820b, gVar.f323820b) && this.f323821c == gVar.f323821c && this.d == gVar.d && this.e == gVar.e && Intrinsics.f(this.f, gVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + j6.a.c(p.a.c(this.f323819a.hashCode() * 31, 31, this.f323820b.f297794a), 31, this.f323821c)) * 31;
        pbl.a aVar = this.e;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        WorkflowScreenConfiguration workflowScreenConfiguration = this.f;
        return iHashCode2 + (workflowScreenConfiguration != null ? workflowScreenConfiguration.hashCode() : 0);
    }
}
