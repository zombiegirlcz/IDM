package nf6;

import java.util.ArrayList;
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
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.h;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0007\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\f\u0010\t¨\u0006\u0013"}, d2 = {"Lnf6/b;", "", "", "toString", "()Ljava/lang/String;", "", "Lnf6/a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "groupedConsents", "", "b", "Z", "c", "()Z", "userHasPixAutomatico", "inboundGroupedConsents", "Companion", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("groupedConsents")
    @NotNull
    private final List<nf6.a> groupedConsents;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("userHasPixAutomatico")
    private final boolean userHasPixAutomatico;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("inboundGroupedConsents")
    private final List<nf6.a> inboundGroupedConsents;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f214845a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f214845a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.impl.data.open_banking_brazil.entity.OpenBankingBrazilConsentsGroupsEntity", aVar, 3);
            pluginGeneratedSerialDescriptor.j("groupedConsents", false);
            pluginGeneratedSerialDescriptor.j("userHasPixAutomatico", false);
            pluginGeneratedSerialDescriptor.j("inboundGroupedConsents", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = b.d;
            return new KSerializer[]{lazyArr[0].getValue(), h.f247648a, nlm.a.c((KSerializer) lazyArr[2].getValue())};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = b.d;
            dVarBeginStructure.getClass();
            List list = null;
            boolean z = true;
            int i = 0;
            boolean zDecodeBooleanElement = false;
            List list2 = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                    i |= 1;
                } else if (iD == 1) {
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list2);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new b(i, list, list2, zDecodeBooleanElement);
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

    /* JADX INFO: renamed from: nf6.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f214845a;
        }
    }

    static {
        k kVar = k.PUBLICATION;
        d = new Lazy[]{j.c(kVar, new n85.b(11)), null, j.c(kVar, new n85.b(12))};
    }

    public /* synthetic */ b(int i, List list, List list2, boolean z) {
        if (7 != (i & 7)) {
            j1.f(a.f214845a.getDescriptor(), i, 7);
            throw null;
        }
        this.groupedConsents = list;
        this.userHasPixAutomatico = z;
        this.inboundGroupedConsents = list2;
    }

    public static final /* synthetic */ void d(b bVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Lazy[] lazyArr = d;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), bVar.groupedConsents);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, bVar.userHasPixAutomatico);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), bVar.inboundGroupedConsents);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getGroupedConsents() {
        return this.groupedConsents;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getInboundGroupedConsents() {
        return this.inboundGroupedConsents;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getUserHasPixAutomatico() {
        return this.userHasPixAutomatico;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.groupedConsents, bVar.groupedConsents) && this.userHasPixAutomatico == bVar.userHasPixAutomatico && Intrinsics.f(this.inboundGroupedConsents, bVar.inboundGroupedConsents);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.groupedConsents.hashCode() * 31, 31, this.userHasPixAutomatico);
        List<nf6.a> list = this.inboundGroupedConsents;
        return iC + (list == null ? 0 : list.hashCode());
    }

    public b(ArrayList groupedConsents, ArrayList arrayList, boolean z) {
        Intrinsics.checkNotNullParameter(groupedConsents, "groupedConsents");
        this.groupedConsents = groupedConsents;
        this.userHasPixAutomatico = z;
        this.inboundGroupedConsents = arrayList;
    }
}
