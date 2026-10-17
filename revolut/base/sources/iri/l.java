package iri;

import akl.s;
import android.os.Bundle;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import efm.r;
import ie.b0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public final class l extends fsi.c {

    @NotNull
    public static final k Companion = new k();
    public static final fsi.b k = new fsi.b("FLOW_STATE_CHECKER_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f168061h;
    public final BaseDelegatesActivity i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f168062j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m flowState, BaseDelegatesActivity activity, d failStrategy) {
        super(k);
        Intrinsics.checkNotNullParameter(flowState, "flowState");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(failStrategy, "failStrategy");
        this.f168061h = flowState;
        this.i = activity;
        this.f168062j = failStrategy;
    }

    @Override // fsi.a
    public final void onCreate(Bundle bundle) {
        List list;
        od0.a aVar = od0.a.f224253a;
        if (od0.a.e()) {
            m mVar = this.f168061h;
            a aVar2 = mVar instanceof a ? (a) mVar : null;
            if (aVar2 == null || (list = (List) ue0.e.M(y.J(y.x(y.z(aVar2.v0(), new an0.e(24)), new an0.e(25))))) == null) {
                return;
            }
            r map = r.merge(list).map(new b0(new an0.e(26), 2));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            r rVarF = o70.a.f(w.a0(map, new an0.e(27)));
            s sVar = new s(this, 19);
            Function1 function1M = M();
            Function0 function0L = L();
            r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new a31.a(new bo.c(new BreadcrumbException(), 7), (char) 0));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new e0f.m(2, sVar), new e0f.m(2, function1M), new c86.f(1, function0L));
            w.j0(this.d, cVarSubscribe);
            Intrinsics.h(cVarSubscribe);
        }
    }
}
