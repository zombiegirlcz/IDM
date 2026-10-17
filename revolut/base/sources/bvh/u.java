package bvh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lbvh/u;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getAccountNomineeId", "accountNomineeId", "b", "getFirstName", "firstName", "c", "getLastName", "lastName", "d", "getDob", "dob", "e", "getEmail", "email", "Lbvh/b0;", "f", "Lbvh/b0;", "getAddress", "()Lbvh/b0;", "address", "", "g", "I", "getPercentage", "()I", "percentage", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountNomineeId")
    private final String accountNomineeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstName")
    @NotNull
    private final String firstName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastName")
    @NotNull
    private final String lastName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("dob")
    @NotNull
    private final String dob;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("email")
    private final String email;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("address")
    private final b0 address;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("percentage")
    private final int percentage;

    public u(String str, String firstName, String lastName, String dob2, String str2, b0 b0Var, int i) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(dob2, "dob");
        this.accountNomineeId = str;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob2;
        this.email = str2;
        this.address = b0Var;
        this.percentage = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.accountNomineeId, uVar.accountNomineeId) && Intrinsics.f(this.firstName, uVar.firstName) && Intrinsics.f(this.lastName, uVar.lastName) && Intrinsics.f(this.dob, uVar.dob) && Intrinsics.f(this.email, uVar.email) && Intrinsics.f(this.address, uVar.address) && this.percentage == uVar.percentage;
    }

    public final int hashCode() {
        String str = this.accountNomineeId;
        int iC = p.a.c(p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.firstName), 31, this.lastName), 31, this.dob);
        String str2 = this.email;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        b0 b0Var = this.address;
        return Integer.hashCode(this.percentage) + ((iHashCode + (b0Var != null ? b0Var.hashCode() : 0)) * 31);
    }
}
