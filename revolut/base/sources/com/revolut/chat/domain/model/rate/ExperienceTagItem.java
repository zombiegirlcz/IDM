package com.revolut.chat.domain.model.rate;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/domain/model/rate/ExperienceTagItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExperienceTagItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExperienceTagItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51105b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExperienceTagItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExperienceTagItem[i];
        }
    }

    public ExperienceTagItem(String tag2, String label) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f51104a = tag2;
        this.f51105b = label;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExperienceTagItem)) {
            return false;
        }
        ExperienceTagItem experienceTagItem = (ExperienceTagItem) obj2;
        return Intrinsics.f(this.f51104a, experienceTagItem.f51104a) && Intrinsics.f(this.f51105b, experienceTagItem.f51105b);
    }

    public final int hashCode() {
        return this.f51105b.hashCode() + (this.f51104a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f51104a);
        dest.writeString(this.f51105b);
    }
}
