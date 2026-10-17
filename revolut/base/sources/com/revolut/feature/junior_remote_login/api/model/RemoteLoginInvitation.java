package com.revolut.feature.junior_remote_login.api.model;

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
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/junior_remote_login/api/model/RemoteLoginInvitation;", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "Absent", "Present", "Pending", "Accepted", "a", "Lcom/revolut/feature/junior_remote_login/api/model/RemoteLoginInvitation$Absent;", "Lcom/revolut/feature/junior_remote_login/api/model/RemoteLoginInvitation$Present;", "feature_junior_remote_login_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public abstract class RemoteLoginInvitation implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f77166a = j.c(k.PUBLICATION, new dkd.a(8));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/junior_remote_login/api/model/RemoteLoginInvitation$Absent;", "Lcom/revolut/feature/junior_remote_login/api/model/RemoteLoginInvitation;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_junior_remote_login_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final class Absent extends RemoteLoginInvitation {

        @NotNull
        public static final Absent INSTANCE = new Absent();

        @NotNull
        public static final Parcelable.Creator<Absent> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Object f77167b = j.c(k.PUBLICATION, new dkd.a(9));

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Absent.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Absent[i];
            }
        }

        private Absent() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f77167b.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/junior_remote_login/api/model/RemoteLoginInvitation$Present;", "Lcom/revolut/feature/junior_remote_login/api/model/RemoteLoginInvitation;", "<init>", "()V", "Companion", "a", "Lcom/revolut/feature/junior_remote_login/api/model/RemoteLoginInvitation$Accepted;", "Lcom/revolut/feature/junior_remote_login/api/model/RemoteLoginInvitation$Pending;", "feature_junior_remote_login_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @rlm.g(discriminator = "loginState")
    @g
    public static abstract class Present extends RemoteLoginInvitation {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Object f77172b = j.c(k.PUBLICATION, new dkd.a(10));

        /* JADX INFO: renamed from: com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation$Present$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @NotNull
            public final KSerializer serializer() {
                return (KSerializer) Present.f77172b.getValue();
            }
        }

        private Present() {
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) RemoteLoginInvitation.f77166a.getValue();
        }
    }

    private RemoteLoginInvitation() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/junior_remote_login/api/model/RemoteLoginInvitation$Accepted;", "Lcom/revolut/feature/junior_remote_login/api/model/RemoteLoginInvitation$Present;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_junior_remote_login_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Accepted extends Present {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f77168c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Accepted> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f77169a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f77169a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ACCEPTED_INVITATION", aVar, 1);
                pluginGeneratedSerialDescriptor.j("phone", false);
                pluginGeneratedSerialDescriptor.l(new com.revolut.feature.junior_remote_login.api.model.a());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{nlm.a.c(v1.f247718a)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                String str = null;
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
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Accepted(i, str);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Accepted value = (Accepted) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Companion companion = Accepted.INSTANCE;
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, value.f77168c);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation$Accepted$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f77169a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Accepted(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Accepted[i];
            }
        }

        public /* synthetic */ Accepted(int i, String str) {
            if (1 == (i & 1)) {
                this.f77168c = str;
            } else {
                j1.f(a.f77169a.getDescriptor(), i, 1);
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
            return (obj2 instanceof Accepted) && Intrinsics.f(this.f77168c, ((Accepted) obj2).f77168c);
        }

        public final int hashCode() {
            String str = this.f77168c;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77168c);
        }

        public Accepted(String str) {
            this.f77168c = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/junior_remote_login/api/model/RemoteLoginInvitation$Pending;", "Lcom/revolut/feature/junior_remote_login/api/model/RemoteLoginInvitation$Present;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_junior_remote_login_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Pending extends Present {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f77170c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Pending> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f77171a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f77171a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("PENDING_INVITATION", aVar, 1);
                pluginGeneratedSerialDescriptor.j("phone", false);
                pluginGeneratedSerialDescriptor.l(new com.revolut.feature.junior_remote_login.api.model.a());
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
                return new Pending(i, strDecodeStringElement);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Pending value = (Pending) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f77170c);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation$Pending$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f77171a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pending(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pending[i];
            }
        }

        public /* synthetic */ Pending(int i, String str) {
            if (1 == (i & 1)) {
                this.f77170c = str;
            } else {
                j1.f(a.f77171a.getDescriptor(), i, 1);
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
            return (obj2 instanceof Pending) && Intrinsics.f(this.f77170c, ((Pending) obj2).f77170c);
        }

        public final int hashCode() {
            return this.f77170c.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77170c);
        }

        public Pending(String phoneNumber) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.f77170c = phoneNumber;
        }
    }
}
