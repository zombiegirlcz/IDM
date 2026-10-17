package ip0;

import com.revolut.core.ui_kit.models.CompositeClause;

/* JADX INFO: loaded from: classes19.dex */
public final class o90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f165638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f165639b;

    public o90(float f, CompositeClause compositeClause) {
        this.f165638a = f;
        this.f165639b = compositeClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o90)) {
            return false;
        }
        o90 o90Var = (o90) obj2;
        return Float.compare(this.f165638a, o90Var.f165638a) == 0 && this.f165639b.equals(o90Var.f165639b);
    }

    public final int hashCode() {
        return this.f165639b.hashCode() + (Float.hashCode(this.f165638a) * 31);
    }
}
