package zb;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class q implements wb.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f320791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f320792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f320793c;

    public q(Set set, j jVar, s sVar) {
        this.f320791a = set;
        this.f320792b = jVar;
        this.f320793c = sVar;
    }

    public final r a(String str, wb.c cVar, wb.g gVar) {
        Set set = this.f320791a;
        if (set.contains(cVar)) {
            return new r(this.f320792b, str, cVar, gVar, this.f320793c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
