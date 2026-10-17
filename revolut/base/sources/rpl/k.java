package rpl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    @NotNull
    private static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zk0.b f256426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qz0.j f256427b;

    public k(zk0.b fileSystemRepository, qz0.j urlImagesRepository) {
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(urlImagesRepository, "urlImagesRepository");
        this.f256426a = fileSystemRepository;
        this.f256427b = urlImagesRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r26, gim.c r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r27
            boolean r2 = r1 instanceof rpl.j
            if (r2 == 0) goto L17
            r2 = r1
            rpl.j r2 = (rpl.j) r2
            int r3 = r2.f256425w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f256425w = r3
            goto L1c
        L17:
            rpl.j r2 = new rpl.j
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f256425w
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            yhm.o.b(r1)
            goto L69
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            yhm.o.b(r1)
            com.revolut.core.ui_kit_core.displayers.image.models.UrlImage r6 = new com.revolut.core.ui_kit_core.displayers.image.models.UrlImage
            r23 = 0
            r24 = 524286(0x7fffe, float:7.34681E-40)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r7 = r26
            r6.<init>(r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            qz0.j r1 = r0.f256427b
            qz0.n r1 = (qz0.n) r1
            ufm.n r1 = r1.d(r6)
            r2.f256425w = r5
            java.lang.Object r1 = nim.a.b(r1, r2)
            if (r1 != r3) goto L69
            return r3
        L69:
            java.io.File r1 = (java.io.File) r1
            kotlin.jvm.internal.Intrinsics.h(r1)
            zk0.b r2 = r0.f256426a
            a80.h r2 = (a80.h) r2
            android.net.Uri r2 = r2.i(r1)
            java.lang.String r3 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r1 = o80.c.d(r1)
            if (r1 != 0) goto L83
            java.lang.String r1 = "image/*"
        L83:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.SEND"
            r3.<init>(r4)
            r3.setType(r1)
            java.lang.String r1 = "android.intent.extra.STREAM"
            r3.putExtra(r1, r2)
            r3.addFlags(r5)
            r1 = 0
            android.content.Intent r1 = android.content.Intent.createChooser(r3, r1)
            java.lang.String r2 = "createChooser(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rpl.k.a(java.lang.String, gim.c):java.lang.Object");
    }
}
