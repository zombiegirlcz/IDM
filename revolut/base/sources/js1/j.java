package js1;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001b"}, d2 = {"Ljs1/j;", "", "", "toString", "()Ljava/lang/String;", "Lt02/d;", "a", "Lt02/d;", "getSource", "()Lt02/d;", "source", "Ljo3/a;", "b", "Ljo3/a;", "getAmount", "()Ljo3/a;", "amount", "c", "Ljava/lang/String;", "getComment", "comment", "d", "getPayeePhone", "payeePhone", "e", "getPayeeContactName", "payeeContactName", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("source")
    private final t02.d source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("comment")
    private final String comment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("payeePhone")
    @NotNull
    private final String payeePhone;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("payeeContactName")
    @NotNull
    private final String payeeContactName;

    public j(t02.d dVar, jo3.a amount, String str, String payeePhone, String payeeContactName) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(payeePhone, "payeePhone");
        Intrinsics.checkNotNullParameter(payeeContactName, "payeeContactName");
        this.source = dVar;
        this.amount = amount;
        this.comment = str;
        this.payeePhone = payeePhone;
        this.payeeContactName = payeeContactName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.source, jVar.source) && Intrinsics.f(this.amount, jVar.amount) && Intrinsics.f(this.comment, jVar.comment) && Intrinsics.f(this.payeePhone, jVar.payeePhone) && Intrinsics.f(this.payeeContactName, jVar.payeeContactName);
    }

    public final int hashCode() {
        t02.d dVar = this.source;
        int iJ = v7.j(this.amount, (dVar == null ? 0 : dVar.hashCode()) * 31, 31);
        String str = this.comment;
        return this.payeeContactName.hashCode() + p.a.c((iJ + (str != null ? str.hashCode() : 0)) * 31, 31, this.payeePhone);
    }
}
