package u47;

import ds6.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s47.i;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f277270a = new b();

    public b() {
        super(1, i.class, "<init>", "<init>(Lcom/revolut/feature/freelancer/common/models/tax_hub/TaxHubTransactionExportReview;Lcom/revolut/feature/freelancer/common/models/tax_hub/TaxHubVatSummary;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        g0 p0 = (g0) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new i(p0, null);
    }
}
