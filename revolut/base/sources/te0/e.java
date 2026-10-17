package te0;

import android.os.Bundle;
import com.revolut.core.extensions.rx.BreadcrumbException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends r implements v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f270012c;

    public e(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f270012c = key;
    }

    public abstract Object d(Bundle bundle);

    public abstract void e(Bundle bundle, Object obj2);

    public final ifm.c f(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Object objD = d(bundle);
        if (objD == null) {
            ifm.a aVar = new ifm.a(mfm.f.f205042b, 1);
            Intrinsics.checkNotNullExpressionValue(aVar, "empty(...)");
            return aVar;
        }
        efm.r rVarOnErrorResumeNext = b(objD).onErrorResumeNext(new e0f.m(9, new t33.r(new BreadcrumbException(), 7)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new gn.b(10, a.f270008a), new gn.b(10, b.f270009a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        return cVarSubscribe;
    }

    public final ifm.c g(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        efm.r rVarDoOnNext = c(s.f270018a).doOnNext(new pv9.b(new bsi.b(this, bundle, 9), 19));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        efm.r rVarOnErrorResumeNext = rVarDoOnNext.onErrorResumeNext(new e0f.m(9, new qza.x(new BreadcrumbException(), 9)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new gn.b(10, c.f270010a), new gn.b(10, d.f270011a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        return cVarSubscribe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String key, Object obj2) {
        super(obj2);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(obj2, "default");
        this.f270012c = key;
    }
}
