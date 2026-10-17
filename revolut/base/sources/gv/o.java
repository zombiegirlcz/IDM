package gv;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147028b;

    public o(String faceDetectorVersion, String faceCorrectnessVersion) {
        Intrinsics.checkNotNullParameter(faceDetectorVersion, "faceDetectorVersion");
        Intrinsics.checkNotNullParameter(faceCorrectnessVersion, "faceCorrectnessVersion");
        this.f147027a = faceDetectorVersion;
        this.f147028b = faceCorrectnessVersion;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f147027a, oVar.f147027a) && Intrinsics.f(this.f147028b, oVar.f147028b);
    }

    public final int hashCode() {
        return this.f147028b.hashCode() + (this.f147027a.hashCode() * 31);
    }
}
