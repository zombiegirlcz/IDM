package com.revolut.feature.insurance_common.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
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
import mlm.b;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0004\u0006\u0007\b\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/revolut/feature/insurance_common/data/model/Banner;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Button", "Action", "a", "b", "feature_insurance_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class Banner implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75697c;
    public final String d;
    public final String e;
    public final Action f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Button f75698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Button f75699h;
    public final Boolean i;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<Banner> CREATOR = new c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Lazy[] f75694j = {null, null, null, null, null, j.c(k.PUBLICATION, new nme.c(25)), null, null, null};

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/insurance_common/data/model/Banner$Action;", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "Upgrade", "Faq", "Deeplink", "a", "Lcom/revolut/feature/insurance_common/data/model/Banner$Action$Deeplink;", "Lcom/revolut/feature/insurance_common/data/model/Banner$Action$Faq;", "Lcom/revolut/feature/insurance_common/data/model/Banner$Action$Upgrade;", "feature_insurance_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @rlm.g(discriminator = "type")
    @g
    public static abstract class Action implements Parcelable {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Object f75700a = j.c(k.PUBLICATION, new nme.c(26));

        /* JADX INFO: renamed from: com.revolut.feature.insurance_common.data.model.Banner$Action$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @NotNull
            public final KSerializer serializer() {
                return (KSerializer) Action.f75700a.getValue();
            }
        }

        private Action() {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_common/data/model/Banner$Action$Deeplink;", "Lcom/revolut/feature/insurance_common/data/model/Banner$Action;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @g
        public static final /* data */ class Deeplink extends Action {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f75701b;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            @NotNull
            public static final Parcelable.Creator<Deeplink> CREATOR = new c();

            public static final /* synthetic */ class a implements f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f75702a;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    f75702a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("DEEPLINK", aVar, 1);
                    pluginGeneratedSerialDescriptor.j("url", false);
                    pluginGeneratedSerialDescriptor.l(new com.revolut.feature.insurance_common.data.model.a());
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
                    d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
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
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f75701b);
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: com.revolut.feature.insurance_common.data.model.Banner$Action$Deeplink$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return a.f75702a;
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
                    this.f75701b = str;
                } else {
                    j1.f(a.f75702a.getDescriptor(), i, 1);
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
                return (obj2 instanceof Deeplink) && Intrinsics.f(this.f75701b, ((Deeplink) obj2).f75701b);
            }

            public final int hashCode() {
                return this.f75701b.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f75701b);
            }

            public Deeplink(String url2) {
                Intrinsics.checkNotNullParameter(url2, "url");
                this.f75701b = url2;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_common/data/model/Banner$Action$Faq;", "Lcom/revolut/feature/insurance_common/data/model/Banner$Action;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @g
        public static final /* data */ class Faq extends Action {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f75703b;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            @NotNull
            public static final Parcelable.Creator<Faq> CREATOR = new c();

            public static final /* synthetic */ class a implements f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f75704a;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    f75704a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("FAQ", aVar, 1);
                    pluginGeneratedSerialDescriptor.j("faqKey", false);
                    pluginGeneratedSerialDescriptor.l(new com.revolut.feature.insurance_common.data.model.a());
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
                    d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
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
                    return new Faq(i, strDecodeStringElement);
                }

                @Override // mlm.h, mlm.b
                public final SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // mlm.h
                public final void serialize(Encoder encoder, Object obj2) {
                    Faq value = (Faq) obj2;
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    SerialDescriptor serialDescriptor = descriptor;
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f75703b);
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: com.revolut.feature.insurance_common.data.model.Banner$Action$Faq$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return a.f75704a;
                }
            }

            public static final class c implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Faq(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Faq[i];
                }
            }

            public /* synthetic */ Faq(int i, String str) {
                if (1 == (i & 1)) {
                    this.f75703b = str;
                } else {
                    j1.f(a.f75704a.getDescriptor(), i, 1);
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
                return (obj2 instanceof Faq) && Intrinsics.f(this.f75703b, ((Faq) obj2).f75703b);
            }

            public final int hashCode() {
                return this.f75703b.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f75703b);
            }

            public Faq(String faqKey) {
                Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                this.f75703b = faqKey;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_common/data/model/Banner$Action$Upgrade;", "Lcom/revolut/feature/insurance_common/data/model/Banner$Action;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @g
        public static final /* data */ class Upgrade extends Action {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f75705b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f75706c;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            @NotNull
            public static final Parcelable.Creator<Upgrade> CREATOR = new c();
            public static final Lazy[] d = {j.c(k.PUBLICATION, new nme.c(27)), null};

            public static final /* synthetic */ class a implements f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f75707a;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    f75707a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("UPGRADE", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("planIds", false);
                    pluginGeneratedSerialDescriptor.j("selectedPlanId", false);
                    pluginGeneratedSerialDescriptor.l(new com.revolut.feature.insurance_common.data.model.a());
                    descriptor = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // qlm.f0
                public final KSerializer[] childSerializers() {
                    return new KSerializer[]{Upgrade.d[0].getValue(), v1.f247718a};
                }

                @Override // mlm.b
                public final Object deserialize(Decoder decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    SerialDescriptor serialDescriptor = descriptor;
                    d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                    Lazy[] lazyArr = Upgrade.d;
                    dVarBeginStructure.getClass();
                    List list = null;
                    boolean z = true;
                    int i = 0;
                    String strDecodeStringElement = null;
                    while (z) {
                        int iD = dVarBeginStructure.d(serialDescriptor);
                        if (iD == -1) {
                            z = false;
                        } else if (iD == 0) {
                            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (b) lazyArr[0].getValue(), list);
                            i |= 1;
                        } else {
                            if (iD != 1) {
                                throw new UnknownFieldException(iD);
                            }
                            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                            i |= 2;
                        }
                    }
                    dVarBeginStructure.endStructure(serialDescriptor);
                    return new Upgrade(i, list, strDecodeStringElement);
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
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (h) Upgrade.d[0].getValue(), value.f75705b);
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f75706c);
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: com.revolut.feature.insurance_common.data.model.Banner$Action$Upgrade$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return a.f75707a;
                }
            }

            public static final class c implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Upgrade(parcel.readString(), parcel.createStringArrayList());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Upgrade[i];
                }
            }

            public /* synthetic */ Upgrade(int i, List list, String str) {
                if (3 != (i & 3)) {
                    j1.f(a.f75707a.getDescriptor(), i, 3);
                    throw null;
                }
                this.f75705b = list;
                this.f75706c = str;
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
                return Intrinsics.f(this.f75705b, upgrade.f75705b) && Intrinsics.f(this.f75706c, upgrade.f75706c);
            }

            public final int hashCode() {
                return this.f75706c.hashCode() + (this.f75705b.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeStringList(this.f75705b);
                dest.writeString(this.f75706c);
            }

            public Upgrade(String selectedPlanId, ArrayList planIds) {
                Intrinsics.checkNotNullParameter(planIds, "planIds");
                Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
                this.f75705b = planIds;
                this.f75706c = selectedPlanId;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_common/data/model/Banner$Button;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Button implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f75709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Action f75710c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Button> CREATOR = new c();
        public static final Lazy[] d = {null, null, j.c(k.PUBLICATION, new nme.c(28))};

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f75711a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f75711a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_common.data.model.Banner.Button", aVar, 3);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("deeplink", false);
                pluginGeneratedSerialDescriptor.j("action", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = Button.d;
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, nlm.a.c(v1Var), nlm.a.c((KSerializer) lazyArr[2].getValue())};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Button.d;
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                String str = null;
                Action action = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                    } else if (iD == 1) {
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        action = (Action) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (b) lazyArr[2].getValue(), action);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Button(i, strDecodeStringElement, str, action);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Button value = (Button) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Button.d;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f75708a);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, value.f75709b);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (h) lazyArr[2].getValue(), value.f75710c);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.insurance_common.data.model.Banner$Button$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f75711a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Button(parcel.readString(), parcel.readString(), (Action) parcel.readParcelable(Button.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Button[i];
            }
        }

        public /* synthetic */ Button(int i, String str, String str2, Action action) {
            if (7 != (i & 7)) {
                j1.f(a.f75711a.getDescriptor(), i, 7);
                throw null;
            }
            this.f75708a = str;
            this.f75709b = str2;
            this.f75710c = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Button)) {
                return false;
            }
            Button button = (Button) obj2;
            return Intrinsics.f(this.f75708a, button.f75708a) && Intrinsics.f(this.f75709b, button.f75709b) && Intrinsics.f(this.f75710c, button.f75710c);
        }

        public final int hashCode() {
            int iHashCode = this.f75708a.hashCode() * 31;
            String str = this.f75709b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Action action = this.f75710c;
            return iHashCode2 + (action != null ? action.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75708a);
            dest.writeString(this.f75709b);
            dest.writeParcelable(this.f75710c, i);
        }

        public Button(String title, String str, Action action) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f75708a = title;
            this.f75709b = str;
            this.f75710c = action;
        }
    }

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f75712a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f75712a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_common.data.model.Banner", aVar, 9);
            pluginGeneratedSerialDescriptor.j("icon", false);
            pluginGeneratedSerialDescriptor.j("title", false);
            pluginGeneratedSerialDescriptor.j("description", false);
            pluginGeneratedSerialDescriptor.j("imageUrl", false);
            pluginGeneratedSerialDescriptor.j("deeplink", false);
            pluginGeneratedSerialDescriptor.j("action", false);
            pluginGeneratedSerialDescriptor.j("primaryButton", false);
            pluginGeneratedSerialDescriptor.j("secondaryButton", false);
            pluginGeneratedSerialDescriptor.j("closable", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = Banner.f75694j;
            v1 v1Var = v1.f247718a;
            KSerializer kSerializerC = nlm.a.c(v1Var);
            KSerializer kSerializerC2 = nlm.a.c(v1Var);
            KSerializer kSerializerC3 = nlm.a.c((KSerializer) lazyArr[5].getValue());
            Button.a aVar = Button.a.f75711a;
            return new KSerializer[]{kSerializerC, v1Var, v1Var, v1Var, kSerializerC2, kSerializerC3, nlm.a.c(aVar), nlm.a.c(aVar), nlm.a.c(qlm.h.f247648a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = Banner.f75694j;
            dVarBeginStructure.getClass();
            Boolean bool = null;
            String str = null;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            String str2 = null;
            Action action = null;
            Button button = null;
            Button button2 = null;
            boolean z = true;
            int i = 0;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                        i |= 1;
                        break;
                    case 1:
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str2);
                        i |= 16;
                        break;
                    case 5:
                        action = (Action) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (b) lazyArr[5].getValue(), action);
                        i |= 32;
                        break;
                    case 6:
                        button = (Button) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, Button.a.f75711a, button);
                        i |= 64;
                        break;
                    case 7:
                        button2 = (Button) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, Button.a.f75711a, button2);
                        i |= 128;
                        break;
                    case 8:
                        bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.h.f247648a, bool);
                        i |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new Banner(i, str, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, str2, action, button, button2, bool);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            Banner value = (Banner) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = Banner.f75694j;
            v1 v1Var = v1.f247718a;
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, value.f75695a);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f75696b);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f75697c);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, value.e);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (h) lazyArr[5].getValue(), value.f);
            Button.a aVar = Button.a.f75711a;
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, aVar, value.f75698g);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, aVar, value.f75699h);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, qlm.h.f247648a, value.i);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.insurance_common.data.model.Banner$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f75712a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Action action = (Action) parcel.readParcelable(Banner.class.getClassLoader());
            Boolean boolValueOf = null;
            Button buttonCreateFromParcel = parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel);
            Button buttonCreateFromParcel2 = parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Banner(string, string2, string3, string4, string5, action, buttonCreateFromParcel, buttonCreateFromParcel2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Banner[i];
        }
    }

    public /* synthetic */ Banner(int i, String str, String str2, String str3, String str4, String str5, Action action, Button button, Button button2, Boolean bool) {
        if (511 != (i & 511)) {
            j1.f(a.f75712a.getDescriptor(), i, 511);
            throw null;
        }
        this.f75695a = str;
        this.f75696b = str2;
        this.f75697c = str3;
        this.d = str4;
        this.e = str5;
        this.f = action;
        this.f75698g = button;
        this.f75699h = button2;
        this.i = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Banner)) {
            return false;
        }
        Banner banner = (Banner) obj2;
        return Intrinsics.f(this.f75695a, banner.f75695a) && Intrinsics.f(this.f75696b, banner.f75696b) && Intrinsics.f(this.f75697c, banner.f75697c) && Intrinsics.f(this.d, banner.d) && Intrinsics.f(this.e, banner.e) && Intrinsics.f(this.f, banner.f) && Intrinsics.f(this.f75698g, banner.f75698g) && Intrinsics.f(this.f75699h, banner.f75699h) && Intrinsics.f(this.i, banner.i);
    }

    public final int hashCode() {
        String str = this.f75695a;
        int iC = p.a.c(p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f75696b), 31, this.f75697c), 31, this.d);
        String str2 = this.e;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        Action action = this.f;
        int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
        Button button = this.f75698g;
        int iHashCode3 = (iHashCode2 + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.f75699h;
        int iHashCode4 = (iHashCode3 + (button2 == null ? 0 : button2.hashCode())) * 31;
        Boolean bool = this.i;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75695a);
        dest.writeString(this.f75696b);
        dest.writeString(this.f75697c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeParcelable(this.f, i);
        Button button = this.f75698g;
        if (button == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            button.writeToParcel(dest, i);
        }
        Button button2 = this.f75699h;
        if (button2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            button2.writeToParcel(dest, i);
        }
        Boolean bool = this.i;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }

    public Banner(String str, String title, String description, String imageUrl, String str2, Action action, Button button, Button button2, Boolean bool) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f75695a = str;
        this.f75696b = title;
        this.f75697c = description;
        this.d = imageUrl;
        this.e = str2;
        this.f = action;
        this.f75698g = button;
        this.f75699h = button2;
        this.i = bool;
    }
}
