package kve;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import wim.z;
import yte.n;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f190095a;

    public b(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f190095a = storage;
    }

    public static String e(String str, n nVar) {
        return a0.d.s("SELECTED_METHOD-", str, "-", nVar.name());
    }

    public final c a(n contextType) {
        Intrinsics.checkNotNullParameter(contextType, "contextType");
        return (c) j6.a.k(c.class, this.f190095a, "TOPUP_METHODS_STORAGE_KEY-" + contextType);
    }

    public final jve.a b(String storedMethodId) {
        Intrinsics.checkNotNullParameter(storedMethodId, "storedMethodId");
        return (jve.a) j6.a.k(jve.a.class, this.f190095a, j6.a.q("ENTITY_KEY_STORED_METHOD_DETAILS_", storedMethodId));
    }

    public final void c(c newEntities, n contextType) {
        Intrinsics.checkNotNullParameter(newEntities, "newEntities");
        Intrinsics.checkNotNullParameter(contextType, "contextType");
        this.f190095a.G(newEntities, "TOPUP_METHODS_STORAGE_KEY-" + contextType, z.d(o0.b(c.class)));
    }

    public final void d(jve.a storedMethodDetails) {
        Intrinsics.checkNotNullParameter(storedMethodDetails, "storedMethodDetails");
        this.f190095a.G(storedMethodDetails, j6.a.q("ENTITY_KEY_STORED_METHOD_DETAILS_", storedMethodDetails.getAccountDetails().getId()), z.d(o0.b(jve.a.class)));
    }
}
