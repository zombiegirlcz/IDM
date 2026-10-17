package com.revolut.feature.apm.breb.impl.flow.area;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasRegistrationMode;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uv1.m;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"com/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "About", "Area", "Keys", "More", "Send", "Replace", "NewContact", "NewAlias", "QrRequest", "OccupiedKeyInfo", "QrScanner", "Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step$About;", "Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step$Area;", "Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step$Keys;", "Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step$More;", "Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step$NewAlias;", "Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step$NewContact;", "Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step$OccupiedKeyInfo;", "Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step$QrRequest;", "Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step$QrScanner;", "Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step$Replace;", "Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step$Send;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BrebAreaFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step$About;", "Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class About extends BrebAreaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final About f61724a = new About();

        @NotNull
        public static final Parcelable.Creator<About> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return About.f61724a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new About[i];
            }
        }

        private About() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof About);
        }

        public final int hashCode() {
            return 137390093;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step$Keys;", "Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step;", "<init>", "()V", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Keys extends BrebAreaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Keys f61726a = new Keys();

        @NotNull
        public static final Parcelable.Creator<Keys> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Keys.f61726a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Keys[i];
            }
        }

        private Keys() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step$More;", "Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class More extends BrebAreaFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<More> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Alias f61727a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new More((Alias) parcel.readParcelable(More.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new More[i];
            }
        }

        public More(Alias alias) {
            Intrinsics.checkNotNullParameter(alias, "alias");
            this.f61727a = alias;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof More) && Intrinsics.f(this.f61727a, ((More) obj2).f61727a);
        }

        public final int hashCode() {
            return this.f61727a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61727a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step$NewAlias;", "Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewAlias extends BrebAreaFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NewAlias> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmAliasRegistrationMode f61728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BrebAreaFlowContract$Step f61729b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewAlias((ApmAliasRegistrationMode) parcel.readParcelable(NewAlias.class.getClassLoader()), (BrebAreaFlowContract$Step) parcel.readParcelable(NewAlias.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewAlias[i];
            }
        }

        public NewAlias(ApmAliasRegistrationMode mode, BrebAreaFlowContract$Step brebAreaFlowContract$Step) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f61728a = mode;
            this.f61729b = brebAreaFlowContract$Step;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NewAlias)) {
                return false;
            }
            NewAlias newAlias = (NewAlias) obj2;
            return Intrinsics.f(this.f61728a, newAlias.f61728a) && Intrinsics.f(this.f61729b, newAlias.f61729b);
        }

        public final int hashCode() {
            int iHashCode = this.f61728a.hashCode() * 31;
            BrebAreaFlowContract$Step brebAreaFlowContract$Step = this.f61729b;
            return iHashCode + (brebAreaFlowContract$Step == null ? 0 : brebAreaFlowContract$Step.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61728a, i);
            dest.writeParcelable(this.f61729b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step$NewContact;", "Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step;", "<init>", "()V", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewContact extends BrebAreaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewContact f61730a = new NewContact();

        @NotNull
        public static final Parcelable.Creator<NewContact> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NewContact.f61730a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewContact[i];
            }
        }

        private NewContact() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step$OccupiedKeyInfo;", "Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OccupiedKeyInfo extends BrebAreaFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OccupiedKeyInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f61732b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OccupiedKeyInfo(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OccupiedKeyInfo[i];
            }
        }

        public OccupiedKeyInfo(String keyValue, String ownerAgent) {
            Intrinsics.checkNotNullParameter(keyValue, "keyValue");
            Intrinsics.checkNotNullParameter(ownerAgent, "ownerAgent");
            this.f61731a = keyValue;
            this.f61732b = ownerAgent;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OccupiedKeyInfo)) {
                return false;
            }
            OccupiedKeyInfo occupiedKeyInfo = (OccupiedKeyInfo) obj2;
            return Intrinsics.f(this.f61731a, occupiedKeyInfo.f61731a) && Intrinsics.f(this.f61732b, occupiedKeyInfo.f61732b);
        }

        public final int hashCode() {
            return this.f61732b.hashCode() + (this.f61731a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61731a);
            dest.writeString(this.f61732b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step$QrRequest;", "Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QrRequest extends BrebAreaFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<QrRequest> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Alias f61733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f61734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f61735c;

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

        public QrRequest(Alias alias, d dVar, List activeAliases) {
            Intrinsics.checkNotNullParameter(alias, "alias");
            Intrinsics.checkNotNullParameter(activeAliases, "activeAliases");
            this.f61733a = alias;
            this.f61734b = activeAliases;
            this.f61735c = dVar;
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
            return Intrinsics.f(this.f61733a, qrRequest.f61733a) && Intrinsics.f(this.f61734b, qrRequest.f61734b) && Intrinsics.f(this.f61735c, qrRequest.f61735c);
        }

        public final int hashCode() {
            int iD = p.a.d(this.f61733a.hashCode() * 31, 31, this.f61734b);
            d dVar = this.f61735c;
            return iD + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61733a, i);
            Iterator itV = p.a.v(this.f61734b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeSerializable(this.f61735c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step$QrScanner;", "Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step;", "<init>", "()V", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class QrScanner extends BrebAreaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final QrScanner f61736a = new QrScanner();

        @NotNull
        public static final Parcelable.Creator<QrScanner> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return QrScanner.f61736a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QrScanner[i];
            }
        }

        private QrScanner() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step$Replace;", "Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Replace extends BrebAreaFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Replace> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Alias f61737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f61738b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Alias alias = (Alias) j6.a.f(parcel, "parcel", Replace.class);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Replace.class, parcel, arrayList, iE, 1);
                }
                return new Replace(alias, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Replace[i];
            }
        }

        public Replace(Alias selectedAlias, List availabilities) {
            Intrinsics.checkNotNullParameter(selectedAlias, "selectedAlias");
            Intrinsics.checkNotNullParameter(availabilities, "availabilities");
            this.f61737a = selectedAlias;
            this.f61738b = availabilities;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Replace)) {
                return false;
            }
            Replace replace = (Replace) obj2;
            return Intrinsics.f(this.f61737a, replace.f61737a) && Intrinsics.f(this.f61738b, replace.f61738b);
        }

        public final int hashCode() {
            return this.f61738b.hashCode() + (this.f61737a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61737a, i);
            Iterator itV = p.a.v(this.f61738b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step$Send;", "Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step;", "<init>", "()V", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Send extends BrebAreaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Send f61739a = new Send();

        @NotNull
        public static final Parcelable.Creator<Send> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Send.f61739a;
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

    private BrebAreaFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step$Area;", "Lcom/revolut/feature/apm/breb/impl/flow/area/BrebAreaFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Area extends BrebAreaFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Area> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f61725a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Area(parcel.readInt() == 0 ? null : m.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Area[i];
            }
        }

        public Area(m mVar) {
            this.f61725a = mVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Area) && this.f61725a == ((Area) obj2).f61725a;
        }

        public final int hashCode() {
            m mVar = this.f61725a;
            if (mVar == null) {
                return 0;
            }
            return mVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            m mVar = this.f61725a;
            if (mVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(mVar.name());
            }
        }

        public Area() {
            this(null);
        }
    }
}
