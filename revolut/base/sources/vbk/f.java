package vbk;

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
import vbk.a;
import vbk.b;
import vbk.e;
import vbk.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\t\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\r\u0010 R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b\u0015\u0010 R\u001c\u0010#\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001c\u0010'\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b\u0012\u0010&¨\u0006)"}, d2 = {"Lvbk/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "b", "g", "planId", "Lvbk/e;", "c", "Lvbk/e;", "k", "()Lvbk/e;", "title", "d", "i", "subtitle", "e", "j", "terms", "Lvbk/a;", "Lvbk/a;", "()Lvbk/a;", "asset", "actionTitle", "Lvbk/b;", "h", "Lvbk/b;", "()Lvbk/b;", "claimButton", "declineButton", "seeBenefitsButton", "Lvbk/g;", "Lvbk/g;", "()Lvbk/g;", "claimRule", "Companion", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("planId")
    @NotNull
    private final String planId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final e title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("subtitle")
    @NotNull
    private final e subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("terms")
    @NotNull
    private final e terms;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("asset")
    @NotNull
    private final vbk.a asset;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("actionTitle")
    @NotNull
    private final String actionTitle;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("claimButton")
    private final b claimButton;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("declineButton")
    private final b declineButton;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("seeBenefitsButton")
    private final b seeBenefitsButton;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("claimRule")
    private final g claimRule;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f287559a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f287559a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.plan_gifting.impl.network.dto.PlanGiftingReceiverIntroDto", aVar, 11);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("planId", false);
            pluginGeneratedSerialDescriptor.j("title", false);
            pluginGeneratedSerialDescriptor.j("subtitle", false);
            pluginGeneratedSerialDescriptor.j("terms", false);
            pluginGeneratedSerialDescriptor.j("asset", false);
            pluginGeneratedSerialDescriptor.j("actionTitle", false);
            pluginGeneratedSerialDescriptor.j("claimButton", false);
            pluginGeneratedSerialDescriptor.j("declineButton", false);
            pluginGeneratedSerialDescriptor.j("seeBenefitsButton", false);
            pluginGeneratedSerialDescriptor.j("claimRule", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            b.a aVar = b.a.f287534a;
            KSerializer kSerializerC = nlm.a.c(aVar);
            KSerializer kSerializerC2 = nlm.a.c(aVar);
            KSerializer kSerializerC3 = nlm.a.c(aVar);
            KSerializer kSerializerC4 = nlm.a.c(g.a.f287563a);
            v1 v1Var = v1.f247718a;
            e.a aVar2 = e.a.f287545a;
            return new KSerializer[]{v1Var, v1Var, aVar2, aVar2, aVar2, a.C1588a.f287532a, v1Var, kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            boolean z;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            b bVar = null;
            g gVar = null;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            e eVar = null;
            e eVar2 = null;
            e eVar3 = null;
            vbk.a aVar = null;
            String strDecodeStringElement3 = null;
            b bVar2 = null;
            b bVar3 = null;
            int i = 0;
            boolean z3 = true;
            while (z3) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z3 = false;
                        continue;
                    case 0:
                        z = z3;
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        continue;
                    case 2:
                        z = z3;
                        eVar = (e) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, e.a.f287545a, eVar);
                        i |= 4;
                        break;
                    case 3:
                        z = z3;
                        eVar2 = (e) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, e.a.f287545a, eVar2);
                        i |= 8;
                        break;
                    case 4:
                        z = z3;
                        eVar3 = (e) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, e.a.f287545a, eVar3);
                        i |= 16;
                        break;
                    case 5:
                        z = z3;
                        aVar = (vbk.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, a.C1588a.f287532a, aVar);
                        i |= 32;
                        break;
                    case 6:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        continue;
                    case 7:
                        z = z3;
                        bVar2 = (b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, b.a.f287534a, bVar2);
                        i |= 128;
                        break;
                    case 8:
                        z = z3;
                        bVar3 = (b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, b.a.f287534a, bVar3);
                        i |= 256;
                        break;
                    case 9:
                        z = z3;
                        bVar = (b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, b.a.f287534a, bVar);
                        i |= 512;
                        break;
                    case 10:
                        z = z3;
                        gVar = (g) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, g.a.f287563a, gVar);
                        i |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
                z3 = z;
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new f(i, strDecodeStringElement, strDecodeStringElement2, eVar, eVar2, eVar3, aVar, strDecodeStringElement3, bVar2, bVar3, bVar, gVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            f value = (f) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            f.l(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: vbk.f$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f287559a;
        }
    }

    public /* synthetic */ f(int i, String str, String str2, e eVar, e eVar2, e eVar3, vbk.a aVar, String str3, b bVar, b bVar2, b bVar3, g gVar) {
        if (2047 != (i & 2047)) {
            j1.f(a.f287559a.getDescriptor(), i, 2047);
            throw null;
        }
        this.id = str;
        this.planId = str2;
        this.title = eVar;
        this.subtitle = eVar2;
        this.terms = eVar3;
        this.asset = aVar;
        this.actionTitle = str3;
        this.claimButton = bVar;
        this.declineButton = bVar2;
        this.seeBenefitsButton = bVar3;
        this.claimRule = gVar;
    }

    public static final /* synthetic */ void l(f fVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, fVar.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, fVar.planId);
        e.a aVar = e.a.f287545a;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, aVar, fVar.title);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, aVar, fVar.subtitle);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, aVar, fVar.terms);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, a.C1588a.f287532a, fVar.asset);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, fVar.actionTitle);
        b.a aVar2 = b.a.f287534a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, aVar2, fVar.claimButton);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, aVar2, fVar.declineButton);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, aVar2, fVar.seeBenefitsButton);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, g.a.f287563a, fVar.claimRule);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActionTitle() {
        return this.actionTitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final vbk.a getAsset() {
        return this.asset;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getClaimButton() {
        return this.claimButton;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final g getClaimRule() {
        return this.claimRule;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getDeclineButton() {
        return this.declineButton;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.id, fVar.id) && Intrinsics.f(this.planId, fVar.planId) && Intrinsics.f(this.title, fVar.title) && Intrinsics.f(this.subtitle, fVar.subtitle) && Intrinsics.f(this.terms, fVar.terms) && Intrinsics.f(this.asset, fVar.asset) && Intrinsics.f(this.actionTitle, fVar.actionTitle) && Intrinsics.f(this.claimButton, fVar.claimButton) && Intrinsics.f(this.declineButton, fVar.declineButton) && Intrinsics.f(this.seeBenefitsButton, fVar.seeBenefitsButton) && Intrinsics.f(this.claimRule, fVar.claimRule);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b getSeeBenefitsButton() {
        return this.seeBenefitsButton;
    }

    public final int hashCode() {
        int iC = p.a.c((this.asset.hashCode() + ((this.terms.hashCode() + ((this.subtitle.hashCode() + ((this.title.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.planId)) * 31)) * 31)) * 31)) * 31, 31, this.actionTitle);
        b bVar = this.claimButton;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.declineButton;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        b bVar3 = this.seeBenefitsButton;
        int iHashCode3 = (iHashCode2 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        g gVar = this.claimRule;
        return iHashCode3 + (gVar != null ? gVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final e getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final e getTerms() {
        return this.terms;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final e getTitle() {
        return this.title;
    }

    public f(String id10, String planId, e title, e subtitle, e terms, vbk.a asset, String actionTitle, b bVar, b bVar2, b bVar3, g gVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(actionTitle, "actionTitle");
        this.id = id10;
        this.planId = planId;
        this.title = title;
        this.subtitle = subtitle;
        this.terms = terms;
        this.asset = asset;
        this.actionTitle = actionTitle;
        this.claimButton = bVar;
        this.declineButton = bVar2;
        this.seeBenefitsButton = bVar3;
        this.claimRule = gVar;
    }
}
