package b9i;

import a08.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements efm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f13795a = new j();

    @Override // efm.g
    public final efm.f d(efm.b upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        pfm.a aVar = new pfm.a(upstream, new s(5, new h(new BreadcrumbException(), 3)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        return aVar;
    }
}
