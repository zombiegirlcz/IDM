package com.revolut.feature.insurance_embedded.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import bu7.y;
import bu7.y0;
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
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_embedded/api/models/RemoteDocument;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class RemoteDocument implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f75845b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<RemoteDocument> CREATOR = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f75843c = {null, j.c(k.PUBLICATION, new y(5))};

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f75846a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f75846a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.api.models.RemoteDocument", aVar, 2);
            pluginGeneratedSerialDescriptor.j("url", false);
            pluginGeneratedSerialDescriptor.j("type", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{v1.f247718a, RemoteDocument.f75843c[1].getValue()};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = RemoteDocument.f75843c;
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            boolean z = true;
            int i = 0;
            y0 y0Var = null;
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
                    y0Var = (y0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), y0Var);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new RemoteDocument(i, strDecodeStringElement, y0Var);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            RemoteDocument value = (RemoteDocument) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = RemoteDocument.f75843c;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f75844a);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), value.f75845b);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.api.models.RemoteDocument$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f75846a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RemoteDocument(parcel.readString(), y0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RemoteDocument[i];
        }
    }

    public /* synthetic */ RemoteDocument(int i, String str, y0 y0Var) {
        if (3 != (i & 3)) {
            j1.f(a.f75846a.getDescriptor(), i, 3);
            throw null;
        }
        this.f75844a = str;
        this.f75845b = y0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RemoteDocument)) {
            return false;
        }
        RemoteDocument remoteDocument = (RemoteDocument) obj2;
        return Intrinsics.f(this.f75844a, remoteDocument.f75844a) && this.f75845b == remoteDocument.f75845b;
    }

    public final int hashCode() {
        return this.f75845b.hashCode() + (this.f75844a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75844a);
        dest.writeString(this.f75845b.name());
    }

    public RemoteDocument(String url2, y0 type) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f75844a = url2;
        this.f75845b = type;
    }
}
