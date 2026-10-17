package gv;

import com.revolut.camerakit.core.settings.VideoEncodingBitRate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vw.o f147019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f147021c;
    public final String d;
    public final VideoEncodingBitRate e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f147022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f147023h;
    public final vw.m i;

    public l(vw.o payload, int i, int i2, String signature, VideoEncodingBitRate desiredEncodingBitRate, long j2, long j3, String str, vw.m mVar) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(desiredEncodingBitRate, "desiredEncodingBitRate");
        this.f147019a = payload;
        this.f147020b = i;
        this.f147021c = i2;
        this.d = signature;
        this.e = desiredEncodingBitRate;
        this.f = j2;
        this.f147022g = j3;
        this.f147023h = str;
        this.i = mVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f147019a, lVar.f147019a) && this.f147020b == lVar.f147020b && this.f147021c == lVar.f147021c && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && this.f == lVar.f && this.f147022g == lVar.f147022g && Intrinsics.f(this.f147023h, lVar.f147023h) && Intrinsics.f(this.i, lVar.i);
    }

    public final int hashCode() {
        int iC = a0.d.c(a0.d.c((this.e.hashCode() + p.a.c(j6.a.b(this.f147021c, j6.a.b(this.f147020b, this.f147019a.hashCode() * 31, 31), 31), 31, this.d)) * 31, 31, this.f), 31, this.f147022g);
        String str = this.f147023h;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        vw.m mVar = this.i;
        return iHashCode + (mVar != null ? mVar.hashCode() : 0);
    }
}
