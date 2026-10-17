package a72;

import com.revolut.feature.apm.multibanco.impl.data.network.MultibancoCardService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultibancoCardService f1753a;

    public d(MultibancoCardService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f1753a = service;
    }
}
