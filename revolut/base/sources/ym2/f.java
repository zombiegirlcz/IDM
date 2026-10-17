package ym2;

import aii.r;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GlobalThemeDeclaration f314839a;

    public f(GlobalThemeDeclaration declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        this.f314839a = declaration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f314839a, ((f) obj2).f314839a);
    }

    public final int hashCode() {
        return this.f314839a.hashCode();
    }
}
