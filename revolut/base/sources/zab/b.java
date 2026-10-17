package zab;

import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsStepFragment;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.TravelHotelsBookingAmendmentDatesPickerScreen;
import dce.k0;
import java.time.LocalDate;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zbj.j0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements kfm.g, kfm.p, kfm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f320595b;

    public /* synthetic */ b(int i, Function1 function1) {
        this.f320594a = i;
        this.f320595b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f320594a;
        Function1 function1 = this.f320595b;
        switch (i) {
            case 0:
                ((a) function1).invoke(obj2);
                break;
            case 1:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 14:
            default:
                ((btb.m) function1).invoke(obj2);
                break;
            case 2:
                ((a) function1).invoke(obj2);
                break;
            case 4:
                ((a) function1).invoke(obj2);
                break;
            case 11:
                SignSmsStepFragment.Companion aVar = SignSmsStepFragment.INSTANCE;
                ((w) function1).invoke(obj2);
                break;
            case 12:
                SignSmsStepFragment.Companion aVar2 = SignSmsStepFragment.INSTANCE;
                ((w) function1).invoke(obj2);
                break;
            case 13:
                SignSmsStepFragment.Companion aVar3 = SignSmsStepFragment.INSTANCE;
                ((w) function1).invoke(obj2);
                break;
            case 15:
                SignSmsStepFragment.Companion aVar4 = SignSmsStepFragment.INSTANCE;
                ((z8h.b) function1).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f320594a;
        Function1 function1 = this.f320595b;
        switch (i) {
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) ((z8h.b) function1).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((j) function1).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((l) function1).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yab.a) ((z8h.b) function1).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((s) function1).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((z8h.b) function1).invoke(p0);
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((j0) function1).invoke(p0);
            case 14:
                SignSmsStepFragment.Companion aVar = SignSmsStepFragment.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yab.a) ((z8h.b) function1).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((w) function1).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((zae.f) function1).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((zae.f) function1).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (abe.a) ((s) function1).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((k0) function1).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (abe.a) ((s) function1).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((k0) function1).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((z8h.b) function1).invoke(p0);
            case 25:
                KProperty[] kPropertyArr = TravelHotelsBookingAmendmentDatesPickerScreen.Q;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (LocalDate) ((z8h.b) function1).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((za9.c) function1).invoke(p0);
            case 27:
                return (Boolean) ((j0) function1).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (sa) ((j0) function1).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f320594a) {
            case 1:
                a aVar = (a) this.f320595b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) aVar.invoke(p0)).booleanValue();
            default:
                z8h.b bVar = (z8h.b) this.f320595b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) bVar.invoke(p0)).booleanValue();
        }
    }
}
