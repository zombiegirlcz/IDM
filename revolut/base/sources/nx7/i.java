package nx7;

import com.revolut.feature.card_input.common.ui.CardInputActivity;
import com.revolut.feature.credit.direct.debit.account_confirmation.InternalData;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.PetPlanBuilderFlowContract$PlanBuilderAction;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements kfm.o, kfm.g, kfm.j, kfm.c, zp0.x, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f220454b;

    public /* synthetic */ i(Object obj2, int i) {
        this.f220453a = i;
        this.f220454b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f220453a) {
            case 1:
                ((h) this.f220454b).invoke(obj2);
                break;
            case 5:
                ((o) this.f220454b).invoke(obj2);
                break;
            case 6:
                ((o) this.f220454b).invoke(obj2);
                break;
            case 16:
                ((ny7.a) this.f220454b).invoke(obj2);
                break;
            case 17:
                ((ny7.a) this.f220454b).invoke(obj2);
                break;
            case 18:
                ((ny7.i) this.f220454b).invoke(obj2);
                break;
            case 28:
                ((ny7.i) this.f220454b).invoke(obj2);
                break;
            default:
                ((ny7.i) this.f220454b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f220453a;
        Object obj2 = this.f220454b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((h) obj2).invoke(p0);
                return pfm.m.f235744a;
            case 1:
            case 3:
            case 5:
            case 6:
            case 7:
            case 10:
            case 16:
            case 17:
            case 18:
            case 19:
            case 22:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((ny7.i) obj2).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((o) obj2).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((o) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Float) ((nxc.a) obj2).invoke(p0);
            case 9:
                int i2 = CardInputActivity.B0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((nxa.v) obj2).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (InternalData) ((ny4.i) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((nxa.v) obj2).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (cw5.a) ((njf.e) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((ny5.h) obj2).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((ny7.a) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((nxa.v) obj2).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (vx7.b) ((nxa.v) obj2).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((ny7.i) obj2).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (sx7.b) ((nxa.v) obj2).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((ny7.i) obj2).invoke(p0);
        }
    }

    @Override // kfm.j
    public Object d(Object p0, Object p17, Object p2, Object p3, Object p42) {
        b6i.p pVar = (b6i.p) this.f220454b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        Intrinsics.checkNotNullParameter(p3, "p3");
        Intrinsics.checkNotNullParameter(p42, "p4");
        return (PetPlanBuilderFlowContract$PlanBuilderAction) pVar.invoke(p0, p17, p2, p3, p42);
    }

    @Override // zp0.x
    public void e(String str, String extractedValue, String str2, boolean z) {
        CardInputActivity cardInputActivity = (CardInputActivity) this.f220454b;
        int i = CardInputActivity.B0;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        cardInputActivity.A0.onNext(extractedValue);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f220453a) {
            case 19:
                nxa.v vVar = (nxa.v) this.f220454b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) vVar.invoke(p0)).booleanValue();
            case 20:
            case 21:
            default:
                nxa.v vVar2 = (nxa.v) this.f220454b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) vVar2.invoke(p0)).booleanValue();
            case 22:
                nxa.v vVar3 = (nxa.v) this.f220454b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) vVar3.invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.c
    public Object apply(Object obj2, Object p17) {
        nsl.d dVar = (nsl.d) this.f220454b;
        Long p0 = (Long) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (Long) dVar.invoke(p0, p17);
    }
}
