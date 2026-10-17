package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lkfj/w4;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "confirmButtonText", "b", "dismissButtonText", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("confirmButtonText")
    @NotNull
    private final String confirmButtonText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dismissButtonText")
    @NotNull
    private final String dismissButtonText;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getConfirmButtonText() {
        return this.confirmButtonText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDismissButtonText() {
        return this.dismissButtonText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w4)) {
            return false;
        }
        w4 w4Var = (w4) obj2;
        return Intrinsics.f(this.confirmButtonText, w4Var.confirmButtonText) && Intrinsics.f(this.dismissButtonText, w4Var.dismissButtonText);
    }

    public final int hashCode() {
        return this.dismissButtonText.hashCode() + (this.confirmButtonText.hashCode() * 31);
    }
}
