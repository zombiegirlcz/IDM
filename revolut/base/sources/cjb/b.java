package cjb;

import com.revolut.feature.retail.savings.api.documents.navigation.SavingsAccountsSelectionControllerDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsAccountsSelectionControllerDescriptor$InputData f24631a;

    public b(SavingsAccountsSelectionControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f24631a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f24631a, ((b) obj2).f24631a);
    }

    public final int hashCode() {
        return this.f24631a.hashCode();
    }
}
