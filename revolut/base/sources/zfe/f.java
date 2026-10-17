package zfe;

import android.content.Context;
import jge.h;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f f321947a = new f();

    private f() {
    }

    public static she.g a(Context context) {
        phm.a aVar = (phm.a) kii.e.l(context, "context", context, h.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return ((h) aVar2.b()).a();
        }
        throw new IllegalStateException(a0.d.q("Api ", h.class, " is not found"));
    }
}
