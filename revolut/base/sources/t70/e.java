package t70;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.h1;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f268387b = {o0.f186429a.j(new h0(e.class, "listener", "getListener()Lcom/revolut/core/android/localization/DynamicStringsListener;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e8.r f268388a;

    public e(cpi.a provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f268388a = new e8.r((Function0) provider);
    }

    public final h1 a() {
        return (h1) this.f268388a.b(f268387b[0]);
    }

    @Override // od0.e
    public final void clear() {
        e8.r.d(this.f268388a, null, 3);
    }
}
