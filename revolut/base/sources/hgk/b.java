package hgk;

import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GlobalThemeDeclaration f152190a;

    public b(GlobalThemeDeclaration oldTheme) {
        Intrinsics.checkNotNullParameter(oldTheme, "oldTheme");
        this.f152190a = oldTheme;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f152190a, ((b) obj2).f152190a);
    }

    public final int hashCode() {
        return this.f152190a.hashCode();
    }
}
