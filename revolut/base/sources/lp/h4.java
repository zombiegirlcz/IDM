package lp;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.recents.impl.data.PaymentsRecentDatabase;
import com.revolut.feature.payments.recipients.settings.impl.data.db.RecipientSettingsDatabase;
import java.util.Collections;

/* JADX INFO: loaded from: classes17.dex */
public abstract class h4 implements e4m.e {
    public static a31.a A(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static b60.a B(gy9.b bVar) {
        b60.a aVar = (b60.a) bVar.f147839a.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static c4e.g C(hak.b bVar) {
        return new c4e.g(bVar.f150527c, bVar.d, bVar.f150528g, bVar.e, 1);
    }

    public static b60.a D(jqa.n nVar) {
        b60.a aVar = (b60.a) nVar.T.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a a(x5k.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a b(x5k.a aVar) {
        b60.a aVar2 = (b60.a) aVar.e.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a c(ox9.b bVar) {
        b60.a aVar = (b60.a) bVar.E.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a d(ox9.b bVar) {
        b60.a aVar = (b60.a) bVar.E.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a e(p2k.b0 b0Var) {
        b60.a aVar = (b60.a) b0Var.Q.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a f(p2k.b0 b0Var) {
        b60.a aVar = (b60.a) b0Var.Q.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a g(p2k.b0 b0Var) {
        b60.a aVar = (b60.a) b0Var.S.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a h(p2k.b0 b0Var) {
        b60.a aVar = (b60.a) b0Var.S.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a i(hak.b bVar) {
        b60.a aVar = (b60.a) bVar.f.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a j(hak.b bVar) {
        b60.a aVar = (b60.a) bVar.f.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a k(e9i.b bVar) {
        b60.a aVar = (b60.a) bVar.f124006c.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a l(e9i.b bVar) {
        b60.a aVar = (b60.a) bVar.f124006c.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a m(vak.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f287328m.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a n(vak.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f287328m.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a o(vak.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f287329n.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a p(vak.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f287329n.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a q(fy9.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a r(fy9.a aVar) {
        b60.a aVar2 = (b60.a) aVar.f.get();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static b60.a s(gy9.b bVar) {
        b60.a aVar = (b60.a) bVar.f147839a.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static b60.a t(gy9.b bVar) {
        b60.a aVar = (b60.a) bVar.f147839a.get();
        vc.s.k(aVar);
        return aVar;
    }

    public static gy9.a u(b60.a aVar) {
        gy9.a aVar2 = (gy9.a) aVar.b();
        vc.s.k(aVar2);
        return aVar2;
    }

    public static if0.a v(ox9.a aVar) {
        return new if0.a(ImmutableSet.of((ahl.a) aVar.E.get(), new ahl.a(aVar.d, (PaymentsRecentDatabase) aVar.F.get())));
    }

    public static if0.a w(p2k.u uVar) {
        return new if0.a(ImmutableSet.of((od0.e) uVar.f232488q.get(), (od0.e) uVar.u.get()));
    }

    public static a31.a x(p1 p1Var) {
        return new a31.a(p1Var);
    }

    public static e9i.b y(a31.a aVar, a31.a aVar2) {
        return new e9i.b(aVar, aVar2);
    }

    public static if0.a z(fy9.b bVar) {
        return new if0.a(Collections.singleton(new ahl.a(bVar.f138970c, (RecipientSettingsDatabase) bVar.f138971g.get())));
    }
}
