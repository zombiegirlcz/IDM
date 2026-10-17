package p24;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.q implements Function1 {
    public static final k f = new k();

    public k() {
        super(1, n14.e.class, "toDomain", "toDomain(Lcom/revolut/feature/credit/application/plugins/impl/network/models/CreditApplicationDocumentDto;)Lcom/revolut/feature/credit/application/plugins/api/models/documents/CreditApplicationDocument;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        tz3.d p0 = (tz3.d) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        return new su3.a(p0.getUrl(), "", (String) null, (String) null, 60);
    }
}
