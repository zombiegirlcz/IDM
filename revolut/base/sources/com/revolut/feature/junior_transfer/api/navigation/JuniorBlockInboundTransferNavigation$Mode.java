package com.revolut.feature.junior_transfer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/junior_transfer/api/navigation/JuniorBlockInboundTransferNavigation$Mode", "Landroid/os/Parcelable;", "Informational", "Block", "Unblock", "Lcom/revolut/feature/junior_transfer/api/navigation/JuniorBlockInboundTransferNavigation$Mode$Block;", "Lcom/revolut/feature/junior_transfer/api/navigation/JuniorBlockInboundTransferNavigation$Mode$Informational;", "Lcom/revolut/feature/junior_transfer/api/navigation/JuniorBlockInboundTransferNavigation$Mode$Unblock;", "feature_junior_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorBlockInboundTransferNavigation$Mode extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_transfer/api/navigation/JuniorBlockInboundTransferNavigation$Mode$Block;", "Lcom/revolut/feature/junior_transfer/api/navigation/JuniorBlockInboundTransferNavigation$Mode;", "", "toString", "()Ljava/lang/String;", "feature_junior_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Block implements JuniorBlockInboundTransferNavigation$Mode {

        @NotNull
        public static final Parcelable.Creator<Block> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f77410a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(JuniorBlockInboundTransferNavigation$Sender.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Block(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Block[i];
            }
        }

        public Block(List senders) {
            Intrinsics.checkNotNullParameter(senders, "senders");
            this.f77410a = senders;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Block) && Intrinsics.f(this.f77410a, ((Block) obj2).f77410a);
        }

        public final int hashCode() {
            return this.f77410a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f77410a, dest);
            while (itV.hasNext()) {
                ((JuniorBlockInboundTransferNavigation$Sender) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_transfer/api/navigation/JuniorBlockInboundTransferNavigation$Mode$Informational;", "Lcom/revolut/feature/junior_transfer/api/navigation/JuniorBlockInboundTransferNavigation$Mode;", "<init>", "()V", "feature_junior_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Informational implements JuniorBlockInboundTransferNavigation$Mode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Informational f77411a = new Informational();

        @NotNull
        public static final Parcelable.Creator<Informational> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Informational.f77411a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Informational[i];
            }
        }

        private Informational() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_transfer/api/navigation/JuniorBlockInboundTransferNavigation$Mode$Unblock;", "Lcom/revolut/feature/junior_transfer/api/navigation/JuniorBlockInboundTransferNavigation$Mode;", "", "toString", "()Ljava/lang/String;", "feature_junior_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Unblock implements JuniorBlockInboundTransferNavigation$Mode {

        @NotNull
        public static final Parcelable.Creator<Unblock> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JuniorBlockInboundTransferNavigation$Sender f77412a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Unblock(JuniorBlockInboundTransferNavigation$Sender.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unblock[i];
            }
        }

        public Unblock(JuniorBlockInboundTransferNavigation$Sender sender) {
            Intrinsics.checkNotNullParameter(sender, "sender");
            this.f77412a = sender;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Unblock) && Intrinsics.f(this.f77412a, ((Unblock) obj2).f77412a);
        }

        public final int hashCode() {
            return this.f77412a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f77412a.writeToParcel(dest, i);
        }
    }
}
