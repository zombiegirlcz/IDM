package uie;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f280393a;

    public h(Context context) {
        this.f280393a = context;
    }

    public final wie.a a() {
        b.Companion.getClass();
        Context context = this.f280393a;
        Intrinsics.checkNotNullParameter(context, "context");
        zfe.g.Companion.getClass();
        she.g gVarA = zfe.f.a(context);
        Intrinsics.checkNotNullParameter(context, "context");
        zfe.e.Companion.getClass();
        return new wie.a(gVarA, zfe.d.a(context));
    }
}
