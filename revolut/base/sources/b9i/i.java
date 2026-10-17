package b9i;

import a08.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import efm.w;
import efm.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f13794a = new i();

    @Override // efm.x
    public final w apply(r upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        r rVarOnErrorResumeNext = upstream.onErrorResumeNext(new s(5, new h(new BreadcrumbException(), 1)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        return rVarOnErrorResumeNext;
    }
}
