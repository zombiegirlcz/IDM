package qng;

import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem f247944a;

    public g(WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f247944a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f247944a, ((g) obj2).f247944a);
    }

    public final int hashCode() {
        return this.f247944a.hashCode();
    }
}
