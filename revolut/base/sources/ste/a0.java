package ste;

import com.revolut.feature.topup_screen.api.descriptor.TopupWithNewCardFlowDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopupWithNewCardFlowDescriptor$InputData f265557a;

    public a0(TopupWithNewCardFlowDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f265557a = inputData;
    }

    public final TopupWithNewCardFlowDescriptor$InputData b() {
        return this.f265557a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f265557a, ((a0) obj2).f265557a);
    }

    public final int hashCode() {
        return this.f265557a.hashCode();
    }
}
