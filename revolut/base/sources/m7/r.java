package m7;

import android.graphics.Path;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.LottieDrawable;

/* JADX INFO: loaded from: classes16.dex */
public final class r implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f203258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path.FillType f203259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f203260c;
    public final l7.a d;
    public final l7.a e;
    public final boolean f;

    public r(String str, boolean z, Path.FillType fillType, l7.a aVar, l7.a aVar2, boolean z3) {
        this.f203260c = str;
        this.f203258a = z;
        this.f203259b = fillType;
        this.d = aVar;
        this.e = aVar2;
        this.f = z3;
    }

    @Override // m7.b
    public final f7.d a(LottieDrawable lottieDrawable, d7.j jVar, n7.b bVar) {
        return new f7.h(lottieDrawable, bVar, this);
    }

    public final String toString() {
        return j6.a.x(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f203258a, CoreConstants.CURLY_RIGHT);
    }
}
