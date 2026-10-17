package rla;

import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GlobalThemeDeclaration f254941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GlobalThemeDeclaration f254942b;

    public b(GlobalThemeDeclaration previousTheme, GlobalThemeDeclaration premiumTheme) {
        Intrinsics.checkNotNullParameter(previousTheme, "previousTheme");
        Intrinsics.checkNotNullParameter(premiumTheme, "premiumTheme");
        this.f254941a = previousTheme;
        this.f254942b = premiumTheme;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f254941a, bVar.f254941a) && Intrinsics.f(this.f254942b, bVar.f254942b);
    }

    public final int hashCode() {
        return this.f254942b.hashCode() + (this.f254941a.hashCode() * 31);
    }
}
