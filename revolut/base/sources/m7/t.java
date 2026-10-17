package m7;

import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.LottieDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class t implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f203265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l7.a f203266c;
    public final boolean d;

    public t(String str, int i, l7.a aVar, boolean z) {
        this.f203264a = str;
        this.f203265b = i;
        this.f203266c = aVar;
        this.d = z;
    }

    @Override // m7.b
    public final f7.d a(LottieDrawable lottieDrawable, d7.j jVar, n7.b bVar) {
        return new f7.u(lottieDrawable, bVar, this);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ShapePath{name=");
        sb6.append(this.f203264a);
        sb6.append(", index=");
        return j6.a.t(sb6, this.f203265b, CoreConstants.CURLY_RIGHT);
    }
}
