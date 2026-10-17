package com.revolut.kompot.bridge.impl.rootflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhi.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/kompot/bridge/impl/rootflow/KompotFlowContract$Configuration", "Landroid/os/Parcelable;", "<init>", "()V", "Standalone", "Embedded", "Overlay", "Lcom/revolut/kompot/bridge/impl/rootflow/KompotFlowContract$Configuration$Embedded;", "Lcom/revolut/kompot/bridge/impl/rootflow/KompotFlowContract$Configuration$Overlay;", "Lcom/revolut/kompot/bridge/impl/rootflow/KompotFlowContract$Configuration$Standalone;", "kompot_bridge_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class KompotFlowContract$Configuration implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/bridge/impl/rootflow/KompotFlowContract$Configuration$Embedded;", "Lcom/revolut/kompot/bridge/impl/rootflow/KompotFlowContract$Configuration;", "", "toString", "()Ljava/lang/String;", "kompot_bridge_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Embedded extends KompotFlowContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<Embedded> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParcelableDestination f98261a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Embedded((ParcelableDestination) parcel.readParcelable(Embedded.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Embedded[i];
            }
        }

        public Embedded(ParcelableDestination destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.f98261a = destination;
        }

        @Override // com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration
        /* JADX INFO: renamed from: a */
        public final boolean getF98265b() {
            return false;
        }

        @Override // com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration
        /* JADX INFO: renamed from: b */
        public final boolean getF98266c() {
            return false;
        }

        @Override // com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration
        /* JADX INFO: renamed from: c, reason: from getter */
        public final ParcelableDestination getF98264a() {
            return this.f98261a;
        }

        @Override // com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration
        /* JADX INFO: renamed from: d */
        public final boolean getD() {
            return false;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Embedded) && Intrinsics.f(this.f98261a, ((Embedded) obj2).f98261a);
        }

        public final int hashCode() {
            return this.f98261a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f98261a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/bridge/impl/rootflow/KompotFlowContract$Configuration$Overlay;", "Lcom/revolut/kompot/bridge/impl/rootflow/KompotFlowContract$Configuration;", "", "toString", "()Ljava/lang/String;", "kompot_bridge_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Overlay extends KompotFlowContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<Overlay> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParcelableDestination f98262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f98263b;

        /* JADX INFO: loaded from: classes10.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Overlay((ParcelableDestination) parcel.readParcelable(Overlay.class.getClassLoader()), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Overlay[i];
            }
        }

        public Overlay(ParcelableDestination destination, b style) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f98262a = destination;
            this.f98263b = style;
        }

        @Override // com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration
        /* JADX INFO: renamed from: a */
        public final boolean getF98265b() {
            return false;
        }

        @Override // com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration
        /* JADX INFO: renamed from: b */
        public final boolean getF98266c() {
            return false;
        }

        @Override // com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration
        /* JADX INFO: renamed from: c, reason: from getter */
        public final ParcelableDestination getF98264a() {
            return this.f98262a;
        }

        @Override // com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration
        /* JADX INFO: renamed from: d */
        public final boolean getD() {
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Overlay)) {
                return false;
            }
            Overlay overlay = (Overlay) obj2;
            return Intrinsics.f(this.f98262a, overlay.f98262a) && this.f98263b == overlay.f98263b;
        }

        public final int hashCode() {
            return this.f98263b.hashCode() + (this.f98262a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f98262a, i);
            dest.writeString(this.f98263b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/bridge/impl/rootflow/KompotFlowContract$Configuration$Standalone;", "Lcom/revolut/kompot/bridge/impl/rootflow/KompotFlowContract$Configuration;", "", "toString", "()Ljava/lang/String;", "kompot_bridge_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Standalone extends KompotFlowContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<Standalone> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParcelableDestination f98264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f98265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f98266c;
        public final boolean d;

        /* JADX INFO: loaded from: classes10.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Standalone((ParcelableDestination) parcel.readParcelable(Standalone.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Standalone[i];
            }
        }

        public Standalone(ParcelableDestination destination, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.f98264a = destination;
            this.f98265b = z;
            this.f98266c = z3;
            this.d = true;
        }

        @Override // com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF98265b() {
            return this.f98265b;
        }

        @Override // com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF98266c() {
            return this.f98266c;
        }

        @Override // com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration
        /* JADX INFO: renamed from: c, reason: from getter */
        public final ParcelableDestination getF98264a() {
            return this.f98264a;
        }

        @Override // com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration
        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Standalone)) {
                return false;
            }
            Standalone standalone = (Standalone) obj2;
            return Intrinsics.f(this.f98264a, standalone.f98264a) && this.f98265b == standalone.f98265b && this.f98266c == standalone.f98266c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f98266c) + j6.a.c(this.f98264a.hashCode() * 31, 31, this.f98265b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f98264a, i);
            dest.writeInt(this.f98265b ? 1 : 0);
            dest.writeInt(this.f98266c ? 1 : 0);
        }
    }

    private KompotFlowContract$Configuration() {
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean getF98265b();

    /* JADX INFO: renamed from: b */
    public abstract boolean getF98266c();

    /* JADX INFO: renamed from: c */
    public abstract ParcelableDestination getF98264a();

    /* JADX INFO: renamed from: d */
    public abstract boolean getD();
}
