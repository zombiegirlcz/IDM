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
import p6l.s;
import p6l.v;
import qlm.f0;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0002\u0003\u0007R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0005R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lp6l/u;", "", "Lp6l/v;", "a", "Lp6l/v;", "()Lp6l/v;", "atmWithdrawal", "b", "c", "ecommerce", "contactless", "d", "f", "pointOfSale", "Lp6l/s;", "e", "Lp6l/s;", "()Lp6l/s;", "magstripe", "locationSecurity", "Companion", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final class u {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("atmWithdrawal")
    private final v atmWithdrawal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("ecommerce")
    private final v ecommerce;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("contactless")
    private final v contactless;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pointOfSale")
    private final v pointOfSale;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("magstripe")
    private final s magstripe;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("locationSecurity")
    private final s locationSecurity;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f233440a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f233440a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.shared.feature.cards.domain.impl.data.network.revolutcard.models.SecurityOptionsDto", aVar, 6);
            pluginGeneratedSerialDescriptor.j("atmWithdrawal", false);
            pluginGeneratedSerialDescriptor.j("ecommerce", false);
            pluginGeneratedSerialDescriptor.j("contactless", false);
            pluginGeneratedSerialDescriptor.j("pointOfSale", false);
            pluginGeneratedSerialDescriptor.j("magstripe", false);
            pluginGeneratedSerialDescriptor.j("locationSecurity", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v.a aVar = v.a.f233444a;
            KSerializer kSerializerC = nlm.a.c(aVar);
            KSerializer kSerializerC2 = nlm.a.c(aVar);
            KSerializer kSerializerC3 = nlm.a.c(aVar);
            KSerializer kSerializerC4 = nlm.a.c(aVar);
            s.a aVar2 = s.a.f233436a;
            return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, nlm.a.c(aVar2), nlm.a.c(aVar2)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            v vVar = null;
            v vVar2 = null;
            v vVar3 = null;
            v vVar4 = null;
            s sVar = null;
            s sVar2 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        vVar = (v) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v.a.f233444a, vVar);
                        i |= 1;
                        break;
                    case 1:
                        vVar2 = (v) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v.a.f233444a, vVar2);
                        i |= 2;
                        break;
                    case 2:
                        vVar3 = (v) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v.a.f233444a, vVar3);
                        i |= 4;
                        break;
                    case 3:
                        vVar4 = (v) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v.a.f233444a, vVar4);
                        i |= 8;
                        break;
                    case 4:
                        sVar = (s) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s.a.f233436a, sVar);
                        i |= 16;
                        break;
                    case 5:
                        sVar2 = (s) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s.a.f233436a, sVar2);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new u(i, vVar, vVar2, vVar3, vVar4, sVar, sVar2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            u value = (u) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            u.g(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: p6l.u$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f233440a;
        }
    }

    public /* synthetic */ u(int i, v vVar, v vVar2, v vVar3, v vVar4, s sVar, s sVar2) {
        if (63 != (i & 63)) {
            j1.f(a.f233440a.getDescriptor(), i, 63);
            throw null;
        }
        this.atmWithdrawal = vVar;
        this.ecommerce = vVar2;
        this.contactless = vVar3;
        this.pointOfSale = vVar4;
        this.magstripe = sVar;
        this.locationSecurity = sVar2;
    }

    public static final /* synthetic */ void g(u uVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        v.a aVar = v.a.f233444a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, aVar, uVar.atmWithdrawal);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, aVar, uVar.ecommerce);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, aVar, uVar.contactless);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, aVar, uVar.pointOfSale);
        s.a aVar2 = s.a.f233436a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, aVar2, uVar.magstripe);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, aVar2, uVar.locationSecurity);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final v getAtmWithdrawal() {
        return this.atmWithdrawal;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final v getContactless() {
        return this.contactless;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final v getEcommerce() {
        return this.ecommerce;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final s getLocationSecurity() {
        return this.locationSecurity;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final s getMagstripe() {
        return this.magstripe;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final v getPointOfSale() {
        return this.pointOfSale;
    }
}
