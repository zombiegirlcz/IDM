package com.fourthline.orca.internal;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0007\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/fourthline/orca/internal/di0;", "", "Landroidx/compose/ui/graphics/Color;", "light", "dark", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(JJ)Lcom/fourthline/orca/internal/di0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "b", "()J", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g(with = ei0.class)
public final /* data */ class di0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long light;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long dark;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.di0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return new ei0();
        }

        private Companion() {
        }
    }

    public /* synthetic */ di0(long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3);
    }

    public final di0 a(long light, long dark) {
        return new di0(light, dark, null);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getLight() {
        return this.light;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof di0)) {
            return false;
        }
        di0 di0Var = (di0) other;
        return Color.m1978equalsimpl0(this.light, di0Var.light) && Color.m1978equalsimpl0(this.dark, di0Var.dark);
    }

    public int hashCode() {
        return (Color.m1984hashCodeimpl(this.light) * 31) + Color.m1984hashCodeimpl(this.dark);
    }

    public String toString() {
        return "OrcaPaletteColor(light=" + Color.m1985toStringimpl(this.light) + ", dark=" + Color.m1985toStringimpl(this.dark) + ")";
    }

    private di0(long j2, long j3) {
        this.light = j2;
        this.dark = j3;
    }

    public static /* synthetic */ di0 a(di0 di0Var, long j2, long j3, int i, Object obj2) {
        if ((i & 1) != 0) {
            j2 = di0Var.light;
        }
        if ((i & 2) != 0) {
            j3 = di0Var.dark;
        }
        return di0Var.a(j2, j3);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getDark() {
        return this.dark;
    }
}
