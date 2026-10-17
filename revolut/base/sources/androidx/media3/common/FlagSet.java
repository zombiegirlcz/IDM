package androidx.media3.common;

import android.util.SparseBooleanArray;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class FlagSet {
    private final SparseBooleanArray flags;

    public boolean contains(int i) {
        return this.flags.get(i);
    }

    public boolean containsAny(int... iArr) {
        for (int i : iArr) {
            if (contains(i)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof FlagSet) {
            return this.flags.equals(((FlagSet) obj2).flags);
        }
        return false;
    }

    public int get(int i) {
        Preconditions.checkElementIndex(i, size());
        return this.flags.keyAt(i);
    }

    public int hashCode() {
        return this.flags.hashCode();
    }

    public int size() {
        return this.flags.size();
    }

    public static final class Builder {
        private boolean buildCalled;
        private final SparseBooleanArray flags = new SparseBooleanArray();

        public Builder add(int i) {
            Preconditions.checkState(!this.buildCalled);
            this.flags.append(i, true);
            return this;
        }

        public Builder addAll(int... iArr) {
            for (int i : iArr) {
                add(i);
            }
            return this;
        }

        public Builder addIf(int i, boolean z) {
            return z ? add(i) : this;
        }

        public FlagSet build() {
            Preconditions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new FlagSet(this.flags);
        }

        public Builder addAll(FlagSet flagSet) {
            for (int i = 0; i < flagSet.size(); i++) {
                add(flagSet.get(i));
            }
            return this;
        }
    }

    private FlagSet(SparseBooleanArray sparseBooleanArray) {
        this.flags = sparseBooleanArray;
    }
}
