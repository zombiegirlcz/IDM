package btc;

import atc.b;
import io3.d;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import o97.v;
import tof.a3;
import tof.o3;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18557b;

    public a(f01.a uiKitResources) {
        this.f18556a = 3;
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f18557b = uiKitResources;
    }

    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        switch (this.f18556a) {
            case 0:
                xi0.b instance = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(instance, "instance");
                Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
                ((zq.a) this.f18557b).i(instance, targetCollection);
                break;
            case 1:
                d instance2 = (d) obj2;
                Intrinsics.checkNotNullParameter(instance2, "instance");
                Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
                zq.a aVar = (zq.a) this.f18557b;
                xi0.a aVar2 = xi0.b.Companion;
                String str = instance2.f163147c;
                aVar2.getClass();
                aVar.i(xi0.a.a(str), targetCollection);
                break;
            case 2:
                a3 instance3 = (a3) obj2;
                Intrinsics.checkNotNullParameter(instance3, "instance");
                Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
                zq.a aVar3 = (zq.a) this.f18557b;
                aVar3.i(instance3.k.f115083b, targetCollection);
                o3 o3Var = instance3.J;
                if (o3Var != null) {
                    aVar3.i(o3Var.f272965a.f115083b, targetCollection);
                }
                break;
            default:
                v instance4 = (v) obj2;
                Intrinsics.checkNotNullParameter(instance4, "instance");
                Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
                targetCollection.add(((f01.a) this.f18557b).b(instance4.f223133b).toString());
                break;
        }
    }

    public a(t70.b currencyLocalization, int i) {
        this.f18556a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
                this.f18557b = new zq.a(currencyLocalization);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(currencyLocalization, "currenciesLocalization");
                this.f18557b = new zq.a(currencyLocalization);
                break;
            default:
                Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
                this.f18557b = new zq.a(currencyLocalization);
                break;
        }
    }
}
