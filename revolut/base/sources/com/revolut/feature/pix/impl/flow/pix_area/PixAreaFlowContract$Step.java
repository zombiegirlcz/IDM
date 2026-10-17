package com.revolut.feature.pix.impl.flow.pix_area;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.kompot.navigable.flow.FlowStep;
import g8a.t;
import iaa.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0010\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"com/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ProductArticle", "PixArea", "Send", "MyAliases", "PixDisputes", "TrustedList", "AddTrustedAccount", "ReviewTrustedAccount", "ManageAlias", "AliasDeletion", "CopyPaste", "NewKey", "PixAutomatico", "QrScan", "QrRequest", "TransferInputKey", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$AddTrustedAccount;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$AliasDeletion;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$CopyPaste;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$ManageAlias;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$MyAliases;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$NewKey;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$PixArea;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$PixAutomatico;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$PixDisputes;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$QrRequest;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$QrScan;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$ReviewTrustedAccount;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$Send;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$TransferInputKey;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$TrustedList;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PixAreaFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$AddTrustedAccount;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddTrustedAccount extends PixAreaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddTrustedAccount f80643a = new AddTrustedAccount();

        @NotNull
        public static final Parcelable.Creator<AddTrustedAccount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddTrustedAccount.f80643a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddTrustedAccount[i];
            }
        }

        private AddTrustedAccount() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$AliasDeletion;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AliasDeletion extends PixAreaFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AliasDeletion> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PixKey f80644a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AliasDeletion((PixKey) parcel.readParcelable(AliasDeletion.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AliasDeletion[i];
            }
        }

        public AliasDeletion(PixKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f80644a = key;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AliasDeletion) && Intrinsics.f(this.f80644a, ((AliasDeletion) obj2).f80644a);
        }

        public final int hashCode() {
            return this.f80644a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80644a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$CopyPaste;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CopyPaste extends PixAreaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CopyPaste f80645a = new CopyPaste();

        @NotNull
        public static final Parcelable.Creator<CopyPaste> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CopyPaste.f80645a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CopyPaste[i];
            }
        }

        private CopyPaste() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$ManageAlias;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ManageAlias extends PixAreaFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ManageAlias> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PixKey f80646a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ManageAlias((PixKey) parcel.readParcelable(ManageAlias.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManageAlias[i];
            }
        }

        public ManageAlias(PixKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f80646a = key;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ManageAlias) && Intrinsics.f(this.f80646a, ((ManageAlias) obj2).f80646a);
        }

        public final int hashCode() {
            return this.f80646a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80646a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$MyAliases;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MyAliases extends PixAreaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MyAliases f80647a = new MyAliases();

        @NotNull
        public static final Parcelable.Creator<MyAliases> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MyAliases.f80647a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MyAliases[i];
            }
        }

        private MyAliases() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$NewKey;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewKey extends PixAreaFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NewKey> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AliasRegistrationType f80648a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewKey((AliasRegistrationType) parcel.readParcelable(NewKey.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewKey[i];
            }
        }

        public NewKey(AliasRegistrationType aliasRegistrationType) {
            this.f80648a = aliasRegistrationType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NewKey) && Intrinsics.f(this.f80648a, ((NewKey) obj2).f80648a);
        }

        public final int hashCode() {
            AliasRegistrationType aliasRegistrationType = this.f80648a;
            if (aliasRegistrationType == null) {
                return 0;
            }
            return aliasRegistrationType.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80648a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$PixArea;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PixArea extends PixAreaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PixArea f80649a = new PixArea();

        @NotNull
        public static final Parcelable.Creator<PixArea> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PixArea.f80649a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PixArea[i];
            }
        }

        private PixArea() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$PixAutomatico;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PixAutomatico extends PixAreaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PixAutomatico f80650a = new PixAutomatico();

        @NotNull
        public static final Parcelable.Creator<PixAutomatico> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PixAutomatico.f80650a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PixAutomatico[i];
            }
        }

        private PixAutomatico() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$PixDisputes;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PixDisputes extends PixAreaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PixDisputes f80651a = new PixDisputes();

        @NotNull
        public static final Parcelable.Creator<PixDisputes> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PixDisputes.f80651a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PixDisputes[i];
            }
        }

        private PixDisputes() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticle extends PixAreaFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f80652a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductArticle(f.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        public ProductArticle(f productArticle) {
            Intrinsics.checkNotNullParameter(productArticle, "productArticle");
            this.f80652a = productArticle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProductArticle) && this.f80652a == ((ProductArticle) obj2).f80652a;
        }

        public final int hashCode() {
            return this.f80652a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80652a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$QrRequest;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QrRequest extends PixAreaFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<QrRequest> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PixKey f80653a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QrRequest((PixKey) parcel.readParcelable(QrRequest.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QrRequest[i];
            }
        }

        public QrRequest(PixKey pixKey) {
            this.f80653a = pixKey;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof QrRequest) && Intrinsics.f(this.f80653a, ((QrRequest) obj2).f80653a);
        }

        public final int hashCode() {
            PixKey pixKey = this.f80653a;
            if (pixKey == null) {
                return 0;
            }
            return pixKey.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80653a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$QrScan;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class QrScan extends PixAreaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final QrScan f80654a = new QrScan();

        @NotNull
        public static final Parcelable.Creator<QrScan> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return QrScan.f80654a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QrScan[i];
            }
        }

        private QrScan() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$ReviewTrustedAccount;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewTrustedAccount extends PixAreaFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ReviewTrustedAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5j.a f80655a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReviewTrustedAccount((f5j.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewTrustedAccount[i];
            }
        }

        public ReviewTrustedAccount(f5j.a beneficiary) {
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f80655a = beneficiary;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReviewTrustedAccount) && Intrinsics.f(this.f80655a, ((ReviewTrustedAccount) obj2).f80655a);
        }

        public final int hashCode() {
            return this.f80655a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f80655a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$Send;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Send extends PixAreaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Send f80656a = new Send();

        @NotNull
        public static final Parcelable.Creator<Send> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Send.f80656a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Send[i];
            }
        }

        private Send() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$TransferInputKey;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransferInputKey extends PixAreaFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TransferInputKey> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f80657a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransferInputKey(t.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransferInputKey[i];
            }
        }

        public TransferInputKey(t flowType) {
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            this.f80657a = flowType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TransferInputKey) && this.f80657a == ((TransferInputKey) obj2).f80657a;
        }

        public final int hashCode() {
            return this.f80657a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80657a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step$TrustedList;", "Lcom/revolut/feature/pix/impl/flow/pix_area/PixAreaFlowContract$Step;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TrustedList extends PixAreaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TrustedList f80658a = new TrustedList();

        @NotNull
        public static final Parcelable.Creator<TrustedList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TrustedList.f80658a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TrustedList[i];
            }
        }

        private TrustedList() {
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

    private PixAreaFlowContract$Step() {
    }
}
