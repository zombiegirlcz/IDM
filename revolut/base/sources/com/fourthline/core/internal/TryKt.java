package com.fourthline.core.internal;

import com.fourthline.core.internal.Try;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0007\u001aE\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\u0006\u001aQ\u0010\u000b\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a?\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\u000e\u0010\u0006\u001aP\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000fH\u0087@¢\u0006\u0004\b\u0012\u0010\u0013\u001aE\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0003H\u0007¢\u0006\u0004\b\u0014\u0010\u0006\u001aV\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022(\u0010\r\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000fH\u0087@¢\u0006\u0004\b\u0015\u0010\u0013\u001a9\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u0016\u0010\u0006\u001a?\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0003H\u0007¢\u0006\u0004\b\u0017\u0010\u0006\u001a-\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a3\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0019\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0002*\u00020\bH\u0007¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00028\u0000H\u0007¢\u0006\u0004\b#\u0010$\u001a\u001d\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010%\u001a\u00028\u0000H\u0002¢\u0006\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"A", "B", "Lcom/fourthline/core/internal/Try;", "Lkotlin/Function1;", "block", "flatMap", "(Lcom/fourthline/core/internal/Try;Lkotlin/jvm/functions/Function1;)Lcom/fourthline/core/internal/Try;", "map", "", "ifFailure", "ifSuccess", "handle", "(Lcom/fourthline/core/internal/Try;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "f", "handleSuccess", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "handleSuccessSuspended", "(Lcom/fourthline/core/internal/Try;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleSuccessWith", "handleSuccessWithSuspended", "handleError", "handleErrorWith", "Lkotlin/Function0;", "default", "getOrDefault", "(Lcom/fourthline/core/internal/Try;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrElse", "(Lcom/fourthline/core/internal/Try;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "orNull", "(Lcom/fourthline/core/internal/Try;)Ljava/lang/Object;", "", "failure", "(Ljava/lang/Throwable;)Lcom/fourthline/core/internal/Try;", "success", "(Ljava/lang/Object;)Lcom/fourthline/core/internal/Try;", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "fourthline-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class TryKt {

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f26277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f26278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f26279c;
        Object d;
        int e;
        int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f26280g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f26281h;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f26280g = obj2;
            this.f26281h |= Integer.MIN_VALUE;
            return TryKt.handleSuccessSuspended(null, null, this);
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f26282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f26283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f26284c;
        Object d;
        int e;
        int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f26285g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f26286h;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f26285g = obj2;
            this.f26286h |= Integer.MIN_VALUE;
            return TryKt.handleSuccessWithSuspended(null, null, this);
        }
    }

    private static final Object a(Object obj2) {
        return obj2;
    }

    @NotNull
    public static final Try failure(@NotNull Throwable th10) {
        Intrinsics.checkNotNullParameter(th10, "<this>");
        return new Try.Failure(th10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <A, B> Try<B> flatMap(@NotNull Try<? extends A> r110, @NotNull Function1<? super A, ? extends Try<? extends B>> block) {
        Intrinsics.checkNotNullParameter(r110, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (r110 instanceof Try.Failure) {
            return r110;
        }
        if (r110 instanceof Try.Success) {
            return (Try) block.invoke(((Try.Success) r110).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <B> B getOrDefault(@NotNull Try<? extends B> r110, @NotNull Function0<? extends B> function0) {
        Intrinsics.checkNotNullParameter(r110, "<this>");
        Intrinsics.checkNotNullParameter(function0, "default");
        if (r110 instanceof Try.Failure) {
            ((Try.Failure) r110).getException();
            return (B) function0.invoke();
        }
        if (r110 instanceof Try.Success) {
            return (B) a(((Try.Success) r110).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <B> B getOrElse(@NotNull Try<? extends B> r110, @NotNull Function1<? super Throwable, ? extends B> function1) {
        Intrinsics.checkNotNullParameter(r110, "<this>");
        Intrinsics.checkNotNullParameter(function1, "default");
        if (r110 instanceof Try.Failure) {
            return (B) function1.invoke(((Try.Failure) r110).getException());
        }
        if (r110 instanceof Try.Success) {
            return (B) a(((Try.Success) r110).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <A, B> B handle(@NotNull Try<? extends A> r110, @NotNull Function1<? super Throwable, ? extends B> ifFailure, @NotNull Function1<? super A, ? extends B> ifSuccess) {
        Intrinsics.checkNotNullParameter(r110, "<this>");
        Intrinsics.checkNotNullParameter(ifFailure, "ifFailure");
        Intrinsics.checkNotNullParameter(ifSuccess, "ifSuccess");
        if (r110 instanceof Try.Failure) {
            return (B) ifFailure.invoke(((Try.Failure) r110).getException());
        }
        if (r110 instanceof Try.Success) {
            return (B) ifSuccess.invoke(((Try.Success) r110).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final <B> Try<B> handleError(@NotNull Try<? extends B> r110, @NotNull Function1<? super Throwable, ? extends B> f) {
        Intrinsics.checkNotNullParameter(r110, "<this>");
        Intrinsics.checkNotNullParameter(f, "f");
        if (r110 instanceof Try.Failure) {
            return new Try.Success(f.invoke(((Try.Failure) r110).getException()));
        }
        if (r110 instanceof Try.Success) {
            return new Try.Success(((Try.Success) r110).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final <B> Try<B> handleErrorWith(@NotNull Try<? extends B> r110, @NotNull Function1<? super Throwable, ? extends Try<? extends B>> f) {
        Intrinsics.checkNotNullParameter(r110, "<this>");
        Intrinsics.checkNotNullParameter(f, "f");
        if (r110 instanceof Try.Failure) {
            return (Try) f.invoke(((Try.Failure) r110).getException());
        }
        if (r110 instanceof Try.Success) {
            return new Try.Success(((Try.Success) r110).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final <A, B> Try<B> handleSuccess(@NotNull Try<? extends A> r110, @NotNull Function1<? super A, ? extends B> f) {
        Intrinsics.checkNotNullParameter(r110, "<this>");
        Intrinsics.checkNotNullParameter(f, "f");
        if (r110 instanceof Try.Failure) {
            return new Try.Failure(((Try.Failure) r110).getException());
        }
        if (r110 instanceof Try.Success) {
            return new Try.Success(f.invoke(((Try.Success) r110).getValue()));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <A, B> java.lang.Object handleSuccessSuspended(@org.jetbrains.annotations.NotNull com.fourthline.core.internal.Try<? extends A> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super A, ? super kotlin.coroutines.Continuation<? super B>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.fourthline.core.internal.Try<? extends B>> r6) {
        /*
            boolean r0 = r6 instanceof com.fourthline.core.internal.TryKt.a
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.core.internal.TryKt$a r0 = (com.fourthline.core.internal.TryKt.a) r0
            int r1 = r0.f26281h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26281h = r1
            goto L18
        L13:
            com.fourthline.core.internal.TryKt$a r0 = new com.fourthline.core.internal.TryKt$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f26280g
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f26281h
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f26279c
            com.fourthline.core.internal.Try r4 = (com.fourthline.core.internal.Try) r4
            java.lang.Object r4 = r0.f26278b
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            java.lang.Object r4 = r0.f26277a
            com.fourthline.core.internal.Try r4 = (com.fourthline.core.internal.Try) r4
            yhm.o.b(r6)
            goto L6f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            yhm.o.b(r6)
            boolean r6 = r4 instanceof com.fourthline.core.internal.Try.Failure
            if (r6 == 0) goto L4e
            com.fourthline.core.internal.Try$Failure r4 = (com.fourthline.core.internal.Try.Failure) r4
            java.lang.Throwable r4 = r4.getException()
            com.fourthline.core.internal.Try$Failure r5 = new com.fourthline.core.internal.Try$Failure
            r5.<init>(r4)
            return r5
        L4e:
            boolean r6 = r4 instanceof com.fourthline.core.internal.Try.Success
            if (r6 == 0) goto L75
            com.fourthline.core.internal.Try$Success r4 = (com.fourthline.core.internal.Try.Success) r4
            java.lang.Object r4 = r4.getValue()
            r6 = 0
            r0.f26277a = r6
            r0.f26278b = r6
            r0.f26279c = r6
            r0.d = r6
            r6 = 0
            r0.e = r6
            r0.f = r6
            r0.f26281h = r3
            java.lang.Object r6 = r5.invoke(r4, r0)
            if (r6 != r1) goto L6f
            return r1
        L6f:
            com.fourthline.core.internal.Try$Success r4 = new com.fourthline.core.internal.Try$Success
            r4.<init>(r6)
            return r4
        L75:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.core.internal.TryKt.handleSuccessSuspended(com.fourthline.core.internal.Try, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public static final <A, B> Try<B> handleSuccessWith(@NotNull Try<? extends A> r110, @NotNull Function1<? super A, ? extends Try<? extends B>> f) {
        Intrinsics.checkNotNullParameter(r110, "<this>");
        Intrinsics.checkNotNullParameter(f, "f");
        if (r110 instanceof Try.Failure) {
            return new Try.Failure(((Try.Failure) r110).getException());
        }
        if (r110 instanceof Try.Success) {
            return (Try) f.invoke(((Try.Success) r110).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <A, B> java.lang.Object handleSuccessWithSuspended(@org.jetbrains.annotations.NotNull com.fourthline.core.internal.Try<? extends A> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super A, ? super kotlin.coroutines.Continuation<? super com.fourthline.core.internal.Try<? extends B>>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.fourthline.core.internal.Try<? extends B>> r6) {
        /*
            boolean r0 = r6 instanceof com.fourthline.core.internal.TryKt.b
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.core.internal.TryKt$b r0 = (com.fourthline.core.internal.TryKt.b) r0
            int r1 = r0.f26286h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26286h = r1
            goto L18
        L13:
            com.fourthline.core.internal.TryKt$b r0 = new com.fourthline.core.internal.TryKt$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f26285g
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f26286h
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f26284c
            com.fourthline.core.internal.Try r4 = (com.fourthline.core.internal.Try) r4
            java.lang.Object r4 = r0.f26283b
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            java.lang.Object r4 = r0.f26282a
            com.fourthline.core.internal.Try r4 = (com.fourthline.core.internal.Try) r4
            yhm.o.b(r6)
            goto L6f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            yhm.o.b(r6)
            boolean r6 = r4 instanceof com.fourthline.core.internal.Try.Failure
            if (r6 == 0) goto L4e
            com.fourthline.core.internal.Try$Failure r4 = (com.fourthline.core.internal.Try.Failure) r4
            java.lang.Throwable r4 = r4.getException()
            com.fourthline.core.internal.Try$Failure r5 = new com.fourthline.core.internal.Try$Failure
            r5.<init>(r4)
            return r5
        L4e:
            boolean r6 = r4 instanceof com.fourthline.core.internal.Try.Success
            if (r6 == 0) goto L72
            com.fourthline.core.internal.Try$Success r4 = (com.fourthline.core.internal.Try.Success) r4
            java.lang.Object r4 = r4.getValue()
            r6 = 0
            r0.f26282a = r6
            r0.f26283b = r6
            r0.f26284c = r6
            r0.d = r6
            r6 = 0
            r0.e = r6
            r0.f = r6
            r0.f26286h = r3
            java.lang.Object r6 = r5.invoke(r4, r0)
            if (r6 != r1) goto L6f
            return r1
        L6f:
            com.fourthline.core.internal.Try r6 = (com.fourthline.core.internal.Try) r6
            return r6
        L72:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.core.internal.TryKt.handleSuccessWithSuspended(com.fourthline.core.internal.Try, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public static final <A, B> Try<B> map(@NotNull Try<? extends A> r2, @NotNull Function1<? super A, ? extends B> block) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return flatMap(r2, new aem.j(1, block));
    }

    public static final <B> B orNull(@NotNull Try<? extends B> r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        return (B) getOrElse(r2, new aem.d(12));
    }

    @NotNull
    public static final <A> Try<A> success(A a7) {
        return new Try.Success(a7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object a(Throwable it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Try a(Function1 function1, Object obj2) {
        return new Try.Success(function1.invoke(obj2));
    }
}
