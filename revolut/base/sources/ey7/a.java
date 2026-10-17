package ey7;

import com.revolut.data.model.Data;
import com.revolut.feature_exchange.impl.ui.exchange.recurring_order_settings.RecurringOrderSettingsActivity;
import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import efm.h0;
import efm.w;
import ewh.x;
import f0d.j;
import f0d.k;
import f0d.l;
import f2i.n;
import java.util.List;
import java.util.Optional;
import kfm.o;
import kfm.p;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import org.joda.time.LocalDate;
import rp0.y;
import tof.a3;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements o, ITaskMonitor, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f130583b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f130582a = i;
        this.f130583b = obj2;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f130582a;
        Object obj2 = this.f130583b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((c) obj2).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) ((eye.d) obj2).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((a5b.a) obj2).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (a3) ((x) obj2).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((x) obj2).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((x) obj2).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((ezc.a) obj2).invoke(p0);
            case 7:
            case 13:
            case 15:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (y) ((f2i.x) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((f08.f) obj2).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) ((f08.f) obj2).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((f08.f) obj2).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((f08.f) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((j) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((l) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((l) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((j) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((j) obj2).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((j) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((f1e.a) obj2).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Optional) ((k) obj2).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f28.f) ((f28.a) obj2).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f28.e) ((f28.a) obj2).invoke(p0);
            case 24:
                int i2 = RecurringOrderSettingsActivity.A0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((k) obj2).invoke(p0);
            case 25:
                int i3 = RecurringOrderSettingsActivity.A0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((k) obj2).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (LocalDate) ((k) obj2).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (y) ((f2i.x) obj2).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((n) obj2).invoke(p0);
        }
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public void handleEvent(TaskEvent taskEvent, Object[] objArr) {
        ((defpackage.o) this.f130583b).b(taskEvent, objArr);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f130582a) {
            case 13:
                k kVar = (k) this.f130583b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) kVar.invoke(p0)).booleanValue();
            default:
                k kVar2 = (k) this.f130583b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) kVar2.invoke(p0)).booleanValue();
        }
    }
}
