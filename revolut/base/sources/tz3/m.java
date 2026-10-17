package tz3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019¨\u0006\u001b"}, d2 = {"Ltz3/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "phoneNumber", "b", "firstName", "c", "lastName", "Ljo3/a;", "d", "Ljo3/a;", "()Ljo3/a;", "loanAmount", "", "e", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "loanDuration", "Ltz3/c;", "Ltz3/c;", "()Ltz3/c;", "content", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("phoneNumber")
    @NotNull
    private final String phoneNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstName")
    @NotNull
    private final String firstName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastName")
    @NotNull
    private final String lastName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("loanAmount")
    private final jo3.a loanAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("loanDuration")
    private final Integer loanDuration;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("content")
    @NotNull
    private final c content;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getLoanAmount() {
        return this.loanAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getLoanDuration() {
        return this.loanDuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.phoneNumber, mVar.phoneNumber) && Intrinsics.f(this.firstName, mVar.firstName) && Intrinsics.f(this.lastName, mVar.lastName) && Intrinsics.f(this.loanAmount, mVar.loanAmount) && Intrinsics.f(this.loanDuration, mVar.loanDuration) && Intrinsics.f(this.content, mVar.content);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.phoneNumber.hashCode() * 31, 31, this.firstName), 31, this.lastName);
        jo3.a aVar = this.loanAmount;
        int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Integer num = this.loanDuration;
        return this.content.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }
}
