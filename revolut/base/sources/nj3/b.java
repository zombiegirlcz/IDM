package nj3;

import g80.c;
import kotlin.jvm.internal.Intrinsics;
import qz0.j;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f216352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lx0.j f216353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f216354c;
    public final z70.a d;

    public b(j urlImagesRepository, lx0.j videoPreloader, c urlHelper, z70.a contextProvider) {
        Intrinsics.checkNotNullParameter(urlImagesRepository, "urlImagesRepository");
        Intrinsics.checkNotNullParameter(videoPreloader, "videoPreloader");
        Intrinsics.checkNotNullParameter(urlHelper, "urlHelper");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.f216352a = urlImagesRepository;
        this.f216353b = videoPreloader;
        this.f216354c = urlHelper;
        this.d = contextProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(nj3.b r22, hj3.b r23, fj3.f r24, mtj.i r25) {
        /*
            r0 = r22
            r1 = r23
            r2 = r25
            fj3.e r3 = fj3.f.Companion
            z70.a r4 = r0.d
            android.content.Context r4 = r4.getContext()
            r3.getClass()
            java.lang.String r3 = "<this>"
            r5 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            int[] r3 = fj3.d.f135524a
            int r5 = r5.ordinal()
            r3 = r3[r5]
            r5 = 1
            if (r3 == r5) goto L43
            r5 = 2
            if (r3 == r5) goto L40
            r5 = 3
            if (r3 != r5) goto L3a
            boolean r3 = fj3.e.a(r4)
            if (r3 == 0) goto L37
            ix0.j1 r3 = ix0.j1.NIGHT
            goto L45
        L37:
            ix0.j1 r3 = ix0.j1.DAY
            goto L45
        L3a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L40:
            ix0.j1 r3 = ix0.j1.DAY
            goto L45
        L43:
            ix0.j1 r3 = ix0.j1.NIGHT
        L45:
            ix0.j1 r4 = ix0.j1.NIGHT
            if (r3 != r4) goto L4d
            java.lang.String r1 = r1.f152656b
        L4b:
            r4 = r1
            goto L55
        L4d:
            java.lang.String r3 = r1.f152655a
            if (r3 != 0) goto L54
            java.lang.String r1 = r1.f152656b
            goto L4b
        L54:
            r4 = r3
        L55:
            g80.c r1 = r0.f216354c
            g80.a r1 = (g80.a) r1
            java.lang.String r1 = r1.a(r4)
            r3 = 0
            if (r1 == 0) goto L67
            java.lang.String r5 = "video"
            boolean r1 = kotlin.text.d0.J(r1, r5, r3)
            goto L68
        L67:
            r1 = r3
        L68:
            if (r1 == 0) goto L7c
            lx0.j r0 = r0.f216353b
            pfm.r r0 = r0.b(r4)
            java.lang.Object r0 = nim.a.a(r0, r2)
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            if (r0 != r1) goto L79
            return r0
        L79:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        L7c:
            qz0.j r0 = r0.f216352a
            r1 = r3
            com.revolut.core.ui_kit_core.displayers.image.models.UrlImage r3 = new com.revolut.core.ui_kit_core.displayers.image.models.UrlImage
            r20 = 0
            r21 = 524286(0x7fffe, float:7.34681E-40)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r3.<init>(r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            pfm.h r0 = qz0.j.a(r0, r3, r1)
            java.lang.Object r0 = nim.a.a(r0, r2)
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            if (r0 != r1) goto La9
            return r0
        La9:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nj3.b.a(nj3.b, hj3.b, fj3.f, mtj.i):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0105, code lost:
    
        if (r1 == r9) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(hj3.a r17, fj3.f r18, kotlinx.coroutines.CoroutineScope r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nj3.b.b(hj3.a, fj3.f, kotlinx.coroutines.CoroutineScope, gim.c):java.lang.Object");
    }
}
