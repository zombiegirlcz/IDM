package com.revolut.feature.credit.card.api.models.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tl4.c;
import tl4.d;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardCellModel;", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardModel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Accessory", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardCellModel implements CreditCardModel, Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardCellModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Accessory f68830c;
    public final CreditCardDialogModel d;
    public final Integer e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f68831g;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardCellModel$Accessory;", "Landroid/os/Parcelable;", "LabelsAccessory", "ActionAccessory", "IconWithLabelAccessory", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardCellModel$Accessory$ActionAccessory;", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardCellModel$Accessory$IconWithLabelAccessory;", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardCellModel$Accessory$LabelsAccessory;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Accessory extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardCellModel$Accessory$ActionAccessory;", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardCellModel$Accessory;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ActionAccessory implements Accessory {

            @NotNull
            public static final Parcelable.Creator<ActionAccessory> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f68832a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final d f68833b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final CreditCardModelAction f68834c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ActionAccessory(parcel.readString(), parcel.readInt() == 0 ? null : d.valueOf(parcel.readString()), (CreditCardModelAction) parcel.readParcelable(ActionAccessory.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ActionAccessory[i];
                }
            }

            public ActionAccessory(String value, d dVar, CreditCardModelAction action) {
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(action, "action");
                this.f68832a = value;
                this.f68833b = dVar;
                this.f68834c = action;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ActionAccessory)) {
                    return false;
                }
                ActionAccessory actionAccessory = (ActionAccessory) obj2;
                return Intrinsics.f(this.f68832a, actionAccessory.f68832a) && this.f68833b == actionAccessory.f68833b && Intrinsics.f(this.f68834c, actionAccessory.f68834c);
            }

            public final int hashCode() {
                int iHashCode = this.f68832a.hashCode() * 31;
                d dVar = this.f68833b;
                return this.f68834c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f68832a);
                d dVar = this.f68833b;
                if (dVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(dVar.name());
                }
                dest.writeParcelable(this.f68834c, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardCellModel$Accessory$IconWithLabelAccessory;", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardCellModel$Accessory;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class IconWithLabelAccessory implements Accessory {

            @NotNull
            public static final Parcelable.Creator<IconWithLabelAccessory> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f68835a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final c f68836b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final CreditCardModelTextStyle f68837c;
            public final d d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new IconWithLabelAccessory(parcel.readString(), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CreditCardModelTextStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? d.valueOf(parcel.readString()) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new IconWithLabelAccessory[i];
                }
            }

            public IconWithLabelAccessory(String text, c cVar, CreditCardModelTextStyle creditCardModelTextStyle, d dVar) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.f68835a = text;
                this.f68836b = cVar;
                this.f68837c = creditCardModelTextStyle;
                this.d = dVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof IconWithLabelAccessory)) {
                    return false;
                }
                IconWithLabelAccessory iconWithLabelAccessory = (IconWithLabelAccessory) obj2;
                return Intrinsics.f(this.f68835a, iconWithLabelAccessory.f68835a) && this.f68836b == iconWithLabelAccessory.f68836b && Intrinsics.f(this.f68837c, iconWithLabelAccessory.f68837c) && this.d == iconWithLabelAccessory.d;
            }

            public final int hashCode() {
                int iHashCode = this.f68835a.hashCode() * 31;
                c cVar = this.f68836b;
                int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
                CreditCardModelTextStyle creditCardModelTextStyle = this.f68837c;
                int iHashCode3 = (iHashCode2 + (creditCardModelTextStyle == null ? 0 : creditCardModelTextStyle.hashCode())) * 31;
                d dVar = this.d;
                return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f68835a);
                c cVar = this.f68836b;
                if (cVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(cVar.name());
                }
                CreditCardModelTextStyle creditCardModelTextStyle = this.f68837c;
                if (creditCardModelTextStyle == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    creditCardModelTextStyle.writeToParcel(dest, i);
                }
                d dVar = this.d;
                if (dVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(dVar.name());
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardCellModel$Accessory$LabelsAccessory;", "Lcom/revolut/feature/credit/card/api/models/presentation/CreditCardCellModel$Accessory;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LabelsAccessory implements Accessory {

            @NotNull
            public static final Parcelable.Creator<LabelsAccessory> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f68838a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CreditCardModelTextStyle f68839b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f68840c;
            public final CreditCardModelTextStyle d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    Parcelable.Creator<CreditCardModelTextStyle> creator = CreditCardModelTextStyle.CREATOR;
                    return new LabelsAccessory(string, creator.createFromParcel(parcel), parcel.readString(), creator.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new LabelsAccessory[i];
                }
            }

            public LabelsAccessory(String topValue, CreditCardModelTextStyle topValueStyle, String str, CreditCardModelTextStyle bottomValueStyle) {
                Intrinsics.checkNotNullParameter(topValue, "topValue");
                Intrinsics.checkNotNullParameter(topValueStyle, "topValueStyle");
                Intrinsics.checkNotNullParameter(bottomValueStyle, "bottomValueStyle");
                this.f68838a = topValue;
                this.f68839b = topValueStyle;
                this.f68840c = str;
                this.d = bottomValueStyle;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof LabelsAccessory)) {
                    return false;
                }
                LabelsAccessory labelsAccessory = (LabelsAccessory) obj2;
                return Intrinsics.f(this.f68838a, labelsAccessory.f68838a) && Intrinsics.f(this.f68839b, labelsAccessory.f68839b) && Intrinsics.f(this.f68840c, labelsAccessory.f68840c) && Intrinsics.f(this.d, labelsAccessory.d);
            }

            public final int hashCode() {
                int iHashCode = (this.f68839b.hashCode() + (this.f68838a.hashCode() * 31)) * 31;
                String str = this.f68840c;
                return this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f68838a);
                this.f68839b.writeToParcel(dest, i);
                dest.writeString(this.f68840c);
                this.d.writeToParcel(dest, i);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Accessory accessory = (Accessory) parcel.readParcelable(CreditCardCellModel.class.getClassLoader());
            ArrayList arrayList = null;
            CreditCardDialogModel creditCardDialogModelCreateFromParcel = parcel.readInt() == 0 ? null : CreditCardDialogModel.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(CreditCardCellModel.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new CreditCardCellModel(string, string2, accessory, creditCardDialogModelCreateFromParcel, numValueOf, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardCellModel[i];
        }
    }

    public CreditCardCellModel(String str, String label, Accessory accessory, CreditCardDialogModel creditCardDialogModel, Integer num, List list, boolean z) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        this.f68828a = str;
        this.f68829b = label;
        this.f68830c = accessory;
        this.d = creditCardDialogModel;
        this.e = num;
        this.f = list;
        this.f68831g = z;
    }

    public static CreditCardCellModel a(CreditCardCellModel creditCardCellModel, List list, boolean z, int i) {
        String str = creditCardCellModel.f68828a;
        String label = creditCardCellModel.f68829b;
        Accessory accessory = creditCardCellModel.f68830c;
        CreditCardDialogModel creditCardDialogModel = creditCardCellModel.d;
        Integer num = creditCardCellModel.e;
        if ((i & 32) != 0) {
            list = creditCardCellModel.f;
        }
        List list2 = list;
        if ((i & 64) != 0) {
            z = creditCardCellModel.f68831g;
        }
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        return new CreditCardCellModel(str, label, accessory, creditCardDialogModel, num, list2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardCellModel)) {
            return false;
        }
        CreditCardCellModel creditCardCellModel = (CreditCardCellModel) obj2;
        return Intrinsics.f(this.f68828a, creditCardCellModel.f68828a) && Intrinsics.f(this.f68829b, creditCardCellModel.f68829b) && Intrinsics.f(this.f68830c, creditCardCellModel.f68830c) && Intrinsics.f(this.d, creditCardCellModel.d) && Intrinsics.f(this.e, creditCardCellModel.e) && Intrinsics.f(this.f, creditCardCellModel.f) && this.f68831g == creditCardCellModel.f68831g;
    }

    public final int hashCode() {
        String str = this.f68828a;
        int iHashCode = (this.f68830c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f68829b)) * 31;
        CreditCardDialogModel creditCardDialogModel = this.d;
        int iHashCode2 = (iHashCode + (creditCardDialogModel == null ? 0 : creditCardDialogModel.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f;
        return Boolean.hashCode(this.f68831g) + ((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68828a);
        dest.writeString(this.f68829b);
        dest.writeParcelable(this.f68830c, i);
        CreditCardDialogModel creditCardDialogModel = this.d;
        if (creditCardDialogModel == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditCardDialogModel.writeToParcel(dest, i);
        }
        Integer num = this.e;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        List list = this.f;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((CreditCardCellModel) itQ.next()).writeToParcel(dest, i);
            }
        }
        dest.writeInt(this.f68831g ? 1 : 0);
    }
}
