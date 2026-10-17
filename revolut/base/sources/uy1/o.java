package uy1;

import com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f284051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vw1.b f284052b;

    public o(l aliasResolveErrorParser, vw1.b aliasRepository) {
        Intrinsics.checkNotNullParameter(aliasResolveErrorParser, "aliasResolveErrorParser");
        Intrinsics.checkNotNullParameter(aliasRepository, "aliasRepository");
        this.f284051a = aliasResolveErrorParser;
        this.f284052b = aliasRepository;
    }

    public final Object a(ResolveAlias resolveAlias, gim.c cVar) {
        un8.j jVar = new un8.j(this, resolveAlias, null, 22);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, jVar, cVar);
    }
}
