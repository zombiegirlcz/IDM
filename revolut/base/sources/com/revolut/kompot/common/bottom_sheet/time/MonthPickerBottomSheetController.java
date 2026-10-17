package com.revolut.kompot.common.bottom_sheet.time;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.MonthPickerDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import gii.c;
import ip0.mx;
import java.time.YearMonth;
import java.util.List;
import jii.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import pki.b;
import rd0.e;
import vc.s;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0004\u0002\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/kompot/common/bottom_sheet/time/MonthPickerBottomSheetController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lgii/a;", "Companion", "InputData", "a", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MonthPickerBottomSheetController extends SimpleViewController<gii.a> {
    public final InputData N;
    public final int O;
    public final h P;
    public final c Q;
    public final c R;
    public final MonthPickerDelegate S;
    public final j T;
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(MonthPickerBottomSheetController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/common/bottom_sheet/time/MonthPickerBottomSheetController$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f98317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final YearMonth f98318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final YearMonth f98319c;
        public final YearMonth d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData((Clause) parcel.readParcelable(InputData.class.getClassLoader()), (YearMonth) parcel.readSerializable(), (YearMonth) parcel.readSerializable(), (YearMonth) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(Clause dialogTitle, YearMonth selectedDate, YearMonth yearMonth, YearMonth yearMonth2) {
            Intrinsics.checkNotNullParameter(dialogTitle, "dialogTitle");
            Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
            this.f98317a = dialogTitle;
            this.f98318b = selectedDate;
            this.f98319c = yearMonth;
            this.d = yearMonth2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InputData)) {
                return false;
            }
            InputData inputData = (InputData) obj2;
            return Intrinsics.f(this.f98317a, inputData.f98317a) && Intrinsics.f(this.f98318b, inputData.f98318b) && Intrinsics.f(this.f98319c, inputData.f98319c) && Intrinsics.f(this.d, inputData.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f98318b.hashCode() + (this.f98317a.hashCode() * 31)) * 31;
            YearMonth yearMonth = this.f98319c;
            int iHashCode2 = (iHashCode + (yearMonth == null ? 0 : yearMonth.hashCode())) * 31;
            YearMonth yearMonth2 = this.d;
            return iHashCode2 + (yearMonth2 != null ? yearMonth2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f98317a, i);
            dest.writeSerializable(this.f98318b);
            dest.writeSerializable(this.f98319c);
            dest.writeSerializable(this.d);
        }
    }

    public static final class a {
        private a() {
        }
    }

    public MonthPickerBottomSheetController(InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = R$layout.screen_bottom_sheet_list;
        this.P = s.t(this, com.revolut.kompot.common.bottom_sheet.time.a.f);
        c cVar = new c();
        this.Q = cVar;
        this.R = cVar;
        MonthPickerDelegate monthPickerDelegate = new MonthPickerDelegate();
        this.S = monthPickerDelegate;
        this.T = new j(7, u.c(monthPickerDelegate), false);
    }

    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return this.R;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174520c.setLayoutManager(new LinearLayoutManager(m2()));
        d3().f174520c.addItemDecoration(new o31.b());
        ScreenContentRecyclerView screenContentRecyclerView = d3().f174520c;
        j jVar = this.T;
        screenContentRecyclerView.setAdapter(jVar);
        NavBarBottomSheet navBarBottomSheet = d3().f174519b;
        InputData inputData = this.N;
        navBarBottomSheet.setHeaderModel(new lw0.a(inputData.f98317a, null, null, null, false, 30));
        List listC = u.c(new mx("MONTH_PICKER_ID", inputData.f98318b.getYear(), inputData.f98318b, inputData.f98319c, inputData.d));
        yp0.b.k(listC, 0, R$attr.uikit_dp24, 0, 0, 29);
        jVar.c(listC);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, e.b(this.S.f52775c.f121375b), null, new gii.b(this, null, 0), 3);
    }

    public final f d3() {
        ViewBinding value = this.P.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (f) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }
}
