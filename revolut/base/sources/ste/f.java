package ste;

import com.revolut.feature.topup_screen.api.descriptor.EditStoredMethodLabelDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditStoredMethodLabelDescriptor$InputData f265561a;

    public f(EditStoredMethodLabelDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f265561a = inputData;
    }

    public final EditStoredMethodLabelDescriptor$InputData b() {
        return this.f265561a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f265561a, ((f) obj2).f265561a);
    }

    public final int hashCode() {
        return this.f265561a.hashCode();
    }
}
