package m7;

import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.LottieDrawable;
import d7.b0;
import java.util.HashSet;

/* JADX INFO: loaded from: classes16.dex */
public final class l implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f203243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f203244b;

    public l(String str, k kVar, boolean z) {
        this.f203243a = kVar;
        this.f203244b = z;
    }

    @Override // m7.b
    public final f7.d a(LottieDrawable lottieDrawable, d7.j jVar, n7.b bVar) {
        if (((HashSet) lottieDrawable.f25596n.f322835b).contains(b0.MergePathsApi19)) {
            return new f7.n(this);
        }
        r7.c.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f203243a + CoreConstants.CURLY_RIGHT;
    }
}
