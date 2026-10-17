package et6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements gr6.g {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au6.e0 f129306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r80.c f129307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f80.a f129308c;

    public q0(au6.e0 brandingRepository, r80.c imageCompressor, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(brandingRepository, "brandingRepository");
        Intrinsics.checkNotNullParameter(imageCompressor, "imageCompressor");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f129306a = brandingRepository;
        this.f129307b = imageCompressor;
        this.f129308c = uriHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.io.File r13, gim.c r14) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r14 instanceof et6.p0
            if (r0 == 0) goto L13
            r0 = r14
            et6.p0 r0 = (et6.p0) r0
            int r1 = r0.f129296x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129296x = r1
            goto L18
        L13:
            et6.p0 r0 = new et6.p0
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129296x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r14)
            return r14
        L2a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L32:
            au6.e0 r13 = r0.u
            yhm.o.b(r14)
            goto L94
        L38:
            yhm.o.b(r14)
            java.lang.String r14 = r13.getPath()
            java.lang.String r2 = "getPath(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r2)
            f80.a r2 = r12.f129308c
            f80.b r2 = (f80.b) r2
            com.revolut.core.model.FileExtension r14 = r2.c(r14)
            com.revolut.core.model.FileExtension$Jpg r2 = com.revolut.core.model.FileExtension.Jpg.f51404b
            boolean r2 = r14.equals(r2)
            if (r2 != 0) goto L63
            com.revolut.core.model.FileExtension$Png r2 = com.revolut.core.model.FileExtension.Png.f51407b
            boolean r14 = r14.equals(r2)
            if (r14 == 0) goto L5d
            goto L63
        L5d:
            com.revolut.feature.shared.branding.api.InvalidImageException r13 = new com.revolut.feature.shared.branding.api.InvalidImageException
            r13.<init>()
            throw r13
        L63:
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.JPEG
            r80.c r7 = r12.f129307b
            java.lang.String r14 = "sourceFile"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r14)
            r80.a r5 = new r80.a
            r8 = 720(0x2d0, float:1.009E-42)
            r10 = 70
            r6 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            ufm.c r13 = new ufm.c
            r13.<init>(r5, r3)
            java.lang.String r14 = "fromCallable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r14)
            ufm.n r13 = te0.w.i0(r13)
            au6.e0 r14 = r12.f129306a
            r0.u = r14
            r0.f129296x = r4
            java.lang.Object r13 = nim.a.b(r13, r0)
            if (r13 != r1) goto L91
            goto Lb4
        L91:
            r11 = r14
            r14 = r13
            r13 = r11
        L94:
            java.lang.String r2 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r2)
            java.io.File r14 = (java.io.File) r14
            r2 = 0
            r0.u = r2
            r0.f129296x = r3
            r13.getClass()
            ald.l r3 = new ald.l
            r4 = 19
            r3.<init>(r13, r14, r2, r4)
            skm.p0 r13 = skm.p0.f264001a
            elm.f r13 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r13, r3, r0)
            if (r13 != r1) goto Lb5
        Lb4:
            return r1
        Lb5:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.q0.a(java.io.File, gim.c):java.lang.Object");
    }
}
