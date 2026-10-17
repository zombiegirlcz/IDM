package om4;

import android.graphics.Matrix;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvb;
import com.revolut.core.ui_kit.delegates.ContextualBarChartDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$InputData;
import com.revolut.feature.backgroundpicker.models.RetailThemeAgnosticBackgroundKey;
import com.revolut.feature.insurance_car.impl.data.model.CarVariation;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.staking.impl.stake.v2.StakeController;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen.AddMoneyScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d0 implements ox0.u, zp0.c, y50.a, zzu, kfm.o, igm.c, igm.o, kfm.g, zhm.j0, fv.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f226551b;

    public /* synthetic */ d0(Object obj2, int i) {
        this.f226550a = i;
        this.f226551b = obj2;
    }

    public static vkm.d f(d0 d0Var, int i) {
        d0Var.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        k2a.d dVar = (k2a.d) d0Var.f226551b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return dVar.e.b(true, loadingStrategy);
    }

    @Override // fv.e
    public fv.c a() {
        return new fv.b(((com.revolut.feature.transport.impl.ui.activation.flow.a) this.f226551b).f92514r);
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((efm.y) this.f226551b).onError((Throwable) obj2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03d5, code lost:
    
        if (r8.equals("upload_document") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x044a, code lost:
    
        if (r8.equals("upload_document_photo") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0454, code lost:
    
        r0 = yhm.m.INSTANCE;
        r0 = (jl.k0) r15.a(jh.d.v(r15.f187949b, kotlin.jvm.internal.o0.b(jl.k0.class)), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x046b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x046c, code lost:
    
        r5 = yhm.m.INSTANCE;
        r0 = yhm.o.a(r0);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x062a A[Catch: all -> 0x04ab, TryCatch #6 {all -> 0x04ab, blocks: (B:220:0x0476, B:224:0x048d, B:225:0x0496, B:227:0x049c, B:230:0x04ae, B:231:0x04bb, B:233:0x04c1, B:235:0x04d0, B:236:0x04da, B:237:0x04e3, B:238:0x04fa, B:240:0x0500, B:241:0x051b, B:242:0x0532, B:244:0x0538, B:245:0x0558, B:247:0x055e, B:248:0x056e, B:249:0x0572, B:250:0x057f, B:252:0x0585, B:254:0x0593, B:255:0x059f, B:257:0x05a5, B:259:0x05bb, B:266:0x05e5, B:269:0x05ea, B:272:0x05f0, B:274:0x05f4, B:277:0x05ff, B:279:0x0603, B:281:0x060b, B:287:0x061e, B:289:0x0624, B:291:0x062a, B:292:0x062c, B:298:0x063c, B:303:0x064a, B:307:0x0656, B:299:0x063f, B:300:0x0644, B:301:0x0645, B:302:0x0648, B:284:0x0618, B:265:0x05df, B:262:0x05c7), top: B:338:0x0476, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0648 A[Catch: all -> 0x04ab, TryCatch #6 {all -> 0x04ab, blocks: (B:220:0x0476, B:224:0x048d, B:225:0x0496, B:227:0x049c, B:230:0x04ae, B:231:0x04bb, B:233:0x04c1, B:235:0x04d0, B:236:0x04da, B:237:0x04e3, B:238:0x04fa, B:240:0x0500, B:241:0x051b, B:242:0x0532, B:244:0x0538, B:245:0x0558, B:247:0x055e, B:248:0x056e, B:249:0x0572, B:250:0x057f, B:252:0x0585, B:254:0x0593, B:255:0x059f, B:257:0x05a5, B:259:0x05bb, B:266:0x05e5, B:269:0x05ea, B:272:0x05f0, B:274:0x05f4, B:277:0x05ff, B:279:0x0603, B:281:0x060b, B:287:0x061e, B:289:0x0624, B:291:0x062a, B:292:0x062c, B:298:0x063c, B:303:0x064a, B:307:0x0656, B:299:0x063f, B:300:0x0644, B:301:0x0645, B:302:0x0648, B:284:0x0618, B:265:0x05df, B:262:0x05c7), top: B:338:0x0476, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0669  */
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
    @Override // kfm.o, androidx.arch.core.util.Function
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.d0.apply(java.lang.Object):java.lang.Object");
    }

    public Object b(gim.i iVar) throws Throwable {
        xg8.n nVar = (xg8.n) this.f226551b;
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, new xg8.l(nVar, null, 0), iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public c12.g c(hrf.f transferDirection, String str) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        n02.b bVar = n02.b.MBWAY;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.apm_new_contact_title, zhm.u.c(ApmMultibanco.f61815c.e()), null, 12);
        wi0.b.Companion.getClass();
        return new c12.g(new ApmNewContactNavigation$InputData(bVar, (List) null, transferDirection, textLocalisedClause, wi0.b.y2, (List) null, str, 98), (c12.f) this.f226551b);
    }

    public Object d(gq.d dVar) {
        qc8.b bVar = new qc8.b(this, null, 27);
        skm.p0 p0Var = skm.p0.f264001a;
        return skm.e0.J(elm.f.f127540b, bVar, dVar);
    }

    public q97.g3 e(ChatTransferRecipient recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        q2a.f fVar = (q2a.f) this.f226551b;
        String entityId = rz9.a.a(recipient);
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        return new q97.g3(mo3.a.g(nim.a.v(nim.a.u(new q03.m(fVar, (Continuation) null, 5), fVar.f241555a.g(new RetailThemeAgnosticBackgroundKey.Chat(entityId))), new qz9.b(0)), null, null, 3), 4);
    }

    public akg.n g(String juniorId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        zb8.b bVar = (zb8.b) this.f226551b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(bVar.d.b(Unit.f186387a, loadingStrategy), new te8.a(juniorId, 23));
    }

    public SlotContext h() {
        vge.y2 y2Var;
        cge.h hVar = (cge.h) this.f226551b;
        MainScreenTab mainScreenTab = ibb.c.f160140a;
        Intrinsics.checkNotNullParameter(mainScreenTab, "mainScreenTab");
        if (Intrinsics.f(mainScreenTab, ibb.c.f)) {
            y2Var = hVar.d.a() ? (vge.y2) hVar.f23956c.get() : null;
            if (y2Var == null) {
                y2Var = hVar.f23955b;
            }
        } else {
            y2Var = hVar.f23955b;
        }
        return y2Var.f289063a;
    }

    @Override // y50.a
    public void h1(fx.d dVar, koi.c delegatesManager) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
        koi.k kVarC = delegatesManager.c(ContextualBarChartDelegate.class);
        if (kVarC == null) {
            kVarC = new ContextualBarChartDelegate();
            delegatesManager.a(kVarC);
        }
        skm.e0.C(dVar.f138715a, null, null, new q03.m(rd0.e.b(((ContextualBarChartDelegate) kVarC).k), new q50.b(this), null, 11), 3);
    }

    public Object i(String str, gq.d dVar) {
        r83.g gVar = new r83.g(this, str, null, 8);
        skm.p0 p0Var = skm.p0.f264001a;
        return skm.e0.J(elm.f.f127540b, gVar, dVar);
    }

    @Override // zp0.c
    public void k(String extractedValue, String formattedValue, boolean z) {
        switch (this.f226550a) {
            case 3:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                ((AddMoneyScreen) this.f226551b).W.k(new pqg.l(formattedValue));
                break;
            default:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                com.revolut.feature.staking.impl.stake.v2.b bVar = (com.revolut.feature.staking.impl.stake.v2.b) ((StakeController) this.f226551b).R2();
                bVar.getClass();
                Intrinsics.checkNotNullParameter(formattedValue, "amount");
                xi0.b bVar2 = ((qwd.m) ((vkm.j2) bVar.K.f22677a).getValue()).f249864b;
                bVar.J.onNext(new dj0.d(bVar.f88155x.b(formattedValue, bVar2.f306286a), bVar2));
                break;
        }
    }

    @Override // zhm.j0
    public Object keyOf(Object obj2) {
        return ((CarVariation) obj2).f75196h;
    }

    @Override // zhm.j0
    public Iterator sourceIterator() {
        return ((ArrayList) this.f226551b).iterator();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public Object zza(Object obj2) {
        return new qh.a((zzvb) obj2, (Matrix) this.f226551b);
    }

    public d0(t33.r function) {
        this.f226550a = 27;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f226551b = function;
    }

    public d0(zjh.c repository) {
        this.f226550a = 0;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f226551b = repository;
    }

    public d0(xg8.n juniorPersonalisationRepository) {
        this.f226550a = 23;
        Intrinsics.checkNotNullParameter(juniorPersonalisationRepository, "juniorPersonalisationRepository");
        this.f226551b = juniorPersonalisationRepository;
    }

    public d0(cge.h productAccountsInfoProvider) {
        this.f226550a = 18;
        Intrinsics.checkNotNullParameter(productAccountsInfoProvider, "productAccountsInfoProvider");
        this.f226551b = productAccountsInfoProvider;
    }

    public d0(q50.c model) {
        this.f226550a = 5;
        Intrinsics.checkNotNullParameter(model, "model");
        this.f226551b = model;
    }

    public d0(ij0.a networkConfiguration) {
        this.f226550a = 14;
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        this.f226551b = networkConfiguration;
    }

    public d0(mk0.a personalisationStorage) {
        this.f226550a = 20;
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f226551b = personalisationStorage;
    }

    public d0(qn2.l switchRequestFormFieldMapper) {
        this.f226550a = 7;
        Intrinsics.checkNotNullParameter(switchRequestFormFieldMapper, "switchRequestFormFieldMapper");
        this.f226551b = switchRequestFormFieldMapper;
    }

    public d0(d4m.a service) {
        this.f226550a = 10;
        Intrinsics.checkNotNullParameter(service, "service");
        this.f226551b = service;
    }

    public d0(jid.z countryResidenceStateMapperConfiguration) {
        this.f226550a = 13;
        Intrinsics.checkNotNullParameter(countryResidenceStateMapperConfiguration, "countryResidenceStateMapperConfiguration");
        this.f226551b = countryResidenceStateMapperConfiguration;
    }

    public d0(zb8.b juniorAllowanceStandingOrderRepository) {
        this.f226550a = 29;
        Intrinsics.checkNotNullParameter(juniorAllowanceStandingOrderRepository, "juniorAllowanceStandingOrderRepository");
        this.f226551b = juniorAllowanceStandingOrderRepository;
    }

    public d0(c12.f apmNewContactExtension) {
        this.f226550a = 2;
        Intrinsics.checkNotNullParameter(apmNewContactExtension, "apmNewContactExtension");
        this.f226551b = apmNewContactExtension;
    }

    public d0(ne0.d memoryCache) {
        this.f226550a = 15;
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f226551b = memoryCache;
    }

    public d0(k2a.d repository) {
        this.f226550a = 4;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f226551b = repository;
    }

    public d0(q2a.f wallpaperInteractor, rz9.a primaryKeyInteractor) {
        this.f226550a = 9;
        Intrinsics.checkNotNullParameter(wallpaperInteractor, "wallpaperInteractor");
        Intrinsics.checkNotNullParameter(primaryKeyInteractor, "primaryKeyInteractor");
        this.f226551b = wallpaperInteractor;
    }

    public d0(hj8.a juniorProfileInteractor) {
        this.f226550a = 28;
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        this.f226551b = juniorProfileInteractor;
    }

    public d0(xh8.b juniorPostOnboardingCommandProvider) {
        this.f226550a = 12;
        Intrinsics.checkNotNullParameter(juniorPostOnboardingCommandProvider, "juniorPostOnboardingCommandProvider");
        this.f226551b = juniorPostOnboardingCommandProvider;
    }

    public d0(rwk.l yAxisMapper) {
        this.f226550a = 25;
        Intrinsics.checkNotNullParameter(yAxisMapper, "yAxisMapper");
        this.f226551b = yAxisMapper;
    }

    @Override // igm.c
    public Object apply(Object obj2, Object obj3) {
        ((igm.g) this.f226551b).accept((fgm.c) obj3);
        return obj2;
    }
}
