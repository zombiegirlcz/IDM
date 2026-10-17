package yc;

import et0.w;
import java.util.ArrayList;
import vc.l;

/* JADX INFO: loaded from: classes16.dex */
public final class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f312409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f312410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f312411c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ a f;

    public f(a aVar, ArrayList arrayList, ArrayList arrayList2, long j2, boolean z, ArrayList arrayList3) {
        this.f = aVar;
        this.f312409a = arrayList;
        this.f312410b = arrayList2;
        this.f312411c = j2;
        this.d = z;
        this.e = arrayList3;
    }

    @Override // vc.l
    public final void zza() {
        a aVar = this.f;
        aVar.f312396l.addAll(this.f312409a);
        aVar.f312397m.addAll(this.f312410b);
        Long lValueOf = Long.valueOf(this.f312411c);
        aVar.k(5, 0, lValueOf, lValueOf, null, null, null);
    }

    @Override // vc.l
    public final void zzb(int i) {
        this.f.k(6, i, null, null, null, null, null);
    }

    @Override // vc.l
    public final void zzc() {
        if (this.d) {
            return;
        }
        a aVar = this.f;
        wc.d dVarA = aVar.i.a();
        ArrayList arrayList = this.f312409a;
        ArrayList arrayList2 = this.f312410b;
        long j2 = this.f312411c;
        ArrayList arrayList3 = this.e;
        f fVar = new f(aVar, arrayList, arrayList2, j2, true, arrayList3);
        dVarA.getClass();
        if (uc.a.e.get() == null) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        dVarA.d.execute(new w((Object) dVarA, (Object) arrayList3, (Object) fVar, false, 11));
    }
}
