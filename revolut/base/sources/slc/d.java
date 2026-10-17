package slc;

import java.util.List;
import jo3.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
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
import qlm.n0;
import qlm.v1;
import sdl.y;
import vc.s;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 22\u00020\u0001:\u0005\u0014\u0012\u000f\u0005\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\"\u0010$\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001b\u0010#R\u001c\u0010(\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b\u0014\u0010'R\u001c\u0010,\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010*\u001a\u0004\b\u001d\u0010+R\u001c\u0010-\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010*\u001a\u0004\b!\u0010+R\u001c\u00101\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b\u000f\u00100¨\u00063"}, d2 = {"Lslc/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "k", "portfolioId", "Lslc/d$e;", "b", "Lslc/d$e;", "n", "()Lslc/d$e;", "state", "c", "f", "name", "d", "iconName", "e", "l", "portfolioTemplate", "m", "recommendedTemplate", "g", "canChangeTemplateSince", "h", "newTemplate", "i", "baseCurrency", "", "Lslc/d$d;", "j", "Ljava/util/List;", "()Ljava/util/List;", "ongoingRebalanceTypes", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "initialTopupPerformed", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "plannedInitialDeposit", "plannedRecurringDeposit", "Lslc/d$c;", "Lslc/d$c;", "()Lslc/d$c;", "goal", "Companion", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] o;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("portfolioId")
    @NotNull
    private final String portfolioId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final e state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("iconName")
    private final String iconName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("portfolioTemplateId")
    private final String portfolioTemplate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("recommendedPortfolioTemplate")
    private final String recommendedTemplate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("canChangeTemplateSince")
    @NotNull
    private final String canChangeTemplateSince;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("newTemplateId")
    private final String newTemplate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("baseCurrency")
    @NotNull
    private final String baseCurrency;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("ongoingRebalanceTypes")
    private final List<EnumC1474d> ongoingRebalanceTypes;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("initialTopupPerformed")
    private final Boolean initialTopupPerformed;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("plannedInitialDeposit")
    private final jo3.a plannedInitialDeposit;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("plannedRecurringDeposit")
    private final jo3.a plannedRecurringDeposit;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("goal")
    private final c goal;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f264183a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f264183a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.robo.impl.data.network.model.RoboPortfolioDto", aVar, 14);
            pluginGeneratedSerialDescriptor.j("portfolioId", false);
            pluginGeneratedSerialDescriptor.j("state", false);
            pluginGeneratedSerialDescriptor.j("name", false);
            pluginGeneratedSerialDescriptor.j("iconName", false);
            pluginGeneratedSerialDescriptor.j("portfolioTemplate", false);
            pluginGeneratedSerialDescriptor.j("recommendedTemplate", false);
            pluginGeneratedSerialDescriptor.j("canChangeTemplateSince", false);
            pluginGeneratedSerialDescriptor.j("newTemplate", false);
            pluginGeneratedSerialDescriptor.j("baseCurrency", false);
            pluginGeneratedSerialDescriptor.j("ongoingRebalanceTypes", false);
            pluginGeneratedSerialDescriptor.j("initialTopupPerformed", false);
            pluginGeneratedSerialDescriptor.j("plannedInitialDeposit", false);
            pluginGeneratedSerialDescriptor.j("plannedRecurringDeposit", false);
            pluginGeneratedSerialDescriptor.j("goal", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = d.o;
            v1 v1Var = v1.f247718a;
            a.C1001a c1001a = a.C1001a.f176860a;
            return new KSerializer[]{v1Var, lazyArr[1].getValue(), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), v1Var, nlm.a.c(v1Var), v1Var, nlm.a.c((KSerializer) lazyArr[9].getValue()), nlm.a.c(h.f247648a), nlm.a.c(c1001a), nlm.a.c(c1001a), nlm.a.c(c.a.f264186a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            String str;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = d.o;
            dVarBeginStructure.getClass();
            List list = null;
            c cVar = null;
            jo3.a aVar = null;
            Boolean bool = null;
            jo3.a aVar2 = null;
            String strDecodeStringElement = null;
            e eVar = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String strDecodeStringElement2 = null;
            String str6 = null;
            String strDecodeStringElement3 = null;
            int i = 0;
            int i2 = 1;
            boolean z = true;
            while (true) {
                String str7 = strDecodeStringElement;
                if (!z) {
                    dVarBeginStructure.endStructure(serialDescriptor);
                    return new d(i, strDecodeStringElement, eVar, str2, str3, str4, str5, strDecodeStringElement2, str6, strDecodeStringElement3, list, bool, aVar2, aVar, cVar);
                }
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        strDecodeStringElement = str7;
                        break;
                    case 0:
                        str = strDecodeStringElement2;
                        i |= 1;
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 = i2;
                        strDecodeStringElement2 = str;
                        break;
                    case 1:
                        str = strDecodeStringElement2;
                        eVar = (e) dVarBeginStructure.decodeSerializableElement(serialDescriptor, i2, (mlm.b) lazyArr[i2].getValue(), eVar);
                        i |= 2;
                        strDecodeStringElement = str7;
                        strDecodeStringElement2 = str;
                        break;
                    case 2:
                        str = strDecodeStringElement2;
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str2);
                        i |= 4;
                        strDecodeStringElement = str7;
                        strDecodeStringElement2 = str;
                        break;
                    case 3:
                        str = strDecodeStringElement2;
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str3);
                        i |= 8;
                        strDecodeStringElement = str7;
                        strDecodeStringElement2 = str;
                        break;
                    case 4:
                        str = strDecodeStringElement2;
                        str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str4);
                        i |= 16;
                        strDecodeStringElement = str7;
                        strDecodeStringElement2 = str;
                        break;
                    case 5:
                        str = strDecodeStringElement2;
                        str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str5);
                        i |= 32;
                        strDecodeStringElement = str7;
                        strDecodeStringElement2 = str;
                        break;
                    case 6:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        strDecodeStringElement = str7;
                        break;
                    case 7:
                        str = strDecodeStringElement2;
                        str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str6);
                        i |= 128;
                        strDecodeStringElement = str7;
                        strDecodeStringElement2 = str;
                        break;
                    case 8:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i |= 256;
                        strDecodeStringElement = str7;
                        break;
                    case 9:
                        str = strDecodeStringElement2;
                        list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr[9].getValue(), list);
                        i |= 512;
                        strDecodeStringElement = str7;
                        strDecodeStringElement2 = str;
                        break;
                    case 10:
                        str = strDecodeStringElement2;
                        bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, h.f247648a, bool);
                        i |= 1024;
                        strDecodeStringElement = str7;
                        strDecodeStringElement2 = str;
                        break;
                    case 11:
                        str = strDecodeStringElement2;
                        aVar2 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, a.C1001a.f176860a, aVar2);
                        i |= 2048;
                        strDecodeStringElement = str7;
                        strDecodeStringElement2 = str;
                        break;
                    case 12:
                        str = strDecodeStringElement2;
                        aVar = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, a.C1001a.f176860a, aVar);
                        i |= 4096;
                        strDecodeStringElement = str7;
                        strDecodeStringElement2 = str;
                        break;
                    case 13:
                        str = strDecodeStringElement2;
                        cVar = (c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, c.a.f264186a, cVar);
                        i |= 8192;
                        strDecodeStringElement = str7;
                        strDecodeStringElement2 = str;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            d value = (d) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            d.o(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: slc.d$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f264183a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: slc.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lslc/d$d;", "", "PORTFOLIO_TEMPLATE_CHANGE", "PORTFOLIO_TEMPLATE_ALLOCATION_CHANGE", "WITHDRAWAL", "FUNDING", "INITIAL_FUNDING", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EnumC1474d {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnumC1474d[] $VALUES;

        @lg.b("FUNDING")
        public static final EnumC1474d FUNDING;

        @lg.b("INITIAL_FUNDING")
        public static final EnumC1474d INITIAL_FUNDING;

        @lg.b("PORTFOLIO_TEMPLATE_ALLOCATION_CHANGE")
        public static final EnumC1474d PORTFOLIO_TEMPLATE_ALLOCATION_CHANGE;

        @lg.b("PORTFOLIO_TEMPLATE_CHANGE")
        public static final EnumC1474d PORTFOLIO_TEMPLATE_CHANGE;

        @lg.b("WITHDRAWAL")
        public static final EnumC1474d WITHDRAWAL;

        static {
            EnumC1474d enumC1474d = new EnumC1474d("PORTFOLIO_TEMPLATE_CHANGE", 0);
            PORTFOLIO_TEMPLATE_CHANGE = enumC1474d;
            EnumC1474d enumC1474d2 = new EnumC1474d("PORTFOLIO_TEMPLATE_ALLOCATION_CHANGE", 1);
            PORTFOLIO_TEMPLATE_ALLOCATION_CHANGE = enumC1474d2;
            EnumC1474d enumC1474d3 = new EnumC1474d("WITHDRAWAL", 2);
            WITHDRAWAL = enumC1474d3;
            EnumC1474d enumC1474d4 = new EnumC1474d("FUNDING", 3);
            FUNDING = enumC1474d4;
            EnumC1474d enumC1474d5 = new EnumC1474d("INITIAL_FUNDING", 4);
            INITIAL_FUNDING = enumC1474d5;
            EnumC1474d[] enumC1474dArr = {enumC1474d, enumC1474d2, enumC1474d3, enumC1474d4, enumC1474d5};
            $VALUES = enumC1474dArr;
            $ENTRIES = s.n(enumC1474dArr);
        }

        public static EnumC1474d valueOf(String str) {
            return (EnumC1474d) Enum.valueOf(EnumC1474d.class, str);
        }

        public static EnumC1474d[] values() {
            return (EnumC1474d[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lslc/d$e;", "", "CREATED", "ACTIVE", "SUSPENDED", "OFFBOARDING", "TERMINATED", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ e[] $VALUES;

        @lg.b("ACTIVE")
        public static final e ACTIVE;

        @lg.b("CREATED")
        public static final e CREATED;

        @lg.b("OFFBOARDING")
        public static final e OFFBOARDING;

        @lg.b("SUSPENDED")
        public static final e SUSPENDED;

        @lg.b("TERMINATED")
        public static final e TERMINATED;

        static {
            e eVar = new e("CREATED", 0);
            CREATED = eVar;
            e eVar2 = new e("ACTIVE", 1);
            ACTIVE = eVar2;
            e eVar3 = new e("SUSPENDED", 2);
            SUSPENDED = eVar3;
            e eVar4 = new e("OFFBOARDING", 3);
            OFFBOARDING = eVar4;
            e eVar5 = new e("TERMINATED", 4);
            TERMINATED = eVar5;
            e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
            $VALUES = eVarArr;
            $ENTRIES = s.n(eVarArr);
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    static {
        k kVar = k.PUBLICATION;
        o = new Lazy[]{null, j.c(kVar, new y(21)), null, null, null, null, null, null, null, j.c(kVar, new y(22)), null, null, null, null};
    }

    public /* synthetic */ d(int i, String str, e eVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, Boolean bool, jo3.a aVar, jo3.a aVar2, c cVar) {
        if (16383 != (i & 16383)) {
            j1.f(a.f264183a.getDescriptor(), i, 16383);
            throw null;
        }
        this.portfolioId = str;
        this.state = eVar;
        this.name = str2;
        this.iconName = str3;
        this.portfolioTemplate = str4;
        this.recommendedTemplate = str5;
        this.canChangeTemplateSince = str6;
        this.newTemplate = str7;
        this.baseCurrency = str8;
        this.ongoingRebalanceTypes = list;
        this.initialTopupPerformed = bool;
        this.plannedInitialDeposit = aVar;
        this.plannedRecurringDeposit = aVar2;
        this.goal = cVar;
    }

    public static final /* synthetic */ void o(d dVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, dVar.portfolioId);
        Lazy[] lazyArr = o;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), dVar.state);
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, dVar.name);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, dVar.iconName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, dVar.portfolioTemplate);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, dVar.recommendedTemplate);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, dVar.canChangeTemplateSince);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, dVar.newTemplate);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, dVar.baseCurrency);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), dVar.ongoingRebalanceTypes);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, h.f247648a, dVar.initialTopupPerformed);
        a.C1001a c1001a = a.C1001a.f176860a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, c1001a, dVar.plannedInitialDeposit);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, c1001a, dVar.plannedRecurringDeposit);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, c.a.f264186a, dVar.goal);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCanChangeTemplateSince() {
        return this.canChangeTemplateSince;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getGoal() {
        return this.goal;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getInitialTopupPerformed() {
        return this.initialTopupPerformed;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.portfolioId, dVar.portfolioId) && this.state == dVar.state && Intrinsics.f(this.name, dVar.name) && Intrinsics.f(this.iconName, dVar.iconName) && Intrinsics.f(this.portfolioTemplate, dVar.portfolioTemplate) && Intrinsics.f(this.recommendedTemplate, dVar.recommendedTemplate) && Intrinsics.f(this.canChangeTemplateSince, dVar.canChangeTemplateSince) && Intrinsics.f(this.newTemplate, dVar.newTemplate) && Intrinsics.f(this.baseCurrency, dVar.baseCurrency) && Intrinsics.f(this.ongoingRebalanceTypes, dVar.ongoingRebalanceTypes) && Intrinsics.f(this.initialTopupPerformed, dVar.initialTopupPerformed) && Intrinsics.f(this.plannedInitialDeposit, dVar.plannedInitialDeposit) && Intrinsics.f(this.plannedRecurringDeposit, dVar.plannedRecurringDeposit) && Intrinsics.f(this.goal, dVar.goal);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getNewTemplate() {
        return this.newTemplate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getOngoingRebalanceTypes() {
        return this.ongoingRebalanceTypes;
    }

    public final int hashCode() {
        int iHashCode = (this.state.hashCode() + (this.portfolioId.hashCode() * 31)) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.portfolioTemplate;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.recommendedTemplate;
        int iC = p.a.c((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.canChangeTemplateSince);
        String str5 = this.newTemplate;
        int iC2 = p.a.c((iC + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.baseCurrency);
        List<EnumC1474d> list = this.ongoingRebalanceTypes;
        int iHashCode5 = (iC2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.initialTopupPerformed;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        jo3.a aVar = this.plannedInitialDeposit;
        int iHashCode7 = (iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.plannedRecurringDeposit;
        int iHashCode8 = (iHashCode7 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        c cVar = this.goal;
        return iHashCode8 + (cVar != null ? cVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final jo3.a getPlannedInitialDeposit() {
        return this.plannedInitialDeposit;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final jo3.a getPlannedRecurringDeposit() {
        return this.plannedRecurringDeposit;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getPortfolioTemplate() {
        return this.portfolioTemplate;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getRecommendedTemplate() {
        return this.recommendedTemplate;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final e getState() {
        return this.state;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0003\u0010\u0006\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lslc/d$c;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "()Ljo3/a;", "amount", "Lslc/d$c$c;", "b", "Lslc/d$c$c;", "()Lslc/d$c$c;", "targetAchievementMonth", "Companion", "c", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        @NotNull
        private final jo3.a amount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("targetAchievementMonth")
        @NotNull
        private final C1473c targetAchievementMonth;

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f264186a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f264186a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.robo.impl.data.network.model.RoboPortfolioDto.PortfolioGoalDto", aVar, 2);
                pluginGeneratedSerialDescriptor.j("amount", false);
                pluginGeneratedSerialDescriptor.j("targetAchievementMonth", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{a.C1001a.f176860a, C1473c.a.f264189a};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                jo3.a aVar = null;
                boolean z = true;
                int i = 0;
                C1473c c1473c = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, aVar);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        c1473c = (C1473c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, C1473c.a.f264189a, c1473c);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new c(i, aVar, c1473c);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                c value = (c) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                c.c(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: slc.d$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f264186a;
            }
        }

        public /* synthetic */ c(int i, jo3.a aVar, C1473c c1473c) {
            if (3 != (i & 3)) {
                j1.f(a.f264186a.getDescriptor(), i, 3);
                throw null;
            }
            this.amount = aVar;
            this.targetAchievementMonth = c1473c;
        }

        public static final /* synthetic */ void c(c cVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, cVar.amount);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, C1473c.a.f264189a, cVar.targetAchievementMonth);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C1473c getTargetAchievementMonth() {
            return this.targetAchievementMonth;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.amount, cVar.amount) && Intrinsics.f(this.targetAchievementMonth, cVar.targetAchievementMonth);
        }

        public final int hashCode() {
            return this.targetAchievementMonth.hashCode() + (this.amount.hashCode() * 31);
        }

        /* JADX INFO: renamed from: slc.d$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\u0006\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\r"}, d2 = {"Lslc/d$c$c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "year", "month", "Companion", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @g
        public static final /* data */ class C1473c {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("year")
            private final int year;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("month")
            private final int month;

            /* JADX INFO: renamed from: slc.d$c$c$a */
            public static final /* synthetic */ class a implements f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f264189a;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    f264189a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.robo.impl.data.network.model.RoboPortfolioDto.PortfolioGoalDto.YearMonthDto", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("year", false);
                    pluginGeneratedSerialDescriptor.j("month", false);
                    descriptor = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // qlm.f0
                public final KSerializer[] childSerializers() {
                    n0 n0Var = n0.f247680a;
                    return new KSerializer[]{n0Var, n0Var};
                }

                @Override // mlm.b
                public final Object deserialize(Decoder decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    SerialDescriptor serialDescriptor = descriptor;
                    plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                    dVarBeginStructure.getClass();
                    boolean z = true;
                    int i = 0;
                    int iDecodeIntElement = 0;
                    int iDecodeIntElement2 = 0;
                    while (z) {
                        int iD = dVarBeginStructure.d(serialDescriptor);
                        if (iD == -1) {
                            z = false;
                        } else if (iD == 0) {
                            iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
                            i |= 1;
                        } else {
                            if (iD != 1) {
                                throw new UnknownFieldException(iD);
                            }
                            iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                            i |= 2;
                        }
                    }
                    dVarBeginStructure.endStructure(serialDescriptor);
                    return new C1473c(i, iDecodeIntElement, iDecodeIntElement2);
                }

                @Override // mlm.h, mlm.b
                public final SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // mlm.h
                public final void serialize(Encoder encoder, Object obj2) {
                    C1473c value = (C1473c) obj2;
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    SerialDescriptor serialDescriptor = descriptor;
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                    C1473c.c(value, compositeEncoderBeginStructure, serialDescriptor);
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: slc.d$c$c$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return a.f264189a;
                }
            }

            public C1473c(int i, int i2) {
                this.year = i;
                this.month = i2;
            }

            public static final /* synthetic */ void c(C1473c c1473c, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                compositeEncoder.encodeIntElement(serialDescriptor, 0, c1473c.year);
                compositeEncoder.encodeIntElement(serialDescriptor, 1, c1473c.month);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getMonth() {
                return this.month;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getYear() {
                return this.year;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1473c)) {
                    return false;
                }
                C1473c c1473c = (C1473c) obj2;
                return this.year == c1473c.year && this.month == c1473c.month;
            }

            public final int hashCode() {
                return Integer.hashCode(this.month) + (Integer.hashCode(this.year) * 31);
            }

            public /* synthetic */ C1473c(int i, int i2, int i3) {
                if (3 != (i & 3)) {
                    j1.f(a.f264189a.getDescriptor(), i, 3);
                    throw null;
                }
                this.year = i2;
                this.month = i3;
            }
        }
    }
}
