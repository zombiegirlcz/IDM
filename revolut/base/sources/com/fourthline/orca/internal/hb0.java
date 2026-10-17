package com.fourthline.orca.internal;

import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class hb0 implements r11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f29207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t9 f29208b;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f29210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f29211c;
        Object d;
        /* synthetic */ Object e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f29212g;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.e = obj2;
            this.f29212g |= Integer.MIN_VALUE;
            Object objA = hb0.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public hb0(File assetsFourthlineDirectory, t9 cdnUrlDownloadWorker) {
        Intrinsics.checkNotNullParameter(assetsFourthlineDirectory, "assetsFourthlineDirectory");
        Intrinsics.checkNotNullParameter(cdnUrlDownloadWorker, "cdnUrlDownloadWorker");
        this.f29207a = assetsFourthlineDirectory;
        this.f29208b = cdnUrlDownloadWorker;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.r11
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.r11.a r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.fourthline.orca.internal.hb0.a
            if (r0 == 0) goto L13
            r0 = r8
            com.fourthline.orca.internal.hb0$a r0 = (com.fourthline.orca.internal.hb0.a) r0
            int r1 = r0.f29212g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29212g = r1
            goto L18
        L13:
            com.fourthline.orca.internal.hb0$a r0 = new com.fourthline.orca.internal.hb0$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.e
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f29212g
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r7 = r0.d
            com.fourthline.orca.internal.t9$a r7 = (com.fourthline.orca.internal.t9.a) r7
            java.lang.Object r7 = r0.f29211c
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f29210b
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f29209a
            com.fourthline.orca.internal.r11$a r7 = (com.fourthline.orca.internal.r11.a) r7
            yhm.o.b(r8)
            yhm.m r8 = (yhm.m) r8
            java.lang.Object r7 = r8.f314193a
            goto L99
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L43:
            yhm.o.b(r8)
            com.fourthline.orca.internal.z70 r8 = r7.a()
            java.lang.String r8 = r8.b()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "android/3.4.29/default/models/"
            r2.<init>(r4)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            com.fourthline.orca.internal.t9$a r2 = new com.fourthline.orca.internal.t9$a
            java.io.File r4 = r6.f29207a
            java.lang.String r4 = r4.getAbsolutePath()
            com.fourthline.orca.internal.z70 r7 = r7.a()
            java.lang.String r7 = r7.b()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "/"
            r5.append(r4)
            r5.append(r7)
            java.lang.String r7 = r5.toString()
            java.lang.String r4 = "tensorflow_model"
            r2.<init>(r4, r8, r7)
            com.fourthline.orca.internal.t9 r7 = r6.f29208b
            r8 = 0
            r0.f29209a = r8
            r0.f29210b = r8
            r0.f29211c = r8
            r0.d = r8
            r0.f29212g = r3
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L99
            return r1
        L99:
            java.lang.Throwable r8 = yhm.m.a(r7)
            if (r8 != 0) goto La7
            com.fourthline.orca.internal.t9$b r7 = (com.fourthline.orca.internal.t9.b) r7
            com.fourthline.orca.internal.r11$b r7 = new com.fourthline.orca.internal.r11$b
            r7.<init>(r3)
            return r7
        La7:
            yhm.n r7 = yhm.o.a(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.hb0.a(com.fourthline.orca.internal.r11$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
