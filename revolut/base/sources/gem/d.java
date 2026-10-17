package gem;

import ch.qos.logback.core.CoreConstants;
import kem.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f143319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f143320c;

    public d(String key, Object value, t headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f143318a = key;
        this.f143319b = value;
        this.f143320c = headers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f143318a, dVar.f143318a) && Intrinsics.f(this.f143319b, dVar.f143319b) && this.f143320c.equals(dVar.f143320c);
    }

    public final int hashCode() {
        return (((this.f143318a.hashCode() * 31) + this.f143319b.hashCode()) * 31) + this.f143320c.hashCode();
    }

    public final String toString() {
        return "FormPart(key=" + this.f143318a + ", value=" + this.f143319b + ", headers=" + this.f143320c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
