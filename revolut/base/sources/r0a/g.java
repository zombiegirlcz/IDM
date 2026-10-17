package r0a;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f250729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f250730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f250731c;
    public final boolean d;
    public final Object e;

    public g(boolean z, Clause sendButtonText, Image image, boolean z3, Clause requestButtonText) {
        Intrinsics.checkNotNullParameter(sendButtonText, "sendButtonText");
        Intrinsics.checkNotNullParameter(requestButtonText, "requestButtonText");
        this.f250729a = z;
        this.f250730b = sendButtonText;
        this.f250731c = image;
        this.d = z3;
        this.e = requestButtonText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f250729a == gVar.f250729a && Intrinsics.f(this.f250730b, gVar.f250730b) && Intrinsics.f(this.f250731c, gVar.f250731c) && this.d == gVar.d && this.e.equals(gVar.e);
    }

    public final int hashCode() {
        int iA = p.a.a(Boolean.hashCode(this.f250729a) * 31, 31, this.f250730b);
        Image image = this.f250731c;
        return this.e.hashCode() + j6.a.c((iA + (image == null ? 0 : image.hashCode())) * 31, 31, this.d);
    }
}
