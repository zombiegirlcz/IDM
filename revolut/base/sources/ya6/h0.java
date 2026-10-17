package ya6;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class h0 implements e0 {

    @NotNull
    private static final g0 Companion = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Type f311969b = new TypeToken<Set<? extends ab6.a>>() { // from class: com.revolut.feature.donations.impl.repositories.PendingDonationsRepositoryImpl$Companion$PENDING_DONATIONS_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xe0.e f311970a;

    public h0(xe0.e storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f311970a = storage;
    }
}
