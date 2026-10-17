package z4l;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class i extends koi.i implements g {
    public final h e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j adapter, boolean z) {
        super(adapter, z);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.e = new h();
    }

    @Override // z4l.g
    public final void a() {
    }

    @Override // koi.i, koi.f
    public final List getItems() {
        return this.e;
    }

    @Override // koi.i, koi.f
    public final c getItems() {
        return this.e;
    }
}
