package obi;

import com.revolut.feature_retail_user_declarations.identity_declarations.IdentityDeclarationsFlowInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentityDeclarationsFlowInputData f223959a;

    public c(IdentityDeclarationsFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f223959a = inputData;
    }

    public final IdentityDeclarationsFlowInputData b() {
        return this.f223959a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f223959a, ((c) obj2).f223959a);
    }

    public final int hashCode() {
        return this.f223959a.hashCode();
    }
}
