package ie;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final le.c0 f160507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f160509c;

    public b(le.c0 c0Var, String str, File file) {
        this.f160507a = c0Var;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f160508b = str;
        this.f160509c = file;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f160507a.equals(bVar.f160507a) && this.f160508b.equals(bVar.f160508b) && this.f160509c.equals(bVar.f160509c);
    }

    public final int hashCode() {
        return ((((this.f160507a.hashCode() ^ 1000003) * 1000003) ^ this.f160508b.hashCode()) * 1000003) ^ this.f160509c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f160507a + ", sessionId=" + this.f160508b + ", reportFile=" + this.f160509c + "}";
    }
}
