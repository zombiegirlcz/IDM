package zab;

import com.revolut.core.extensions.rx.BreadcrumbException;
import kotlin.jvm.internal.Intrinsics;
import nii.o0;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 implements efm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f320604a = new d0();

    @Override // efm.g
    public final efm.f d(efm.b upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        pfm.a aVar = new pfm.a(upstream, new o0(27, new z63.j(new BreadcrumbException(), 19)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        return aVar;
    }
}
