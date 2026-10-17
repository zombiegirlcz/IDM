package tna;

import com.revolut.feature.uipersonalisation.api.models.AppTheme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppTheme f272346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f272347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f272348c;

    public m(AppTheme selectedTheme, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(selectedTheme, "selectedTheme");
        this.f272346a = selectedTheme;
        this.f272347b = z;
        this.f272348c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f272346a, mVar.f272346a) && this.f272347b == mVar.f272347b && this.f272348c == mVar.f272348c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f272348c) + j6.a.c(this.f272346a.hashCode() * 31, 31, this.f272347b);
    }
}
