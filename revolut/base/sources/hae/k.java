package hae;

import android.app.Activity;
import com.revolut.data.model.Data;
import com.revolut.domain.models.openbanking.OpenBankingPayment;
import com.revolut.feature.external_accounts.impl.mandate.mandate_details.MandateDetailsScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.navigable.screen.BaseScreen;
import efm.h0;
import efm.w;
import he4.r;
import java.io.File;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements o, fe9.i, kfm.g, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f150496b;

    public /* synthetic */ k(Object obj2, int i) {
        this.f150495a = i;
        this.f150496b = obj2;
    }

    @Override // fe9.i
    public zl0.e a(zq.a promptInfo, fe9.d biometricCallback) {
        BaseScreen baseScreen = (BaseScreen) this.f150496b;
        Intrinsics.checkNotNullParameter(promptInfo, "promptInfo");
        Intrinsics.checkNotNullParameter(biometricCallback, "biometricCallback");
        zl0.b bVar = zl0.c.Companion;
        Activity activityM2 = baseScreen.m2();
        bVar.getClass();
        return zl0.b.b(activityM2, promptInfo, biometricCallback);
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((h8b.b) this.f150496b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f150495a;
        Object obj2 = this.f150496b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((ha1.k) obj2).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i7) ((gae.a) obj2).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((hbg.w) obj2).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((hbg.w) obj2).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((hbg.w) obj2).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((hc0.a) obj2).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (File) ((gqh.a) obj2).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((hb4.k) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((h8b.b) obj2).invoke(p0);
                return Boolean.TRUE;
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((hb4.k) obj2).invoke(p0);
            case 10:
            case 15:
            case 21:
            case 22:
            case 23:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((hje.d) obj2).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((r) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((h56.a) obj2).invoke(p0);
                return Boolean.TRUE;
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((r) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((r) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (x61.i) ((r) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((r) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (x61.f) ((hf6.b) obj2).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (OpenBankingPayment) ((r) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((r) obj2).invoke(p0);
            case 24:
                MandateDetailsScreen.Companion aVar = MandateDetailsScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((r) obj2).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BridgeDestination) ((hhd.n) obj2).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((hje.a) obj2).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((hje.a) obj2).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((hhd.n) obj2).invoke(p0);
                return Boolean.TRUE;
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f150495a;
        r rVar = (r) this.f150496b;
        switch (i) {
            case 21:
                MandateDetailsScreen.Companion aVar = MandateDetailsScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 22:
                MandateDetailsScreen.Companion aVar2 = MandateDetailsScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                MandateDetailsScreen.Companion aVar3 = MandateDetailsScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) rVar.invoke(p0)).booleanValue();
    }
}
