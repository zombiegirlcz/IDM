package fs5;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import ue0.e;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f137596b;

    public /* synthetic */ c(p pVar, int i) {
        this.f137595a = i;
        this.f137596b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        xi0.b selectedCurrency = (xi0.b) obj2;
        switch (this.f137595a) {
            case 0:
                Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
                p pVar = this.f137596b;
                return e.E(pd.b.r(ur5.a.b((ur5.c) pVar.f207709b, null, 3), new fpk.b(pVar, selectedCurrency, 5)), new Data(f0.f322471a, null, false, 6, null));
            default:
                Intrinsics.checkNotNullParameter(selectedCurrency, "it");
                return ur5.a.a((ur5.c) this.f137596b.f207709b, null, selectedCurrency, 5);
        }
    }
}
