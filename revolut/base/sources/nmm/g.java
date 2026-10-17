package nmm;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import mmm.s0;
import mmm.v;

/* JADX INFO: loaded from: classes14.dex */
public final class g extends v {
    public final long d;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f217406g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(s0 delegate, long j2, boolean z) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.d = j2;
        this.f = z;
    }

    @Override // mmm.v, mmm.s0
    public final long read(mmm.h sink, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j3 = this.f217406g;
        long j5 = this.d;
        if (j3 > j5) {
            j2 = 0;
        } else if (this.f) {
            long j16 = j5 - j3;
            if (j16 == 0) {
                return -1L;
            }
            j2 = Math.min(j2, j16);
        }
        long j22 = super.read(sink, j2);
        if (j22 != -1) {
            this.f217406g += j22;
        }
        long j42 = this.f217406g;
        if ((j42 >= j5 || j22 != -1) && j42 <= j5) {
            return j22;
        }
        if (j22 > 0 && j42 > j5) {
            long j46 = sink.f207266b - (j42 - j5);
            mmm.h hVar = new mmm.h();
            hVar.R8(sink);
            sink.write(hVar, j46);
            hVar.f();
        }
        StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j5, "expected ", " bytes but got ");
        sbV.append(this.f217406g);
        throw new IOException(sbV.toString());
    }
}
