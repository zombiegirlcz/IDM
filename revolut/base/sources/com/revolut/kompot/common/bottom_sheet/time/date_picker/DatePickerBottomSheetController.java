package com.revolut.kompot.common.bottom_sheet.time.date_picker;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import hba.k;
import hii.b;
import java.time.LocalDate;
import java.util.List;
import jii.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import vc.s;
import wp5.y;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0004\u0002\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/kompot/common/bottom_sheet/time/date_picker/DatePickerBottomSheetController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lhii/a;", "Companion", "InputData", "a", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DatePickerBottomSheetController extends SimpleViewController<hii.a> {
    public final InputData N;
    public final int O;
    public final h P;
    public final b Q;
    public final b R;
    public final DatePickerDelegate S;
    public final j T;
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(DatePickerBottomSheetController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public DatePickerBottomSheetController(InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = R$layout.screen_bottom_sheet_list;
        this.P = s.t(this, com.revolut.kompot.common.bottom_sheet.time.date_picker.a.f);
        b bVar = new b();
        this.Q = bVar;
        this.R = bVar;
        DatePickerDelegate datePickerDelegate = new DatePickerDelegate();
        this.S = datePickerDelegate;
        this.T = new j(7, u.c(datePickerDelegate), false);
    }

    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
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
        navBarBottomSheet.setHeaderModel(new lw0.a(inputData.f98320a, null, null, null, false, 30));
        LocalDate localDate = inputData.f98321b;
        List listC = u.c(new g5("DATE_PICKER_ID", localDate, localDate, inputData.e, null, inputData.f98322c, inputData.d, null, null, null, 0, 0, 1048368));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        jVar.c(listC);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, e.b(this.S.f52176c.f121375b), null, new k(this, (Continuation) null, 20), 3);
    }

    public final f d3() {
        ViewBinding value = this.P.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (f) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.O;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/common/bottom_sheet/time/date_picker/DatePickerBottomSheetController$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f98320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f98321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f98322c;
        public final LocalDate d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData((Clause) parcel.readParcelable(InputData.class.getClassLoader()), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(Clause dialogTitle, LocalDate selectedDate, LocalDate localDate, LocalDate localDate2, boolean z) {
            Intrinsics.checkNotNullParameter(dialogTitle, "dialogTitle");
            Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
            this.f98320a = dialogTitle;
            this.f98321b = selectedDate;
            this.f98322c = localDate;
            this.d = localDate2;
            this.e = z;
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
            return Intrinsics.f(this.f98320a, inputData.f98320a) && Intrinsics.f(this.f98321b, inputData.f98321b) && Intrinsics.f(this.f98322c, inputData.f98322c) && Intrinsics.f(this.d, inputData.d) && this.e == inputData.e;
        }

        public final int hashCode() {
            int iA = y.a(this.f98320a.hashCode() * 31, 31, this.f98321b);
            LocalDate localDate = this.f98322c;
            int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
            LocalDate localDate2 = this.d;
            return Boolean.hashCode(this.e) + ((iHashCode + (localDate2 != null ? localDate2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f98320a, i);
            dest.writeSerializable(this.f98321b);
            dest.writeSerializable(this.f98322c);
            dest.writeSerializable(this.d);
            dest.writeInt(this.e ? 1 : 0);
        }

        public /* synthetic */ InputData(Clause clause, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, int i) {
            this(clause, localDate, (i & 4) != 0 ? null : localDate2, (i & 8) != 0 ? null : localDate3, (i & 16) == 0);
        }
    }
}
