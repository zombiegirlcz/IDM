package com.revolut.feature.product.lifecycle.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product/lifecycle/domain/models/Interaction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_product_lifecycle_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Interaction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Interaction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InteractionNavigation f81197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InteractionParams f81198c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Interaction(parcel.readString(), InteractionNavigation.CREATOR.createFromParcel(parcel), (InteractionParams) parcel.readParcelable(Interaction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Interaction[i];
        }
    }

    public Interaction(String id10, InteractionNavigation navigation, InteractionParams params) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f81196a = id10;
        this.f81197b = navigation;
        this.f81198c = params;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Interaction)) {
            return false;
        }
        Interaction interaction = (Interaction) obj2;
        return Intrinsics.f(this.f81196a, interaction.f81196a) && Intrinsics.f(this.f81197b, interaction.f81197b) && Intrinsics.f(this.f81198c, interaction.f81198c);
    }

    public final int hashCode() {
        return this.f81198c.hashCode() + ((this.f81197b.hashCode() + (this.f81196a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81196a);
        this.f81197b.writeToParcel(dest, i);
        dest.writeParcelable(this.f81198c, i);
    }
}
