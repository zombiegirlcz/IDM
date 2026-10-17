package com.revolut.feature.insurance_embedded.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import gu7.v1;
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
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0004\u0006\u0007\b\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/GenericBanner;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "GenericBannerButton", "GenericBannerAction", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class GenericBanner implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75941c;
    public final GenericBannerAction d;
    public final GenericBannerButton e;
    public final GenericBannerButton f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<GenericBanner> CREATOR = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f75938g = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new v1(7)), null, null};

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/GenericBanner$GenericBannerAction;", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "Deeplink", "a", "Lcom/revolut/feature/insurance_embedded/impl/data/model/GenericBanner$GenericBannerAction$Deeplink;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @rlm.g(discriminator = "type")
    @mlm.g
    public static abstract class GenericBannerAction implements Parcelable {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Object f75942a = yhm.j.c(yhm.k.PUBLICATION, new v1(8));

        /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.GenericBanner$GenericBannerAction$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @NotNull
            public final KSerializer serializer() {
                return (KSerializer) GenericBannerAction.f75942a.getValue();
            }
        }

        private GenericBannerAction() {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/GenericBanner$GenericBannerAction$Deeplink;", "Lcom/revolut/feature/insurance_embedded/impl/data/model/GenericBanner$GenericBannerAction;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @mlm.g
        public static final /* data */ class Deeplink extends GenericBannerAction {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f75943b;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            @NotNull
            public static final Parcelable.Creator<Deeplink> CREATOR = new c();

            public static final /* synthetic */ class a implements qlm.f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f75944a;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    f75944a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("DEEPLINK", aVar, 1);
                    pluginGeneratedSerialDescriptor.j("url", false);
                    pluginGeneratedSerialDescriptor.l(new m0());
                    descriptor = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // qlm.f0
                public final KSerializer[] childSerializers() {
                    return new KSerializer[]{qlm.v1.f247718a};
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
                    while (z) {
                        int iD = dVarBeginStructure.d(serialDescriptor);
                        if (iD == -1) {
                            z = false;
                        } else {
                            if (iD != 0) {
                                throw new UnknownFieldException(iD);
                            }
                            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                            i = 1;
                        }
                    }
                    dVarBeginStructure.endStructure(serialDescriptor);
                    return new Deeplink(i, strDecodeStringElement);
                }

                @Override // mlm.h, mlm.b
                public final SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // mlm.h
                public final void serialize(Encoder encoder, Object obj2) {
                    Deeplink value = (Deeplink) obj2;
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    SerialDescriptor serialDescriptor = descriptor;
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f75943b);
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.GenericBanner$GenericBannerAction$Deeplink$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return a.f75944a;
                }
            }

            public static final class c implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Deeplink(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Deeplink[i];
                }
            }

            public /* synthetic */ Deeplink(int i, String str) {
                if (1 == (i & 1)) {
                    this.f75943b = str;
                } else {
                    j1.f(a.f75944a.getDescriptor(), i, 1);
                    throw null;
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
                return (obj2 instanceof Deeplink) && Intrinsics.f(this.f75943b, ((Deeplink) obj2).f75943b);
            }

            public final int hashCode() {
                return this.f75943b.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f75943b);
            }

            public Deeplink(String url2) {
                Intrinsics.checkNotNullParameter(url2, "url");
                this.f75943b = url2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/GenericBanner$GenericBannerButton;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class GenericBannerButton implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GenericBannerAction f75947b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<GenericBannerButton> CREATOR = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Lazy[] f75945c = {null, yhm.j.c(yhm.k.PUBLICATION, new v1(9))};

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f75948a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f75948a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.model.GenericBanner.GenericBannerButton", aVar, 2);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("action", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{qlm.v1.f247718a, GenericBannerButton.f75945c[1].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = GenericBannerButton.f75945c;
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                GenericBannerAction genericBannerAction = null;
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
                        genericBannerAction = (GenericBannerAction) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), genericBannerAction);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new GenericBannerButton(i, strDecodeStringElement, genericBannerAction);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                GenericBannerButton value = (GenericBannerButton) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = GenericBannerButton.f75945c;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f75946a);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f75947b);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.GenericBanner$GenericBannerButton$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f75948a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GenericBannerButton(parcel.readString(), (GenericBannerAction) parcel.readParcelable(GenericBannerButton.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GenericBannerButton[i];
            }
        }

        public /* synthetic */ GenericBannerButton(int i, String str, GenericBannerAction genericBannerAction) {
            if (3 != (i & 3)) {
                j1.f(a.f75948a.getDescriptor(), i, 3);
                throw null;
            }
            this.f75946a = str;
            this.f75947b = genericBannerAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GenericBannerButton)) {
                return false;
            }
            GenericBannerButton genericBannerButton = (GenericBannerButton) obj2;
            return Intrinsics.f(this.f75946a, genericBannerButton.f75946a) && Intrinsics.f(this.f75947b, genericBannerButton.f75947b);
        }

        public final int hashCode() {
            return this.f75947b.hashCode() + (this.f75946a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75946a);
            dest.writeParcelable(this.f75947b, i);
        }

        public GenericBannerButton(String title, GenericBannerAction action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f75946a = title;
            this.f75947b = action;
        }
    }

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f75949a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f75949a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.model.GenericBanner", aVar, 6);
            pluginGeneratedSerialDescriptor.j("icon", false);
            pluginGeneratedSerialDescriptor.j("title", false);
            pluginGeneratedSerialDescriptor.j("description", false);
            pluginGeneratedSerialDescriptor.j("action", false);
            pluginGeneratedSerialDescriptor.j("primaryButton", false);
            pluginGeneratedSerialDescriptor.j("secondaryButton", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            KSerializer kSerializerC = nlm.a.c((KSerializer) GenericBanner.f75938g[3].getValue());
            GenericBannerButton.a aVar = GenericBannerButton.a.f75948a;
            KSerializer kSerializerC2 = nlm.a.c(aVar);
            KSerializer kSerializerC3 = nlm.a.c(aVar);
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, v1Var, kSerializerC, kSerializerC2, kSerializerC3};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = GenericBanner.f75938g;
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            GenericBannerAction genericBannerAction = null;
            GenericBannerButton genericBannerButton = null;
            GenericBannerButton genericBannerButton2 = null;
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
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        genericBannerAction = (GenericBannerAction) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), genericBannerAction);
                        i |= 8;
                        break;
                    case 4:
                        genericBannerButton = (GenericBannerButton) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, GenericBannerButton.a.f75948a, genericBannerButton);
                        i |= 16;
                        break;
                    case 5:
                        genericBannerButton2 = (GenericBannerButton) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, GenericBannerButton.a.f75948a, genericBannerButton2);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new GenericBanner(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, genericBannerAction, genericBannerButton, genericBannerButton2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            GenericBanner value = (GenericBanner) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = GenericBanner.f75938g;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f75939a);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f75940b);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f75941c);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
            GenericBannerButton.a aVar = GenericBannerButton.a.f75948a;
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, aVar, value.e);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, aVar, value.f);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.GenericBanner$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f75949a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GenericBanner(parcel.readString(), parcel.readString(), parcel.readString(), (GenericBannerAction) parcel.readParcelable(GenericBanner.class.getClassLoader()), parcel.readInt() == 0 ? null : GenericBannerButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GenericBannerButton.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GenericBanner[i];
        }
    }

    public /* synthetic */ GenericBanner(int i, String str, String str2, String str3, GenericBannerAction genericBannerAction, GenericBannerButton genericBannerButton, GenericBannerButton genericBannerButton2) {
        if (63 != (i & 63)) {
            j1.f(a.f75949a.getDescriptor(), i, 63);
            throw null;
        }
        this.f75939a = str;
        this.f75940b = str2;
        this.f75941c = str3;
        this.d = genericBannerAction;
        this.e = genericBannerButton;
        this.f = genericBannerButton2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GenericBanner)) {
            return false;
        }
        GenericBanner genericBanner = (GenericBanner) obj2;
        return Intrinsics.f(this.f75939a, genericBanner.f75939a) && Intrinsics.f(this.f75940b, genericBanner.f75940b) && Intrinsics.f(this.f75941c, genericBanner.f75941c) && Intrinsics.f(this.d, genericBanner.d) && Intrinsics.f(this.e, genericBanner.e) && Intrinsics.f(this.f, genericBanner.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f75939a.hashCode() * 31, 31, this.f75940b), 31, this.f75941c);
        GenericBannerAction genericBannerAction = this.d;
        int iHashCode = (iC + (genericBannerAction == null ? 0 : genericBannerAction.hashCode())) * 31;
        GenericBannerButton genericBannerButton = this.e;
        int iHashCode2 = (iHashCode + (genericBannerButton == null ? 0 : genericBannerButton.hashCode())) * 31;
        GenericBannerButton genericBannerButton2 = this.f;
        return iHashCode2 + (genericBannerButton2 != null ? genericBannerButton2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75939a);
        dest.writeString(this.f75940b);
        dest.writeString(this.f75941c);
        dest.writeParcelable(this.d, i);
        GenericBannerButton genericBannerButton = this.e;
        if (genericBannerButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            genericBannerButton.writeToParcel(dest, i);
        }
        GenericBannerButton genericBannerButton2 = this.f;
        if (genericBannerButton2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            genericBannerButton2.writeToParcel(dest, i);
        }
    }

    public GenericBanner(String icon, String title, String description, GenericBannerAction genericBannerAction, GenericBannerButton genericBannerButton, GenericBannerButton genericBannerButton2) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f75939a = icon;
        this.f75940b = title;
        this.f75941c = description;
        this.d = genericBannerAction;
        this.e = genericBannerButton;
        this.f = genericBannerButton2;
    }
}
