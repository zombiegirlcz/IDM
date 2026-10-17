package kv;

import com.revolut.camerakit.core.errors.CameraCaptureException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraCaptureException f189887a;

    public c(CameraCaptureException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f189887a = exception;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f189887a.equals(((c) obj2).f189887a);
    }

    public final int hashCode() {
        return this.f189887a.hashCode();
    }
}
