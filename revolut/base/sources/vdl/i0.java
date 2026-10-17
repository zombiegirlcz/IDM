package vdl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x4l.c f287981a;

    public i0(x4l.c dod2) {
        Intrinsics.checkNotNullParameter(dod2, "dod");
        this.f287981a = dod2;
    }

    public static vkm.d a(i0 i0Var, List list) {
        i0Var.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return i0Var.f287981a.b(new scl.d(list), loadingStrategy);
    }
}
