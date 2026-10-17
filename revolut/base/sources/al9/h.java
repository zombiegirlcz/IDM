package al9;

import com.revolut.feature.pay_with_photo.api.PayWithPhotoPreviewControllerDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayWithPhotoPreviewControllerDescriptor$InputData f6169a;

    public h(PayWithPhotoPreviewControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f6169a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f6169a, ((h) obj2).f6169a);
    }

    public final int hashCode() {
        return this.f6169a.hashCode();
    }
}
