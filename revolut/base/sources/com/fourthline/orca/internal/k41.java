package com.fourthline.orca.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0001\u000fBO\u0012*\b\u0002\u0010\u0007\u001a$0\u0002j\u0011`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJZ\u0010\u000f\u001a\u00020\u00002*\b\u0002\u0010\u0007\u001a$0\u0002j\u0011`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R9\u0010\u0007\u001a$0\u0002j\u0011`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b\u000f\u0010!R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001c\u0010!¨\u0006#"}, d2 = {"Lcom/fourthline/orca/internal/k41;", "", "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lmlm/g;", "with", "Lcom/fourthline/orca/internal/ny0;", "radius", "Lcom/fourthline/orca/internal/br0;", "spinner", "Lcom/fourthline/orca/internal/z8;", "default", "disabled", "<init>", "(ILcom/fourthline/orca/internal/br0;Lcom/fourthline/orca/internal/z8;Lcom/fourthline/orca/internal/z8;)V", "a", "(ILcom/fourthline/orca/internal/br0;Lcom/fourthline/orca/internal/z8;Lcom/fourthline/orca/internal/z8;)Lcom/fourthline/orca/internal/k41;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "c", "b", "Lcom/fourthline/orca/internal/br0;", "d", "()Lcom/fourthline/orca/internal/br0;", "Lcom/fourthline/orca/internal/z8;", "()Lcom/fourthline/orca/internal/z8;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g(with = l41.class)
public final /* data */ class k41 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int radius;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final br0 spinner;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z8 default;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final z8 disabled;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.k41$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return new l41();
        }

        private Companion() {
        }
    }

    public k41(int i, br0 spinner, z8 z8Var, z8 disabled) {
        Intrinsics.checkNotNullParameter(spinner, "spinner");
        Intrinsics.checkNotNullParameter(z8Var, "default");
        Intrinsics.checkNotNullParameter(disabled, "disabled");
        this.radius = i;
        this.spinner = spinner;
        this.default = z8Var;
        this.disabled = disabled;
    }

    public final k41 a(int radius, br0 spinner, z8 z8Var, z8 disabled) {
        Intrinsics.checkNotNullParameter(spinner, "spinner");
        Intrinsics.checkNotNullParameter(z8Var, "default");
        Intrinsics.checkNotNullParameter(disabled, "disabled");
        return new k41(radius, spinner, z8Var, disabled);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final z8 getDisabled() {
        return this.disabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final br0 getSpinner() {
        return this.spinner;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof k41)) {
            return false;
        }
        k41 k41Var = (k41) other;
        return this.radius == k41Var.radius && Intrinsics.f(this.spinner, k41Var.spinner) && Intrinsics.f(this.default, k41Var.default) && Intrinsics.f(this.disabled, k41Var.disabled);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.radius) * 31) + this.spinner.hashCode()) * 31) + this.default.hashCode()) * 31) + this.disabled.hashCode();
    }

    public String toString() {
        return "StatefulButtonElement(radius=" + this.radius + ", spinner=" + this.spinner + ", default=" + this.default + ", disabled=" + this.disabled + ")";
    }

    public static /* synthetic */ k41 a(k41 k41Var, int i, br0 br0Var, z8 z8Var, z8 z8Var2, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = k41Var.radius;
        }
        if ((i2 & 2) != 0) {
            br0Var = k41Var.spinner;
        }
        if ((i2 & 4) != 0) {
            z8Var = k41Var.default;
        }
        if ((i2 & 8) != 0) {
            z8Var2 = k41Var.disabled;
        }
        return k41Var.a(i, br0Var, z8Var, z8Var2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final z8 getDefault() {
        return this.default;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ k41(int i, br0 br0Var, z8 z8Var, z8 z8Var2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        z8 z8Var3;
        i = (i2 & 1) != 0 ? 0 : i;
        br0Var = (i2 & 2) != 0 ? br0.INSTANCE.a() : br0Var;
        if ((i2 & 8) != 0) {
            z8Var3 = z8Var;
            z8Var2 = z8.a(z8Var3, null, null, null, 0.5f, 7, null);
        } else {
            z8Var3 = z8Var;
        }
        this(i, br0Var, z8Var3, z8Var2);
    }
}
