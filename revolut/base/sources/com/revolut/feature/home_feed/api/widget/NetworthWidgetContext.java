package com.revolut.feature.home_feed.api.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext;", "Lcom/revolut/feature/widgets/api/dependencies/WidgetContext;", "", "toString", "()Ljava/lang/String;", "Type", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NetworthWidgetContext extends WidgetContext {

    @NotNull
    public static final Parcelable.Creator<NetworthWidgetContext> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f74707b;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type;", "Landroid/os/Parcelable;", "Personal", "Savings", "Joint", "Pro", "PersonalPocket", "GroupPocket", "JointPocket", "ProPocket", "ProTaxPocket", "CreditCard", "Linked", "JointSavings", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$CreditCard;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$GroupPocket;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$Joint;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$JointPocket;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$JointSavings;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$Linked;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$Personal;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$PersonalPocket;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$Pro;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$ProPocket;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$ProTaxPocket;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$Savings;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Type extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$CreditCard;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CreditCard implements Type {

            @NotNull
            public static final Parcelable.Creator<CreditCard> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74708a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CreditCard(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CreditCard[i];
                }
            }

            public CreditCard(String creditCardFacilityId) {
                Intrinsics.checkNotNullParameter(creditCardFacilityId, "creditCardFacilityId");
                this.f74708a = creditCardFacilityId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CreditCard) && Intrinsics.f(this.f74708a, ((CreditCard) obj2).f74708a);
            }

            public final int hashCode() {
                return this.f74708a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74708a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$GroupPocket;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class GroupPocket implements Type {

            @NotNull
            public static final Parcelable.Creator<GroupPocket> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74709a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new GroupPocket(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new GroupPocket[i];
                }
            }

            public GroupPocket(String subaccountId) {
                Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
                this.f74709a = subaccountId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof GroupPocket) && Intrinsics.f(this.f74709a, ((GroupPocket) obj2).f74709a);
            }

            public final int hashCode() {
                return this.f74709a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74709a);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$Joint;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Joint implements Type {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Joint f74710a = new Joint();

            @NotNull
            public static final Parcelable.Creator<Joint> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Joint.f74710a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Joint[i];
                }
            }

            private Joint() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof Joint);
            }

            public final int hashCode() {
                return 1837146844;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$JointPocket;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class JointPocket implements Type {

            @NotNull
            public static final Parcelable.Creator<JointPocket> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74711a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new JointPocket(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new JointPocket[i];
                }
            }

            public JointPocket(String subaccountId) {
                Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
                this.f74711a = subaccountId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof JointPocket) && Intrinsics.f(this.f74711a, ((JointPocket) obj2).f74711a);
            }

            public final int hashCode() {
                return this.f74711a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74711a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$JointSavings;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class JointSavings implements Type {

            @NotNull
            public static final Parcelable.Creator<JointSavings> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74712a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new JointSavings(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new JointSavings[i];
                }
            }

            public JointSavings(String accountId) {
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                this.f74712a = accountId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof JointSavings) && Intrinsics.f(this.f74712a, ((JointSavings) obj2).f74712a);
            }

            public final int hashCode() {
                return this.f74712a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74712a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$Linked;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Linked implements Type {

            @NotNull
            public static final Parcelable.Creator<Linked> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74713a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Linked(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Linked[i];
                }
            }

            public Linked(String pocketId) {
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                this.f74713a = pocketId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Linked) && Intrinsics.f(this.f74713a, ((Linked) obj2).f74713a);
            }

            public final int hashCode() {
                return this.f74713a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74713a);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$Personal;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Personal implements Type {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Personal f74714a = new Personal();

            @NotNull
            public static final Parcelable.Creator<Personal> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Personal.f74714a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Personal[i];
                }
            }

            private Personal() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof Personal);
            }

            public final int hashCode() {
                return 1517441710;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$PersonalPocket;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PersonalPocket implements Type {

            @NotNull
            public static final Parcelable.Creator<PersonalPocket> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74715a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PersonalPocket(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PersonalPocket[i];
                }
            }

            public PersonalPocket(String subaccountId) {
                Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
                this.f74715a = subaccountId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof PersonalPocket) && Intrinsics.f(this.f74715a, ((PersonalPocket) obj2).f74715a);
            }

            public final int hashCode() {
                return this.f74715a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74715a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$Pro;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Pro implements Type {

            @NotNull
            public static final Parcelable.Creator<Pro> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74716a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Pro(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Pro[i];
                }
            }

            public Pro(String accountId) {
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                this.f74716a = accountId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Pro) && Intrinsics.f(this.f74716a, ((Pro) obj2).f74716a);
            }

            public final int hashCode() {
                return this.f74716a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74716a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$ProPocket;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ProPocket implements Type {

            @NotNull
            public static final Parcelable.Creator<ProPocket> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74717a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ProPocket(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ProPocket[i];
                }
            }

            public ProPocket(String subaccountId) {
                Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
                this.f74717a = subaccountId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ProPocket) && Intrinsics.f(this.f74717a, ((ProPocket) obj2).f74717a);
            }

            public final int hashCode() {
                return this.f74717a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74717a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$ProTaxPocket;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ProTaxPocket implements Type {

            @NotNull
            public static final Parcelable.Creator<ProTaxPocket> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74718a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ProTaxPocket(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ProTaxPocket[i];
                }
            }

            public ProTaxPocket(String subaccountId) {
                Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
                this.f74718a = subaccountId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ProTaxPocket) && Intrinsics.f(this.f74718a, ((ProTaxPocket) obj2).f74718a);
            }

            public final int hashCode() {
                return this.f74718a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74718a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type$Savings;", "Lcom/revolut/feature/home_feed/api/widget/NetworthWidgetContext$Type;", "", "toString", "()Ljava/lang/String;", "feature_home_feed_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Savings implements Type {

            @NotNull
            public static final Parcelable.Creator<Savings> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f74719a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Savings(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Savings[i];
                }
            }

            public Savings(String accountId) {
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                this.f74719a = accountId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Savings) && Intrinsics.f(this.f74719a, ((Savings) obj2).f74719a);
            }

            public final int hashCode() {
                return this.f74719a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f74719a);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NetworthWidgetContext(parcel.readString(), (Type) parcel.readParcelable(NetworthWidgetContext.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NetworthWidgetContext[i];
        }
    }

    public NetworthWidgetContext(String contextKey, Type type) {
        Intrinsics.checkNotNullParameter(contextKey, "contextKey");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f74706a = contextKey;
        this.f74707b = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NetworthWidgetContext)) {
            return false;
        }
        NetworthWidgetContext networthWidgetContext = (NetworthWidgetContext) obj2;
        return Intrinsics.f(this.f74706a, networthWidgetContext.f74706a) && Intrinsics.f(this.f74707b, networthWidgetContext.f74707b);
    }

    @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
    /* JADX INFO: renamed from: getContextKey, reason: from getter */
    public final String getF76166a() {
        return this.f74706a;
    }

    public final int hashCode() {
        return this.f74707b.hashCode() + (this.f74706a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74706a);
        dest.writeParcelable(this.f74707b, i);
    }
}
