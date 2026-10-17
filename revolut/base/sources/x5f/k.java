package x5f;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import wf0.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final utk.f f302967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2 f302968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2 f302969c;
    public final j2 d;

    public k(utk.f chartInteractor) {
        Intrinsics.checkNotNullParameter(chartInteractor, "chartInteractor");
        this.f302967a = chartInteractor;
        this.f302968b = vkm.q.c(null);
        this.f302969c = vkm.q.c(Boolean.TRUE);
        this.d = vkm.q.c(a6f.d.f1671a);
    }

    public final wkm.l a(String templateId) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        return vkm.q.Q(this.f302968b, new f0(5, this, templateId, (Continuation) null));
    }
}
