package com.revolut.feature.payments.splitbill.models.recurringsplit;

import android.os.Parcel;
import android.os.Parcelable;
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
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.j1;
import qlm.n0;
import qlm.v1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/payments/splitbill/models/recurringsplit/RecurringSplitParticipant;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_payments_splitbill_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class RecurringSplitParticipant implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f79926b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<RecurringSplitParticipant> CREATOR = new c();

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f79927a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f79927a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplitParticipant", aVar, 2);
            pluginGeneratedSerialDescriptor.j("participant", false);
            pluginGeneratedSerialDescriptor.j("percentage", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{v1.f247718a, nlm.a.c(n0.f247680a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            boolean z = true;
            int i = 0;
            Integer num = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, n0.f247680a, num);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new RecurringSplitParticipant(i, strDecodeStringElement, num);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            RecurringSplitParticipant value = (RecurringSplitParticipant) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            String str = value.f79925a;
            Integer num = value.f79926b;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || num != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, n0.f247680a, num);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplitParticipant$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f79927a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecurringSplitParticipant(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecurringSplitParticipant[i];
        }
    }

    public /* synthetic */ RecurringSplitParticipant(int i, String str, Integer num) {
        if (1 != (i & 1)) {
            j1.f(a.f79927a.getDescriptor(), i, 1);
            throw null;
        }
        this.f79925a = str;
        if ((i & 2) == 0) {
            this.f79926b = null;
        } else {
            this.f79926b = num;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RecurringSplitParticipant)) {
            return false;
        }
        RecurringSplitParticipant recurringSplitParticipant = (RecurringSplitParticipant) obj2;
        return Intrinsics.f(this.f79925a, recurringSplitParticipant.f79925a) && Intrinsics.f(this.f79926b, recurringSplitParticipant.f79926b);
    }

    public final int hashCode() {
        int iHashCode = this.f79925a.hashCode() * 31;
        Integer num = this.f79926b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79925a);
        Integer num = this.f79926b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }

    public RecurringSplitParticipant(String participant, Integer num) {
        Intrinsics.checkNotNullParameter(participant, "participant");
        this.f79925a = participant;
        this.f79926b = num;
    }
}
