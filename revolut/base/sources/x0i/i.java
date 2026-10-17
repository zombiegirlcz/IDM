package x0i;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import com.orhanobut.dialogplus.OnCancelListener;
import com.revolut.data.model.Data;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationController;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.CreditApplicationDocumentsScreenContract$Configuration;
import com.revolut.feature_exchange.impl.ui.order_details.screen.OrderDetailsActivity;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.h0;
import efm.w;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import v2e.x;
import vf0.q;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements o, OnApplyWindowInsetsListener, p, OnCancelListener, InputConnectionCompat.OnCommitContentListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f301646b;

    public /* synthetic */ i(Object obj2, int i) {
        this.f301645a = i;
        this.f301646b = obj2;
    }

    public void a() {
        cwl.f fVar = (cwl.f) this.f301646b;
        od0.i.Companion.getClass();
        od0.h.a(fVar).e(new q(29));
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f301645a;
        Object obj2 = this.f301646b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (b2i.b) ((h) obj2).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((x1g.q) obj2).invoke(p0);
            case 2:
            case 6:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((x8i.f) obj2).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((x0b.c) obj2).invoke(p0);
            case 4:
                int i2 = OrderDetailsActivity.E0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((x29.a) obj2).invoke(p0);
                return Boolean.TRUE;
            case 5:
                int i3 = OrderDetailsActivity.E0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((x29.a) obj2).invoke(p0);
                return Boolean.FALSE;
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((x2i.e) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((x2i.e) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((wsg.j) obj2).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((x) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((x0b.c) obj2).invoke(p0);
                return Boolean.TRUE;
            case 17:
                return (CreditApplicationDocumentsScreenContract$Configuration) ((x29.a) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((x52.a) obj2).invoke(p0);
                return Boolean.TRUE;
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((x0b.c) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((x64.a) obj2).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((x0b.c) obj2).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((wma.e) obj2).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((wtl.f) obj2).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((wtl.f) obj2).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((wtl.f) obj2).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((x8h.d) obj2).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((x8h.d) obj2).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((x8h.h) obj2).invoke(p0);
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        CardPersonalisationController cardPersonalisationController = (CardPersonalisationController) this.f301646b;
        KProperty[] kPropertyArr = CardPersonalisationController.T;
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(insets, "<this>");
        Intrinsics.checkNotNullExpressionValue(insets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime()), "getInsets(...)");
        cardPersonalisationController.d3().f211226b.setTranslationY(-r3.bottom);
        return insets;
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f301645a) {
            case 6:
                x29.a aVar = (x29.a) this.f301646b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) aVar.invoke(p0)).booleanValue();
            case 7:
            case 8:
            default:
                x29.a aVar2 = (x29.a) this.f301646b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) aVar2.invoke(p0)).booleanValue();
            case 9:
                x29.a aVar3 = (x29.a) this.f301646b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) aVar3.invoke(p0)).booleanValue();
            case 10:
                x29.a aVar4 = (x29.a) this.f301646b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) aVar4.invoke(p0)).booleanValue();
        }
    }
}
