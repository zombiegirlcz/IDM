package gv;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class h implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vw.a f147010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteBuffer f147011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer f147012c;

    public h(vw.a originalImage, ByteBuffer selfieSearchImage, ByteBuffer faceLiveImage) {
        Intrinsics.checkNotNullParameter(originalImage, "originalImage");
        Intrinsics.checkNotNullParameter(selfieSearchImage, "selfieSearchImage");
        Intrinsics.checkNotNullParameter(faceLiveImage, "faceLiveImage");
        this.f147010a = originalImage;
        this.f147011b = selfieSearchImage;
        this.f147012c = faceLiveImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f147010a, hVar.f147010a) && Intrinsics.f(this.f147011b, hVar.f147011b) && Intrinsics.f(this.f147012c, hVar.f147012c);
    }

    public final int hashCode() {
        return this.f147012c.hashCode() + ((this.f147011b.hashCode() + (this.f147010a.hashCode() * 31)) * 31);
    }
}
