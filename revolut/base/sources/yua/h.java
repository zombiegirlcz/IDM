package yua;

import aw0.x8;
import com.revolut.camerakit.revolut.ui.barcodeqr.screen.BarcodeQrReaderScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.EditKeyStatsScreen;
import efm.h0;
import efm.w;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import yw0.f;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h implements kfm.o, kfm.p, kfm.g, kfm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f316945b;

    public /* synthetic */ h(Function function, int i) {
        this.f316944a = i;
        this.f316945b = function;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f316944a;
        yw0.a aVar = (yw0.a) this.f316945b;
        switch (i) {
            case 7:
                f.a aVar2 = yw0.f.Companion;
                aVar.invoke(obj2);
                break;
            case 8:
                f.a aVar3 = yw0.f.Companion;
                aVar.invoke(obj2);
                break;
            case 9:
            case 11:
            case 12:
            case 13:
            default:
                f.a aVar4 = yw0.f.Companion;
                aVar.invoke(obj2);
                break;
            case 10:
                f.a aVar5 = yw0.f.Companion;
                aVar.invoke(obj2);
                break;
            case 14:
                f.a aVar6 = yw0.f.Companion;
                aVar.invoke(obj2);
                break;
            case 15:
                f.a aVar7 = yw0.f.Companion;
                aVar.invoke(obj2);
                break;
            case 16:
                f.a aVar8 = yw0.f.Companion;
                aVar.invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f316944a;
        Function function = this.f316945b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((f) function).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Long) ((ysk.a) function).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Long) ((yv2.n) function).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((ysk.a) function).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((ysk.a) function).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((ysk.a) function).invoke(p0);
            case 6:
            case 7:
            case 8:
            case 10:
            case 14:
            case 15:
            case 16:
            case 17:
            case 21:
            case 23:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((yxb.a) function).invoke(p0);
            case 9:
                f.a aVar = yw0.f.Companion;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((yv8.j) function).invoke(p0);
            case 11:
                f.a aVar2 = yw0.f.Companion;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((yv8.j) function).invoke(p0);
            case 12:
                f.a aVar3 = yw0.f.Companion;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((yw0.a) function).invoke(p0);
            case 13:
                f.a aVar4 = yw0.f.Companion;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (x8) ((bu0.b) function).invoke(p0);
            case 18:
                KProperty[] kPropertyArr = BarcodeQrReaderScreen.R;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((yv8.j) function).invoke(p0);
                return yx.g.f317505a;
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Integer) ((yv8.j) function).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((yxb.a) function).invoke(p0);
                return Boolean.TRUE;
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((yxb.a) function).invoke(p0);
                return Boolean.TRUE;
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((yxb.a) function).invoke(p0);
                return Boolean.TRUE;
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((wo5.a) function).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((w43.b) function).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((yrb.i) function).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        yv8.j jVar = (yv8.j) this.f316945b;
        KProperty[] kPropertyArr = EditKeyStatsScreen.T;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) jVar.invoke(p0)).booleanValue();
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        switch (this.f316944a) {
            case 21:
                yw9.j jVar = (yw9.j) this.f316945b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                return (NaviCommand) jVar.invoke(p0, p17);
            case 22:
            default:
                yw9.j jVar2 = (yw9.j) this.f316945b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                return (NaviCommand) jVar2.invoke(p0, p17);
            case 23:
                yw9.j jVar3 = (yw9.j) this.f316945b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                return (NaviCommand) jVar3.invoke(p0, p17);
        }
    }
}
