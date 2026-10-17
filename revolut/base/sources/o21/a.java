package o21;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lo21/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "topupMethodType", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "amount", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("topupMethodType")
    @NotNull
    private final String topupMethodType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("amount")
    @NotNull
    private final jo3.a amount;

    public a(jo3.a amount, String topupMethodType) {
        Intrinsics.checkNotNullParameter(topupMethodType, "topupMethodType");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.topupMethodType = topupMethodType;
        this.amount = amount;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTopupMethodType() {
        return this.topupMethodType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.topupMethodType, aVar.topupMethodType) && Intrinsics.f(this.amount, aVar.amount);
    }

    public final int hashCode() {
        return this.amount.hashCode() + (this.topupMethodType.hashCode() * 31);
    }
}
