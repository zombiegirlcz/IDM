package androidx.compose.ui.unit;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 32\u00020\u0001:\u00013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u0013R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0018\u0012\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0018\u0012\u0004\b!\u0010\u001b\u001a\u0004\b \u0010\u0013R\u001a\u0010$\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u001b\u001a\u0004\b\"\u0010\u0013R\u001a\u0010'\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b&\u0010\u001b\u001a\u0004\b%\u0010\u0013R\u001a\u0010,\u001a\u00020(8FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001b\u001a\u0004\b)\u0010*R\u001a\u0010-\u001a\u00020\u00158FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010\u001b\u001a\u0004\b-\u0010.R\u0011\u00102\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u0010*¨\u00064"}, d2 = {"Landroidx/compose/ui/unit/IntRect;", "", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "translateX", "translateY", "translate", "(II)Landroidx/compose/ui/unit/IntRect;", "", "toString", "()Ljava/lang/String;", "copy", "(IIII)Landroidx/compose/ui/unit/IntRect;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLeft", "getLeft$annotations", "()V", "getTop", "getTop$annotations", "getRight", "getRight$annotations", "getBottom", "getBottom$annotations", "getWidth", "getWidth$annotations", "width", "getHeight", "getHeight$annotations", "height", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "getSize-YbymL2g$annotations", "size", "isEmpty", "()Z", "isEmpty$annotations", "Landroidx/compose/ui/unit/IntOffset;", "getTopLeft-nOcc-ac", "topLeft", "Companion", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IntRect {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final IntRect Zero = new IntRect(0, 0, 0, 0);
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/unit/IntRect$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/IntRect;", "Zero", "Landroidx/compose/ui/unit/IntRect;", "getZero", "()Landroidx/compose/ui/unit/IntRect;", "getZero$annotations", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IntRect getZero() {
            return IntRect.Zero;
        }

        private Companion() {
        }
    }

    public IntRect(int i, int i2, int i3, int i5) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i5;
    }

    public static /* synthetic */ IntRect copy$default(IntRect intRect, int i, int i2, int i3, int i5, int i6, Object obj2) {
        if ((i6 & 1) != 0) {
            i = intRect.left;
        }
        if ((i6 & 2) != 0) {
            i2 = intRect.top;
        }
        if ((i6 & 4) != 0) {
            i3 = intRect.right;
        }
        if ((i6 & 8) != 0) {
            i5 = intRect.bottom;
        }
        return intRect.copy(i, i2, i3, i5);
    }

    @NotNull
    public final IntRect copy(int left, int top, int right, int bottom) {
        return new IntRect(left, top, right, bottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntRect)) {
            return false;
        }
        IntRect intRect = (IntRect) other;
        return this.left == intRect.left && this.top == intRect.top && this.right == intRect.right && this.bottom == intRect.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getHeight() {
        return this.bottom - this.top;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m3347getSizeYbymL2g() {
        return IntSize.m3351constructorimpl((((long) getHeight()) & BodyPartID.bodyIdMax) | (((long) getWidth()) << 32));
    }

    public final int getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: getTopLeft-nOcc-ac, reason: not valid java name */
    public final long m3348getTopLeftnOccac() {
        return IntOffset.m3329constructorimpl((((long) this.top) & BodyPartID.bodyIdMax) | (((long) this.left) << 32));
    }

    public final int getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return Integer.hashCode(this.bottom) + a.b(this.right, a.b(this.top, Integer.hashCode(this.left) * 31, 31), 31);
    }

    public final boolean isEmpty() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("IntRect.fromLTRB(");
        sb6.append(this.left);
        sb6.append(", ");
        sb6.append(this.top);
        sb6.append(", ");
        sb6.append(this.right);
        sb6.append(", ");
        return a.t(sb6, this.bottom, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @NotNull
    public final IntRect translate(int translateX, int translateY) {
        return new IntRect(this.left + translateX, this.top + translateY, this.right + translateX, this.bottom + translateY);
    }
}
