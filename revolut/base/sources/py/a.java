package py;

import com.revolut.camerakit.client.api.models.HintMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HintMessage f240637a;

    public a() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f240637a, ((a) obj2).f240637a);
    }

    public final int hashCode() {
        HintMessage hintMessage = this.f240637a;
        if (hintMessage == null) {
            return 0;
        }
        return hintMessage.hashCode();
    }

    public a(HintMessage.ActiveLiveness activeLiveness) {
        this.f240637a = activeLiveness;
    }
}
