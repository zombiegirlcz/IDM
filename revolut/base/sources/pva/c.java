package pva;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.calendar.CalendarPickerRangeView;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_pet.impl.ui.pet.dob.DOBInputData;
import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsDestination;
import e4k.m0;
import efm.f;
import efm.h0;
import efm.w;
import java.util.Date;
import java.util.List;
import kfm.g;
import kfm.o;
import kfm.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pth.l;
import pth.m;
import pvc.e;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements o, p, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f240039b;

    public /* synthetic */ c(int i, Function1 function1) {
        this.f240038a = i;
        this.f240039b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f240038a) {
            case 28:
                ((pyc.o) this.f240039b).invoke(obj2);
                break;
            default:
                ((pyc.o) this.f240039b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f240038a;
        Function1 function1 = this.f240039b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CryptoOrderDetailsDestination) ((m) function1).invoke(p0);
            case 1:
            case 5:
            case 11:
            case 24:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) ((m) function1).invoke(p0);
            case 2:
                CalendarPickerRangeView.Companion companion = CalendarPickerRangeView.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Date) ((px0.a) function1).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Clause) ((px7.f) function1).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (DOBInputData) ((e) function1).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((px7.f) function1).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((px0.a) function1).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((px0.a) function1).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((px0.a) function1).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((m0) function1).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((px0.a) function1).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((l) function1).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((m) function1).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((px0.a) function1).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((py2.d) function1).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) ((py2.d) function1).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((px0.a) function1).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((px0.a) function1).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((px0.a) function1).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((px0.a) function1).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (DocumentType) ((px0.a) function1).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((px0.a) function1).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) ((pyc.o) function1).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((px0.a) function1).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f240038a;
        px0.a aVar = (px0.a) this.f240039b;
        switch (i) {
            case 1:
                CalendarPickerRangeView.Companion companion = CalendarPickerRangeView.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) aVar.invoke(p0)).booleanValue();
    }
}
