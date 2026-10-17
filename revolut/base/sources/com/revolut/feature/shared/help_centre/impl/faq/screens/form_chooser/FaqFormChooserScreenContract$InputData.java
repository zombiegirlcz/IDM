package com.revolut.feature.shared.help_centre.impl.faq.screens.form_chooser;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared/help_centre/impl/faq/screens/form_chooser/FaqFormChooserScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FaqFormChooserScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FaqFormChooserScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f86257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f86258c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            int iE = 0;
            int iE2 = 0;
            while (iE2 != i) {
                iE2 = j6.a.e(FaqFormChooserScreenContract$InputData.class, parcel, arrayList2, iE2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(FaqFormChooserScreenContract$InputData.class, parcel, arrayList3, iE, 1);
                }
                arrayList = arrayList3;
            }
            return new FaqFormChooserScreenContract$InputData(string, arrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FaqFormChooserScreenContract$InputData[i];
        }
    }

    public FaqFormChooserScreenContract$InputData(String str, List formActions, List list) {
        Intrinsics.checkNotNullParameter(formActions, "formActions");
        this.f86256a = str;
        this.f86257b = formActions;
        this.f86258c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FaqFormChooserScreenContract$InputData)) {
            return false;
        }
        FaqFormChooserScreenContract$InputData faqFormChooserScreenContract$InputData = (FaqFormChooserScreenContract$InputData) obj2;
        return Intrinsics.f(this.f86256a, faqFormChooserScreenContract$InputData.f86256a) && Intrinsics.f(this.f86257b, faqFormChooserScreenContract$InputData.f86257b) && Intrinsics.f(this.f86258c, faqFormChooserScreenContract$InputData.f86258c);
    }

    public final int hashCode() {
        String str = this.f86256a;
        int iD = p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f86257b);
        List list = this.f86258c;
        return iD + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86256a);
        Iterator itV = p.a.v(this.f86257b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        List list = this.f86258c;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            dest.writeParcelable((Parcelable) itQ.next(), i);
        }
    }
}
