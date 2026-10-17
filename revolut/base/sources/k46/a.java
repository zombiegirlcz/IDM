package k46;

import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;
import rhf.e;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f180836a;

    public a(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ModalDestination.Style.FullscreenPaged style = ModalDestination.Style.FullscreenPaged.f98310a;
        Intrinsics.checkNotNullParameter(style, "style");
        this.f180836a = descriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a) || !this.f180836a.equals(((a) obj2).f180836a)) {
            return false;
        }
        Object obj3 = ModalDestination.Style.FullscreenPaged.f98310a;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return ModalDestination.Style.FullscreenPaged.f98310a.hashCode() + (this.f180836a.hashCode() * 31);
    }
}
