package a48;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0010"}, d2 = {"La48/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "e", "legalName", "firstName", "d", "lastName", "code", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("legalName")
    @NotNull
    private final String legalName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstName")
    @NotNull
    private final String firstName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("lastName")
    @NotNull
    private final String lastName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final String code;

    public e(String id10, String legalName, String firstName, String lastName, String code) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(legalName, "legalName");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(code, "code");
        this.id = id10;
        this.legalName = legalName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.code = code;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLegalName() {
        return this.legalName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.id, eVar.id) && Intrinsics.f(this.legalName, eVar.legalName) && Intrinsics.f(this.firstName, eVar.firstName) && Intrinsics.f(this.lastName, eVar.lastName) && Intrinsics.f(this.code, eVar.code);
    }

    public final int hashCode() {
        return this.code.hashCode() + p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.legalName), 31, this.firstName), 31, this.lastName);
    }
}
