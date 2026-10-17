package dt5;

import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aii.e f117385a;

    public b(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ModalDestination.Style.FullscreenPaged style = ModalDestination.Style.FullscreenPaged.f98310a;
        Intrinsics.checkNotNullParameter(style, "style");
        this.f117385a = descriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b) || !this.f117385a.equals(((b) obj2).f117385a)) {
            return false;
        }
        Object obj3 = ModalDestination.Style.FullscreenPaged.f98310a;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return ModalDestination.Style.FullscreenPaged.f98310a.hashCode() + (this.f117385a.hashCode() * 31);
    }
}
