package ijh;

import java.util.Comparator;
import wjh.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f161797b;

    public /* synthetic */ c(d dVar, int i) {
        this.f161796a = i;
        this.f161797b = dVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f161796a) {
            case 0:
                d dVar = this.f161797b;
                return cim.b.b(Long.valueOf(d.c(dVar, (a0) obj2)), Long.valueOf(d.c(dVar, (a0) obj3)));
            case 1:
                d dVar2 = this.f161797b;
                return cim.b.b(d.b(dVar2, (a0) obj2), d.b(dVar2, (a0) obj3));
            default:
                d dVar3 = this.f161797b;
                return cim.b.b(d.a(dVar3, (a0) obj2), d.a(dVar3, (a0) obj3));
        }
    }
}
