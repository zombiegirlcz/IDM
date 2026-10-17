package com.onfido.hosted.web.module.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0004&'()B-\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÁ\u0001¢\u0006\u0002\b!J\u0019\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006*"}, d2 = {"Lcom/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput;", "Landroid/os/Parcelable;", "seen1", "", "sides", "Lcom/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput$Sides;", "type", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput$Sides;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput$Sides;Ljava/lang/String;)V", "getSides", "()Lcom/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput$Sides;", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_capture_sdk_core_release", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "Side", "Sides", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class ProofOfAddressCaptureSDKOutput implements Parcelable {

    @NotNull
    private final Sides sides;

    @NotNull
    private final String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<ProofOfAddressCaptureSDKOutput> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ProofOfAddressCaptureSDKOutput$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProofOfAddressCaptureSDKOutput> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ProofOfAddressCaptureSDKOutput createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProofOfAddressCaptureSDKOutput(Sides.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ProofOfAddressCaptureSDKOutput[] newArray(int i) {
            return new ProofOfAddressCaptureSDKOutput[i];
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B-\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÁ\u0001¢\u0006\u0002\b\u001fJ\u0019\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006&"}, d2 = {"Lcom/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput$Side;", "Landroid/os/Parcelable;", "seen1", "", "id", "", "type", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_capture_sdk_core_release", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @g
    public static final /* data */ class Side implements Parcelable {

        @NotNull
        private final String id;
        private final String type;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Parcelable.Creator<Side> CREATOR = new Creator();

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput$Side$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput$Side;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return ProofOfAddressCaptureSDKOutput$Side$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Side> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Side createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Side(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Side[] newArray(int i) {
                return new Side[i];
            }
        }

        @d
        public /* synthetic */ Side(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                j1.f(ProofOfAddressCaptureSDKOutput$Side$$serializer.INSTANCE.getDescriptor(), i, 3);
                throw null;
            }
            this.id = str;
            this.type = str2;
        }

        public static /* synthetic */ Side copy$default(Side side, String str, String str2, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = side.id;
            }
            if ((i & 2) != 0) {
                str2 = side.type;
            }
            return side.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$onfido_capture_sdk_core_release(Side self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.id);
            output.encodeNullableSerializableElement(serialDesc, 1, v1.f247718a, self.type);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final Side copy(@NotNull String id10, String type) {
            Intrinsics.checkNotNullParameter(id10, "id");
            return new Side(id10, type);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Side)) {
                return false;
            }
            Side side = (Side) other;
            return Intrinsics.f(this.id, side.id) && Intrinsics.f(this.type, side.type);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.type;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("Side(id=");
            sb6.append(this.id);
            sb6.append(", type=");
            return a.u(sb6, this.type, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.id);
            parcel.writeString(this.type);
        }

        public Side(@NotNull String id10, String str) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.id = id10;
            this.type = str;
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B-\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÁ\u0001¢\u0006\u0002\b J\u0019\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006'"}, d2 = {"Lcom/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput$Sides;", "Landroid/os/Parcelable;", "seen1", "", "front", "Lcom/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput$Side;", "back", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput$Side;Lcom/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput$Side;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput$Side;Lcom/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput$Side;)V", "getBack", "()Lcom/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput$Side;", "getFront", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_capture_sdk_core_release", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "$serializer", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @g
    public static final /* data */ class Sides implements Parcelable {
        private final Side back;

        @NotNull
        private final Side front;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Parcelable.Creator<Sides> CREATOR = new Creator();

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput$Sides$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput$Sides;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return ProofOfAddressCaptureSDKOutput$Sides$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Sides> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Sides createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable.Creator<Side> creator = Side.CREATOR;
                return new Sides(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final Sides[] newArray(int i) {
                return new Sides[i];
            }
        }

        @d
        public /* synthetic */ Sides(int i, Side side, Side side2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                j1.f(ProofOfAddressCaptureSDKOutput$Sides$$serializer.INSTANCE.getDescriptor(), i, 3);
                throw null;
            }
            this.front = side;
            this.back = side2;
        }

        public static /* synthetic */ Sides copy$default(Sides sides, Side side, Side side2, int i, Object obj2) {
            if ((i & 1) != 0) {
                side = sides.front;
            }
            if ((i & 2) != 0) {
                side2 = sides.back;
            }
            return sides.copy(side, side2);
        }

        public static final /* synthetic */ void write$Self$onfido_capture_sdk_core_release(Sides self, CompositeEncoder output, SerialDescriptor serialDesc) {
            ProofOfAddressCaptureSDKOutput$Side$$serializer proofOfAddressCaptureSDKOutput$Side$$serializer = ProofOfAddressCaptureSDKOutput$Side$$serializer.INSTANCE;
            output.encodeSerializableElement(serialDesc, 0, proofOfAddressCaptureSDKOutput$Side$$serializer, self.front);
            output.encodeNullableSerializableElement(serialDesc, 1, proofOfAddressCaptureSDKOutput$Side$$serializer, self.back);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Side getFront() {
            return this.front;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Side getBack() {
            return this.back;
        }

        @NotNull
        public final Sides copy(@NotNull Side front, Side back) {
            Intrinsics.checkNotNullParameter(front, "front");
            return new Sides(front, back);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sides)) {
                return false;
            }
            Sides sides = (Sides) other;
            return Intrinsics.f(this.front, sides.front) && Intrinsics.f(this.back, sides.back);
        }

        public final Side getBack() {
            return this.back;
        }

        @NotNull
        public final Side getFront() {
            return this.front;
        }

        public int hashCode() {
            int iHashCode = this.front.hashCode() * 31;
            Side side = this.back;
            return iHashCode + (side == null ? 0 : side.hashCode());
        }

        @NotNull
        public String toString() {
            return "Sides(front=" + this.front + ", back=" + this.back + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            this.front.writeToParcel(parcel, flags);
            Side side = this.back;
            if (side == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                side.writeToParcel(parcel, flags);
            }
        }

        public Sides(@NotNull Side front, Side side) {
            Intrinsics.checkNotNullParameter(front, "front");
            this.front = front;
            this.back = side;
        }
    }

    @d
    public /* synthetic */ ProofOfAddressCaptureSDKOutput(int i, Sides sides, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            j1.f(ProofOfAddressCaptureSDKOutput$$serializer.INSTANCE.getDescriptor(), i, 3);
            throw null;
        }
        this.sides = sides;
        this.type = str;
    }

    public static /* synthetic */ ProofOfAddressCaptureSDKOutput copy$default(ProofOfAddressCaptureSDKOutput proofOfAddressCaptureSDKOutput, Sides sides, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            sides = proofOfAddressCaptureSDKOutput.sides;
        }
        if ((i & 2) != 0) {
            str = proofOfAddressCaptureSDKOutput.type;
        }
        return proofOfAddressCaptureSDKOutput.copy(sides, str);
    }

    public static final /* synthetic */ void write$Self$onfido_capture_sdk_core_release(ProofOfAddressCaptureSDKOutput self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, ProofOfAddressCaptureSDKOutput$Sides$$serializer.INSTANCE, self.sides);
        output.encodeStringElement(serialDesc, 1, self.type);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Sides getSides() {
        return this.sides;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final ProofOfAddressCaptureSDKOutput copy(@NotNull Sides sides, @NotNull String type) {
        Intrinsics.checkNotNullParameter(sides, "sides");
        Intrinsics.checkNotNullParameter(type, "type");
        return new ProofOfAddressCaptureSDKOutput(sides, type);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProofOfAddressCaptureSDKOutput)) {
            return false;
        }
        ProofOfAddressCaptureSDKOutput proofOfAddressCaptureSDKOutput = (ProofOfAddressCaptureSDKOutput) other;
        return Intrinsics.f(this.sides, proofOfAddressCaptureSDKOutput.sides) && Intrinsics.f(this.type, proofOfAddressCaptureSDKOutput.type);
    }

    @NotNull
    public final Sides getSides() {
        return this.sides;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + (this.sides.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("ProofOfAddressCaptureSDKOutput(sides=");
        sb6.append(this.sides);
        sb6.append(", type=");
        return a.u(sb6, this.type, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.sides.writeToParcel(parcel, flags);
        parcel.writeString(this.type);
    }

    public ProofOfAddressCaptureSDKOutput(@NotNull Sides sides, @NotNull String type) {
        Intrinsics.checkNotNullParameter(sides, "sides");
        Intrinsics.checkNotNullParameter(type, "type");
        this.sides = sides;
        this.type = type;
    }
}
