package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lkfj/s3;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "", "b", "J", "()J", "dueDate", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "amount", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dueDate")
    private final long dueDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    public s3(String id10, long j2, jo3.a amount) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.id = id10;
        this.dueDate = j2;
        this.amount = amount;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj2;
        return Intrinsics.f(this.id, s3Var.id) && this.dueDate == s3Var.dueDate && Intrinsics.f(this.amount, s3Var.amount);
    }

    public final int hashCode() {
        return this.amount.hashCode() + a0.d.c(this.id.hashCode() * 31, 31, this.dueDate);
    }
}
