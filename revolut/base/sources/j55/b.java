package j55;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import st3.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lj55/b;", "", "", "toString", "()Ljava/lang/String;", "Lst3/u;", "a", "Lst3/u;", "b", "()Lst3/u;", "promptScreen", "Lj55/c;", "Lj55/c;", "()Lj55/c;", "confirmationScreen", "Lj55/d;", "c", "Lj55/d;", "()Lj55/d;", "successPopup", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("promptScreen")
    @NotNull
    private final u promptScreen;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("confirmationScreen")
    @NotNull
    private final c confirmationScreen;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("successPopup")
    private final d successPopup;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getConfirmationScreen() {
        return this.confirmationScreen;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final u getPromptScreen() {
        return this.promptScreen;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getSuccessPopup() {
        return this.successPopup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.promptScreen, bVar.promptScreen) && Intrinsics.f(this.confirmationScreen, bVar.confirmationScreen) && Intrinsics.f(this.successPopup, bVar.successPopup);
    }

    public final int hashCode() {
        int iHashCode = (this.confirmationScreen.hashCode() + (this.promptScreen.hashCode() * 31)) * 31;
        d dVar = this.successPopup;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
