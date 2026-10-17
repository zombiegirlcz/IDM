package gvh;

import kotlin.jvm.internal.Intrinsics;
import kvh.h;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c implements e4m.e {
    public static ivh.c a(h serverErrorHelper, yp.b appStoreNavigationFactory) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(serverErrorHelper, "serverErrorHelper");
        Intrinsics.checkNotNullParameter(appStoreNavigationFactory, "appStoreNavigationFactory");
        return new ivh.c(serverErrorHelper, appStoreNavigationFactory);
    }
}
