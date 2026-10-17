package i52;

import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g52.c f158557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmTransferRecipient f158558b;

    public f(g52.c result, ApmTransferRecipient contact) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f158557a = result;
        this.f158558b = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f158557a, fVar.f158557a) && Intrinsics.f(this.f158558b, fVar.f158558b);
    }

    public final int hashCode() {
        return this.f158558b.hashCode() + (this.f158557a.hashCode() * 31);
    }
}
