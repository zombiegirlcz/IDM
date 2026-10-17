package p6l;

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
import p6l.c0;
import qlm.f0;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0002\u0003\u0005R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000f"}, d2 = {"Lp6l/v;", "", "", "a", "Z", "b", "()Z", "enabled", "editable", "Lp6l/c0;", "c", "Lp6l/c0;", "()Lp6l/c0;", "transactionLimit", "Companion", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final class v {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("enabled")
    private final boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("editable")
    private final boolean editable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionLimit")
    private final c0 transactionLimit;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f233444a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f233444a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.models.SpendSecurityOptionDto", aVar, 3);
            pluginGeneratedSerialDescriptor.j("enabled", false);
            pluginGeneratedSerialDescriptor.j("editable", false);
            pluginGeneratedSerialDescriptor.j("transactionLimit", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            KSerializer kSerializerC = nlm.a.c(c0.a.f233381a);
            qlm.h hVar = qlm.h.f247648a;
            return new KSerializer[]{hVar, hVar, kSerializerC};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            c0 c0Var = null;
            boolean z = true;
            int i = 0;
            boolean zDecodeBooleanElement = false;
            boolean zDecodeBooleanElement2 = false;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    c0Var = (c0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, c0.a.f233381a, c0Var);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new v(i, zDecodeBooleanElement, zDecodeBooleanElement2, c0Var);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            v value = (v) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            v.d(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: p6l.v$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f233444a;
        }
    }

    public /* synthetic */ v(int i, boolean z, boolean z3, c0 c0Var) {
        if (7 != (i & 7)) {
            j1.f(a.f233444a.getDescriptor(), i, 7);
            throw null;
        }
        this.enabled = z;
        this.editable = z3;
        this.transactionLimit = c0Var;
    }

    public static final /* synthetic */ void d(v vVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, vVar.enabled);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, vVar.editable);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, c0.a.f233381a, vVar.transactionLimit);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEditable() {
        return this.editable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c0 getTransactionLimit() {
        return this.transactionLimit;
    }
}
