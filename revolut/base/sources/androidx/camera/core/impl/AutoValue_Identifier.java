package androidx.camera.core.impl;

import com.revolut.data.database.models.openbanking.d;

/* JADX INFO: loaded from: classes15.dex */
final class AutoValue_Identifier extends Identifier {
    private final Object value;

    public AutoValue_Identifier(Object obj2) {
        if (obj2 == null) {
            throw new NullPointerException("Null value");
        }
        this.value = obj2;
    }

    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof Identifier) {
            return this.value.equals(((Identifier) obj2).getValue());
        }
        return false;
    }

    @Override // androidx.camera.core.impl.Identifier
    public Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() ^ 1000003;
    }

    public String toString() {
        return d.t(new StringBuilder("Identifier{value="), this.value, "}");
    }
}
