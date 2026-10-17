package joe;

import ioe.v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.q implements Function1 {
    public static final n f = new n();

    public n() {
        super(1, a.class, "toDomain", "toDomain(Lcom/revolut/feature/tax_residency/impl/models/TaxResidencyInfoResponseDto;)Ljava/util/List;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        v p0 = (v) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return a.a(p0);
    }
}
