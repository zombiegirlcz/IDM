package ju0;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UrlImage f178557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f178558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f178559c;

    public g(long j2, UrlImage image, boolean z) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f178557a = image;
        this.f178558b = j2;
        this.f178559c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f178557a.equals(gVar.f178557a) && kotlin.time.b.d(this.f178558b, gVar.f178558b) && this.f178559c == gVar.f178559c;
    }

    public final int hashCode() {
        int iHashCode = this.f178557a.hashCode() * 31;
        b.Companion companion = kotlin.time.b.INSTANCE;
        return Boolean.hashCode(this.f178559c) + a0.d.c(iHashCode, 31, this.f178558b);
    }
}
