package ylm;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class o extends WeakReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f314777a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q referent, Object obj2) {
        super(referent);
        Intrinsics.checkNotNullParameter(referent, "referent");
        this.f314777a = obj2;
    }
}
