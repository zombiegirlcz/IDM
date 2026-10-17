package com.revolut.feature.user_declarations.shared.flows.address_suggestion.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/user_declarations/shared/flows/address_suggestion/screen/AddressSuggestionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressSuggestionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AddressSuggestionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94621c;
    public final String d;
    public final ArrayList e;
    public final WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rbl.a f94622g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(AddressSuggestionScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new AddressSuggestionScreenContract$InputData(string, string2, string3, string4, arrayList, (WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem) parcel.readParcelable(AddressSuggestionScreenContract$InputData.class.getClassLoader()), rbl.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddressSuggestionScreenContract$InputData[i];
        }
    }

    public AddressSuggestionScreenContract$InputData(String title, String subtitle, String submitButton, String str, ArrayList items, WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem addressSuggestionItem, rbl.a backNavigationType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        this.f94619a = title;
        this.f94620b = subtitle;
        this.f94621c = submitButton;
        this.d = str;
        this.e = items;
        this.f = addressSuggestionItem;
        this.f94622g = backNavigationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddressSuggestionScreenContract$InputData)) {
            return false;
        }
        AddressSuggestionScreenContract$InputData addressSuggestionScreenContract$InputData = (AddressSuggestionScreenContract$InputData) obj2;
        return Intrinsics.f(this.f94619a, addressSuggestionScreenContract$InputData.f94619a) && Intrinsics.f(this.f94620b, addressSuggestionScreenContract$InputData.f94620b) && Intrinsics.f(this.f94621c, addressSuggestionScreenContract$InputData.f94621c) && Intrinsics.f(this.d, addressSuggestionScreenContract$InputData.d) && this.e.equals(addressSuggestionScreenContract$InputData.e) && Intrinsics.f(this.f, addressSuggestionScreenContract$InputData.f) && this.f94622g == addressSuggestionScreenContract$InputData.f94622g;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f94619a.hashCode() * 31, 31, this.f94620b), 31, this.f94621c);
        String str = this.d;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
        WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem addressSuggestionItem = this.f;
        return this.f94622g.hashCode() + ((iB + (addressSuggestionItem != null ? addressSuggestionItem.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94619a);
        dest.writeString(this.f94620b);
        dest.writeString(this.f94621c);
        dest.writeString(this.d);
        Iterator itY = j6.a.y(this.e, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f94622g.name());
    }
}
