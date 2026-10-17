package sxe;

import android.content.Context;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferencesSelection;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.topup_screen.common.CardDetails;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import up5.a0;
import uy1.j;
import vb4.s;
import vdl.p0;
import vge.q0;
import vo8.l;
import vo8.m;
import vo8.n;
import vo8.o;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f266469w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f266470x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f266471y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f266471y = obj2;
        this.f266469w = obj3;
        this.f266470x = obj4;
        this.z = obj5;
    }

    private final Object b(Object obj2) {
        LinkedHashMap linkedHashMap;
        o nVar;
        LinkedHashMap linkedHashMap2;
        LocalDateTime localDateTime;
        xc8.g gVar = (xc8.g) this.f266471y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            Map map = gVar.f304108b;
            if (map.isEmpty()) {
                return null;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (v.k(v6d.a.FIRST_PARTY_MARKETING, v6d.a.THIRD_PARTY_MARKETING).contains((v6d.a) entry.getKey())) {
                    linkedHashMap3.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                if (((xc8.c) entry2.getValue()).f304103c == xc8.b.YOUTH_CONSENT) {
                    linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                }
            }
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry3 : map.entrySet()) {
                if (((xc8.c) entry3.getValue()).f304103c == xc8.b.GUARDIAN_CONSENT) {
                    linkedHashMap.put(entry3.getKey(), entry3.getValue());
                }
            }
            if (linkedHashMap4.isEmpty()) {
                nVar = m.f290893a;
                return new l(linkedHashMap, nVar);
            }
            Iterator it8 = linkedHashMap4.values().iterator();
            if (!it8.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it8.next();
            if (it8.hasNext()) {
                LocalDateTime localDateTime2 = ((xc8.c) next).e;
                do {
                    Object next2 = it8.next();
                    LocalDateTime localDateTime3 = ((xc8.c) next2).e;
                    if (localDateTime2.compareTo((Object) localDateTime3) > 0) {
                        next = next2;
                        localDateTime2 = localDateTime3;
                    }
                } while (it8.hasNext());
            }
            LocalDateTime localDateTime4 = ((xc8.c) next).e;
            com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar = (com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b) this.z;
            this.f266471y = null;
            this.f266469w = linkedHashMap;
            this.f266470x = localDateTime4;
            this.v = 1;
            Object objI2 = com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b.I2(bVar, this);
            if (objI2 == aVar) {
                return aVar;
            }
            linkedHashMap2 = linkedHashMap;
            localDateTime = localDateTime4;
            obj2 = objI2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            localDateTime = (LocalDateTime) this.f266470x;
            linkedHashMap2 = (LinkedHashMap) this.f266469w;
            yhm.o.b(obj2);
        }
        nVar = new n(localDateTime, ((JuniorBankingProfile) obj2).f77099b);
        linkedHashMap = linkedHashMap2;
        return new l(linkedHashMap, nVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r2.emit(r10, r16) == r3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        if (r2.emit(r0, r16) != r3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e3, code lost:
    
        if (r2.emit(r10, r16) != r3) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[Catch: Exception -> 0x002b, CancellationException -> 0x00e6, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00e6, Exception -> 0x002b, blocks: (B:12:0x0026, B:15:0x002f, B:35:0x0099, B:36:0x00ab, B:38:0x00b1, B:39:0x00c0, B:32:0x0084), top: B:50:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1 A[Catch: Exception -> 0x002b, CancellationException -> 0x00e6, LOOP:0: B:36:0x00ab->B:38:0x00b1, LOOP_END, TryCatch #2 {CancellationException -> 0x00e6, Exception -> 0x002b, blocks: (B:12:0x0026, B:15:0x002f, B:35:0x0099, B:36:0x00ab, B:38:0x00b1, B:39:0x00c0, B:32:0x0084), top: B:50:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sxe.g.c(java.lang.Object):java.lang.Object");
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g((com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b) this.f266469w, (String) this.f266470x, (yte.m) this.z, continuation, 0);
                gVar.f266471y = obj2;
                return gVar;
            case 1:
                return new g((com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b) this.f266469w, (String) this.f266470x, (String) this.f266471y, (String) this.z, continuation);
            case 2:
                return new g(this.f266471y, (Parcelable) this.f266469w, this.z, (String) this.f266470x, continuation, 2);
            case 3:
                g gVar2 = new g((List) this.f266469w, (t80.v) this.f266470x, (Context) this.z, continuation, 3);
                gVar2.f266471y = obj2;
                return gVar2;
            case 4:
                g gVar3 = new g((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a) this.z, (String) this.f266470x, continuation);
                gVar3.f266471y = obj2;
                return gVar3;
            case 5:
                return new g(this.f266471y, this.f266469w, this.z, (String) this.f266470x, continuation, 5);
            case 6:
                return new g(6, (u8c.e) this.f266471y, (dj0.d) this.f266469w, (xi0.b) this.f266470x, (xi0.b) this.z, continuation);
            case 7:
                g gVar4 = new g((ul9.g) this.f266469w, (String) this.f266470x, (nl9.a) this.z, continuation, 7);
                gVar4.f266471y = obj2;
                return gVar4;
            case 8:
                return new g((uod.g) this.f266469w, (kad.a) this.f266470x, (uod.c) this.z, continuation, 8);
            case 9:
                return new g(9, (a0) this.f266471y, (xi0.b) this.f266469w, (CryptoAddress) this.f266470x, (od0.i) this.z, continuation);
            case 10:
                g gVar5 = new g((com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments.a) this.z, continuation, 10);
                gVar5.f266471y = obj2;
                return gVar5;
            case 11:
                g gVar6 = new g((uwe.g) this.z, continuation, 11);
                gVar6.f266471y = obj2;
                return gVar6;
            case 12:
                return new g(12, (j) this.f266471y, (Alias) this.f266469w, (String) this.f266470x, (String) this.z, continuation);
            case 13:
                return new g(this.f266471y, (Parcelable) this.f266469w, this.z, (String) this.f266470x, continuation, 13);
            case 14:
                return new g((com.revolut.feature.topup_screen.impl.flows.topup.flow.i) this.f266471y, (String) this.f266469w, (CardDetails) this.z, (String) this.f266470x, continuation, 14);
            case 15:
                return new g(15, (com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.c) this.f266471y, (s1a.d) this.f266469w, (oki.g) this.f266470x, (dj0.d) this.z, continuation);
            case 16:
                g gVar7 = new g((s) this.z, continuation, 16);
                gVar7.f266471y = obj2;
                return gVar7;
            case 17:
                g gVar8 = new g((vc2.h) this.z, continuation, 17);
                gVar8.f266471y = obj2;
                return gVar8;
            case 18:
                return new g(18, (p0) this.f266471y, (efl.f) this.f266469w, (efl.g) this.f266470x, (UUID) this.z, continuation);
            case 19:
                return new g(this.f266471y, this.f266469w, this.z, (String) this.f266470x, continuation, 19);
            case 20:
                g gVar9 = new g((t38.e) this.f266469w, continuation, (vgc.m) this.f266470x, (Ref$ObjectRef) this.z);
                gVar9.f266471y = obj2;
                return gVar9;
            case 21:
                g gVar10 = new g((q0) this.f266469w, (Set) this.f266470x, (Set) this.z, continuation, 21);
                gVar10.f266471y = obj2;
                return gVar10;
            case 22:
                g gVar11 = new g((com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d) this.f266469w, (String) this.f266470x, (zm3.l) this.z, continuation, 22);
                gVar11.f266471y = obj2;
                return gVar11;
            case 23:
                return new g(23, (vjk.d) this.f266471y, (hha.d) this.f266469w, (String) this.f266470x, (Function0) this.z, continuation);
            case 24:
                g gVar12 = new g((Ref$ObjectRef) this.f266470x, (FlowCollector) this.z, continuation);
                gVar12.f266471y = obj2;
                return gVar12;
            case 25:
                g gVar13 = new g((com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b) this.z, continuation, 25);
                gVar13.f266471y = obj2;
                return gVar13;
            case 26:
                return new g((w24.a) this.f266469w, (String) this.f266470x, (ConsentPreferencesSelection) this.z, continuation, 26);
            case 27:
                g gVar14 = new g((String) this.f266470x, this.f266469w, (w54.b) this.z, continuation);
                gVar14.f266471y = obj2;
                return gVar14;
            case 28:
                return new g(this.f266471y, this.f266469w, this.z, (String) this.f266470x, continuation, 28);
            default:
                return new g(29, (wc2.e) this.f266471y, (RegisterAlias$Alias) this.f266469w, (jx1.g) this.f266470x, (Function1) this.z, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 24:
                break;
        }
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:296:0x072f, code lost:
    
        if (vkm.q.u(r0, r1, r32) == r6) goto L297;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:368:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:538:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:546:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r1v139 */
    /* JADX WARN: Type inference failed for: r1v140, types: [com.revolut.core.ui_kit.models.Style, java.lang.String, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r1v141 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sxe.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f266469w = bVar;
        this.f266470x = str;
        this.f266471y = str2;
        this.z = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 4;
        this.z = aVar;
        this.f266470x = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Parcelable parcelable, Object obj3, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f266471y = obj2;
        this.f266469w = parcelable;
        this.z = obj3;
        this.f266470x = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Object obj3, Object obj4, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f266471y = obj2;
        this.f266470x = str;
        this.f266469w = obj3;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f266469w = obj2;
        this.f266470x = obj3;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.z = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, Object obj2, w54.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = 27;
        this.f266470x = str;
        this.f266469w = obj2;
        this.z = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Ref$ObjectRef ref$ObjectRef, FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.u = 24;
        this.f266470x = ref$ObjectRef;
        this.z = flowCollector;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t38.e eVar, Continuation continuation, vgc.m mVar, Ref$ObjectRef ref$ObjectRef) {
        super(2, continuation);
        this.u = 20;
        this.f266469w = eVar;
        this.f266470x = mVar;
        this.z = ref$ObjectRef;
    }
}
