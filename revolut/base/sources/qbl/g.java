package qbl;

import com.revolut.shared.feature.user_declarations.api.navigation.PepFlowControllerDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PepFlowControllerDescriptor$InputData f244378a;

    public g(PepFlowControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f244378a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f244378a, ((g) obj2).f244378a);
    }

    public final int hashCode() {
        return this.f244378a.hashCode();
    }
}
