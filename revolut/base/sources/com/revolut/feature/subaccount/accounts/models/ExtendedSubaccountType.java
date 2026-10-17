package com.revolut.feature.subaccount.accounts.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import f2i.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import rlm.g;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType;", "Lcom/revolut/feature/tab/accounts/models/ProductAccountId$Payload;", "Companion", "Personal", "Group", "Junior", "Teen", "PlanCashback", "RevPoints", "Pro", "ProTax", "Joint", "Collateral", "a", "Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType$Collateral;", "Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType$Group;", "Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType$Joint;", "Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType$Junior;", "Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType$Personal;", "Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType$PlanCashback;", "Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType$Pro;", "Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType$ProTax;", "Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType$RevPoints;", "Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType$Teen;", "feature_subaccount_product_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g(discriminator = "subaccountType")
@mlm.g
public abstract class ExtendedSubaccountType implements ProductAccountId.Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f88914b = j.c(k.PUBLICATION, new b(9));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88915a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType$Collateral;", "Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_subaccount_product_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class Collateral extends ExtendedSubaccountType {

        @NotNull
        public static final Collateral INSTANCE = new Collateral();

        @NotNull
        public static final Parcelable.Creator<Collateral> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Object f88916c = j.c(k.PUBLICATION, new b(10));

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Collateral.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Collateral[i];
            }
        }

        private Collateral() {
            super("CollateralSubaccountType");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f88916c.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType$Group;", "Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_subaccount_product_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class Group extends ExtendedSubaccountType {

        @NotNull
        public static final Group INSTANCE = new Group();

        @NotNull
        public static final Parcelable.Creator<Group> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Object f88917c = j.c(k.PUBLICATION, new b(11));

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Group.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Group[i];
            }
        }

        private Group() {
            super("GroupSubaccountType");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f88917c.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType$Joint;", "Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_subaccount_product_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class Joint extends ExtendedSubaccountType {

        @NotNull
        public static final Joint INSTANCE = new Joint();

        @NotNull
        public static final Parcelable.Creator<Joint> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Object f88918c = j.c(k.PUBLICATION, new b(12));

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Joint.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Joint[i];
            }
        }

        private Joint() {
            super("JointSubaccountType");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f88918c.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType$Junior;", "Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_subaccount_product_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class Junior extends ExtendedSubaccountType {

        @NotNull
        public static final Junior INSTANCE = new Junior();

        @NotNull
        public static final Parcelable.Creator<Junior> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Object f88919c = j.c(k.PUBLICATION, new b(13));

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Junior.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Junior[i];
            }
        }

        private Junior() {
            super("JuniorSubaccountType");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f88919c.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType$Personal;", "Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_subaccount_product_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class Personal extends ExtendedSubaccountType {

        @NotNull
        public static final Personal INSTANCE = new Personal();

        @NotNull
        public static final Parcelable.Creator<Personal> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Object f88920c = j.c(k.PUBLICATION, new b(14));

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Personal.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Personal[i];
            }
        }

        private Personal() {
            super("PersonalSubaccountType");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f88920c.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType$PlanCashback;", "Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_subaccount_product_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class PlanCashback extends ExtendedSubaccountType {

        @NotNull
        public static final PlanCashback INSTANCE = new PlanCashback();

        @NotNull
        public static final Parcelable.Creator<PlanCashback> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Object f88921c = j.c(k.PUBLICATION, new b(15));

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PlanCashback.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanCashback[i];
            }
        }

        private PlanCashback() {
            super("CashbackSubaccountType");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f88921c.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType$Pro;", "Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_subaccount_product_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class Pro extends ExtendedSubaccountType {

        @NotNull
        public static final Pro INSTANCE = new Pro();

        @NotNull
        public static final Parcelable.Creator<Pro> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Object f88922c = j.c(k.PUBLICATION, new b(16));

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Pro.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pro[i];
            }
        }

        private Pro() {
            super("ProSubaccountType");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f88922c.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType$ProTax;", "Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_subaccount_product_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class ProTax extends ExtendedSubaccountType {

        @NotNull
        public static final ProTax INSTANCE = new ProTax();

        @NotNull
        public static final Parcelable.Creator<ProTax> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Object f88923c = j.c(k.PUBLICATION, new b(17));

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProTax.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProTax[i];
            }
        }

        private ProTax() {
            super("ProTaxSubaccountType");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f88923c.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType$RevPoints;", "Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_subaccount_product_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class RevPoints extends ExtendedSubaccountType {

        @NotNull
        public static final RevPoints INSTANCE = new RevPoints();

        @NotNull
        public static final Parcelable.Creator<RevPoints> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Object f88924c = j.c(k.PUBLICATION, new b(18));

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPoints.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPoints[i];
            }
        }

        private RevPoints() {
            super("RevPointsSubaccountType");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f88924c.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType$Teen;", "Lcom/revolut/feature/subaccount/accounts/models/ExtendedSubaccountType;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_subaccount_product_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class Teen extends ExtendedSubaccountType {

        @NotNull
        public static final Teen INSTANCE = new Teen();

        @NotNull
        public static final Parcelable.Creator<Teen> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Object f88925c = j.c(k.PUBLICATION, new b(19));

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Teen.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Teen[i];
            }
        }

        private Teen() {
            super("TeenSubaccountType");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f88925c.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) ExtendedSubaccountType.f88914b.getValue();
        }
    }

    public ExtendedSubaccountType(String str) {
        this.f88915a = str;
    }
}
