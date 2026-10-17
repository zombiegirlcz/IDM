package org.tensorflow.lite.support.label;

import j6.a;
import java.util.Objects;
import org.tensorflow.lite.annotations.UsedByReflection;

/* JADX INFO: loaded from: classes14.dex */
@UsedByReflection("TFLiteSupport/Task")
public final class Category {
    private static final int DEFAULT_INDEX = -1;
    private static final float TOLERANCE = 1.0E-6f;
    private final String displayName;
    private final int index;
    private final String label;
    private final float score;

    @UsedByReflection("TFLiteSupport/Task")
    public Category(String str, float f) {
        this(str, "", f, -1);
    }

    @UsedByReflection("TFLiteSupport/Task")
    public static Category create(String str, String str2, float f, int i) {
        return new Category(str, str2, f, i);
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof Category) {
            Category category = (Category) obj2;
            if (category.getLabel().equals(this.label) && category.getDisplayName().equals(this.displayName) && Math.abs(category.getScore() - this.score) < TOLERANCE && category.getIndex() == this.index) {
                return true;
            }
        }
        return false;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public int getIndex() {
        return this.index;
    }

    public String getLabel() {
        return this.label;
    }

    public float getScore() {
        return this.score;
    }

    public int hashCode() {
        return Objects.hash(this.label, this.displayName, Float.valueOf(this.score), Integer.valueOf(this.index));
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("<Category \"");
        sb6.append(this.label);
        sb6.append("\" (displayName=");
        sb6.append(this.displayName);
        sb6.append(" score=");
        sb6.append(this.score);
        sb6.append(" index=");
        return a.v(sb6, ")>", this.index);
    }

    private Category(String str, String str2, float f, int i) {
        this.label = str;
        this.displayName = str2;
        this.score = f;
        this.index = i;
    }

    @UsedByReflection("TFLiteSupport/Task")
    public static Category create(String str, String str2, float f) {
        return new Category(str, str2, f, -1);
    }
}
