package m7;

import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.LottieDrawable;

/* JADX INFO: loaded from: classes16.dex */
public final class o implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203251a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f203252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l7.b f203253c;
    public final boolean d;
    public final l7.g e;
    public final Object f;

    public o(String str, l7.b bVar, l7.b bVar2, l7.f fVar, boolean z) {
        this.f203252b = str;
        this.f203253c = bVar;
        this.e = bVar2;
        this.f = fVar;
        this.d = z;
    }

    @Override // m7.b
    public final f7.d a(LottieDrawable lottieDrawable, d7.j jVar, n7.b bVar) {
        switch (this.f203251a) {
            case 0:
                return new f7.r(lottieDrawable, bVar, this);
            default:
                return new f7.s(lottieDrawable, bVar, this);
        }
    }

    public String toString() {
        switch (this.f203251a) {
            case 0:
                return "RectangleShape{position=" + this.e + ", size=" + ((l7.g) this.f) + CoreConstants.CURLY_RIGHT;
            default:
                return super.toString();
        }
    }

    public o(String str, l7.g gVar, l7.c cVar, l7.b bVar, boolean z) {
        this.f203252b = str;
        this.e = gVar;
        this.f = cVar;
        this.f203253c = bVar;
        this.d = z;
    }
}
