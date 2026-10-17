package com.revolut.feature.payments.splitbill.models.recurringsplit;

import a2a.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplitSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.j1;
import qlm.t0;
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/payments/splitbill/models/recurringsplit/RecurringSplit;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a2a/e", "a", "b", "feature_payments_splitbill_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class RecurringSplit implements Parcelable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f79919h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecurringSplitSource f79921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f79922c;
    public final List d;
    public final String e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f79923g;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<RecurringSplit> CREATOR = new c();

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f79924a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f79924a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit", aVar, 7);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("source", false);
            pluginGeneratedSerialDescriptor.j("state", false);
            pluginGeneratedSerialDescriptor.j("participantsSplits", true);
            pluginGeneratedSerialDescriptor.j("comment", true);
            pluginGeneratedSerialDescriptor.j("createdDate", false);
            pluginGeneratedSerialDescriptor.j("updatedDate", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = RecurringSplit.f79919h;
            v1 v1Var = v1.f247718a;
            t0 t0Var = t0.f247706a;
            return new KSerializer[]{v1Var, RecurringSplitSource.a.f79931a, lazyArr[2].getValue(), lazyArr[3].getValue(), nlm.a.c(v1Var), t0Var, t0Var};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = RecurringSplit.f79919h;
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            RecurringSplitSource recurringSplitSource = null;
            e eVar = null;
            List list = null;
            String str = null;
            long jDecodeLongElement = 0;
            long jDecodeLongElement2 = 0;
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
                        recurringSplitSource = (RecurringSplitSource) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, RecurringSplitSource.a.f79931a, recurringSplitSource);
                        i |= 2;
                        break;
                    case 2:
                        eVar = (e) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), eVar);
                        i |= 4;
                        break;
                    case 3:
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                        i |= 8;
                        break;
                    case 4:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str);
                        i |= 16;
                        break;
                    case 5:
                        jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 6);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new RecurringSplit(i, strDecodeStringElement, recurringSplitSource, eVar, list, str, jDecodeLongElement, jDecodeLongElement2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            RecurringSplit value = (RecurringSplit) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = RecurringSplit.f79919h;
            String str = value.f79920a;
            String str2 = value.e;
            List list = value.d;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, RecurringSplitSource.a.f79931a, value.f79921b);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (h) lazyArr[2].getValue(), value.f79922c);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(list, zhm.f0.f322471a)) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (h) lazyArr[3].getValue(), list);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str2);
            }
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 5, value.f);
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 6, value.f79923g);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f79924a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            RecurringSplitSource recurringSplitSourceCreateFromParcel = RecurringSplitSource.CREATOR.createFromParcel(parcel);
            e eVarValueOf = e.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(RecurringSplitParticipant.CREATOR, parcel, arrayList, iA, 1);
            }
            return new RecurringSplit(string, recurringSplitSourceCreateFromParcel, eVarValueOf, arrayList, parcel.readString(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecurringSplit[i];
        }
    }

    static {
        k kVar = k.PUBLICATION;
        f79919h = new Lazy[]{null, null, j.c(kVar, new a08.b(13)), j.c(kVar, new a08.b(14)), null, null, null};
    }

    public RecurringSplit(int i, String str, RecurringSplitSource recurringSplitSource, e eVar, List list, String str2, long j2, long j3) {
        if (103 != (i & 103)) {
            j1.f(a.f79924a.getDescriptor(), i, 103);
            throw null;
        }
        this.f79920a = str;
        this.f79921b = recurringSplitSource;
        this.f79922c = eVar;
        if ((i & 8) == 0) {
            this.d = zhm.f0.f322471a;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        this.f = j2;
        this.f79923g = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RecurringSplit)) {
            return false;
        }
        RecurringSplit recurringSplit = (RecurringSplit) obj2;
        return Intrinsics.f(this.f79920a, recurringSplit.f79920a) && Intrinsics.f(this.f79921b, recurringSplit.f79921b) && this.f79922c == recurringSplit.f79922c && Intrinsics.f(this.d, recurringSplit.d) && Intrinsics.f(this.e, recurringSplit.e) && this.f == recurringSplit.f && this.f79923g == recurringSplit.f79923g;
    }

    public final int hashCode() {
        int iD = p.a.d((this.f79922c.hashCode() + ((this.f79921b.hashCode() + (this.f79920a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        String str = this.e;
        return Long.hashCode(this.f79923g) + a0.d.c((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79920a);
        this.f79921b.writeToParcel(dest, i);
        dest.writeString(this.f79922c.name());
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            ((RecurringSplitParticipant) itV.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.e);
        dest.writeLong(this.f);
        dest.writeLong(this.f79923g);
    }

    public RecurringSplit(String id10, RecurringSplitSource source, e state, List participantsSplits, String str, long j2, long j3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(participantsSplits, "participantsSplits");
        this.f79920a = id10;
        this.f79921b = source;
        this.f79922c = state;
        this.d = participantsSplits;
        this.e = str;
        this.f = j2;
        this.f79923g = j3;
    }
}
