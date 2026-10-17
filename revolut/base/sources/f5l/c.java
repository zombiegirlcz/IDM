package f5l;

import a08.g0;
import android.app.Activity;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import ew2.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends fsi.c {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final fsi.b f132362j = new fsi.b("DYNAMIC_SCREEN_CAPTURING_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f132363h;
    public final Activity i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a dynamicScreenCapturingProtection, Activity activity) {
        super(f132362j);
        Intrinsics.checkNotNullParameter(dynamicScreenCapturingProtection, "dynamicScreenCapturingProtection");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f132363h = dynamicScreenCapturingProtection;
        this.i = activity;
    }

    @Override // fsi.a
    public final void onStart() {
        r rVarDistinctUntilChanged = rd0.e.c(this.f132363h.S1(), kotlin.coroutines.g.f186406a).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        r rVarDoFinally = o70.a.f(rVarDistinctUntilChanged).doFinally(new a08.d(this, 15));
        Intrinsics.checkNotNullExpressionValue(rVarDoFinally, "doFinally(...)");
        f0m.c cVar = new f0m.c(this, 11);
        Function1 function1M = M();
        Function0 function0L = L();
        r rVarOnErrorResumeNext = rVarDoFinally.onErrorResumeNext(new zjh.f(new q(new BreadcrumbException(), 24)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new g0(16, cVar), new g0(16, function1M), new ea9.c(6, function0L));
        w.j0(this.f137706c, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
