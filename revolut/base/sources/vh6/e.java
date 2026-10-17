package vh6;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016¨\u0006\u0018"}, d2 = {"Lvh6/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "type", "", "b", "Z", "c", "()Z", "selectable", "", "Lvh6/d;", "Ljava/util/List;", "()Ljava/util/List;", "permissions", "Lvh6/b;", "Lvh6/b;", "()Lvh6/b;", "expiration", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("selectable")
    private final boolean selectable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("permissions")
    @NotNull
    private final List<d> permissions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("expiration")
    @NotNull
    private final b expiration;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getExpiration() {
        return this.expiration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getPermissions() {
        return this.permissions;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getSelectable() {
        return this.selectable;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.type, eVar.type) && this.selectable == eVar.selectable && Intrinsics.f(this.permissions, eVar.permissions) && Intrinsics.f(this.expiration, eVar.expiration);
    }

    public final int hashCode() {
        return this.expiration.hashCode() + p.a.d(j6.a.c(this.type.hashCode() * 31, 31, this.selectable), 31, this.permissions);
    }
}
