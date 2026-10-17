package lp6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    private c() {
    }

    public static String a(String parameterType, String id10) {
        Intrinsics.checkNotNullParameter(parameterType, "parameterType");
        Intrinsics.checkNotNullParameter(id10, "id");
        return v0.a.i(new StringBuilder("KEY_CACHE_FEEDBACK_CONFIG"), parameterType, id10);
    }
}
