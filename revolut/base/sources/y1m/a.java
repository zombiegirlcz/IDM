package y1m;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f310416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f310417b;

    public a(int i, ArrayList externalCharacters) {
        Intrinsics.checkNotNullParameter(externalCharacters, "externalCharacters");
        this.f310416a = i;
        this.f310417b = externalCharacters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f310416a == aVar.f310416a && this.f310417b.equals(aVar.f310417b);
    }

    public final int hashCode() {
        return this.f310417b.hashCode() + (Integer.hashCode(this.f310416a) * 31);
    }

    public final String toString() {
        return "ICChipReaderJapanDocumentDriversLicenseMultipleAndRawExternalCharacters(index=" + this.f310416a + ", externalCharacters=" + this.f310417b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
