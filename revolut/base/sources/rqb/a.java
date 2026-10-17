package rqb;

import a0.d;
import aim.e;
import an0.c;
import cn0.g;
import hf0.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import mm0.h;
import mm0.i;
import mm0.j;
import mm0.l;
import mm0.n;
import mm0.q;
import rl0.b;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static c a() {
        phm.a aVar = (phm.a) ((hf0.a) b.d.c()).a().get(c.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return (c) aVar2.b();
        }
        throw new IllegalStateException(d.q("Api ", c.class, " is not found"));
    }

    public static void b(oqb.a snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        zm0.b bVarI = a().i();
        Intrinsics.checkNotNullParameter(snapshot, "<this>");
        e eVarB = u.b();
        rl0.b bVar = snapshot.f227877b;
        if (bVar instanceof rl0.a) {
            eVarB.add(new i(rl0.d.PASSCODE));
            eVarB.add(new h(((rl0.a) bVar).f254906a));
        } else {
            if (!Intrinsics.f(bVar, b.a.f254907a)) {
                throw new NoWhenBranchMatchedException();
            }
            eVarB.add(new i(rl0.d.PASSKEY));
        }
        KClass kClassB = o0.f186429a.b(n.class);
        q qVar = snapshot.f227876a;
        eVarB.add(new j(kClassB, qVar.f207121b, qVar.f207122c, qVar.d, qVar.f207120a));
        ((g) bVarI).l(new l(u.a(eVarB)));
        q qVar2 = snapshot.f227878c;
        if (qVar2 != null) {
            a().h().i(qVar2);
        }
    }
}
