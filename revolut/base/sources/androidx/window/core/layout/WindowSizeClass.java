package androidx.window.core.layout;

import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p.a;
import yhm.d;
import zhm.a0;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0018\u001a\u00020\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001d\u001a\u00020\u00198FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/window/core/layout/WindowSizeClass;", "", "", "minWidthDp", "minHeightDp", "<init>", "(II)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "getMinWidthDp", "getMinHeightDp", "Landroidx/window/core/layout/WindowWidthSizeClass;", "getWindowWidthSizeClass", "()Landroidx/window/core/layout/WindowWidthSizeClass;", "getWindowWidthSizeClass$annotations", "()V", "windowWidthSizeClass", "Landroidx/window/core/layout/WindowHeightSizeClass;", "getWindowHeightSizeClass", "()Landroidx/window/core/layout/WindowHeightSizeClass;", "getWindowHeightSizeClass$annotations", "windowHeightSizeClass", "Companion", "window-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WindowSizeClass {

    @NotNull
    public static final Set<WindowSizeClass> BREAKPOINTS_V1;

    @NotNull
    public static final Set<WindowSizeClass> BREAKPOINTS_V2;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final List<Integer> HEIGHT_DP_BREAKPOINTS_V1;

    @NotNull
    private static final List<Integer> HEIGHT_DP_BREAKPOINTS_V2;

    @NotNull
    private static final List<Integer> WIDTH_DP_BREAKPOINTS_V1;

    @NotNull
    private static final List<Integer> WIDTH_DP_BREAKPOINTS_V2;
    private final int minHeightDp;
    private final int minWidthDp;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0002J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/window/core/layout/WindowSizeClass$Companion;", "", "<init>", "()V", "WIDTH_DP_MEDIUM_LOWER_BOUND", "", "WIDTH_DP_EXPANDED_LOWER_BOUND", "WIDTH_DP_LARGE_LOWER_BOUND", "WIDTH_DP_EXTRA_LARGE_LOWER_BOUND", "HEIGHT_DP_MEDIUM_LOWER_BOUND", "HEIGHT_DP_EXPANDED_LOWER_BOUND", "WIDTH_DP_BREAKPOINTS_V1", "", "WIDTH_DP_BREAKPOINTS_V2", "HEIGHT_DP_BREAKPOINTS_V1", "HEIGHT_DP_BREAKPOINTS_V2", "createBreakpointSet", "", "Landroidx/window/core/layout/WindowSizeClass;", "widthBreakpoints", "heightBreakpoints", "BREAKPOINTS_V1", "BREAKPOINTS_V2", "compute", "dpWidth", "", "dpHeight", "window-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<WindowSizeClass> createBreakpointSet(List<Integer> widthBreakpoints, List<Integer> heightBreakpoints) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it8 = widthBreakpoints.iterator();
            while (it8.hasNext()) {
                int iIntValue = ((Number) it8.next()).intValue();
                List<Integer> list = heightBreakpoints;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                Iterator<T> it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(new WindowSizeClass(iIntValue, ((Number) it9.next()).intValue()));
                }
                a0.x(arrayList2, arrayList);
            }
            return d0.i1(arrayList);
        }

        @NotNull
        @d
        public final WindowSizeClass compute(float dpWidth, float dpHeight) {
            int i = 0;
            int i2 = dpWidth >= 840.0f ? 840 : dpWidth >= 600.0f ? 600 : 0;
            if (dpHeight >= 900.0f) {
                i = 900;
            } else if (dpHeight >= 480.0f) {
                i = DefaultFrameSampler.DESIRED_FRAME_WIDTH;
            }
            return new WindowSizeClass(i2, i);
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        List<Integer> listK = v.k(0, 600, 840);
        WIDTH_DP_BREAKPOINTS_V1 = listK;
        ArrayList arrayListE0 = d0.E0(v.k(1200, 1600), listK);
        WIDTH_DP_BREAKPOINTS_V2 = arrayListE0;
        List<Integer> listK2 = v.k(0, Integer.valueOf(DefaultFrameSampler.DESIRED_FRAME_WIDTH), 900);
        HEIGHT_DP_BREAKPOINTS_V1 = listK2;
        HEIGHT_DP_BREAKPOINTS_V2 = listK2;
        BREAKPOINTS_V1 = companion.createBreakpointSet(listK, listK2);
        BREAKPOINTS_V2 = companion.createBreakpointSet(arrayListE0, listK2);
    }

    public WindowSizeClass(int i, int i2) {
        this.minWidthDp = i;
        this.minHeightDp = i2;
        if (i < 0) {
            throw new IllegalArgumentException(a.k(CoreConstants.DOT, "Expected minWidthDp to be at least 0, minWidthDp: ", i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(a.k(CoreConstants.DOT, "Expected minHeightDp to be at least 0, minHeightDp: ", i2).toString());
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || WindowSizeClass.class != other.getClass()) {
            return false;
        }
        WindowSizeClass windowSizeClass = (WindowSizeClass) other;
        return this.minWidthDp == windowSizeClass.minWidthDp && this.minHeightDp == windowSizeClass.minHeightDp;
    }

    @NotNull
    public final WindowHeightSizeClass getWindowHeightSizeClass() {
        return WindowHeightSizeClass.INSTANCE.compute$window_core(this.minHeightDp);
    }

    @NotNull
    public final WindowWidthSizeClass getWindowWidthSizeClass() {
        return WindowWidthSizeClass.INSTANCE.compute$window_core(this.minWidthDp);
    }

    public int hashCode() {
        return (this.minWidthDp * 31) + this.minHeightDp;
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("WindowSizeClass(minWidthDp=");
        sb6.append(this.minWidthDp);
        sb6.append(", minHeightDp=");
        return j6.a.t(sb6, this.minHeightDp, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
