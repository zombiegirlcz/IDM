package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimIcon;", "Landroid/os/Parcelable;", "Companion", "Url", "Id", "a", "Lcom/revolut/retail/feature/esim/api/model/EsimIcon$Id;", "Lcom/revolut/retail/feature/esim/api/model/EsimIcon$Url;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimIcon extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f100283a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimIcon$Id;", "Lcom/revolut/retail/feature/esim/api/model/EsimIcon;", "id", "", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Id implements EsimIcon {

        @NotNull
        public static final Parcelable.Creator<Id> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100281a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new Id(v7.t(parcel, "parcel", "id"));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Id[i];
            }
        }

        public /* synthetic */ Id(String str) {
            this.f100281a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (obj2 instanceof Id) {
                return Intrinsics.f(this.f100281a, ((Id) obj2).f100281a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f100281a.hashCode();
        }

        public final String toString() {
            return p.a.p("Id(id=", this.f100281a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100281a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimIcon$Url;", "Lcom/revolut/retail/feature/esim/api/model/EsimIcon;", "url", "", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Url implements EsimIcon {

        @NotNull
        public static final Parcelable.Creator<Url> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100282a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new Url(v7.t(parcel, "parcel", "url"));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Url[i];
            }
        }

        public /* synthetic */ Url(String str) {
            this.f100282a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (obj2 instanceof Url) {
                return Intrinsics.f(this.f100282a, ((Url) obj2).f100282a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f100282a.hashCode();
        }

        public final String toString() {
            return p.a.p("Url(url=", this.f100282a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100282a);
        }
    }

    /* JADX INFO: renamed from: com.revolut.retail.feature.esim.api.model.EsimIcon$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f100283a = new Companion();

        private Companion() {
        }
    }
}
