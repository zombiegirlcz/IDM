package qp1;

import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u001d"}, d2 = {"Lqp1/o;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getPaymentMethod", "paymentMethod", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "amount", "", "Lqp1/b;", "c", "Ljava/util/List;", "()Ljava/util/List;", "fields", "d", "scheduledDate", "Lgp1/e;", "e", "Lgp1/e;", "()Lgp1/e;", "warning", "f", "footer", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("fields")
    @NotNull
    private final List<b> fields;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("scheduledDate")
    private final String scheduledDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("warning")
    private final gp1.e warning;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("footer")
    private final String footer;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getFields() {
        return this.fields;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getScheduledDate() {
        return this.scheduledDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final gp1.e getWarning() {
        return this.warning;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.paymentMethod, oVar.paymentMethod) && Intrinsics.f(this.amount, oVar.amount) && Intrinsics.f(this.fields, oVar.fields) && Intrinsics.f(this.scheduledDate, oVar.scheduledDate) && Intrinsics.f(this.warning, oVar.warning) && Intrinsics.f(this.footer, oVar.footer);
    }

    public final int hashCode() {
        int iD = p.a.d(v7.j(this.amount, this.paymentMethod.hashCode() * 31, 31), 31, this.fields);
        String str = this.scheduledDate;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        gp1.e eVar = this.warning;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str2 = this.footer;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
