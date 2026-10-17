package mki;

import aii.l;
import aii.o;
import com.revolut.kompot.common.ActionBreadcrumb;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.a0;
import skm.z;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends kotlin.coroutines.a implements a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f206469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f206470c;
    public final /* synthetic */ aii.a d;
    public final /* synthetic */ ActionBreadcrumb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o oVar, Function1 function1, aii.a aVar, ActionBreadcrumb actionBreadcrumb) {
        super(z.f264021a);
        this.f206469b = oVar;
        this.f206470c = function1;
        this.d = aVar;
        this.e = actionBreadcrumb;
    }

    @Override // skm.a0
    public final void handleException(CoroutineContext coroutineContext, Throwable th10) {
        l lVar = new l(th10);
        o oVar = this.f206469b;
        if (Intrinsics.f(oVar.M0(lVar), aii.k.f5289a) || ((Boolean) this.f206470c.invoke(th10)).booleanValue()) {
            return;
        }
        oVar.M0(new aii.i(th10, this.d, this.e));
    }
}
