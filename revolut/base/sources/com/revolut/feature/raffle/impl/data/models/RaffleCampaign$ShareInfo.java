package com.revolut.feature.raffle.impl.data.models;

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

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"com/revolut/feature/raffle/impl/data/models/RaffleCampaign$ShareInfo", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_raffle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class RaffleCampaign$ShareInfo implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81627c;
    public final String d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<RaffleCampaign$ShareInfo> CREATOR = new c();

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f81628a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f81628a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.raffle.impl.data.models.RaffleCampaign.ShareInfo", aVar, 4);
            pluginGeneratedSerialDescriptor.j("assetUrl", false);
            pluginGeneratedSerialDescriptor.j("title", false);
            pluginGeneratedSerialDescriptor.j("subtitle", false);
            pluginGeneratedSerialDescriptor.j("url", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, v1Var, nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            String str = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                } else if (iD == 2) {
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
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
            return new RaffleCampaign$ShareInfo(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, str);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            RaffleCampaign$ShareInfo value = (RaffleCampaign$ShareInfo) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f81625a);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f81626b);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f81627c);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, value.d);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.raffle.impl.data.models.RaffleCampaign$ShareInfo$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f81628a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RaffleCampaign$ShareInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RaffleCampaign$ShareInfo[i];
        }
    }

    public /* synthetic */ RaffleCampaign$ShareInfo(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(a.f81628a.getDescriptor(), i, 15);
            throw null;
        }
        this.f81625a = str;
        this.f81626b = str2;
        this.f81627c = str3;
        this.d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RaffleCampaign$ShareInfo)) {
            return false;
        }
        RaffleCampaign$ShareInfo raffleCampaign$ShareInfo = (RaffleCampaign$ShareInfo) obj2;
        return Intrinsics.f(this.f81625a, raffleCampaign$ShareInfo.f81625a) && Intrinsics.f(this.f81626b, raffleCampaign$ShareInfo.f81626b) && Intrinsics.f(this.f81627c, raffleCampaign$ShareInfo.f81627c) && Intrinsics.f(this.d, raffleCampaign$ShareInfo.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f81625a.hashCode() * 31, 31, this.f81626b), 31, this.f81627c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81625a);
        dest.writeString(this.f81626b);
        dest.writeString(this.f81627c);
        dest.writeString(this.d);
    }

    public RaffleCampaign$ShareInfo(String assetUrl, String title, String subtitle, String str) {
        Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f81625a = assetUrl;
        this.f81626b = title;
        this.f81627c = subtitle;
        this.d = str;
    }
}
