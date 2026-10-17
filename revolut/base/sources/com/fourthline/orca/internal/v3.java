package com.fourthline.orca.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface v3 {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0011\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/fourthline/orca/internal/v3$a;", "", "", "match", "<init>", "(Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/v3$a;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getMatch", "()Z", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean match;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.v3$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0297a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0297a f34233a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f34234b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                C0297a c0297a = new C0297a();
                f34233a = c0297a;
                f34234b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.bav.internal.worker.BavConfirmIbanWorker.BavConfirmIbanResult", c0297a, 1);
                pluginGeneratedSerialDescriptor.j("match", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private C0297a() {
            }

            @Override // mlm.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                boolean z = true;
                int i = 0;
                boolean zDecodeBooleanElement = false;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else {
                        if (iD != 0) {
                            throw new UnknownFieldException(iD);
                        }
                        zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new a(i, zDecodeBooleanElement, null);
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{qlm.h.f247648a};
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // qlm.f0
            public /* bridge */ KSerializer[] typeParametersSerializers() {
                return qlm.j1.f247666a;
            }

            @Override // mlm.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void serialize(Encoder encoder, a value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                a.a(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.v3$a$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return C0297a.f34233a;
            }

            private Companion() {
            }
        }

        public /* synthetic */ a(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 == (i & 1)) {
                this.match = z;
            } else {
                qlm.j1.f(C0297a.f34233a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public static final /* synthetic */ void a(a self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeBooleanElement(serialDesc, 0, self.match);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.match == ((a) other).match;
        }

        public int hashCode() {
            return Boolean.hashCode(this.match);
        }

        public String toString() {
            return "BavConfirmIbanResult(match=" + this.match + ")";
        }

        public a(boolean z) {
            this.match = z;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f34235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f34236b;

        public b(String workflowId, String iban) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(iban, "iban");
            this.f34235a = workflowId;
            this.f34236b = iban;
        }

        public final String a() {
            return this.f34236b;
        }

        public final String b() {
            return this.f34235a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f34235a, bVar.f34235a) && Intrinsics.f(this.f34236b, bVar.f34236b);
        }

        public int hashCode() {
            return (this.f34235a.hashCode() * 31) + this.f34236b.hashCode();
        }

        public String toString() {
            return "Input(workflowId=" + this.f34235a + ", iban=" + this.f34236b + ")";
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f34237a;

        public c(a result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f34237a = result;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.f34237a, ((c) obj2).f34237a);
        }

        public int hashCode() {
            return this.f34237a.hashCode();
        }

        public String toString() {
            return "Output(result=" + this.f34237a + ")";
        }
    }

    Object a(b bVar, Continuation continuation);
}
