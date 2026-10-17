package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/MailItem;", "Lcom/revolut/feature/backend_flow/domain/models/BackendItem;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MailItem implements BackendItem {

    @NotNull
    public static final Parcelable.Creator<MailItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63518c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MailItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MailItem[i];
        }
    }

    public MailItem(String title, String str, String url2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f63516a = title;
        this.f63517b = str;
        this.f63518c = url2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MailItem)) {
            return false;
        }
        MailItem mailItem = (MailItem) obj2;
        return Intrinsics.f(this.f63516a, mailItem.f63516a) && Intrinsics.f(this.f63517b, mailItem.f63517b) && Intrinsics.f(this.f63518c, mailItem.f63518c);
    }

    public final int hashCode() {
        int iHashCode = this.f63516a.hashCode() * 31;
        String str = this.f63517b;
        return this.f63518c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63516a);
        dest.writeString(this.f63517b);
        dest.writeString(this.f63518c);
    }
}
