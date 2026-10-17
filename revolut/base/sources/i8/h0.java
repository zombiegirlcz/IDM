package i8;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public final class h0 implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f159371b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f159372a;

    public h0(g0 g0Var) {
        this.f159372a = g0Var;
    }

    @Override // i8.u
    public final t a(Object obj2, int i, int i2, c8.k kVar) {
        com.bumptech.glide.load.data.e aVar;
        Uri uri2 = (Uri) obj2;
        x8.e eVar = new x8.e(uri2);
        g0 g0Var = (g0) this.f159372a;
        switch (g0Var.f159366a) {
            case 0:
                aVar = new com.bumptech.glide.load.data.a(uri2, g0Var.f159367b, 0);
                break;
            case 1:
                aVar = new com.bumptech.glide.load.data.a(uri2, g0Var.f159367b, 1);
                break;
            default:
                aVar = new com.bumptech.glide.load.data.o(g0Var.f159367b, uri2);
                break;
        }
        return new t(eVar, aVar);
    }

    @Override // i8.u
    public final boolean b(Object obj2) {
        return f159371b.contains(((Uri) obj2).getScheme());
    }
}
