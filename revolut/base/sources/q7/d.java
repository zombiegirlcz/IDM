package q7;

import ce9.m;
import cpi.g;
import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Closeable {
    public static final String[] e = new String[128];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f242723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f242724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f242725c;
    public int[] d;

    static {
        for (int i = 0; i <= 31; i++) {
            e[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract void d();

    public abstract void f();

    public abstract void g();

    public final String getPath() {
        return m.n(this.f242723a, this.f242724b, this.f242725c, this.d);
    }

    public abstract void h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract double k();

    public abstract int l();

    public abstract String m();

    public abstract c n();

    public final void o(int i) {
        int i2 = this.f242723a;
        int[] iArr = this.f242724b;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new a("Nesting too deep at " + getPath());
            }
            this.f242724b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f242725c;
            this.f242725c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.d;
            this.d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f242724b;
        int i3 = this.f242723a;
        this.f242723a = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract int p(g gVar);

    public abstract void q();

    public abstract void r();

    public final void s(String str) throws b {
        StringBuilder sbL = v0.a.l(str, " at path ");
        sbL.append(getPath());
        throw new b(sbL.toString());
    }
}
