package ux6;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f283888a = new o();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        yhm.r rVar = (yhm.r) obj2;
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        List list = (List) rVar.f314201a;
        List list2 = (List) rVar.f314202b;
        List list3 = (List) rVar.f314203c;
        aim.e eVarB = u.b();
        eVarB.addAll(list);
        eVarB.addAll(list2);
        eVarB.addAll(list3);
        return u.a(eVarB);
    }
}
