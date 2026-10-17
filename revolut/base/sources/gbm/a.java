package gbm;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import uam.g;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f142274a = new a();

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        g fpsRange1 = (g) obj2;
        g fpsRange2 = (g) obj3;
        Intrinsics.checkNotNullParameter(fpsRange1, "fpsRange1");
        Intrinsics.checkNotNullParameter(fpsRange2, "fpsRange2");
        int iK = Intrinsics.k(fpsRange1.f278695a, fpsRange2.f278695a);
        return iK == 0 ? Intrinsics.k(fpsRange1.f278696b, fpsRange2.f278696b) : iK;
    }
}
