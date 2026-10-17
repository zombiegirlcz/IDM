package i55;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx4.m0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004¨\u0006\u001a"}, d2 = {"Li55/e0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "repaymentToken", "Li55/e0$a;", "b", "Li55/e0$a;", "()Li55/e0$a;", "header", "", "Lnx4/m0;", "c", "Ljava/util/List;", "()Ljava/util/List;", "items", "Lnx4/q;", "Lnx4/q;", "()Lnx4/q;", "footer", "e", "successMessage", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("token")
    @NotNull
    private final String repaymentToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("header")
    @NotNull
    private final a header;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<m0> items;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("footer")
    @NotNull
    private final nx4.q footer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("successTitle")
    private final String successMessage;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Li55/e0$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "title", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.title, ((a) obj2).title);
        }

        public final int hashCode() {
            return this.title.hashCode();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final nx4.q getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRepaymentToken() {
        return this.repaymentToken;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSuccessMessage() {
        return this.successMessage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.repaymentToken, e0Var.repaymentToken) && Intrinsics.f(this.header, e0Var.header) && Intrinsics.f(this.items, e0Var.items) && Intrinsics.f(this.footer, e0Var.footer) && Intrinsics.f(this.successMessage, e0Var.successMessage);
    }

    public final int hashCode() {
        int iHashCode = (this.footer.hashCode() + p.a.d((this.header.hashCode() + (this.repaymentToken.hashCode() * 31)) * 31, 31, this.items)) * 31;
        String str = this.successMessage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
