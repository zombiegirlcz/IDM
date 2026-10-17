package kvk;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements cli.j {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f190144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f190145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f190146c;
    public final Data d;

    public k(String str, Data financials, Map financialChartsState, Data disclaimer) {
        Intrinsics.checkNotNullParameter(financials, "financials");
        Intrinsics.checkNotNullParameter(financialChartsState, "financialChartsState");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.f190144a = str;
        this.f190145b = financials;
        this.f190146c = financialChartsState;
        this.d = disclaimer;
    }

    public static k a(k kVar, String str, Data financials, Map financialChartsState, Data disclaimer, int i) {
        if ((i & 1) != 0) {
            str = kVar.f190144a;
        }
        if ((i & 2) != 0) {
            financials = kVar.f190145b;
        }
        if ((i & 4) != 0) {
            financialChartsState = kVar.f190146c;
        }
        if ((i & 8) != 0) {
            disclaimer = kVar.d;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(financials, "financials");
        Intrinsics.checkNotNullParameter(financialChartsState, "financialChartsState");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        return new k(str, financials, financialChartsState, disclaimer);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f190144a, kVar.f190144a) && Intrinsics.f(this.f190145b, kVar.f190145b) && Intrinsics.f(this.f190146c, kVar.f190146c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        String str = this.f190144a;
        return this.d.hashCode() + p.a.e(kii.e.c(this.f190145b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.f190146c);
    }
}
