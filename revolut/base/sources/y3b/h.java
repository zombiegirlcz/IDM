package y3b;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3b.a f310691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f310692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f310693c;
    public final Set d;

    public h(z3b.a expiryDateMapper, a calendarItemTypeMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(expiryDateMapper, "expiryDateMapper");
        Intrinsics.checkNotNullParameter(calendarItemTypeMapper, "calendarItemTypeMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f310691a = expiryDateMapper;
        this.f310692b = calendarItemTypeMapper;
        this.f310693c = dateProvider;
        l3b.a[] elements = {l3b.a.NINETY_DAYS, l3b.a.TODAY, l3b.a.CUSTOM};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.d = kotlin.collections.d.y0(elements);
    }
}
