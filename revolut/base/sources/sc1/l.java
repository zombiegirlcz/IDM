package sc1;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import androidx.core.location.LocationManagerCompat;
import efm.r;
import fa1.a0;
import fa1.z;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import ma1.t;
import ma1.y;
import org.jetbrains.annotations.NotNull;
import s65.o;
import sa1.q;
import te0.w;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends zb1.b implements g {

    @NotNull
    public static final k Companion = new k();
    public final a A;
    public final cji.d B;
    public final cji.d C;
    public final cji.d D;
    public final cji.d E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f261616w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final da1.d f261617x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final s70.a f261618y;
    public final dfc.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p stateMapper, y scanningInteractor, da1.d connectionInteractor, s70.a intentProvider, dfc.a cardReaderUiRouter, a promptProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(scanningInteractor, "scanningInteractor");
        Intrinsics.checkNotNullParameter(connectionInteractor, "connectionInteractor");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(cardReaderUiRouter, "cardReaderUiRouter");
        Intrinsics.checkNotNullParameter(promptProvider, "promptProvider");
        this.f261616w = scanningInteractor;
        this.f261617x = connectionInteractor;
        this.f261618y = intentProvider;
        this.z = cardReaderUiRouter;
        this.A = promptProvider;
        f0 f0Var = f0.f322471a;
        Intrinsics.checkNotNullParameter(f0Var, "default");
        this.B = ksj.b.a(f0Var);
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNullParameter(bool, "default");
        this.C = new cji.d(bool);
        Boolean bool2 = Boolean.TRUE;
        Intrinsics.checkNotNullParameter(bool2, "default");
        this.D = new cji.d(bool2);
        Intrinsics.checkNotNullParameter(bool, "default");
        this.E = new cji.d(bool);
    }

    public final void D2(boolean z) {
        Boolean boolValueOf;
        B2();
        if (z) {
            this.B.d(f0.f322471a);
        }
        if (((Boolean) this.D.a()).booleanValue()) {
            q qVar = (q) this.f261616w.f203916a;
            ihm.b bVar = qVar.f261240h;
            z zVar = (z) bVar.f();
            Object obj2 = null;
            if (zVar != null) {
                boolValueOf = Boolean.valueOf(((zVar instanceof z.a.c) || (zVar instanceof a0)) ? false : true);
            } else {
                boolValueOf = null;
            }
            if (pd.b.k(boolValueOf)) {
                ma1.g gVar = (ma1.g) qVar.e;
                ma1.e eVar = gVar.f203877a;
                w70.a aVar = gVar.f203878b;
                Context context = eVar.f203874a;
                y80.a aVar2 = eVar.d;
                if (!context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
                    obj2 = z.c.b.f133231a;
                } else if (!aVar2.b()) {
                    obj2 = z.c.C0783c.f133232a;
                } else if (aVar.a(31) || aVar2.c("android.permission.ACCESS_FINE_LOCATION")) {
                    BluetoothAdapter bluetoothAdapter = eVar.f203875b;
                    if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
                        obj2 = z.c.a.f133230a;
                    } else if (!aVar.a(31) && !LocationManagerCompat.isLocationEnabled(eVar.f203876c)) {
                        obj2 = z.c.e.f133234a;
                    }
                } else {
                    obj2 = z.c.d.f133233a;
                }
                if (obj2 != null) {
                    bVar.onNext(obj2);
                    return;
                }
                if (z) {
                    qVar.f261241j.clear();
                }
                qVar.b().startScan(Pattern.compile(".*"), qVar.k);
                bVar.onNext(z.a.c.f133229a);
            }
        }
    }

    @Override // yji.l
    public final void I1() {
        D2(true);
        r rVarSwitchMap = ((q) this.f261616w.f203916a).f261240h.switchMap(new o(new s8h.h(10), 25));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        zii.i.E0(this, rVarSwitchMap, new i(this, 8), null, 14);
        r rVarFilter = ((q) ((t) this.f261617x).f203904a).i.filter(new sa6.a(new sa6.y(10), 21));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        zii.i.E0(this, rVarFilter, new i(this, 7), null, 14);
    }

    @Override // yji.l
    public final void K1() {
        ((q) this.f261616w.f203916a).b().stopScan();
    }

    @Override // yji.l
    public final void T1(long j2) {
        r<R> rVarSwitchMap = r.timer(200L, TimeUnit.MILLISECONDS).switchMap(new zab.b(26, new za9.c(this, 3)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        zii.i.t(this, rVarSwitchMap, new z8h.b(23), null, 14);
        cji.d dVar = this.E;
        if (((Boolean) dVar.a()).booleanValue()) {
            dVar.d(Boolean.FALSE);
            D2(true);
        }
    }

    @Override // bji.b
    public final r y2() {
        r map = w.l(this.B.c(), this.C.c()).map(new sa6.a(new sa6.y(11), 22));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
