package zu8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc.impl.idnow.video_ident.screen.IdnowVideoIdentScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdnowVideoIdentScreenContract$InputData f325407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f325408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f325409c;
    public final e4m.e d;

    public w(c0 c0Var, v vVar, IdnowVideoIdentScreenContract$InputData idnowVideoIdentScreenContract$InputData) {
        this.f325408b = c0Var;
        this.f325407a = idnowVideoIdentScreenContract$InputData;
        this.f325409c = e4m.b.b(new zpc.m(c0Var, this, 0, 14));
        this.d = e4m.b.b(new zpc.m(c0Var, this, 1, 14));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f325409c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
