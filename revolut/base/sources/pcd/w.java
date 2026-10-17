package pcd;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f234902a;

    static {
        h0[] elements = {h0.CREATED, h0.PENDING_ACTIVATION, h0.ACTIVE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f234902a = kotlin.collections.d.y0(elements);
    }
}
