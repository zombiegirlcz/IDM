package s00;

import kge.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import xv.p;
import xv.s;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements p {
    public static final /* synthetic */ KProperty[] f = {o0.f186429a.j(new h0(b.class, "revolutQualityValidatorValue", "getRevolutQualityValidatorValue()Lcom/revolut/camerakit/vision_framework/FaceValidator;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f258744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f258745c;
    public final boolean d;
    public final d e;

    public b(d revolutQualityValidator, String validatorInfo, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(revolutQualityValidator, "revolutQualityValidator");
        Intrinsics.checkNotNullParameter(validatorInfo, "validatorInfo");
        this.f258743a = validatorInfo;
        this.f258744b = z;
        this.f258745c = z3;
        this.d = z4;
        this.e = revolutQualityValidator;
    }

    @Override // xv.p
    public final s a() {
        return new r00.a(this.f258743a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // xv.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r25, kotlin.coroutines.Continuation r26, xv.i r27, xv.m r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s00.b.b(java.util.List, kotlin.coroutines.Continuation, xv.i, xv.m):java.lang.Object");
    }
}
