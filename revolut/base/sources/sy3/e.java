package sy3;

import ht3.l0;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f266611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f266612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f266613c;
    public final h d;
    public final h e;

    public e(l0 confirmation, f details, c changes, h confirmationPopup, h changesPopup) {
        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(confirmationPopup, "confirmationPopup");
        Intrinsics.checkNotNullParameter(changesPopup, "changesPopup");
        this.f266611a = confirmation;
        this.f266612b = details;
        this.f266613c = changes;
        this.d = confirmationPopup;
        this.e = changesPopup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f266611a, eVar.f266611a) && Intrinsics.f(this.f266612b, eVar.f266612b) && Intrinsics.f(this.f266613c, eVar.f266613c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f266613c.hashCode() + ((this.f266612b.hashCode() + (this.f266611a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
