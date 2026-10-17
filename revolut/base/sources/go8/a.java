package go8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f145113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f145114b;

    public a(TextLocalisedClause text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f145113a = text;
        this.f145114b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f145113a.equals(aVar.f145113a) && this.f145114b == aVar.f145114b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f145114b) + (this.f145113a.hashCode() * 31);
    }
}
