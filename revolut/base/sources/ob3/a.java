package ob3;

import kotlin.jvm.internal.Intrinsics;
import nii.n1;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f223867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f223868b;

    public a(String transactionId, n1 dialogResult) {
        Intrinsics.checkNotNullParameter(dialogResult, "dialogResult");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f223867a = dialogResult;
        this.f223868b = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f223867a, aVar.f223867a) && Intrinsics.f(this.f223868b, aVar.f223868b);
    }

    public final int hashCode() {
        return this.f223868b.hashCode() + (this.f223867a.hashCode() * 31);
    }
}
