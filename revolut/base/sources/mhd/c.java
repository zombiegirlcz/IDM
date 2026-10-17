package mhd;

import com.google.android.gms.tasks.Task;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.WatchlistHomeScreen;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements kfm.o, kfm.p, efm.e, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f205490b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f205489a = i;
        this.f205490b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f205489a) {
            case 6:
                ((m98.k) this.f205490b).invoke(obj2);
                break;
            case 19:
                ((mk5.r) this.f205490b).invoke(obj2);
                break;
            case 23:
                ((ml5.a) this.f205490b).invoke(obj2);
                break;
            case 27:
                ((mli.g) this.f205490b).invoke(obj2);
                break;
            case 28:
                ((mli.g) this.f205490b).invoke(obj2);
                break;
            default:
                ((mli.h) this.f205490b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f205489a;
        Object obj2 = this.f205490b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = WatchlistHomeScreen.i0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((mh4.x) obj2).invoke(p0);
                return a.b.f86977a;
            case 1:
            case 3:
            case 5:
            case 6:
            case 19:
            case 23:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((ml3.y) obj2).invoke(p0);
            case 2:
                KProperty[] kPropertyArr2 = WatchlistHomeScreen.i0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((mh4.x) obj2).invoke(p0);
                return a.C0546a.f86976a;
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((ac1.b) obj2).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((mh4.x) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((mh4.x) obj2).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((mjf.c) obj2).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((mjf.c) obj2).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((mjf.c) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((mh4.x) obj2).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((ma2.s) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((mh4.x) obj2).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((mk5.r) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData.Currencies.DefaultSorting) ((mk3.c) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((mk5.s) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((mk5.r) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((mk3.c) obj2).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((jeg.i) obj2).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((ml5.a) obj2).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((mk3.c) obj2).invoke(p0);
                return Boolean.TRUE;
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (alc.l) ((lrk.h) obj2).invoke(p0);
        }
    }

    @Override // efm.e
    public void d(pfm.g emitter) {
        Task task = (Task) this.f205490b;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        task.addOnCompleteListener(new kgm.c(emitter));
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f205489a;
        mh4.x xVar = (mh4.x) this.f205490b;
        switch (i) {
            case 1:
                KProperty[] kPropertyArr = WatchlistHomeScreen.i0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) xVar.invoke(p0)).booleanValue();
    }
}
