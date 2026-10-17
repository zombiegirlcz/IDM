package lqg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pcd.f0;
import pcd.g0;
import pcd.p;
import pcd.s;
import tof.c;
import tof.ec;
import tof.fc;
import tof.g9;
import tof.i7;
import tof.l7;
import tof.m7;
import tof.oa;
import tof.q7;
import tof.q9;
import tof.ua;
import tof.yb;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    @NotNull
    private static final C1128a Companion = new C1128a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f199313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final oa f199314b;

    /* JADX INFO: renamed from: lqg.a$a, reason: collision with other inner class name */
    public static final class C1128a {
        private C1128a() {
        }
    }

    static {
        c[] elements = {c.SAVINGS, c.JOINT_SAVINGS, c.JUNIOR_SAVINGS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = d.y0(elements);
        f199313a = setY0;
        i7.c cVar = i7.Companion;
        Set set = setY0;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            arrayList.add(new q9((c) it8.next()));
        }
        q9[] q9VarArr = (q9[]) arrayList.toArray(new q9[0]);
        i7[] i7VarArr = (i7[]) Arrays.copyOf(q9VarArr, q9VarArr.length);
        cVar.getClass();
        q7 q7VarA = i7.c.a(i7.c.b(i7VarArr), new m7());
        i7.c cVar2 = i7.Companion;
        i7[] i7VarArr2 = {new yb(f199313a), new l7()};
        cVar2.getClass();
        f199314b = i7.c.b(q7VarA, i7.c.a(i7VarArr2), new g9(true));
    }

    public final i7 a(s vault) {
        i7 i7VarC;
        p pVar;
        Intrinsics.checkNotNullParameter(vault, "vault");
        String[] elements = {vault.f234881a, vault.f234882b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listU = d0.U(d.L(elements));
        ArrayList arrayList = new ArrayList(w.t(listU, 10));
        Iterator it8 = listU.iterator();
        while (it8.hasNext()) {
            arrayList.add(new ec((String) it8.next()));
        }
        Iterator it9 = arrayList.iterator();
        if (!it9.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it9.next();
        while (it9.hasNext()) {
            next = fc.c((i7) next, (i7) it9.next());
        }
        i7 i7VarA = fc.a((i7) next, f199314b);
        g0 g0Var = vault.f234885h;
        String str = null;
        f0 f0Var = g0Var instanceof f0 ? (f0) g0Var : null;
        if (f0Var != null && (pVar = f0Var.d) != null) {
            str = pVar.f234875a;
        }
        return (str == null || (i7VarC = fc.c(new ua(str), i7VarA)) == null) ? i7VarA : i7VarC;
    }
}
