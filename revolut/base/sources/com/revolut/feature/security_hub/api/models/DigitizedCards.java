package com.revolut.feature.security_hub.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/DigitizedCards;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DigitizedCards implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DigitizedCards> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f85404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f85405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DigitizedCardsFlags f85406c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(DigitizedCard.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Enrollment.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new DigitizedCards(arrayList, arrayList2, DigitizedCardsFlags.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DigitizedCards[i];
        }
    }

    public DigitizedCards(List digitizedCards, List pendingEnrollments, DigitizedCardsFlags flags) {
        Intrinsics.checkNotNullParameter(digitizedCards, "digitizedCards");
        Intrinsics.checkNotNullParameter(pendingEnrollments, "pendingEnrollments");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f85404a = digitizedCards;
        this.f85405b = pendingEnrollments;
        this.f85406c = flags;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DigitizedCards)) {
            return false;
        }
        DigitizedCards digitizedCards = (DigitizedCards) obj2;
        return Intrinsics.f(this.f85404a, digitizedCards.f85404a) && Intrinsics.f(this.f85405b, digitizedCards.f85405b) && Intrinsics.f(this.f85406c, digitizedCards.f85406c);
    }

    public final int hashCode() {
        return this.f85406c.hashCode() + p.a.d(this.f85404a.hashCode() * 31, 31, this.f85405b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f85404a, dest);
        while (itV.hasNext()) {
            ((DigitizedCard) itV.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = p.a.v(this.f85405b, dest);
        while (itV2.hasNext()) {
            ((Enrollment) itV2.next()).writeToParcel(dest, i);
        }
        this.f85406c.writeToParcel(dest, i);
    }
}
