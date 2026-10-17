package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ha {
    public static final List a(o80 navigationChannel, fh0 orcaDestroyer, r70 mainRepository, v10 imageServiceLocator) {
        xq0 vmVar;
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(orcaDestroyer, "orcaDestroyer");
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        if (!s70.a(mainRepository)) {
            return zhm.f0.f322471a;
        }
        if (mainRepository instanceof ey) {
            vmVar = new sg1();
        } else {
            if (!(mainRepository instanceof ml)) {
                throw new IllegalStateException("FL Developer error. Current product does not support ViewCompletion Error-handling.");
            }
            vmVar = new vm();
        }
        return zhm.v.k(new vd1(orcaDestroyer, imageServiceLocator), new ae1(navigationChannel, vmVar, imageServiceLocator), new yd1(navigationChannel, vmVar, imageServiceLocator), new zd1(navigationChannel, vmVar, imageServiceLocator));
    }
}
