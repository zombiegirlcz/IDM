package com.revolut.feature.apm.breb.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.alias.Alias;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/apm/breb/api/navigation/BrebNavigation$StartType", "Landroid/os/Parcelable;", "Area", "BlockExtension", "RecipientList", "NewAlias", "QrRequest", "Lcom/revolut/feature/apm/breb/api/navigation/BrebNavigation$StartType$Area;", "Lcom/revolut/feature/apm/breb/api/navigation/BrebNavigation$StartType$BlockExtension;", "Lcom/revolut/feature/apm/breb/api/navigation/BrebNavigation$StartType$NewAlias;", "Lcom/revolut/feature/apm/breb/api/navigation/BrebNavigation$StartType$QrRequest;", "Lcom/revolut/feature/apm/breb/api/navigation/BrebNavigation$StartType$RecipientList;", "feature_apm_breb_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BrebNavigation$StartType extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/breb/api/navigation/BrebNavigation$StartType$Area;", "Lcom/revolut/feature/apm/breb/api/navigation/BrebNavigation$StartType;", "<init>", "()V", "feature_apm_breb_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Area implements BrebNavigation$StartType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Area f61698a = new Area();

        @NotNull
        public static final Parcelable.Creator<Area> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Area.f61698a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Area[i];
            }
        }

        private Area() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/breb/api/navigation/BrebNavigation$StartType$BlockExtension;", "Lcom/revolut/feature/apm/breb/api/navigation/BrebNavigation$StartType;", "<init>", "()V", "feature_apm_breb_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BlockExtension implements BrebNavigation$StartType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BlockExtension f61699a = new BlockExtension();

        @NotNull
        public static final Parcelable.Creator<BlockExtension> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BlockExtension.f61699a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BlockExtension[i];
            }
        }

        private BlockExtension() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/breb/api/navigation/BrebNavigation$StartType$NewAlias;", "Lcom/revolut/feature/apm/breb/api/navigation/BrebNavigation$StartType;", "<init>", "()V", "feature_apm_breb_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewAlias implements BrebNavigation$StartType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewAlias f61700a = new NewAlias();

        @NotNull
        public static final Parcelable.Creator<NewAlias> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NewAlias.f61700a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewAlias[i];
            }
        }

        private NewAlias() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/breb/api/navigation/BrebNavigation$StartType$QrRequest;", "Lcom/revolut/feature/apm/breb/api/navigation/BrebNavigation$StartType;", "", "toString", "()Ljava/lang/String;", "feature_apm_breb_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QrRequest implements BrebNavigation$StartType {

        @NotNull
        public static final Parcelable.Creator<QrRequest> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Alias f61701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f61702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f61703c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Alias alias = (Alias) j6.a.f(parcel, "parcel", QrRequest.class);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(QrRequest.class, parcel, arrayList, iE, 1);
                }
                return new QrRequest(alias, (d) parcel.readSerializable(), arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QrRequest[i];
            }
        }

        public QrRequest(Alias mainAlias, d amount, List activeAliases) {
            Intrinsics.checkNotNullParameter(mainAlias, "mainAlias");
            Intrinsics.checkNotNullParameter(activeAliases, "activeAliases");
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.f61701a = mainAlias;
            this.f61702b = activeAliases;
            this.f61703c = amount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof QrRequest)) {
                return false;
            }
            QrRequest qrRequest = (QrRequest) obj2;
            return Intrinsics.f(this.f61701a, qrRequest.f61701a) && Intrinsics.f(this.f61702b, qrRequest.f61702b) && Intrinsics.f(this.f61703c, qrRequest.f61703c);
        }

        public final int hashCode() {
            return this.f61703c.hashCode() + p.a.d(this.f61701a.hashCode() * 31, 31, this.f61702b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61701a, i);
            Iterator itV = p.a.v(this.f61702b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeSerializable(this.f61703c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/breb/api/navigation/BrebNavigation$StartType$RecipientList;", "Lcom/revolut/feature/apm/breb/api/navigation/BrebNavigation$StartType;", "<init>", "()V", "feature_apm_breb_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RecipientList implements BrebNavigation$StartType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RecipientList f61704a = new RecipientList();

        @NotNull
        public static final Parcelable.Creator<RecipientList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RecipientList.f61704a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecipientList[i];
            }
        }

        private RecipientList() {
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
}
