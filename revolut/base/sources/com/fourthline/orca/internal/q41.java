package com.fourthline.orca.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/fourthline/orca/internal/q41;", "", "Lcom/fourthline/orca/internal/b81;", "default", "focused", "error", "disabled", "<init>", "(Lcom/fourthline/orca/internal/b81;Lcom/fourthline/orca/internal/b81;Lcom/fourthline/orca/internal/b81;Lcom/fourthline/orca/internal/b81;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/internal/b81;", "()Lcom/fourthline/orca/internal/b81;", "b", "d", "c", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g(with = r41.class)
public final /* data */ class q41 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b81 default;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b81 focused;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b81 error;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final b81 disabled;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.q41$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return new r41();
        }

        private Companion() {
        }
    }

    public q41(b81 b81Var, b81 focused, b81 error, b81 disabled) {
        Intrinsics.checkNotNullParameter(b81Var, "default");
        Intrinsics.checkNotNullParameter(focused, "focused");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(disabled, "disabled");
        this.default = b81Var;
        this.focused = focused;
        this.error = error;
        this.disabled = disabled;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b81 getDefault() {
        return this.default;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b81 getDisabled() {
        return this.disabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b81 getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b81 getFocused() {
        return this.focused;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof q41)) {
            return false;
        }
        q41 q41Var = (q41) other;
        return Intrinsics.f(this.default, q41Var.default) && Intrinsics.f(this.focused, q41Var.focused) && Intrinsics.f(this.error, q41Var.error) && Intrinsics.f(this.disabled, q41Var.disabled);
    }

    public int hashCode() {
        return (((((this.default.hashCode() * 31) + this.focused.hashCode()) * 31) + this.error.hashCode()) * 31) + this.disabled.hashCode();
    }

    public String toString() {
        return "StatefulTextInputElement(default=" + this.default + ", focused=" + this.focused + ", error=" + this.error + ", disabled=" + this.disabled + ")";
    }
}
