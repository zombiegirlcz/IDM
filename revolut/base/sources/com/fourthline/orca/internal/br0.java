package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/fourthline/orca/internal/br0;", "", "Lcom/fourthline/orca/internal/ea;", "highlight", "Lcom/fourthline/orca/internal/ar0;", "background", "<init>", "(Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/ar0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/internal/ea;", "c", "()Lcom/fourthline/orca/internal/ea;", "b", "Lcom/fourthline/orca/internal/ar0;", "()Lcom/fourthline/orca/internal/ar0;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g(with = cr0.class)
public final /* data */ class br0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final br0 f27209c = new br0(ea.INSTANCE.a(Color.INSTANCE.m1995getWhite0d7_KjU()), ar0.INSTANCE.a());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ea highlight;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ar0 background;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.br0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final br0 a() {
            return br0.f27209c;
        }

        @NotNull
        public final KSerializer serializer() {
            return new cr0();
        }

        private Companion() {
        }
    }

    public br0(ea highlight, ar0 background) {
        Intrinsics.checkNotNullParameter(highlight, "highlight");
        Intrinsics.checkNotNullParameter(background, "background");
        this.highlight = highlight;
        this.background = background;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ar0 getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ea getHighlight() {
        return this.highlight;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof br0)) {
            return false;
        }
        br0 br0Var = (br0) other;
        return Intrinsics.f(this.highlight, br0Var.highlight) && Intrinsics.f(this.background, br0Var.background);
    }

    public int hashCode() {
        return (this.highlight.hashCode() * 31) + this.background.hashCode();
    }

    public String toString() {
        return "ProgressElement(highlight=" + this.highlight + ", background=" + this.background + ")";
    }
}
