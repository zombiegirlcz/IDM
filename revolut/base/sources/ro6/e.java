package ro6;

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
import ro6.b;
import ro6.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\t\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012¨\u0006\u0015"}, d2 = {"Lro6/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "b", "d", "value", "Lro6/c;", "Lro6/c;", "()Lro6/c;", "editableMoney", "Lro6/b;", "Lro6/b;", "()Lro6/b;", "editableDate", "Companion", "feature_external_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    @NotNull
    private final String value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("editableMoney")
    private final c editableMoney;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("editableDate")
    private final b editableDate;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f255904a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f255904a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.models.open_banking_brazil.entity.BrazilInboundItemEntity", aVar, 4);
            pluginGeneratedSerialDescriptor.j("title", false);
            pluginGeneratedSerialDescriptor.j("value", false);
            pluginGeneratedSerialDescriptor.j("editableMoney", false);
            pluginGeneratedSerialDescriptor.j("editableDate", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            KSerializer kSerializerC = nlm.a.c(c.a.f255896a);
            KSerializer kSerializerC2 = nlm.a.c(b.a.f255893a);
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, kSerializerC, kSerializerC2};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            c cVar = null;
            b bVar = null;
            boolean z = true;
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
                } else if (iD == 2) {
                    cVar = (c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, c.a.f255896a, cVar);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    bVar = (b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, b.a.f255893a, bVar);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new e(i, strDecodeStringElement, strDecodeStringElement2, cVar, bVar);
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
            e.e(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: ro6.e$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f255904a;
        }
    }

    public /* synthetic */ e(int i, String str, String str2, c cVar, b bVar) {
        if (15 != (i & 15)) {
            j1.f(a.f255904a.getDescriptor(), i, 15);
            throw null;
        }
        this.title = str;
        this.value = str2;
        this.editableMoney = cVar;
        this.editableDate = bVar;
    }

    public static final /* synthetic */ void e(e eVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, eVar.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, eVar.value);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, c.a.f255896a, eVar.editableMoney);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, b.a.f255893a, eVar.editableDate);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getEditableDate() {
        return this.editableDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getEditableMoney() {
        return this.editableMoney;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.title, eVar.title) && Intrinsics.f(this.value, eVar.value) && Intrinsics.f(this.editableMoney, eVar.editableMoney) && Intrinsics.f(this.editableDate, eVar.editableDate);
    }

    public final int hashCode() {
        int iC = p.a.c(this.title.hashCode() * 31, 31, this.value);
        c cVar = this.editableMoney;
        int iHashCode = (iC + (cVar == null ? 0 : cVar.hashCode())) * 31;
        b bVar = this.editableDate;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public e(String title, String value, c cVar, b bVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.title = title;
        this.value = value;
        this.editableMoney = cVar;
        this.editableDate = bVar;
    }
}
