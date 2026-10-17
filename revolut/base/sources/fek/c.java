package fek;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lfek/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getFirstName", "firstName", "b", "getLastName", "lastName", "c", "getDob", "dob", "d", "getEmail", "email", "Lno3/b;", "e", "Lno3/b;", "getAddress", "()Lno3/b;", "address", "feature_pod_nominees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstName")
    @NotNull
    private final String firstName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastName")
    @NotNull
    private final String lastName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("dob")
    @NotNull
    private final String dob;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("email")
    private final String email;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("address")
    private final no3.b address;

    public c(String firstName, String lastName, String dob2, String str, no3.b bVar) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(dob2, "dob");
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob2;
        this.email = str;
        this.address = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.firstName, cVar.firstName) && Intrinsics.f(this.lastName, cVar.lastName) && Intrinsics.f(this.dob, cVar.dob) && Intrinsics.f(this.email, cVar.email) && Intrinsics.f(this.address, cVar.address);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.firstName.hashCode() * 31, 31, this.lastName), 31, this.dob);
        String str = this.email;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        no3.b bVar = this.address;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
