package po0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class z {

    @NotNull
    public static final com.revolut.core.ui_kit.background.d Companion = new com.revolut.core.ui_kit.background.d();
    public static final z e = new z(a0.DEFAULT, BitmapDescriptorFactory.HUE_RED, false, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f237872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f237873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f237874c;
    public final x d;

    public z(a0 layoutType, float f, boolean z, x xVar) {
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        this.f237872a = layoutType;
        this.f237873b = f;
        this.f237874c = z;
        this.d = xVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f237872a == zVar.f237872a && Float.compare(this.f237873b, zVar.f237873b) == 0 && this.f237874c == zVar.f237874c && Intrinsics.f(this.d, zVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(m72.b.b(this.f237873b, this.f237872a.hashCode() * 31, 31), 31, this.f237874c);
        x xVar = this.d;
        return iC + (xVar == null ? 0 : xVar.hashCode());
    }
}
