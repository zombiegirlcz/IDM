package d73;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.pcw_auth.api.models.PcwApplicationStatus;
import com.revolut.feature.retail.savings.impl.challenge.presentation.onboarding.setup.SavingsChallengeSetUpScreen;
import d7j.p0;
import dcf.a0;
import dcl.m0;
import efm.h0;
import efm.w;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import tof.i7;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class n implements kfm.o, kfm.g, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f111798b;

    public /* synthetic */ n(Object obj2, int i) {
        this.f111797a = i;
        this.f111798b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f111797a) {
            case 5:
                ((d34.b) this.f111798b).invoke(obj2);
                break;
            default:
                ((cn7.c) this.f111798b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f111797a;
        Object obj2 = this.f111798b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((d6j.b) obj2).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((m) obj2).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((d6j.b) obj2).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((a5b.b) obj2).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((d6j.b) obj2).invoke(p0);
            case 5:
            case 23:
            case 25:
            case 27:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((m0) obj2).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((p0) obj2).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (d88.c) ((d34.b) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((p0) obj2).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (dj0.d) ((a94.q) obj2).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((p0) obj2).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PcwApplicationStatus) ((dak.c) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((bke.t) obj2).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i7) ((dak.c) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((dc6.a) obj2).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((d34.b) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((dc9.a) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((dc9.a) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((a0) obj2).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((a0) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((a0) obj2).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((a0) obj2).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((dak.c) obj2).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((m0) obj2).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((dg3.d) obj2).invoke(p0);
                return Boolean.TRUE;
            case 28:
                KProperty[] kPropertyArr = SavingsChallengeSetUpScreen.T;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Integer) ((dg3.d) obj2).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        dg3.d dVar = (dg3.d) this.f111798b;
        KProperty[] kPropertyArr = SavingsChallengeSetUpScreen.T;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) dVar.invoke(p0)).booleanValue();
    }
}
