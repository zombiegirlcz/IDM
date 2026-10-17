package csh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public interface g {
    default List a(Class contextClass) {
        Intrinsics.checkNotNullParameter(contextClass, "contextClass");
        return f0.f322471a;
    }

    List b(Class cls);
}
