package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
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
import m05.d;
import m1c.l;
import mlm.b;
import mlm.g;
import mlm.h;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/rev_points/models/Logo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "m1c/l", "a", "b", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class Logo implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f83955b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<Logo> CREATOR = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f83953c = {null, j.c(k.PUBLICATION, new d(8))};

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f83956a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f83956a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.rev_points.models.Logo", aVar, 2);
            pluginGeneratedSerialDescriptor.j("logo", false);
            pluginGeneratedSerialDescriptor.j("type", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{v1.f247718a, Logo.f83953c[1].getValue()};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = Logo.f83953c;
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            boolean z = true;
            int i = 0;
            l lVar = null;
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
                    lVar = (l) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (b) lazyArr[1].getValue(), lVar);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new Logo(i, strDecodeStringElement, lVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            Logo value = (Logo) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = Logo.f83953c;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f83954a);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), value.f83955b);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.rev_points.models.Logo$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f83956a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Logo(parcel.readString(), l.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Logo[i];
        }
    }

    public /* synthetic */ Logo(int i, String str, l lVar) {
        if (3 != (i & 3)) {
            j1.f(a.f83956a.getDescriptor(), i, 3);
            throw null;
        }
        this.f83954a = str;
        this.f83955b = lVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Logo)) {
            return false;
        }
        Logo logo = (Logo) obj2;
        return Intrinsics.f(this.f83954a, logo.f83954a) && this.f83955b == logo.f83955b;
    }

    public final int hashCode() {
        return this.f83955b.hashCode() + (this.f83954a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f83954a);
        dest.writeString(this.f83955b.name());
    }

    public Logo(String logo, l type) {
        Intrinsics.checkNotNullParameter(logo, "logo");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f83954a = logo;
        this.f83955b = type;
    }
}
