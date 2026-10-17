package com.revolut.domain.models.moneyrequest;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00022\u00020\u0001:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel;", "Landroid/os/Parcelable;", "Companion", "APM", "Revolut", "BankBeneficiary", "Aani", "Bizum", "MBWay", "Qvik", "Upi", "Wero", "a", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$APM;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$BankBeneficiary;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$Revolut;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MoneyRequestChannel implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60328a;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$APM;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$Aani;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$Bizum;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$MBWay;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$Qvik;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$Upi;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$Wero;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class APM extends MoneyRequestChannel {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$Aani;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$APM;", "<init>", "()V", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Aani extends APM {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Aani f60329b = new Aani();

        @NotNull
        public static final Parcelable.Creator<Aani> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Aani.f60329b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Aani[i];
            }
        }

        private Aani() {
            super("AANI");
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$BankBeneficiary;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel;", "Masav", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$BankBeneficiary$Masav;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class BankBeneficiary extends MoneyRequestChannel {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$BankBeneficiary$Masav;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$BankBeneficiary;", "<init>", "()V", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Masav extends BankBeneficiary {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final Masav f60330b = new Masav();

            @NotNull
            public static final Parcelable.Creator<Masav> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Masav.f60330b;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Masav[i];
                }
            }

            private Masav() {
                super("MASAV_IL_R2P");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$Bizum;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$APM;", "<init>", "()V", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Bizum extends APM {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Bizum f60331b = new Bizum();

        @NotNull
        public static final Parcelable.Creator<Bizum> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Bizum.f60331b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Bizum[i];
            }
        }

        private Bizum() {
            super("BIZUM");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$MBWay;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$APM;", "<init>", "()V", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MBWay extends APM {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final MBWay f60332b = new MBWay();

        @NotNull
        public static final Parcelable.Creator<MBWay> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MBWay.f60332b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MBWay[i];
            }
        }

        private MBWay() {
            super("MBWAY");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$Qvik;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$APM;", "<init>", "()V", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Qvik extends APM {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Qvik f60333b = new Qvik();

        @NotNull
        public static final Parcelable.Creator<Qvik> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Qvik.f60333b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Qvik[i];
            }
        }

        private Qvik() {
            super("GIRO_QVIK");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$Revolut;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel;", "<init>", "()V", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Revolut extends MoneyRequestChannel {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Revolut f60334b = new Revolut();

        @NotNull
        public static final Parcelable.Creator<Revolut> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Revolut.f60334b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Revolut[i];
            }
        }

        private Revolut() {
            super("INTERNAL");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$Upi;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$APM;", "<init>", "()V", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Upi extends APM {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Upi f60335b = new Upi();

        @NotNull
        public static final Parcelable.Creator<Upi> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Upi.f60335b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Upi[i];
            }
        }

        private Upi() {
            super("UPI");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$Wero;", "Lcom/revolut/domain/models/moneyrequest/MoneyRequestChannel$APM;", "<init>", "()V", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Wero extends APM {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Wero f60336b = new Wero();

        @NotNull
        public static final Parcelable.Creator<Wero> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Wero.f60336b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Wero[i];
            }
        }

        private Wero() {
            super("WERO");
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

    /* JADX INFO: renamed from: com.revolut.domain.models.moneyrequest.MoneyRequestChannel$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static MoneyRequestChannel a(String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            int iHashCode = type.hashCode();
            Revolut revolut = Revolut.f60334b;
            switch (iHashCode) {
                case -5097985:
                    if (type.equals("MASAV_IL_R2P")) {
                        return BankBeneficiary.Masav.f60330b;
                    }
                    break;
                case 84238:
                    if (type.equals("UPI")) {
                        return Upi.f60335b;
                    }
                    break;
                case 2001371:
                    if (type.equals("AANI")) {
                        return Aani.f60329b;
                    }
                    break;
                case 2660747:
                    if (type.equals("WERO")) {
                        return Wero.f60336b;
                    }
                    break;
                case 63216331:
                    if (type.equals("BIZUM")) {
                        return Bizum.f60331b;
                    }
                    break;
                case 73163034:
                    if (type.equals("MBWAY")) {
                        return MBWay.f60332b;
                    }
                    break;
                case 1008680871:
                    if (type.equals("GIRO_QVIK")) {
                        return Qvik.f60333b;
                    }
                    break;
                case 1353037501:
                    if (type.equals("INTERNAL")) {
                        return revolut;
                    }
                    break;
            }
            IllegalStateException illegalStateException = new IllegalStateException("MoneyRequests deserialisation: Unknown channel: ".concat(type));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return revolut;
        }
    }

    public MoneyRequestChannel(String str) {
        this.f60328a = str;
    }
}
