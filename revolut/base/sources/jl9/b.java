package jl9;

import com.revolut.feature.pay_with_photo.impl.network.PayWithPhotoService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayWithPhotoService f175653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk0.b f175654b;

    public b(PayWithPhotoService service, zk0.b fileSystemRepository) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        this.f175653a = service;
        this.f175654b = fileSystemRepository;
    }
}
