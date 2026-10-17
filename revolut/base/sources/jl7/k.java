package jl7;

import com.revolut.feature.insurance_car.impl.data.model.OptionValue;
import com.revolut.feature.insurance_car.impl.data.model.PlanOption;
import hl7.a8;
import hl7.c7;
import hl7.e6;
import hl7.i4;
import hl7.la;
import hl7.pa;
import hl7.sa;
import hl7.t3;
import hl7.y5;
import java.util.ArrayList;
import java.util.List;
import kl7.e2;
import kl7.n2;
import kl7.o1;
import kl7.o2;
import kl7.p0;
import kl7.p2;
import kl7.q2;
import kl7.r2;
import kotlin.Pair;
import le.u1;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f175629a = r0.k(new Pair("IMAGE", o2.IMAGE), new Pair("VIDEO", o2.VIDEO));

    public static final o1 a(a8 a8Var) {
        dj0.d dVar = a8Var.f153022a;
        List<c7> list = a8Var.f153023b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (c7 c7Var : list) {
            nr7.b bVarA = mr7.b.a(c7Var.f153051c);
            String str = c7Var.f153049a;
            String str2 = c7Var.f153050b;
            List<e6> list2 = c7Var.d;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            for (e6 e6Var : list2) {
                arrayList2.add(new OptionValue(e6Var.f153078a, e6Var.f153079b, e6Var.f153080c, e6Var.e, e6Var.d));
            }
            arrayList.add(new PlanOption(bVarA, str, str2, arrayList2));
        }
        sa saVar = a8Var.f153024c;
        return new o1(dVar, arrayList, saVar != null ? new r2(saVar.f153306a, saVar.f153307b, saVar.f153308c, saVar.d) : null);
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.Map] */
    public static final n2 b(y5 y5Var, pa paVar) {
        String str = y5Var.f153377a;
        a8 a8Var = y5Var.f153378b;
        q2 q2Var = null;
        o1 o1VarA = a8Var != null ? a(a8Var) : null;
        a8 a8Var2 = y5Var.f153379c;
        o1 o1VarA2 = a8Var2 != null ? a(a8Var2) : null;
        if (paVar != null) {
            String str2 = paVar.f153260a;
            t3 t3Var = paVar.f153261b;
            p0 p0Var = new p0(t3Var.f153312a, t3Var.f153313b);
            List<i4> list = paVar.f153262c;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            for (i4 i4Var : list) {
                arrayList.add(new e2(i4Var.f153144a, i4Var.f153146c));
            }
            la laVar = paVar.d;
            q2Var = new q2(str2, p0Var, arrayList, laVar != null ? new p2((o2) u1.u(laVar.f153197a, f175629a), laVar.f153198b) : null);
        }
        return new n2(str, o1VarA, o1VarA2, q2Var);
    }
}
