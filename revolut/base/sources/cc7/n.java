package cc7;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n {
    private n() {
    }

    public static int a(zb7.c rating) {
        Intrinsics.checkNotNullParameter(rating, "rating");
        for (o oVar : o.values()) {
            if (oVar.c() == rating) {
                return oVar.ordinal();
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
