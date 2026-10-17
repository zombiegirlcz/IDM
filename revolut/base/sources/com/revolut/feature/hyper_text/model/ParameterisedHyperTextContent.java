package com.revolut.feature.hyper_text.model;

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
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00032\u00020\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/hyper_text/model/ParameterisedHyperTextContent;", "", "Action", "", "Param", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_hyper_text_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ParameterisedHyperTextContent<Action, Param extends Enum<Param>> implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ParameterisedHyperTextContent<?, ?>> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f74760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f74761c;

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
                iA = org.bouncycastle.jcajce.provider.digest.a.a(HyperTextDescriptor.CREATOR, parcel, arrayList, iA, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iC != i2) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
            }
            return new ParameterisedHyperTextContent(string, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ParameterisedHyperTextContent[i];
        }
    }

    public ParameterisedHyperTextContent(String text, ArrayList descriptors, List parameters) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f74759a = text;
        this.f74760b = descriptors;
        this.f74761c = parameters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ParameterisedHyperTextContent)) {
            return false;
        }
        ParameterisedHyperTextContent parameterisedHyperTextContent = (ParameterisedHyperTextContent) obj2;
        return Intrinsics.f(this.f74759a, parameterisedHyperTextContent.f74759a) && Intrinsics.f(this.f74760b, parameterisedHyperTextContent.f74760b) && Intrinsics.f(this.f74761c, parameterisedHyperTextContent.f74761c);
    }

    public final int hashCode() {
        return this.f74761c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f74760b, this.f74759a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74759a);
        Iterator itY = j6.a.y(this.f74760b, dest);
        while (itY.hasNext()) {
            ((HyperTextDescriptor) itY.next()).writeToParcel(dest, i);
        }
        Iterator itV = p.a.v(this.f74761c, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
    }

    public ParameterisedHyperTextContent(String str, ArrayList arrayList) {
        this(str, arrayList, f0.f322471a);
    }
}
