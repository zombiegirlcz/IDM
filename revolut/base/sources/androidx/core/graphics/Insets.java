package androidx.core.graphics;

import android.graphics.Rect;
import ch.qos.logback.core.CoreConstants;
import j6.a;

/* JADX INFO: loaded from: classes.dex */
public final class Insets {
    public static final Insets NONE = new Insets(0, 0, 0, 0);
    public final int bottom;
    public final int left;
    public final int right;
    public final int top;

    public static class Api29Impl {
        public static android.graphics.Insets of(int i, int i2, int i3, int i5) {
            return android.graphics.Insets.of(i, i2, i3, i5);
        }
    }

    private Insets(int i, int i2, int i3, int i5) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i5;
    }

    public static Insets add(Insets insets, Insets insets2) {
        return of(insets.left + insets2.left, insets.top + insets2.top, insets.right + insets2.right, insets.bottom + insets2.bottom);
    }

    public static Insets max(Insets insets, Insets insets2) {
        return of(Math.max(insets.left, insets2.left), Math.max(insets.top, insets2.top), Math.max(insets.right, insets2.right), Math.max(insets.bottom, insets2.bottom));
    }

    public static Insets min(Insets insets, Insets insets2) {
        return of(Math.min(insets.left, insets2.left), Math.min(insets.top, insets2.top), Math.min(insets.right, insets2.right), Math.min(insets.bottom, insets2.bottom));
    }

    public static Insets of(int i, int i2, int i3, int i5) {
        return (i == 0 && i2 == 0 && i3 == 0 && i5 == 0) ? NONE : new Insets(i, i2, i3, i5);
    }

    public static Insets subtract(Insets insets, Insets insets2) {
        return of(insets.left - insets2.left, insets.top - insets2.top, insets.right - insets2.right, insets.bottom - insets2.bottom);
    }

    public static Insets toCompatInsets(android.graphics.Insets insets) {
        return of(insets.left, insets.top, insets.right, insets.bottom);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || Insets.class != obj2.getClass()) {
            return false;
        }
        Insets insets = (Insets) obj2;
        return this.bottom == insets.bottom && this.left == insets.left && this.right == insets.right && this.top == insets.top;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    public android.graphics.Insets toPlatformInsets() {
        return Api29Impl.of(this.left, this.top, this.right, this.bottom);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("Insets{left=");
        sb6.append(this.left);
        sb6.append(", top=");
        sb6.append(this.top);
        sb6.append(", right=");
        sb6.append(this.right);
        sb6.append(", bottom=");
        return a.t(sb6, this.bottom, CoreConstants.CURLY_RIGHT);
    }

    public static Insets of(Rect rect) {
        return of(rect.left, rect.top, rect.right, rect.bottom);
    }
}
