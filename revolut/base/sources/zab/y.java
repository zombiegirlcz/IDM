package zab;

import com.revolut.core.extensions.rx.BreadcrumbException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y implements efm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f320644a = new y();

    @Override // efm.g
    public final efm.f d(efm.b upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        pfm.a aVar = new pfm.a(upstream, new z1l.d(new z63.j(new BreadcrumbException(), 16)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        return aVar;
    }
}
