package ip0;

import com.revolut.core.ui_kit.delegates.SmartTileExchangeDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileSendMoneyDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class fg0 implements kfm.o, kfm.p, kfm.g, yil.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f164264b;

    public /* synthetic */ fg0(Object obj2, int i) {
        this.f164263a = i;
        this.f164264b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f164263a) {
            case 15:
                ((w10) this.f164264b).invoke(obj2);
                break;
            default:
                ((wk) this.f164264b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f164263a;
        Object obj2 = this.f164264b;
        switch (i) {
            case 0:
                SmartTileExchangeDelegate.Companion aVar = SmartTileExchangeDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.yg) ((eg0) obj2).invoke(p0);
            case 1:
                SmartTileExchangeDelegate.Companion aVar2 = SmartTileExchangeDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (SmartTileExchangeDelegate.Model) ((w10) obj2).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (SmartTileSendMoneyDelegate.Model) ((w10) obj2).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((za) obj2).invoke(p0);
                throw null;
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((za) obj2).invoke(p0);
                throw null;
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ii0) ((fi0) obj2).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ii0) ((fi0) obj2).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ui0) ((w10) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (zi0) ((wk) obj2).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (gj0) ((a5g.i) obj2).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.ai) ((lj0) obj2).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.ai) ((lj0) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.zh) ((lj0) obj2).invoke(p0);
            case 13:
            case 15:
            case 21:
            case 24:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (tp0) ((rp0) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ok0) ((w10) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (um0) ((sm0) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (um0) ((sm0) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (an0) ((xm0) obj2).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (an0) ((xm0) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (VaultsProgressDelegate.Model) ((w10) obj2).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((za) obj2).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ep0) ((za) obj2).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (sp0) ((w10) obj2).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (tp0) ((rp0) obj2).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (tp0) ((rp0) obj2).invoke(p0);
        }
    }

    @Override // yil.a
    public String generate() {
        com.revolut.sso.impl.ui.signup.b bVar = (com.revolut.sso.impl.ui.signup.b) this.f164264b;
        String strGenerate = bVar.f106771s.generate();
        bVar.H2(bVar.z, new ik3.a(strGenerate, 3));
        return strGenerate;
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f164263a) {
            case 13:
                lj0 lj0Var = (lj0) this.f164264b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) lj0Var.invoke(p0)).booleanValue();
            default:
                za zaVar = (za) this.f164264b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) zaVar.invoke(p0)).booleanValue();
        }
    }
}
