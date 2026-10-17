package fp1;

import kotlin.jvm.internal.Intrinsics;
import oim.p;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements p {
    @Override // oim.p
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Boolean pt7 = (Boolean) obj2;
        Boolean boleto = (Boolean) obj3;
        Boolean tapi = (Boolean) obj4;
        Boolean gr7 = (Boolean) obj5;
        Boolean nz4 = (Boolean) obj6;
        Boolean uae2 = (Boolean) obj7;
        Intrinsics.checkNotNullParameter(pt7, "pt");
        Intrinsics.checkNotNullParameter(boleto, "boleto");
        Intrinsics.checkNotNullParameter(tapi, "tapi");
        Intrinsics.checkNotNullParameter(gr7, "gr");
        Intrinsics.checkNotNullParameter(nz4, "nz");
        Intrinsics.checkNotNullParameter(uae2, "uae");
        return Boolean.valueOf(pt7.booleanValue() || boleto.booleanValue() || gr7.booleanValue() || nz4.booleanValue() || tapi.booleanValue() || uae2.booleanValue());
    }
}
