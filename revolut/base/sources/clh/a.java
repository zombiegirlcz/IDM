package clh;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static l a(o headerVariant, int i, boolean z) {
        Intrinsics.checkNotNullParameter(headerVariant, "headerVariant");
        if (i > 3) {
            if (headerVariant instanceof m) {
                return new j(((m) headerVariant).f25004a);
            }
            if (!(headerVariant instanceof n)) {
                throw new NoWhenBranchMatchedException();
            }
            if (i > 3) {
                return new k(!z);
            }
        }
        return i.f25001a;
    }
}
