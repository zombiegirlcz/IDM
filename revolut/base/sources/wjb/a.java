package wjb;

import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qib.c;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    @NotNull
    private static final C1645a Companion = new C1645a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f298035a;

    /* JADX INFO: renamed from: wjb.a$a, reason: collision with other inner class name */
    public static final class C1645a {
        private C1645a() {
        }
    }

    static {
        c[] elements = {c.COMPLETED, c.FAILED, c.AT_RISK};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f298035a = d.y0(elements);
    }
}
