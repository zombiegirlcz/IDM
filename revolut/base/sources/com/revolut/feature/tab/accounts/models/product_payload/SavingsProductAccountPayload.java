package com.revolut.feature.tab.accounts.models.product_payload;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
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
import mlm.h;
import ofa.n;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.j1;
import qlm.n0;
import qlm.v1;
import rlm.g;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/product_payload/SavingsProductAccountPayload;", "Lcom/revolut/feature/tab/accounts/models/ProductAccountId$Payload;", "Companion", "oie/a", "Personal", "Challenge", "Joint", "Youth", "Teen", "a", "Lcom/revolut/feature/tab/accounts/models/product_payload/SavingsProductAccountPayload$Challenge;", "Lcom/revolut/feature/tab/accounts/models/product_payload/SavingsProductAccountPayload$Joint;", "Lcom/revolut/feature/tab/accounts/models/product_payload/SavingsProductAccountPayload$Personal;", "Lcom/revolut/feature/tab/accounts/models/product_payload/SavingsProductAccountPayload$Teen;", "Lcom/revolut/feature/tab/accounts/models/product_payload/SavingsProductAccountPayload$Youth;", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g(discriminator = "savingsType")
@mlm.g
public abstract class SavingsProductAccountPayload implements ProductAccountId.Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f89732b = j.c(k.PUBLICATION, new n(21));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89733a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/product_payload/SavingsProductAccountPayload$Challenge;", "Lcom/revolut/feature/tab/accounts/models/product_payload/SavingsProductAccountPayload;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class Challenge extends SavingsProductAccountPayload {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oie.a f89734c;
        public final int d;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Challenge> CREATOR = new c();
        public static final Lazy[] e = {null, j.c(k.PUBLICATION, new n(22)), null};

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f89735a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f89735a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("personal_challenge", aVar, 3);
                pluginGeneratedSerialDescriptor.j("id", false);
                pluginGeneratedSerialDescriptor.j("productType", true);
                pluginGeneratedSerialDescriptor.j("progress", true);
                pluginGeneratedSerialDescriptor.l(new com.revolut.feature.tab.accounts.models.product_payload.a());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{v1.f247718a, Challenge.e[1].getValue(), n0.f247680a};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Challenge.e;
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                int iDecodeIntElement = 0;
                oie.a aVar = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                    } else if (iD == 1) {
                        aVar = (oie.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (b) lazyArr[1].getValue(), aVar);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Challenge(i, strDecodeStringElement, aVar, iDecodeIntElement);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Challenge value = (Challenge) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Companion companion = Challenge.INSTANCE;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f89733a);
                int i = value.d;
                oie.a aVar = value.f89734c;
                Lazy[] lazyArr = Challenge.e;
                if (compositeEncoderBeginStructure.d(serialDescriptor) || aVar != oie.a.UNKNOWN) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), aVar);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || i != 0) {
                    compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, i);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.tab.accounts.models.product_payload.SavingsProductAccountPayload$Challenge$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f89735a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Challenge(oie.a.valueOf(parcel.readString()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Challenge[i];
            }
        }

        public Challenge() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Challenge)) {
                return false;
            }
            Challenge challenge = (Challenge) obj2;
            return this.f89734c == challenge.f89734c && this.d == challenge.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + (this.f89734c.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89734c.name());
            dest.writeInt(this.d);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Challenge(int i, String str, oie.a aVar, int i2) {
            super(str);
            if (1 != (i & 1)) {
                j1.f(a.f89735a.getDescriptor(), i, 1);
                throw null;
            }
            if ((i & 2) == 0) {
                this.f89734c = oie.a.UNKNOWN;
            } else {
                this.f89734c = aVar;
            }
            if ((i & 4) == 0) {
                this.d = 0;
            } else {
                this.d = i2;
            }
        }

        public /* synthetic */ Challenge(int i) {
            this(oie.a.UNKNOWN, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Challenge(oie.a productType, int i) {
            super("ChallengeSavingsType", 0);
            Intrinsics.checkNotNullParameter(productType, "productType");
            this.f89734c = productType;
            this.d = i;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/product_payload/SavingsProductAccountPayload$Joint;", "Lcom/revolut/feature/tab/accounts/models/product_payload/SavingsProductAccountPayload;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class Joint extends SavingsProductAccountPayload {

        @NotNull
        public static final Joint INSTANCE = new Joint();

        @NotNull
        public static final Parcelable.Creator<Joint> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Object f89736c = j.c(k.PUBLICATION, new n(23));

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Joint.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Joint[i];
            }
        }

        private Joint() {
            super("JointSavingsType", 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f89736c.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/product_payload/SavingsProductAccountPayload$Personal;", "Lcom/revolut/feature/tab/accounts/models/product_payload/SavingsProductAccountPayload;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class Personal extends SavingsProductAccountPayload {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oie.a f89737c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Personal> CREATOR = new c();
        public static final Lazy[] d = {null, j.c(k.PUBLICATION, new n(24))};

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f89738a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f89738a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("personal", aVar, 2);
                pluginGeneratedSerialDescriptor.j("id", false);
                pluginGeneratedSerialDescriptor.j("productType", true);
                pluginGeneratedSerialDescriptor.l(new com.revolut.feature.tab.accounts.models.product_payload.a());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{v1.f247718a, Personal.d[1].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Personal.d;
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                oie.a aVar = null;
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
                        aVar = (oie.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (b) lazyArr[1].getValue(), aVar);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Personal(i, strDecodeStringElement, aVar);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Personal value = (Personal) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Companion companion = Personal.INSTANCE;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f89733a);
                oie.a aVar = value.f89737c;
                Lazy[] lazyArr = Personal.d;
                if (compositeEncoderBeginStructure.d(serialDescriptor) || aVar != oie.a.UNKNOWN) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), aVar);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.tab.accounts.models.product_payload.SavingsProductAccountPayload$Personal$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f89738a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Personal(oie.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Personal[i];
            }
        }

        public Personal() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Personal) && this.f89737c == ((Personal) obj2).f89737c;
        }

        public final int hashCode() {
            return this.f89737c.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89737c.name());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Personal(int i, String str, oie.a aVar) {
            super(str);
            if (1 != (i & 1)) {
                j1.f(a.f89738a.getDescriptor(), i, 1);
                throw null;
            }
            if ((i & 2) == 0) {
                this.f89737c = oie.a.UNKNOWN;
            } else {
                this.f89737c = aVar;
            }
        }

        public /* synthetic */ Personal(int i) {
            this(oie.a.UNKNOWN);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Personal(oie.a productType) {
            super("PersonalSavingsType", 0);
            Intrinsics.checkNotNullParameter(productType, "productType");
            this.f89737c = productType;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/product_payload/SavingsProductAccountPayload$Teen;", "Lcom/revolut/feature/tab/accounts/models/product_payload/SavingsProductAccountPayload;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class Teen extends SavingsProductAccountPayload {

        @NotNull
        public static final Teen INSTANCE = new Teen();

        @NotNull
        public static final Parcelable.Creator<Teen> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Object f89739c = j.c(k.PUBLICATION, new n(25));

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Teen.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Teen[i];
            }
        }

        private Teen() {
            super("TeenSavingsType", 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f89739c.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/product_payload/SavingsProductAccountPayload$Youth;", "Lcom/revolut/feature/tab/accounts/models/product_payload/SavingsProductAccountPayload;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class Youth extends SavingsProductAccountPayload {

        @NotNull
        public static final Youth INSTANCE = new Youth();

        @NotNull
        public static final Parcelable.Creator<Youth> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Object f89740c = j.c(k.PUBLICATION, new n(26));

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Youth.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Youth[i];
            }
        }

        private Youth() {
            super("YouthSavingsType", 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f89740c.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.tab.accounts.models.product_payload.SavingsProductAccountPayload$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) SavingsProductAccountPayload.f89732b.getValue();
        }
    }

    public /* synthetic */ SavingsProductAccountPayload(String str) {
        this.f89733a = str;
    }

    public SavingsProductAccountPayload(String str, int i) {
        this.f89733a = str;
    }
}
