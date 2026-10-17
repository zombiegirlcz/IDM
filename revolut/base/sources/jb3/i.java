package jb3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class i extends q implements Function1 {
    public static final i f = new i();

    public i() {
        super(1, mo3.a.class, "toDomain", "toDomain(Lcom/revolut/feature/core/model/money/MoneyDto;)Lcom/revolut/core/model/money/Money;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        jo3.a p0 = (jo3.a) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return mo3.a.o(p0);
    }
}
