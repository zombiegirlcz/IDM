package vm5;

import java.time.Instant;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d f290534a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Date f290535b;

    static {
        Date dateFrom = Date.from(Instant.ofEpochMilli(0L));
        Intrinsics.checkNotNullExpressionValue(dateFrom, "from(...)");
        f290535b = dateFrom;
    }

    private d() {
    }
}
