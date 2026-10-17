package zab;

import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.i0;
import kotlin.jvm.internal.Intrinsics;
import nii.o0;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f320596a = new b0();

    @Override // efm.i0
    public final efm.h0 i(efm.d0 upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        ufm.i iVar = new ufm.i(upstream, new o0(27, new z63.j(new BreadcrumbException(), 18)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        return iVar;
    }
}
