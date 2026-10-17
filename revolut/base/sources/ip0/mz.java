package ip0;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class mz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f165432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f165433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165434c;

    public mz(TextLocalisedClause startText, TextLocalisedClause endText, boolean z) {
        Intrinsics.checkNotNullParameter(startText, "startText");
        Intrinsics.checkNotNullParameter(endText, "endText");
        this.f165432a = startText;
        this.f165433b = endText;
        this.f165434c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof mz)) {
            return false;
        }
        mz mzVar = (mz) obj2;
        return this.f165432a.equals(mzVar.f165432a) && this.f165433b.equals(mzVar.f165433b) && this.f165434c == mzVar.f165434c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165434c) + j6.a.b(50, t61.a.a(this.f165432a.hashCode() * 31, 31, this.f165433b), 31);
    }
}
