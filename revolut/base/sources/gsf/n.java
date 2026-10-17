package gsf;

import gr2.j0;
import java.util.ArrayList;
import java.util.List;
import jo3.a;
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
import qlm.f0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\t\u0010\u001aR\u001c\u0010 \u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0005\u0010\u001f¨\u0006\""}, d2 = {"Lgsf/n;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "code", "b", "f", "type", "d", "label", "e", "selectionMode", "getHint", "hint", "", "Ljava/lang/Boolean;", "getCustomReasonAllowed", "()Ljava/lang/Boolean;", "customReasonAllowed", "", "g", "Ljava/util/List;", "()Ljava/util/List;", "children", "Ljo3/a;", "h", "Ljo3/a;", "()Ljo3/a;", "amount", "Companion", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class n {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] i = {null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new j0(19)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    private final String code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("label")
    private final String label;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("selectionMode")
    private final String selectionMode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("hint")
    private final String hint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("customReasonAllowed")
    private final Boolean customReasonAllowed;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("children")
    private final List<n> children;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final jo3.a amount;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f146437a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f146437a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transfer_reasons.dto.TransferReasonNodeDto", aVar, 8);
            pluginGeneratedSerialDescriptor.j("code", false);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("label", false);
            pluginGeneratedSerialDescriptor.j("selectionMode", false);
            pluginGeneratedSerialDescriptor.j("hint", false);
            pluginGeneratedSerialDescriptor.j("customReasonAllowed", false);
            pluginGeneratedSerialDescriptor.j("children", false);
            pluginGeneratedSerialDescriptor.j("amount", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = n.i;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(qlm.h.f247648a), nlm.a.c((KSerializer) lazyArr[6].getValue()), nlm.a.c(a.C1001a.f176860a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = n.i;
            dVarBeginStructure.getClass();
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Boolean bool = null;
            List list = null;
            jo3.a aVar = null;
            int i = 0;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                        i |= 1;
                        break;
                    case 1:
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                        i |= 2;
                        break;
                    case 2:
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str3);
                        i |= 4;
                        break;
                    case 3:
                        str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str4);
                        i |= 8;
                        break;
                    case 4:
                        str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str5);
                        i |= 16;
                        break;
                    case 5:
                        bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.h.f247648a, bool);
                        i |= 32;
                        break;
                    case 6:
                        list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), list);
                        i |= 64;
                        break;
                    case 7:
                        aVar = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, a.C1001a.f176860a, aVar);
                        i |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new n(i, str, str2, str3, str4, str5, bool, list, aVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            n value = (n) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            n.g(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: gsf.n$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f146437a;
        }
    }

    public /* synthetic */ n(int i2, String str, String str2, String str3, String str4, String str5, Boolean bool, List list, jo3.a aVar) {
        if (255 != (i2 & 255)) {
            j1.f(a.f146437a.getDescriptor(), i2, 255);
            throw null;
        }
        this.code = str;
        this.type = str2;
        this.label = str3;
        this.selectionMode = str4;
        this.hint = str5;
        this.customReasonAllowed = bool;
        this.children = list;
        this.amount = aVar;
    }

    public static final /* synthetic */ void g(n nVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, nVar.code);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, nVar.type);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, nVar.label);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, nVar.selectionMode);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, nVar.hint);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, qlm.h.f247648a, nVar.customReasonAllowed);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, (mlm.h) i[6].getValue(), nVar.children);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, a.C1001a.f176860a, nVar.amount);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getChildren() {
        return this.children;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSelectionMode() {
        return this.selectionMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.code, nVar.code) && Intrinsics.f(this.type, nVar.type) && Intrinsics.f(this.label, nVar.label) && Intrinsics.f(this.selectionMode, nVar.selectionMode) && Intrinsics.f(this.hint, nVar.hint) && Intrinsics.f(this.customReasonAllowed, nVar.customReasonAllowed) && Intrinsics.f(this.children, nVar.children) && Intrinsics.f(this.amount, nVar.amount);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.label;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.selectionMode;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.hint;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.customReasonAllowed;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<n> list = this.children;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        jo3.a aVar = this.amount;
        return iHashCode7 + (aVar != null ? aVar.hashCode() : 0);
    }

    public n(String str, String str2, ArrayList arrayList, jo3.a aVar) {
        this.code = str;
        this.type = str2;
        this.label = null;
        this.selectionMode = null;
        this.hint = null;
        this.customReasonAllowed = null;
        this.children = arrayList;
        this.amount = aVar;
    }
}
