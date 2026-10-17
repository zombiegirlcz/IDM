package t77;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class i {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Type f268601b = new TypeToken<List<? extends String>>() { // from class: com.revolut.feature.global_markets.impl.data.repositories.PinnedMarketAssetsRepository$Companion$STORAGE_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f268602a;

    public i(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f268602a = storage;
    }
}
