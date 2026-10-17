package qt5;

import dv5.l;
import dv5.o;
import kotlin.jvm.internal.Intrinsics;
import pt5.m;
import pt5.r;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g implements e4m.e {
    public static o a(ev5.d factory, l presentationModel, r view, m router) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(router, "router");
        return new o(view, router, presentationModel);
    }
}
