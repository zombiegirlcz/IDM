package cm2;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d f25111a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f25112b;

    static {
        String[] elements = {em2.b.NATURE.getId(), em2.b.GRADIENTS.getId(), em2.b.UPLOADED.getId(), em2.b.UPBEAT.getId()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f25112b = kotlin.collections.d.y0(elements);
    }

    private d() {
    }
}
