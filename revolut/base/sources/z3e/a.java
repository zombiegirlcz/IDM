package z3e;

import ael.u0;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.push_to_card.api.data.CardOwnerWithStats;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreen;
import efm.h0;
import efm.w;
import java.util.List;
import kfm.g;
import kfm.h;
import kfm.o;
import kfm.p;
import kotlin.Function;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import y66.q;
import yt8.m;
import yui.v;
import z1i.l;
import z4l.d;
import z63.f;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements o, g, p, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f319257b;

    public /* synthetic */ a(Function function, int i) {
        this.f319256a = i;
        this.f319257b = function;
    }

    @Override // kfm.h
    public Object a(Object p0, Object p17, Object p2) {
        q qVar = (q) this.f319257b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        return (Data) qVar.invoke(p0, p17, p2);
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f319256a) {
            case 5:
                ((d) this.f319257b).invoke(obj2);
                break;
            default:
                ((f) this.f319257b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f319256a;
        Function function = this.f319257b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((l) function).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((u0) function).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) ((z1.c) function).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CardOwnerWithStats) ((v) function).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((d) function).invoke(p0);
            case 5:
            case 16:
            case 19:
            case 21:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((z8h.b) function).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((l) function).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((z51.a) function).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (m) ((z51.a) function).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((z51.a) function).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((z51.a) function).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((z51.a) function).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((z51.a) function).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((z55.v) function).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) ((yea.l) function).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((f) function).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((z1.c) function).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((f) function).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (z63.l) ((v73.d) function).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((z55.w) function).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (BaseDraggableWidgetDelegate.Model) ((v) function).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((z55.w) function).invoke(p0);
            case 25:
                PeerToPeerAmountScreen.Companion aVar = PeerToPeerAmountScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((z8h.b) function).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((z97.a) function).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((z97.a) function).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((z8h.b) function).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        z55.w wVar = (z55.w) this.f319257b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) wVar.invoke(p0)).booleanValue();
    }
}
