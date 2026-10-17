package hv;

import com.revolut.camerakit.core.errors.CameraKitException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraKitException f155777a;

    public a(CameraKitException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f155777a = exception;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f155777a, ((a) obj2).f155777a);
    }

    public final int hashCode() {
        return this.f155777a.hashCode();
    }
}
