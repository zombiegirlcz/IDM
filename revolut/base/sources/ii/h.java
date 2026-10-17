package ii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161500a;

    public h(String orderId, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(orderId, "orderId");
                this.f161500a = orderId;
                break;
            default:
                this.f161500a = orderId;
                break;
        }
    }
}
