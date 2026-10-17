package h5f;

import aah.h;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import t1h.f;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f149549a;

    public d(h disclaimersExtension) {
        Intrinsics.checkNotNullParameter(disclaimersExtension, "disclaimersExtension");
        this.f149549a = disclaimersExtension;
    }

    @Override // t1h.f
    public final Flow a() {
        return nim.a.v(this.f149549a.f2828l.w0(), new h3d.a(20));
    }
}
