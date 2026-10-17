package roe;

import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreenContract$DomainDataItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f255992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f255993c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ o(String str, int i, String str2, boolean z, boolean z3) {
        this.f255991a = i;
        this.f255992b = str;
        this.f255993c = str2;
        this.d = z;
        this.e = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f255991a) {
            case 0:
                com.revolut.feature.tax_residency.impl.screens.tin.a aVar = (com.revolut.feature.tax_residency.impl.screens.tin.a) obj2;
                TaxNumberInputScreenContract$DomainDataItem.Tin tin = aVar.f90129b;
                boolean z = this.d;
                boolean z3 = this.e && !z;
                boolean z4 = tin.e;
                String formattedValue = this.f255992b;
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                String extractedValue = this.f255993c;
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                return com.revolut.feature.tax_residency.impl.screens.tin.a.a(aVar, new TaxNumberInputScreenContract$DomainDataItem.Tin(formattedValue, extractedValue, z, z3, z4), null, null, 13);
            default:
                ((ype.d) obj2).getClass();
                String extractedTin = this.f255992b;
                Intrinsics.checkNotNullParameter(extractedTin, "extractedTin");
                String formattedTin = this.f255993c;
                Intrinsics.checkNotNullParameter(formattedTin, "formattedTin");
                return new ype.d(extractedTin, formattedTin, this.d, this.e, null);
        }
    }
}
