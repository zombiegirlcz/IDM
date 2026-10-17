package g1m;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f139749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f139750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f139751c;

    public l(int i, List eventIds, boolean z) {
        Intrinsics.checkNotNullParameter(eventIds, "eventIds");
        this.f139749a = i;
        this.f139750b = z;
        this.f139751c = eventIds;
    }
}
