package dkg;

import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import kotlin.jvm.internal.Intrinsics;
import xjg.j;
import xjg.m;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GlobalThemeDeclaration f115516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f115517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f115518c;

    public a(GlobalThemeDeclaration theme, m themeMode, j accent) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(themeMode, "themeMode");
        Intrinsics.checkNotNullParameter(accent, "accent");
        this.f115516a = theme;
        this.f115517b = themeMode;
        this.f115518c = accent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f115516a, aVar.f115516a) && this.f115517b == aVar.f115517b && this.f115518c == aVar.f115518c;
    }

    public final int hashCode() {
        return this.f115518c.hashCode() + ((this.f115517b.hashCode() + (this.f115516a.hashCode() * 31)) * 31);
    }
}
