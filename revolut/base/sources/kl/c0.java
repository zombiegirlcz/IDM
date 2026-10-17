package kl;

import android.net.Uri;
import aw0.j8;
import aw0.o9;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.workflow.internal.WaitingScreenThreshold;
import com.revolut.core.ui_kit.internal.views.TimerView;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.feature.apm.aani.impl.data.network.AaniQrCodeService;
import com.revolut.feature.credit.card.impl.ui.topup.CreditCardTopupScreen;
import com.revolut.feature.junior_tasks.impl.services.JuniorTasksRewardsQuoteService;
import com.revolut.feature.retail.global_accounts.impl.data.service.CountryProfilesManagementService;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import io.reactivex.rxjava3.core.Observable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ms0.w4;

/* JADX INFO: loaded from: classes17.dex */
public final class c0 implements igm.o, zp0.c, kfm.o, y2j.d, kfm.g, w4, et0.a1, nd.i, pc.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f185148b;

    public c0(j2i.c function) {
        this.f185147a = 4;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f185148b = function;
    }

    @Override // et0.a1
    public void B(long j2) {
        ChatInputView chatInputView = (ChatInputView) this.f185148b;
        chatInputView.d0(chatInputView.getWaveformSeekBarTimer(), j2);
    }

    @Override // ms0.w4
    public void a(int i) {
        TimerView timerView = (TimerView) this.f185148b;
        TimerView.Companion aVar = TimerView.INSTANCE;
        timerView.b().setText(timerView.a(i));
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((kfm.a) this.f185148b).run();
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        switch (this.f185147a) {
            case 0:
                ml.e eVar = (ml.e) obj2;
                e0 e0Var = (e0) this.f185148b;
                Intrinsics.h(eVar);
                WaitingScreenTracker waitingScreenTracker = e0Var.o;
                OnfidoRemoteConfig onfidoRemoteConfig = e0Var.f185172l;
                boolean z = eVar instanceof ml.a;
                if (z) {
                    String str = e0Var.f185177s;
                    e0Var.f185178t = str;
                    waitingScreenTracker.trackWaitingScreenStart("IN_BETWEEN_STUDIO_TASKS", str, zhm.d0.d1(onfidoRemoteConfig.getStudioWaitingScreensTimeThresholds().values()));
                } else if (eVar instanceof ml.b) {
                    waitingScreenTracker.trackWaitingScreenCompletion("IN_BETWEEN_STUDIO_TASKS", e0Var.f185178t);
                    e0Var.f185177s = ((ml.b) eVar).f206515a.getId();
                } else if (eVar instanceof ml.d) {
                    waitingScreenTracker.trackWaitingScreenCompletion("IN_BETWEEN_STUDIO_TASKS", e0Var.f185178t);
                    e0Var.f185177s = "NON_INTERACTIVE";
                }
                if (z) {
                    Observable observableConcatMap = Observable.fromIterable(zhm.v.n(new z(R.string.onfido_studio_between_interactive_tasks_waiting_title_1, R.string.onfido_studio_between_interactive_tasks_waiting_subtitle_1, null), new z(R.string.onfido_studio_between_interactive_tasks_waiting_title_2, R.string.onfido_studio_between_interactive_tasks_waiting_subtitle_2, onfidoRemoteConfig.getStudioWaitingScreensTimeThresholds().get(WaitingScreenThreshold.ShortWaiting1.INSTANCE)), new z(R.string.onfido_studio_between_interactive_tasks_waiting_title_2, R.string.onfido_studio_between_interactive_tasks_waiting_subtitle_3, onfidoRemoteConfig.getStudioWaitingScreensTimeThresholds().get(WaitingScreenThreshold.ShortWaiting2.INSTANCE)), new z(R.string.onfido_studio_between_interactive_tasks_waiting_title_3, R.string.onfido_studio_between_interactive_tasks_waiting_subtitle_4, onfidoRemoteConfig.getStudioWaitingScreensTimeThresholds().get(WaitingScreenThreshold.MediumWaiting1.INSTANCE)), new z(R.string.onfido_studio_between_interactive_tasks_waiting_title_4, R.string.onfido_studio_between_interactive_tasks_waiting_subtitle_5, onfidoRemoteConfig.getStudioWaitingScreensTimeThresholds().get(WaitingScreenThreshold.MediumWaiting2.INSTANCE)), new z(R.string.onfido_studio_between_interactive_tasks_waiting_title_3, R.string.onfido_studio_between_interactive_tasks_waiting_subtitle_4, onfidoRemoteConfig.getStudioWaitingScreensTimeThresholds().get(WaitingScreenThreshold.LongWaiting1.INSTANCE)), new z(R.string.onfido_studio_between_interactive_tasks_waiting_title_4, R.string.onfido_studio_between_interactive_tasks_waiting_subtitle_5, onfidoRemoteConfig.getStudioWaitingScreensTimeThresholds().get(WaitingScreenThreshold.LongWaiting2.INSTANCE)))).concatMap(new b0(e0Var, 0));
                    Intrinsics.checkNotNullExpressionValue(observableConcatMap, "concatMap(...)");
                    return observableConcatMap;
                }
                Observable observableJust = Observable.just(y.f185251a);
                Intrinsics.h(observableJust);
                return observableJust;
            case 4:
                return ((j2i.c) this.f185148b).invoke(obj2);
            case 6:
                return ((lak.l) this.f185148b).invoke(obj2);
            case 14:
                return ((m08.i) this.f185148b).invoke(obj2);
            case 22:
                return ((n33.p1) this.f185148b).invoke(obj2);
            case 25:
                return ((kotlin.jvm.internal.h0) this.f185148b).invoke(obj2);
            case 27:
                return ((ne0.e) this.f185148b).invoke(obj2);
            default:
                return ((ny7.t) this.f185148b).invoke(obj2);
        }
    }

    @Override // ms0.w4
    public void b(int i) {
        TimerView timerView = (TimerView) this.f185148b;
        timerView.f56447c = i;
        timerView.c().setMax(i);
    }

    @Override // y2j.d
    public j8 c(f5j.a beneficiary) throws IOException {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        TextClause textClause = new TextClause(n61.j.d(beneficiary), (Style) null, (Integer) null, false, (o9) null, (List) null, 124);
        TextClause textClauseV = f61.a.v(beneficiary);
        m3j.j jVar = (m3j.j) this.f185148b;
        return new j8(textClause, textClauseV, jVar.a(beneficiary), jVar.b(beneficiary), 16);
    }

    @Override // ms0.w4
    public void d(int i) {
        TimerView timerView = (TimerView) this.f185148b;
        TimerView.Companion aVar = TimerView.INSTANCE;
        timerView.d(i);
    }

    @Override // nd.i
    public Object e(String str) {
        return ((nd.q) this.f185148b).a(str, null);
    }

    public akg.n f(ArrayList plainWatchlistItems) {
        vkm.d dVarB;
        Intrinsics.checkNotNullParameter(plainWatchlistItems, "plainWatchlistItems");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : plainWatchlistItems) {
            FavouritesAssetTypeKey favouritesAssetTypeKey = ((z3d.e) obj2).d;
            Object arrayList = linkedHashMap.get(favouritesAssetTypeKey);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(favouritesAssetTypeKey, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            FavouritesAssetTypeKey favouritesAssetTypeKey2 = (FavouritesAssetTypeKey) entry.getKey();
            List list = (List) entry.getValue();
            u3d.b bVar = (u3d.b) ((LinkedHashMap) this.f185148b).get(favouritesAssetTypeKey2);
            if (bVar == null) {
                dVarB = null;
            } else {
                List list2 = list;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(((z3d.e) it8.next()).f319253a);
                }
                dVarB = rd0.e.b(nim.a.w(zi0.c.o(bVar.i(arrayList3)), new kzc.a(this, list, bVar, 10)));
            }
            if (dVarB != null) {
                arrayList2.add(dVarB);
            }
        }
        return nim.a.v(zh9.u0.k(arrayList2), new l2d.a(9));
    }

    @Override // et0.a1
    public void g(long j2) {
        Uri uri2;
        oo0.d dVar;
        ChatInputView chatInputView = (ChatInputView) this.f185148b;
        oo0.g gVar = chatInputView.f58461o0;
        if (gVar == null || (uri2 = gVar.d) == null || (dVar = chatInputView.f58460n0) == null) {
            return;
        }
        ((oo0.k) dVar).h(uri2, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(com.revolut.feature.selfserve.sot.api.models.IncomeSource r5, com.revolut.feature.selfserve.sot.api.models.DocumentType r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof lyc.a
            if (r0 == 0) goto L13
            r0 = r7
            lyc.a r0 = (lyc.a) r0
            int r1 = r0.f200777w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f200777w = r1
            goto L18
        L13:
            lyc.a r0 = new lyc.a
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f200777w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L27
            goto L5f
        L27:
            r5 = move-exception
            goto L65
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            kxc.c r7 = new kxc.c     // Catch: java.lang.Exception -> L27
            kxc.a r2 = kxc.a.SOT     // Catch: java.lang.Exception -> L27
            java.lang.String r5 = r5.f85873a     // Catch: java.lang.Exception -> L27
            java.lang.String r6 = r6.f85859a     // Catch: java.lang.Exception -> L27
            r7.<init>(r2, r5, r6)     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r4.f185148b     // Catch: java.lang.Exception -> L27
            ks0.n r5 = (ks0.n) r5     // Catch: java.lang.Exception -> L27
            efm.r r5 = r5.d(r7)     // Catch: java.lang.Exception -> L27
            r6 = 3
            r7 = 0
            efm.r r5 = m70.a.g(r5, r7, r7, r6)     // Catch: java.lang.Exception -> L27
            efm.d0 r5 = r5.firstOrError()     // Catch: java.lang.Exception -> L27
            java.lang.String r6 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)     // Catch: java.lang.Exception -> L27
            r0.f200777w = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r7 = nim.a.b(r5, r0)     // Catch: java.lang.Exception -> L27
            if (r7 != r1) goto L5f
            return r1
        L5f:
            kotlin.jvm.internal.Intrinsics.h(r7)     // Catch: java.lang.Exception -> L27
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> L27
            return r7
        L65:
            gom.c r6 = gom.e.f145194a
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r0 = "SOT Kompot: getInstructions failed"
            r6.e(r5, r0, r7)
            zhm.f0 r5 = zhm.f0.f322471a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kl.c0.h(com.revolut.feature.selfserve.sot.api.models.IncomeSource, com.revolut.feature.selfserve.sot.api.models.DocumentType, gim.c):java.lang.Object");
    }

    public efm.r i() {
        nzc.d dVar = (nzc.d) this.f185148b;
        return nim.a.w(dVar.f.f(Unit.f186387a, true), new nzc.b(dVar, 6));
    }

    @Override // zp0.c
    public void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        kw4.z zVar = (kw4.z) ((CreditCardTopupScreen) this.f185148b).k3();
        zVar.getClass();
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        xi0.b bVar = zVar.I2().f190228m.f115083b;
        zVar.K2(new kw4.g(new dj0.d(zVar.f190255s.b(formattedValue, bVar.f306286a), bVar), false, kw4.f.KEYBOARD));
    }

    @Override // pc.c
    public Object zza() {
        return new oc.j(((oc.f) ((b0) this.f185148b).f185144b).f224008a);
    }

    public /* synthetic */ c0(Object obj2, int i) {
        this.f185147a = i;
        this.f185148b = obj2;
    }

    public c0(kotlin.jvm.internal.h0 function) {
        this.f185147a = 25;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f185148b = function;
    }

    public c0(lak.l function) {
        this.f185147a = 6;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f185148b = function;
    }

    public c0(m08.i function) {
        this.f185147a = 14;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f185148b = function;
    }

    public c0(n33.p1 function) {
        this.f185147a = 22;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f185148b = function;
    }

    public c0(ne0.e function) {
        this.f185147a = 27;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f185148b = function;
    }

    public c0(ny7.t function) {
        this.f185147a = 28;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f185148b = function;
    }

    public c0(mn5.c baseXCodec) {
        this.f185147a = 17;
        Intrinsics.checkNotNullParameter(baseXCodec, "baseXCodec");
        this.f185148b = new int[]{255, 255, 26, 27, 28, 29, 30, 31, 255, 255, 255, 255, 255, 255, 255, 255, 255, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 255, 255, 255, 255, 255, 255, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 255, 255, 255, 255, 255};
    }

    public c0(PushTokenizeRequest internal) {
        this.f185147a = 7;
        Intrinsics.checkNotNullParameter(internal, "internal");
        this.f185148b = internal;
    }

    public c0(File cacheDirectory) {
        this.f185147a = 12;
        Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
        this.f185148b = cacheDirectory;
    }

    public c0(egk.e pricingPlansUiInteractor) {
        this.f185147a = 10;
        Intrinsics.checkNotNullParameter(pricingPlansUiInteractor, "pricingPlansUiInteractor");
        this.f185148b = pricingPlansUiInteractor;
    }

    public c0(mjk.z elementMapper, mjk.i planHubScreenHeaderMapper) {
        this.f185147a = 16;
        Intrinsics.checkNotNullParameter(elementMapper, "elementMapper");
        Intrinsics.checkNotNullParameter(planHubScreenHeaderMapper, "planHubScreenHeaderMapper");
        this.f185148b = elementMapper;
    }

    public c0(hu5.e cryptoTaxRepository) {
        this.f185147a = 19;
        Intrinsics.checkNotNullParameter(cryptoTaxRepository, "cryptoTaxRepository");
        this.f185148b = cryptoTaxRepository;
    }

    public c0(mya.g invitesV4WidgetProvider) {
        this.f185147a = 21;
        Intrinsics.checkNotNullParameter(invitesV4WidgetProvider, "invitesV4WidgetProvider");
        this.f185148b = invitesV4WidgetProvider;
    }

    public c0(oy1.b navigationProvider) {
        this.f185147a = 24;
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        this.f185148b = navigationProvider;
    }

    public c0(AaniQrCodeService service) {
        this.f185147a = 26;
        Intrinsics.checkNotNullParameter(service, "service");
        this.f185148b = service;
    }

    public c0(CountryProfilesManagementService countryProfilesManagementService) {
        this.f185147a = 5;
        Intrinsics.checkNotNullParameter(countryProfilesManagementService, "countryProfilesManagementService");
        this.f185148b = countryProfilesManagementService;
    }

    public c0(JuniorTasksRewardsQuoteService service) {
        this.f185147a = 8;
        Intrinsics.checkNotNullParameter(service, "service");
        this.f185148b = service;
    }

    public c0(f61.a beneficiaryAccountFieldsNameMapper, m3j.j beneficiaryAvatarMapper) {
        this.f185147a = 13;
        Intrinsics.checkNotNullParameter(beneficiaryAccountFieldsNameMapper, "beneficiaryAccountFieldsNameMapper");
        Intrinsics.checkNotNullParameter(beneficiaryAvatarMapper, "beneficiaryAvatarMapper");
        this.f185148b = beneficiaryAvatarMapper;
    }

    public c0(ia3.r cardsContentDetailedMapper) {
        this.f185147a = 9;
        Intrinsics.checkNotNullParameter(cardsContentDetailedMapper, "cardsContentDetailedMapper");
        this.f185148b = cardsContentDetailedMapper;
    }

    public c0(ks0.n instructionsInteractor) {
        this.f185147a = 11;
        Intrinsics.checkNotNullParameter(instructionsInteractor, "instructionsInteractor");
        this.f185148b = instructionsInteractor;
    }

    public c0(nzc.d sowRepository) {
        this.f185147a = 2;
        Intrinsics.checkNotNullParameter(sowRepository, "sowRepository");
        this.f185148b = sowRepository;
    }

    public c0(Set interactors) {
        this.f185147a = 3;
        Intrinsics.checkNotNullParameter(interactors, "interactors");
        Set set = interactors;
        int iB = zhm.q0.b(zhm.w.t(set, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : set) {
            linkedHashMap.put(((u3d.b) obj2).a(), obj2);
        }
        this.f185148b = linkedHashMap;
    }
}
