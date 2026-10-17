package boh;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xzg.d0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, f.class, "textClause", "textClause(Lcom/revolut/feature/wealth/api/domain/model/MostTradedAssetsSection;)Lcom/revolut/core/ui_kit/models/Clause;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        d0 p0 = (d0) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return f.r(p0);
    }
}
