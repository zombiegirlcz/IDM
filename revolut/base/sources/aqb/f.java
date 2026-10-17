package aqb;

import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.TransferWidgetCustomisationScreenContract$BottomSheetState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferWidgetCustomisationScreenContract$BottomSheetState f8282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f8283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8284c;
    public final String d;
    public final String e;

    public f(TransferWidgetCustomisationScreenContract$BottomSheetState bottomSheetState, Data contentData, boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        this.f8282a = bottomSheetState;
        this.f8283b = contentData;
        this.f8284c = z;
        this.d = str;
        this.e = str2;
    }

    public static f a(f fVar, TransferWidgetCustomisationScreenContract$BottomSheetState transferWidgetCustomisationScreenContract$BottomSheetState, Data data, boolean z, String str, String str2, int i) {
        if ((i & 1) != 0) {
            transferWidgetCustomisationScreenContract$BottomSheetState = fVar.f8282a;
        }
        TransferWidgetCustomisationScreenContract$BottomSheetState bottomSheetState = transferWidgetCustomisationScreenContract$BottomSheetState;
        if ((i & 2) != 0) {
            data = fVar.f8283b;
        }
        Data contentData = data;
        if ((i & 4) != 0) {
            z = fVar.f8284c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            str = fVar.d;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = fVar.e;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        return new f(bottomSheetState, contentData, z3, str3, str2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f8282a, fVar.f8282a) && Intrinsics.f(this.f8283b, fVar.f8283b) && this.f8284c == fVar.f8284c && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(kii.e.c(this.f8283b, this.f8282a.hashCode() * 31, 31), 31, this.f8284c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
