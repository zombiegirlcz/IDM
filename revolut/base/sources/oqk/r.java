package oqk;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.q6;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f227981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q6[] f227982c;

    public /* synthetic */ r(g0 g0Var, q6[] q6VarArr, int i) {
        this.f227980a = i;
        this.f227981b = g0Var;
        this.f227982c = q6VarArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f227980a) {
            case 0:
                ipa.j it8 = (ipa.j) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                q6[] q6VarArr = this.f227982c;
                q6[] q6VarArr2 = (q6[]) Arrays.copyOf(q6VarArr, q6VarArr.length);
                g0 g0Var = this.f227981b;
                efm.b bVarSwitchMapCompletable = ((mjf.b0) g0Var.f227939c).m((q6[]) Arrays.copyOf(q6VarArr2, q6VarArr2.length)).switchMapCompletable(new oq3.f(18, new r(g0Var, q6VarArr2, 2)));
                Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
                break;
            case 1:
                ipa.j it9 = (ipa.j) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                q6[] q6VarArr3 = this.f227982c;
                q6[] q6VarArr4 = (q6[]) Arrays.copyOf(q6VarArr3, q6VarArr3.length);
                g0 g0Var2 = this.f227981b;
                efm.b bVarSwitchMapCompletable2 = rd0.e.c(g0Var2.f227943l.c((q6[]) Arrays.copyOf(q6VarArr4, q6VarArr4.length)), kotlin.coroutines.g.f186406a).switchMapCompletable(new oq3.f(19, new r(g0Var2, q6VarArr4, 3)));
                Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable2, "switchMapCompletable(...)");
                break;
            case 2:
                Boolean loaded = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(loaded, "loaded");
                if (loaded.booleanValue()) {
                    com.revolut.domain.interactors.transactions.a aVar = this.f227981b.f227939c;
                    q6[] q6VarArr5 = this.f227982c;
                }
                break;
            default:
                Boolean loaded2 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(loaded2, "loaded");
                if (!loaded2.booleanValue()) {
                }
                break;
        }
        return pfm.m.f235744a;
    }
}
