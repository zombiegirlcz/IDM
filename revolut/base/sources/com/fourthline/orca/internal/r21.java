package com.fourthline.orca.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/fourthline/orca/internal/r21;", "", "Lcom/fourthline/orca/internal/ea;", "color", "", "opacity", "<init>", "(Lcom/fourthline/orca/internal/ea;F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/internal/ea;", "getColor", "()Lcom/fourthline/orca/internal/ea;", "b", "F", "getOpacity", "()F", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g(with = s21.class)
public final /* data */ class r21 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final r21 f32619c = new r21(ea.INSTANCE.b(), 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ea color;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float opacity;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.r21$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r21 a() {
            return r21.f32619c;
        }

        @NotNull
        public final KSerializer serializer() {
            return new s21();
        }

        private Companion() {
        }
    }

    public r21(ea color, float f) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.color = color;
        this.opacity = f;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof r21)) {
            return false;
        }
        r21 r21Var = (r21) other;
        return Intrinsics.f(this.color, r21Var.color) && Float.compare(this.opacity, r21Var.opacity) == 0;
    }

    public int hashCode() {
        return (this.color.hashCode() * 31) + Float.hashCode(this.opacity);
    }

    public String toString() {
        return "ShadowElement(color=" + this.color + ", opacity=" + this.opacity + ")";
    }

    public /* synthetic */ r21(ea eaVar, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eaVar, (i & 2) != 0 ? 1.0f : f);
    }
}
