package au9;

import au6.e2;
import au6.z0;
import efm.r;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import te0.w;
import ue0.c;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f9677a;

    public b(c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f9677a = storage;
    }

    public final r a() {
        r map = e.c(this.f9677a.C0("KEY_TRANSFERS_CONTACT_DISCLAIMER", Boolean.TYPE), g.f186406a).map(new z0(new e2(4), 16));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return w.f0(map);
    }
}
