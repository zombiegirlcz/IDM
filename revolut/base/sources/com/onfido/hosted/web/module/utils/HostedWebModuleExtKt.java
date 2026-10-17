package com.onfido.hosted.web.module.utils;

import gim.c;
import gim.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001aD\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00032\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0080@¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"collectNonNull", "", "T", "Lkotlinx/coroutines/flow/SharedFlow;", "action", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class HostedWebModuleExtKt {

    /* JADX INFO: renamed from: com.onfido.hosted.web.module.utils.HostedWebModuleExtKt$collectNonNull$1, reason: invalid class name */
    @d(c = "com.onfido.hosted.web.module.utils.HostedWebModuleExtKt", f = "HostedWebModuleExt.kt", l = {6}, m = "collectNonNull")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1<T> extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return HostedWebModuleExtKt.collectNonNull(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object collectNonNull(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.SharedFlow r4, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r6) {
        /*
            boolean r0 = r6 instanceof com.onfido.hosted.web.module.utils.HostedWebModuleExtKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            com.onfido.hosted.web.module.utils.HostedWebModuleExtKt$collectNonNull$1 r0 = (com.onfido.hosted.web.module.utils.HostedWebModuleExtKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.onfido.hosted.web.module.utils.HostedWebModuleExtKt$collectNonNull$1 r0 = new com.onfido.hosted.web.module.utils.HostedWebModuleExtKt$collectNonNull$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            yhm.o.b(r6)
            goto L40
        L2f:
            yhm.o.b(r6)
            com.onfido.hosted.web.module.utils.HostedWebModuleExtKt$collectNonNull$2 r6 = new com.onfido.hosted.web.module.utils.HostedWebModuleExtKt$collectNonNull$2
            r6.<init>()
            r0.label = r3
            java.lang.Object r4 = r4.collect(r6, r0)
            if (r4 != r1) goto L40
            return r1
        L40:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.hosted.web.module.utils.HostedWebModuleExtKt.collectNonNull(kotlinx.coroutines.flow.SharedFlow, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
