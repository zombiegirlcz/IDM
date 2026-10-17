package pa6;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import p12.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f234351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f234352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234353c;

    public c(m mVar, b bVar) {
        this.f234351a = mVar;
        int i = 25;
        this.f234352b = e4m.b.b(new s0(this, 1, i));
        this.f234353c = e4m.b.b(new s0(this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
