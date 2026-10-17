package sm0;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements yk0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i70.a f264299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f264300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f264301c;

    public a(i70.a vendorIdProvider, ue0.c storage, bm0.a cryptoWrapper) {
        Intrinsics.checkNotNullParameter(vendorIdProvider, "vendorIdProvider");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cryptoWrapper, "cryptoWrapper");
        this.f264299a = vendorIdProvider;
        this.f264300b = storage;
        this.f264301c = j.b(new sii.a(this, 2));
    }

    @Override // yk0.a
    public final String getToken() {
        return (String) this.f264301c.getValue();
    }
}
