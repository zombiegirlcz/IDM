package kotlin.reflect.jvm.internal.impl.km;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class KmVersion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f186815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f186816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f186817c;

    public KmVersion(int i, int i2, int i3) {
        this.f186815a = i;
        this.f186816b = i2;
        this.f186817c = i3;
    }

    public final int component1() {
        return this.f186815a;
    }

    public final int component2() {
        return this.f186816b;
    }

    public final int component3() {
        return this.f186817c;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof KmVersion)) {
            return false;
        }
        KmVersion kmVersion = (KmVersion) obj2;
        return this.f186815a == kmVersion.f186815a && this.f186816b == kmVersion.f186816b && this.f186817c == kmVersion.f186817c;
    }

    public int hashCode() {
        return Integer.hashCode(this.f186817c) + a.b(this.f186816b, Integer.hashCode(this.f186815a) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f186815a);
        sb6.append(CoreConstants.DOT);
        sb6.append(this.f186816b);
        sb6.append(CoreConstants.DOT);
        sb6.append(this.f186817c);
        return sb6.toString();
    }
}
