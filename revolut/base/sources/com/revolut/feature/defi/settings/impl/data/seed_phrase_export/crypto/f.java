package com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import wk5.k;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends i implements Function2 {
    public byte[] u;
    public byte[] v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte[] f71858w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f71859x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f71860y;
    public final /* synthetic */ g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(f66.d dVar, k kVar, g gVar, Continuation continuation) {
        super(2, continuation);
        this.f71860y = kVar;
        this.z = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(null, this.f71860y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.f71859x
            wk5.k r2 = r10.f71860y
            if (r1 == 0) goto L9a
            r3 = 2
            r4 = 1
            com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.g r5 = r10.z
            r6 = 0
            if (r1 == r4) goto L29
            if (r1 != r3) goto L21
            byte[] r0 = r10.f71858w
            byte[] r1 = r10.v
            byte[] r7 = r10.u
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L1b
            goto L45
        L1b:
            r11 = move-exception
            r2 = r6
            r6 = r0
        L1e:
            r0 = r2
            goto L80
        L21:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L29:
            byte[] r1 = r10.v
            byte[] r7 = r10.u
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L7d
            byte[] r11 = (byte[]) r11     // Catch: java.lang.Throwable -> L7d
            com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.c r8 = r5.f71862b     // Catch: java.lang.Throwable -> L78
            r10.u = r7     // Catch: java.lang.Throwable -> L78
            r10.v = r1     // Catch: java.lang.Throwable -> L78
            r10.f71858w = r11     // Catch: java.lang.Throwable -> L78
            r10.f71859x = r3     // Catch: java.lang.Throwable -> L78
            c66.k r8 = com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.c.a(r11)     // Catch: java.lang.Throwable -> L78
            if (r8 != r0) goto L43
            return r0
        L43:
            r0 = r11
            r11 = r8
        L45:
            c66.k r11 = (c66.k) r11     // Catch: java.lang.Throwable -> L1b
            int[] r8 = c66.i.f21685a     // Catch: java.lang.Throwable -> L5d
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L5d
            r2 = r8[r2]     // Catch: java.lang.Throwable -> L5d
            if (r2 == r4) goto L6b
            if (r2 != r3) goto L65
            c66.j r2 = r5.d     // Catch: java.lang.Throwable -> L5d
            byte[] r2 = r11.f21688b     // Catch: java.lang.Throwable -> L5d
            byte[] r2 = c66.j.a(r2)     // Catch: java.lang.Throwable -> L5d
        L5b:
            r6 = r2
            goto L74
        L5d:
            r2 = move-exception
            r9 = r2
            r2 = r11
            r11 = r9
            r9 = r6
            r6 = r0
            r0 = r9
            goto L80
        L65:
            com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.SeedPhraseExportDecryptionException$InvalidResponse r2 = new com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.SeedPhraseExportDecryptionException$InvalidResponse     // Catch: java.lang.Throwable -> L5d
            r2.<init>()     // Catch: java.lang.Throwable -> L5d
            throw r2     // Catch: java.lang.Throwable -> L5d
        L6b:
            com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.b r2 = r5.f71863c     // Catch: java.lang.Throwable -> L5d
            byte[] r2 = r11.f21688b     // Catch: java.lang.Throwable -> L5d
            byte[] r2 = com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.b.a(r2)     // Catch: java.lang.Throwable -> L5d
            goto L5b
        L74:
            com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.d r2 = r5.e     // Catch: java.lang.Throwable -> L5d
            r2 = 0
            throw r2     // Catch: java.lang.Throwable -> L5d
        L78:
            r0 = move-exception
            r2 = r6
            r6 = r11
            r11 = r0
            goto L1e
        L7d:
            r11 = move-exception
            r0 = r6
            r2 = r0
        L80:
            if (r7 == 0) goto L85
            zhm.p.r(r7)
        L85:
            if (r1 == 0) goto L8a
            zhm.p.r(r1)
        L8a:
            if (r6 == 0) goto L8f
            zhm.p.r(r6)
        L8f:
            if (r0 == 0) goto L94
            zhm.p.r(r0)
        L94:
            if (r2 == 0) goto L99
            r2.close()
        L99:
            throw r11
        L9a:
            yhm.o.b(r11)
            r11 = 0
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r11 = "addressType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r11)
            r11 = 0
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.defi.settings.impl.data.seed_phrase_export.crypto.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
