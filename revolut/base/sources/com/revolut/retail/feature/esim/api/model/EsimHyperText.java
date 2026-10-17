package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.lang.Enum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00010\u00012\u00020\u0004:\u0003\b\t\nJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimHyperText;", "", "Action", "Param", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "dej/g0", "dej/f0", "Descriptor", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimHyperText<Action extends Enum<Action>, Param extends Enum<Param>> implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimHyperText<?, ?>> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f100277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f100278c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\u000e\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimHyperText$Descriptor;", "", "Action", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Descriptor<Action extends Enum<Action>> implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Descriptor<?>> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimDescriptorValue f100280b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Descriptor(parcel.readString(), (EsimDescriptorValue) parcel.readParcelable(Descriptor.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Descriptor[i];
            }
        }

        public Descriptor(String text, EsimDescriptorValue value) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f100279a = text;
            this.f100280b = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Descriptor)) {
                return false;
            }
            Descriptor descriptor = (Descriptor) obj2;
            return Intrinsics.f(this.f100279a, descriptor.f100279a) && Intrinsics.f(this.f100280b, descriptor.f100280b);
        }

        public final int hashCode() {
            return this.f100280b.hashCode() + (this.f100279a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100279a);
            dest.writeParcelable(this.f100280b, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Descriptor.CREATOR, parcel, arrayList, iA, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iC != i2) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
            }
            return new EsimHyperText(string, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimHyperText[i];
        }
    }

    public EsimHyperText(String text, List descriptors, List parameters) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f100276a = text;
        this.f100277b = descriptors;
        this.f100278c = parameters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimHyperText)) {
            return false;
        }
        EsimHyperText esimHyperText = (EsimHyperText) obj2;
        return Intrinsics.f(this.f100276a, esimHyperText.f100276a) && Intrinsics.f(this.f100277b, esimHyperText.f100277b) && Intrinsics.f(this.f100278c, esimHyperText.f100278c);
    }

    public final int hashCode() {
        return this.f100278c.hashCode() + p.a.d(this.f100276a.hashCode() * 31, 31, this.f100277b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100276a);
        Iterator itV = p.a.v(this.f100277b, dest);
        while (itV.hasNext()) {
            ((Descriptor) itV.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = p.a.v(this.f100278c, dest);
        while (itV2.hasNext()) {
            dest.writeSerializable((Serializable) itV2.next());
        }
    }
}
