package atg;

import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f9070b;

    public /* synthetic */ s(v vVar, int i) {
        this.f9069a = i;
        this.f9070b = vVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f9069a) {
            case 0:
                k kVar = this.f9070b.d;
                return cim.b.b(Integer.valueOf(kVar.b(((io3.d) obj2).f163147c)), Integer.valueOf(kVar.b(((io3.d) obj3).f163147c)));
            default:
                k kVar2 = this.f9070b.d;
                return cim.b.b(Integer.valueOf(kVar2.b(((io3.d) obj2).f163147c)), Integer.valueOf(kVar2.b(((io3.d) obj3).f163147c)));
        }
    }
}
