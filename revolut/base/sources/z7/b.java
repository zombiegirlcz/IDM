package z7;

import ch.qos.logback.core.CoreConstants;
import java.io.File;
import zsc.p;

/* JADX INFO: loaded from: classes16.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f319832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f319833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File[] f319834c;
    public final File[] d;
    public boolean e;
    public jji.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f319835g;

    public b(c cVar, String str) {
        this.f319835g = cVar;
        this.f319832a = str;
        int i = cVar.f319839g;
        File file = cVar.f319836a;
        this.f319833b = new long[i];
        this.f319834c = new File[i];
        this.d = new File[i];
        StringBuilder sb6 = new StringBuilder(str);
        sb6.append(CoreConstants.DOT);
        int length = sb6.length();
        for (int i2 = 0; i2 < i; i2++) {
            sb6.append(i2);
            this.f319834c[i2] = new File(file, sb6.toString());
            sb6.append(".tmp");
            this.d[i2] = new File(file, sb6.toString());
            sb6.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb6 = new StringBuilder();
        for (long j2 : this.f319833b) {
            sb6.append(p.SPACE_CHAR);
            sb6.append(j2);
        }
        return sb6.toString();
    }
}
