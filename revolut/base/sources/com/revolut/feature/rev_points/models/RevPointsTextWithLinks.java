package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
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
import m05.d;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsTextWithLinks;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Link", "a", "b", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class RevPointsTextWithLinks implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f84048b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<RevPointsTextWithLinks> CREATOR = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f84046c = {null, j.c(k.PUBLICATION, new d(13))};

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsTextWithLinks$Link;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Link implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f84051c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Link> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f84052a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f84052a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.rev_points.models.RevPointsTextWithLinks.Link", aVar, 3);
                pluginGeneratedSerialDescriptor.j("text", false);
                pluginGeneratedSerialDescriptor.j("url", false);
                pluginGeneratedSerialDescriptor.j("termsScope", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                String strDecodeStringElement2 = null;
                String str = null;
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
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Link(i, strDecodeStringElement, strDecodeStringElement2, str);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Link value = (Link) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f84049a);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f84050b);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, value.f84051c);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.rev_points.models.RevPointsTextWithLinks$Link$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f84052a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Link(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Link[i];
            }
        }

        public /* synthetic */ Link(int i, String str, String str2, String str3) {
            if (7 != (i & 7)) {
                j1.f(a.f84052a.getDescriptor(), i, 7);
                throw null;
            }
            this.f84049a = str;
            this.f84050b = str2;
            this.f84051c = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Link)) {
                return false;
            }
            Link link = (Link) obj2;
            return Intrinsics.f(this.f84049a, link.f84049a) && Intrinsics.f(this.f84050b, link.f84050b) && Intrinsics.f(this.f84051c, link.f84051c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f84049a.hashCode() * 31, 31, this.f84050b);
            String str = this.f84051c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84049a);
            dest.writeString(this.f84050b);
            dest.writeString(this.f84051c);
        }

        public Link(String text, String url2, String str) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f84049a = text;
            this.f84050b = url2;
            this.f84051c = str;
        }
    }

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f84053a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f84053a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.rev_points.models.RevPointsTextWithLinks", aVar, 2);
            pluginGeneratedSerialDescriptor.j("text", false);
            pluginGeneratedSerialDescriptor.j("links", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{v1.f247718a, nlm.a.c((KSerializer) RevPointsTextWithLinks.f84046c[1].getValue())};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = RevPointsTextWithLinks.f84046c;
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            boolean z = true;
            int i = 0;
            List list = null;
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
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (b) lazyArr[1].getValue(), list);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new RevPointsTextWithLinks(i, strDecodeStringElement, list);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            RevPointsTextWithLinks value = (RevPointsTextWithLinks) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = RevPointsTextWithLinks.f84046c;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f84047a);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), value.f84048b);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.rev_points.models.RevPointsTextWithLinks$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f84053a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Link.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new RevPointsTextWithLinks(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsTextWithLinks[i];
        }
    }

    public /* synthetic */ RevPointsTextWithLinks(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(a.f84053a.getDescriptor(), i, 3);
            throw null;
        }
        this.f84047a = str;
        this.f84048b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsTextWithLinks)) {
            return false;
        }
        RevPointsTextWithLinks revPointsTextWithLinks = (RevPointsTextWithLinks) obj2;
        return Intrinsics.f(this.f84047a, revPointsTextWithLinks.f84047a) && Intrinsics.f(this.f84048b, revPointsTextWithLinks.f84048b);
    }

    public final int hashCode() {
        int iHashCode = this.f84047a.hashCode() * 31;
        List list = this.f84048b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84047a);
        List list = this.f84048b;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((Link) itQ.next()).writeToParcel(dest, i);
        }
    }

    public RevPointsTextWithLinks(String text, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f84047a = text;
        this.f84048b = arrayList;
    }
}
