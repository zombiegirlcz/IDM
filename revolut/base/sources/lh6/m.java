package lh6;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f195172a;

    public m(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.f195172a = locale;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f195172a, ((m) obj2).f195172a);
    }

    public final int hashCode() {
        return this.f195172a.hashCode();
    }
}
