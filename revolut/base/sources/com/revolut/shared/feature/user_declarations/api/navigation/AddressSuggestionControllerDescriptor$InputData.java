package com.revolut.shared.feature.user_declarations.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/shared/feature/user_declarations/api/navigation/AddressSuggestionControllerDescriptor$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_user_declarations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressSuggestionControllerDescriptor$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AddressSuggestionControllerDescriptor$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105046c;
    public final String d;
    public final String e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem f105047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f105048h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (true) {
                if (iE == i) {
                    break;
                }
                iE = j6.a.e(AddressSuggestionControllerDescriptor$InputData.class, parcel, arrayList, iE, 1);
            }
            return new AddressSuggestionControllerDescriptor$InputData(string, string2, string3, string4, string5, arrayList, (WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem) parcel.readParcelable(AddressSuggestionControllerDescriptor$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddressSuggestionControllerDescriptor$InputData[i];
        }
    }

    public AddressSuggestionControllerDescriptor$InputData(String stepId, String title, String subtitle, String submitButton, String str, ArrayList items, WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem addressSuggestionItem, boolean z) {
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f105044a = stepId;
        this.f105045b = title;
        this.f105046c = subtitle;
        this.d = submitButton;
        this.e = str;
        this.f = items;
        this.f105047g = addressSuggestionItem;
        this.f105048h = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddressSuggestionControllerDescriptor$InputData)) {
            return false;
        }
        AddressSuggestionControllerDescriptor$InputData addressSuggestionControllerDescriptor$InputData = (AddressSuggestionControllerDescriptor$InputData) obj2;
        return Intrinsics.f(this.f105044a, addressSuggestionControllerDescriptor$InputData.f105044a) && Intrinsics.f(this.f105045b, addressSuggestionControllerDescriptor$InputData.f105045b) && Intrinsics.f(this.f105046c, addressSuggestionControllerDescriptor$InputData.f105046c) && Intrinsics.f(this.d, addressSuggestionControllerDescriptor$InputData.d) && Intrinsics.f(this.e, addressSuggestionControllerDescriptor$InputData.e) && this.f.equals(addressSuggestionControllerDescriptor$InputData.f) && Intrinsics.f(this.f105047g, addressSuggestionControllerDescriptor$InputData.f105047g) && this.f105048h == addressSuggestionControllerDescriptor$InputData.f105048h;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f105044a.hashCode() * 31, 31, this.f105045b), 31, this.f105046c), 31, this.d);
        String str = this.e;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
        WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem addressSuggestionItem = this.f105047g;
        return Boolean.hashCode(this.f105048h) + ((iB + (addressSuggestionItem != null ? addressSuggestionItem.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105044a);
        dest.writeString(this.f105045b);
        dest.writeString(this.f105046c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        Iterator itY = j6.a.y(this.f, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeParcelable(this.f105047g, i);
        dest.writeInt(this.f105048h ? 1 : 0);
    }
}
