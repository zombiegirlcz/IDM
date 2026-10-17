package xqe;

import akg.n;
import dfj.m0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import w4l.k;
import xo8.i0;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final are.b f308167a;

    public b(are.b repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f308167a = repository;
    }

    public final m0 a(String str, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-identity-auth-domain-model-RegisteredIdentityId$-teenRegisteredIdentityId$0");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return new m0(b(loadingStrategy), str, 5);
    }

    public final n b(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(this.f308167a.d.b(Unit.f186387a, loadingStrategy), new i0(20));
    }
}
