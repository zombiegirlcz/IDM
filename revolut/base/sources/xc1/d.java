package xc1;

import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vfg.p;
import wl3.e;
import x8i.h;
import x94.q;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends yji.d {

    @NotNull
    public static final b Companion = new b();
    public static final x5a.d f = new x5a.d(19);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f304093c;
    public final ihm.b d;
    public ifm.c e;

    public d(a dialogDisplayerProvider) {
        Intrinsics.checkNotNullParameter(dialogDisplayerProvider, "dialogDisplayerProvider");
        this.f304093c = dialogDisplayerProvider;
        ihm.b bVarE = ihm.b.e(f);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.d = bVarE;
    }

    @Override // yji.d
    public final void M() {
        r<R> rVarSwitchMap = r.timer(200L, TimeUnit.MILLISECONDS).switchMap(new x9h.d(16, new x8h.d(this, 24)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        r rVarF = o70.a.f(rVarSwitchMap);
        h hVar = new h(25);
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new p(new q(new BreadcrumbException(), 22), (byte) 0));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new e(3, hVar), new e(3, c.f304092a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        this.e = cVarSubscribe;
    }

    @Override // yji.d
    public final void N() {
        ifm.c cVar = this.e;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f304093c.X().a();
    }

    public final void Q(Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.d.onNext(action);
    }
}
