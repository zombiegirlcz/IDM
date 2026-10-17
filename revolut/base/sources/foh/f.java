package foh;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xzg.n0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.q implements Function1 {
    public static final f f = new f();

    public f() {
        super(1, i.class, "toTextClause", "toTextClause(Lcom/revolut/feature/wealth/api/domain/model/TopMoversFilter;)Lcom/revolut/core/ui_kit/models/Clause;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        n0 p0 = (n0) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return i.L(p0);
    }
}
