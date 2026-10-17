package eh;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f125676a;

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        return (obj2 instanceof a) && this.f125676a == ((a) obj2).f125676a && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f125676a), Boolean.FALSE, null, null);
    }
}
