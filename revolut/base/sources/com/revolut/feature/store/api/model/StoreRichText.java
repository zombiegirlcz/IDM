package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t1e.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreRichText;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Placeholder", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreRichText implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreRichText> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f88593b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreRichText$Placeholder;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Placeholder implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Placeholder> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0 f88594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f88595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f88596c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Placeholder(e0.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Placeholder[i];
            }
        }

        public Placeholder(e0 formatting, String value, String fallback) {
            Intrinsics.checkNotNullParameter(formatting, "formatting");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(fallback, "fallback");
            this.f88594a = formatting;
            this.f88595b = value;
            this.f88596c = fallback;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Placeholder)) {
                return false;
            }
            Placeholder placeholder = (Placeholder) obj2;
            return this.f88594a == placeholder.f88594a && Intrinsics.f(this.f88595b, placeholder.f88595b) && Intrinsics.f(this.f88596c, placeholder.f88596c);
        }

        public final int hashCode() {
            return this.f88596c.hashCode() + p.a.c(this.f88594a.hashCode() * 31, 31, this.f88595b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88594a.name());
            dest.writeString(this.f88595b);
            dest.writeString(this.f88596c);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), Placeholder.CREATOR.createFromParcel(parcel));
            }
            return new StoreRichText(linkedHashMap, string);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreRichText[i];
        }
    }

    public StoreRichText(LinkedHashMap placeholders, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        this.f88592a = text;
        this.f88593b = placeholders;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreRichText)) {
            return false;
        }
        StoreRichText storeRichText = (StoreRichText) obj2;
        return Intrinsics.f(this.f88592a, storeRichText.f88592a) && this.f88593b.equals(storeRichText.f88593b);
    }

    public final int hashCode() {
        return this.f88593b.hashCode() + (this.f88592a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88592a);
        LinkedHashMap linkedHashMap = this.f88593b;
        dest.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            dest.writeString((String) entry.getKey());
            ((Placeholder) entry.getValue()).writeToParcel(dest, i);
        }
    }
}
