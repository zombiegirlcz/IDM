package com.revolut.feature.insurance_embedded.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_embedded.impl.data.model.PricingPlanBanner;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0007\u0006\u0007\b\t\n\u000b\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/BottomSheet;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Footer", "Button", "Checklist", "ChecklistItem", "Action", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class BottomSheet implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f75875c;
    public final Checklist d;
    public final PricingPlanBanner e;
    public final Footer f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<BottomSheet> CREATOR = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f75872g = {null, null, yhm.j.c(yhm.k.PUBLICATION, new gr2.j0(23)), null, null, null};

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0006\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/BottomSheet$Action;", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "Dismiss", "Upgrade", "LearnMore", "Deeplink", "DynamicContactUrl", "a", "Lcom/revolut/feature/insurance_embedded/impl/data/model/BottomSheet$Action$Deeplink;", "Lcom/revolut/feature/insurance_embedded/impl/data/model/BottomSheet$Action$Dismiss;", "Lcom/revolut/feature/insurance_embedded/impl/data/model/BottomSheet$Action$DynamicContactUrl;", "Lcom/revolut/feature/insurance_embedded/impl/data/model/BottomSheet$Action$LearnMore;", "Lcom/revolut/feature/insurance_embedded/impl/data/model/BottomSheet$Action$Upgrade;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @rlm.g(discriminator = "type")
    @mlm.g
    public static abstract class Action implements Parcelable {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Object f75876a = yhm.j.c(yhm.k.PUBLICATION, new gr2.j0(24));

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/BottomSheet$Action$Dismiss;", "Lcom/revolut/feature/insurance_embedded/impl/data/model/BottomSheet$Action;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @mlm.g
        public static final class Dismiss extends Action {

            @NotNull
            public static final Dismiss INSTANCE = new Dismiss();

            @NotNull
            public static final Parcelable.Creator<Dismiss> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Object f75879b = yhm.j.c(yhm.k.PUBLICATION, new gr2.j0(25));

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Dismiss.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Dismiss[i];
                }
            }

            private Dismiss() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @NotNull
            public final KSerializer serializer() {
                return (KSerializer) f75879b.getValue();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet$Action$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @NotNull
            public final KSerializer serializer() {
                return (KSerializer) Action.f75876a.getValue();
            }
        }

        private Action() {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/BottomSheet$Action$Deeplink;", "Lcom/revolut/feature/insurance_embedded/impl/data/model/BottomSheet$Action;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @mlm.g
        public static final /* data */ class Deeplink extends Action {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f75877b;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            @NotNull
            public static final Parcelable.Creator<Deeplink> CREATOR = new c();

            public static final /* synthetic */ class a implements qlm.f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f75878a;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    f75878a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("DEEPLINK", aVar, 1);
                    pluginGeneratedSerialDescriptor.j("url", false);
                    pluginGeneratedSerialDescriptor.l(new com.revolut.feature.insurance_embedded.impl.data.model.a());
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
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f75877b);
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet$Action$Deeplink$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return a.f75878a;
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
                    this.f75877b = str;
                } else {
                    j1.f(a.f75878a.getDescriptor(), i, 1);
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
                return (obj2 instanceof Deeplink) && Intrinsics.f(this.f75877b, ((Deeplink) obj2).f75877b);
            }

            public final int hashCode() {
                return this.f75877b.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f75877b);
            }

            public Deeplink(String url2) {
                Intrinsics.checkNotNullParameter(url2, "url");
                this.f75877b = url2;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/BottomSheet$Action$DynamicContactUrl;", "Lcom/revolut/feature/insurance_embedded/impl/data/model/BottomSheet$Action;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @mlm.g
        public static final /* data */ class DynamicContactUrl extends Action {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f75880b;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            @NotNull
            public static final Parcelable.Creator<DynamicContactUrl> CREATOR = new c();

            public static final /* synthetic */ class a implements qlm.f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f75881a;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    f75881a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("DYNAMIC_CONTACT_URL", aVar, 1);
                    pluginGeneratedSerialDescriptor.j("policyId", false);
                    pluginGeneratedSerialDescriptor.l(new com.revolut.feature.insurance_embedded.impl.data.model.a());
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
                    return new DynamicContactUrl(i, strDecodeStringElement);
                }

                @Override // mlm.h, mlm.b
                public final SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // mlm.h
                public final void serialize(Encoder encoder, Object obj2) {
                    DynamicContactUrl value = (DynamicContactUrl) obj2;
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    SerialDescriptor serialDescriptor = descriptor;
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f75880b);
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet$Action$DynamicContactUrl$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return a.f75881a;
                }
            }

            public static final class c implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DynamicContactUrl(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DynamicContactUrl[i];
                }
            }

            public /* synthetic */ DynamicContactUrl(int i, String str) {
                if (1 == (i & 1)) {
                    this.f75880b = str;
                } else {
                    j1.f(a.f75881a.getDescriptor(), i, 1);
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
                return (obj2 instanceof DynamicContactUrl) && Intrinsics.f(this.f75880b, ((DynamicContactUrl) obj2).f75880b);
            }

            public final int hashCode() {
                return this.f75880b.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f75880b);
            }

            public DynamicContactUrl(String policyId) {
                Intrinsics.checkNotNullParameter(policyId, "policyId");
                this.f75880b = policyId;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/BottomSheet$Action$LearnMore;", "Lcom/revolut/feature/insurance_embedded/impl/data/model/BottomSheet$Action;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @mlm.g
        public static final /* data */ class LearnMore extends Action {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f75882b;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            @NotNull
            public static final Parcelable.Creator<LearnMore> CREATOR = new c();

            public static final /* synthetic */ class a implements qlm.f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f75883a;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    f75883a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("FAQ", aVar, 1);
                    pluginGeneratedSerialDescriptor.j("key", false);
                    pluginGeneratedSerialDescriptor.l(new com.revolut.feature.insurance_embedded.impl.data.model.a());
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
                    return new LearnMore(i, strDecodeStringElement);
                }

                @Override // mlm.h, mlm.b
                public final SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // mlm.h
                public final void serialize(Encoder encoder, Object obj2) {
                    LearnMore value = (LearnMore) obj2;
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    SerialDescriptor serialDescriptor = descriptor;
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f75882b);
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet$Action$LearnMore$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return a.f75883a;
                }
            }

            public static final class c implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new LearnMore(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new LearnMore[i];
                }
            }

            public /* synthetic */ LearnMore(int i, String str) {
                if (1 == (i & 1)) {
                    this.f75882b = str;
                } else {
                    j1.f(a.f75883a.getDescriptor(), i, 1);
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
                return (obj2 instanceof LearnMore) && Intrinsics.f(this.f75882b, ((LearnMore) obj2).f75882b);
            }

            public final int hashCode() {
                return this.f75882b.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f75882b);
            }

            public LearnMore(String key) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.f75882b = key;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/BottomSheet$Action$Upgrade;", "Lcom/revolut/feature/insurance_embedded/impl/data/model/BottomSheet$Action;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @mlm.g
        public static final /* data */ class Upgrade extends Action {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f75884b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f75885c;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            @NotNull
            public static final Parcelable.Creator<Upgrade> CREATOR = new c();
            public static final Lazy[] d = {yhm.j.c(yhm.k.PUBLICATION, new gr2.j0(26)), null};

            public static final /* synthetic */ class a implements qlm.f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f75886a;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    f75886a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("UPGRADE", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("planIds", false);
                    pluginGeneratedSerialDescriptor.j("selectedPlanId", false);
                    pluginGeneratedSerialDescriptor.l(new com.revolut.feature.insurance_embedded.impl.data.model.a());
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
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) Upgrade.d[0].getValue(), value.f75884b);
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, value.f75885c);
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet$Action$Upgrade$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return a.f75886a;
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
                    j1.f(a.f75886a.getDescriptor(), i, 3);
                    throw null;
                }
                this.f75884b = list;
                this.f75885c = str;
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
                return Intrinsics.f(this.f75884b, upgrade.f75884b) && Intrinsics.f(this.f75885c, upgrade.f75885c);
            }

            public final int hashCode() {
                int iHashCode = this.f75884b.hashCode() * 31;
                String str = this.f75885c;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeStringList(this.f75884b);
                dest.writeString(this.f75885c);
            }

            public Upgrade(List planIds, String str) {
                Intrinsics.checkNotNullParameter(planIds, "planIds");
                this.f75884b = planIds;
                this.f75885c = str;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/BottomSheet$Button;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class Button implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Action f75889b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Button> CREATOR = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Lazy[] f75887c = {null, yhm.j.c(yhm.k.PUBLICATION, new gr2.j0(27))};

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f75890a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f75890a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet.Button", aVar, 2);
                pluginGeneratedSerialDescriptor.j("text", false);
                pluginGeneratedSerialDescriptor.j("action", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{v1.f247718a, Button.f75887c[1].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Button.f75887c;
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
                return new Button(i, strDecodeStringElement, action);
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
                Lazy[] lazyArr = Button.f75887c;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f75888a);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f75889b);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet$Button$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f75890a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Button(parcel.readString(), (Action) parcel.readParcelable(Button.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Button[i];
            }
        }

        public /* synthetic */ Button(int i, String str, Action action) {
            if (3 != (i & 3)) {
                j1.f(a.f75890a.getDescriptor(), i, 3);
                throw null;
            }
            this.f75888a = str;
            this.f75889b = action;
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
            return Intrinsics.f(this.f75888a, button.f75888a) && Intrinsics.f(this.f75889b, button.f75889b);
        }

        public final int hashCode() {
            return this.f75889b.hashCode() + (this.f75888a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75888a);
            dest.writeParcelable(this.f75889b, i);
        }

        public Button(String text, Action action) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f75888a = text;
            this.f75889b = action;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/BottomSheet$Checklist;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class Checklist implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f75892a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Checklist> CREATOR = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Lazy[] f75891b = {yhm.j.c(yhm.k.PUBLICATION, new gr2.j0(28))};

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f75893a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f75893a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet.Checklist", aVar, 1);
                pluginGeneratedSerialDescriptor.j("items", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{Checklist.f75891b[0].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Checklist.f75891b;
                dVarBeginStructure.getClass();
                List list = null;
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
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Checklist(i, list);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Checklist value = (Checklist) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) Checklist.f75891b[0].getValue(), value.f75892a);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet$Checklist$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f75893a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(ChecklistItem.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Checklist(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checklist[i];
            }
        }

        public /* synthetic */ Checklist(int i, List list) {
            if (1 == (i & 1)) {
                this.f75892a = list;
            } else {
                j1.f(a.f75893a.getDescriptor(), i, 1);
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
            return (obj2 instanceof Checklist) && Intrinsics.f(this.f75892a, ((Checklist) obj2).f75892a);
        }

        public final int hashCode() {
            return this.f75892a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f75892a, dest);
            while (itV.hasNext()) {
                ((ChecklistItem) itV.next()).writeToParcel(dest, i);
            }
        }

        public Checklist(ArrayList items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f75892a = items;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/BottomSheet$ChecklistItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class ChecklistItem implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75894a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<ChecklistItem> CREATOR = new c();

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f75895a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f75895a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet.ChecklistItem", aVar, 1);
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
                return new ChecklistItem(i, strDecodeStringElement);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                ChecklistItem value = (ChecklistItem) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f75894a);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet$ChecklistItem$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f75895a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChecklistItem(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChecklistItem[i];
            }
        }

        public /* synthetic */ ChecklistItem(int i, String str) {
            if (1 == (i & 1)) {
                this.f75894a = str;
            } else {
                j1.f(a.f75895a.getDescriptor(), i, 1);
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
            return (obj2 instanceof ChecklistItem) && Intrinsics.f(this.f75894a, ((ChecklistItem) obj2).f75894a);
        }

        public final int hashCode() {
            return this.f75894a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75894a);
        }

        public ChecklistItem(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f75894a = text;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/BottomSheet$Footer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class Footer implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Button f75897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Button f75898c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Footer> CREATOR = new c();

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f75899a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f75899a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet.Footer", aVar, 3);
                pluginGeneratedSerialDescriptor.j("text", false);
                pluginGeneratedSerialDescriptor.j("primaryButton", false);
                pluginGeneratedSerialDescriptor.j("secondaryButton", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                KSerializer kSerializerC = nlm.a.c(v1.f247718a);
                Button.a aVar = Button.a.f75890a;
                return new KSerializer[]{kSerializerC, nlm.a.c(aVar), nlm.a.c(aVar)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                String str = null;
                boolean z = true;
                int i = 0;
                Button button = null;
                Button button2 = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                        i |= 1;
                    } else if (iD == 1) {
                        button = (Button) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, Button.a.f75890a, button);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        button2 = (Button) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, Button.a.f75890a, button2);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Footer(i, str, button, button2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Footer value = (Footer) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, value.f75896a);
                Button.a aVar = Button.a.f75890a;
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, aVar, value.f75897b);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, aVar, value.f75898c);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet$Footer$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f75899a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Footer(parcel.readString(), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Button.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Footer[i];
            }
        }

        public /* synthetic */ Footer(int i, String str, Button button, Button button2) {
            if (7 != (i & 7)) {
                j1.f(a.f75899a.getDescriptor(), i, 7);
                throw null;
            }
            this.f75896a = str;
            this.f75897b = button;
            this.f75898c = button2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj2;
            return Intrinsics.f(this.f75896a, footer.f75896a) && Intrinsics.f(this.f75897b, footer.f75897b) && Intrinsics.f(this.f75898c, footer.f75898c);
        }

        public final int hashCode() {
            String str = this.f75896a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Button button = this.f75897b;
            int iHashCode2 = (iHashCode + (button == null ? 0 : button.hashCode())) * 31;
            Button button2 = this.f75898c;
            return iHashCode2 + (button2 != null ? button2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75896a);
            Button button = this.f75897b;
            if (button == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button.writeToParcel(dest, i);
            }
            Button button2 = this.f75898c;
            if (button2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                button2.writeToParcel(dest, i);
            }
        }

        public Footer(String str, Button button, Button button2) {
            this.f75896a = str;
            this.f75897b = button;
            this.f75898c = button2;
        }
    }

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f75900a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f75900a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet", aVar, 6);
            pluginGeneratedSerialDescriptor.j("title", false);
            pluginGeneratedSerialDescriptor.j("text", false);
            pluginGeneratedSerialDescriptor.j("requirements", false);
            pluginGeneratedSerialDescriptor.j("checklist", false);
            pluginGeneratedSerialDescriptor.j("pricingPlanBanner", false);
            pluginGeneratedSerialDescriptor.j("footer", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = BottomSheet.f75872g;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, nlm.a.c(v1Var), lazyArr[2].getValue(), nlm.a.c(Checklist.a.f75893a), nlm.a.c(PricingPlanBanner.a.f75960a), nlm.a.c(Footer.a.f75899a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = BottomSheet.f75872g;
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String str = null;
            List list = null;
            Checklist checklist = null;
            PricingPlanBanner pricingPlanBanner = null;
            Footer footer = null;
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
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                        i |= 2;
                        break;
                    case 2:
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                        i |= 4;
                        break;
                    case 3:
                        checklist = (Checklist) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, Checklist.a.f75893a, checklist);
                        i |= 8;
                        break;
                    case 4:
                        pricingPlanBanner = (PricingPlanBanner) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, PricingPlanBanner.a.f75960a, pricingPlanBanner);
                        i |= 16;
                        break;
                    case 5:
                        footer = (Footer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, Footer.a.f75899a, footer);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new BottomSheet(i, strDecodeStringElement, str, list, checklist, pricingPlanBanner, footer);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            BottomSheet value = (BottomSheet) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = BottomSheet.f75872g;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f75873a);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, value.f75874b);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f75875c);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, Checklist.a.f75893a, value.d);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, PricingPlanBanner.a.f75960a, value.e);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, Footer.a.f75899a, value.f);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f75900a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BottomSheet(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Checklist.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PricingPlanBanner.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Footer.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BottomSheet[i];
        }
    }

    public /* synthetic */ BottomSheet(int i, String str, String str2, List list, Checklist checklist, PricingPlanBanner pricingPlanBanner, Footer footer) {
        if (63 != (i & 63)) {
            j1.f(a.f75900a.getDescriptor(), i, 63);
            throw null;
        }
        this.f75873a = str;
        this.f75874b = str2;
        this.f75875c = list;
        this.d = checklist;
        this.e = pricingPlanBanner;
        this.f = footer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BottomSheet)) {
            return false;
        }
        BottomSheet bottomSheet = (BottomSheet) obj2;
        return Intrinsics.f(this.f75873a, bottomSheet.f75873a) && Intrinsics.f(this.f75874b, bottomSheet.f75874b) && Intrinsics.f(this.f75875c, bottomSheet.f75875c) && Intrinsics.f(this.d, bottomSheet.d) && Intrinsics.f(this.e, bottomSheet.e) && Intrinsics.f(this.f, bottomSheet.f);
    }

    public final int hashCode() {
        int iHashCode = this.f75873a.hashCode() * 31;
        String str = this.f75874b;
        int iD = p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f75875c);
        Checklist checklist = this.d;
        int iHashCode2 = (iD + (checklist == null ? 0 : checklist.f75892a.hashCode())) * 31;
        PricingPlanBanner pricingPlanBanner = this.e;
        int iHashCode3 = (iHashCode2 + (pricingPlanBanner == null ? 0 : pricingPlanBanner.hashCode())) * 31;
        Footer footer = this.f;
        return iHashCode3 + (footer != null ? footer.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75873a);
        dest.writeString(this.f75874b);
        dest.writeStringList(this.f75875c);
        Checklist checklist = this.d;
        if (checklist == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            checklist.writeToParcel(dest, i);
        }
        PricingPlanBanner pricingPlanBanner = this.e;
        if (pricingPlanBanner == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pricingPlanBanner.writeToParcel(dest, i);
        }
        Footer footer = this.f;
        if (footer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            footer.writeToParcel(dest, i);
        }
    }

    public BottomSheet(String title, String str, List requirements, Checklist checklist, PricingPlanBanner pricingPlanBanner, Footer footer) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(requirements, "requirements");
        this.f75873a = title;
        this.f75874b = str;
        this.f75875c = requirements;
        this.d = checklist;
        this.e = pricingPlanBanner;
        this.f = footer;
    }
}
