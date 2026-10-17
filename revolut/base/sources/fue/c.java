package fue;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004¨\u0006\u0010"}, d2 = {"Lfue/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "limitsBaseCurrency", "", "Lfue/b;", "Ljava/util/List;", "()Ljava/util/List;", "limits", "c", "topupCurrency", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("limitsBaseCurrency")
    private final String limitsBaseCurrency;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("limits")
    @NotNull
    private final List<b> limits;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("topupCurrency")
    private final String topupCurrency;

    public c(String str, String str2, ArrayList limits) {
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.limitsBaseCurrency = str;
        this.limits = limits;
        this.topupCurrency = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getLimits() {
        return this.limits;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLimitsBaseCurrency() {
        return this.limitsBaseCurrency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTopupCurrency() {
        return this.topupCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.limitsBaseCurrency, cVar.limitsBaseCurrency) && Intrinsics.f(this.limits, cVar.limits) && Intrinsics.f(this.topupCurrency, cVar.topupCurrency);
    }

    public final int hashCode() {
        String str = this.limitsBaseCurrency;
        int iD = p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.limits);
        String str2 = this.topupCurrency;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }
}
