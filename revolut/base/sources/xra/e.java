package xra;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e extends q implements Function1 {
    public static final e f = new e();

    public e() {
        super(1, mra.d.class, "toDomain", "toDomain(Lcom/revolut/feature/push_to_card/impl/dto/CardOwnerDto;)Lcom/revolut/feature/push_to_card/api/data/CardOwner;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        lqa.f p0 = (lqa.f) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return mra.d.U(p0);
    }
}
