package com.fourthline.orca.internal;

import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class q40 implements px {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f32190a;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f32191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f32192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f32193c;
        int e;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f32193c = obj2;
            this.e |= Integer.MIN_VALUE;
            return q40.this.a(null, null, this);
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32194a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f32196c;
        final /* synthetic */ byte[] d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, byte[] bArr, Continuation continuation) {
            super(2, continuation);
            this.f32196c = str;
            this.d = bArr;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return q40.this.new b(this.f32196c, this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f32194a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            File file = new File(q40.this.f32190a, this.f32196c);
            lim.m.g(file, this.d);
            return file.getAbsolutePath();
        }
    }

    public q40(File destFolder) {
        Intrinsics.checkNotNullParameter(destFolder, "destFolder");
        this.f32190a = destFolder;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.px
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r6, byte[] r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.fourthline.orca.internal.q40.a
            if (r0 == 0) goto L13
            r0 = r8
            com.fourthline.orca.internal.q40$a r0 = (com.fourthline.orca.internal.q40.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            com.fourthline.orca.internal.q40$a r0 = new com.fourthline.orca.internal.q40$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f32193c
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f32192b
            byte[] r6 = (byte[]) r6
            java.lang.Object r6 = r0.f32191a
            java.lang.String r6 = (java.lang.String) r6
            yhm.o.b(r8)
            goto L51
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            yhm.o.b(r8)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            com.fourthline.orca.internal.q40$b r2 = new com.fourthline.orca.internal.q40$b
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.f32191a = r4
            r0.f32192b = r4
            r0.e = r3
            java.lang.Object r8 = skm.e0.J(r8, r2, r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            java.lang.String r6 = "withContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.q40.a(java.lang.String, byte[], kotlin.coroutines.Continuation):java.lang.Object");
    }
}
