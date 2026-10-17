package w0b;

import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f293678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f293679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f293680c;
    public final String d;
    public final Boolean e;

    public /* synthetic */ c(int i, long j2, long j3, int i2, String str, Boolean bool) {
        if (31 != (i & 31)) {
            j1.f(a.f293677a.getDescriptor(), i, 31);
            throw null;
        }
        this.f293678a = j2;
        this.f293679b = j3;
        this.f293680c = i2;
        this.d = str;
        this.e = bool;
    }
}
