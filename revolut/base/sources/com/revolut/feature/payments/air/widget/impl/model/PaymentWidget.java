package com.revolut.feature.payments.air.widget.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.air.widget.impl.model.TransferWidgetDetails;
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
import mlm.g;
import mlm.h;
import ok7.b;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import plm.d;
import qlm.f0;
import qlm.j1;
import qlm.t0;
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/model/PaymentWidget;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class PaymentWidget implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oo9.a f79073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferWidgetDetails f79074c;
    public final Long d;
    public final long e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f79075g;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<PaymentWidget> CREATOR = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f79071h = {null, j.c(k.PUBLICATION, new b(20)), null, null, null, null, null};

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f79076a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f79076a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.payments.air.widget.impl.model.PaymentWidget", aVar, 7);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("state", false);
            pluginGeneratedSerialDescriptor.j("details", false);
            pluginGeneratedSerialDescriptor.j("expiresAt", true);
            pluginGeneratedSerialDescriptor.j("createdDate", false);
            pluginGeneratedSerialDescriptor.j("updatedDate", false);
            pluginGeneratedSerialDescriptor.j("version", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = PaymentWidget.f79071h;
            t0 t0Var = t0.f247706a;
            return new KSerializer[]{v1.f247718a, lazyArr[1].getValue(), TransferWidgetDetails.a.f79080a, nlm.a.c(t0Var), t0Var, t0Var, t0Var};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = PaymentWidget.f79071h;
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            oo9.a aVar = null;
            TransferWidgetDetails transferWidgetDetails = null;
            Long l2 = null;
            long jDecodeLongElement = 0;
            long jDecodeLongElement2 = 0;
            long jDecodeLongElement3 = 0;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        aVar = (oo9.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), aVar);
                        i |= 2;
                        break;
                    case 2:
                        transferWidgetDetails = (TransferWidgetDetails) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, TransferWidgetDetails.a.f79080a, transferWidgetDetails);
                        i |= 4;
                        break;
                    case 3:
                        l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, t0.f247706a, l2);
                        i |= 8;
                        break;
                    case 4:
                        jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        jDecodeLongElement3 = dVarBeginStructure.decodeLongElement(serialDescriptor, 6);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new PaymentWidget(i, strDecodeStringElement, aVar, transferWidgetDetails, l2, jDecodeLongElement, jDecodeLongElement2, jDecodeLongElement3);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            PaymentWidget value = (PaymentWidget) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = PaymentWidget.f79071h;
            String str = value.f79072a;
            Long l2 = value.d;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), value.f79073b);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, TransferWidgetDetails.a.f79080a, value.f79074c);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || l2 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, t0.f247706a, l2);
            }
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 4, value.e);
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 5, value.f);
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 6, value.f79075g);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.payments.air.widget.impl.model.PaymentWidget$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f79076a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentWidget(parcel.readString(), oo9.a.valueOf(parcel.readString()), TransferWidgetDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentWidget[i];
        }
    }

    public /* synthetic */ PaymentWidget(int i, String str, oo9.a aVar, TransferWidgetDetails transferWidgetDetails, Long l2, long j2, long j3, long j5) {
        if (119 != (i & LDSFile.EF_SOD_TAG)) {
            j1.f(a.f79076a.getDescriptor(), i, LDSFile.EF_SOD_TAG);
            throw null;
        }
        this.f79072a = str;
        this.f79073b = aVar;
        this.f79074c = transferWidgetDetails;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        this.e = j2;
        this.f = j3;
        this.f79075g = j5;
    }

    public static PaymentWidget a(PaymentWidget paymentWidget, oo9.a aVar, TransferWidgetDetails details, int i) {
        String id10 = paymentWidget.f79072a;
        if ((i & 2) != 0) {
            aVar = paymentWidget.f79073b;
        }
        oo9.a state = aVar;
        Long l2 = paymentWidget.d;
        long j2 = paymentWidget.e;
        long j3 = paymentWidget.f;
        long j5 = paymentWidget.f79075g;
        paymentWidget.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(details, "details");
        return new PaymentWidget(id10, state, details, l2, j2, j3, j5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentWidget)) {
            return false;
        }
        PaymentWidget paymentWidget = (PaymentWidget) obj2;
        return Intrinsics.f(this.f79072a, paymentWidget.f79072a) && this.f79073b == paymentWidget.f79073b && Intrinsics.f(this.f79074c, paymentWidget.f79074c) && Intrinsics.f(this.d, paymentWidget.d) && this.e == paymentWidget.e && this.f == paymentWidget.f && this.f79075g == paymentWidget.f79075g;
    }

    public final int hashCode() {
        int iHashCode = (this.f79074c.hashCode() + ((this.f79073b.hashCode() + (this.f79072a.hashCode() * 31)) * 31)) * 31;
        Long l2 = this.d;
        return Long.hashCode(this.f79075g) + a0.d.c(a0.d.c((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79072a);
        dest.writeString(this.f79073b.name());
        this.f79074c.writeToParcel(dest, i);
        Long l2 = this.d;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        dest.writeLong(this.e);
        dest.writeLong(this.f);
        dest.writeLong(this.f79075g);
    }

    public PaymentWidget(String id10, oo9.a state, TransferWidgetDetails details, Long l2, long j2, long j3, long j5) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(details, "details");
        this.f79072a = id10;
        this.f79073b = state;
        this.f79074c = details;
        this.d = l2;
        this.e = j2;
        this.f = j3;
        this.f79075g = j5;
    }
}
