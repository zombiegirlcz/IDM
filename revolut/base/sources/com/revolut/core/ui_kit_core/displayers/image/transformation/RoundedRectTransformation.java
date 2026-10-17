package com.revolut.core.ui_kit_core.displayers.image.transformation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/transformation/RoundedRectTransformation;", "Lcom/revolut/core/ui_kit_core/displayers/image/transformation/ShapeTransformation;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RoundedRectTransformation extends ShapeTransformation {

    @NotNull
    public static final Parcelable.Creator<RoundedRectTransformation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f60071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f60072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f60073c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RoundedRectTransformation(parcel.readFloat(), parcel.readFloat(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RoundedRectTransformation[i];
        }
    }

    public RoundedRectTransformation(float f, float f4, int i) {
        this.f60071a = f;
        this.f60072b = f4;
        this.f60073c = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF60073c() {
        return this.f60073c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getF60072b() {
        return this.f60072b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getF60071a() {
        return this.f60071a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RoundedRectTransformation)) {
            return false;
        }
        RoundedRectTransformation roundedRectTransformation = (RoundedRectTransformation) obj2;
        return Float.compare(this.f60071a, roundedRectTransformation.f60071a) == 0 && Float.compare(this.f60072b, roundedRectTransformation.f60072b) == 0 && this.f60073c == roundedRectTransformation.f60073c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f60073c) + b.b(this.f60072b, Float.hashCode(this.f60071a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeFloat(this.f60071a);
        dest.writeFloat(this.f60072b);
        dest.writeInt(this.f60073c);
    }

    public /* synthetic */ RoundedRectTransformation(float f) {
        this(f, BitmapDescriptorFactory.HUE_RED, R$attr.uikit_colorTransparent);
    }
}
