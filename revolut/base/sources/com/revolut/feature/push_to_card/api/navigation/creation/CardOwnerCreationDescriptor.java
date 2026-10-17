package com.revolut.feature.push_to_card.api.navigation.creation;

import aii.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/push_to_card/api/navigation/creation/CardOwnerCreationDescriptor;", "Laii/e;", "Ldqa/b;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardOwnerCreationDescriptor implements e, Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardOwnerCreationDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f81541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardOwnerInfoState f81542b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = d.e(CardOwnerCreationDescriptor.class, parcel, linkedHashSet, iE, 1);
            }
            return new CardOwnerCreationDescriptor(linkedHashSet, CardOwnerInfoState.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardOwnerCreationDescriptor[i];
        }
    }

    public CardOwnerCreationDescriptor() {
        this(0);
    }

    public final CardOwnerCreationInputData b() {
        return new CardOwnerCreationInputData(dqa.a.KOMPOT_RESULT, this.f81541a, this.f81542b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardOwnerCreationDescriptor)) {
            return false;
        }
        CardOwnerCreationDescriptor cardOwnerCreationDescriptor = (CardOwnerCreationDescriptor) obj2;
        return Intrinsics.f(this.f81541a, cardOwnerCreationDescriptor.f81541a) && Intrinsics.f(this.f81542b, cardOwnerCreationDescriptor.f81542b);
    }

    public final int hashCode() {
        return this.f81542b.hashCode() + (this.f81541a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f81541a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        this.f81542b.writeToParcel(dest, i);
    }

    public CardOwnerCreationDescriptor(Set additionalConfiguration, CardOwnerInfoState cardOwnerInfo) {
        Intrinsics.checkNotNullParameter(additionalConfiguration, "additionalConfiguration");
        Intrinsics.checkNotNullParameter(cardOwnerInfo, "cardOwnerInfo");
        this.f81541a = additionalConfiguration;
        this.f81542b = cardOwnerInfo;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CardOwnerCreationDescriptor(int i) {
        h0 h0Var = h0.f322473a;
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        this(h0Var, new CardOwnerInfoState(true, "", "", "", fqa.a.MANUAL));
    }
}
