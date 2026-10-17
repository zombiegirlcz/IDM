package b79;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.notification_centre.impl.data.retrofit.service.NotificationCentreService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements od0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f12972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotificationCentreService f12973b;

    public s(ue0.c storage, NotificationCentreService service, ImmutableSet mappers) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(mappers, "mappers");
        this.f12972a = storage;
        this.f12973b = service;
    }

    @Override // od0.e
    public final void clear() {
        this.f12972a.clear();
    }
}
