package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.beneficiary.impl.expansion.ExpansionFieldDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/contract/Field$ExpansionDefinition", "", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Field$ExpansionDefinition implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Field$ExpansionDefinition> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExpansionFieldDefinition f99729a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Field$ExpansionDefinition(ExpansionFieldDefinition.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Field$ExpansionDefinition[i];
        }
    }

    public Field$ExpansionDefinition(ExpansionFieldDefinition definition) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        this.f99729a = definition;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof Field$ExpansionDefinition) && Intrinsics.f(this.f99729a, ((Field$ExpansionDefinition) obj2).f99729a);
    }

    public final int hashCode() {
        return this.f99729a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f99729a.writeToParcel(dest, i);
    }
}
