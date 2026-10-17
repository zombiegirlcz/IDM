package com.revolut.feature.card_design.impl.card_design;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.card_design.api.model.SkipConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import e93.e;
import h30.l;
import h93.j0;
import h93.l0;
import hx2.m;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.h;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"com/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Catalogue", "Carousel", "SkipConfirmationDialog", "CardVideoPreview", "UserLegalAgreement", "RevPointsAccountDialog", "Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$Step$CardVideoPreview;", "Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$Step$Carousel;", "Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$Step$Catalogue;", "Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$Step$RevPointsAccountDialog;", "Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$Step$SkipConfirmationDialog;", "Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$Step$UserLegalAgreement;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardDesignFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$Step$CardVideoPreview;", "Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardVideoPreview extends CardDesignFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardVideoPreview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64640a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardVideoPreview(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardVideoPreview[i];
            }
        }

        public CardVideoPreview(String videoUrl) {
            Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
            this.f64640a = videoUrl;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CardVideoPreview) && Intrinsics.f(this.f64640a, ((CardVideoPreview) obj2).f64640a);
        }

        public final int hashCode() {
            return this.f64640a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64640a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$Step$RevPointsAccountDialog;", "Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$Step;", "<init>", "()V", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsAccountDialog extends CardDesignFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPointsAccountDialog f64665a = new RevPointsAccountDialog();

        @NotNull
        public static final Parcelable.Creator<RevPointsAccountDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsAccountDialog.f64665a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsAccountDialog[i];
            }
        }

        private RevPointsAccountDialog() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$Step$SkipConfirmationDialog;", "Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SkipConfirmationDialog extends CardDesignFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SkipConfirmationDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SkipConfig f64666a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SkipConfirmationDialog((SkipConfig) parcel.readParcelable(SkipConfirmationDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SkipConfirmationDialog[i];
            }
        }

        public SkipConfirmationDialog(SkipConfig skipConfig) {
            Intrinsics.checkNotNullParameter(skipConfig, "skipConfig");
            this.f64666a = skipConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SkipConfirmationDialog) && Intrinsics.f(this.f64666a, ((SkipConfirmationDialog) obj2).f64666a);
        }

        public final int hashCode() {
            return this.f64666a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f64666a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$Step$UserLegalAgreement;", "Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UserLegalAgreement extends CardDesignFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UserLegalAgreement> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f64667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f64668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c93.e f64669c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UserLegalAgreement((wi0.b) parcel.readSerializable(), (e) parcel.readSerializable(), c93.e.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UserLegalAgreement[i];
            }
        }

        public UserLegalAgreement(wi0.b userCountryCode, e cardDesign, c93.e cardType) {
            Intrinsics.checkNotNullParameter(userCountryCode, "userCountryCode");
            Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
            Intrinsics.checkNotNullParameter(cardType, "cardType");
            this.f64667a = userCountryCode;
            this.f64668b = cardDesign;
            this.f64669c = cardType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UserLegalAgreement)) {
                return false;
            }
            UserLegalAgreement userLegalAgreement = (UserLegalAgreement) obj2;
            return Intrinsics.f(this.f64667a, userLegalAgreement.f64667a) && Intrinsics.f(this.f64668b, userLegalAgreement.f64668b) && this.f64669c == userLegalAgreement.f64669c;
        }

        public final int hashCode() {
            return this.f64669c.hashCode() + ((this.f64668b.hashCode() + (this.f64667a.f297794a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f64667a);
            dest.writeSerializable(this.f64668b);
            dest.writeString(this.f64669c.name());
        }
    }

    private CardDesignFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$Step$Catalogue;", "Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Catalogue extends CardDesignFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Catalogue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f64654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c93.e f64655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j0 f64656c;
        public final l0 d;
        public final String e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final e93.b f64657g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final j0 f64658h;
        public final l0 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f64659j;
        public final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final m f64660l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Set f64661m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f64662n;
        public final boolean o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f64663p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final e93.b f64664q;

        public static final class a implements Parcelable.Creator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                e93.b bVar;
                j0 j0Var;
                boolean z4;
                LinkedHashSet linkedHashSet;
                l0 l0Var;
                boolean z6;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                h hVar = (h) parcel.readSerializable();
                c93.e eVarValueOf = c93.e.valueOf(parcel.readString());
                j0 j0VarValueOf = j0.valueOf(parcel.readString());
                l0 l0VarValueOf = l0.valueOf(parcel.readString());
                String string = parcel.readString();
                boolean z11 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z11 = true;
                } else {
                    z = false;
                }
                e93.b bVarValueOf = parcel.readInt() == 0 ? null : e93.b.valueOf(parcel.readString());
                j0 j0VarValueOf2 = parcel.readInt() == 0 ? null : j0.valueOf(parcel.readString());
                l0 l0VarValueOf2 = parcel.readInt() == 0 ? null : l0.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    z3 = true;
                    bVar = bVarValueOf;
                    j0Var = j0VarValueOf2;
                    z4 = true;
                } else {
                    z3 = true;
                    bVar = bVarValueOf;
                    j0Var = j0VarValueOf2;
                    z4 = z;
                }
                if (parcel.readInt() != 0) {
                    linkedHashSet = null;
                    l0Var = l0VarValueOf2;
                    z6 = z3;
                } else {
                    linkedHashSet = null;
                    l0Var = l0VarValueOf2;
                    z6 = z;
                }
                Object objValueOf = parcel.readInt() == 0 ? linkedHashSet : m.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
                    int i2 = 0;
                    while (i2 != i) {
                        linkedHashSet2.add(c93.e.valueOf(parcel.readString()));
                        i2++;
                        i = i;
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new Catalogue(hVar, eVarValueOf, j0VarValueOf, l0VarValueOf, string, z11, bVar, j0Var, l0Var, z4, z6, objValueOf, linkedHashSet, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : e93.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Catalogue[i];
            }
        }

        public Catalogue(h hVar, c93.e cardType, j0 productType, l0 subProductType, String str, boolean z, e93.b bVar, j0 j0Var, l0 l0Var, boolean z3, boolean z4, m mVar, Set set, boolean z6, boolean z11, boolean z12, e93.b bVar2) {
            Intrinsics.checkNotNullParameter(cardType, "cardType");
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(subProductType, "subProductType");
            this.f64654a = hVar;
            this.f64655b = cardType;
            this.f64656c = productType;
            this.d = subProductType;
            this.e = str;
            this.f = z;
            this.f64657g = bVar;
            this.f64658h = j0Var;
            this.i = l0Var;
            this.f64659j = z3;
            this.k = z4;
            this.f64660l = mVar;
            this.f64661m = set;
            this.f64662n = z6;
            this.o = z11;
            this.f64663p = z12;
            this.f64664q = bVar2;
        }

        public static Catalogue a(Catalogue catalogue, c93.e cardType) {
            h hVar = catalogue.f64654a;
            j0 productType = catalogue.f64656c;
            l0 subProductType = catalogue.d;
            String str = catalogue.e;
            boolean z = catalogue.f;
            e93.b bVar = catalogue.f64657g;
            j0 j0Var = catalogue.f64658h;
            l0 l0Var = catalogue.i;
            boolean z3 = catalogue.f64659j;
            boolean z4 = catalogue.k;
            m mVar = catalogue.f64660l;
            Set set = catalogue.f64661m;
            boolean z6 = catalogue.f64662n;
            boolean z11 = catalogue.o;
            boolean z12 = catalogue.f64663p;
            e93.b bVar2 = catalogue.f64664q;
            catalogue.getClass();
            Intrinsics.checkNotNullParameter(cardType, "cardType");
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(subProductType, "subProductType");
            return new Catalogue(hVar, cardType, productType, subProductType, str, z, bVar, j0Var, l0Var, z3, z4, mVar, set, z6, z11, z12, bVar2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Catalogue)) {
                return false;
            }
            Catalogue catalogue = (Catalogue) obj2;
            return Intrinsics.f(this.f64654a, catalogue.f64654a) && this.f64655b == catalogue.f64655b && this.f64656c == catalogue.f64656c && this.d == catalogue.d && Intrinsics.f(this.e, catalogue.e) && this.f == catalogue.f && this.f64657g == catalogue.f64657g && this.f64658h == catalogue.f64658h && this.i == catalogue.i && this.f64659j == catalogue.f64659j && this.k == catalogue.k && this.f64660l == catalogue.f64660l && Intrinsics.f(this.f64661m, catalogue.f64661m) && this.f64662n == catalogue.f64662n && this.o == catalogue.o && this.f64663p == catalogue.f64663p && this.f64664q == catalogue.f64664q;
        }

        public final int hashCode() {
            h hVar = this.f64654a;
            int iHashCode = (this.d.hashCode() + ((this.f64656c.hashCode() + ((this.f64655b.hashCode() + ((hVar == null ? 0 : hVar.hashCode()) * 31)) * 31)) * 31)) * 31;
            String str = this.e;
            int iC = j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
            e93.b bVar = this.f64657g;
            int iHashCode2 = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
            j0 j0Var = this.f64658h;
            int iHashCode3 = (iHashCode2 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
            l0 l0Var = this.i;
            int iC2 = j6.a.c(j6.a.c((iHashCode3 + (l0Var == null ? 0 : l0Var.hashCode())) * 31, 31, this.f64659j), 31, this.k);
            m mVar = this.f64660l;
            int iHashCode4 = (iC2 + (mVar == null ? 0 : mVar.hashCode())) * 31;
            Set set = this.f64661m;
            int iC3 = j6.a.c(j6.a.c(j6.a.c((iHashCode4 + (set == null ? 0 : set.hashCode())) * 31, 31, this.f64662n), 31, this.o), 31, this.f64663p);
            e93.b bVar2 = this.f64664q;
            return iC3 + (bVar2 != null ? bVar2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f64654a);
            dest.writeString(this.f64655b.name());
            dest.writeString(this.f64656c.name());
            dest.writeString(this.d.name());
            dest.writeString(this.e);
            dest.writeInt(this.f ? 1 : 0);
            e93.b bVar = this.f64657g;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            j0 j0Var = this.f64658h;
            if (j0Var == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(j0Var.name());
            }
            l0 l0Var = this.i;
            if (l0Var == null) {
                dest.writeInt(0);
            } else {
                l.B(dest, 1, l0Var);
            }
            dest.writeInt(this.f64659j ? 1 : 0);
            dest.writeInt(this.k ? 1 : 0);
            m mVar = this.f64660l;
            if (mVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(mVar.name());
            }
            Set set = this.f64661m;
            if (set == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = kii.e.q(dest, 1, set);
                while (itQ.hasNext()) {
                    dest.writeString(((c93.e) itQ.next()).name());
                }
            }
            dest.writeInt(this.f64662n ? 1 : 0);
            dest.writeInt(this.o ? 1 : 0);
            dest.writeInt(this.f64663p ? 1 : 0);
            e93.b bVar2 = this.f64664q;
            if (bVar2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar2.name());
            }
        }

        public /* synthetic */ Catalogue(h hVar, c93.e eVar, j0 j0Var, l0 l0Var, String str, e93.b bVar, j0 j0Var2, l0 l0Var2, boolean z, boolean z3, e93.b bVar2) {
            this(hVar, eVar, j0Var, l0Var, str, true, bVar, j0Var2, l0Var2, z, z3, null, null, false, false, false, bVar2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$Step$Carousel;", "Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Carousel extends CardDesignFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Carousel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f64641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c93.e f64642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j0 f64643c;
        public final l0 d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f64644g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f64645h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final e93.b f64646j;
        public final j0 k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final l0 f64647l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f64648m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f64649n;
        public final boolean o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f64650p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f64651q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f64652r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final e93.b f64653s;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                boolean z4;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                h hVar = (h) parcel.readSerializable();
                c93.e eVarValueOf = c93.e.valueOf(parcel.readString());
                j0 j0VarValueOf = j0.valueOf(parcel.readString());
                l0 l0VarValueOf = l0.valueOf(parcel.readString());
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                e93.b bVarValueOf = parcel.readInt() == 0 ? null : e93.b.valueOf(parcel.readString());
                j0 j0VarValueOf2 = parcel.readInt() == 0 ? null : j0.valueOf(parcel.readString());
                l0 l0VarValueOf2 = parcel.readInt() == 0 ? null : l0.valueOf(parcel.readString());
                String string6 = parcel.readString();
                boolean z6 = false;
                boolean z11 = true;
                boolean z12 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z11 = z;
                }
                if (parcel.readInt() != 0) {
                    z4 = z;
                    z = z3;
                } else {
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z4;
                }
                return new Carousel(hVar, eVarValueOf, j0VarValueOf, l0VarValueOf, string, string2, string3, string4, string5, bVarValueOf, j0VarValueOf2, l0VarValueOf2, string6, z12, z6, z11, z, z3, parcel.readInt() != 0 ? e93.b.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Carousel[i];
            }
        }

        public Carousel(h hVar, c93.e cardType, j0 productType, l0 subProductType, String str, String str2, String str3, String str4, String str5, e93.b bVar, j0 j0Var, l0 l0Var, String str6, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, e93.b bVar2) {
            Intrinsics.checkNotNullParameter(cardType, "cardType");
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(subProductType, "subProductType");
            this.f64641a = hVar;
            this.f64642b = cardType;
            this.f64643c = productType;
            this.d = subProductType;
            this.e = str;
            this.f = str2;
            this.f64644g = str3;
            this.f64645h = str4;
            this.i = str5;
            this.f64646j = bVar;
            this.k = j0Var;
            this.f64647l = l0Var;
            this.f64648m = str6;
            this.f64649n = z;
            this.o = z3;
            this.f64650p = z4;
            this.f64651q = z6;
            this.f64652r = z11;
            this.f64653s = bVar2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Carousel)) {
                return false;
            }
            Carousel carousel = (Carousel) obj2;
            return Intrinsics.f(this.f64641a, carousel.f64641a) && this.f64642b == carousel.f64642b && this.f64643c == carousel.f64643c && this.d == carousel.d && Intrinsics.f(this.e, carousel.e) && Intrinsics.f(this.f, carousel.f) && Intrinsics.f(this.f64644g, carousel.f64644g) && Intrinsics.f(this.f64645h, carousel.f64645h) && Intrinsics.f(this.i, carousel.i) && this.f64646j == carousel.f64646j && this.k == carousel.k && this.f64647l == carousel.f64647l && Intrinsics.f(this.f64648m, carousel.f64648m) && this.f64649n == carousel.f64649n && this.o == carousel.o && this.f64650p == carousel.f64650p && this.f64651q == carousel.f64651q && this.f64652r == carousel.f64652r && this.f64653s == carousel.f64653s;
        }

        public final int hashCode() {
            h hVar = this.f64641a;
            int iHashCode = (this.d.hashCode() + ((this.f64643c.hashCode() + ((this.f64642b.hashCode() + ((hVar == null ? 0 : hVar.hashCode()) * 31)) * 31)) * 31)) * 31;
            String str = this.e;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f64644g;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f64645h;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.i;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            e93.b bVar = this.f64646j;
            int iHashCode7 = (iHashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            j0 j0Var = this.k;
            int iHashCode8 = (iHashCode7 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
            l0 l0Var = this.f64647l;
            int iHashCode9 = (iHashCode8 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
            String str6 = this.f64648m;
            int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c((iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.f64649n), 31, this.o), 31, this.f64650p), 31, this.f64651q), 31, this.f64652r);
            e93.b bVar2 = this.f64653s;
            return iC + (bVar2 != null ? bVar2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f64641a);
            dest.writeString(this.f64642b.name());
            dest.writeString(this.f64643c.name());
            dest.writeString(this.d.name());
            dest.writeString(this.e);
            dest.writeString(this.f);
            dest.writeString(this.f64644g);
            dest.writeString(this.f64645h);
            dest.writeString(this.i);
            e93.b bVar = this.f64646j;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            j0 j0Var = this.k;
            if (j0Var == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(j0Var.name());
            }
            l0 l0Var = this.f64647l;
            if (l0Var == null) {
                dest.writeInt(0);
            } else {
                l.B(dest, 1, l0Var);
            }
            dest.writeString(this.f64648m);
            dest.writeInt(this.f64649n ? 1 : 0);
            dest.writeInt(this.o ? 1 : 0);
            dest.writeInt(this.f64650p ? 1 : 0);
            dest.writeInt(this.f64651q ? 1 : 0);
            dest.writeInt(this.f64652r ? 1 : 0);
            e93.b bVar2 = this.f64653s;
            if (bVar2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar2.name());
            }
        }

        public /* synthetic */ Carousel(h hVar, c93.e eVar, j0 j0Var, l0 l0Var, String str, String str2, String str3, String str4, String str5, e93.b bVar, j0 j0Var2, l0 l0Var2, String str6, boolean z, boolean z3, boolean z4, boolean z6, e93.b bVar2, int i) {
            this(hVar, eVar, j0Var, l0Var, str, str2, str3, str4, str5, bVar, j0Var2, l0Var2, str6, z, z3, (i & 32768) != 0 ? false : z4, (i & 65536) != 0 ? false : z6, false, bVar2);
        }
    }
}
