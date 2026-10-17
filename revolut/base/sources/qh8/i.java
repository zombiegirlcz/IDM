package qh8;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import qgk.f1;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ji8.d f246526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f246527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f246528c = e4m.b.b(new f1(this, 3));

    public i(k kVar, l lVar, ji8.d dVar) {
        this.f246527b = lVar;
        this.f246526a = dVar;
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f246527b.d.get());
    }
}
