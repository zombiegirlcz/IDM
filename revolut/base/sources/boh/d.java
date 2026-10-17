package boh;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xzg.b0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.q implements Function1 {
    public static final d f = new d();

    public d() {
        super(1, f.class, "textClause", "textClause(Lcom/revolut/feature/wealth/api/domain/model/MostTradedAssets$TimeSpan;)Lcom/revolut/core/ui_kit/models/Clause;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        b0 p0 = (b0) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return f.q(p0);
    }
}
