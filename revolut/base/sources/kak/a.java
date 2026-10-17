package kak;

import efm.r;
import k9h.d;
import kotlin.jvm.internal.Intrinsics;
import r21.h;
import te0.w;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o71.a f182495a;

    public a(o71.a repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f182495a = repository;
    }

    public final r a(String beneficiaryId) {
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        h hVar = (h) this.f182495a;
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        r map = hVar.f.f(beneficiaryId, false).map(new k64.a(14, new d(11)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final pfm.r b(String beneficiaryId) {
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        h hVar = (h) this.f182495a;
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        pfm.a aVarE = hVar.f251037a.setBeneficiaryAsPda(beneficiaryId).e(hVar.f.g(beneficiaryId, true));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return w.g0(aVarE);
    }
}
