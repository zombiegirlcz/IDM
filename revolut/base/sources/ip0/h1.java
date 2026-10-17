package ip0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f164488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f164489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f164490c;

    public h1(int i, TextLocalisedClause label, ArrayList bars) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(bars, "bars");
        this.f164488a = label;
        this.f164489b = bars;
        this.f164490c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return this.f164488a.equals(h1Var.f164488a) && this.f164489b.equals(h1Var.f164489b) && this.f164490c == h1Var.f164490c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f164490c) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f164489b, this.f164488a.hashCode() * 31, 31);
    }
}
