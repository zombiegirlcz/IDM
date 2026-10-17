package com.fourthline.orca.internal;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/fourthline/orca/internal/ea;", "", "Landroidx/compose/ui/graphics/Color;", "light", "dark", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "d", "()J", "b", "c", "(Landroidx/compose/runtime/Composer;I)J", "value", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g(with = fa.class)
public final /* data */ class ea {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ea f28093c;
    private static final ea d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long light;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long dark;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ea$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ea a() {
            return ea.f28093c;
        }

        public final ea b() {
            return ea.d;
        }

        @NotNull
        public final KSerializer serializer() {
            return new fa();
        }

        private Companion() {
        }

        public final ea a(long j2) {
            return new ea(j2, j2, null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        Color.Companion companion2 = Color.INSTANCE;
        f28093c = new ea(companion2.m1987getBlack0d7_KjU(), companion2.m1995getWhite0d7_KjU(), null);
        d = companion.a(companion2.m1993getTransparent0d7_KjU());
    }

    public /* synthetic */ ea(long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getDark() {
        return this.dark;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getLight() {
        return this.light;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ea)) {
            return false;
        }
        ea eaVar = (ea) other;
        return Color.m1978equalsimpl0(this.light, eaVar.light) && Color.m1978equalsimpl0(this.dark, eaVar.dark);
    }

    public int hashCode() {
        return (Color.m1984hashCodeimpl(this.light) * 31) + Color.m1984hashCodeimpl(this.dark);
    }

    public String toString() {
        return "ColorElement(light=" + Color.m1985toStringimpl(this.light) + ", dark=" + Color.m1985toStringimpl(this.dark) + ")";
    }

    private ea(long j2, long j3) {
        this.light = j2;
        this.dark = j3;
    }

    public final long a(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1310995438, i, -1, "com.fourthline.orca.core.internal.styling.common.ColorElement.<get-value> (StylingElement.kt:25)");
        }
        long j2 = DarkThemeKt.isSystemInDarkTheme(composer, 0) ? this.dark : this.light;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j2;
    }
}
