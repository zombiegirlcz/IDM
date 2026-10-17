package mmm;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class n0 {

    @NotNull
    public static final m0 Companion = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f207291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f207292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f207293c;
    public boolean d;
    public final boolean e;
    public n0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n0 f207294g;

    public n0() {
        this.f207291a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final n0 a() {
        n0 n0Var = this.f;
        if (n0Var == this) {
            n0Var = null;
        }
        n0 n0Var2 = this.f207294g;
        Intrinsics.h(n0Var2);
        n0Var2.f = this.f;
        n0 n0Var3 = this.f;
        Intrinsics.h(n0Var3);
        n0Var3.f207294g = this.f207294g;
        this.f = null;
        this.f207294g = null;
        return n0Var;
    }

    public final void b(n0 segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f207294g = this;
        segment.f = this.f;
        n0 n0Var = this.f;
        Intrinsics.h(n0Var);
        n0Var.f207294g = segment;
        this.f = segment;
    }

    public final n0 c() {
        this.d = true;
        return new n0(this.f207291a, this.f207292b, this.f207293c, true, false);
    }

    public final void d(n0 sink, int i) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = sink.f207293c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (sink.d) {
                throw new IllegalArgumentException();
            }
            int i5 = sink.f207292b;
            if (i3 - i5 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f207291a;
            zhm.p.j(bArr, bArr, 0, i5, i2, 2);
            sink.f207293c -= sink.f207292b;
            sink.f207292b = 0;
        }
        byte[] bArr2 = sink.f207291a;
        int i6 = sink.f207293c;
        int i21 = this.f207292b;
        zhm.p.e(i6, this.f207291a, i21, bArr2, i21 + i);
        sink.f207293c += i;
        this.f207292b += i;
    }

    public n0(byte[] data, int i, int i2, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f207291a = data;
        this.f207292b = i;
        this.f207293c = i2;
        this.d = z;
        this.e = z3;
    }
}
