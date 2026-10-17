package com.revolut.feature.hyper_text.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.hyper_text.model.HyperTextTarget;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/hyper_text/ui/HyperTextClickData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_hyper_text_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HyperTextClickData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HyperTextClickData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HyperTextTarget f74762a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HyperTextClickData((HyperTextTarget) parcel.readParcelable(HyperTextClickData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HyperTextClickData[i];
        }
    }

    public HyperTextClickData(HyperTextTarget target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f74762a = target;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof HyperTextClickData) && Intrinsics.f(this.f74762a, ((HyperTextClickData) obj2).f74762a);
    }

    public final int hashCode() {
        return this.f74762a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f74762a, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HyperTextClickData(String url2) {
        this(new HyperTextTarget.Link(url2));
        Intrinsics.checkNotNullParameter(url2, "url");
    }
}
