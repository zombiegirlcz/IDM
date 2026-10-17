package xjg;

import com.revolut.feature.uipersonalisation.api.models.AppTheme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppTheme f306520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f306521b;

    public l(AppTheme style, boolean z) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f306520a = style;
        this.f306521b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f306520a, lVar.f306520a) && this.f306521b == lVar.f306521b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f306521b) + (this.f306520a.hashCode() * 31);
    }
}
