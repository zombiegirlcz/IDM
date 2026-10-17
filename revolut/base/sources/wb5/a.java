package wb5;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000b\u0010\u0004R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0006\u0010\u0013¨\u0006\u0015"}, d2 = {"Lwb5/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "c", "()J", "currentDate", "b", "d", "dueDate", "Ljava/lang/String;", "currency", "", "Lwb5/d;", "Ljava/util/List;", "()Ljava/util/List;", "autoPayments", "feature_credit_card_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("currentDate")
    private final long currentDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dueDate")
    private final long dueDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("autoPayments")
    @NotNull
    private final List<d> autoPayments;

    public a(long j2, long j3, String currency, ArrayList autoPayments) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(autoPayments, "autoPayments");
        this.currentDate = j2;
        this.dueDate = j3;
        this.currency = currency;
        this.autoPayments = autoPayments;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAutoPayments() {
        return this.autoPayments;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCurrentDate() {
        return this.currentDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getDueDate() {
        return this.dueDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.currentDate == aVar.currentDate && this.dueDate == aVar.dueDate && Intrinsics.f(this.currency, aVar.currency) && Intrinsics.f(this.autoPayments, aVar.autoPayments);
    }

    public final int hashCode() {
        return this.autoPayments.hashCode() + p.a.c(a0.d.c(Long.hashCode(this.currentDate) * 31, 31, this.dueDate), 31, this.currency);
    }
}
