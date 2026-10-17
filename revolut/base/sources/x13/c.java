package x13;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class c implements e4m.e {
    public static c90.c a(z70.a contextProvider) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        return new c90.c(contextProvider.getContext());
    }
}
