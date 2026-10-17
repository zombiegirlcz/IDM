package bi;

import ch.qos.logback.core.net.SyslogConstants;
import com.youTransactor.uCube.rpc.Constants;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: loaded from: classes17.dex */
public class e {
    public static final e[] i = {new e(3, 5, 8, 8, false, 1, 3, 5), new e(5, 7, 10, 10, false, 1, 5, 7), new e(5, 7, 16, 6, true, 1, 5, 7), new e(8, 10, 12, 12, false, 1, 8, 10), new e(10, 11, 14, 6, true, 2, 10, 11), new e(12, 12, 14, 14, false, 1, 12, 12), new e(16, 14, 24, 10, true, 1, 16, 14), new e(18, 14, 16, 16, false, 1, 18, 14), new e(22, 18, 18, 18, false, 1, 22, 18), new e(22, 18, 16, 10, true, 2, 22, 18), new e(30, 20, 20, 20, false, 1, 30, 20), new e(32, 24, 16, 14, true, 2, 32, 24), new e(36, 24, 22, 22, false, 1, 36, 24), new e(44, 28, 24, 24, false, 1, 44, 28), new e(49, 28, 22, 14, true, 2, 49, 28), new e(62, 36, 14, 14, false, 4, 62, 36), new e(86, 42, 16, 16, false, 4, 86, 42), new e(114, 48, 18, 18, false, 4, 114, 48), new e(SyslogConstants.LOG_LOCAL2, 56, 20, 20, false, 4, SyslogConstants.LOG_LOCAL2, 56), new e(174, 68, 22, 22, false, 4, 174, 68), new e(Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2, 84, 24, 24, false, 4, 102, 42), new e(280, 112, 14, 14, false, 16, 140, 56), new e(368, SyslogConstants.LOG_LOCAL2, 16, 16, false, 16, 92, 36), new e(456, 192, 18, 18, false, 16, 114, 48), new e(576, BERTags.FLAGS, 20, 20, false, 16, SyslogConstants.LOG_LOCAL2, 56), new e(696, 272, 22, 22, false, 16, 174, 68), new e(816, 336, 24, 24, false, 16, 136, 56), new e(1050, 408, 18, 18, false, 36, 175, 68), new e(1304, 496, 20, 20, false, 36, Constants.TAG_ACE_LAYER_VERSION, 62), new a(1558, 620, 22, 22, false, 36, -1, 62)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15349c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15351h;

    public e(int i2, int i3, int i5, int i6, boolean z, int i21, int i22, int i32) {
        this.f15347a = z;
        this.f15348b = i2;
        this.f15349c = i3;
        this.d = i5;
        this.e = i6;
        this.f = i21;
        this.f15350g = i22;
        this.f15351h = i32;
    }

    public static e e(int i2, f fVar) {
        for (int i3 = 0; i3 < 30; i3++) {
            e eVar = i[i3];
            if (!(fVar == f.FORCE_SQUARE && eVar.f15347a) && ((fVar != f.FORCE_RECTANGLE || eVar.f15347a) && i2 <= eVar.f15348b)) {
                return eVar;
            }
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i2)));
    }

    public int a(int i2) {
        return this.f15350g;
    }

    public final int b() {
        int i2 = this.f;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2 && i2 != 4) {
                if (i2 == 16) {
                    return 4;
                }
                if (i2 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i3;
    }

    public int c() {
        return this.f15348b / this.f15350g;
    }

    public final int d() {
        int i2 = this.f;
        if (i2 == 1 || i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f15347a ? "Rectangular Symbol:" : "Square Symbol:");
        sb6.append(" data region ");
        int i2 = this.d;
        sb6.append(i2);
        sb6.append('x');
        int i3 = this.e;
        sb6.append(i3);
        sb6.append(", symbol size ");
        sb6.append((b() * i2) + (b() << 1));
        sb6.append('x');
        sb6.append((d() * i3) + (d() << 1));
        sb6.append(", symbol data size ");
        sb6.append(b() * i2);
        sb6.append('x');
        sb6.append(d() * i3);
        sb6.append(", codewords ");
        sb6.append(this.f15348b);
        sb6.append('+');
        sb6.append(this.f15349c);
        return sb6.toString();
    }
}
