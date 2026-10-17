package zlm;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ulm.h1;
import zsc.p;

/* JADX INFO: loaded from: classes13.dex */
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f323315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f323316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f323317c;

    public m(h1 protocol, int i, String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f323315a = protocol;
        this.f323316b = i;
        this.f323317c = message;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        if (this.f323315a == h1.HTTP_1_0) {
            sb6.append("HTTP/1.0");
        } else {
            sb6.append("HTTP/1.1");
        }
        sb6.append(p.SPACE_CHAR);
        sb6.append(this.f323316b);
        sb6.append(p.SPACE_CHAR);
        sb6.append(this.f323317c);
        return sb6.toString();
    }
}
