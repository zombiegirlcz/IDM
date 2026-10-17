package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkfj/e1;", "", "", "toString", "()Ljava/lang/String;", "Lkfj/f4;", "a", "Lkfj/f4;", "c", "()Lkfj/f4;", "porting", "Lkfj/d1;", "b", "Lkfj/d1;", "()Lkfj/d1;", "confirmation", "Lkfj/n1;", "Lkfj/n1;", "()Lkfj/n1;", "nextScreen", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("porting")
    @NotNull
    private final f4 porting;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("confirmation")
    private final d1 confirmation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextScreen")
    private final n1 nextScreen;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d1 getConfirmation() {
        return this.confirmation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final n1 getNextScreen() {
        return this.nextScreen;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final f4 getPorting() {
        return this.porting;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return Intrinsics.f(this.porting, e1Var.porting) && Intrinsics.f(this.confirmation, e1Var.confirmation) && Intrinsics.f(this.nextScreen, e1Var.nextScreen);
    }

    public final int hashCode() {
        int iHashCode = this.porting.hashCode() * 31;
        d1 d1Var = this.confirmation;
        int iHashCode2 = (iHashCode + (d1Var == null ? 0 : d1Var.hashCode())) * 31;
        n1 n1Var = this.nextScreen;
        return iHashCode2 + (n1Var != null ? n1Var.hashCode() : 0);
    }
}
