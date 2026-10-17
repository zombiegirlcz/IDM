package com.revolut.feature.credit.loan.impl.ui.selector.module;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/selector/module/CreditSelectorContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditSelectorContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditSelectorContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f70609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f70610c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Clause clause = (Clause) parcel.readParcelable(CreditSelectorContract$Configuration.class.getClassLoader());
            Clause clause2 = (Clause) parcel.readParcelable(CreditSelectorContract$Configuration.class.getClassLoader());
            if (parcel.readSerializable() == null) {
                return new CreditSelectorContract$Configuration(clause, clause2, string);
            }
            throw new ClassCastException();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditSelectorContract$Configuration[i];
        }
    }

    public CreditSelectorContract$Configuration(Clause title, Clause subtitle, String flowName) {
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(null, "filter");
        this.f70608a = flowName;
        this.f70609b = title;
        this.f70610c = subtitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditSelectorContract$Configuration)) {
            return false;
        }
        CreditSelectorContract$Configuration creditSelectorContract$Configuration = (CreditSelectorContract$Configuration) obj2;
        return Intrinsics.f(this.f70608a, creditSelectorContract$Configuration.f70608a) && Intrinsics.f(this.f70609b, creditSelectorContract$Configuration.f70609b) && Intrinsics.f(this.f70610c, creditSelectorContract$Configuration.f70610c);
    }

    public final int hashCode() {
        this.f70608a.hashCode();
        this.f70609b.hashCode();
        this.f70610c.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70608a);
        dest.writeParcelable(this.f70609b, i);
        dest.writeParcelable(this.f70610c, i);
        dest.writeSerializable(null);
    }
}
