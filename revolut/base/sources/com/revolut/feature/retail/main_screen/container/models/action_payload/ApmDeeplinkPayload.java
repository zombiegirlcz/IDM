package com.revolut.feature.retail.main_screen.container.models.action_payload;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload;", "Landroid/os/Parcelable;", "Companion", "Chat", "Area", "PaymentArea", "Settings", "Deregister", "DisableExtension", "Pay", "Unavailable", "Apm", "a", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Area;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Chat;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Deregister;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$DisableExtension;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Pay;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$PaymentArea;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Settings;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Unavailable;", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmDeeplinkPayload extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f82753a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u000e\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm;", "Landroid/os/Parcelable;", "Companion", "Product", "Service", "BIZUM", "BLIK", "BREB", "IRIS", "MBWAY", "PAYID", "QVIK", "SPIN", "WERO", "UPI", "SWISH", "a", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$Product;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$Service;", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Apm extends Parcelable {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f82742a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$BIZUM;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$Product;", "<init>", "()V", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class BIZUM extends Product {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final BIZUM f82730b = new BIZUM();

            @NotNull
            public static final Parcelable.Creator<BIZUM> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return BIZUM.f82730b;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new BIZUM[i];
                }
            }

            private BIZUM() {
                super("bizum");
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$BLIK;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$Product;", "<init>", "()V", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class BLIK extends Product {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final BLIK f82731b = new BLIK();

            @NotNull
            public static final Parcelable.Creator<BLIK> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return BLIK.f82731b;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new BLIK[i];
                }
            }

            private BLIK() {
                super("blik");
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$BREB;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$Product;", "<init>", "()V", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class BREB extends Product {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final BREB f82732b = new BREB();

            @NotNull
            public static final Parcelable.Creator<BREB> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return BREB.f82732b;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new BREB[i];
                }
            }

            private BREB() {
                super("breb");
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$IRIS;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$Product;", "<init>", "()V", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class IRIS extends Product {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final IRIS f82733b = new IRIS();

            @NotNull
            public static final Parcelable.Creator<IRIS> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return IRIS.f82733b;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new IRIS[i];
                }
            }

            private IRIS() {
                super("iris");
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$MBWAY;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$Product;", "<init>", "()V", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class MBWAY extends Product {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final MBWAY f82734b = new MBWAY();

            @NotNull
            public static final Parcelable.Creator<MBWAY> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return MBWAY.f82734b;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MBWAY[i];
                }
            }

            private MBWAY() {
                super("mbway");
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$PAYID;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$Product;", "<init>", "()V", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class PAYID extends Product {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final PAYID f82735b = new PAYID();

            @NotNull
            public static final Parcelable.Creator<PAYID> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PAYID.f82735b;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PAYID[i];
                }
            }

            private PAYID() {
                super("payid");
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

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$Product;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$BIZUM;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$BLIK;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$BREB;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$IRIS;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$MBWAY;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$PAYID;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$QVIK;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$SPIN;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$UPI;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$WERO;", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class Product implements Apm {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f82736a;

            public Product(String str) {
                this.f82736a = str;
            }

            @Override // com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload.Apm
            /* JADX INFO: renamed from: getValue, reason: from getter */
            public final String getF82736a() {
                return this.f82736a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$QVIK;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$Product;", "<init>", "()V", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class QVIK extends Product {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final QVIK f82737b = new QVIK();

            @NotNull
            public static final Parcelable.Creator<QVIK> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return QVIK.f82737b;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new QVIK[i];
                }
            }

            private QVIK() {
                super("qvik");
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$SPIN;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$Product;", "<init>", "()V", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class SPIN extends Product {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final SPIN f82738b = new SPIN();

            @NotNull
            public static final Parcelable.Creator<SPIN> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SPIN.f82738b;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SPIN[i];
                }
            }

            private SPIN() {
                super("spin");
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$SWISH;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$Service;", "<init>", "()V", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class SWISH extends Service {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SWISH f82739a = new SWISH();

            @NotNull
            public static final Parcelable.Creator<SWISH> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SWISH.f82739a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SWISH[i];
                }
            }

            private SWISH() {
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

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$Service;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$SWISH;", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class Service implements Apm {
            @Override // com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload.Apm
            /* JADX INFO: renamed from: getValue */
            public final String getF82736a() {
                return "swish";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$UPI;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$Product;", "<init>", "()V", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class UPI extends Product {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final UPI f82740b = new UPI();

            @NotNull
            public static final Parcelable.Creator<UPI> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return UPI.f82740b;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new UPI[i];
                }
            }

            private UPI() {
                super("upi");
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$WERO;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Apm$Product;", "<init>", "()V", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class WERO extends Product {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final WERO f82741b = new WERO();

            @NotNull
            public static final Parcelable.Creator<WERO> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return WERO.f82741b;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new WERO[i];
                }
            }

            private WERO() {
                super("wero");
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

        /* JADX INFO: renamed from: com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload$Apm$a, reason: from kotlin metadata */
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ Companion f82742a = new Companion();

            private Companion() {
            }

            public static Apm a(String value) {
                Object next;
                Intrinsics.checkNotNullParameter(value, "value");
                Apm[] elements = {BIZUM.f82730b, BLIK.f82731b, BREB.f82732b, IRIS.f82733b, MBWAY.f82734b, PAYID.f82735b, QVIK.f82737b, SPIN.f82738b, WERO.f82741b, UPI.f82740b, SWISH.f82739a};
                Intrinsics.checkNotNullParameter(elements, "elements");
                Iterator it8 = d.y0(elements).iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (Intrinsics.f(((Apm) next).getF82736a(), value)) {
                        break;
                    }
                }
                return (Apm) next;
            }
        }

        /* JADX INFO: renamed from: getValue */
        String getF82736a();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Area;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload;", "", "toString", "()Ljava/lang/String;", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Area implements ApmDeeplinkPayload {

        @NotNull
        public static final Parcelable.Creator<Area> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Apm f82743a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Area((Apm) parcel.readParcelable(Area.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Area[i];
            }
        }

        public Area(Apm areaType) {
            Intrinsics.checkNotNullParameter(areaType, "areaType");
            this.f82743a = areaType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Area) && Intrinsics.f(this.f82743a, ((Area) obj2).f82743a);
        }

        public final int hashCode() {
            return this.f82743a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82743a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Chat;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload;", "", "toString", "()Ljava/lang/String;", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Chat implements ApmDeeplinkPayload {

        @NotNull
        public static final Parcelable.Creator<Chat> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82744a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Chat(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Chat[i];
            }
        }

        public Chat(String contactId) {
            Intrinsics.checkNotNullParameter(contactId, "contactId");
            this.f82744a = contactId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Chat) && Intrinsics.f(this.f82744a, ((Chat) obj2).f82744a);
        }

        public final int hashCode() {
            return this.f82744a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82744a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Deregister;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload;", "", "toString", "()Ljava/lang/String;", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Deregister implements ApmDeeplinkPayload {

        @NotNull
        public static final Parcelable.Creator<Deregister> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Apm f82745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f82746b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Deregister((Apm) parcel.readParcelable(Deregister.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Deregister[i];
            }
        }

        public Deregister(Apm areaType, String id10) {
            Intrinsics.checkNotNullParameter(areaType, "areaType");
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f82745a = areaType;
            this.f82746b = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Deregister)) {
                return false;
            }
            Deregister deregister = (Deregister) obj2;
            return Intrinsics.f(this.f82745a, deregister.f82745a) && Intrinsics.f(this.f82746b, deregister.f82746b);
        }

        public final int hashCode() {
            return this.f82746b.hashCode() + (this.f82745a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82745a, i);
            dest.writeString(this.f82746b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$DisableExtension;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload;", "", "toString", "()Ljava/lang/String;", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DisableExtension implements ApmDeeplinkPayload {

        @NotNull
        public static final Parcelable.Creator<DisableExtension> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Apm f82747a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DisableExtension((Apm) parcel.readParcelable(DisableExtension.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DisableExtension[i];
            }
        }

        public DisableExtension(Apm areaType) {
            Intrinsics.checkNotNullParameter(areaType, "areaType");
            this.f82747a = areaType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DisableExtension) && Intrinsics.f(this.f82747a, ((DisableExtension) obj2).f82747a);
        }

        public final int hashCode() {
            return this.f82747a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82747a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Pay;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload;", "", "toString", "()Ljava/lang/String;", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pay implements ApmDeeplinkPayload {

        @NotNull
        public static final Parcelable.Creator<Pay> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Apm f82748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f82749b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pay((Apm) parcel.readParcelable(Pay.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pay[i];
            }
        }

        public Pay(Apm areaType, String deeplink) {
            Intrinsics.checkNotNullParameter(areaType, "areaType");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f82748a = areaType;
            this.f82749b = deeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Pay)) {
                return false;
            }
            Pay pay = (Pay) obj2;
            return Intrinsics.f(this.f82748a, pay.f82748a) && Intrinsics.f(this.f82749b, pay.f82749b);
        }

        public final int hashCode() {
            return this.f82749b.hashCode() + (this.f82748a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82748a, i);
            dest.writeString(this.f82749b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$PaymentArea;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload;", "", "toString", "()Ljava/lang/String;", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentArea implements ApmDeeplinkPayload {

        @NotNull
        public static final Parcelable.Creator<PaymentArea> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Apm f82750a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentArea((Apm) parcel.readParcelable(PaymentArea.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentArea[i];
            }
        }

        public PaymentArea(Apm areaType) {
            Intrinsics.checkNotNullParameter(areaType, "areaType");
            this.f82750a = areaType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PaymentArea) && Intrinsics.f(this.f82750a, ((PaymentArea) obj2).f82750a);
        }

        public final int hashCode() {
            return this.f82750a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82750a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Settings;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload;", "", "toString", "()Ljava/lang/String;", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Settings implements ApmDeeplinkPayload {

        @NotNull
        public static final Parcelable.Creator<Settings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Apm f82751a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Settings((Apm) parcel.readParcelable(Settings.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Settings[i];
            }
        }

        public Settings(Apm areaType) {
            Intrinsics.checkNotNullParameter(areaType, "areaType");
            this.f82751a = areaType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Settings) && Intrinsics.f(this.f82751a, ((Settings) obj2).f82751a);
        }

        public final int hashCode() {
            return this.f82751a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82751a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload$Unavailable;", "Lcom/revolut/feature/retail/main_screen/container/models/action_payload/ApmDeeplinkPayload;", "", "toString", "()Ljava/lang/String;", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Unavailable implements ApmDeeplinkPayload {

        @NotNull
        public static final Parcelable.Creator<Unavailable> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Apm f82752a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Unavailable((Apm) parcel.readParcelable(Unavailable.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unavailable[i];
            }
        }

        public Unavailable(Apm areaType) {
            Intrinsics.checkNotNullParameter(areaType, "areaType");
            this.f82752a = areaType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Unavailable) && Intrinsics.f(this.f82752a, ((Unavailable) obj2).f82752a);
        }

        public final int hashCode() {
            return this.f82752a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82752a, i);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f82753a = new Companion();

        private Companion() {
        }
    }
}
