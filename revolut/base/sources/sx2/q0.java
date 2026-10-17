package sx2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f266325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f266326b;

    public q0(TextLocalisedClause text, ResourceImage icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f266325a = icon;
        this.f266326b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return this.f266325a.equals(q0Var.f266325a) && this.f266326b.equals(q0Var.f266326b);
    }

    public final int hashCode() {
        return this.f266326b.hashCode() + (this.f266325a.hashCode() * 31);
    }
}
