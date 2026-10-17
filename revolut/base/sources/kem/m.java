package kem;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f183215b;

    public m(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f183214a = name;
        this.f183215b = value;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return kotlin.text.a0.z(mVar.f183214a, this.f183214a, true) && kotlin.text.a0.z(mVar.f183215b, this.f183215b, true);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f183214a.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f183215b.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return iHashCode + (iHashCode * 31) + lowerCase2.hashCode();
    }

    public final String toString() {
        return "HeaderValueParam(name=" + this.f183214a + ", value=" + this.f183215b + ", escapeValue=false)";
    }
}
