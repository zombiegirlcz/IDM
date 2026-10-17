package m7;

import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.LottieDrawable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f203262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f203263c;

    public s(String str, List list, boolean z) {
        this.f203261a = str;
        this.f203262b = list;
        this.f203263c = z;
    }

    @Override // m7.b
    public final f7.d a(LottieDrawable lottieDrawable, d7.j jVar, n7.b bVar) {
        return new f7.e(lottieDrawable, bVar, this, jVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f203261a + "' Shapes: " + Arrays.toString(this.f203262b.toArray()) + CoreConstants.CURLY_RIGHT;
    }
}
