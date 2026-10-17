package qng;

import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f247941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem f247942b;

    public e(List items, WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem addressSuggestionItem) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f247941a = items;
        this.f247942b = addressSuggestionItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f247941a, eVar.f247941a) && Intrinsics.f(this.f247942b, eVar.f247942b);
    }

    public final int hashCode() {
        int iHashCode = this.f247941a.hashCode() * 31;
        WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem addressSuggestionItem = this.f247942b;
        return iHashCode + (addressSuggestionItem == null ? 0 : addressSuggestionItem.hashCode());
    }
}
