package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubScreenConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanHubScreenConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlanHubScreenConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanHubScreenHeader f102661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f102662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlanHubProductOnboarding f102663c;
    public final PlanHubProductArticle d;
    public final String e;
    public final ArrayList f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            PlanHubScreenHeader planHubScreenHeader = (PlanHubScreenHeader) j6.a.f(parcel, "parcel", PlanHubScreenConfig.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(PlanHubScreenConfig.class, parcel, arrayList, iE, 1);
            }
            PlanHubProductOnboarding planHubProductOnboardingCreateFromParcel = parcel.readInt() == 0 ? null : PlanHubProductOnboarding.CREATOR.createFromParcel(parcel);
            PlanHubProductArticle planHubProductArticleCreateFromParcel = parcel.readInt() != 0 ? PlanHubProductArticle.CREATOR.createFromParcel(parcel) : null;
            String string = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(PlanHubModal.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new PlanHubScreenConfig(planHubScreenHeader, arrayList, planHubProductOnboardingCreateFromParcel, planHubProductArticleCreateFromParcel, string, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanHubScreenConfig[i];
        }
    }

    public PlanHubScreenConfig(PlanHubScreenHeader header, ArrayList content, PlanHubProductOnboarding planHubProductOnboarding, PlanHubProductArticle planHubProductArticle, String planId, ArrayList modals) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(modals, "modals");
        this.f102661a = header;
        this.f102662b = content;
        this.f102663c = planHubProductOnboarding;
        this.d = planHubProductArticle;
        this.e = planId;
        this.f = modals;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanHubScreenConfig)) {
            return false;
        }
        PlanHubScreenConfig planHubScreenConfig = (PlanHubScreenConfig) obj2;
        return Intrinsics.f(this.f102661a, planHubScreenConfig.f102661a) && this.f102662b.equals(planHubScreenConfig.f102662b) && Intrinsics.f(this.f102663c, planHubScreenConfig.f102663c) && Intrinsics.f(this.d, planHubScreenConfig.d) && Intrinsics.f(this.e, planHubScreenConfig.e) && this.f.equals(planHubScreenConfig.f);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f102662b, this.f102661a.hashCode() * 31, 31);
        PlanHubProductOnboarding planHubProductOnboarding = this.f102663c;
        int iHashCode = (iB + (planHubProductOnboarding == null ? 0 : planHubProductOnboarding.hashCode())) * 31;
        PlanHubProductArticle planHubProductArticle = this.d;
        return this.f.hashCode() + p.a.c((iHashCode + (planHubProductArticle != null ? planHubProductArticle.hashCode() : 0)) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f102661a, i);
        Iterator itY = j6.a.y(this.f102662b, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        PlanHubProductOnboarding planHubProductOnboarding = this.f102663c;
        if (planHubProductOnboarding == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            planHubProductOnboarding.writeToParcel(dest, i);
        }
        PlanHubProductArticle planHubProductArticle = this.d;
        if (planHubProductArticle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            planHubProductArticle.writeToParcel(dest, i);
        }
        dest.writeString(this.e);
        Iterator itY2 = j6.a.y(this.f, dest);
        while (itY2.hasNext()) {
            ((PlanHubModal) itY2.next()).writeToParcel(dest, i);
        }
    }
}
