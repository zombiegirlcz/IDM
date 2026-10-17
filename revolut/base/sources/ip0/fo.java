package ip0;

import com.revolut.core.ui_kit_resources.R$attr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class fo {

    @NotNull
    public static final eo Companion = new eo();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fo f164291b = new fo(R$attr.uikit_colorPerformancePositive);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final fo f164292c = new fo(R$attr.uikit_colorDeepGrey);
    public static final fo d = new fo(R$attr.uikit_colorPerformanceNegative);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f164293a;

    public fo(int i) {
        this.f164293a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof fo) && this.f164293a == ((fo) obj2).f164293a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f164293a);
    }
}
