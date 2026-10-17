package o07;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f221157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f221158b;

    public a(TextLocalisedClause label, boolean z) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f221157a = label;
        this.f221158b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f221157a.equals(aVar.f221157a) && this.f221158b == aVar.f221158b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f221158b) + (this.f221157a.hashCode() * 31);
    }
}
