package com.revolut.feature.external_accounts.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import ho3.d;
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
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.h;
import qlm.j1;
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/external_accounts/api/model/LinkedAccountPayload;", "Lcom/revolut/feature/tab/accounts/models/ProductAccountId$Payload;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class LinkedAccountPayload implements ProductAccountId.Payload {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f72222c;
    public final boolean d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<LinkedAccountPayload> CREATOR = new c();
    public static final Lazy[] e = {null, null, j.c(k.PUBLICATION, new qba.c(12)), null};

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f72223a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f72223a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.api.model.LinkedAccountPayload", aVar, 4);
            pluginGeneratedSerialDescriptor.j("institutionId", false);
            pluginGeneratedSerialDescriptor.j("institutionName", false);
            pluginGeneratedSerialDescriptor.j("consentStatus", true);
            pluginGeneratedSerialDescriptor.j("requiresAisPreview", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = LinkedAccountPayload.e;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c((KSerializer) lazyArr[2].getValue()), h.f247648a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = LinkedAccountPayload.e;
            dVarBeginStructure.getClass();
            int i = 0;
            boolean zDecodeBooleanElement = false;
            String str = null;
            String str2 = null;
            d dVar = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                    i |= 1;
                } else if (iD == 1) {
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                    i |= 2;
                } else if (iD == 2) {
                    dVar = (d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (b) lazyArr[2].getValue(), dVar);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new LinkedAccountPayload(i, str, str2, dVar, zDecodeBooleanElement);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            LinkedAccountPayload value = (LinkedAccountPayload) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = LinkedAccountPayload.e;
            v1 v1Var = v1.f247718a;
            String str = value.f72220a;
            boolean z = value.d;
            d dVar = value.f72222c;
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, str);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, value.f72221b);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || dVar != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), dVar);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || z) {
                compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 3, z);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.external_accounts.api.model.LinkedAccountPayload$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f72223a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkedAccountPayload(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : d.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LinkedAccountPayload[i];
        }
    }

    public /* synthetic */ LinkedAccountPayload(int i, String str, String str2, d dVar, boolean z) {
        if (3 != (i & 3)) {
            j1.f(a.f72223a.getDescriptor(), i, 3);
            throw null;
        }
        this.f72220a = str;
        this.f72221b = str2;
        if ((i & 4) == 0) {
            this.f72222c = null;
        } else {
            this.f72222c = dVar;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
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
        if (!(obj2 instanceof LinkedAccountPayload)) {
            return false;
        }
        LinkedAccountPayload linkedAccountPayload = (LinkedAccountPayload) obj2;
        return Intrinsics.f(this.f72220a, linkedAccountPayload.f72220a) && Intrinsics.f(this.f72221b, linkedAccountPayload.f72221b) && this.f72222c == linkedAccountPayload.f72222c && this.d == linkedAccountPayload.d;
    }

    public final int hashCode() {
        String str = this.f72220a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f72221b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        d dVar = this.f72222c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72220a);
        dest.writeString(this.f72221b);
        d dVar = this.f72222c;
        if (dVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(dVar.name());
        }
        dest.writeInt(this.d ? 1 : 0);
    }

    public LinkedAccountPayload(String str, String str2, d dVar, boolean z) {
        this.f72220a = str;
        this.f72221b = str2;
        this.f72222c = dVar;
        this.d = z;
    }
}
