package xb6;

import ip0.ls;
import java.util.ArrayList;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static f b() {
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            ls lsVar = new ls(a0.d.n("CHARITY_LIST_ID", i));
            yp0.b.l(lsVar, 0, 0, 0, 0, null, false, 63);
            arrayList.add(lsVar);
        }
        return new f(arrayList, null, null, 22);
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (f) iii.c.f(domainState.f304000a, new x8i.h(this, 24), new x48.a(this, 27), new x0b.h(this, 6));
    }
}
