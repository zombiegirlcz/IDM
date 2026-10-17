package rkg;

import anf.w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import whf.i;
import whf.l;
import whf.n;
import whf.p;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements kkg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f254858a;

    public c(n standardMapper) {
        Intrinsics.checkNotNullParameter(standardMapper, "standardMapper");
        this.f254858a = standardMapper;
    }

    @Override // kkg.b
    public final List a(kkg.a unifiedContent, l itemMapping, i groupingType) {
        Intrinsics.checkNotNullParameter(unifiedContent, "unifiedContent");
        Intrinsics.checkNotNullParameter(itemMapping, "itemMapping");
        Intrinsics.checkNotNullParameter(groupingType, "groupingType");
        return ((w) this.f254858a).c(new p(com.revolut.feature.unified_transactions.models.a.a(unifiedContent.f185062a), unifiedContent.f185063b, unifiedContent.f185064c, unifiedContent.d), itemMapping, groupingType);
    }
}
