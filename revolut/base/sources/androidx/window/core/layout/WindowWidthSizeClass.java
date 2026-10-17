package androidx.window.core.layout;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/window/core/layout/WindowWidthSizeClass;", "", "rawValue", "", "<init>", "(I)V", "toString", "", "equals", "", "other", "hashCode", "Companion", "window-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@d
public final class WindowWidthSizeClass {
    private final int rawValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final WindowWidthSizeClass COMPACT = new WindowWidthSizeClass(0);

    @NotNull
    public static final WindowWidthSizeClass MEDIUM = new WindowWidthSizeClass(1);

    @NotNull
    public static final WindowWidthSizeClass EXPANDED = new WindowWidthSizeClass(2);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/window/core/layout/WindowWidthSizeClass$Companion;", "", "<init>", "()V", "", "dpWidth", "Landroidx/window/core/layout/WindowWidthSizeClass;", "compute$window_core", "(F)Landroidx/window/core/layout/WindowWidthSizeClass;", "compute", "window-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        @d
        public final WindowWidthSizeClass compute$window_core(float dpWidth) {
            if (dpWidth >= BitmapDescriptorFactory.HUE_RED) {
                return dpWidth < 600.0f ? WindowWidthSizeClass.COMPACT : dpWidth < 840.0f ? WindowWidthSizeClass.MEDIUM : WindowWidthSizeClass.EXPANDED;
            }
            throw new IllegalArgumentException(("Width must be positive, received " + dpWidth).toString());
        }

        private Companion() {
        }
    }

    private WindowWidthSizeClass(int i) {
        this.rawValue = i;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return other != null && WindowWidthSizeClass.class == other.getClass() && this.rawValue == ((WindowWidthSizeClass) other).rawValue;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getRawValue() {
        return this.rawValue;
    }

    @NotNull
    public String toString() {
        return "WindowWidthSizeClass: ".concat(equals(COMPACT) ? "COMPACT" : equals(MEDIUM) ? "MEDIUM" : equals(EXPANDED) ? "EXPANDED" : "UNKNOWN");
    }
}
