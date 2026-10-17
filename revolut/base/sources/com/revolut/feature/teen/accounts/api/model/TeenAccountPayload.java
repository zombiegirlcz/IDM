package com.revolut.feature.teen.accounts.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mlm.f;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import rlm.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/teen/accounts/api/model/TeenAccountPayload;", "Lcom/revolut/feature/tab/accounts/models/ProductAccountId$Payload;", "Companion", "Pocket", "AllAccounts", "a", "Lcom/revolut/feature/teen/accounts/api/model/TeenAccountPayload$AllAccounts;", "Lcom/revolut/feature/teen/accounts/api/model/TeenAccountPayload$Pocket;", "feature_teen_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g(discriminator = "teenPayloadType")
@mlm.g
public interface TeenAccountPayload extends ProductAccountId.Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f90329a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/teen/accounts/api/model/TeenAccountPayload$AllAccounts;", "Lcom/revolut/feature/teen/accounts/api/model/TeenAccountPayload;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_teen_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class AllAccounts implements TeenAccountPayload {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90323b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<AllAccounts> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f90324a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f90324a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("allAccounts", aVar, 2);
                pluginGeneratedSerialDescriptor.j("teenRegisteredIdentityId", false);
                pluginGeneratedSerialDescriptor.j("walletId", false);
                pluginGeneratedSerialDescriptor.l(new com.revolut.feature.teen.accounts.api.model.a());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var};
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
                String strDecodeStringElement2 = null;
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
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new AllAccounts(i, strDecodeStringElement, strDecodeStringElement2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                AllAccounts value = (AllAccounts) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f90322a);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f90323b);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.teen.accounts.api.model.TeenAccountPayload$AllAccounts$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f90324a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AllAccounts(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllAccounts[i];
            }
        }

        public /* synthetic */ AllAccounts(int i, String str, String str2) {
            if (3 != (i & 3)) {
                j1.f(a.f90324a.getDescriptor(), i, 3);
                throw null;
            }
            this.f90322a = str;
            this.f90323b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AllAccounts)) {
                return false;
            }
            AllAccounts allAccounts = (AllAccounts) obj2;
            return Intrinsics.f(this.f90322a, allAccounts.f90322a) && Intrinsics.f(this.f90323b, allAccounts.f90323b);
        }

        public final int hashCode() {
            return this.f90323b.hashCode() + (this.f90322a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90322a);
            dest.writeString(this.f90323b);
        }

        public AllAccounts(String teenRegisteredIdentityId, String walletId) {
            Intrinsics.checkNotNullParameter(teenRegisteredIdentityId, "teenRegisteredIdentityId");
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            this.f90322a = teenRegisteredIdentityId;
            this.f90323b = walletId;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/teen/accounts/api/model/TeenAccountPayload$Pocket;", "Lcom/revolut/feature/teen/accounts/api/model/TeenAccountPayload;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_teen_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class Pocket implements TeenAccountPayload {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f90326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f90327c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Pocket> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f90328a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f90328a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("pocket", aVar, 3);
                pluginGeneratedSerialDescriptor.j("teenRegisteredIdentityId", false);
                pluginGeneratedSerialDescriptor.j("walletId", false);
                pluginGeneratedSerialDescriptor.j("pocketId", false);
                pluginGeneratedSerialDescriptor.l(new com.revolut.feature.teen.accounts.api.model.a());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var, v1Var};
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
                String strDecodeStringElement2 = null;
                String strDecodeStringElement3 = null;
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
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Pocket(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Pocket value = (Pocket) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f90325a);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f90326b);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f90327c);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.teen.accounts.api.model.TeenAccountPayload$Pocket$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f90328a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pocket(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pocket[i];
            }
        }

        public /* synthetic */ Pocket(int i, String str, String str2, String str3) {
            if (7 != (i & 7)) {
                j1.f(a.f90328a.getDescriptor(), i, 7);
                throw null;
            }
            this.f90325a = str;
            this.f90326b = str2;
            this.f90327c = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Pocket)) {
                return false;
            }
            Pocket pocket = (Pocket) obj2;
            return Intrinsics.f(this.f90325a, pocket.f90325a) && Intrinsics.f(this.f90326b, pocket.f90326b) && Intrinsics.f(this.f90327c, pocket.f90327c);
        }

        public final int hashCode() {
            return this.f90327c.hashCode() + p.a.c(this.f90325a.hashCode() * 31, 31, this.f90326b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90325a);
            dest.writeString(this.f90326b);
            dest.writeString(this.f90327c);
        }

        public Pocket(String teenRegisteredIdentityId, String walletId, String pocketId) {
            Intrinsics.checkNotNullParameter(teenRegisteredIdentityId, "teenRegisteredIdentityId");
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            this.f90325a = teenRegisteredIdentityId;
            this.f90326b = walletId;
            this.f90327c = pocketId;
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.teen.accounts.api.model.TeenAccountPayload$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f90329a = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            p0 p0Var = o0.f186429a;
            return new f("com.revolut.feature.teen.accounts.api.model.TeenAccountPayload", p0Var.b(TeenAccountPayload.class), new KClass[]{p0Var.b(AllAccounts.class), p0Var.b(Pocket.class)}, new KSerializer[]{AllAccounts.a.f90324a, Pocket.a.f90328a}, new Annotation[]{new a()});
        }
    }
}
