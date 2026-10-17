package ll3;

import ao.h;
import kotlin.jvm.internal.Intrinsics;
import ml3.i;
import ne0.j;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f196497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f196498c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj2, String str, int i, long j2, int i2) {
        this.f196496a = i2;
        this.e = obj2;
        this.f196497b = str;
        this.f196498c = i;
        this.d = j2;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f196496a) {
            case 0:
                j jVar = (j) ((h) this.e).f7848c;
                for (i iVar : jVar.getAll()) {
                    String str = iVar.f206594b;
                    String str2 = this.f196497b;
                    if (Intrinsics.f(str, str2) || Intrinsics.f(iVar.f, str2) || Intrinsics.f(iVar.f206596g, str2)) {
                        jVar.f(iVar.f206594b, i.a(iVar, this.f196498c, this.d));
                    }
                }
                return;
            default:
                v11.b bVar = ((r21.h) this.e).f251038b;
                String str3 = this.f196497b;
                f5j.a aVarB = bVar.b(str3);
                if (aVarB == null) {
                    throw new IllegalArgumentException(p.a.p("Beneficiary with id = ", str3, " is not found"));
                }
                bVar.d(f5j.a.a(aVarB, this.f196498c, this.d, null, 2097151999));
                return;
        }
    }
}
