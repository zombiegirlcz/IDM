package com.revolut.feature.payments.air.widget.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.air.widget.impl.model.WidgetRecipient;
import dj0.d;
import ie0.o;
import ip0.v7;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mlm.b;
import mlm.g;
import mlm.h;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/model/TransferWidgetDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class TransferWidgetDetails implements Parcelable {
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetRecipient f79077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WidgetTransferSource f79078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f79079c;
    public final String d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<TransferWidgetDetails> CREATOR = new c();

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f79080a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f79080a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.payments.air.widget.impl.model.TransferWidgetDetails", aVar, 4);
            pluginGeneratedSerialDescriptor.j("recipient", false);
            pluginGeneratedSerialDescriptor.j("transferSource", true);
            pluginGeneratedSerialDescriptor.j("amount", false);
            pluginGeneratedSerialDescriptor.j("transactionId", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = TransferWidgetDetails.e;
            return new KSerializer[]{lazyArr[0].getValue(), nlm.a.c((KSerializer) lazyArr[1].getValue()), o.f160615a, nlm.a.c(v1.f247718a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = TransferWidgetDetails.e;
            dVarBeginStructure.getClass();
            int i = 0;
            WidgetRecipient widgetRecipient = null;
            WidgetTransferSource widgetTransferSource = null;
            d dVar = null;
            String str = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    widgetRecipient = (WidgetRecipient) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (b) lazyArr[0].getValue(), widgetRecipient);
                    i |= 1;
                } else if (iD == 1) {
                    widgetTransferSource = (WidgetTransferSource) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (b) lazyArr[1].getValue(), widgetTransferSource);
                    i |= 2;
                } else if (iD == 2) {
                    dVar = (d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, o.f160615a, dVar);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new TransferWidgetDetails(i, widgetRecipient, widgetTransferSource, dVar, str);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            TransferWidgetDetails value = (TransferWidgetDetails) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = TransferWidgetDetails.e;
            h hVar = (h) lazyArr[0].getValue();
            WidgetRecipient widgetRecipient = value.f79077a;
            String str = value.d;
            WidgetTransferSource widgetTransferSource = value.f79078b;
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, hVar, widgetRecipient);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || widgetTransferSource != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), widgetTransferSource);
            }
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, o.f160615a, value.f79079c);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || str != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.payments.air.widget.impl.model.TransferWidgetDetails$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f79080a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferWidgetDetails((WidgetRecipient) parcel.readParcelable(TransferWidgetDetails.class.getClassLoader()), (WidgetTransferSource) parcel.readParcelable(TransferWidgetDetails.class.getClassLoader()), (d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferWidgetDetails[i];
        }
    }

    static {
        k kVar = k.PUBLICATION;
        e = new Lazy[]{j.c(kVar, new ok7.b(21)), j.c(kVar, new ok7.b(22)), null, null};
    }

    public /* synthetic */ TransferWidgetDetails(int i, WidgetRecipient widgetRecipient, WidgetTransferSource widgetTransferSource, d dVar, String str) {
        if (5 != (i & 5)) {
            j1.f(a.f79080a.getDescriptor(), i, 5);
            throw null;
        }
        this.f79077a = widgetRecipient;
        if ((i & 2) == 0) {
            this.f79078b = null;
        } else {
            this.f79078b = widgetTransferSource;
        }
        this.f79079c = dVar;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
    }

    public static TransferWidgetDetails a(TransferWidgetDetails transferWidgetDetails, WidgetRecipient.CreatedRecipient createdRecipient, String str, int i) {
        WidgetRecipient recipient = createdRecipient;
        if ((i & 1) != 0) {
            recipient = transferWidgetDetails.f79077a;
        }
        WidgetTransferSource widgetTransferSource = transferWidgetDetails.f79078b;
        d money = transferWidgetDetails.f79079c;
        if ((i & 8) != 0) {
            str = transferWidgetDetails.d;
        }
        transferWidgetDetails.getClass();
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(money, "money");
        return new TransferWidgetDetails(recipient, widgetTransferSource, money, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferWidgetDetails)) {
            return false;
        }
        TransferWidgetDetails transferWidgetDetails = (TransferWidgetDetails) obj2;
        return Intrinsics.f(this.f79077a, transferWidgetDetails.f79077a) && Intrinsics.f(this.f79078b, transferWidgetDetails.f79078b) && Intrinsics.f(this.f79079c, transferWidgetDetails.f79079c) && Intrinsics.f(this.d, transferWidgetDetails.d);
    }

    public final int hashCode() {
        int iHashCode = this.f79077a.hashCode() * 31;
        WidgetTransferSource widgetTransferSource = this.f79078b;
        int iC = v7.c((iHashCode + (widgetTransferSource == null ? 0 : widgetTransferSource.hashCode())) * 31, 31, this.f79079c);
        String str = this.d;
        return iC + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79077a, i);
        dest.writeParcelable(this.f79078b, i);
        dest.writeSerializable(this.f79079c);
        dest.writeString(this.d);
    }

    public TransferWidgetDetails(WidgetRecipient recipient, WidgetTransferSource widgetTransferSource, d money, String str) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(money, "money");
        this.f79077a = recipient;
        this.f79078b = widgetTransferSource;
        this.f79079c = money;
        this.d = str;
    }
}
