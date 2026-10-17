package gv;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class i implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f147013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f147014b;

    public i(k picture, l video) {
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(video, "video");
        this.f147013a = picture;
        this.f147014b = video;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f147013a, iVar.f147013a) && Intrinsics.f(this.f147014b, iVar.f147014b);
    }

    public final int hashCode() {
        return this.f147014b.hashCode() + (this.f147013a.hashCode() * 31);
    }
}
