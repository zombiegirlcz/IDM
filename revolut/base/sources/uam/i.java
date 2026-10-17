package uam;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f278698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f278699b;

    public i(int i, int i2) {
        this.f278698a = i;
        this.f278699b = i2;
    }

    public final int a() {
        return this.f278698a * this.f278699b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f278698a == iVar.f278698a && this.f278699b == iVar.f278699b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f278699b) + (Integer.hashCode(this.f278698a) * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Resolution(width=");
        sb6.append(this.f278698a);
        sb6.append(", height=");
        return j6.a.t(sb6, this.f278699b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
