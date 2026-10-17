package nii;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f216198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f216199c;

    public /* synthetic */ n0(m0 m0Var, t0 t0Var) {
        this.f216197a = 2;
        this.f216199c = m0Var;
        this.f216198b = t0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f216197a) {
            case 0:
                gy0.b lifecycle = (gy0.b) obj2;
                Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
                if (lifecycle == gy0.b.FINISHED) {
                    t0 t0Var = this.f216198b;
                    t0Var.j(false);
                    k1 k1Var = new k1(this.f216199c);
                    t0Var.g(k1Var);
                    t0Var.f216224h.onNext(k1Var);
                }
                break;
            case 1:
                ty0.a data = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                t0 t0Var2 = this.f216198b;
                t0Var2.j(true);
                j1 j1Var = new j1(this.f216199c, data);
                t0Var2.g(j1Var);
                t0Var2.f216224h.onNext(j1Var);
                break;
            case 2:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                m0 m0Var = this.f216199c;
                boolean z = m0Var instanceof c0;
                t0 t0Var3 = this.f216198b;
                if (z) {
                    if (((c0) m0Var).f216128g) {
                        t0Var3.j(true);
                    }
                } else if (m0Var instanceof v) {
                    t0Var3.j(false);
                } else {
                    t0Var3.j(true);
                }
                l1 l1Var = new l1(m0Var);
                t0Var3.g(l1Var);
                t0Var3.f216224h.onNext(l1Var);
                break;
            default:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                t0 t0Var4 = this.f216198b;
                t0Var4.j(true);
                m1 m1Var = new m1(this.f216199c);
                t0Var4.g(m1Var);
                t0Var4.f216224h.onNext(m1Var);
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ n0(t0 t0Var, m0 m0Var, int i) {
        this.f216197a = i;
        this.f216198b = t0Var;
        this.f216199c = m0Var;
    }
}
