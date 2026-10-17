package al4;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.s3;

/* JADX INFO: loaded from: classes13.dex */
public interface p extends qx4.i, j {
    static Flow a(p pVar) {
        s3 s3Var = (s3) pVar;
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.q(nim.a.v(s3Var.l().i(w4l.h.f294642c), new ok7.c(s3Var, 12)));
    }
}
