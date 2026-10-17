package com.revolut.retail.feature.plan_gifting.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/api/model/PlanGiftingHyperText;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "HyperTextDescriptor", "HyperTextAction", "feature_retail_plan_gifting_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanGiftingHyperText implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlanGiftingHyperText> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f102436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f102437c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/api/model/PlanGiftingHyperText$HyperTextAction;", "Landroid/os/Parcelable;", "<init>", "()V", "UrlAction", "BenefitsFullList", "SeeAllDocuments", "Lcom/revolut/retail/feature/plan_gifting/api/model/PlanGiftingHyperText$HyperTextAction$BenefitsFullList;", "Lcom/revolut/retail/feature/plan_gifting/api/model/PlanGiftingHyperText$HyperTextAction$SeeAllDocuments;", "Lcom/revolut/retail/feature/plan_gifting/api/model/PlanGiftingHyperText$HyperTextAction$UrlAction;", "feature_retail_plan_gifting_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class HyperTextAction implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/api/model/PlanGiftingHyperText$HyperTextAction$BenefitsFullList;", "Lcom/revolut/retail/feature/plan_gifting/api/model/PlanGiftingHyperText$HyperTextAction;", "<init>", "()V", "feature_retail_plan_gifting_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class BenefitsFullList extends HyperTextAction {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final BenefitsFullList f102438a = new BenefitsFullList();

            @NotNull
            public static final Parcelable.Creator<BenefitsFullList> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return BenefitsFullList.f102438a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new BenefitsFullList[i];
                }
            }

            private BenefitsFullList() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/api/model/PlanGiftingHyperText$HyperTextAction$SeeAllDocuments;", "Lcom/revolut/retail/feature/plan_gifting/api/model/PlanGiftingHyperText$HyperTextAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_gifting_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SeeAllDocuments extends HyperTextAction {

            @NotNull
            public static final Parcelable.Creator<SeeAllDocuments> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f102439a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(SeeAllDocuments.class, parcel, arrayList, iE, 1);
                    }
                    return new SeeAllDocuments(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SeeAllDocuments[i];
                }
            }

            public SeeAllDocuments(List documents) {
                Intrinsics.checkNotNullParameter(documents, "documents");
                this.f102439a = documents;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof SeeAllDocuments) && Intrinsics.f(this.f102439a, ((SeeAllDocuments) obj2).f102439a);
            }

            public final int hashCode() {
                return this.f102439a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = p.a.v(this.f102439a, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/api/model/PlanGiftingHyperText$HyperTextAction$UrlAction;", "Lcom/revolut/retail/feature/plan_gifting/api/model/PlanGiftingHyperText$HyperTextAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_gifting_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UrlAction extends HyperTextAction {

            @NotNull
            public static final Parcelable.Creator<UrlAction> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f102440a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new UrlAction(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new UrlAction[i];
                }
            }

            public UrlAction(String url2) {
                Intrinsics.checkNotNullParameter(url2, "url");
                this.f102440a = url2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof UrlAction) && Intrinsics.f(this.f102440a, ((UrlAction) obj2).f102440a);
            }

            public final int hashCode() {
                return this.f102440a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f102440a);
            }
        }

        private HyperTextAction() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/api/model/PlanGiftingHyperText$HyperTextDescriptor;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_gifting_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HyperTextDescriptor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<HyperTextDescriptor> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HyperTextAction f102442b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HyperTextDescriptor(parcel.readString(), (HyperTextAction) parcel.readParcelable(HyperTextDescriptor.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HyperTextDescriptor[i];
            }
        }

        public HyperTextDescriptor(String text, HyperTextAction action) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f102441a = text;
            this.f102442b = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof HyperTextDescriptor)) {
                return false;
            }
            HyperTextDescriptor hyperTextDescriptor = (HyperTextDescriptor) obj2;
            return Intrinsics.f(this.f102441a, hyperTextDescriptor.f102441a) && Intrinsics.f(this.f102442b, hyperTextDescriptor.f102442b);
        }

        public final int hashCode() {
            return this.f102442b.hashCode() + (this.f102441a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102441a);
            dest.writeParcelable(this.f102442b, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            int iE = 0;
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(HyperTextDescriptor.CREATOR, parcel, arrayList2, iA, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(PlanGiftingHyperText.class, parcel, arrayList3, iE, 1);
                }
                arrayList = arrayList3;
            }
            return new PlanGiftingHyperText(arrayList2, arrayList, string);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanGiftingHyperText[i];
        }
    }

    public PlanGiftingHyperText(ArrayList descriptors, ArrayList arrayList, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        this.f102435a = text;
        this.f102436b = descriptors;
        this.f102437c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanGiftingHyperText)) {
            return false;
        }
        PlanGiftingHyperText planGiftingHyperText = (PlanGiftingHyperText) obj2;
        return Intrinsics.f(this.f102435a, planGiftingHyperText.f102435a) && this.f102436b.equals(planGiftingHyperText.f102436b) && Intrinsics.f(this.f102437c, planGiftingHyperText.f102437c);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f102436b, this.f102435a.hashCode() * 31, 31);
        List list = this.f102437c;
        return iB + (list == null ? 0 : list.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102435a);
        Iterator itY = j6.a.y(this.f102436b, dest);
        while (itY.hasNext()) {
            ((HyperTextDescriptor) itY.next()).writeToParcel(dest, i);
        }
        List list = this.f102437c;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            dest.writeParcelable((Parcelable) itQ.next(), i);
        }
    }
}
