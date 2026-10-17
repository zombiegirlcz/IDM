package b6i;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f12759a;

    static {
        j8l.a[] elements = {j8l.a.CRYPTO, j8l.a.FIAT};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f12759a = kotlin.collections.d.y0(elements);
    }
}
