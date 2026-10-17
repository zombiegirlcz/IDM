package e14;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import st3.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0006\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\f\u0010\u0018¨\u0006\u001b"}, d2 = {"Le14/c;", "", "", "toString", "()Ljava/lang/String;", "Lst3/u;", "a", "Lst3/u;", "c", "()Lst3/u;", "confirmation", "Le14/e;", "b", "Le14/e;", "e", "()Le14/e;", "details", "Le14/b;", "Le14/b;", "()Le14/b;", "changes", "Le14/f;", "d", "Le14/f;", "()Le14/f;", "confirmationPopup", "changesPopup", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("confirmation")
    @NotNull
    private final u confirmation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("details")
    @NotNull
    private final e details;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("changes")
    @NotNull
    private final b changes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("confirmationPopup")
    @NotNull
    private final f confirmationPopup;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("changesPopup")
    @NotNull
    private final f changesPopup;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getChanges() {
        return this.changes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getChangesPopup() {
        return this.changesPopup;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final u getConfirmation() {
        return this.confirmation;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f getConfirmationPopup() {
        return this.confirmationPopup;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final e getDetails() {
        return this.details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.confirmation, cVar.confirmation) && Intrinsics.f(this.details, cVar.details) && Intrinsics.f(this.changes, cVar.changes) && Intrinsics.f(this.confirmationPopup, cVar.confirmationPopup) && Intrinsics.f(this.changesPopup, cVar.changesPopup);
    }

    public final int hashCode() {
        return this.changesPopup.hashCode() + ((this.confirmationPopup.hashCode() + ((this.changes.hashCode() + ((this.details.hashCode() + (this.confirmation.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
