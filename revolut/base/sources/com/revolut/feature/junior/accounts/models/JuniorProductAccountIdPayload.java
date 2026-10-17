package com.revolut.feature.junior.accounts.models;

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
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/junior/accounts/models/JuniorProductAccountIdPayload;", "Lcom/revolut/feature/junior/accounts/models/JuniorPayload;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_junior_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class JuniorProductAccountIdPayload implements JuniorPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76718b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<JuniorProductAccountIdPayload> CREATOR = new c();

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f76719a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f76719a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("productAccountId", aVar, 2);
            pluginGeneratedSerialDescriptor.j("juniorId", false);
            pluginGeneratedSerialDescriptor.j("pocketId", true);
            pluginGeneratedSerialDescriptor.l(new com.revolut.feature.junior.accounts.models.a());
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, nlm.a.c(v1Var)};
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
            String str = null;
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
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new JuniorProductAccountIdPayload(i, strDecodeStringElement, str);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            JuniorProductAccountIdPayload value = (JuniorProductAccountIdPayload) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            String str = value.f76717a;
            String str2 = value.f76718b;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.junior.accounts.models.JuniorProductAccountIdPayload$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f76719a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorProductAccountIdPayload(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorProductAccountIdPayload[i];
        }
    }

    public /* synthetic */ JuniorProductAccountIdPayload(int i, String str, String str2) {
        if (1 != (i & 1)) {
            j1.f(a.f76719a.getDescriptor(), i, 1);
            throw null;
        }
        this.f76717a = str;
        if ((i & 2) == 0) {
            this.f76718b = null;
        } else {
            this.f76718b = str2;
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
        if (!(obj2 instanceof JuniorProductAccountIdPayload)) {
            return false;
        }
        JuniorProductAccountIdPayload juniorProductAccountIdPayload = (JuniorProductAccountIdPayload) obj2;
        return Intrinsics.f(this.f76717a, juniorProductAccountIdPayload.f76717a) && Intrinsics.f(this.f76718b, juniorProductAccountIdPayload.f76718b);
    }

    public final int hashCode() {
        int iHashCode = this.f76717a.hashCode() * 31;
        String str = this.f76718b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76717a);
        dest.writeString(this.f76718b);
    }

    public JuniorProductAccountIdPayload(String juniorId, String str) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f76717a = juniorId;
        this.f76718b = str;
    }
}
