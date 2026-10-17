package al4;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.s3;
import zh9.u0;

/* JADX INFO: loaded from: classes13.dex */
public interface j {
    static Flow b(j jVar, ll4.c entryPointType) {
        s3 s3Var = (s3) jVar;
        s3Var.getClass();
        Intrinsics.checkNotNullParameter(entryPointType, "entryPointType");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new o4a.b(s3Var, entryPointType, null, 8), u0.m(s3Var.t(entryPointType), s3Var.q(entryPointType)));
    }
}
