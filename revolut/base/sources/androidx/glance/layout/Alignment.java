package androidx.glance.layout;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0003\u0012\u0013\u0014B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/glance/layout/Alignment;", "", "horizontal", "Landroidx/glance/layout/Alignment$Horizontal;", "vertical", "Landroidx/glance/layout/Alignment$Vertical;", "(IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHorizontal-PGIyAqw", "()I", "I", "getVertical-mnfRV0w", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "Horizontal", "Vertical", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Alignment {
    public static final int $stable = 0;
    private static final int Bottom;

    @NotNull
    private static final Alignment BottomCenter;

    @NotNull
    private static final Alignment BottomEnd;

    @NotNull
    private static final Alignment BottomStart;

    @NotNull
    private static final Alignment Center;

    @NotNull
    private static final Alignment CenterEnd;
    private static final int CenterHorizontally;

    @NotNull
    private static final Alignment CenterStart;
    private static final int CenterVertically;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private static final int End;
    private static final int Start;
    private static final int Top;

    @NotNull
    private static final Alignment TopCenter;

    @NotNull
    private static final Alignment TopEnd;

    @NotNull
    private static final Alignment TopStart;
    private final int horizontal;
    private final int vertical;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR \u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR \u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000fR \u0010\u0015\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/glance/layout/Alignment$Companion;", "", "<init>", "()V", "Landroidx/glance/layout/Alignment;", "TopStart", "Landroidx/glance/layout/Alignment;", "getTopStart", "()Landroidx/glance/layout/Alignment;", "Center", "getCenter", "Landroidx/glance/layout/Alignment$Vertical;", "Top", "I", "getTop-mnfRV0w", "()I", "CenterVertically", "getCenterVertically-mnfRV0w", "Landroidx/glance/layout/Alignment$Horizontal;", "Start", "getStart-PGIyAqw", "CenterHorizontally", "getCenterHorizontally-PGIyAqw", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Alignment getCenter() {
            return Alignment.Center;
        }

        /* JADX INFO: renamed from: getCenterHorizontally-PGIyAqw, reason: not valid java name */
        public final int m3513getCenterHorizontallyPGIyAqw() {
            return Alignment.CenterHorizontally;
        }

        /* JADX INFO: renamed from: getCenterVertically-mnfRV0w, reason: not valid java name */
        public final int m3514getCenterVerticallymnfRV0w() {
            return Alignment.CenterVertically;
        }

        /* JADX INFO: renamed from: getStart-PGIyAqw, reason: not valid java name */
        public final int m3515getStartPGIyAqw() {
            return Alignment.Start;
        }

        /* JADX INFO: renamed from: getTop-mnfRV0w, reason: not valid java name */
        public final int m3516getTopmnfRV0w() {
            return Alignment.Top;
        }

        @NotNull
        public final Alignment getTopStart() {
            return Alignment.TopStart;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/glance/layout/Alignment$Horizontal;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Horizontal {
        private final int value;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final int Start = m3518constructorimpl(0);
        private static final int CenterHorizontally = m3518constructorimpl(1);
        private static final int End = m3518constructorimpl(2);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/glance/layout/Alignment$Horizontal$Companion;", "", "()V", "CenterHorizontally", "Landroidx/glance/layout/Alignment$Horizontal;", "getCenterHorizontally-PGIyAqw", "()I", "I", "End", "getEnd-PGIyAqw", "Start", "getStart-PGIyAqw", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getCenterHorizontally-PGIyAqw, reason: not valid java name */
            public final int m3524getCenterHorizontallyPGIyAqw() {
                return Horizontal.CenterHorizontally;
            }

            /* JADX INFO: renamed from: getEnd-PGIyAqw, reason: not valid java name */
            public final int m3525getEndPGIyAqw() {
                return Horizontal.End;
            }

            /* JADX INFO: renamed from: getStart-PGIyAqw, reason: not valid java name */
            public final int m3526getStartPGIyAqw() {
                return Horizontal.Start;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Horizontal(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Horizontal m3517boximpl(int i) {
            return new Horizontal(i);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        private static int m3518constructorimpl(int i) {
            return i;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3519equalsimpl(int i, Object obj2) {
            return (obj2 instanceof Horizontal) && i == ((Horizontal) obj2).getValue();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3520equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3521hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3522toStringimpl(int i) {
            return a.k(CoreConstants.RIGHT_PARENTHESIS_CHAR, "Horizontal(value=", i);
        }

        public boolean equals(Object obj2) {
            return m3519equalsimpl(this.value, obj2);
        }

        public int hashCode() {
            return m3521hashCodeimpl(this.value);
        }

        public String toString() {
            return m3522toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/glance/layout/Alignment$Vertical;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Vertical {
        private final int value;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final int Top = m3528constructorimpl(0);
        private static final int CenterVertically = m3528constructorimpl(1);
        private static final int Bottom = m3528constructorimpl(2);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/glance/layout/Alignment$Vertical$Companion;", "", "()V", "Bottom", "Landroidx/glance/layout/Alignment$Vertical;", "getBottom-mnfRV0w", "()I", "I", "CenterVertically", "getCenterVertically-mnfRV0w", "Top", "getTop-mnfRV0w", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getBottom-mnfRV0w, reason: not valid java name */
            public final int m3534getBottommnfRV0w() {
                return Vertical.Bottom;
            }

            /* JADX INFO: renamed from: getCenterVertically-mnfRV0w, reason: not valid java name */
            public final int m3535getCenterVerticallymnfRV0w() {
                return Vertical.CenterVertically;
            }

            /* JADX INFO: renamed from: getTop-mnfRV0w, reason: not valid java name */
            public final int m3536getTopmnfRV0w() {
                return Vertical.Top;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Vertical(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Vertical m3527boximpl(int i) {
            return new Vertical(i);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        private static int m3528constructorimpl(int i) {
            return i;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3529equalsimpl(int i, Object obj2) {
            return (obj2 instanceof Vertical) && i == ((Vertical) obj2).getValue();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3530equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3531hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3532toStringimpl(int i) {
            return a.k(CoreConstants.RIGHT_PARENTHESIS_CHAR, "Vertical(value=", i);
        }

        public boolean equals(Object obj2) {
            return m3529equalsimpl(this.value, obj2);
        }

        public int hashCode() {
            return m3531hashCodeimpl(this.value);
        }

        public String toString() {
            return m3532toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        Horizontal.Companion companion = Horizontal.INSTANCE;
        int iM3526getStartPGIyAqw = companion.m3526getStartPGIyAqw();
        Vertical.Companion companion2 = Vertical.INSTANCE;
        TopStart = new Alignment(iM3526getStartPGIyAqw, companion2.m3536getTopmnfRV0w(), defaultConstructorMarker);
        TopCenter = new Alignment(companion.m3524getCenterHorizontallyPGIyAqw(), companion2.m3536getTopmnfRV0w(), defaultConstructorMarker);
        TopEnd = new Alignment(companion.m3525getEndPGIyAqw(), companion2.m3536getTopmnfRV0w(), defaultConstructorMarker);
        CenterStart = new Alignment(companion.m3526getStartPGIyAqw(), companion2.m3535getCenterVerticallymnfRV0w(), defaultConstructorMarker);
        Center = new Alignment(companion.m3524getCenterHorizontallyPGIyAqw(), companion2.m3535getCenterVerticallymnfRV0w(), defaultConstructorMarker);
        CenterEnd = new Alignment(companion.m3525getEndPGIyAqw(), companion2.m3535getCenterVerticallymnfRV0w(), defaultConstructorMarker);
        BottomStart = new Alignment(companion.m3526getStartPGIyAqw(), companion2.m3534getBottommnfRV0w(), defaultConstructorMarker);
        BottomCenter = new Alignment(companion.m3524getCenterHorizontallyPGIyAqw(), companion2.m3534getBottommnfRV0w(), defaultConstructorMarker);
        BottomEnd = new Alignment(companion.m3525getEndPGIyAqw(), companion2.m3534getBottommnfRV0w(), defaultConstructorMarker);
        Top = companion2.m3536getTopmnfRV0w();
        CenterVertically = companion2.m3535getCenterVerticallymnfRV0w();
        Bottom = companion2.m3534getBottommnfRV0w();
        Start = companion.m3526getStartPGIyAqw();
        CenterHorizontally = companion.m3524getCenterHorizontallyPGIyAqw();
        End = companion.m3525getEndPGIyAqw();
    }

    public /* synthetic */ Alignment(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Alignment.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.i(other, "null cannot be cast to non-null type androidx.glance.layout.Alignment");
        Alignment alignment = (Alignment) other;
        return Horizontal.m3520equalsimpl0(this.horizontal, alignment.horizontal) && Vertical.m3530equalsimpl0(this.vertical, alignment.vertical);
    }

    /* JADX INFO: renamed from: getHorizontal-PGIyAqw, reason: not valid java name and from getter */
    public final int getHorizontal() {
        return this.horizontal;
    }

    /* JADX INFO: renamed from: getVertical-mnfRV0w, reason: not valid java name and from getter */
    public final int getVertical() {
        return this.vertical;
    }

    public int hashCode() {
        return Vertical.m3531hashCodeimpl(this.vertical) + (Horizontal.m3521hashCodeimpl(this.horizontal) * 31);
    }

    @NotNull
    public String toString() {
        return "Alignment(horizontal=" + ((Object) Horizontal.m3522toStringimpl(this.horizontal)) + ", vertical=" + ((Object) Vertical.m3532toStringimpl(this.vertical)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private Alignment(int i, int i2) {
        this.horizontal = i;
        this.vertical = i2;
    }
}
