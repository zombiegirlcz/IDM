package h5a;

import g5a.u;
import g5a.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f149518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b5a.d f149519b;

    public b(u itemMapper, v widgetsMapper, b5a.d localContactsItemsProvider) {
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(widgetsMapper, "widgetsMapper");
        Intrinsics.checkNotNullParameter(localContactsItemsProvider, "localContactsItemsProvider");
        this.f149518a = itemMapper;
        this.f149519b = localContactsItemsProvider;
    }
}
