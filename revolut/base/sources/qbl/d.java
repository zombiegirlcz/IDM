package qbl;

import com.revolut.shared.feature.user_declarations.api.navigation.AddressSuggestionControllerDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddressSuggestionControllerDescriptor$InputData f244375a;

    public d(AddressSuggestionControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f244375a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f244375a, ((d) obj2).f244375a);
    }

    public final int hashCode() {
        return this.f244375a.hashCode();
    }
}
