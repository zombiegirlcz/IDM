package k64;

import com.revolut.data.model.Data;
import com.revolut.feature.subscriptions.impl.label.SubscriptionLabelScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.h0;
import java.util.List;
import k5e.k;
import kfm.o;
import kfm.p;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements o, kfm.g, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f181619b;

    public /* synthetic */ a(int i, Function1 function1) {
        this.f181618a = i;
        this.f181619b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f181618a) {
            case 3:
                ((k7c.e) this.f181619b).invoke(obj2);
                break;
            case 4:
            case 5:
            default:
                ((k) this.f181619b).invoke(obj2);
                break;
            case 6:
                ((k79.b) this.f181619b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f181618a;
        Function1 function1 = this.f181619b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (cqi.f) ((k1.a) function1).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((b) function1).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((ja3.d) function1).invoke(p0);
            case 3:
            case 6:
            case 10:
            case 11:
            case 21:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((kcd.a) function1).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((k7c.d) function1).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (r7c.a) ((k7c.d) function1).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((k7c.d) function1).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((k7c.d) function1).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((k7c.d) function1).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((b2.a) function1).invoke(p0);
            case 13:
                KProperty[] kPropertyArr = SubscriptionLabelScreen.R;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((k9h.d) function1).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n61.o) ((k9h.d) function1).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((k9h.d) function1).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((kbj.a) function1).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((k) function1).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((g48.h) function1).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((kbj.a) function1).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((gae.a) function1).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((k9h.d) function1).invoke(p0);
                return Boolean.TRUE;
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((k9h.d) function1).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((i5f.g) function1).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((k9h.d) function1).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((k9h.d) function1).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((kce.e) function1).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((k65.d) function1).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f181618a) {
            case 10:
                k9h.d dVar = (k9h.d) this.f181619b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) dVar.invoke(p0)).booleanValue();
            default:
                k9h.d dVar2 = (k9h.d) this.f181619b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) dVar2.invoke(p0)).booleanValue();
        }
    }
}
