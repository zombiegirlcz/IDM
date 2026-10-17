package androidx.compose.ui.unit;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087@\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u001a\u0010\b\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010!\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006'"}, d2 = {"Landroidx/compose/ui/unit/IntOffset;", "", "", "packedValue", "constructor-impl", "(J)J", "", "x", "y", "copy-iSbpLlY", "(JII)J", "copy", "other", "minus-qkQi6aY", "(JJ)J", "minus", "plus-qkQi6aY", "plus", "unaryMinus-nOcc-ac", "unaryMinus", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "J", "getPackedValue", "()J", "getX-impl", "(J)I", "getX$annotations", "()V", "getY-impl", "getY$annotations", "Companion", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntOffset {
    private final long packedValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = m3329constructorimpl(0);
    private static final long Max = m3329constructorimpl(9223372034707292159L);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/unit/IntOffset$Companion;", "", "<init>", "()V", "Zero", "Landroidx/compose/ui/unit/IntOffset;", "getZero-nOcc-ac", "()J", "J", "Max", "getMax-nOcc-ac", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getMax-nOcc-ac, reason: not valid java name */
        public final long m3342getMaxnOccac() {
            return IntOffset.Max;
        }

        /* JADX INFO: renamed from: getZero-nOcc-ac, reason: not valid java name */
        public final long m3343getZeronOccac() {
            return IntOffset.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ IntOffset(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntOffset m3328boximpl(long j2) {
        return new IntOffset(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m3329constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: copy-iSbpLlY, reason: not valid java name */
    public static final long m3330copyiSbpLlY(long j2, int i, int i2) {
        return m3329constructorimpl((((long) i) << 32) | (((long) i2) & BodyPartID.bodyIdMax));
    }

    /* JADX INFO: renamed from: copy-iSbpLlY$default, reason: not valid java name */
    public static /* synthetic */ long m3331copyiSbpLlY$default(long j2, int i, int i2, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            i = (int) (j2 >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = (int) (BodyPartID.bodyIdMax & j2);
        }
        return m3330copyiSbpLlY(j2, i, i2);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3332equalsimpl(long j2, Object obj2) {
        return (obj2 instanceof IntOffset) && j2 == ((IntOffset) obj2).getPackedValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3333equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX INFO: renamed from: getX-impl, reason: not valid java name */
    public static final int m3334getXimpl(long j2) {
        return (int) (j2 >> 32);
    }

    /* JADX INFO: renamed from: getY-impl, reason: not valid java name */
    public static final int m3335getYimpl(long j2) {
        return (int) (j2 & BodyPartID.bodyIdMax);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3336hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    /* JADX INFO: renamed from: minus-qkQi6aY, reason: not valid java name */
    public static final long m3337minusqkQi6aY(long j2, long j3) {
        return m3329constructorimpl((((long) (((int) (j2 >> 32)) - ((int) (j3 >> 32)))) << 32) | (((long) (((int) (j2 & BodyPartID.bodyIdMax)) - ((int) (j3 & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax));
    }

    /* JADX INFO: renamed from: plus-qkQi6aY, reason: not valid java name */
    public static final long m3338plusqkQi6aY(long j2, long j3) {
        return m3329constructorimpl((((long) (((int) (j2 >> 32)) + ((int) (j3 >> 32)))) << 32) | (((long) (((int) (j2 & BodyPartID.bodyIdMax)) + ((int) (j3 & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax));
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3339toStringimpl(long j2) {
        return "(" + m3334getXimpl(j2) + ", " + m3335getYimpl(j2) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX INFO: renamed from: unaryMinus-nOcc-ac, reason: not valid java name */
    public static final long m3340unaryMinusnOccac(long j2) {
        int i = -((int) (j2 >> 32));
        return m3329constructorimpl((((long) (-((int) (j2 & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (((long) i) << 32));
    }

    public boolean equals(Object other) {
        return m3332equalsimpl(this.packedValue, other);
    }

    public int hashCode() {
        return m3336hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m3339toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
