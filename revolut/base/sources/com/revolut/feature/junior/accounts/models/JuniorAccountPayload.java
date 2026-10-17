package com.revolut.feature.junior.accounts.models;

import android.os.Parcel;
import android.os.Parcelable;
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
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/junior/accounts/models/JuniorAccountPayload;", "Lcom/revolut/feature/junior/accounts/models/JuniorPayload;", "<init>", "()V", "AccountClose", "AccountClosed", "Lcom/revolut/feature/junior/accounts/models/JuniorAccountPayload$AccountClose;", "Lcom/revolut/feature/junior/accounts/models/JuniorAccountPayload$AccountClosed;", "feature_junior_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JuniorAccountPayload implements JuniorPayload {
    private JuniorAccountPayload() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/junior/accounts/models/JuniorAccountPayload$AccountClose;", "Lcom/revolut/feature/junior/accounts/models/JuniorAccountPayload;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_junior_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class AccountClose extends JuniorAccountPayload {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76707a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<AccountClose> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f76708a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f76708a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("accountClose", aVar, 1);
                pluginGeneratedSerialDescriptor.j("juniorId", false);
                pluginGeneratedSerialDescriptor.l(new com.revolut.feature.junior.accounts.models.a());
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
                return new AccountClose(i, strDecodeStringElement);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                AccountClose value = (AccountClose) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f76707a);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.junior.accounts.models.JuniorAccountPayload$AccountClose$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f76708a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountClose(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountClose[i];
            }
        }

        public AccountClose(int i, String str) {
            if (1 == (i & 1)) {
                this.f76707a = str;
            } else {
                j1.f(a.f76708a.getDescriptor(), i, 1);
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
            return (obj2 instanceof AccountClose) && Intrinsics.f(this.f76707a, ((AccountClose) obj2).f76707a);
        }

        public final int hashCode() {
            return this.f76707a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76707a);
        }

        public AccountClose(String juniorId) {
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            this.f76707a = juniorId;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/junior/accounts/models/JuniorAccountPayload$AccountClosed;", "Lcom/revolut/feature/junior/accounts/models/JuniorAccountPayload;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_junior_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class AccountClosed extends JuniorAccountPayload {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f76710b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<AccountClosed> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f76711a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f76711a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("accountClosed", aVar, 2);
                pluginGeneratedSerialDescriptor.j("juniorId", false);
                pluginGeneratedSerialDescriptor.j("walletId", false);
                pluginGeneratedSerialDescriptor.l(new com.revolut.feature.junior.accounts.models.a());
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
                return new AccountClosed(i, strDecodeStringElement, strDecodeStringElement2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                AccountClosed value = (AccountClosed) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f76709a);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f76710b);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.junior.accounts.models.JuniorAccountPayload$AccountClosed$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f76711a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountClosed(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountClosed[i];
            }
        }

        public AccountClosed(int i, String str, String str2) {
            if (3 != (i & 3)) {
                j1.f(a.f76711a.getDescriptor(), i, 3);
                throw null;
            }
            this.f76709a = str;
            this.f76710b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccountClosed)) {
                return false;
            }
            AccountClosed accountClosed = (AccountClosed) obj2;
            return Intrinsics.f(this.f76709a, accountClosed.f76709a) && Intrinsics.f(this.f76710b, accountClosed.f76710b);
        }

        public final int hashCode() {
            return this.f76710b.hashCode() + (this.f76709a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76709a);
            dest.writeString(this.f76710b);
        }

        public AccountClosed(String juniorId, String walletId) {
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            this.f76709a = juniorId;
            this.f76710b = walletId;
        }
    }
}
