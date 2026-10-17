package gv;

import com.revolut.camerakit.core.camerax.extras.model.ResultInternal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv.l f147024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rz.a f147025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f147026c;
    public final e d;
    public final ResultInternal e;

    public n(xv.l detectorResult, rz.a cameraKitViewMetadata, d flashState, e captureReason, ResultInternal resultInternal) {
        Intrinsics.checkNotNullParameter(detectorResult, "detectorResult");
        Intrinsics.checkNotNullParameter(cameraKitViewMetadata, "cameraKitViewMetadata");
        Intrinsics.checkNotNullParameter(flashState, "flashState");
        Intrinsics.checkNotNullParameter(captureReason, "captureReason");
        this.f147024a = detectorResult;
        this.f147025b = cameraKitViewMetadata;
        this.f147026c = flashState;
        this.d = captureReason;
        this.e = resultInternal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f147024a, nVar.f147024a) && Intrinsics.f(this.f147025b, nVar.f147025b) && Intrinsics.f(this.f147026c, nVar.f147026c) && this.d == nVar.d && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f147026c.hashCode() + ((this.f147025b.hashCode() + (this.f147024a.hashCode() * 31)) * 31)) * 31)) * 31;
        ResultInternal resultInternal = this.e;
        return iHashCode + (resultInternal == null ? 0 : resultInternal.hashCode());
    }
}
