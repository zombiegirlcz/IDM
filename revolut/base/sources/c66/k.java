package c66;

import kotlin.jvm.internal.Intrinsics;
import zhm.p;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f21687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f21688b;

    public k(byte[] plaintext, byte[] seed) {
        Intrinsics.checkNotNullParameter(plaintext, "plaintext");
        Intrinsics.checkNotNullParameter(seed, "seed");
        this.f21687a = plaintext;
        this.f21688b = seed;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        p.r(this.f21687a);
        p.r(this.f21688b);
    }

    public final e d() {
        e.Companion.getClass();
        byte[] plaintext = this.f21687a;
        Intrinsics.checkNotNullParameter(plaintext, "plaintext");
        aim.e eVarB = u.b();
        int length = plaintext.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i5 = i3 + 1;
            if (plaintext[i] == 32) {
                eVarB.add(p.m(plaintext, i2, i3));
                i2 = i5;
            }
            i++;
            i3 = i5;
        }
        eVarB.add(p.m(plaintext, i2, plaintext.length));
        return new e(u.a(eVarB));
    }
}
