package aed;

import a7b.r;
import a83.c0;
import ael.r0;
import ael.w0;
import ai0.t;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.transaction_list.impl.ui.scheduled_payments.ScheduledPaymentsScreen;
import com.revolut.shared.feature.wealth.models.config.Links;
import efm.h0;
import efm.w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.reactivestreams.Publisher;
import pcd.q;
import pcd.s;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements kfm.o, kfm.g, GoogleMap.OnMarkerClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3534b;

    public /* synthetic */ f(Object obj2, int i) {
        this.f3533a = i;
        this.f3534b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((ahf.o) this.f3534b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f3533a;
        Object obj2 = this.f3534b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (s) ((r) obj2).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q) ((a) obj2).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((a26.j) obj2).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (nel.n) ((a31.g) obj2).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((c0) obj2).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Float) ((a) obj2).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Float) ((a) obj2).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (hel.b) ((a) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (hel.a) ((a) obj2).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Links) ((a) obj2).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wbl.k) ((r0) obj2).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((acb.f) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((w0) obj2).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wbl.k) ((r0) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) ((r0) obj2).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((r0) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Publisher) ((r0) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((w0) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((r0) obj2).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((r) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((r0) obj2).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((a6j.a) obj2).invoke(p0);
                return Boolean.TRUE;
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((afa.q) obj2).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((r0) obj2).invoke(p0);
            case 24:
                KProperty[] kPropertyArr = ScheduledPaymentsScreen.Z;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (SwipeToActionDelegate.SwipeAction) ((agh.h) obj2).invoke(p0);
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (vf0.k) ((ahf.o) obj2).invoke(p0);
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public boolean onMarkerClick(Marker it8) {
        ai0.e eVar = (ai0.e) this.f3534b;
        Intrinsics.checkNotNullParameter(it8, "it");
        Intrinsics.checkNotNullParameter(it8, "<this>");
        t marker = new t(it8);
        eVar.getClass();
        Intrinsics.checkNotNullParameter(marker, "marker");
        rg.c cVar = eVar.f5147a;
        Intrinsics.checkNotNullParameter(marker, "<this>");
        return cVar.f253989a.onMarkerClick(it8);
    }
}
