package kx7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.q implements Function1 {
    public static final e f = new e();

    public e() {
        super(1, hx7.h.class, "toDomain", "toDomain(Ljava/util/List;)Ljava/util/List;", 1);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List<ix7.l> p0 = (List) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Object obj3 = hx7.h.f156399a;
        Intrinsics.checkNotNullParameter(p0, "<this>");
        ArrayList arrayList = new ArrayList();
        for (ix7.l lVar : p0) {
            Intrinsics.checkNotNullParameter(lVar, "<this>");
            zw7.e0 e0Var = (zw7.e0) u1.v(lVar.getCode(), hx7.h.f156399a);
            zw7.f0 f0Var = e0Var != null ? new zw7.f0(e0Var, lVar.getTitle(), lVar.getDescription()) : null;
            if (f0Var != null) {
                arrayList.add(f0Var);
            }
        }
        return arrayList;
    }
}
