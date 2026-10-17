package le3;

import android.app.Activity;
import com.revolut.data.model.Data;
import com.revolut.feature.support.impl.transfer_tracker.ui.unique_transaction_reference.UniqueTransactionReferenceInputScreen;
import com.revolut.feature.travel.miles.api.model.TravelMilesRate;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.h0;
import hfg.g0;
import hfg.l0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class y implements kfm.o, fe9.i, zp0.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f194506b;

    public /* synthetic */ y(Object obj2, int i) {
        this.f194505a = i;
        this.f194506b = obj2;
    }

    @Override // fe9.i
    public zl0.e a(zq.a promptInfo, fe9.d biometricCallback) {
        ViewController viewController = (ViewController) this.f194506b;
        Intrinsics.checkNotNullParameter(promptInfo, "promptInfo");
        Intrinsics.checkNotNullParameter(biometricCallback, "biometricCallback");
        zl0.b bVar = zl0.c.Companion;
        Activity activityM2 = viewController.m2();
        bVar.getClass();
        return zl0.b.b(activityM2, promptInfo, biometricCallback);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f194505a) {
            case 0:
                l3d.a aVar = (l3d.a) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) aVar.invoke(p0);
            case 1:
                a0 a0Var = (a0) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) a0Var.invoke(p0);
            case 2:
                khg.s sVar = (khg.s) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) sVar.invoke(p0);
            case 3:
                a0 a0Var2 = (a0) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) a0Var2.invoke(p0);
            case 4:
                a5k.s sVar2 = (a5k.s) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) sVar2.invoke(p0);
            case 5:
            case 6:
            default:
                khg.s sVar3 = (khg.s) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) sVar3.invoke(p0);
            case 7:
                b bVar = (b) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) bVar.invoke(p0);
            case 8:
                b bVar2 = (b) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (TravelMilesRate) bVar2.invoke(p0);
            case 9:
                b bVar3 = (b) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) bVar3.invoke(p0);
            case 10:
                b bVar4 = (b) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) bVar4.invoke(p0);
            case 11:
                b bVar5 = (b) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (hfg.e) bVar5.invoke(p0);
            case 12:
                b bVar6 = (b) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) bVar6.invoke(p0);
            case 13:
                b bVar7 = (b) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (hfg.z) bVar7.invoke(p0);
            case 14:
                lfg.y yVar = (lfg.y) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) yVar.invoke(p0);
            case 15:
                lfg.z zVar = (lfg.z) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (hfg.h) zVar.invoke(p0);
            case 16:
                lfg.z zVar2 = (lfg.z) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (hfg.p) zVar2.invoke(p0);
            case 17:
                lfg.z zVar3 = (lfg.z) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (l0) zVar3.invoke(p0);
            case 18:
                lfg.z zVar4 = (lfg.z) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (hfg.t) zVar4.invoke(p0);
            case 19:
                lfg.y yVar2 = (lfg.y) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) yVar2.invoke(p0);
            case 20:
                lfg.z zVar5 = (lfg.z) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (hfg.j) zVar5.invoke(p0);
            case 21:
                lfg.z zVar6 = (lfg.z) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (g0) zVar6.invoke(p0);
            case 22:
                lfg.z zVar7 = (lfg.z) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (hfg.f) zVar7.invoke(p0);
            case 23:
                lfg.z zVar8 = (lfg.z) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (hfg.r) zVar8.invoke(p0);
            case 24:
                lfg.z zVar9 = (lfg.z) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) zVar9.invoke(p0);
            case 25:
                lfg.z zVar10 = (lfg.z) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) zVar10.invoke(p0);
            case 26:
                return (hfg.k) ((lfg.z) this.f194506b).invoke(p0);
            case 27:
                lfg.z zVar11 = (lfg.z) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) zVar11.invoke(p0);
            case 28:
                lhi.f fVar = (lhi.f) this.f194506b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) fVar.invoke(p0);
        }
    }

    @Override // zp0.x
    public void e(String str, String str2, String uniqueTransactionReference, boolean z) {
        UniqueTransactionReferenceInputScreen uniqueTransactionReferenceInputScreen = (UniqueTransactionReferenceInputScreen) this.f194506b;
        KProperty[] kPropertyArr = UniqueTransactionReferenceInputScreen.Q;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        Intrinsics.checkNotNullParameter(uniqueTransactionReference, "formattedValue");
        lee.m mVarE3 = uniqueTransactionReferenceInputScreen.R2();
        mVarE3.getClass();
        Intrinsics.checkNotNullParameter(uniqueTransactionReference, "uniqueTransactionReference");
        mVarE3.H2(mVarE3.o, new l3d.a(uniqueTransactionReference, 12));
    }
}
