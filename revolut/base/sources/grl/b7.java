package grl;

import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes13.dex */
public final class b7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.e f146062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.d f146063b;

    public b7(ecm.e eVar, ecm.d dVar) {
        this.f146062a = (ecm.e) Preconditions.checkNotNull(eVar, "channel");
        this.f146063b = (ecm.d) Preconditions.checkNotNull(dVar, "callOptions");
    }

    public final b7 a(ecm.c cVar, Object obj2) {
        return new b7(this.f146062a, this.f146063b.c(cVar, obj2));
    }
}
