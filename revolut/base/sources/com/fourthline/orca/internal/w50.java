package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0001\rB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\r\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010!¨\u0006#"}, d2 = {"Lcom/fourthline/orca/internal/w50;", "", "Lcom/fourthline/orca/internal/mz;", "typography", "Lcom/fourthline/orca/internal/ea;", "color", "", "opacity", "<init>", "(Lcom/fourthline/orca/internal/mz;Lcom/fourthline/orca/internal/ea;F)V", "Landroidx/compose/ui/unit/TextUnit;", "maxSize", "Landroidx/compose/ui/text/TextStyle;", "a", "(Landroidx/compose/ui/unit/TextUnit;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextStyle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/mz;", "getTypography", "()Lcom/fourthline/orca/internal/mz;", "b", "Lcom/fourthline/orca/internal/ea;", "()Lcom/fourthline/orca/internal/ea;", "c", "F", "()F", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g(with = x50.class)
public final /* data */ class w50 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mz typography;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ea color;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float opacity;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.w50$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return new x50();
        }

        private Companion() {
        }
    }

    public w50(mz typography, ea color, float f) {
        Intrinsics.checkNotNullParameter(typography, "typography");
        Intrinsics.checkNotNullParameter(color, "color");
        this.typography = typography;
        this.color = color;
        this.opacity = f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ea getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getOpacity() {
        return this.opacity;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof w50)) {
            return false;
        }
        w50 w50Var = (w50) other;
        return Intrinsics.f(this.typography, w50Var.typography) && Intrinsics.f(this.color, w50Var.color) && Float.compare(this.opacity, w50Var.opacity) == 0;
    }

    public int hashCode() {
        return (((this.typography.hashCode() * 31) + this.color.hashCode()) * 31) + Float.hashCode(this.opacity);
    }

    public String toString() {
        return "LinkStyleElement(typography=" + this.typography + ", color=" + this.color + ", opacity=" + this.opacity + ")";
    }

    public final TextStyle a(TextUnit textUnit, Composer composer, int i, int i2) {
        TextUnit textUnit2 = (i2 & 1) != 0 ? null : textUnit;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2025037281, i, -1, "com.fourthline.orca.core.internal.styling.common.LinkStyleElement.getTextStyle (StylingElement.kt:112)");
        }
        composer.startReplaceGroup(440644287);
        Pair pairA = this.typography.a(textUnit2, composer, i & 14, 0);
        TextStyle textStyle = new TextStyle(this.color.a(composer, 0), ((TextUnit) pairA.f186385a).getPackedValue(), null, null, null, this.typography.getFamily(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, ((TextUnit) pairA.f186386b).getPackedValue(), null, null, null, 0, 0, null, 16646108, null);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textStyle;
    }
}
