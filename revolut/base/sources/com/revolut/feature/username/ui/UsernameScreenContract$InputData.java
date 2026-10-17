package com.revolut.feature.username.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/username/ui/UsernameScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_username_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UsernameScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<UsernameScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f94692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f94693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f94694c;
    public final Image d;
    public final AnalyticsProduct e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UsernameScreenContract$InputData((Clause) parcel.readParcelable(UsernameScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(UsernameScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(UsernameScreenContract$InputData.class.getClassLoader()), (Image) parcel.readParcelable(UsernameScreenContract$InputData.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(UsernameScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UsernameScreenContract$InputData[i];
        }
    }

    public UsernameScreenContract$InputData(Clause titleText, Clause subtitleText, Clause buttonText, Image image, AnalyticsProduct product) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(subtitleText, "subtitleText");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f94692a = titleText;
        this.f94693b = subtitleText;
        this.f94694c = buttonText;
        this.d = image;
        this.e = product;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UsernameScreenContract$InputData)) {
            return false;
        }
        UsernameScreenContract$InputData usernameScreenContract$InputData = (UsernameScreenContract$InputData) obj2;
        return Intrinsics.f(this.f94692a, usernameScreenContract$InputData.f94692a) && Intrinsics.f(this.f94693b, usernameScreenContract$InputData.f94693b) && Intrinsics.f(this.f94694c, usernameScreenContract$InputData.f94694c) && Intrinsics.f(this.d, usernameScreenContract$InputData.d) && Intrinsics.f(this.e, usernameScreenContract$InputData.e);
    }

    public final int hashCode() {
        int iA = p.a.a(p.a.a(this.f94692a.hashCode() * 31, 31, this.f94693b), 31, this.f94694c);
        Image image = this.d;
        return this.e.hashCode() + ((iA + (image == null ? 0 : image.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94692a, i);
        dest.writeParcelable(this.f94693b, i);
        dest.writeParcelable(this.f94694c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }
}
