package l8a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010¨\u0006\u0012"}, d2 = {"Ll8a/j;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "b", "()Ljo3/a;", "amount", "Ljava/lang/String;", "c", "message", "Ll8a/h;", "Ll8a/h;", "()Ll8a/h;", "alias", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final jo3.a amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("message")
    private final String message;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("alias")
    @NotNull
    private final h alias;

    public j(jo3.a aVar, String str, h alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.amount = aVar;
        this.message = str;
        this.alias = alias;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final h getAlias() {
        return this.alias;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.amount, jVar.amount) && Intrinsics.f(this.message, jVar.message) && Intrinsics.f(this.alias, jVar.alias);
    }

    public final int hashCode() {
        jo3.a aVar = this.amount;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        String str = this.message;
        return this.alias.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
