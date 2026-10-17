package com.revolut.feature.uipersonalisation.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/uipersonalisation/api/CoverIcon;", "Landroid/os/Parcelable;", "Url", "Transparent", "Lcom/revolut/feature/uipersonalisation/api/CoverIcon$Transparent;", "Lcom/revolut/feature/uipersonalisation/api/CoverIcon$Url;", "feature_shared_ui_personalisation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CoverIcon extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/uipersonalisation/api/CoverIcon$Transparent;", "Lcom/revolut/feature/uipersonalisation/api/CoverIcon;", "<init>", "()V", "feature_shared_ui_personalisation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Transparent implements CoverIcon {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Transparent f94464a = new Transparent();

        @NotNull
        public static final Parcelable.Creator<Transparent> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Transparent.f94464a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transparent[i];
            }
        }

        private Transparent() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/uipersonalisation/api/CoverIcon$Url;", "Lcom/revolut/feature/uipersonalisation/api/CoverIcon;", "", "toString", "()Ljava/lang/String;", "feature_shared_ui_personalisation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Url implements CoverIcon {

        @NotNull
        public static final Parcelable.Creator<Url> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f94466b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Url(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Url[i];
            }
        }

        public /* synthetic */ Url(String str) {
            this(str, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Url)) {
                return false;
            }
            Url url2 = (Url) obj2;
            return Intrinsics.f(this.f94465a, url2.f94465a) && Intrinsics.f(this.f94466b, url2.f94466b);
        }

        public final int hashCode() {
            int iHashCode = this.f94465a.hashCode() * 31;
            String str = this.f94466b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94465a);
            dest.writeString(this.f94466b);
        }

        public Url(String value, String str) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f94465a = value;
            this.f94466b = str;
        }
    }
}
