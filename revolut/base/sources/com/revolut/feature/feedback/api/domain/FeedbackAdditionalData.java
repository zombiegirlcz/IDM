package com.revolut.feature.feedback.api.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/feedback/api/domain/FeedbackAdditionalData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_feedback_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeedbackAdditionalData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FeedbackAdditionalData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f73128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73129b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(FeedbackTag.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new FeedbackAdditionalData(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FeedbackAdditionalData[i];
        }
    }

    public FeedbackAdditionalData(List list, String str) {
        this.f73128a = list;
        this.f73129b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FeedbackAdditionalData)) {
            return false;
        }
        FeedbackAdditionalData feedbackAdditionalData = (FeedbackAdditionalData) obj2;
        return Intrinsics.f(this.f73128a, feedbackAdditionalData.f73128a) && Intrinsics.f(this.f73129b, feedbackAdditionalData.f73129b);
    }

    public final int hashCode() {
        List list = this.f73128a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f73129b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List list = this.f73128a;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((FeedbackTag) itQ.next()).writeToParcel(dest, i);
            }
        }
        dest.writeString(this.f73129b);
    }
}
