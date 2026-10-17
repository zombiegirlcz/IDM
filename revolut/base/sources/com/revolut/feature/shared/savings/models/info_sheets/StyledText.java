package com.revolut.feature.shared.savings.models.info_sheets;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mcd.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/info_sheets/StyledText;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StyledText implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StyledText> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f86512b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StyledText(parcel.readString(), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StyledText[i];
        }
    }

    public StyledText(String text, d style) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f86511a = text;
        this.f86512b = style;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StyledText)) {
            return false;
        }
        StyledText styledText = (StyledText) obj2;
        return Intrinsics.f(this.f86511a, styledText.f86511a) && this.f86512b == styledText.f86512b;
    }

    public final int hashCode() {
        return this.f86512b.hashCode() + (this.f86511a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86511a);
        dest.writeString(this.f86512b.name());
    }
}
