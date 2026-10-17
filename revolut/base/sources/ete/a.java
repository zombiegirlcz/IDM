package ete;

import ate.e;
import dte.f;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f129410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final grb.a f129411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zq.a f129412c;
    public final CoroutineScope d;

    public a(e appTipsInteractor, grb.a appTipsProvider, zq.a appTipsContentProvider, CoroutineScope appTipsScope) {
        Intrinsics.checkNotNullParameter(appTipsInteractor, "appTipsInteractor");
        Intrinsics.checkNotNullParameter(appTipsProvider, "appTipsProvider");
        Intrinsics.checkNotNullParameter(appTipsContentProvider, "appTipsContentProvider");
        Intrinsics.checkNotNullParameter(appTipsScope, "appTipsScope");
        this.f129410a = appTipsInteractor;
        this.f129411b = appTipsProvider;
        this.f129412c = appTipsContentProvider;
        this.d = appTipsScope;
    }

    public final f a() {
        return new f(this.f129410a, this.f129411b, this.f129412c, this.d);
    }
}
