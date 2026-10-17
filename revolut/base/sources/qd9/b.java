package qd9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    private b() {
    }

    public static a a(b bVar, String cardId, String str, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return new a(cardId, str);
    }
}
