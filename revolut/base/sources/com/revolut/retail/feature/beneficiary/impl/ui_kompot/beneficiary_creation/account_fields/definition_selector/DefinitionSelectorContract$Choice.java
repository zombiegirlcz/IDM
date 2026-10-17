package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.definition_selector;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/definition_selector/DefinitionSelectorContract$Choice", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DefinitionSelectorContract$Choice implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DefinitionSelectorContract$Choice> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f99694b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DefinitionSelectorContract$Choice((Clause) parcel.readParcelable(DefinitionSelectorContract$Choice.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DefinitionSelectorContract$Choice[i];
        }
    }

    public DefinitionSelectorContract$Choice(Clause title, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f99693a = id10;
        this.f99694b = title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DefinitionSelectorContract$Choice)) {
            return false;
        }
        DefinitionSelectorContract$Choice definitionSelectorContract$Choice = (DefinitionSelectorContract$Choice) obj2;
        return Intrinsics.f(this.f99693a, definitionSelectorContract$Choice.f99693a) && Intrinsics.f(this.f99694b, definitionSelectorContract$Choice.f99694b);
    }

    public final int hashCode() {
        return this.f99694b.hashCode() + (this.f99693a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99693a);
        dest.writeParcelable(this.f99694b, i);
    }
}
