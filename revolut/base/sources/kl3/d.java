package kl3;

import a08.f0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements efm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f185277a = new d();

    @Override // efm.g
    public final efm.f d(efm.b upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        pfm.a aVar = new pfm.a(upstream, new f0(23, new j2i.c(new BreadcrumbException(), 13)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        return aVar;
    }
}
