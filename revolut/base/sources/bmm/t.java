package bmm;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import androidx.room.RxRoom;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.storiesdelegates.ImageStoriesDelegate;
import com.revolut.core.ui_kit.storiesdelegates.ImageStoriesModel;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.feature.toggles.models.FeatureDefinition;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.tracking.v3.App;
import com.revolut.tracking.v3.SettingsPermissionsContext;
import grl.mb;
import grl.ob;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.bouncycastle.asn1.cmc.BodyPartID;
import qlm.d1;
import skm.p0;
import voi.i;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class t implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16960c;

    public /* synthetic */ t(Object obj2, Object obj3, int i) {
        this.f16958a = i;
        this.f16959b = obj2;
        this.f16960c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long jA;
        Bundle bundle;
        Bundle bundle2;
        String str;
        int i = 3;
        int i2 = 1;
        int i3 = 2;
        int i5 = 0;
        switch (this.f16958a) {
            case 0:
                u uVar = (u) this.f16959b;
                e0 e0Var = (e0) this.f16960c;
                try {
                    uVar.f16961a.d(e0Var);
                    break;
                } catch (IOException e) {
                    emm.h.Companion.getClass();
                    emm.h.f127697a.j(4, "Http2Connection.Listener failure for " + uVar.f16963c, e);
                    try {
                        e0Var.c(b.PROTOCOL_ERROR, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return Unit.f186387a;
            case 1:
                e0[] e0VarArr = null;
                bjm.d dVar = (bjm.d) this.f16959b;
                m0 settings = (m0) this.f16960c;
                Intrinsics.checkNotNullParameter(settings, "settings");
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                u uVar2 = (u) dVar.f16204c;
                synchronized (uVar2.f16976x) {
                    synchronized (uVar2) {
                        try {
                            m0 m0Var = uVar2.f16973s;
                            m0 m0Var2 = new m0();
                            m0Var2.b(m0Var);
                            m0Var2.b(settings);
                            ref$ObjectRef.f186409a = m0Var2;
                            jA = ((long) m0Var2.a()) - ((long) m0Var.a());
                            if (jA != 0 && !uVar2.f16962b.isEmpty()) {
                                e0VarArr = (e0[]) uVar2.f16962b.values().toArray(new e0[0]);
                            }
                            m0 m0Var3 = (m0) ref$ObjectRef.f186409a;
                            Intrinsics.checkNotNullParameter(m0Var3, "<set-?>");
                            uVar2.f16973s = m0Var3;
                            xlm.b.c(uVar2.f16966j, uVar2.f16963c + " onSettings", 0L, new t(uVar2, ref$ObjectRef, 2), 6);
                            Unit unit = Unit.f186387a;
                        } catch (Throwable th10) {
                            throw th10;
                        }
                    }
                    try {
                        uVar2.f16976x.d((m0) ref$ObjectRef.f186409a);
                    } catch (IOException e2) {
                        b bVar = b.PROTOCOL_ERROR;
                        uVar2.d(bVar, bVar, e2);
                    }
                    Unit unit2 = Unit.f186387a;
                    break;
                }
                if (e0VarArr != null) {
                    int length = e0VarArr.length;
                    while (i5 < length) {
                        e0 e0Var2 = e0VarArr[i5];
                        synchronized (e0Var2) {
                            e0Var2.e += jA;
                            if (jA > 0) {
                                e0Var2.notifyAll();
                            }
                            Unit unit3 = Unit.f186387a;
                        }
                        i5++;
                    }
                }
                return Unit.f186387a;
            case 2:
                u uVar3 = (u) this.f16959b;
                uVar3.f16961a.a(uVar3, (m0) ((Ref$ObjectRef) this.f16960c).f186409a);
                return Unit.f186387a;
            case 3:
                ((ImageStoriesDelegate) this.f16959b).e.invoke((ImageStoriesModel) this.f16960c);
                return Unit.f186387a;
            case 4:
                BaseFlow.d3((BaseFlow) this.f16959b, (dki.b0) this.f16960c);
                return Unit.f186387a;
            case 5:
                BaseFlow baseFlow = (BaseFlow) ((com.revolut.kompot.navigable.a) this.f16959b);
                dki.e0 restorationPolicy = new dki.e0(((BaseFlow) this.f16960c).S2(), false);
                baseFlow.getClass();
                Intrinsics.checkNotNullParameter(restorationPolicy, "restorationPolicy");
                ((dki.g) baseFlow.S2()).J2(restorationPolicy);
                return Unit.f186387a;
            case 6:
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) this.f16959b;
                dki.g gVar = (dki.g) this.f16960c;
                aVar.q2().f206461b = gVar.A2().e;
                if ((aVar instanceof BaseScreen) && (bundle2 = gVar.A2().d) != null) {
                    ((BaseScreen) aVar).e(bundle2);
                }
                if ((aVar instanceof ViewController) && (bundle = gVar.A2().d) != null) {
                    ((ViewController) aVar).e(bundle);
                }
                return Unit.f186387a;
            case 7:
                ip.a aVar2 = (ip.a) this.f16959b;
                return new xoi.e(aVar2.b().A5(), aVar2.b().k.f197513b.a(), aVar2.b().D5(), (ijj.r) this.f16960c);
            case 8:
                i70.a aVar3 = (i70.a) this.f16959b;
                Context context = (Context) this.f16960c;
                aVar3.getClass();
                String str2 = Build.SERIAL;
                if (str2 != null) {
                    if (kotlin.text.d0.W(str2)) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        List list = i70.b.f159045a;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it8 = list.iterator();
                            while (it8.hasNext()) {
                                if (kotlin.text.a0.z((String) it8.next(), str2, true)) {
                                }
                            }
                        }
                        return Build.SERIAL;
                    }
                }
                return Settings.Secure.getString(context.getContentResolver(), "android_id");
            case 9:
                Regex regex = (Regex) this.f16959b;
                CharSequence charSequence = (CharSequence) this.f16960c;
                Regex.Companion companion = Regex.INSTANCE;
                return regex.b(charSequence);
            case 10:
                mb mbVar = (mb) this.f16959b;
                ob obVar = (ob) this.f16960c;
                AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
                SettingsPermissionsContext.a aVarNewBuilder = SettingsPermissionsContext.newBuilder();
                aVarNewBuilder.c();
                ((SettingsPermissionsContext) aVarNewBuilder.f49761b).setKind(mbVar);
                aVarNewBuilder.c();
                ((SettingsPermissionsContext) aVarNewBuilder.f49761b).setState(obVar);
                w0 w0VarA = aVarNewBuilder.a();
                companion2.getClass();
                return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
            case 11:
                return CollapsingActionButton.a((Context) this.f16959b, (CollapsingActionButton) this.f16960c);
            case 12:
                return com.bumptech.glide.c.e((String) this.f16959b, olm.k.e, new SerialDescriptor[0], new qgf.o((d1) this.f16960c, 10));
            case 13:
                qd0.b bVar2 = (qd0.b) this.f16959b;
                uo.e eVar = (uo.e) this.f16960c;
                od0.a aVar4 = od0.a.f224253a;
                int i6 = uo.d.f281470a[od0.a.c().ordinal()];
                if (i6 == 1) {
                    str = ".e2etest";
                } else if (i6 == 2) {
                    str = ".uitest";
                } else {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "";
                }
                App.a aVarNewBuilder2 = App.newBuilder();
                String string = ((s80.b) bVar2).b().toString();
                aVarNewBuilder2.c();
                ((App) aVarNewBuilder2.f49761b).setLocale(string);
                Context context2 = eVar.f281471a;
                String str3 = context2.getPackageName() + str;
                aVarNewBuilder2.c();
                ((App) aVarNewBuilder2.f49761b).setId(str3);
                String str4 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                String strT0 = str4 != null ? str4 : "";
                int length2 = strT0.length();
                int i21 = 0;
                while (true) {
                    if (i21 < length2) {
                        char cCharAt = strT0.charAt(i21);
                        if (Character.isDigit(cCharAt) || cCharAt == '.') {
                            i21++;
                        }
                    } else {
                        i21 = -1;
                    }
                }
                if (i21 != -1) {
                    strT0 = kotlin.text.d0.t0(strT0, kotlin.ranges.f.o(0, i21));
                }
                aVarNewBuilder2.c();
                ((App) aVarNewBuilder2.f49761b).setVersion(strT0);
                int longVersionCode = (int) (context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).getLongVersionCode() & BodyPartID.bodyIdMax);
                aVarNewBuilder2.c();
                ((App) aVarNewBuilder2.f49761b).setBuildNumber(longVersionCode);
                return (App) aVarNewBuilder2.a();
            case 14:
                ((ve0.c) this.f16959b).a().unregisterOnSharedPreferenceChangeListener((ve0.a) this.f16960c);
                return Unit.f186387a;
            case 15:
                voi.i iVar = (voi.i) this.f16959b;
                FeatureDefinition featureDefinition = (FeatureDefinition) this.f16960c;
                i.a aVar5 = voi.i.Companion;
                return Boolean.valueOf(((jte.d) iVar.d().b()).c(featureDefinition));
            case 16:
                ((xe0.c) this.f16959b).a().unregisterOnSharedPreferenceChangeListener((ve0.a) this.f16960c);
                return Unit.f186387a;
            case 17:
                xx9.m mVar = (xx9.m) this.f16959b;
                u0a.a aVar6 = (u0a.a) this.f16960c;
                kx9.a aVar7 = mVar.f309431a;
                efm.r rVarCreateObservable = RxRoom.createObservable(aVar7.f190507a, false, new String[]{"payments_recent_v2"}, new kv7.g(aVar7, 15));
                int i22 = 7;
                efm.r rVarE = m70.a.e(((sl3.k) mVar.f309434g).g(), new xx9.e(6), new xx9.e(i22));
                zhm.f0 f0Var = zhm.f0.f322471a;
                efm.r rVarE2 = ue0.e.E(rVarE, f0Var);
                sl3.u uVar4 = mVar.f309435h;
                efm.r rVarG = uVar4.f264132a.g();
                efm.r rVarB = uVar4.b();
                Intrinsics.checkNotNullExpressionValue(rVarB, "observeRemoteExtraMap(...)");
                efm.r map = te0.w.l(rVarG, rVarB).map(new sl3.r(new sl3.i(i3), i5));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                int i32 = 17;
                efm.r map2 = te0.w.m(rVarE2, ue0.e.E(m70.a.f(te0.w.f0(map), new x0b.h(i32), new xx9.e(i5), new xx9.e(i2)), f0Var), rd0.e.c(mo3.a.e(nim.a.v(((nj8.n) mVar.f309443s).l(w4l.h.f294642c), new xub.e(27)), new xx9.e(8), new xx9.e(9)), kotlin.coroutines.g.f186406a)).map(new xx9.d(i, new xx9.c(mVar, i)));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                efm.r map3 = ((ml3.x) mVar.i.b).d().map(new sl3.r(new sl3.i(i22), 13));
                Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
                int i33 = 29;
                efm.r rVarE3 = ue0.e.E(m70.a.e(te0.w.f0(map3), new xti.k(28), new xti.k(i33)), f0Var);
                efm.r rVarE4 = ue0.e.E(m70.a.e(o71.a.c(mVar.f309436j, false, 5), new xti.k(16), new xti.k(i32)), f0Var);
                int i43 = 2;
                sfm.b bVar3 = new sfm.b(ue0.e.F(mVar.f309437l.f18754a.d(), Boolean.FALSE), new xx9.d(i43, new xx9.c(mVar, i43)), i43);
                Intrinsics.checkNotNullExpressionValue(bVar3, "flatMapObservable(...)");
                efm.r rVarE5 = ue0.e.E(m70.a.e(bVar3, new xti.k(26), new xti.k(27)), f0Var);
                efm.d0 d0VarA = mVar.f309439n.a();
                xt1.a aVar8 = new xt1.a(i33, new xx9.c(mVar, 1));
                d0VarA.getClass();
                sfm.b bVar4 = new sfm.b(d0VarA, aVar8, 2);
                Intrinsics.checkNotNullExpressionValue(bVar4, "flatMapObservable(...)");
                efm.r rVarE6 = ue0.e.E(m70.a.e(bVar4, new xti.k(18), new xti.k(19)), f0Var);
                efm.r rVarE7 = ue0.e.E(m70.a.e(mVar.o.c(), new xti.k(22), new xti.k(23)), f0Var);
                int i59 = 25;
                efm.r rVarE8 = ue0.e.E(m70.a.e(((mr9.a) mVar.f309440p).i(false), new xti.k(24), new xti.k(i59)), f0Var);
                ag1.k kVarA = mVar.f309441q.a();
                kotlinx.coroutines.d dVar2 = p0.f264003c;
                efm.r map4 = te0.w.s(map2, rVarE3, rVarE4, rVarE5, rVarE6, rVarE7, rVarE8, ue0.e.E(rd0.e.c(kVarA, dVar2), f0Var), ue0.e.H(rd0.e.c(mo3.a.e(mVar.f309444t.b(), new xti.k(20), new xti.k(21)), dVar2), zhm.h0.f322473a, new xub.e(i59))).map(new xx9.d(i22, new xx9.f(mVar, i5)));
                Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
                efm.r rVarG2 = m70.a.g(mVar.u.d(), null, null, 3);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                Map mapG = r0.g();
                efm.r rVarDefaultIfEmpty = rVarG2.materialize().publish(new twl.o(9, new njf.h(mapG, 3))).dematerialize(new twl.o(9, xx9.l.f309430a)).defaultIfEmpty(mapG);
                Intrinsics.checkNotNullExpressionValue(rVarDefaultIfEmpty, "defaultIfEmpty(...)");
                efm.r rVarSwitchMap = te0.w.m(rVarCreateObservable, map4, ue0.e.E(rVarDefaultIfEmpty, r0.g())).switchMap(new xx9.d(i5, new xx9.c(mVar, i5)));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                return rVarSwitchMap.doOnNext(new xt1.a(28, new xw9.c(aVar6, 2))).replay(1).e();
            default:
                ((yji.q) this.f16959b).f314529n.e((Bundle) this.f16960c);
                return Unit.f186387a;
        }
    }
}
