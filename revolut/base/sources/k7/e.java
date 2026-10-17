package k7;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f181763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f181764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f181765c;
    public final String d;
    public final String e;

    public e(ArrayList arrayList, char c2, double d, String str, String str2) {
        this.f181763a = arrayList;
        this.f181764b = c2;
        this.f181765c = d;
        this.d = str;
        this.e = str2;
    }

    public static int a(char c2, String str, String str2) {
        return str2.hashCode() + p.a.c(c2 * 31, 31, str);
    }

    public final int hashCode() {
        return a(this.f181764b, this.e, this.d);
    }
}
