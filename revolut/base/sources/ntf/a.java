package ntf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f219016a;

    public a(f01.a uiKitResources, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                this.f219016a = uiKitResources;
                break;
            default:
                Intrinsics.checkNotNullParameter(uiKitResources, "resources");
                this.f219016a = uiKitResources;
                break;
        }
    }
}
