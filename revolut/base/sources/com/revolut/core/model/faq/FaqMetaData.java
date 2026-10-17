package com.revolut.core.model.faq;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/model/faq/FaqMetaData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FaqMetaData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FaqMetaData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51420b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FaqMetaData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FaqMetaData[i];
        }
    }

    public FaqMetaData(String key, String title) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f51419a = key;
        this.f51420b = title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FaqMetaData)) {
            return false;
        }
        FaqMetaData faqMetaData = (FaqMetaData) obj2;
        return Intrinsics.f(this.f51419a, faqMetaData.f51419a) && Intrinsics.f(this.f51420b, faqMetaData.f51420b);
    }

    public final int hashCode() {
        return this.f51420b.hashCode() + (this.f51419a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f51419a);
        dest.writeString(this.f51420b);
    }
}
