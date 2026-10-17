package p6l;

import jo3.a;
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
import qlm.f0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0002\u0003\bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\b\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\r\u0010\u0011¨\u0006\u0014"}, d2 = {"Lp6l/c0;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "currency", "Ljo3/a;", "b", "Ljo3/a;", "d", "()Ljo3/a;", "value", "c", "maxValue", "", "Z", "()Z", "required", "Companion", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final class c0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    private final jo3.a value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxValue")
    private final jo3.a maxValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("required")
    private final boolean required;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f233381a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f233381a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.models.TransactionLimitDto", aVar, 4);
            pluginGeneratedSerialDescriptor.j("currency", false);
            pluginGeneratedSerialDescriptor.j("value", false);
            pluginGeneratedSerialDescriptor.j("maxValue", false);
            pluginGeneratedSerialDescriptor.j("required", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            a.C1001a c1001a = a.C1001a.f176860a;
            return new KSerializer[]{v1.f247718a, nlm.a.c(c1001a), nlm.a.c(c1001a), qlm.h.f247648a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            boolean zDecodeBooleanElement = false;
            String strDecodeStringElement = null;
            jo3.a aVar = null;
            jo3.a aVar2 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    aVar = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, aVar);
                    i |= 2;
                } else if (iD == 2) {
                    aVar2 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, a.C1001a.f176860a, aVar2);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new c0(i, strDecodeStringElement, aVar, aVar2, zDecodeBooleanElement);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            c0 value = (c0) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            c0.e(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: p6l.c0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f233381a;
        }
    }

    public /* synthetic */ c0(int i, String str, jo3.a aVar, jo3.a aVar2, boolean z) {
        if (15 != (i & 15)) {
            j1.f(a.f233381a.getDescriptor(), i, 15);
            throw null;
        }
        this.currency = str;
        this.value = aVar;
        this.maxValue = aVar2;
        this.required = z;
    }

    public static final /* synthetic */ void e(c0 c0Var, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, c0Var.currency);
        a.C1001a c1001a = a.C1001a.f176860a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, c1001a, c0Var.value);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, c1001a, c0Var.maxValue);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, c0Var.required);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getValue() {
        return this.value;
    }
}
