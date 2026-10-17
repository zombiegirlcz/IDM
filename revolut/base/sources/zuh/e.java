package zuh;

import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkflowName f325469a;

    public e(WorkflowName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f325469a = name;
    }

    public final WorkflowName a() {
        return this.f325469a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f325469a, ((e) obj2).f325469a);
    }

    public final int hashCode() {
        return this.f325469a.f105667a.hashCode();
    }
}
