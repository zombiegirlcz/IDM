package gk8;

import com.revolut.feature.junior_progression.impl.data.service.JuniorProgressionService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorProgressionService f144348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f144349b;

    public d(JuniorProgressionService service, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f144348a = service;
        this.f144349b = storage;
    }
}
