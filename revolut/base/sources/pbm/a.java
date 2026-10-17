package pbm;

import java.time.ZonedDateTime;
import java.util.function.Function;
import lbm.k;
import lbm.l;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f234751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f234752b;

    public /* synthetic */ a(l lVar, k kVar) {
        this.f234751a = lVar;
        this.f234752b = kVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj2) {
        Object obj3 = this.f234752b.get();
        c cVar = this.f234751a.f193734c;
        d dVar = new d();
        ZonedDateTime.now();
        dVar.f234753a = obj3;
        cVar.b(dVar);
        return obj3;
    }
}
