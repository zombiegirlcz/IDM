package a44;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPluginsService f1193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g14.b f1194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m31.c f1195c;
    public final p d;
    public final r80.c e;
    public final ve0.c f;

    public d(CreditPluginsService creditPluginsService, g14.b configMapper, m31.c multipartHelper, p creditApplicationDtoMapper, r80.c imageCompressor, ve0.c storage) {
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(configMapper, "configMapper");
        Intrinsics.checkNotNullParameter(multipartHelper, "multipartHelper");
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(imageCompressor, "imageCompressor");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f1193a = creditPluginsService;
        this.f1194b = configMapper;
        this.f1195c = multipartHelper;
        this.d = creditApplicationDtoMapper;
        this.e = imageCompressor;
        this.f = storage;
    }

    public static String a(String str) {
        return j6.a.q("photos_upload_items-", str);
    }
}
