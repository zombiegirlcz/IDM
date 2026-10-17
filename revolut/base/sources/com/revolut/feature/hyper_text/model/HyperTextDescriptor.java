package com.revolut.feature.hyper_text.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/hyper_text/model/HyperTextDescriptor;", "", "Action", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_hyper_text_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HyperTextDescriptor<Action> implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HyperTextDescriptor<?>> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HyperTextTarget f74755b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HyperTextDescriptor(parcel.readString(), (HyperTextTarget) parcel.readParcelable(HyperTextDescriptor.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HyperTextDescriptor[i];
        }
    }

    public HyperTextDescriptor(String text, HyperTextTarget hyperTextTarget) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f74754a = text;
        this.f74755b = hyperTextTarget;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HyperTextDescriptor)) {
            return false;
        }
        HyperTextDescriptor hyperTextDescriptor = (HyperTextDescriptor) obj2;
        return Intrinsics.f(this.f74754a, hyperTextDescriptor.f74754a) && Intrinsics.f(this.f74755b, hyperTextDescriptor.f74755b);
    }

    public final int hashCode() {
        int iHashCode = this.f74754a.hashCode() * 31;
        HyperTextTarget hyperTextTarget = this.f74755b;
        return iHashCode + (hyperTextTarget == null ? 0 : hyperTextTarget.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74754a);
        dest.writeParcelable(this.f74755b, i);
    }
}
