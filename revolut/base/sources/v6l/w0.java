package v6l;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class w0 extends kotlin.jvm.internal.q implements Function1 {
    public static final w0 f = new w0();

    public w0() {
        super(1, o6l.d.class, "toDomain", "toDomain(Lcom/revolut/shared/feature/cards/domain/impl/data/network/revolutcard/models/RevolutCardDto;)Lcom/revolut/feature/cards/models/revolutcard/RevolutCard;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        p6l.q p0 = (p6l.q) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return o6l.d.b(p0);
    }
}
