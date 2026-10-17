package xhf;

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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0005\u0010\f¨\u0006\u000f"}, d2 = {"Lxhf/e2;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "recipientId", "", "Lxhf/f2;", "Ljava/util/List;", "()Ljava/util/List;", "fields", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class e2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f305974c = {null, yhm.j.c(yhm.k.PUBLICATION, new xda.z(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("recipientId")
    @NotNull
    private final String recipientId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fields")
    private final List<f2> fields;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f305977a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f305977a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.TransactionTaxDetailsDto", aVar, 2);
            pluginGeneratedSerialDescriptor.j("recipientId", false);
            pluginGeneratedSerialDescriptor.j("fields", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{qlm.v1.f247718a, nlm.a.c((KSerializer) e2.f305974c[1].getValue())};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = e2.f305974c;
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            boolean z = true;
            int i = 0;
            List list = null;
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
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new e2(i, strDecodeStringElement, list);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            e2 value = (e2) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            e2.c(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xhf.e2$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f305977a;
        }
    }

    public /* synthetic */ e2(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(a.f305977a.getDescriptor(), i, 3);
            throw null;
        }
        this.recipientId = str;
        this.fields = list;
    }

    public static final /* synthetic */ void c(e2 e2Var, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, e2Var.recipientId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, (mlm.h) f305974c[1].getValue(), e2Var.fields);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getFields() {
        return this.fields;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRecipientId() {
        return this.recipientId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj2;
        return Intrinsics.f(this.recipientId, e2Var.recipientId) && Intrinsics.f(this.fields, e2Var.fields);
    }

    public final int hashCode() {
        int iHashCode = this.recipientId.hashCode() * 31;
        List<f2> list = this.fields;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
