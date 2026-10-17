package bkl;

import com.google.gson.reflect.TypeToken;
import jkl.k;
import jkl.l;
import jkl.l2;
import jkl.m;
import jkl.n;
import jkl.p;
import jkl.q;
import jkl.r;
import jkl.s;
import jkl.t;
import jkl.w;
import kg.l0;
import kg.m0;
import kg.o;
import kg.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements m0 {
    @Override // kg.m0
    public final l0 a(o gson, TypeToken type) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(type, "type");
        if (!w.class.isAssignableFrom(type.getRawType())) {
            return null;
        }
        l0 l0VarH = gson.h(u.class);
        l0 l0VarH2 = gson.h(k.class);
        return new e(l0VarH, gson.i(this, TypeToken.get(w.class)), gson.h(l.class), l0VarH2, gson.h(m.class), gson.h(n.class), gson.h(jkl.o.class), gson.h(p.class), gson.h(q.class), gson.h(r.class), gson.h(s.class), gson.h(jkl.u.class), gson.h(t.class), gson.h(l2.class)).b();
    }
}
