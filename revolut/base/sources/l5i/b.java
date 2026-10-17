package l5i;

import android.os.ParcelFileDescriptor;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.revolutpay.impl.ui.request_cvv.RequestCvvScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.review.CommodityOrderReviewScreen;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.PeerToPeerReviewScreen;
import efm.e0;
import efm.g0;
import efm.h0;
import efm.w;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import l5a.u;
import l97.s;
import l97.t;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import rp0.y;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements kfm.o, kfm.p, g0, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f192272b;

    public /* synthetic */ b(int i, Function1 function1) {
        this.f192271a = i;
        this.f192272b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f192271a) {
            case 14:
                ((s) this.f192272b).invoke(obj2);
                break;
            case 15:
                ((s) this.f192272b).invoke(obj2);
                break;
            default:
                ((t) this.f192272b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f192271a;
        Object obj2 = this.f192272b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (y) ((ja3.d) obj2).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((kzc.a) obj2).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((ja3.d) obj2).invoke(p0);
            case 3:
            case 4:
            case 9:
            case 10:
            case 11:
            case 14:
            case 15:
            case 16:
            case 18:
            case 21:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((l9j.k) obj2).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((khg.s) obj2).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (vdh.b) ((u) obj2).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((u) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((u) obj2).invoke(p0);
            case 12:
                return (efm.f) ((l0c.s) obj2).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((l0c.s) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((ec9.a) obj2).invoke(p0);
            case 19:
                KProperty[] kPropertyArr = RequestCvvScreen.f84514b0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((u) obj2).invoke(p0);
            case 20:
                KProperty[] kPropertyArr2 = PeerToPeerReviewScreen.f102358h0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k5k.b) ((l9j.k) obj2).invoke(p0);
            case 22:
                KProperty[] kPropertyArr3 = PeerToPeerReviewScreen.f102358h0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((l9j.k) obj2).invoke(p0);
            case 23:
                KProperty[] kPropertyArr4 = PeerToPeerReviewScreen.f102358h0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k5k.b) ((l9j.k) obj2).invoke(p0);
            case 24:
                KProperty[] kPropertyArr5 = PeerToPeerReviewScreen.f102358h0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k5k.b) ((l9j.k) obj2).invoke(p0);
            case 25:
                KProperty[] kPropertyArr6 = PeerToPeerReviewScreen.f102358h0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k5k.b) ((l9j.k) obj2).invoke(p0);
            case 26:
                KProperty[] kPropertyArr7 = PeerToPeerReviewScreen.f102358h0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k5k.b) ((l9j.k) obj2).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((lak.h) obj2).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Clause) ((l9j.k) obj2).invoke(p0);
        }
    }

    @Override // efm.g0
    public void subscribe(e0 emitter) {
        ParcelFileDescriptor parcelFileDescriptorOpen;
        File file = (File) this.f192272b;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        try {
            parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, PKIFailureInfo.duplicateCertReq);
        } catch (Exception e) {
            gom.e.f145194a.e(e, "Failed to open ParcelFileDescriptor", new Object[0]);
            parcelFileDescriptorOpen = null;
        }
        if (parcelFileDescriptorOpen != null) {
            ((ufm.a) emitter).b(parcelFileDescriptorOpen);
        } else {
            ((ufm.a) emitter).a(new IllegalStateException("Couldn't create description"));
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f192271a;
        Object obj2 = this.f192272b;
        switch (i) {
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((u) obj2).invoke(p0)).booleanValue();
            case 9:
                KProperty[] kPropertyArr = CommodityOrderReviewScreen.X;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((u) obj2).invoke(p0)).booleanValue();
            case 10:
                KProperty[] kPropertyArr2 = CommodityOrderReviewScreen.X;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((u) obj2).invoke(p0)).booleanValue();
            case 11:
                KProperty[] kPropertyArr3 = CommodityOrderReviewScreen.X;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((u) obj2).invoke(p0)).booleanValue();
            case 18:
                KProperty[] kPropertyArr4 = RequestCvvScreen.f84514b0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((u) obj2).invoke(p0)).booleanValue();
            default:
                KProperty[] kPropertyArr5 = PeerToPeerReviewScreen.f102358h0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((l9j.k) obj2).invoke(p0)).booleanValue();
        }
    }

    public /* synthetic */ b(kgm.c cVar, File file) {
        this.f192271a = 4;
        this.f192272b = file;
    }
}
