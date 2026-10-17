package com.fourthline.core.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/fourthline/core/internal/Try;", "A", "", "<init>", "()V", "isFailure", "", "isSuccess", "Companion", "Failure", "Success", "Lcom/fourthline/core/internal/Try$Failure;", "Lcom/fourthline/core/internal/Try$Success;", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class Try<A> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH\u0086\nø\u0001\u0000J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\n\u001a\u0002H\u0006¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\u0006\u0010\u000e\u001a\u00020\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"Lcom/fourthline/core/internal/Try$Companion;", "", "<init>", "()V", "invoke", "Lcom/fourthline/core/internal/Try;", "A", "f", "Lkotlin/Function0;", "just", "a", "(Ljava/lang/Object;)Lcom/fourthline/core/internal/Try;", "raiseError", "", "e", "", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <A> Try<A> invoke(@NotNull Function0<? extends A> f) {
            Intrinsics.checkNotNullParameter(f, "f");
            try {
                return new Success(f.invoke());
            } catch (Throwable th10) {
                if ((th10 instanceof VirtualMachineError) || (th10 instanceof ThreadDeath) || (th10 instanceof InterruptedException) || (th10 instanceof LinkageError)) {
                    throw th10;
                }
                return new Failure(th10);
            }
        }

        @NotNull
        public final <A> Try<A> just(A a7) {
            return new Success(a7);
        }

        @NotNull
        public final Try raiseError(@NotNull Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return new Failure(e);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/fourthline/core/internal/Try$Failure;", "Lcom/fourthline/core/internal/Try;", "", "", "exception", "<init>", "(Ljava/lang/Throwable;)V", "", "isFailure", "()Z", "isSuccess", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/fourthline/core/internal/Try$Failure;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "getException", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Failure extends Try {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Throwable exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull Throwable exception) {
            super(null);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th10, int i, Object obj2) {
            if ((i & 1) != 0) {
                th10 = failure.exception;
            }
            return failure.copy(th10);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getException() {
            return this.exception;
        }

        @NotNull
        public final Failure copy(@NotNull Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            return new Failure(exception);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.f(this.exception, ((Failure) other).exception);
        }

        @NotNull
        public final Throwable getException() {
            return this.exception;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        @Override // com.fourthline.core.internal.Try
        public boolean isFailure() {
            return true;
        }

        @Override // com.fourthline.core.internal.Try
        public boolean isSuccess() {
            return false;
        }

        @NotNull
        public String toString() {
            return "Failure(exception=" + this.exception + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ \u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/fourthline/core/internal/Try$Success;", "A", "Lcom/fourthline/core/internal/Try;", "value", "<init>", "(Ljava/lang/Object;)V", "", "isFailure", "()Z", "isSuccess", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/fourthline/core/internal/Try$Success;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getValue", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success<A> extends Try<A> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object value;

        public Success(A a7) {
            super(null);
            this.value = a7;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj2, int i, Object obj3) {
            if ((i & 1) != 0) {
                obj2 = success.value;
            }
            return success.copy(obj2);
        }

        public final A component1() {
            return (A) this.value;
        }

        @NotNull
        public final Success<A> copy(A value) {
            return new Success<>(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.f(this.value, ((Success) other).value);
        }

        public final A getValue() {
            return (A) this.value;
        }

        public int hashCode() {
            Object obj2 = this.value;
            if (obj2 == null) {
                return 0;
            }
            return obj2.hashCode();
        }

        @Override // com.fourthline.core.internal.Try
        public boolean isFailure() {
            return false;
        }

        @Override // com.fourthline.core.internal.Try
        public boolean isSuccess() {
            return true;
        }

        @NotNull
        public String toString() {
            return "Success(value=" + this.value + ")";
        }
    }

    public /* synthetic */ Try(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean isFailure();

    public abstract boolean isSuccess();

    private Try() {
    }
}
