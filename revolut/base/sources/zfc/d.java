package zfc;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vfc.f;
import w4l.h;
import w4l.k;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements jf1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.b f321922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f321923b;

    public d(o7.b freelancerAccountGuards, f repository) {
        Intrinsics.checkNotNullParameter(freelancerAccountGuards, "freelancerAccountGuards");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f321922a = freelancerAccountGuards;
        this.f321923b = repository;
    }

    public final Flow a() {
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.f321922a.r(h0.f322473a, new a(this, 2));
    }

    public final Flow b(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.f321922a.r(Boolean.FALSE, new ywi.b(this, loadingStrategy, 25));
    }
}
