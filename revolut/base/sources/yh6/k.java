package yh6;

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
import yfe.b2;
import yh6.f;
import yh6.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u0006\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lyh6/k;", "", "", "toString", "()Ljava/lang/String;", "Lyh6/f;", "a", "Lyh6/f;", "getAmount", "()Lyh6/f;", "amount", "Lyh6/j;", "b", "Lyh6/j;", "getTopupMethodDetails", "()Lyh6/j;", "topupMethodDetails", "Lyh6/l;", "c", "Lyh6/l;", "getMetadata", "()Lyh6/l;", "metadata", "Companion", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class k {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new b2(24)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final f amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("topupMethodDetails")
    private final j topupMethodDetails;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("metadata")
    private final l metadata;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f313819a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f313819a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.impl.repository.models.IndiaOpenBankingTopUpRequestDto", aVar, 3);
            pluginGeneratedSerialDescriptor.j("amount", false);
            pluginGeneratedSerialDescriptor.j("topupMethodDetails", true);
            pluginGeneratedSerialDescriptor.j("metadata", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{f.a.f313808a, nlm.a.c((KSerializer) k.d[1].getValue()), nlm.a.c(l.a.f313821a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = k.d;
            dVarBeginStructure.getClass();
            f fVar = null;
            boolean z = true;
            int i = 0;
            j jVar = null;
            l lVar = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    fVar = (f) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, f.a.f313808a, fVar);
                    i |= 1;
                } else if (iD == 1) {
                    jVar = (j) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), jVar);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    lVar = (l) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, l.a.f313821a, lVar);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new k(i, fVar, jVar, lVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            k value = (k) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            k.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: yh6.k$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f313819a;
        }
    }

    public /* synthetic */ k(int i, f fVar, j jVar, l lVar) {
        if (1 != (i & 1)) {
            j1.f(a.f313819a.getDescriptor(), i, 1);
            throw null;
        }
        this.amount = fVar;
        if ((i & 2) == 0) {
            this.topupMethodDetails = null;
        } else {
            this.topupMethodDetails = jVar;
        }
        if ((i & 4) == 0) {
            this.metadata = null;
        } else {
            this.metadata = lVar;
        }
    }

    public static final /* synthetic */ void a(k kVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, f.a.f313808a, kVar.amount);
        if (compositeEncoder.d(serialDescriptor) || kVar.topupMethodDetails != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, (mlm.h) d[1].getValue(), kVar.topupMethodDetails);
        }
        if (!compositeEncoder.d(serialDescriptor) && kVar.metadata == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, l.a.f313821a, kVar.metadata);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.amount, kVar.amount) && Intrinsics.f(this.topupMethodDetails, kVar.topupMethodDetails) && Intrinsics.f(this.metadata, kVar.metadata);
    }

    public final int hashCode() {
        int iHashCode = this.amount.hashCode() * 31;
        j jVar = this.topupMethodDetails;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        l lVar = this.metadata;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    public k(f amount, j jVar, l lVar) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.amount = amount;
        this.topupMethodDetails = jVar;
        this.metadata = lVar;
    }
}
