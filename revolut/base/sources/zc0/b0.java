package zc0;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.MandateSetupBottomSheetController;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.esim.api.navigation.EsimFeatureConfig;
import dej.c4;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b0 implements kfm.o, kfm.p, kfm.g, SuccessContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f321009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f321010b;

    public /* synthetic */ b0(Object obj2, int i) {
        this.f321009a = i;
        this.f321010b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((zab.s) this.f321010b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f321009a) {
            case 0:
                a0 a0Var = (a0) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) a0Var.invoke(p0);
            case 1:
                za9.c cVar = (za9.c) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) cVar.invoke(p0);
            case 2:
                a0 a0Var2 = (a0) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                a0Var2.invoke(p0);
                return pfm.m.f235744a;
            case 3:
                zab.s sVar = (zab.s) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) sVar.invoke(p0);
            case 4:
                zab.s sVar2 = (zab.s) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) sVar2.invoke(p0);
            case 5:
                z zVar = (z) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) zVar.invoke(p0);
            case 6:
                a0 a0Var3 = (a0) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) a0Var3.invoke(p0);
            case 7:
                u uVar = (u) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) uVar.invoke(p0);
            case 8:
                z8g.q qVar = (z8g.q) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) qVar.invoke(p0);
            case 9:
                yrk.e eVar = (yrk.e) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) eVar.invoke(p0);
            case 10:
                a0 a0Var4 = (a0) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) a0Var4.invoke(p0);
            case 11:
                a0 a0Var5 = (a0) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) a0Var5.invoke(p0);
            case 12:
            case 20:
            case 22:
            case 26:
            default:
                za9.c cVar2 = (za9.c) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) cVar2.invoke(p0);
            case 13:
                z zVar2 = (z) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) zVar2.invoke(p0);
            case 14:
                z8g.q qVar2 = (z8g.q) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) qVar2.invoke(p0);
            case 15:
                v vVar = (v) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) vVar.invoke(p0);
            case 16:
                z zVar3 = (z) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) zVar3.invoke(p0);
            case 17:
                zab.s sVar3 = (zab.s) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (rp0.y) sVar3.invoke(p0);
            case 18:
                zab.s sVar4 = (zab.s) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) sVar4.invoke(p0);
            case 19:
                z zVar4 = (z) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                zVar4.invoke(p0);
                return Boolean.TRUE;
            case 21:
                TransitionAnimation.Custom custom = (TransitionAnimation.Custom) this.f321010b;
                Throwable it8 = (Throwable) p0;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new EsimFeatureConfig.HomeDestination((c4) null, custom, 3);
            case 23:
                zf5.n nVar = (zf5.n) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (sf8.m) nVar.invoke(p0);
            case 24:
                z zVar5 = (z) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) zVar5.invoke(p0);
            case 25:
                zf8.a aVar = (zf8.a) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) aVar.invoke(p0);
            case 27:
                zh3.h hVar = (zh3.h) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) hVar.invoke(p0);
            case 28:
                zf5.n nVar2 = (zf5.n) this.f321010b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) nVar2.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f321009a;
        Object obj2 = this.f321010b;
        switch (i) {
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((z) obj2).invoke(p0)).booleanValue();
            default:
                int i2 = MandateSetupBottomSheetController.W;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((zg6.c) obj2).invoke(p0)).booleanValue();
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj2) {
        zf.a aVar = (zf.a) this.f321010b;
        Task taskB = aVar.f321808c.b();
        Task taskB2 = aVar.d.b();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskB, taskB2}).continueWithTask(aVar.f321807b, new bg.a(aVar, 5, taskB, taskB2));
    }
}
