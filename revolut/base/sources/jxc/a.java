package jxc;

import c21.b;
import c21.e;
import h30.q;
import ks0.n;
import kxc.f;
import lu7.m0;
import ne0.d;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee0.a f179133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f179134b;

    public a(e eVar, ee0.a aVar) {
        this.f179133a = aVar;
        this.f179134b = eVar;
    }

    public final n a() {
        Retrofit retrofitI = ((b) this.f179134b).i();
        s.j(retrofitI);
        return new n(new q(m0.D(retrofitI), new f(), new d()));
    }
}
