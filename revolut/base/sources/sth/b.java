package sth;

import cli.j;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkflowScreenConfiguration f265598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f265599c;

    public b(String workflowId, WorkflowScreenConfiguration screenConfiguration, int i) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
        this.f265597a = workflowId;
        this.f265598b = screenConfiguration;
        this.f265599c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f265597a, bVar.f265597a) && Intrinsics.f(this.f265598b, bVar.f265598b) && this.f265599c == bVar.f265599c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f265599c) + ((this.f265598b.hashCode() + (this.f265597a.hashCode() * 31)) * 31);
    }
}
