package com.revolut.feature.push_to_card.api.navigation.creation;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/push_to_card/api/navigation/creation/CardOwnerCreationInputData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "dqa/a", "feature_push_to_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardOwnerCreationInputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardOwnerCreationInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dqa.a f81545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f81546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CardOwnerInfoState f81547c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            dqa.a aVarValueOf = dqa.a.valueOf(parcel.readString());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = d.e(CardOwnerCreationInputData.class, parcel, linkedHashSet, iE, 1);
            }
            return new CardOwnerCreationInputData(aVarValueOf, linkedHashSet, CardOwnerInfoState.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardOwnerCreationInputData[i];
        }
    }

    public CardOwnerCreationInputData() {
        this(null, 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardOwnerCreationInputData)) {
            return false;
        }
        CardOwnerCreationInputData cardOwnerCreationInputData = (CardOwnerCreationInputData) obj2;
        return this.f81545a == cardOwnerCreationInputData.f81545a && Intrinsics.f(this.f81546b, cardOwnerCreationInputData.f81546b) && Intrinsics.f(this.f81547c, cardOwnerCreationInputData.f81547c);
    }

    public final int hashCode() {
        return this.f81547c.hashCode() + p.a.f(this.f81545a.hashCode() * 31, 31, this.f81546b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81545a.name());
        Iterator itV = n.v(this.f81546b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        this.f81547c.writeToParcel(dest, i);
    }

    public CardOwnerCreationInputData(dqa.a launchType, Set additionalConfiguration, CardOwnerInfoState cardOwnerInfo) {
        Intrinsics.checkNotNullParameter(launchType, "launchType");
        Intrinsics.checkNotNullParameter(additionalConfiguration, "additionalConfiguration");
        Intrinsics.checkNotNullParameter(cardOwnerInfo, "cardOwnerInfo");
        this.f81545a = launchType;
        this.f81546b = additionalConfiguration;
        this.f81547c = cardOwnerInfo;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CardOwnerCreationInputData(dqa.a aVar, int i) {
        aVar = (i & 1) != 0 ? dqa.a.DEFAULT : aVar;
        h0 h0Var = h0.f322473a;
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        this(aVar, h0Var, new CardOwnerInfoState(true, "", "", "", fqa.a.MANUAL));
    }
}
