package ei;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f126324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f126325b;

    public b(int i) {
        this.f126324a = new byte[i];
        this.f126325b = 0;
    }

    public byte[] a() {
        return this.f126324a;
    }

    public int b() {
        return this.f126325b;
    }

    public /* synthetic */ b(byte[] bArr) {
        this(bArr, 1);
    }

    public b(byte[] iv2, int i) {
        Intrinsics.checkNotNullParameter(iv2, "iv");
        this.f126324a = iv2;
        this.f126325b = i;
    }
}
