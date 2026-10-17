package wqb;

import java.util.Optional;
import jge.i;
import kotlin.jvm.internal.Intrinsics;
import om4.d0;
import retrofit2.Retrofit;
import vc.s;
import vf0.q;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f299430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cri.a f299431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u06.a f299432c;
    public final i d;
    public final voa.a e;
    public final e4m.e f = e4m.b.b(new wak.d(this, 15));

    public a(cri.a aVar, ee0.a aVar2, nj0.a aVar3, u06.a aVar4, voa.a aVar5, i iVar) {
        this.f299430a = aVar3;
        this.f299431b = aVar;
        this.f299432c = aVar4;
        this.d = iVar;
        this.e = aVar5;
    }

    public final q a() {
        c.Companion.getClass();
        return new q(25);
    }

    public final d0 b() {
        return new d0(this.d.a());
    }

    public final void c() {
        c.Companion.getClass();
    }

    public final vqb.b d() {
        return f();
    }

    public final Retrofit e() {
        return g();
    }

    public final vqb.b f() {
        q06.d dVarA = this.f299432c.a();
        s.j(dVarA);
        return new vqb.b(dVarA);
    }

    public final Retrofit g() {
        ik0.b retrofitFactory = ((nj0.d) this.f299430a).m();
        s.j(retrofitFactory);
        c.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Retrofit retrofitA = ik0.b.a(retrofitFactory, null, null, null, null, 31);
        s.k(retrofitA);
        return retrofitA;
    }

    public final Optional h() {
        return Optional.empty();
    }

    public final yqb.a i() {
        return new yqb.a();
    }

    public final yqb.b j() {
        return new yqb.b();
    }

    public final zqb.a k() {
        return new zqb.a();
    }
}
