package fo;

import java.time.format.DateTimeFormatter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uo.f f136727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f136728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTimeFormatter f136729c;

    public g(uo.f eventsBuilder, ue0.c storage) {
        Intrinsics.checkNotNullParameter(eventsBuilder, "eventsBuilder");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f136727a = eventsBuilder;
        this.f136728b = storage;
        this.f136729c = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX");
    }
}
