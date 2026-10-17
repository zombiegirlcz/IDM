package oo0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f226980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f226981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f226982c;
    public final ArrayList d;

    public i() {
        this(0);
    }

    public final void a(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f226981b = aVar;
    }

    public i(int i) {
        a status = a.ABSENT;
        ArrayList listeners = new ArrayList();
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        this.f226980a = 0L;
        this.f226981b = status;
        this.f226982c = 0L;
        this.d = listeners;
    }
}
