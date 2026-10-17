package com.revolut.feature.be_driven_design.models.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenActionButton;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "fr2/d", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FincrimeHomeScreenActionButton implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FincrimeHomeScreenActionButton> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FincrimeHomeScreenAction f64148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fr2.d f64149c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FincrimeHomeScreenActionButton(parcel.readString(), (FincrimeHomeScreenAction) parcel.readParcelable(FincrimeHomeScreenActionButton.class.getClassLoader()), fr2.d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FincrimeHomeScreenActionButton[i];
        }
    }

    public FincrimeHomeScreenActionButton(String title, FincrimeHomeScreenAction action, fr2.d style) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f64147a = title;
        this.f64148b = action;
        this.f64149c = style;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FincrimeHomeScreenActionButton)) {
            return false;
        }
        FincrimeHomeScreenActionButton fincrimeHomeScreenActionButton = (FincrimeHomeScreenActionButton) obj2;
        return Intrinsics.f(this.f64147a, fincrimeHomeScreenActionButton.f64147a) && Intrinsics.f(this.f64148b, fincrimeHomeScreenActionButton.f64148b) && this.f64149c == fincrimeHomeScreenActionButton.f64149c;
    }

    public final int hashCode() {
        return this.f64149c.hashCode() + ((this.f64148b.hashCode() + (this.f64147a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64147a);
        dest.writeParcelable(this.f64148b, i);
        dest.writeString(this.f64149c.name());
    }
}
