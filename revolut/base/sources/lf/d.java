package lf;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import e4m.e;
import pd.g;

/* JADX INFO: loaded from: classes.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pf.a f194622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pf.a f194623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pf.a f194624c;
    public final pf.a d;
    public final pbb.a e;
    public final pbb.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pbb.a f194625g;

    public d(pf.a aVar, pf.a aVar2, pf.a aVar3, pf.a aVar4, pbb.a aVar5, pbb.a aVar6, pbb.a aVar7) {
        this.f194622a = aVar;
        this.f194623b = aVar2;
        this.f194624c = aVar3;
        this.d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.f194625g = aVar7;
    }

    @Override // phm.a
    public final Object get() {
        return new b((g) this.f194622a.get(), (cf.b) this.f194623b.get(), (df.e) this.f194624c.get(), (cf.b) this.d.get(), (RemoteConfigManager) this.e.get(), (nf.a) this.f.get(), (SessionManager) this.f194625g.get());
    }
}
