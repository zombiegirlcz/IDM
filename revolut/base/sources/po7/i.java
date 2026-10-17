package po7;

import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import java.util.ArrayList;
import java.util.List;
import jki.m;
import jki.p;
import kl7.o0;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements p {
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
    @Override // jki.p
    public final m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<o0> list = domainState.f237892a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (o0 o0Var : list) {
            Object obj2 = jl7.f.f175621a;
            Intrinsics.checkNotNullParameter(o0Var, "<this>");
            arrayList.add(new SingleChoiceDelegate.Model(u1.g(o0Var, jl7.f.d), xl7.h.e(o0Var), o0Var == domainState.f237893b, null, o0Var, YearClass.CLASS_2008));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new g(arrayList);
    }
}
