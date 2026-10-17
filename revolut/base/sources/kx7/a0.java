package kx7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zw7.d1;
import zw7.e1;
import zw7.f1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a0 extends kotlin.jvm.internal.q implements Function1 {
    public static final a0 f = new a0();

    public a0() {
        super(1, hx7.s.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 1);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List<ix7.a0> p0 = (List) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Object obj3 = hx7.s.f156411a;
        Intrinsics.checkNotNullParameter(p0, "<this>");
        ArrayList arrayList = new ArrayList();
        for (ix7.a0 a0Var : p0) {
            Intrinsics.checkNotNullParameter(a0Var, "<this>");
            f1 f1Var = a0Var.getLabel() != null ? new f1(a0Var.getCampaign(), new e1(a0Var.getLabel().getText(), (d1) u1.t(a0Var.getLabel().getIcon(), d1.TAG, hx7.s.f156411a))) : null;
            if (f1Var != null) {
                arrayList.add(f1Var);
            }
        }
        return arrayList;
    }
}
