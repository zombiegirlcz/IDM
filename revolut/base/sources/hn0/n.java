package hn0;

import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.json.Json;
import lm0.o;
import lm0.p;
import mm0.q;
import rm0.s;
import rm0.u;

/* JADX INFO: loaded from: classes.dex */
public final class n implements od0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f154028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cn0.b f154029b;

    public n(m securityRepository, cn0.b authorizationUpdateMapper, cn0.a authorizationRemoveMapper) {
        Intrinsics.checkNotNullParameter(securityRepository, "securityRepository");
        Intrinsics.checkNotNullParameter(authorizationUpdateMapper, "authorizationUpdateMapper");
        Intrinsics.checkNotNullParameter(authorizationRemoveMapper, "authorizationRemoveMapper");
        this.f154028a = securityRepository;
        this.f154029b = authorizationUpdateMapper;
    }

    public static String a(m mVar) {
        p0 p0Var = o0.f186429a;
        return mVar.a(p0Var.b(lm0.a.class)) ? mVar.c(p0Var.b(lm0.a.class)).a() : mVar.c(p0Var.b(lm0.i.class)).a();
    }

    public final q b() {
        m mVar = this.f154028a;
        String strA = a(mVar);
        p0 p0Var = o0.f186429a;
        return new q(strA, Long.valueOf(Long.parseLong(mVar.c(p0Var.b(lm0.e.class)).a())), mVar.c(p0Var.b(lm0.b.class)).a(), mVar.c(p0Var.b(lm0.j.class)).a());
    }

    public final q c(Cipher cipher) {
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        m mVar = this.f154028a;
        String strA = a(mVar);
        p0 p0Var = o0.f186429a;
        String strA2 = mVar.c(p0Var.b(lm0.c.class)).a();
        long j2 = Long.parseLong(mVar.c(p0Var.b(lm0.e.class)).a());
        return new q(strA, Long.valueOf(j2), strA2, mVar.c(p0Var.b(lm0.d.class)).a());
    }

    @Override // od0.e
    public final void clear() {
        this.f154028a.clear();
    }

    public final rl0.d d() {
        p pVarD = this.f154028a.d(o0.f186429a.b(lm0.h.class));
        String strA = pVarD != null ? pVarD.a() : null;
        if (strA == null) {
            return rl0.d.PASSCODE;
        }
        rl0.d.Companion.getClass();
        return rl0.c.a(strA);
    }

    public final q e() {
        String strA;
        p0 p0Var = o0.f186429a;
        KClass kClassB = p0Var.b(o.class);
        m mVar = this.f154028a;
        String strA2 = mVar.a(kClassB) ? mVar.c(p0Var.b(o.class)).a() : mVar.c(p0Var.b(lm0.i.class)).a();
        String strA3 = mVar.c(p0Var.b(lm0.m.class)).a();
        p pVarD = mVar.d(p0Var.b(lm0.k.class));
        Long lValueOf = (pVarD == null || (strA = pVarD.a()) == null) ? null : Long.valueOf(Long.parseLong(strA));
        p pVarD2 = mVar.d(p0Var.b(lm0.l.class));
        return new q(strA2, lValueOf, strA3, pVarD2 != null ? pVarD2.a() : null);
    }

    public final q g(String id10) {
        p pVarB;
        Intrinsics.checkNotNullParameter(id10, "tokenId");
        p0 p0Var = o0.f186429a;
        KClass kClass = p0Var.b(lm0.n.class);
        m mVar = this.f154028a;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        m.e("get(" + id10 + ", " + kClass + ") started");
        String str = (String) mVar.f154025a.T2(com.google.android.gms.internal.mlkit_vision_face.a.o(l.b(kClass), "_", id10), String.class);
        if (str == null) {
            m.e("get(" + id10 + ", " + kClass + ") ended with null");
            pVarB = null;
        } else {
            u.Companion.getClass();
            u uVarA = s.a(str);
            pVarB = mVar.b(kClass, uVarA);
            if (uVarA.c() && mVar.d.b()) {
                mVar.g(id10, pVarB);
            }
            m.e("get(" + id10 + ", " + kClass + ") ended with " + p0Var.b(pVarB.getClass()).m());
        }
        if (pVarB == null) {
            return null;
        }
        rlm.b bVar = Json.d;
        bVar.getClass();
        en0.c cVar = (en0.c) bVar.b(en0.c.Companion.serializer(), pVarB.a());
        return new q(cVar.b(), cVar.a(), cVar.c(), cVar.d());
    }

    public final String h() {
        return this.f154028a.c(o0.f186429a.b(lm0.f.class)).a();
    }

    public final void i(q token) {
        Intrinsics.checkNotNullParameter("Widget", "tokenId");
        Intrinsics.checkNotNullParameter(token, "token");
        en0.c cVar = new en0.c(token.f207120a, token.f207122c, token.f207121b, token.d);
        rlm.b bVar = Json.d;
        bVar.getClass();
        this.f154028a.g("Widget", new lm0.n(bVar.c(en0.c.Companion.serializer(), cVar)));
    }

    public final synchronized void j() {
        m mVar = this.f154028a;
        p0 p0Var = o0.f186429a;
        mVar.i(p0Var.b(lm0.c.class));
        this.f154028a.i(p0Var.b(lm0.d.class));
    }

    public final synchronized void k(mm0.k update) {
        Intrinsics.checkNotNullParameter(update, "update");
        List listA = this.f154029b.a(update);
        m mVar = this.f154028a;
        Iterator it8 = listA.iterator();
        while (it8.hasNext()) {
            mVar.h((p) it8.next());
        }
    }
}
