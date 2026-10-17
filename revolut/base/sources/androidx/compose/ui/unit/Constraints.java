package androidx.compose.ui.unit;

import ch.qos.logback.core.CoreConstants;
import ehe.n;
import j6.a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087@\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u0012\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\"\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u001a\u0010'\u001a\u00020\u00158FX\u0087\u0004¢\u0006\f\u0012\u0004\b&\u0010\u001a\u001a\u0004\b%\u0010!R\u001a\u0010*\u001a\u00020\u00158FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010\u001a\u001a\u0004\b(\u0010!\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006,"}, d2 = {"Landroidx/compose/ui/unit/Constraints;", "", "", "value", "constructor-impl", "(J)J", "", "minWidth", "maxWidth", "minHeight", "maxHeight", "copy-Zbe2FdA", "(JIIII)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getValue$annotations", "()V", "getMinWidth-impl", "(J)I", "getMaxWidth-impl", "getMinHeight-impl", "getMaxHeight-impl", "getHasBoundedWidth-impl", "(J)Z", "hasBoundedWidth", "getHasBoundedHeight-impl", "hasBoundedHeight", "getHasFixedWidth-impl", "getHasFixedWidth$annotations", "hasFixedWidth", "getHasFixedHeight-impl", "getHasFixedHeight$annotations", "hasFixedHeight", "Companion", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Constraints {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long value;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/unit/Constraints$Companion;", "", "<init>", "()V", "", "width", "height", "Landroidx/compose/ui/unit/Constraints;", "fixed-JhjzzOo", "(II)J", "fixed", "fixedWidth-OenEA2s", "(I)J", "fixedWidth", "minWidth", "maxWidth", "minHeight", "maxHeight", "fitPrioritizingWidth-Zbe2FdA", "(IIII)J", "fitPrioritizingWidth", "fitPrioritizingHeight-Zbe2FdA", "fitPrioritizingHeight", "Infinity", "I", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: fitPrioritizingHeight-Zbe2FdA, reason: not valid java name */
        public final long m3285fitPrioritizingHeightZbe2FdA(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            int i = 262142;
            int iMin = Math.min(minHeight, 262142);
            int iMin2 = maxHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(maxHeight, 262142);
            int i2 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i2 >= 8191) {
                if (i2 < 32767) {
                    i = 65534;
                } else if (i2 < 65535) {
                    i = 32766;
                } else {
                    if (i2 >= 262143) {
                        ConstraintsKt.throwInvalidConstraintsSizeException(i2);
                        throw new KotlinNothingValueException();
                    }
                    i = 8190;
                }
            }
            return ConstraintsKt.Constraints(Math.min(i, minWidth), maxWidth != Integer.MAX_VALUE ? Math.min(i, maxWidth) : Integer.MAX_VALUE, iMin, iMin2);
        }

        /* JADX INFO: renamed from: fitPrioritizingWidth-Zbe2FdA, reason: not valid java name */
        public final long m3286fitPrioritizingWidthZbe2FdA(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            int i = 262142;
            int iMin = Math.min(minWidth, 262142);
            int iMin2 = maxWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(maxWidth, 262142);
            int i2 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i2 >= 8191) {
                if (i2 < 32767) {
                    i = 65534;
                } else if (i2 < 65535) {
                    i = 32766;
                } else {
                    if (i2 >= 262143) {
                        ConstraintsKt.throwInvalidConstraintsSizeException(i2);
                        throw new KotlinNothingValueException();
                    }
                    i = 8190;
                }
            }
            return ConstraintsKt.Constraints(iMin, iMin2, Math.min(i, minHeight), maxHeight != Integer.MAX_VALUE ? Math.min(i, maxHeight) : Integer.MAX_VALUE);
        }

        /* JADX INFO: renamed from: fixed-JhjzzOo, reason: not valid java name */
        public final long m3287fixedJhjzzOo(int width, int height) {
            if (!((height >= 0) & (width >= 0))) {
                InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
            }
            return ConstraintsKt.createConstraints(width, width, height, height);
        }

        /* JADX INFO: renamed from: fixedWidth-OenEA2s, reason: not valid java name */
        public final long m3288fixedWidthOenEA2s(int width) {
            if (!(width >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("width must be >= 0");
            }
            return ConstraintsKt.createConstraints(width, width, 0, Integer.MAX_VALUE);
        }

        private Companion() {
        }
    }

    private /* synthetic */ Constraints(long j2) {
        this.value = j2;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Constraints m3268boximpl(long j2) {
        return new Constraints(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m3269constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: copy-Zbe2FdA, reason: not valid java name */
    public static final long m3270copyZbe2FdA(long j2, int i, int i2, int i3, int i5) {
        if (!(i2 >= i && i5 >= i3 && i >= 0 && i3 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return ConstraintsKt.createConstraints(i, i2, i3, i5);
    }

    /* JADX INFO: renamed from: copy-Zbe2FdA$default, reason: not valid java name */
    public static /* synthetic */ long m3271copyZbe2FdA$default(long j2, int i, int i2, int i3, int i5, int i6, Object obj2) {
        if ((i6 & 1) != 0) {
            i = m3281getMinWidthimpl(j2);
        }
        int i21 = i;
        if ((i6 & 2) != 0) {
            i2 = m3279getMaxWidthimpl(j2);
        }
        int i22 = i2;
        if ((i6 & 4) != 0) {
            i3 = m3280getMinHeightimpl(j2);
        }
        int i32 = i3;
        if ((i6 & 8) != 0) {
            i5 = m3278getMaxHeightimpl(j2);
        }
        return m3270copyZbe2FdA(j2, i21, i22, i32, i5);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3272equalsimpl(long j2, Object obj2) {
        return (obj2 instanceof Constraints) && j2 == ((Constraints) obj2).getValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3273equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX INFO: renamed from: getHasBoundedHeight-impl, reason: not valid java name */
    public static final boolean m3274getHasBoundedHeightimpl(long j2) {
        int i = (int) (3 & j2);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j2 >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: getHasBoundedWidth-impl, reason: not valid java name */
    public static final boolean m3275getHasBoundedWidthimpl(long j2) {
        int i = (int) (3 & j2);
        return (((int) (j2 >> 33)) & ((1 << n.a((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: getHasFixedHeight-impl, reason: not valid java name */
    public static final boolean m3276getHasFixedHeightimpl(long j2) {
        int i = (int) (3 & j2);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i5 = ((int) (j2 >> (i2 + 15))) & i3;
        int i6 = ((int) (j2 >> (i2 + 46))) & i3;
        return i5 == (i6 == 0 ? Integer.MAX_VALUE : i6 - 1);
    }

    /* JADX INFO: renamed from: getHasFixedWidth-impl, reason: not valid java name */
    public static final boolean m3277getHasFixedWidthimpl(long j2) {
        int i = (int) (3 & j2);
        int iA = (1 << n.a((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1;
        int i2 = ((int) (j2 >> 2)) & iA;
        int i3 = ((int) (j2 >> 33)) & iA;
        return i2 == (i3 == 0 ? Integer.MAX_VALUE : i3 - 1);
    }

    /* JADX INFO: renamed from: getMaxHeight-impl, reason: not valid java name */
    public static final int m3278getMaxHeightimpl(long j2) {
        int i = (int) (3 & j2);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j2 >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* JADX INFO: renamed from: getMaxWidth-impl, reason: not valid java name */
    public static final int m3279getMaxWidthimpl(long j2) {
        int i = (int) (3 & j2);
        int i2 = (int) (j2 >> 33);
        int iA = i2 & ((1 << n.a((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1);
        if (iA == 0) {
            return Integer.MAX_VALUE;
        }
        return iA - 1;
    }

    /* JADX INFO: renamed from: getMinHeight-impl, reason: not valid java name */
    public static final int m3280getMinHeightimpl(long j2) {
        int i = (int) (3 & j2);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j2 >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    /* JADX INFO: renamed from: getMinWidth-impl, reason: not valid java name */
    public static final int m3281getMinWidthimpl(long j2) {
        int i = (int) (3 & j2);
        return ((int) (j2 >> 2)) & ((1 << n.a((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3282hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3283toStringimpl(long j2) {
        int iM3279getMaxWidthimpl = m3279getMaxWidthimpl(j2);
        String strValueOf = iM3279getMaxWidthimpl == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM3279getMaxWidthimpl);
        int iM3278getMaxHeightimpl = m3278getMaxHeightimpl(j2);
        String strValueOf2 = iM3278getMaxHeightimpl != Integer.MAX_VALUE ? String.valueOf(iM3278getMaxHeightimpl) : "Infinity";
        StringBuilder sb6 = new StringBuilder("Constraints(minWidth = ");
        sb6.append(m3281getMinWidthimpl(j2));
        sb6.append(", maxWidth = ");
        sb6.append(strValueOf);
        sb6.append(", minHeight = ");
        sb6.append(m3280getMinHeightimpl(j2));
        sb6.append(", maxHeight = ");
        return a.u(sb6, strValueOf2, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public boolean equals(Object other) {
        return m3272equalsimpl(this.value, other);
    }

    public int hashCode() {
        return m3282hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m3283toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }
}
