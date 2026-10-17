package o97;

import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aii.e f223088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModalDestination.Style f223089b;

    public b(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ModalDestination.Style.FULLSCREEN_FADE style = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
        Intrinsics.checkNotNullParameter(style, "style");
        this.f223088a = descriptor;
        this.f223089b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f223088a, bVar.f223088a) && Intrinsics.f(this.f223089b, bVar.f223089b);
    }

    public final int hashCode() {
        return this.f223089b.hashCode() + (this.f223088a.hashCode() * 31);
    }
}
