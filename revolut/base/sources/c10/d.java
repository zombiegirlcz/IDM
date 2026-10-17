package c10;

import com.revolut.camerakit.vision_framework.generated.FaceExtractorWrapper;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import skm.p0;

/* JADX INFO: loaded from: classes16.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FaceExtractorWrapper f20310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineDispatcher f20311b;

    public d(FaceExtractorWrapper faceExtractorNative) {
        elm.g dispatcher = p0.f264002b;
        Intrinsics.checkNotNullParameter(faceExtractorNative, "faceExtractorNative");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f20310a = faceExtractorNative;
        this.f20311b = dispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(e10.p r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof c10.c
            if (r0 == 0) goto L13
            r0 = r7
            c10.c r0 = (c10.c) r0
            int r1 = r0.f20309w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20309w = r1
            goto L18
        L13:
            c10.c r0 = new c10.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f20309w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            btd.e r7 = new btd.e
            r2 = 27
            r4 = 0
            r7.<init>(r5, r6, r4, r2)
            r0.f20309w = r3
            kotlinx.coroutines.CoroutineDispatcher r6 = r5.f20311b
            java.lang.Object r7 = skm.e0.J(r6, r7, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            java.lang.String r6 = "withContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c10.d.a(e10.p, gim.c):java.lang.Object");
    }
}
