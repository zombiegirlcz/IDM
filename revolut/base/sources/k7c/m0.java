package k7c;

import com.revolut.feature.revolutpay.impl.data.service.RevolutPayJoinApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class m0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f181980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevolutPayJoinApiService f181981b;

    public m0(ue0.c storage, RevolutPayJoinApiService apiService) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        this.f181980a = storage;
        this.f181981b = apiService;
    }
}
