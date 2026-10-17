package foh;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xzg.l0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.q implements Function1 {
    public static final g f = new g();

    public g() {
        super(1, i.class, "toTextClause", "toTextClause(Lcom/revolut/feature/wealth/api/domain/model/TopMovers$TimeSpan;)Lcom/revolut/core/ui_kit/models/Clause;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        l0 p0 = (l0) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return i.K(p0);
    }
}
