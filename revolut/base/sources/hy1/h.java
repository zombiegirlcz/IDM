package hy1;

import com.google.common.collect.ImmutableMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class h implements e4m.e {
    public static cz5.b a(ImmutableMap byClass, ImmutableMap byKind) {
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(byClass, "byClass");
        Intrinsics.checkNotNullParameter(byKind, "byKind");
        return new cz5.b(byClass, byKind, 1);
    }
}
