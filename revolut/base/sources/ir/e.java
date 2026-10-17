package ir;

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
import qlm.f0;
import qlm.v1;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lir/e;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f167919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f167920c;
    public final String d;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f167921a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f167921a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.dynamic_instructions.DynamicInstructionsErrorDto", aVar, 4);
            pluginGeneratedSerialDescriptor.j("code", true);
            pluginGeneratedSerialDescriptor.j("manualReviewPolicy", true);
            pluginGeneratedSerialDescriptor.j("title", true);
            pluginGeneratedSerialDescriptor.j("description", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                    i |= 1;
                } else if (iD == 1) {
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                    i |= 2;
                } else if (iD == 2) {
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str3);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str4);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new e(i, str, str2, str3, str4);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            e value = (e) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f167918a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, value.f167918a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f167919b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, value.f167919b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f167920c != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, value.f167920c);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.d != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, value.d);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: ir.e$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f167921a;
        }
    }

    public e() {
        this.f167918a = null;
        this.f167919b = null;
        this.f167920c = null;
        this.d = null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f167918a, eVar.f167918a) && Intrinsics.f(this.f167919b, eVar.f167919b) && Intrinsics.f(this.f167920c, eVar.f167920c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        String str = this.f167918a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f167919b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167920c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public /* synthetic */ e(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f167918a = null;
        } else {
            this.f167918a = str;
        }
        if ((i & 2) == 0) {
            this.f167919b = null;
        } else {
            this.f167919b = str2;
        }
        if ((i & 4) == 0) {
            this.f167920c = null;
        } else {
            this.f167920c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }
}
