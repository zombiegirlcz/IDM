package ste;

import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardDetailsScreenDescriptor$InputData f265558a;

    public c(CardDetailsScreenDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f265558a = inputData;
    }

    public final CardDetailsScreenDescriptor$InputData b() {
        return this.f265558a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f265558a, ((c) obj2).f265558a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f265558a.f90483a);
    }
}
