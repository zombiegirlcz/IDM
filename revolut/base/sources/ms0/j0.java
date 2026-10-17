package ms0;

import com.revolut.core.ui_kit.internal.views.ProductIntroView;
import com.revolut.core.ui_kit.internal.views.ScratchView;
import com.revolut.data.model.Data;
import com.revolut.feature.blue_prompt.fullscreen.BluePromptActivity;
import java.util.concurrent.TimeoutException;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class j0 implements kfm.g, kfm.p, kfm.o, kfm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f208297b;

    public /* synthetic */ j0(Function function, int i) {
        this.f208296a = i;
        this.f208297b = function;
    }

    @Override // kfm.g
    public void accept(Object obj2) throws TimeoutException {
        int i = this.f208296a;
        Function function = this.f208297b;
        switch (i) {
            case 0:
                int i2 = l0.E;
                ((i0) function).invoke(obj2);
                return;
            case 1:
                int i3 = l0.E;
                ((i0) function).invoke(obj2);
                return;
            case 3:
                ProductIntroView.Companion companion = ProductIntroView.INSTANCE;
                ((mqg.b) function).invoke(obj2);
                return;
            case 5:
                ProductIntroView.Companion companion2 = ProductIntroView.INSTANCE;
                ((a82.r) function).invoke(obj2);
                throw null;
            case 8:
                ProductIntroView.Companion companion3 = ProductIntroView.INSTANCE;
                ((mk5.s) function).invoke(obj2);
                return;
            case 11:
                ((v2) function).invoke(obj2);
                return;
            case 19:
                BluePromptActivity.Companion companion4 = BluePromptActivity.INSTANCE;
                ((mm7.h) function).invoke(obj2);
                return;
            default:
                ((mqi.a) function).invoke(obj2);
                return;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f208296a;
        Function function = this.f208297b;
        switch (i) {
            case 4:
                ProductIntroView.Companion companion = ProductIntroView.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((a82.r) function).invoke(p0);
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 19:
            case 25:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((msb.c) function).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((v2) function).invoke(p0);
            case 13:
                int i2 = ScratchView.B;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Float) ((mqi.a) function).invoke(p0);
            case 14:
                BluePromptActivity.Companion companion2 = BluePromptActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ks2.c) ((mqg.b) function).invoke(p0);
            case 15:
                BluePromptActivity.Companion companion3 = BluePromptActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ks2.c) ((mqg.b) function).invoke(p0);
            case 16:
                BluePromptActivity.Companion companion4 = BluePromptActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ks2.c) ((mqg.b) function).invoke(p0);
            case 17:
                BluePromptActivity.Companion companion5 = BluePromptActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((mqg.b) function).invoke(p0);
            case 18:
                BluePromptActivity.Companion companion6 = BluePromptActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Integer) ((mk5.s) function).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((ms2.i) function).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((ms2.i) function).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((ms2.i) function).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((ms2.i) function).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((ms2.i) function).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((mqg.b) function).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((mqg.b) function).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f208296a;
        mqg.b bVar = (mqg.b) this.f208297b;
        switch (i) {
            case 2:
                ProductIntroView.Companion companion = ProductIntroView.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 9:
                ProductIntroView.Companion companion2 = ProductIntroView.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) bVar.invoke(p0)).booleanValue();
    }

    @Override // kfm.b
    public void accept(Object obj2, Object obj3) throws Throwable {
        int i = this.f208296a;
        Function function = this.f208297b;
        switch (i) {
            case 6:
                ProductIntroView.Companion companion = ProductIntroView.INSTANCE;
                ((k2) function).invoke(obj2, obj3);
                break;
            case 7:
                ProductIntroView.Companion companion2 = ProductIntroView.INSTANCE;
                ((k2) function).invoke(obj2, obj3);
                break;
            default:
                ((kp0.m) function).invoke(obj2, obj3);
                break;
        }
    }
}
