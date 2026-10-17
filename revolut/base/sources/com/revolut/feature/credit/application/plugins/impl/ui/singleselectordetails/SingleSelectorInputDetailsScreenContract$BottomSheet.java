package com.revolut.feature.credit.application.plugins.impl.ui.singleselectordetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.kompot.navigable.flow.FlowStep;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/singleselectordetails/SingleSelectorInputDetailsScreenContract$BottomSheet", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SingleSelectorInputDetailsScreenContract$BottomSheet implements FlowStep {

    @NotNull
    public static final Parcelable.Creator<SingleSelectorInputDetailsScreenContract$BottomSheet> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f68372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f68373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f68374c;
    public final SingleSelectorInputDetailsScreenContract$SelectedValue d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SingleSelectorInputDetailsScreenContract$BottomSheet((TextClause) parcel.readParcelable(SingleSelectorInputDetailsScreenContract$BottomSheet.class.getClassLoader()), (TextClause) parcel.readParcelable(SingleSelectorInputDetailsScreenContract$BottomSheet.class.getClassLoader()), (TextClause) parcel.readParcelable(SingleSelectorInputDetailsScreenContract$BottomSheet.class.getClassLoader()), SingleSelectorInputDetailsScreenContract$SelectedValue.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SingleSelectorInputDetailsScreenContract$BottomSheet[i];
        }
    }

    public SingleSelectorInputDetailsScreenContract$BottomSheet(TextClause title, TextClause description, TextClause buttonTitle, SingleSelectorInputDetailsScreenContract$SelectedValue value) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f68372a = title;
        this.f68373b = description;
        this.f68374c = buttonTitle;
        this.d = value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SingleSelectorInputDetailsScreenContract$BottomSheet)) {
            return false;
        }
        SingleSelectorInputDetailsScreenContract$BottomSheet singleSelectorInputDetailsScreenContract$BottomSheet = (SingleSelectorInputDetailsScreenContract$BottomSheet) obj2;
        return Intrinsics.f(this.f68372a, singleSelectorInputDetailsScreenContract$BottomSheet.f68372a) && Intrinsics.f(this.f68373b, singleSelectorInputDetailsScreenContract$BottomSheet.f68373b) && Intrinsics.f(this.f68374c, singleSelectorInputDetailsScreenContract$BottomSheet.f68374c) && Intrinsics.f(this.d, singleSelectorInputDetailsScreenContract$BottomSheet.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.b(v7.b(this.f68372a.hashCode() * 31, 31, this.f68373b), 31, this.f68374c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f68372a, i);
        dest.writeParcelable(this.f68373b, i);
        dest.writeParcelable(this.f68374c, i);
        this.d.writeToParcel(dest, i);
    }
}
