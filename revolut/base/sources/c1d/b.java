package c1d;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f20449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f20450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f20451c;

    public b(a aVar) {
        this.f20449a = aVar;
        int i = 8;
        this.f20450b = e4m.b.b(new bt7.e(aVar, this, 0, i));
        this.f20451c = e4m.b.b(new bt7.e(aVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        i1d.d extension = (i1d.d) this.f20450b.get();
        f1d.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        s.k(extension);
        return ImmutableSet.of(extension);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
