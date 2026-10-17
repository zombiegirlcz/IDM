package cpi;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f107964a;

    public m(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f107964a = context;
    }

    public final ite.a a() {
        phm.a aVar = (phm.a) j6.a.i(this.f107964a, ite.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return (ite.a) aVar2.b();
        }
        throw new IllegalStateException(a0.d.q("Api ", ite.a.class, " is not found"));
    }
}
