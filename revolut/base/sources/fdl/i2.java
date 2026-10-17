package fdl;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i2 extends rlm.x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i2 f134157b = new i2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f134158c;

    static {
        String[] elements = {"informative", "chronological"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f134158c = kotlin.collections.d.y0(elements);
    }

    private i2() {
        super(nlm.a.a(h2.Companion.serializer()));
    }
}
