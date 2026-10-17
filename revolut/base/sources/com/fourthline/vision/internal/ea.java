package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ea extends zd {

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36145b;
        int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.f36145b = obj2;
            this.d |= Integer.MIN_VALUE;
            return ea.this.consume((Unit) null, (Continuation<? super Unit>) this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(@NotNull TimestampProvider timestampProvider, long j2, @NotNull TimeUnit timeUnit) {
        super(timestampProvider, j2, timeUnit);
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
    }

    @Override // com.fourthline.vision.internal.m, com.fourthline.vision.internal.qd, com.fourthline.vision.internal.x1
    public /* bridge */ /* synthetic */ Object consume(Object obj2, Continuation continuation) {
        return consume((Unit) obj2, (Continuation<? super Unit>) continuation);
    }

    public /* synthetic */ ea(TimestampProvider timestampProvider, long j2, TimeUnit timeUnit, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(timestampProvider, j2, (i & 4) != 0 ? TimeUnit.MILLISECONDS : timeUnit);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.vision.internal.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object consume(@org.jetbrains.annotations.NotNull kotlin.Unit r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.fourthline.vision.internal.ea.a
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.vision.internal.ea$a r0 = (com.fourthline.vision.internal.ea.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.vision.internal.ea$a r0 = new com.fourthline.vision.internal.ea$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f36145b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f36144a
            kotlin.Unit r5 = (kotlin.Unit) r5
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L45
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            r6 = 0
            r0.f36144a = r6     // Catch: java.lang.Throwable -> L45
            r0.d = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = super.consume(r5, r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r1) goto L42
            return r1
        L42:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L45:
            com.fourthline.vision.internal.ra$d r5 = com.fourthline.vision.internal.ra.d.f36776b
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.ea.consume(kotlin.Unit, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
