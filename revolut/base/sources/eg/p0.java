package eg;

import androidx.datastore.core.DataStore;
import az0.r1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements i0 {

    @NotNull
    private static final j0 Companion = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f125475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataStore f125476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f125477c;
    public final akg.n d;

    public p0(CoroutineContext backgroundDispatcher, DataStore dataStore) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.f125475a = backgroundDispatcher;
        this.f125476b = dataStore;
        this.f125477c = new AtomicReference();
        this.d = new akg.n(new vkm.y(dataStore.getData(), new l0(3, 0, null)), this, 1);
        skm.e0.C(skm.e0.c(backgroundDispatcher), null, null, new r1(this, null, 2), 3);
    }
}
