package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
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
import m1c.k1;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0004\u0006\u0007\b\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsRichText;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Placeholder", "m1c/k1", "a", "b", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class RevPointsRichText implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f84040b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<RevPointsRichText> CREATOR = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f84038c = {null, j.c(k.PUBLICATION, new d(10))};

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsRichText$Placeholder;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Placeholder implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k1 f84041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f84043c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Placeholder> CREATOR = new c();
        public static final Lazy[] d = {j.c(k.PUBLICATION, new d(11)), null, null};

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f84044a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f84044a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.rev_points.models.RevPointsRichText.Placeholder", aVar, 3);
                pluginGeneratedSerialDescriptor.j("formatting", false);
                pluginGeneratedSerialDescriptor.j("value", false);
                pluginGeneratedSerialDescriptor.j("fallback", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{Placeholder.d[0].getValue(), v1Var, v1Var};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Placeholder.d;
                dVarBeginStructure.getClass();
                k1 k1Var = null;
                boolean z = true;
                int i = 0;
                String strDecodeStringElement = null;
                String strDecodeStringElement2 = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        k1Var = (k1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (b) lazyArr[0].getValue(), k1Var);
                        i |= 1;
                    } else if (iD == 1) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Placeholder(i, k1Var, strDecodeStringElement, strDecodeStringElement2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Placeholder value = (Placeholder) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (h) Placeholder.d[0].getValue(), value.f84041a);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f84042b);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f84043c);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.rev_points.models.RevPointsRichText$Placeholder$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f84044a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Placeholder(k1.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Placeholder[i];
            }
        }

        public /* synthetic */ Placeholder(int i, k1 k1Var, String str, String str2) {
            if (7 != (i & 7)) {
                j1.f(a.f84044a.getDescriptor(), i, 7);
                throw null;
            }
            this.f84041a = k1Var;
            this.f84042b = str;
            this.f84043c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Placeholder)) {
                return false;
            }
            Placeholder placeholder = (Placeholder) obj2;
            return this.f84041a == placeholder.f84041a && Intrinsics.f(this.f84042b, placeholder.f84042b) && Intrinsics.f(this.f84043c, placeholder.f84043c);
        }

        public final int hashCode() {
            return this.f84043c.hashCode() + p.a.c(this.f84041a.hashCode() * 31, 31, this.f84042b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84041a.name());
            dest.writeString(this.f84042b);
            dest.writeString(this.f84043c);
        }

        public Placeholder(k1 formatting, String value, String fallback) {
            Intrinsics.checkNotNullParameter(formatting, "formatting");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(fallback, "fallback");
            this.f84041a = formatting;
            this.f84042b = value;
            this.f84043c = fallback;
        }
    }

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f84045a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f84045a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.rev_points.models.RevPointsRichText", aVar, 2);
            pluginGeneratedSerialDescriptor.j("text", false);
            pluginGeneratedSerialDescriptor.j("placeholders", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{v1.f247718a, nlm.a.c((KSerializer) RevPointsRichText.f84038c[1].getValue())};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = RevPointsRichText.f84038c;
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            boolean z = true;
            int i = 0;
            Map map = null;
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
                    map = (Map) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (b) lazyArr[1].getValue(), map);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new RevPointsRichText(map, strDecodeStringElement, i);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            RevPointsRichText value = (RevPointsRichText) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = RevPointsRichText.f84038c;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f84039a);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), value.f84040b);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.rev_points.models.RevPointsRichText$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f84045a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap2.put(parcel.readString(), Placeholder.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new RevPointsRichText(linkedHashMap, string);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsRichText[i];
        }
    }

    public RevPointsRichText(LinkedHashMap linkedHashMap, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f84039a = text;
        this.f84040b = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsRichText)) {
            return false;
        }
        RevPointsRichText revPointsRichText = (RevPointsRichText) obj2;
        return Intrinsics.f(this.f84039a, revPointsRichText.f84039a) && Intrinsics.f(this.f84040b, revPointsRichText.f84040b);
    }

    public final int hashCode() {
        int iHashCode = this.f84039a.hashCode() * 31;
        Map map = this.f84040b;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84039a);
        Map map = this.f84040b;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itV = l.v(dest, 1, map);
        while (itV.hasNext()) {
            Map.Entry entry = (Map.Entry) itV.next();
            dest.writeString((String) entry.getKey());
            ((Placeholder) entry.getValue()).writeToParcel(dest, i);
        }
    }

    public /* synthetic */ RevPointsRichText(Map map, String str, int i) {
        if (3 != (i & 3)) {
            j1.f(a.f84045a.getDescriptor(), i, 3);
            throw null;
        }
        this.f84039a = str;
        this.f84040b = map;
    }
}
