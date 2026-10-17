package ye0;

import android.content.Context;
import ch.qos.logback.core.util.FileSize;
import com.revolut.core.data.storage.size_checker.StorageTooLargeException;
import com.revolut.core.data.storage.size_checker.StorageTooManyKeysException;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import rd0.d;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f312740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f312741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap.KeySetView f312742c;

    public b(Context context, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f312740a = coroutineScope;
        this.f312741b = context.getApplicationContext();
        this.f312742c = ConcurrentHashMap.newKeySet();
    }

    public static final void a(b bVar, String storageName, long j2) {
        if (j2 > FileSize.MB_COEFFICIENT) {
            String sizeInMegabytes = m72.b.t(new Object[]{Float.valueOf(j2 / 1048576.0f)}, 1, Locale.US, "%.1f", "format(...)");
            Intrinsics.checkNotNullParameter(storageName, "storageName");
            Intrinsics.checkNotNullParameter(sizeInMegabytes, "sizeInMegabytes");
            StorageTooLargeException storageTooLargeException = new StorageTooLargeException(j6.a.s("Storage '", storageName, "' is ", sizeInMegabytes, "MB large"));
            storageTooLargeException.setStackTrace(uc0.b.b("checkByteSize", storageName));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, "StorageSizeChecker", null, storageTooLargeException, h0Var);
        }
    }

    public static final void b(b bVar, String storageName, Set set) {
        if (set.size() > 200) {
            int size = set.size();
            List sampleKeys = d0.V0(set, 10);
            Intrinsics.checkNotNullParameter(storageName, "storageName");
            Intrinsics.checkNotNullParameter(sampleKeys, "sampleKeys");
            StringBuilder sbK = v0.a.k(size, "Storage '", storageName, "' has ", " keys, example: ");
            sbK.append(sampleKeys);
            StorageTooManyKeysException storageTooManyKeysException = new StorageTooManyKeysException(sbK.toString());
            storageTooManyKeysException.setStackTrace(uc0.b.b("checkKeyCount", storageName));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, "StorageSizeChecker", null, storageTooManyKeysException, h0Var);
        }
    }
}
