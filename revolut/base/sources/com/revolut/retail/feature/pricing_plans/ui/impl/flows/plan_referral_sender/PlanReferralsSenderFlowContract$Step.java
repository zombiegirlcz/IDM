package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.contacts_chooser.api.models.ContactsFilter;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zm3.l;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_referral_sender/PlanReferralsSenderFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Intro", "SelectContacts", "PlanSharing", "InviteVideo", "CampaignUnavailable", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_referral_sender/PlanReferralsSenderFlowContract$Step$CampaignUnavailable;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_referral_sender/PlanReferralsSenderFlowContract$Step$Intro;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_referral_sender/PlanReferralsSenderFlowContract$Step$InviteVideo;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_referral_sender/PlanReferralsSenderFlowContract$Step$PlanSharing;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_referral_sender/PlanReferralsSenderFlowContract$Step$SelectContacts;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PlanReferralsSenderFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_referral_sender/PlanReferralsSenderFlowContract$Step$CampaignUnavailable;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_referral_sender/PlanReferralsSenderFlowContract$Step;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CampaignUnavailable extends PlanReferralsSenderFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CampaignUnavailable f103222a = new CampaignUnavailable();

        @NotNull
        public static final Parcelable.Creator<CampaignUnavailable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CampaignUnavailable.f103222a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CampaignUnavailable[i];
            }
        }

        private CampaignUnavailable() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_referral_sender/PlanReferralsSenderFlowContract$Step$Intro;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_referral_sender/PlanReferralsSenderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Intro extends PlanReferralsSenderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f103223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f103224b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Intro((ProductArticleParams) parcel.readParcelable(Intro.class.getClassLoader()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        public Intro(ProductArticleParams articleParams, int i) {
            Intrinsics.checkNotNullParameter(articleParams, "articleParams");
            this.f103223a = articleParams;
            this.f103224b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Intro)) {
                return false;
            }
            Intro intro = (Intro) obj2;
            return Intrinsics.f(this.f103223a, intro.f103223a) && this.f103224b == intro.f103224b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f103224b) + (this.f103223a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103223a, i);
            dest.writeInt(this.f103224b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_referral_sender/PlanReferralsSenderFlowContract$Step$InviteVideo;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_referral_sender/PlanReferralsSenderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InviteVideo extends PlanReferralsSenderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InviteVideo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f103226b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InviteVideo(parcel.readString(), (l) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InviteVideo[i];
            }
        }

        public InviteVideo(String videoUrl, l recipient) {
            Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            this.f103225a = videoUrl;
            this.f103226b = recipient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InviteVideo)) {
                return false;
            }
            InviteVideo inviteVideo = (InviteVideo) obj2;
            return Intrinsics.f(this.f103225a, inviteVideo.f103225a) && Intrinsics.f(this.f103226b, inviteVideo.f103226b);
        }

        public final int hashCode() {
            return this.f103226b.hashCode() + (this.f103225a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103225a);
            dest.writeSerializable(this.f103226b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_referral_sender/PlanReferralsSenderFlowContract$Step$PlanSharing;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_referral_sender/PlanReferralsSenderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanSharing extends PlanReferralsSenderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PlanSharing> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f103227a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanSharing(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanSharing[i];
            }
        }

        public PlanSharing(int i) {
            this.f103227a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanSharing) && this.f103227a == ((PlanSharing) obj2).f103227a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f103227a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f103227a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_referral_sender/PlanReferralsSenderFlowContract$Step$SelectContacts;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/plan_referral_sender/PlanReferralsSenderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectContacts extends PlanReferralsSenderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectContacts> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f103228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f103229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ContactsFilter f103230c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectContacts((Clause) parcel.readParcelable(SelectContacts.class.getClassLoader()), parcel.readInt(), (ContactsFilter) parcel.readParcelable(SelectContacts.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectContacts[i];
            }
        }

        public SelectContacts(Clause referredPlanName, int i, ContactsFilter contactsFilter) {
            Intrinsics.checkNotNullParameter(referredPlanName, "referredPlanName");
            this.f103228a = referredPlanName;
            this.f103229b = i;
            this.f103230c = contactsFilter;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectContacts)) {
                return false;
            }
            SelectContacts selectContacts = (SelectContacts) obj2;
            return Intrinsics.f(this.f103228a, selectContacts.f103228a) && this.f103229b == selectContacts.f103229b && Intrinsics.f(this.f103230c, selectContacts.f103230c);
        }

        public final int hashCode() {
            int iB = j6.a.b(this.f103229b, this.f103228a.hashCode() * 31, 31);
            ContactsFilter contactsFilter = this.f103230c;
            return iB + (contactsFilter == null ? 0 : contactsFilter.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103228a, i);
            dest.writeInt(this.f103229b);
            dest.writeParcelable(this.f103230c, i);
        }
    }

    private PlanReferralsSenderFlowContract$Step() {
    }
}
