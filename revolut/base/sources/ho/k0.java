package ho;

import com.google.protobuf.j3;
import com.google.protobuf.k3;
import com.google.protobuf.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    private k0() {
    }

    public static k3 a(long j2) {
        long j3 = 1000;
        long j5 = j2 / j3;
        long j16 = (j2 % j3) * ((long) 1000000);
        j3 j3VarNewBuilder = k3.newBuilder();
        j3VarNewBuilder.c();
        ((k3) j3VarNewBuilder.f49761b).setSeconds(j5);
        j3VarNewBuilder.c();
        ((k3) j3VarNewBuilder.f49761b).setNanos((int) j16);
        w0 w0VarA = j3VarNewBuilder.a();
        Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
        return (k3) w0VarA;
    }
}
