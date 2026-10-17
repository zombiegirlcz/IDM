package com.revolut.feature.insurance_embedded.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet;
import com.revolut.feature.insurance_embedded.impl.data.model.CfacPolicy;
import com.revolut.feature.insurance_embedded.impl.data.model.LegalNotice;
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
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0007\u0006\u0007\b\t\n\u000b\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/CoverageDetailsLayout;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "RestrictionsSection", "Restriction", "Exclusions", "Disclaimer", "FooterButton", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class CoverageDetailsLayout implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75907c;
    public final List d;
    public final Exclusions e;
    public final Disclaimer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LegalNotice f75908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FooterButton f75909h;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<CoverageDetailsLayout> CREATOR = new c();
    public static final Lazy[] i = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new gu7.d(18)), null, null, null, null};

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/CoverageDetailsLayout$Disclaimer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class Disclaimer implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75910a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Disclaimer> CREATOR = new c();

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f75911a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f75911a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout.Disclaimer", aVar, 1);
                pluginGeneratedSerialDescriptor.j("text", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{v1.f247718a};
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
                return new Disclaimer(i, strDecodeStringElement);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Disclaimer value = (Disclaimer) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f75910a);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout$Disclaimer$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f75911a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Disclaimer(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Disclaimer[i];
            }
        }

        public /* synthetic */ Disclaimer(int i, String str) {
            if (1 == (i & 1)) {
                this.f75910a = str;
            } else {
                j1.f(a.f75911a.getDescriptor(), i, 1);
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
            return (obj2 instanceof Disclaimer) && Intrinsics.f(this.f75910a, ((Disclaimer) obj2).f75910a);
        }

        public final int hashCode() {
            return this.f75910a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75910a);
        }

        public Disclaimer(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f75910a = text;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/CoverageDetailsLayout$Exclusions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class Exclusions implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f75914b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Exclusions> CREATOR = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Lazy[] f75912c = {null, yhm.j.c(yhm.k.PUBLICATION, new gu7.d(19))};

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f75915a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f75915a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout.Exclusions", aVar, 2);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("items", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{nlm.a.c(v1.f247718a), Exclusions.f75912c[1].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Exclusions.f75912c;
                dVarBeginStructure.getClass();
                String str = null;
                boolean z = true;
                int i = 0;
                List list = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Exclusions(i, str, list);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Exclusions value = (Exclusions) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Exclusions.f75912c;
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, value.f75913a);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f75914b);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout$Exclusions$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f75915a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Exclusions(parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Exclusions[i];
            }
        }

        public /* synthetic */ Exclusions(int i, String str, List list) {
            if (3 != (i & 3)) {
                j1.f(a.f75915a.getDescriptor(), i, 3);
                throw null;
            }
            this.f75913a = str;
            this.f75914b = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Exclusions)) {
                return false;
            }
            Exclusions exclusions = (Exclusions) obj2;
            return Intrinsics.f(this.f75913a, exclusions.f75913a) && Intrinsics.f(this.f75914b, exclusions.f75914b);
        }

        public final int hashCode() {
            String str = this.f75913a;
            return this.f75914b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75913a);
            dest.writeStringList(this.f75914b);
        }

        public Exclusions(String str, List items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f75913a = str;
            this.f75914b = items;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/CoverageDetailsLayout$FooterButton;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Action", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class FooterButton implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Action f75918b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<FooterButton> CREATOR = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Lazy[] f75916c = {null, yhm.j.c(yhm.k.PUBLICATION, new gu7.d(20))};

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/CoverageDetailsLayout$FooterButton$Action;", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "Upgrade", "MakeClaim", "MakeCfacClaim", "Deeplink", "a", "Lcom/revolut/feature/insurance_embedded/impl/data/model/CoverageDetailsLayout$FooterButton$Action$Deeplink;", "Lcom/revolut/feature/insurance_embedded/impl/data/model/CoverageDetailsLayout$FooterButton$Action$MakeCfacClaim;", "Lcom/revolut/feature/insurance_embedded/impl/data/model/CoverageDetailsLayout$FooterButton$Action$MakeClaim;", "Lcom/revolut/feature/insurance_embedded/impl/data/model/CoverageDetailsLayout$FooterButton$Action$Upgrade;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @rlm.g(discriminator = "type")
        @mlm.g
        public static abstract class Action implements Parcelable {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Object f75919a = yhm.j.c(yhm.k.PUBLICATION, new gu7.d(21));

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/CoverageDetailsLayout$FooterButton$Action$MakeClaim;", "Lcom/revolut/feature/insurance_embedded/impl/data/model/CoverageDetailsLayout$FooterButton$Action;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            @mlm.g
            public static final class MakeClaim extends Action {

                @NotNull
                public static final MakeClaim INSTANCE = new MakeClaim();

                @NotNull
                public static final Parcelable.Creator<MakeClaim> CREATOR = new a();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final /* synthetic */ Object f75924b = yhm.j.c(yhm.k.PUBLICATION, new gu7.d(22));

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return MakeClaim.INSTANCE;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new MakeClaim[i];
                    }
                }

                private MakeClaim() {
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
                @NotNull
                public final KSerializer serializer() {
                    return (KSerializer) f75924b.getValue();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }
            }

            /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout$FooterButton$Action$a, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
                @NotNull
                public final KSerializer serializer() {
                    return (KSerializer) Action.f75919a.getValue();
                }
            }

            private Action() {
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/CoverageDetailsLayout$FooterButton$Action$Deeplink;", "Lcom/revolut/feature/insurance_embedded/impl/data/model/CoverageDetailsLayout$FooterButton$Action;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            @mlm.g
            public static final /* data */ class Deeplink extends Action {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f75920b;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                @NotNull
                public static final Companion INSTANCE = new Companion();

                @NotNull
                public static final Parcelable.Creator<Deeplink> CREATOR = new c();

                public static final /* synthetic */ class a implements qlm.f0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final a f75921a;

                    @NotNull
                    private static final SerialDescriptor descriptor;

                    static {
                        a aVar = new a();
                        f75921a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("DEEPLINK", aVar, 1);
                        pluginGeneratedSerialDescriptor.j("url", false);
                        pluginGeneratedSerialDescriptor.l(new e0());
                        descriptor = pluginGeneratedSerialDescriptor;
                    }

                    private a() {
                    }

                    @Override // qlm.f0
                    public final KSerializer[] childSerializers() {
                        return new KSerializer[]{v1.f247718a};
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
                        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f75920b);
                        compositeEncoderBeginStructure.endStructure(serialDescriptor);
                    }
                }

                /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout$FooterButton$Action$Deeplink$b, reason: from kotlin metadata */
                public static final class Companion {
                    private Companion() {
                    }

                    @NotNull
                    public final KSerializer serializer() {
                        return a.f75921a;
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
                        this.f75920b = str;
                    } else {
                        j1.f(a.f75921a.getDescriptor(), i, 1);
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
                    return (obj2 instanceof Deeplink) && Intrinsics.f(this.f75920b, ((Deeplink) obj2).f75920b);
                }

                public final int hashCode() {
                    return this.f75920b.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f75920b);
                }

                public Deeplink(String url2) {
                    Intrinsics.checkNotNullParameter(url2, "url");
                    this.f75920b = url2;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/CoverageDetailsLayout$FooterButton$Action$MakeCfacClaim;", "Lcom/revolut/feature/insurance_embedded/impl/data/model/CoverageDetailsLayout$FooterButton$Action;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            @mlm.g
            public static final /* data */ class MakeCfacClaim extends Action {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CfacPolicy f75922b;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                @NotNull
                public static final Companion INSTANCE = new Companion();

                @NotNull
                public static final Parcelable.Creator<MakeCfacClaim> CREATOR = new c();

                public static final /* synthetic */ class a implements qlm.f0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final a f75923a;

                    @NotNull
                    private static final SerialDescriptor descriptor;

                    static {
                        a aVar = new a();
                        f75923a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("MAKE_CFAC_CLAIM", aVar, 1);
                        pluginGeneratedSerialDescriptor.j("cfacPolicy", false);
                        pluginGeneratedSerialDescriptor.l(new e0());
                        descriptor = pluginGeneratedSerialDescriptor;
                    }

                    private a() {
                    }

                    @Override // qlm.f0
                    public final KSerializer[] childSerializers() {
                        return new KSerializer[]{CfacPolicy.a.f75904a};
                    }

                    @Override // mlm.b
                    public final Object deserialize(Decoder decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        SerialDescriptor serialDescriptor = descriptor;
                        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                        dVarBeginStructure.getClass();
                        CfacPolicy cfacPolicy = null;
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
                                cfacPolicy = (CfacPolicy) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, CfacPolicy.a.f75904a, cfacPolicy);
                                i = 1;
                            }
                        }
                        dVarBeginStructure.endStructure(serialDescriptor);
                        return new MakeCfacClaim(i, cfacPolicy);
                    }

                    @Override // mlm.h, mlm.b
                    public final SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // mlm.h
                    public final void serialize(Encoder encoder, Object obj2) {
                        MakeCfacClaim value = (MakeCfacClaim) obj2;
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        SerialDescriptor serialDescriptor = descriptor;
                        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                        Companion companion = MakeCfacClaim.INSTANCE;
                        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, CfacPolicy.a.f75904a, value.f75922b);
                        compositeEncoderBeginStructure.endStructure(serialDescriptor);
                    }
                }

                /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout$FooterButton$Action$MakeCfacClaim$b, reason: from kotlin metadata */
                public static final class Companion {
                    private Companion() {
                    }

                    @NotNull
                    public final KSerializer serializer() {
                        return a.f75923a;
                    }
                }

                public static final class c implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new MakeCfacClaim(CfacPolicy.CREATOR.createFromParcel(parcel));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new MakeCfacClaim[i];
                    }
                }

                public /* synthetic */ MakeCfacClaim(int i, CfacPolicy cfacPolicy) {
                    if (1 == (i & 1)) {
                        this.f75922b = cfacPolicy;
                    } else {
                        j1.f(a.f75923a.getDescriptor(), i, 1);
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
                    return (obj2 instanceof MakeCfacClaim) && Intrinsics.f(this.f75922b, ((MakeCfacClaim) obj2).f75922b);
                }

                public final int hashCode() {
                    return this.f75922b.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    this.f75922b.writeToParcel(dest, i);
                }

                public MakeCfacClaim(CfacPolicy cfacPolicy) {
                    Intrinsics.checkNotNullParameter(cfacPolicy, "cfacPolicy");
                    this.f75922b = cfacPolicy;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/CoverageDetailsLayout$FooterButton$Action$Upgrade;", "Lcom/revolut/feature/insurance_embedded/impl/data/model/CoverageDetailsLayout$FooterButton$Action;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            @mlm.g
            public static final /* data */ class Upgrade extends Action {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final List f75925b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f75926c;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                @NotNull
                public static final Companion INSTANCE = new Companion();

                @NotNull
                public static final Parcelable.Creator<Upgrade> CREATOR = new c();
                public static final Lazy[] d = {yhm.j.c(yhm.k.PUBLICATION, new gu7.d(23)), null};

                public static final /* synthetic */ class a implements qlm.f0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final a f75927a;

                    @NotNull
                    private static final SerialDescriptor descriptor;

                    static {
                        a aVar = new a();
                        f75927a = aVar;
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("UPGRADE", aVar, 2);
                        pluginGeneratedSerialDescriptor.j("planIds", false);
                        pluginGeneratedSerialDescriptor.j("selectedPlanId", false);
                        pluginGeneratedSerialDescriptor.l(new e0());
                        descriptor = pluginGeneratedSerialDescriptor;
                    }

                    private a() {
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // qlm.f0
                    public final KSerializer[] childSerializers() {
                        return new KSerializer[]{Upgrade.d[0].getValue(), nlm.a.c(v1.f247718a)};
                    }

                    @Override // mlm.b
                    public final Object deserialize(Decoder decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        SerialDescriptor serialDescriptor = descriptor;
                        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                        Lazy[] lazyArr = Upgrade.d;
                        dVarBeginStructure.getClass();
                        List list = null;
                        boolean z = true;
                        int i = 0;
                        String str = null;
                        while (z) {
                            int iD = dVarBeginStructure.d(serialDescriptor);
                            if (iD == -1) {
                                z = false;
                            } else if (iD == 0) {
                                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
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
                        return new Upgrade(i, list, str);
                    }

                    @Override // mlm.h, mlm.b
                    public final SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // mlm.h
                    public final void serialize(Encoder encoder, Object obj2) {
                        Upgrade value = (Upgrade) obj2;
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        SerialDescriptor serialDescriptor = descriptor;
                        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) Upgrade.d[0].getValue(), value.f75925b);
                        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, value.f75926c);
                        compositeEncoderBeginStructure.endStructure(serialDescriptor);
                    }
                }

                /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout$FooterButton$Action$Upgrade$b, reason: from kotlin metadata */
                public static final class Companion {
                    private Companion() {
                    }

                    @NotNull
                    public final KSerializer serializer() {
                        return a.f75927a;
                    }
                }

                public static final class c implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Upgrade(parcel.createStringArrayList(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Upgrade[i];
                    }
                }

                public /* synthetic */ Upgrade(int i, List list, String str) {
                    if (3 != (i & 3)) {
                        j1.f(a.f75927a.getDescriptor(), i, 3);
                        throw null;
                    }
                    this.f75925b = list;
                    this.f75926c = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Upgrade)) {
                        return false;
                    }
                    Upgrade upgrade = (Upgrade) obj2;
                    return Intrinsics.f(this.f75925b, upgrade.f75925b) && Intrinsics.f(this.f75926c, upgrade.f75926c);
                }

                public final int hashCode() {
                    int iHashCode = this.f75925b.hashCode() * 31;
                    String str = this.f75926c;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeStringList(this.f75925b);
                    dest.writeString(this.f75926c);
                }

                public Upgrade(List planIds, String str) {
                    Intrinsics.checkNotNullParameter(planIds, "planIds");
                    this.f75925b = planIds;
                    this.f75926c = str;
                }
            }
        }

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f75928a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f75928a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout.FooterButton", aVar, 2);
                pluginGeneratedSerialDescriptor.j("text", false);
                pluginGeneratedSerialDescriptor.j("action", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{v1.f247718a, FooterButton.f75916c[1].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = FooterButton.f75916c;
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                Action action = null;
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
                        action = (Action) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), action);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new FooterButton(i, strDecodeStringElement, action);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                FooterButton value = (FooterButton) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = FooterButton.f75916c;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f75917a);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f75918b);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout$FooterButton$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f75928a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FooterButton(parcel.readString(), (Action) parcel.readParcelable(FooterButton.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FooterButton[i];
            }
        }

        public /* synthetic */ FooterButton(int i, String str, Action action) {
            if (3 != (i & 3)) {
                j1.f(a.f75928a.getDescriptor(), i, 3);
                throw null;
            }
            this.f75917a = str;
            this.f75918b = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FooterButton)) {
                return false;
            }
            FooterButton footerButton = (FooterButton) obj2;
            return Intrinsics.f(this.f75917a, footerButton.f75917a) && Intrinsics.f(this.f75918b, footerButton.f75918b);
        }

        public final int hashCode() {
            return this.f75918b.hashCode() + (this.f75917a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75917a);
            dest.writeParcelable(this.f75918b, i);
        }

        public FooterButton(String text, Action action) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f75917a = text;
            this.f75918b = action;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/CoverageDetailsLayout$Restriction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class Restriction implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f75930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BottomSheet f75931c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Restriction> CREATOR = new c();

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f75932a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f75932a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout.Restriction", aVar, 3);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("value", false);
                pluginGeneratedSerialDescriptor.j("bottomSheet", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                KSerializer kSerializerC = nlm.a.c(BottomSheet.a.f75900a);
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var, kSerializerC};
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
                BottomSheet bottomSheet = null;
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
                        bottomSheet = (BottomSheet) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BottomSheet.a.f75900a, bottomSheet);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Restriction(i, strDecodeStringElement, strDecodeStringElement2, bottomSheet);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Restriction value = (Restriction) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f75929a);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f75930b);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, BottomSheet.a.f75900a, value.f75931c);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout$Restriction$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f75932a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Restriction(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BottomSheet.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Restriction[i];
            }
        }

        public /* synthetic */ Restriction(int i, String str, String str2, BottomSheet bottomSheet) {
            if (7 != (i & 7)) {
                j1.f(a.f75932a.getDescriptor(), i, 7);
                throw null;
            }
            this.f75929a = str;
            this.f75930b = str2;
            this.f75931c = bottomSheet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Restriction)) {
                return false;
            }
            Restriction restriction = (Restriction) obj2;
            return Intrinsics.f(this.f75929a, restriction.f75929a) && Intrinsics.f(this.f75930b, restriction.f75930b) && Intrinsics.f(this.f75931c, restriction.f75931c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f75929a.hashCode() * 31, 31, this.f75930b);
            BottomSheet bottomSheet = this.f75931c;
            return iC + (bottomSheet == null ? 0 : bottomSheet.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75929a);
            dest.writeString(this.f75930b);
            BottomSheet bottomSheet = this.f75931c;
            if (bottomSheet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                bottomSheet.writeToParcel(dest, i);
            }
        }

        public Restriction(String title, String value, BottomSheet bottomSheet) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f75929a = title;
            this.f75930b = value;
            this.f75931c = bottomSheet;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/CoverageDetailsLayout$RestrictionsSection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class RestrictionsSection implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f75935b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<RestrictionsSection> CREATOR = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Lazy[] f75933c = {null, yhm.j.c(yhm.k.PUBLICATION, new gu7.d(24))};

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f75936a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f75936a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout.RestrictionsSection", aVar, 2);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("items", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{nlm.a.c(v1.f247718a), RestrictionsSection.f75933c[1].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = RestrictionsSection.f75933c;
                dVarBeginStructure.getClass();
                String str = null;
                boolean z = true;
                int i = 0;
                List list = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new RestrictionsSection(i, str, list);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                RestrictionsSection value = (RestrictionsSection) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = RestrictionsSection.f75933c;
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, value.f75934a);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f75935b);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout$RestrictionsSection$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f75936a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Restriction.CREATOR, parcel, arrayList, iA, 1);
                }
                return new RestrictionsSection(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RestrictionsSection[i];
            }
        }

        public /* synthetic */ RestrictionsSection(int i, String str, List list) {
            if (3 != (i & 3)) {
                j1.f(a.f75936a.getDescriptor(), i, 3);
                throw null;
            }
            this.f75934a = str;
            this.f75935b = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RestrictionsSection)) {
                return false;
            }
            RestrictionsSection restrictionsSection = (RestrictionsSection) obj2;
            return Intrinsics.f(this.f75934a, restrictionsSection.f75934a) && Intrinsics.f(this.f75935b, restrictionsSection.f75935b);
        }

        public final int hashCode() {
            String str = this.f75934a;
            return this.f75935b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75934a);
            Iterator itV = p.a.v(this.f75935b, dest);
            while (itV.hasNext()) {
                ((Restriction) itV.next()).writeToParcel(dest, i);
            }
        }

        public RestrictionsSection(String str, ArrayList items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f75934a = str;
            this.f75935b = items;
        }
    }

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f75937a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f75937a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout", aVar, 8);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("title", false);
            pluginGeneratedSerialDescriptor.j("subtitle", false);
            pluginGeneratedSerialDescriptor.j("restrictions", false);
            pluginGeneratedSerialDescriptor.j("exclusions", false);
            pluginGeneratedSerialDescriptor.j("disclaimer", false);
            pluginGeneratedSerialDescriptor.j("legalNotice", false);
            pluginGeneratedSerialDescriptor.j("primaryButton", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = CoverageDetailsLayout.i;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var), lazyArr[3].getValue(), nlm.a.c(Exclusions.a.f75915a), nlm.a.c(Disclaimer.a.f75911a), nlm.a.c(LegalNotice.a.f75952a), nlm.a.c(FooterButton.a.f75928a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = CoverageDetailsLayout.i;
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String str = null;
            List list = null;
            Exclusions exclusions = null;
            Disclaimer disclaimer = null;
            LegalNotice legalNotice = null;
            FooterButton footerButton = null;
            int i = 0;
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
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                        i |= 4;
                        break;
                    case 3:
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                        i |= 8;
                        break;
                    case 4:
                        exclusions = (Exclusions) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, Exclusions.a.f75915a, exclusions);
                        i |= 16;
                        break;
                    case 5:
                        disclaimer = (Disclaimer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, Disclaimer.a.f75911a, disclaimer);
                        i |= 32;
                        break;
                    case 6:
                        legalNotice = (LegalNotice) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, LegalNotice.a.f75952a, legalNotice);
                        i |= 64;
                        break;
                    case 7:
                        footerButton = (FooterButton) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, FooterButton.a.f75928a, footerButton);
                        i |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new CoverageDetailsLayout(i, strDecodeStringElement, strDecodeStringElement2, str, list, exclusions, disclaimer, legalNotice, footerButton);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            CoverageDetailsLayout value = (CoverageDetailsLayout) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = CoverageDetailsLayout.i;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f75905a);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f75906b);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, value.f75907c);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, Exclusions.a.f75915a, value.e);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, Disclaimer.a.f75911a, value.f);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, LegalNotice.a.f75952a, value.f75908g);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, FooterButton.a.f75928a, value.f75909h);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f75937a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(RestrictionsSection.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CoverageDetailsLayout(string, string2, string3, arrayList, parcel.readInt() == 0 ? null : Exclusions.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Disclaimer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LegalNotice.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FooterButton.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CoverageDetailsLayout[i];
        }
    }

    public /* synthetic */ CoverageDetailsLayout(int i2, String str, String str2, String str3, List list, Exclusions exclusions, Disclaimer disclaimer, LegalNotice legalNotice, FooterButton footerButton) {
        if (255 != (i2 & 255)) {
            j1.f(a.f75937a.getDescriptor(), i2, 255);
            throw null;
        }
        this.f75905a = str;
        this.f75906b = str2;
        this.f75907c = str3;
        this.d = list;
        this.e = exclusions;
        this.f = disclaimer;
        this.f75908g = legalNotice;
        this.f75909h = footerButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CoverageDetailsLayout)) {
            return false;
        }
        CoverageDetailsLayout coverageDetailsLayout = (CoverageDetailsLayout) obj2;
        return Intrinsics.f(this.f75905a, coverageDetailsLayout.f75905a) && Intrinsics.f(this.f75906b, coverageDetailsLayout.f75906b) && Intrinsics.f(this.f75907c, coverageDetailsLayout.f75907c) && Intrinsics.f(this.d, coverageDetailsLayout.d) && Intrinsics.f(this.e, coverageDetailsLayout.e) && Intrinsics.f(this.f, coverageDetailsLayout.f) && Intrinsics.f(this.f75908g, coverageDetailsLayout.f75908g) && Intrinsics.f(this.f75909h, coverageDetailsLayout.f75909h);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f75905a.hashCode() * 31, 31, this.f75906b);
        String str = this.f75907c;
        int iD = p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        Exclusions exclusions = this.e;
        int iHashCode = (iD + (exclusions == null ? 0 : exclusions.hashCode())) * 31;
        Disclaimer disclaimer = this.f;
        int iHashCode2 = (iHashCode + (disclaimer == null ? 0 : disclaimer.f75910a.hashCode())) * 31;
        LegalNotice legalNotice = this.f75908g;
        int iHashCode3 = (iHashCode2 + (legalNotice == null ? 0 : legalNotice.hashCode())) * 31;
        FooterButton footerButton = this.f75909h;
        return iHashCode3 + (footerButton != null ? footerButton.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i2) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75905a);
        dest.writeString(this.f75906b);
        dest.writeString(this.f75907c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            ((RestrictionsSection) itV.next()).writeToParcel(dest, i2);
        }
        Exclusions exclusions = this.e;
        if (exclusions == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            exclusions.writeToParcel(dest, i2);
        }
        Disclaimer disclaimer = this.f;
        if (disclaimer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            disclaimer.writeToParcel(dest, i2);
        }
        LegalNotice legalNotice = this.f75908g;
        if (legalNotice == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            legalNotice.writeToParcel(dest, i2);
        }
        FooterButton footerButton = this.f75909h;
        if (footerButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            footerButton.writeToParcel(dest, i2);
        }
    }

    public CoverageDetailsLayout(String id10, String title, String str, List restrictions, Exclusions exclusions, Disclaimer disclaimer, LegalNotice legalNotice, FooterButton footerButton) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(restrictions, "restrictions");
        this.f75905a = id10;
        this.f75906b = title;
        this.f75907c = str;
        this.d = restrictions;
        this.e = exclusions;
        this.f = disclaimer;
        this.f75908g = legalNotice;
        this.f75909h = footerButton;
    }
}
