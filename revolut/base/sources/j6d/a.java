package j6d;

import aii.e;
import com.revolut.feature.shared.branding.api.destination.BrandingSharedDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BrandingSharedDescriptor$InputData f171736a;

    public a(BrandingSharedDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f171736a = inputData;
    }

    public final BrandingSharedDescriptor$InputData b() {
        return this.f171736a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f171736a, ((a) obj2).f171736a);
    }

    public final int hashCode() {
        return this.f171736a.f86063a.hashCode();
    }
}
