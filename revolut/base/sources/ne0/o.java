package ne0;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Base64;
import com.revolut.feature.cash_topup.api.declaration.CashTopUpFeatureConfig;
import com.revolut.feature.chooser.ChooserConfiguration;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.common.models.FreelancerCustomer;
import com.revolut.feature.view.image.api.navigation.ViewImageConfig;
import com.revolut.feature.view.image.api.navigation.ViewImageDestination;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.BrowserCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositDestination;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import nyb.n0;
import oee.v;
import om4.t3;
import ozc.r0;
import ozc.t;
import p4i.r;
import rp0.y;
import wim.z;
import zhm.a0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class o implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f214398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f214399c;

    public /* synthetic */ o(Object obj2, Object obj3, int i) {
        this.f214397a = i;
        this.f214398b = obj2;
        this.f214399c = obj3;
    }

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
    @Override // kfm.a
    public final void run() throws IOException {
        ViewImageDestination.InputData inputData;
        ArrayList arrayListF1 = null;
        switch (this.f214397a) {
            case 0:
                p pVar = (p) this.f214398b;
                Object obj2 = this.f214399c;
                synchronized (((HashMap) pVar.d)) {
                    ((HashMap) pVar.d).remove(obj2);
                    Unit unit = Unit.f186387a;
                }
                return;
            case 1:
                ((nj5.i) this.f214398b).f216377a.b(new dt5.d((CryptoDepositDestination) this.f214399c));
                return;
            case 2:
                nm.a aVar = (nm.a) this.f214398b;
                Object obj3 = this.f214399c;
                String simpleName = aVar.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, simpleName, j6.a.q("Result has not been handled: ", obj3 != null ? obj3.getClass().getCanonicalName() : null), null, null, 16);
                return;
            case 3:
                noi.a aVar2 = (noi.a) this.f214398b;
                Boolean bool = (Boolean) this.f214399c;
                loi.b bVar = aVar2.f218046a;
                Intrinsics.h(bool);
                ((com.revolut.retail.analytics.tracking.impl.b) bVar).k3(bool.booleanValue());
                return;
            case 4:
                ((ns5.h) this.f214398b).f218759b.b(new dt5.d((ParcelableDestination) this.f214399c));
                return;
            case 5:
                ((nsh.p) this.f214398b).D((wm.b) this.f214399c);
                return;
            case 6:
                ((ihm.f) ((nx7.n) this.f214398b).o.getValue()).onNext(Boolean.valueOf(((ym.b) this.f214399c).f314824b));
                return;
            case 7:
                ((n0) this.f214398b).f220818b.onNext((lk0.g) this.f214399c);
                return;
            case 8:
                nzc.d dVar = (nzc.d) this.f214398b;
                String str = (String) this.f214399c;
                jzc.o oVar = (jzc.o) dVar.f221018b.get("MEMORY_CACHE_LATEST_SUBMISSION_KEY");
                if (oVar != null) {
                    ArrayList arrayListF12 = d0.f1(oVar.getEvidences());
                    a0.E(arrayListF12, new nj8.b(str, 23));
                    dVar.f221021h.k(Unit.f186387a, jzc.o.a(oVar, arrayListF12));
                    return;
                }
                return;
            case 9:
                ((nzj.p) this.f214398b).f221087a.b(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), (FeatureCommand) this.f214399c));
                return;
            case 10:
                o28.h hVar = (o28.h) this.f214398b;
                iel.a aVar3 = (iel.a) this.f214399c;
                nsh.p pVar2 = hVar.f221548c;
                h8b.c cVar = hVar.f221547b;
                Intrinsics.h(aVar3);
                pVar2.D(new wm.c(cVar.a(aVar3)));
                return;
            case 11:
                ((o53.b) this.f214398b).a((String) this.f214399c);
                return;
            case 12:
                o53.b bVar2 = (o53.b) this.f214398b;
                Bitmap bitmap = (Bitmap) this.f214399c;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    String strEncodeToString = Base64.encodeToString(byteArray, 2);
                    Intrinsics.h(strEncodeToString);
                    bVar2.a(strEncodeToString);
                    return;
                } catch (Throwable th10) {
                    try {
                        throw th10;
                    } catch (Throwable th11) {
                        com.bumptech.glide.d.e(byteArrayOutputStream, th10);
                        throw th11;
                    }
                }
            case 13:
                ((o7c.a) this.f214398b).f222747a.c(o7c.a.b((jf0.c) this.f214399c));
                return;
            case 14:
                o7c.e eVar = (o7c.e) this.f214398b;
                NaviCommand naviCommand = (NaviCommand) this.f214399c;
                sri.m mVar = eVar.f222754a;
                Intrinsics.h(naviCommand);
                mVar.c(naviCommand);
                return;
            case 15:
                v vVar = (v) this.f214398b;
                String url2 = (String) this.f214399c;
                nee.l lVar = (nee.l) vVar.i;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                Uri uriF = ((f80.b) lVar.f214499a).f(url2);
                if (uriF == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                lVar.f214500b.onNext(Intrinsics.f(uriF.getScheme(), "http") ? new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.VIEW", null, null, null, uriF, 14), null, null, null, 0, null, null, null, null, false, 1022) : new FeatureCommand(new WebViewFeatureConfig(url2, null, 0, false, false, false, 130974)));
                return;
            case 16:
                ((oq3.m) this.f214398b).f227722a.c((NaviCommand) this.f214399c);
                return;
            case 17:
                ((oq3.o) this.f214398b).f227730a.c((FeatureCommand) this.f214399c);
                return;
            case 18:
                or2.g gVar = (or2.g) this.f214398b;
                String str2 = (String) this.f214399c;
                synchronized (gVar) {
                    List listA = gVar.a();
                    if (listA != null) {
                        arrayListF1 = d0.f1(listA);
                        a0.E(arrayListF1, new t3(str2, 6));
                        ue0.c cVar2 = gVar.f228049b;
                        KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                        KType kTypeB = o0.b(rr2.a.class);
                        companion.getClass();
                        cVar2.G(arrayListF1, "blocked_merchants_list", z.d(o0.f186429a.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB)))));
                    }
                }
                if (arrayListF1 != null) {
                    ArrayList arrayList = new ArrayList(w.t(arrayListF1, 10));
                    Iterator it8 = arrayListF1.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(or2.a.b((rr2.a) it8.next()));
                    }
                    gVar.f.k(Unit.f186387a, arrayList);
                    return;
                }
                return;
            case 19:
                ((os5.e) this.f214398b).f229234a.b(new dt5.d((KompotDestination) this.f214399c));
                return;
            case 20:
                ((os5.e) this.f214398b).f229234a.b(new dt5.c((BridgeDestination) this.f214399c));
                return;
            case 21:
                com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a aVar4 = (com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a) this.f214398b;
                FreelancerCustomer freelancerCustomer = (FreelancerCustomer) this.f214399c;
                aVar4.C1(new BridgeDestination(new FeatureCommand(new FreelancerBizFeatureConfig.FreelancerAddCustomer(freelancerCustomer.f73281a, freelancerCustomer.f73282b, freelancerCustomer.f73283c, freelancerCustomer.d, freelancerCustomer.e, freelancerCustomer.f, 64))));
                return;
            case 22:
                ((oy5.b) this.f214398b).f230889a.b((FeatureCommand) this.f214399c);
                return;
            case 23:
                ((t) this.f214398b).k.onNext((oe0.a) this.f214399c);
                return;
            case 24:
                yzc.f fVar = (yzc.f) this.f214398b;
                r0 r0Var = (r0) this.f214399c;
                if (fVar instanceof yzc.d) {
                    inputData = new ViewImageDestination.InputData.Local(((yzc.d) fVar).f318069c);
                } else {
                    if (!(fVar instanceof yzc.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    inputData = new ViewImageDestination.InputData.Remote(null, ((yzc.e) fVar).d);
                }
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                ViewImageDestination destination = new ViewImageDestination(inputData);
                Intrinsics.checkNotNullParameter(destination, "destination");
                r0Var.d(new FeatureCommand(new ViewImageConfig(null, destination, false, null, 0, 61)));
                return;
            case 25:
                r0 r0Var2 = (r0) this.f214398b;
                String str3 = (String) this.f214399c;
                v60.i iVar = r0Var2.f248734a;
                Uri uri2 = Uri.parse(str3);
                Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
                iVar.onNext(new BrowserCommand(uri2));
                return;
            case 26:
                r0 r0Var3 = (r0) this.f214398b;
                ArrayList arrayList2 = (ArrayList) this.f214399c;
                v60.i iVar2 = r0Var3.f248734a;
                qi3.t.Companion.getClass();
                ExplicitActivityDestination explicitActivityDestination = com.revolut.feature.chooser.b.f65915b;
                ChooserConfiguration.ConfigurationType.INSTANCE.getClass();
                iVar2.onNext(new ActivityNavigateCommand(explicitActivityDestination, new ChooserConfiguration(arrayList2, ChooserConfiguration.ConfigurationType.Companion.e, "SELF_SERVE_SOW_FLOW", false, null, null, false, 0, null, false, 16120), null, null, 0, null, null, null, null, false, 1020));
                return;
            case 27:
                r0 r0Var4 = (r0) this.f214398b;
                NaviCommand naviCommand2 = (NaviCommand) this.f214399c;
                ((t) r0Var4.f231311c).c1(ozc.h.REQUEST_DOCUMENTS);
                r0Var4.f248734a.onNext(naviCommand2);
                return;
            case 28:
                r rVar = (r) this.f214398b;
                y yVar = (y) this.f214399c;
                opi.d dVar2 = rVar.f232946l;
                Intrinsics.h(yVar);
                ((opi.b) dVar2).Z(yVar);
                return;
            default:
                Boolean bool2 = (Boolean) this.f214398b;
                pb3.b bVar3 = (pb3.b) this.f214399c;
                if (bool2.booleanValue()) {
                    bVar3.f234629c.c(new FeatureCommand(new CashTopUpFeatureConfig(cb3.a.EU_FLOW)));
                    return;
                }
                return;
        }
    }
}
