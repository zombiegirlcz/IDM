package z3g;

import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f319261a = a("{bookingId}", null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f319262b = a("{bookingId}", "{tab}");

    private a() {
    }

    public static String a(String bookingId, String str) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        String[] elements = {"flights", "booking", bookingId, str};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0.k0(d.L(elements), "/", null, null, 0, null, 62);
    }
}
