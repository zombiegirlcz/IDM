package ycc;

import c90.c;
import java.time.OffsetDateTime;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f312606a;

    public b(e dateProvider, c uiResources) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f312606a = uiResources;
    }

    public final o6c.b a() {
        OffsetDateTime offsetDateTimeNow = OffsetDateTime.now();
        Intrinsics.h(offsetDateTimeNow);
        int totalSeconds = offsetDateTimeNow.getOffset().getTotalSeconds() / 60;
        c cVar = this.f312606a;
        return new o6c.b(totalSeconds, cVar.c(), cVar.f22265a.getResources().getDisplayMetrics().heightPixels, Integer.valueOf(cVar.c()));
    }
}
