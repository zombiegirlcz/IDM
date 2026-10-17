package com.revolut.feature.subaccount.impl.ui.create.flow.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CurrencySelectionMode;
import com.revolut.kompot.navigable.flow.FlowStep;
import h30.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"com/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ChooseCurrency", "ChooseCurrencyType", "ChooseNewTypeScreen", "InfoPickerScreen", "ContactsSelectorScreen", "ProductArticle", "TaxPocketScreen", "PendingJointAccount", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step$ChooseCurrency;", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step$ChooseCurrencyType;", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step$ChooseNewTypeScreen;", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step$ContactsSelectorScreen;", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step$InfoPickerScreen;", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step$PendingJointAccount;", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step$TaxPocketScreen;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreateSubaccountFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step$ChooseCurrency;", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChooseCurrency extends CreateSubaccountFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ChooseCurrency> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f89020a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    int iC = 0;
                    while (iC != i) {
                        iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
                    }
                    arrayList = arrayList2;
                }
                return new ChooseCurrency(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChooseCurrency[i];
            }
        }

        public ChooseCurrency(List list) {
            this.f89020a = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChooseCurrency) && Intrinsics.f(this.f89020a, ((ChooseCurrency) obj2).f89020a);
        }

        public final int hashCode() {
            List list = this.f89020a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List list = this.f89020a;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeSerializable((Serializable) itQ.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step$ChooseCurrencyType;", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChooseCurrencyType extends CreateSubaccountFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChooseCurrencyType f89021a = new ChooseCurrencyType();

        @NotNull
        public static final Parcelable.Creator<ChooseCurrencyType> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChooseCurrencyType.f89021a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChooseCurrencyType[i];
            }
        }

        private ChooseCurrencyType() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof ChooseCurrencyType);
        }

        public final int hashCode() {
            return 956101677;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step$ChooseNewTypeScreen;", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step;", "<init>", "()V", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChooseNewTypeScreen extends CreateSubaccountFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChooseNewTypeScreen f89022a = new ChooseNewTypeScreen();

        @NotNull
        public static final Parcelable.Creator<ChooseNewTypeScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChooseNewTypeScreen.f89022a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChooseNewTypeScreen[i];
            }
        }

        private ChooseNewTypeScreen() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step$ContactsSelectorScreen;", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step;", "<init>", "()V", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ContactsSelectorScreen extends CreateSubaccountFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ContactsSelectorScreen f89023a = new ContactsSelectorScreen();

        @NotNull
        public static final Parcelable.Creator<ContactsSelectorScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ContactsSelectorScreen.f89023a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContactsSelectorScreen[i];
            }
        }

        private ContactsSelectorScreen() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step$InfoPickerScreen;", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InfoPickerScreen extends CreateSubaccountFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InfoPickerScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SubaccountType f89024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CreateSubaccountFlowProvider$CurrencySelectionMode f89025b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InfoPickerScreen((SubaccountType) parcel.readParcelable(InfoPickerScreen.class.getClassLoader()), (CreateSubaccountFlowProvider$CurrencySelectionMode) parcel.readParcelable(InfoPickerScreen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InfoPickerScreen[i];
            }
        }

        public InfoPickerScreen(SubaccountType subAccountType, CreateSubaccountFlowProvider$CurrencySelectionMode currencySelectionMode) {
            Intrinsics.checkNotNullParameter(subAccountType, "subAccountType");
            Intrinsics.checkNotNullParameter(currencySelectionMode, "currencySelectionMode");
            this.f89024a = subAccountType;
            this.f89025b = currencySelectionMode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InfoPickerScreen)) {
                return false;
            }
            InfoPickerScreen infoPickerScreen = (InfoPickerScreen) obj2;
            return Intrinsics.f(this.f89024a, infoPickerScreen.f89024a) && Intrinsics.f(this.f89025b, infoPickerScreen.f89025b);
        }

        public final int hashCode() {
            return this.f89025b.hashCode() + (this.f89024a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89024a, i);
            dest.writeParcelable(this.f89025b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step$PendingJointAccount;", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step;", "<init>", "()V", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PendingJointAccount extends CreateSubaccountFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PendingJointAccount f89026a = new PendingJointAccount();

        @NotNull
        public static final Parcelable.Creator<PendingJointAccount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PendingJointAccount.f89026a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PendingJointAccount[i];
            }
        }

        private PendingJointAccount() {
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step;", "<init>", "()V", "Intro", "Subaccount", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step$ProductArticle$Intro;", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step$ProductArticle$Subaccount;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ProductArticle extends CreateSubaccountFlowContract$Step {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step$ProductArticle$Intro;", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step$ProductArticle;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Intro extends ProductArticle {

            @NotNull
            public static final Parcelable.Creator<Intro> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProductArticleParams f89027a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Intro((ProductArticleParams) parcel.readParcelable(Intro.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Intro[i];
                }
            }

            public Intro(ProductArticleParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                this.f89027a = params;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Intro) && Intrinsics.f(this.f89027a, ((Intro) obj2).f89027a);
            }

            @Override // com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlowContract$Step.ProductArticle
            /* JADX INFO: renamed from: getParams, reason: from getter */
            public final ProductArticleParams getF89028a() {
                return this.f89027a;
            }

            public final int hashCode() {
                return this.f89027a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f89027a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step$ProductArticle$Subaccount;", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step$ProductArticle;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Subaccount extends ProductArticle {

            @NotNull
            public static final Parcelable.Creator<Subaccount> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProductArticleParams f89028a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final SubaccountType f89029b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Subaccount((ProductArticleParams) parcel.readParcelable(Subaccount.class.getClassLoader()), (SubaccountType) parcel.readParcelable(Subaccount.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Subaccount[i];
                }
            }

            public Subaccount(ProductArticleParams params, SubaccountType subaccountType) {
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(subaccountType, "subaccountType");
                this.f89028a = params;
                this.f89029b = subaccountType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Subaccount)) {
                    return false;
                }
                Subaccount subaccount = (Subaccount) obj2;
                return Intrinsics.f(this.f89028a, subaccount.f89028a) && Intrinsics.f(this.f89029b, subaccount.f89029b);
            }

            @Override // com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlowContract$Step.ProductArticle
            /* JADX INFO: renamed from: getParams, reason: from getter */
            public final ProductArticleParams getF89028a() {
                return this.f89028a;
            }

            public final int hashCode() {
                return this.f89029b.hashCode() + (this.f89028a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f89028a, i);
                dest.writeParcelable(this.f89029b, i);
            }
        }

        private ProductArticle() {
        }

        /* JADX INFO: renamed from: getParams */
        public abstract ProductArticleParams getF89028a();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step$TaxPocketScreen;", "Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxPocketScreen extends CreateSubaccountFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TaxPocketScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f89031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f89032c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxPocketScreen(parcel.readString(), parcel.readString(), (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxPocketScreen[i];
            }
        }

        public TaxPocketScreen(String name, String imageId, xi0.b currency) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(imageId, "imageId");
            this.f89030a = name;
            this.f89031b = currency;
            this.f89032c = imageId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TaxPocketScreen)) {
                return false;
            }
            TaxPocketScreen taxPocketScreen = (TaxPocketScreen) obj2;
            return Intrinsics.f(this.f89030a, taxPocketScreen.f89030a) && Intrinsics.f(this.f89031b, taxPocketScreen.f89031b) && Intrinsics.f(this.f89032c, taxPocketScreen.f89032c);
        }

        public final int hashCode() {
            return this.f89032c.hashCode() + l.j(this.f89031b, this.f89030a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89030a);
            dest.writeSerializable(this.f89031b);
            dest.writeString(this.f89032c);
        }
    }

    private CreateSubaccountFlowContract$Step() {
    }
}
