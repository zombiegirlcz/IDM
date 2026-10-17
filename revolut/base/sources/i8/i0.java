package i8;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public final class i0 implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f159376b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f159377a;

    public i0(u uVar) {
        this.f159377a = uVar;
    }

    @Override // i8.u
    public final t a(Object obj2, int i, int i2, c8.k kVar) {
        return this.f159377a.a(new k(((Uri) obj2).toString()), i, i2, kVar);
    }

    @Override // i8.u
    public final boolean b(Object obj2) {
        return f159376b.contains(((Uri) obj2).getScheme());
    }
}
