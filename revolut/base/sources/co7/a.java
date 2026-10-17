package co7;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.Camera2ImplConfigKt;
import androidx.camera.camera2.interop.Camera2Interop$Extender;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.video.FallbackStrategy;
import androidx.camera.video.Quality;
import androidx.camera.video.QualitySelector;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoOutput;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.core.util.Preconditions;
import com.google.android.material.snackbar.BaseShot;
import com.revolut.camerakit.core.settings.VideoEncodingBitRate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.defi.asset_details.api.model.DefiCurrency;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.decline.MtaDeclineScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.edit_application.EditApplicationScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.detail.EmbeddedInsuranceDetailScreen;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.details.ChallengesOverviewDetailsScreen;
import com.revolut.feature.payments.profile.api.navigation.PaymentProfileFeatureConfig;
import com.revolut.feature.selfserve.sow.impl.ui.home.SowHomeActivity;
import com.revolut.feature.shared.consent.prompt.builder.impl.ui.screen.ConsentPromptScreen;
import com.revolut.feature.transfer.core.api.ui.additional_information.AdditionalInformationInputData;
import com.revolut.feature.transfer.core.impl.ui.additional_information.AdditionalInformationScreen;
import com.revolut.feature.transfer.models.config.AdditionalInformationInput;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.balance.picker.impl.new_picker.CurrencyChooserFlow;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.models.CategoryBudgetEditingInfo;
import com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.flow.JuniorUpgradeFlow;
import cp7.m;
import cp7.p;
import csj.u;
import cv7.l;
import d6e.o;
import d6e.r;
import d6j.n0;
import gp8.j;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import lpf.n;
import lu7.y;
import org.jetbrains.annotations.NotNull;
import ql7.f0;
import ql7.r1;
import r10.w;
import vkm.j2;
import vkm.q;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25492b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f25491a = i;
        this.f25492b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v9, types: [cqf.h] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v100, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v131, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v77, types: [androidx.camera.camera2.interop.Camera2Interop$Extender] */
    /* JADX WARN: Type inference failed for: r1v90, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Quality quality;
        Object next;
        int i = this.f25491a;
        int i2 = 5;
        String str = null;
        int i3 = 0;
        Object obj2 = this.f25492b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = MtaDeclineScreen.f75533a0;
                r1 r1Var = (r1) ((MtaDeclineScreen) obj2).W.getValue();
                switch (r1Var.f247453a) {
                    case 0:
                        return (f) r1Var.d.get();
                    default:
                        return (f) r1Var.d.get();
                }
            case 1:
                return BaseShot.animateContentIn$lambda$0((BaseShot) obj2);
            case 2:
                return ((com.revolut.feature.restricted_access.h) obj2).f82036j.a(0L);
            case 3:
                KProperty[] kPropertyArr2 = EditApplicationScreen.c0;
                return (cp7.h) ((f0) ((EditApplicationScreen) obj2).X.getValue()).i.get();
            case 4:
                p pVar = (p) obj2;
                pVar.l2(new m(pVar, null), new yi5.b(26));
                return Unit.f186387a;
            case 5:
                cq.g gVar = (cq.g) obj2;
                gVar.f107979a.getLifecycle().addObserver(gVar);
                return Unit.f186387a;
            case 6:
                int i5 = ChallengesOverviewDetailsScreen.U;
                return (cq8.m) ((j) ((ChallengesOverviewDetailsScreen) obj2).Q.getValue()).f145314c.get();
            case 7:
                KProperty[] kPropertyArr3 = AdditionalInformationScreen.f92183b0;
                n nVar = (n) ((AdditionalInformationScreen) obj2).Z.getValue();
                switch (nVar.f199064a) {
                    case 0:
                        return (cqf.h) nVar.i.get();
                    default:
                        return (cqf.h) nVar.i.get();
                }
            case 8:
                ?? r102 = (cqf.h) obj2;
                AdditionalInformationInputData additionalInformationInputData = r102.f108096p;
                String str2 = additionalInformationInputData.f92157c;
                String str3 = str2;
                if (str2 == null) {
                    AdditionalInformationInput additionalInformationInput = additionalInformationInputData.e;
                     = additionalInformationInput != null ? additionalInformationInput.d : 0;
                    str3 =  == 0 ? "" : ;
                }
                return new cqf.e(additionalInformationInputData.d, additionalInformationInputData.f92156b, r102.y2(str3), str3);
            case 9:
                cr0.h hVar = cr0.h.HIDDEN;
                BottomExpandableDialogView.Companion aVar = BottomExpandableDialogView.INSTANCE;
                ((BottomExpandableDialogView) obj2).r0(hVar, false);
                return Unit.f186387a;
            case 10:
                int i6 = 6;
                u uVar = (u) obj2;
                csj.g gVar2 = (csj.g) ((csj.i) uVar.t2()).f108482a.getContent();
                if (gVar2 == null) {
                    return Unit.f186387a;
                }
                List list = gVar2.f108480b;
                dj0.d.Companion.getClass();
                dj0.d dVar = dj0.d.e;
                Iterator it8 = list.iterator();
                dj0.d dVarO = dVar;
                while (true) {
                    Continuation continuation = null;
                    if (!it8.hasNext()) {
                        uVar.n2(new chf.a(uVar, gVar2, dVarO, continuation, 3), new whi.b(i6));
                        return Unit.f186387a;
                    }
                    Object next2 = it8.next();
                    int i21 = i3 + 1;
                    if (i3 < 0) {
                        v.s();
                        throw null;
                    }
                    dVarO = i3 == 0 ? ((CategoryBudgetEditingInfo) next2).f101549c : pyd.c.O(dVarO, ((CategoryBudgetEditingInfo) next2).f101549c);
                    i3 = i21;
                }
                break;
            case 11:
                return ((com.revolut.feature.kyc.impl.b) obj2).u3(false).replay(1).e();
            case 12:
                KProperty[] kPropertyArr4 = EmbeddedInsuranceDetailScreen.f76088d0;
                y yVar = (y) ((EmbeddedInsuranceDetailScreen) obj2).X.getValue();
                switch (yVar.f200191a) {
                    case 0:
                        return (l) yVar.f200196j.get();
                    default:
                        return (l) yVar.f200196j.get();
                }
            case 13:
                cw.a aVar2 = (cw.a) obj2;
                Recorder.Builder builder = new Recorder.Builder();
                yw.h hVar2 = aVar2.f109508b;
                yw.e resolution = hVar2.c();
                Intrinsics.checkNotNullParameter(builder, "<this>");
                Intrinsics.checkNotNullParameter(resolution, "resolution");
                int i22 = yv.c.f317061b[resolution.ordinal()];
                if (i22 == 1) {
                    quality = Quality.SD;
                } else if (i22 == 2) {
                    quality = Quality.HD;
                } else if (i22 == 3) {
                    quality = Quality.FHD;
                } else if (i22 == 4) {
                    quality = Quality.UHD;
                } else {
                    if (i22 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    quality = Quality.HIGHEST;
                }
                Intrinsics.h(quality);
                builder.setQualitySelector(QualitySelector.from(quality, FallbackStrategy.higherQualityOrLowerThan(quality)));
                VideoEncodingBitRate videoEncodingBitRate = hVar2.b().f317231b.f317242a;
                Intrinsics.checkNotNullParameter(builder, "<this>");
                Intrinsics.checkNotNullParameter(videoEncodingBitRate, "videoEncodingBitRate");
                if (videoEncodingBitRate instanceof VideoEncodingBitRate.Custom) {
                    builder = builder.setTargetVideoEncodingBitRate(((VideoEncodingBitRate.Custom) videoEncodingBitRate).f50740a);
                    Intrinsics.h(builder);
                } else if (!(videoEncodingBitRate instanceof VideoEncodingBitRate.Default)) {
                    throw new NoWhenBranchMatchedException();
                }
                Recorder recorderBuild = builder.setExecutor(CameraXExecutors.ioExecutor()).build();
                Intrinsics.checkNotNullExpressionValue(recorderBuild, "build(...)");
                final VideoCapture.Builder builder2 = new VideoCapture.Builder((VideoOutput) Preconditions.checkNotNull(recorderBuild));
                Camera2Interop$Extender sessionCaptureCallback = new Object(builder2) { // from class: androidx.camera.camera2.interop.Camera2Interop$Extender

                    @NotNull
                    private ExtendableBuilder<T> baseBuilder;

                    {
                        Intrinsics.checkNotNullParameter(builder2, "baseBuilder");
                        this.baseBuilder = builder2;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @NotNull
                    public final <ValueT> Camera2Interop$Extender<T> setCaptureRequestOption(@NotNull CaptureRequest.Key<ValueT> key, ValueT value) {
                        Intrinsics.checkNotNullParameter(key, "key");
                        this.baseBuilder.getMutableConfig().insertOption(Camera2ImplConfigKt.createCaptureRequestOption(key), Config.OptionPriority.ALWAYS_OVERRIDE, value);
                        return this;
                    }

                    @NotNull
                    public final Camera2Interop$Extender<T> setSessionCaptureCallback(@NotNull CameraCaptureSession.CaptureCallback captureCallback) {
                        Intrinsics.checkNotNullParameter(captureCallback, "captureCallback");
                        this.baseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.SESSION_CAPTURE_CALLBACK_OPTION, captureCallback);
                        return this;
                    }
                }.setSessionCaptureCallback(new lw.b(aVar2.f109509c));
                String MODEL = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                if (d0.J(MODEL, "SM-E556", true)) {
                    CaptureRequest.Key CONTROL_CAPTURE_INTENT = CaptureRequest.CONTROL_CAPTURE_INTENT;
                    Intrinsics.checkNotNullExpressionValue(CONTROL_CAPTURE_INTENT, "CONTROL_CAPTURE_INTENT");
                    sessionCaptureCallback.setCaptureRequestOption(CONTROL_CAPTURE_INTENT, 1);
                }
                return builder2.build();
            case 14:
                com.revolut.retail.feature.impl.userauth.flow.f fVar = (com.revolut.retail.feature.impl.userauth.flow.f) obj2;
                fVar.l2(new cwj.j(fVar, , i2), new cwj.g(fVar, false ? 1 : 0));
                return Unit.f186387a;
            case 15:
                BaseDelegatesActivity baseDelegatesActivity = (BaseDelegatesActivity) ((cwl.g) obj2).f109869h.get();
                Handler handler = new Handler(Looper.getMainLooper());
                if (baseDelegatesActivity != null) {
                    handler.post(new a4.a(baseDelegatesActivity, handler, 21));
                }
                return handler;
            case 16:
                cya.l lVar = (cya.l) obj2;
                r70.c.b(lVar.f110075l, 3);
                lVar.L2(new mii.i("SHOT_DIALOG_KEY_COPIED", new TextLocalisedClause(R$string.common_action_copied_to_clipboard, null, null, 14), null, null, 28));
                return Unit.f186387a;
            case 17:
                return (cyj.a) ((yxj.b) ((JuniorUpgradeFlow) obj2).P.getValue()).d.get();
            case 18:
                SowHomeActivity sowHomeActivity = (SowHomeActivity) obj2;
                KProperty[] kPropertyArr5 = SowHomeActivity.z0;
                return new z4l.j(7, v.k(new PlainTextWarningDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), new ProgressStepsDelegate(), new ListSubheaderDelegate(), (RowDelegate) sowHomeActivity.f85966x0.getValue(), (ErrorDelegate) sowHomeActivity.f85965w0.getValue()), false ? 1 : 0);
            case 19:
                return SeekableTransitionState.recalculateTotalDurationNanos$lambda$0((SeekableTransitionState) obj2);
            case 20:
                DefiCurrency defiCurrency = (DefiCurrency) obj2;
                return new xi0.b(4, defiCurrency.f71671a, Integer.valueOf(defiCurrency.d));
            case 21:
                return (h1j.a) ((g2j.h) ((g2j.d) ((CurrencyChooserFlow) obj2).P.getValue())).d.get();
            case 22:
                return ShaderBrushSpan.shaderState$lambda$0((ShaderBrushSpan) obj2);
            case 23:
                f01.c cVar = ((r) obj2).e;
                atc.d dVarA = tz4.d.a(cVar, com.revolut.feature.globalsearch.api.R$string.subaccounts_search_category, com.revolut.feature.mainscreen.api.R$string.vaults_search_category);
                zsc.p pVar2 = zsc.p.WORD_PREFIX;
                return new zsc.g(new zsc.h(new Pair(dVarA, pVar2), new Pair(new o(), pVar2)), new zsc.h(new Pair(new btc.a(cVar), pVar2)));
            case 24:
                ((com.revolut.feature.travel.flights.impl.ui.screen.itinerary.a) obj2).C2(d6g.g.f111540a);
                return Unit.f186387a;
            case 25:
                return q.c(((d6j.o) ((j2) ((n0) obj2).R.f22677a).getValue()).e);
            case 26:
                ((d6k.g) obj2).A2(new BridgeDestination(new FeatureCommand(new PaymentProfileFeatureConfig(ew9.a.USERNAME))));
                return Unit.f186387a;
            case 27:
                d6l.h hVar3 = (d6l.h) obj2;
                hVar3.f111636a.getClass();
                return hVar3.f111638c;
            case 28:
                Iterator it9 = ((Set) ((w) obj2).f250866b).iterator();
                if (it9.hasNext()) {
                    next = it9.next();
                    if (it9.hasNext()) {
                        int size = ((List) next).size();
                        do {
                            Object next3 = it9.next();
                            int size2 = ((List) next3).size();
                            if (size < size2) {
                                next = next3;
                                size = size2;
                            }
                        } while (it9.hasNext());
                    }
                } else {
                    next = null;
                }
                List list2 = (List) next;
                if (list2 != null) {
                    str = " (" + list2 + ")";
                }
                return j6.a.q("JuniorProductDataSource", str);
            default:
                return (d7d.f) ((a7d.d) ((ConsentPromptScreen) obj2).W.getValue()).e.get();
        }
    }
}
