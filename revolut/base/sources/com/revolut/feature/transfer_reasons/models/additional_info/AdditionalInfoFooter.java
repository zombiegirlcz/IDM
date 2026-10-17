package com.revolut.feature.transfer_reasons.models.additional_info;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transfer_reasons/models/additional_info/AdditionalInfoFooter;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Parameter", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdditionalInfoFooter implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AdditionalInfoFooter> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f92414b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/models/additional_info/AdditionalInfoFooter$Parameter;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Parameter implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Parameter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92416b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Parameter(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Parameter[i];
            }
        }

        public Parameter(String header, String body) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(body, "body");
            this.f92415a = header;
            this.f92416b = body;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Parameter)) {
                return false;
            }
            Parameter parameter = (Parameter) obj2;
            return Intrinsics.f(this.f92415a, parameter.f92415a) && Intrinsics.f(this.f92416b, parameter.f92416b);
        }

        public final int hashCode() {
            return this.f92416b.hashCode() + (this.f92415a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92415a);
            dest.writeString(this.f92416b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Parameter.CREATOR, parcel, arrayList, iA, 1);
            }
            return new AdditionalInfoFooter(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdditionalInfoFooter[i];
        }
    }

    public AdditionalInfoFooter(String description, List clickableParameters) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(clickableParameters, "clickableParameters");
        this.f92413a = description;
        this.f92414b = clickableParameters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AdditionalInfoFooter)) {
            return false;
        }
        AdditionalInfoFooter additionalInfoFooter = (AdditionalInfoFooter) obj2;
        return Intrinsics.f(this.f92413a, additionalInfoFooter.f92413a) && Intrinsics.f(this.f92414b, additionalInfoFooter.f92414b);
    }

    public final int hashCode() {
        return this.f92414b.hashCode() + (this.f92413a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92413a);
        Iterator itV = p.a.v(this.f92414b, dest);
        while (itV.hasNext()) {
            ((Parameter) itV.next()).writeToParcel(dest, i);
        }
    }
}
