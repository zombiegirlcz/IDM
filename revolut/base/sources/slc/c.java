package slc;

import ip0.v7;
import jo3.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mlm.g;
import mlm.h;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import sdl.y;
import vc.s;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 \n2\u00020\u0001:\u0003\u000b\u0006\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\r"}, d2 = {"Lslc/c;", "", "", "toString", "()Ljava/lang/String;", "Lslc/c$b;", "a", "Lslc/c$b;", "()Lslc/c$b;", "account", "Companion", "b", "c", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("account")
    @NotNull
    private final b account;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f264169a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f264169a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.robo.impl.data.network.model.RoboAccountDto", aVar, 1);
            pluginGeneratedSerialDescriptor.j("account", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{b.a.f264173a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            b bVar = null;
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
                    bVar = (b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, b.a.f264173a, bVar);
                    i = 1;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new c(i, bVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            c value = (c) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            c.b(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0003\b\u0006\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0012"}, d2 = {"Lslc/c$b;", "", "", "toString", "()Ljava/lang/String;", "Lslc/c$b$c;", "a", "Lslc/c$b$c;", "c", "()Lslc/c$b$c;", "onboardingStatus", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "minimumWithdrawalAmount", "minimumBalanceAfterWithdraw", "Companion", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] d = {j.c(k.PUBLICATION, new y(20)), null, null};

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("onboardingStatus")
        @NotNull
        private final EnumC1471c onboardingStatus;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("minimumWithdrawalAmount")
        @NotNull
        private final jo3.a minimumWithdrawalAmount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("minimumBalanceAfterWithdraw")
        @NotNull
        private final jo3.a minimumBalanceAfterWithdraw;

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f264173a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f264173a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.robo.impl.data.network.model.RoboAccountDto.AccountInformationDto", aVar, 3);
                pluginGeneratedSerialDescriptor.j("onboardingStatus", false);
                pluginGeneratedSerialDescriptor.j("minimumWithdrawalAmount", false);
                pluginGeneratedSerialDescriptor.j("minimumBalanceAfterWithdraw", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                a.C1001a c1001a = a.C1001a.f176860a;
                return new KSerializer[]{b.d[0].getValue(), c1001a, c1001a};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = b.d;
                dVarBeginStructure.getClass();
                EnumC1471c enumC1471c = null;
                boolean z = true;
                int i = 0;
                jo3.a aVar = null;
                jo3.a aVar2 = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        enumC1471c = (EnumC1471c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), enumC1471c);
                        i |= 1;
                    } else if (iD == 1) {
                        aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, aVar);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        aVar2 = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, a.C1001a.f176860a, aVar2);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new b(i, enumC1471c, aVar, aVar2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                b value = (b) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                b.d(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: slc.c$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f264173a;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: slc.c$b$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lslc/c$b$c;", "", "NONE", "PENDING", "COMPLETED", "FAILED", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class EnumC1471c {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ EnumC1471c[] $VALUES;

            @lg.b("COMPLETED")
            public static final EnumC1471c COMPLETED;

            @lg.b("FAILED")
            public static final EnumC1471c FAILED;

            @lg.b("NONE")
            public static final EnumC1471c NONE;

            @lg.b("PENDING")
            public static final EnumC1471c PENDING;

            static {
                EnumC1471c enumC1471c = new EnumC1471c("NONE", 0);
                NONE = enumC1471c;
                EnumC1471c enumC1471c2 = new EnumC1471c("PENDING", 1);
                PENDING = enumC1471c2;
                EnumC1471c enumC1471c3 = new EnumC1471c("COMPLETED", 2);
                COMPLETED = enumC1471c3;
                EnumC1471c enumC1471c4 = new EnumC1471c("FAILED", 3);
                FAILED = enumC1471c4;
                EnumC1471c[] enumC1471cArr = {enumC1471c, enumC1471c2, enumC1471c3, enumC1471c4};
                $VALUES = enumC1471cArr;
                $ENTRIES = s.n(enumC1471cArr);
            }

            public static EnumC1471c valueOf(String str) {
                return (EnumC1471c) Enum.valueOf(EnumC1471c.class, str);
            }

            public static EnumC1471c[] values() {
                return (EnumC1471c[]) $VALUES.clone();
            }
        }

        public /* synthetic */ b(int i, EnumC1471c enumC1471c, jo3.a aVar, jo3.a aVar2) {
            if (7 != (i & 7)) {
                j1.f(a.f264173a.getDescriptor(), i, 7);
                throw null;
            }
            this.onboardingStatus = enumC1471c;
            this.minimumWithdrawalAmount = aVar;
            this.minimumBalanceAfterWithdraw = aVar2;
        }

        public static final /* synthetic */ void d(b bVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, (h) d[0].getValue(), bVar.onboardingStatus);
            a.C1001a c1001a = a.C1001a.f176860a;
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, c1001a, bVar.minimumWithdrawalAmount);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, c1001a, bVar.minimumBalanceAfterWithdraw);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getMinimumBalanceAfterWithdraw() {
            return this.minimumBalanceAfterWithdraw;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getMinimumWithdrawalAmount() {
            return this.minimumWithdrawalAmount;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC1471c getOnboardingStatus() {
            return this.onboardingStatus;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return this.onboardingStatus == bVar.onboardingStatus && Intrinsics.f(this.minimumWithdrawalAmount, bVar.minimumWithdrawalAmount) && Intrinsics.f(this.minimumBalanceAfterWithdraw, bVar.minimumBalanceAfterWithdraw);
        }

        public final int hashCode() {
            return this.minimumBalanceAfterWithdraw.hashCode() + v7.j(this.minimumWithdrawalAmount, this.onboardingStatus.hashCode() * 31, 31);
        }
    }

    /* JADX INFO: renamed from: slc.c$c, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f264169a;
        }
    }

    public /* synthetic */ c(int i, b bVar) {
        if (1 == (i & 1)) {
            this.account = bVar;
        } else {
            j1.f(a.f264169a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public static final /* synthetic */ void b(c cVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, b.a.f264173a, cVar.account);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getAccount() {
        return this.account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.account, ((c) obj2).account);
    }

    public final int hashCode() {
        return this.account.hashCode();
    }
}
