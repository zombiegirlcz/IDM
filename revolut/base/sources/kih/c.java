package kih;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f184233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f184234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f184235c;

    public c() {
        this(0);
    }

    public static c a(c cVar, Data selectedCurrencyInfo, Data tradingLegalEntityInformation, boolean z, int i) {
        if ((i & 1) != 0) {
            selectedCurrencyInfo = cVar.f184233a;
        }
        if ((i & 2) != 0) {
            tradingLegalEntityInformation = cVar.f184234b;
        }
        if ((i & 4) != 0) {
            z = cVar.f184235c;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(selectedCurrencyInfo, "selectedCurrencyInfo");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        return new c(selectedCurrencyInfo, tradingLegalEntityInformation, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f184233a, cVar.f184233a) && Intrinsics.f(this.f184234b, cVar.f184234b) && this.f184235c == cVar.f184235c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f184235c) + kii.e.c(this.f184234b, this.f184233a.hashCode() * 31, 31);
    }

    public c(Data selectedCurrencyInfo, Data tradingLegalEntityInformation, boolean z) {
        Intrinsics.checkNotNullParameter(selectedCurrencyInfo, "selectedCurrencyInfo");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        this.f184233a = selectedCurrencyInfo;
        this.f184234b = tradingLegalEntityInformation;
        this.f184235c = z;
    }

    public /* synthetic */ c(int i) {
        this(new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), false);
    }
}
