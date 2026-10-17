package com.revolut.feature.retail.savings.api.challenge.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/savings/api/challenge/model/SavingsChallenge;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Contribution", "Document", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingsChallenge implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SavingsChallenge> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f83088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83089c;
    public final LocalDateTime d;
    public final LocalDateTime e;
    public final LocalDateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Contribution f83090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f83091h;
    public final String i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/api/challenge/model/SavingsChallenge$Contribution;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Contribution implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Contribution> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f83092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f83093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f83094c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Contribution((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Contribution[i];
            }
        }

        public Contribution(d minAmount, d maxAmount, d dVar) {
            Intrinsics.checkNotNullParameter(minAmount, "minAmount");
            Intrinsics.checkNotNullParameter(maxAmount, "maxAmount");
            this.f83092a = minAmount;
            this.f83093b = maxAmount;
            this.f83094c = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Contribution)) {
                return false;
            }
            Contribution contribution = (Contribution) obj2;
            return Intrinsics.f(this.f83092a, contribution.f83092a) && Intrinsics.f(this.f83093b, contribution.f83093b) && Intrinsics.f(this.f83094c, contribution.f83094c);
        }

        public final int hashCode() {
            int iC = v7.c(this.f83092a.hashCode() * 31, 31, this.f83093b);
            d dVar = this.f83094c;
            return iC + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f83092a);
            dest.writeSerializable(this.f83093b);
            dest.writeSerializable(this.f83094c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/api/challenge/model/SavingsChallenge$Document;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Document implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Document> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83095a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Document(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Document[i];
            }
        }

        public Document(String scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            this.f83095a = scope;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Document) && Intrinsics.f(this.f83095a, ((Document) obj2).f83095a);
        }

        public final int hashCode() {
            return this.f83095a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83095a);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string2 = parcel.readString();
            LocalDateTime localDateTime = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime2 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime3 = (LocalDateTime) parcel.readSerializable();
            Contribution contributionCreateFromParcel = Contribution.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Document.CREATOR, parcel, arrayList, iA, 1);
            }
            return new SavingsChallenge(string, arrayListCreateStringArrayList, string2, localDateTime, localDateTime2, localDateTime3, contributionCreateFromParcel, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SavingsChallenge[i];
        }
    }

    public SavingsChallenge(String id10, List productIds, String displayName, LocalDateTime startDate, LocalDateTime endDate, LocalDateTime onboardingDeadline, Contribution contribution, ArrayList documents, String detailsLink) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(onboardingDeadline, "onboardingDeadline");
        Intrinsics.checkNotNullParameter(contribution, "contribution");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(detailsLink, "detailsLink");
        this.f83087a = id10;
        this.f83088b = productIds;
        this.f83089c = displayName;
        this.d = startDate;
        this.e = endDate;
        this.f = onboardingDeadline;
        this.f83090g = contribution;
        this.f83091h = documents;
        this.i = detailsLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SavingsChallenge)) {
            return false;
        }
        SavingsChallenge savingsChallenge = (SavingsChallenge) obj2;
        return Intrinsics.f(this.f83087a, savingsChallenge.f83087a) && Intrinsics.f(this.f83088b, savingsChallenge.f83088b) && Intrinsics.f(this.f83089c, savingsChallenge.f83089c) && Intrinsics.f(this.d, savingsChallenge.d) && Intrinsics.f(this.e, savingsChallenge.e) && Intrinsics.f(this.f, savingsChallenge.f) && Intrinsics.f(this.f83090g, savingsChallenge.f83090g) && this.f83091h.equals(savingsChallenge.f83091h) && Intrinsics.f(this.i, savingsChallenge.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f83091h, (this.f83090g.hashCode() + v7.i(this.f, v7.i(this.e, v7.i(this.d, p.a.c(p.a.d(this.f83087a.hashCode() * 31, 31, this.f83088b), 31, this.f83089c), 31), 31), 31)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f83087a);
        dest.writeStringList(this.f83088b);
        dest.writeString(this.f83089c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        this.f83090g.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f83091h, dest);
        while (itY.hasNext()) {
            ((Document) itY.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.i);
    }
}
