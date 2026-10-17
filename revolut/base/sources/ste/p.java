package ste;

import com.revolut.feature.topup_screen.api.descriptor.GooglePayFlowDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GooglePayFlowDescriptor$InputData f265569a;

    public p(GooglePayFlowDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f265569a = inputData;
    }

    public final GooglePayFlowDescriptor$InputData b() {
        return this.f265569a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f265569a, ((p) obj2).f265569a);
    }

    public final int hashCode() {
        return this.f265569a.hashCode();
    }
}
