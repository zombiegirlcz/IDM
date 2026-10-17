package com.revolut.sso.impl.ui.passcode.create_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/passcode/create_flow/CreatePasscodeFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreatePasscodeFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreatePasscodeFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f106602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f106603c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreatePasscodeFlowContract$InputData((Clause) parcel.readParcelable(CreatePasscodeFlowContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(CreatePasscodeFlowContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreatePasscodeFlowContract$InputData[i];
        }
    }

    public CreatePasscodeFlowContract$InputData(Clause createTitle, Clause confirmTitle, String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(createTitle, "createTitle");
        Intrinsics.checkNotNullParameter(confirmTitle, "confirmTitle");
        this.f106601a = phone;
        this.f106602b = createTitle;
        this.f106603c = confirmTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreatePasscodeFlowContract$InputData)) {
            return false;
        }
        CreatePasscodeFlowContract$InputData createPasscodeFlowContract$InputData = (CreatePasscodeFlowContract$InputData) obj2;
        return Intrinsics.f(this.f106601a, createPasscodeFlowContract$InputData.f106601a) && Intrinsics.f(this.f106602b, createPasscodeFlowContract$InputData.f106602b) && Intrinsics.f(this.f106603c, createPasscodeFlowContract$InputData.f106603c);
    }

    public final int hashCode() {
        return this.f106603c.hashCode() + p.a.a(this.f106601a.hashCode() * 31, 31, this.f106602b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106601a);
        dest.writeParcelable(this.f106602b, i);
        dest.writeParcelable(this.f106603c, i);
    }
}
