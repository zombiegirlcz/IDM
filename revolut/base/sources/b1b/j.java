package b1b;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f11772b;

    public /* synthetic */ j(k kVar, int i) {
        this.f11771a = i;
        this.f11772b = kVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f11771a) {
            case 0:
                k kVar = this.f11772b;
                return cim.b.b(Boolean.valueOf(!kVar.o.f82069a.contains((d1b.c) obj2)), Boolean.valueOf(!kVar.o.f82069a.contains((d1b.c) obj3)));
            default:
                k kVar2 = this.f11772b;
                return cim.b.b(Boolean.valueOf(!kVar2.o.f82069a.contains((d1b.c) obj2)), Boolean.valueOf(!kVar2.o.f82069a.contains((d1b.c) obj3)));
        }
    }
}
