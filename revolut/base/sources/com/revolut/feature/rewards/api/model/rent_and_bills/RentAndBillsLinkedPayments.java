package com.revolut.feature.rewards.api.model.rent_and_bills;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rent_and_bills/RentAndBillsLinkedPayments;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Category", "FaqItem", "egc/a", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RentAndBillsLinkedPayments implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RentAndBillsLinkedPayments> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Category f84786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Category f84787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f84788c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rent_and_bills/RentAndBillsLinkedPayments$Category;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "LinkedPayment", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Category implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Category> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f84789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f84790b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rent_and_bills/RentAndBillsLinkedPayments$Category$LinkedPayment;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Payment", "com/revolut/feature/rewards/api/model/rent_and_bills/a", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LinkedPayment implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<LinkedPayment> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f84791a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Payment f84792b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final com.revolut.feature.rewards.api.model.rent_and_bills.a f84793c;
            public final double d;
            public final long e;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rent_and_bills/RentAndBillsLinkedPayments$Category$LinkedPayment$Payment;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/rewards/api/model/rent_and_bills/b", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Payment implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<Payment> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f84794a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final b f84795b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Payment(parcel.readString(), b.valueOf(parcel.readString()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Payment[i];
                    }
                }

                public Payment(String id10, b type) {
                    Intrinsics.checkNotNullParameter(id10, "id");
                    Intrinsics.checkNotNullParameter(type, "type");
                    this.f84794a = id10;
                    this.f84795b = type;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Payment)) {
                        return false;
                    }
                    Payment payment = (Payment) obj2;
                    return Intrinsics.f(this.f84794a, payment.f84794a) && this.f84795b == payment.f84795b;
                }

                public final int hashCode() {
                    return this.f84795b.hashCode() + (this.f84794a.hashCode() * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f84794a);
                    dest.writeString(this.f84795b.name());
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new LinkedPayment(parcel.readString(), Payment.CREATOR.createFromParcel(parcel), com.revolut.feature.rewards.api.model.rent_and_bills.a.valueOf(parcel.readString()), parcel.readDouble(), parcel.readLong());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new LinkedPayment[i];
                }
            }

            public LinkedPayment(String id10, Payment payment, com.revolut.feature.rewards.api.model.rent_and_bills.a state, double d, long j2) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(payment, "payment");
                Intrinsics.checkNotNullParameter(state, "state");
                this.f84791a = id10;
                this.f84792b = payment;
                this.f84793c = state;
                this.d = d;
                this.e = j2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof LinkedPayment)) {
                    return false;
                }
                LinkedPayment linkedPayment = (LinkedPayment) obj2;
                return Intrinsics.f(this.f84791a, linkedPayment.f84791a) && Intrinsics.f(this.f84792b, linkedPayment.f84792b) && this.f84793c == linkedPayment.f84793c && Double.compare(this.d, linkedPayment.d) == 0 && this.e == linkedPayment.e;
            }

            public final int hashCode() {
                return Long.hashCode(this.e) + m72.b.c((this.f84793c.hashCode() + ((this.f84792b.hashCode() + (this.f84791a.hashCode() * 31)) * 31)) * 31, this.d, 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f84791a);
                this.f84792b.writeToParcel(dest, i);
                dest.writeString(this.f84793c.name());
                dest.writeDouble(this.d);
                dest.writeLong(this.e);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(LinkedPayment.CREATOR, parcel, arrayList, iA, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(Category.class, parcel, arrayList2, iE, 1);
                }
                return new Category(arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Category[i];
            }
        }

        public Category(ArrayList payments, ArrayList faqs) {
            Intrinsics.checkNotNullParameter(payments, "payments");
            Intrinsics.checkNotNullParameter(faqs, "faqs");
            this.f84789a = payments;
            this.f84790b = faqs;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Category)) {
                return false;
            }
            Category category = (Category) obj2;
            return this.f84789a.equals(category.f84789a) && this.f84790b.equals(category.f84790b);
        }

        public final int hashCode() {
            return this.f84790b.hashCode() + (this.f84789a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f84789a, dest);
            while (itY.hasNext()) {
                ((LinkedPayment) itY.next()).writeToParcel(dest, i);
            }
            Iterator itY2 = j6.a.y(this.f84790b, dest);
            while (itY2.hasNext()) {
                dest.writeParcelable((Parcelable) itY2.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rent_and_bills/RentAndBillsLinkedPayments$FaqItem;", "Landroid/os/Parcelable;", "<init>", "()V", "Topic", "Deeplink", "Lcom/revolut/feature/rewards/api/model/rent_and_bills/RentAndBillsLinkedPayments$FaqItem$Deeplink;", "Lcom/revolut/feature/rewards/api/model/rent_and_bills/RentAndBillsLinkedPayments$FaqItem$Topic;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class FaqItem implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rent_and_bills/RentAndBillsLinkedPayments$FaqItem$Deeplink;", "Lcom/revolut/feature/rewards/api/model/rent_and_bills/RentAndBillsLinkedPayments$FaqItem;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Deeplink extends FaqItem {

            @NotNull
            public static final Parcelable.Creator<Deeplink> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f84796a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f84797b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Deeplink(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Deeplink[i];
                }
            }

            public Deeplink(String title, String url2) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(url2, "url");
                this.f84796a = title;
                this.f84797b = url2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Deeplink)) {
                    return false;
                }
                Deeplink deeplink = (Deeplink) obj2;
                return Intrinsics.f(this.f84796a, deeplink.f84796a) && Intrinsics.f(this.f84797b, deeplink.f84797b);
            }

            public final int hashCode() {
                return this.f84797b.hashCode() + (this.f84796a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f84796a);
                dest.writeString(this.f84797b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rent_and_bills/RentAndBillsLinkedPayments$FaqItem$Topic;", "Lcom/revolut/feature/rewards/api/model/rent_and_bills/RentAndBillsLinkedPayments$FaqItem;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Topic extends FaqItem {

            @NotNull
            public static final Parcelable.Creator<Topic> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f84798a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Topic(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Topic[i];
                }
            }

            public Topic(String topicKey) {
                Intrinsics.checkNotNullParameter(topicKey, "topicKey");
                this.f84798a = topicKey;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Topic) && Intrinsics.f(this.f84798a, ((Topic) obj2).f84798a);
            }

            public final int hashCode() {
                return this.f84798a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f84798a);
            }
        }

        private FaqItem() {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<Category> creator = Category.CREATOR;
            Category categoryCreateFromParcel = creator.createFromParcel(parcel);
            Category categoryCreateFromParcel2 = creator.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(RentAndBillsLinkedPayments.class, parcel, arrayList, iE, 1);
            }
            return new RentAndBillsLinkedPayments(categoryCreateFromParcel, categoryCreateFromParcel2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RentAndBillsLinkedPayments[i];
        }
    }

    public RentAndBillsLinkedPayments(Category rent, Category bills, ArrayList faqs) {
        Intrinsics.checkNotNullParameter(rent, "rent");
        Intrinsics.checkNotNullParameter(bills, "bills");
        Intrinsics.checkNotNullParameter(faqs, "faqs");
        this.f84786a = rent;
        this.f84787b = bills;
        this.f84788c = faqs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RentAndBillsLinkedPayments)) {
            return false;
        }
        RentAndBillsLinkedPayments rentAndBillsLinkedPayments = (RentAndBillsLinkedPayments) obj2;
        return Intrinsics.f(this.f84786a, rentAndBillsLinkedPayments.f84786a) && Intrinsics.f(this.f84787b, rentAndBillsLinkedPayments.f84787b) && this.f84788c.equals(rentAndBillsLinkedPayments.f84788c);
    }

    public final int hashCode() {
        return this.f84788c.hashCode() + ((this.f84787b.hashCode() + (this.f84786a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f84786a.writeToParcel(dest, i);
        this.f84787b.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f84788c, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
    }
}
