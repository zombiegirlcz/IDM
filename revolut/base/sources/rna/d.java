package rna;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f255535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f255536b;

    public d(Data selectedTheme, String currentLanguage) {
        Intrinsics.checkNotNullParameter(selectedTheme, "selectedTheme");
        Intrinsics.checkNotNullParameter(currentLanguage, "currentLanguage");
        this.f255535a = selectedTheme;
        this.f255536b = currentLanguage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f255535a, dVar.f255535a) && Intrinsics.f(this.f255536b, dVar.f255536b);
    }

    public final int hashCode() {
        return this.f255536b.hashCode() + (this.f255535a.hashCode() * 31);
    }
}
