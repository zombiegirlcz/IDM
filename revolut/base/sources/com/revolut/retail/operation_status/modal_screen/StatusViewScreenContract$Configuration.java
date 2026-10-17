package com.revolut.retail.operation_status.modal_screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import ho.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/operation_status/modal_screen/StatusViewScreenContract$Configuration", "Landroid/os/Parcelable;", "<init>", "()V", "Basic", "Custom", "Lcom/revolut/retail/operation_status/modal_screen/StatusViewScreenContract$Configuration$Basic;", "Lcom/revolut/retail/operation_status/modal_screen/StatusViewScreenContract$Configuration$Custom;", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StatusViewScreenContract$Configuration implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/operation_status/modal_screen/StatusViewScreenContract$Configuration$Basic;", "Lcom/revolut/retail/operation_status/modal_screen/StatusViewScreenContract$Configuration;", "", "toString", "()Ljava/lang/String;", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Basic extends StatusViewScreenContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<Basic> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final StatusViewConfiguration f104333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NaviCommand f104334c;
        public final n d;
        public final NaviCommand e;
        public final n f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final NaviCommand f104335g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f104336h;
        public final boolean i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                StatusViewConfiguration statusViewConfiguration = (StatusViewConfiguration) parcel.readParcelable(Basic.class.getClassLoader());
                NaviCommand naviCommand = (NaviCommand) parcel.readParcelable(Basic.class.getClassLoader());
                n nVar = (n) parcel.readSerializable();
                NaviCommand naviCommand2 = (NaviCommand) parcel.readParcelable(Basic.class.getClassLoader());
                n nVar2 = (n) parcel.readSerializable();
                NaviCommand naviCommand3 = (NaviCommand) parcel.readParcelable(Basic.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(StatusViewScreenContract$ClauseClickCommand.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Basic(string, statusViewConfiguration, naviCommand, nVar, naviCommand2, nVar2, naviCommand3, arrayList, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Basic[i];
            }
        }

        public Basic(String flowName, StatusViewConfiguration statusViewConfiguration, NaviCommand primaryButtonCommand, n nVar, NaviCommand secondaryButtonCommand, n nVar2, NaviCommand finishResultCommand, List clauseClickCommands, boolean z) {
            Intrinsics.checkNotNullParameter(flowName, "flowName");
            Intrinsics.checkNotNullParameter(statusViewConfiguration, "statusViewConfiguration");
            Intrinsics.checkNotNullParameter(primaryButtonCommand, "primaryButtonCommand");
            Intrinsics.checkNotNullParameter(secondaryButtonCommand, "secondaryButtonCommand");
            Intrinsics.checkNotNullParameter(finishResultCommand, "finishResultCommand");
            Intrinsics.checkNotNullParameter(clauseClickCommands, "clauseClickCommands");
            this.f104332a = flowName;
            this.f104333b = statusViewConfiguration;
            this.f104334c = primaryButtonCommand;
            this.d = nVar;
            this.e = secondaryButtonCommand;
            this.f = nVar2;
            this.f104335g = finishResultCommand;
            this.f104336h = clauseClickCommands;
            this.i = z;
        }

        @Override // com.revolut.retail.operation_status.modal_screen.StatusViewScreenContract$Configuration
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF104337a() {
            return this.f104332a;
        }

        @Override // com.revolut.retail.operation_status.modal_screen.StatusViewScreenContract$Configuration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF104338b() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Basic)) {
                return false;
            }
            Basic basic = (Basic) obj2;
            return Intrinsics.f(this.f104332a, basic.f104332a) && Intrinsics.f(this.f104333b, basic.f104333b) && Intrinsics.f(this.f104334c, basic.f104334c) && Intrinsics.f(this.d, basic.d) && Intrinsics.f(this.e, basic.e) && Intrinsics.f(this.f, basic.f) && Intrinsics.f(this.f104335g, basic.f104335g) && Intrinsics.f(this.f104336h, basic.f104336h) && this.i == basic.i;
        }

        public final int hashCode() {
            int iA = z9h.n.a(this.f104334c, (this.f104333b.hashCode() + (this.f104332a.hashCode() * 31)) * 31, 31);
            n nVar = this.d;
            int iA2 = z9h.n.a(this.e, (iA + (nVar == null ? 0 : nVar.hashCode())) * 31, 31);
            n nVar2 = this.f;
            return Boolean.hashCode(this.i) + p.a.d(z9h.n.a(this.f104335g, (iA2 + (nVar2 != null ? nVar2.hashCode() : 0)) * 31, 31), 31, this.f104336h);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104332a);
            dest.writeParcelable(this.f104333b, i);
            dest.writeParcelable(this.f104334c, i);
            dest.writeSerializable(this.d);
            dest.writeParcelable(this.e, i);
            dest.writeSerializable(this.f);
            dest.writeParcelable(this.f104335g, i);
            Iterator itV = p.a.v(this.f104336h, dest);
            while (itV.hasNext()) {
                ((StatusViewScreenContract$ClauseClickCommand) itV.next()).writeToParcel(dest, i);
            }
            dest.writeInt(this.i ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/operation_status/modal_screen/StatusViewScreenContract$Configuration$Custom;", "Lcom/revolut/retail/operation_status/modal_screen/StatusViewScreenContract$Configuration;", "", "toString", "()Ljava/lang/String;", "retail_operation_status_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Custom extends StatusViewScreenContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<Custom> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f104338b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Custom(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Custom[i];
            }
        }

        public Custom(String flowName, boolean z) {
            Intrinsics.checkNotNullParameter(flowName, "flowName");
            this.f104337a = flowName;
            this.f104338b = z;
        }

        @Override // com.revolut.retail.operation_status.modal_screen.StatusViewScreenContract$Configuration
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF104337a() {
            return this.f104337a;
        }

        @Override // com.revolut.retail.operation_status.modal_screen.StatusViewScreenContract$Configuration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF104338b() {
            return this.f104338b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) obj2;
            return Intrinsics.f(this.f104337a, custom.f104337a) && this.f104338b == custom.f104338b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f104338b) + (this.f104337a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104337a);
            dest.writeInt(this.f104338b ? 1 : 0);
        }
    }

    private StatusViewScreenContract$Configuration() {
    }

    /* JADX INFO: renamed from: a */
    public abstract String getF104337a();

    /* JADX INFO: renamed from: b */
    public abstract boolean getF104338b();
}
