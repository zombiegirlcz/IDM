package nzd;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import s7a.c0;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f221022a;

    public a(Locale selectedLocale) {
        Intrinsics.checkNotNullParameter(selectedLocale, "selectedLocale");
        this.f221022a = selectedLocale;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f221022a, ((a) obj2).f221022a);
    }

    public final int hashCode() {
        return this.f221022a.hashCode();
    }
}
