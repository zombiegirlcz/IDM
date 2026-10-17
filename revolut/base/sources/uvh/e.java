package uvh;

import android.content.Context;
import kq.h;
import oda.o;
import vc.s;
import vvh.l;
import wsg.n;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final usg.a f283468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iq.b f283469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f283470c;
    public final cm2.a d;
    public final o e;
    public final e f = this;

    public e(iq.b bVar, usg.a aVar, o oVar, sd0.c cVar, cm2.a aVar2, Context context) {
        this.f283468a = aVar;
        this.f283469b = bVar;
        this.f283470c = context;
        this.d = aVar2;
        this.e = oVar;
    }

    public final l a() {
        n nVarB = this.f283468a.b();
        zd0.a aVar = new zd0.a();
        h hVar = (h) this.f283469b.f167779n.get();
        s.j(hVar);
        return new l(nVarB, aVar, hVar, new vvh.a(this.f283470c), this.d.c());
    }

    public final l b() {
        return a();
    }
}
