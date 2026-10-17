package o17;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lr6.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ h f221316a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f221317b;

    static {
        i0[] elements = {i0.BANK_TRANSFER, i0.OPEN_BANKING, i0.UNKNOWN};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f221317b = kotlin.collections.d.y0(elements);
    }

    private h() {
    }
}
