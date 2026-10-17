package abf;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.view.View;
import android.widget.TextView;
import androidx.camera.core.CameraX;
import androidx.camera.core.ImageProcessor;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.InternalImageProcessor;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.NestedScrollView;
import cli.y;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.onfido.android.sdk.capture.detector.barcode.BarcodeDetectorGoogle;
import com.onfido.android.sdk.capture.detector.face.FaceDetectorGoogle;
import com.onfido.android.sdk.capture.detector.face.FaceOnDocumentDetectorGoogle;
import com.onfido.android.sdk.capture.internal.util.TaskExtensionKt;
import com.onfido.android.sdk.capture.ui.camera.FaceDetectionFrame;
import com.revolut.core.ui_kit.delegates.AmountInputActionsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.e0;
import com.revolut.core.ui_kit.internal.views.OnMeasureCallbackConstraintLayout;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit.views.shadow.BottomShadowScrollingViewBehavior;
import com.revolut.core.ui_kit.views.shadow.BottomShadowView;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.atm.impl.ui.redesign.details.AtmDetailsBottomSheetController;
import com.revolut.feature.bank_account_switching.impl.domain.CardDigits;
import com.revolut.feature.bank_account_switching.impl.ui.card_digits.BankAccountSwitchingCardDigitsScreen;
import com.revolut.feature.bank_account_switching.impl.ui.form.BankAccountSwitchingFormScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.PayBillsAndTaxesScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.screen.search.BillsSearchScreen;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferOutInstrument;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.asset_selection.TransferOutAssetSelectionScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.asset_selection.TransferOutAssetSelectionScreenContract$AssetDraft;
import com.revolut.retail.feature.payments.bank_transfer.impl.structured_reference_transfer_note.StructuredReferenceTransferNoteScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreen;
import dce.s0;
import efm.r;
import efm.u;
import efm.w;
import fgm.q;
import io.reactivex.rxjava3.core.SingleEmitter;
import ip0.cm;
import ip0.dm;
import ip0.em;
import ip0.w0;
import is2.t;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import kotlin.text.z;
import kotlinx.coroutines.flow.Flow;
import ms0.i2;
import sgm.c1;
import skm.b1;
import skm.p0;
import tfm.z0;
import vkm.j2;
import zp0.x;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements x, Continuation, yil.a, CallbackToFutureAdapter.Resolver, NestedScrollView.OnScrollChangeListener, OnCompleteListener, OnFailureListener, q, efm.e, fgm.j, OnApplyWindowInsetsListener, i2, dv0.f, efm.x, u, SurfaceRequest.TransformationInfoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2950c;

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f2948a = i;
        this.f2949b = obj2;
        this.f2950c = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // efm.u
    public void a(z0 emitter) {
        ja3.j jVar = (ja3.j) this.f2949b;
        UrlImage urlImage = (UrlImage) this.f2950c;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        jVar.f172431c.c(urlImage, jVar.e, ((Number) jVar.f.getValue()).intValue(), ((Number) jVar.f172432g.getValue()).intValue(), new j87.m(emitter, 6), new iv0.p(emitter, 21));
    }

    @Override // efm.x
    public w apply(r upstream) {
        Flow flow = (Flow) this.f2949b;
        is2.x xVar = (is2.x) this.f2950c;
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        return upstream.switchMap(new ir9.a(new t(flow, 0), 14)).map(new ir9.a(new t(xVar, 1), 15));
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.f2948a) {
            case 4:
                return ((CameraX) this.f2949b).lambda$initInternal$1((Context) this.f2950c, completer);
            case 5:
                return ((SurfaceRequest) this.f2949b).lambda$initialSurfaceRecreationCompleter$7((AtomicReference) this.f2950c, completer);
            default:
                return ((InternalImageProcessor) this.f2949b).lambda$safeProcess$1((ImageProcessor.Request) this.f2950c, completer);
        }
    }

    @Override // ms0.i2
    public boolean b(OnMeasureCallbackConstraintLayout it8) {
        int i;
        cm cmVar = (cm) this.f2949b;
        dm dmVar = (dm) this.f2950c;
        Intrinsics.checkNotNullParameter(it8, "it");
        int i2 = em.f164124c[cmVar.ordinal()];
        if (i2 == 1) {
            i = 3;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 5;
        }
        TextView textView = dmVar.f163923h;
        TextView textView2 = dmVar.i;
        int lineCount = i - textView.getLineCount();
        if (lineCount == textView2.getMaxLines()) {
            return false;
        }
        textView2.setMaxLines(lineCount);
        return true;
    }

    @Override // fgm.q
    public void c(tgm.a aVar) {
        switch (this.f2948a) {
            case 14:
                FaceDetectorGoogle.detect$lambda$0((FaceDetectionFrame) this.f2949b, (FaceDetectorGoogle) this.f2950c, aVar);
                break;
            default:
                TaskExtensionKt.toSingle$lambda$2((Task) this.f2949b, (Executor) this.f2950c, aVar);
                break;
        }
    }

    @Override // efm.e
    public void d(pfm.g emitter) {
        cq.g gVar = (cq.g) this.f2949b;
        zp.a aVar = (zp.a) this.f2950c;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        try {
            Intrinsics.h(((oc.e) gVar.f107980b).a().addOnCompleteListener(new ag.p(emitter, 4, gVar, aVar)));
        } catch (Exception e) {
            if (e instanceof IntentSender.SendIntentException) {
                emitter.onComplete();
            } else {
                emitter.onError(e);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zp0.x
    public void e(String listId, String extractedValue, String formattedValue, boolean z) {
        TransferOutInstrument transferOutInstrumentI2;
        TransferOutAssetSelectionScreenContract$AssetDraft transferOutAssetSelectionScreenContract$AssetDraft;
        String string;
        int i = this.f2948a;
        char c2 = 1;
        Object obj2 = this.f2950c;
        Object obj3 = this.f2949b;
        switch (i) {
            case 0:
                MaskedTextInputEditText maskedTextInputEditText = (MaskedTextInputEditText) obj3;
                TransferOutAssetSelectionScreen transferOutAssetSelectionScreen = (TransferOutAssetSelectionScreen) obj2;
                TransferOutAssetSelectionScreen.Companion aVar = TransferOutAssetSelectionScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "<unused var>");
                if (maskedTextInputEditText.isFocused()) {
                    l lVarE3 = transferOutAssetSelectionScreen.R2();
                    InputTextDelegate.TextData data = new InputTextDelegate.TextData(listId, extractedValue);
                    o oVar = (o) lVarE3;
                    oVar.getClass();
                    Intrinsics.checkNotNullParameter(data, "data");
                    String strE0 = d0.e0(listId, "TRANSFER_OUT_ASSET_SELECTION_QUANTITY_");
                    if (Intrinsics.f(strE0, listId)) {
                        strE0 = null;
                    }
                    if (strE0 == null || (transferOutInstrumentI2 = oVar.I2(strE0)) == null) {
                        string = extractedValue.toString();
                    } else {
                        Intrinsics.checkNotNullParameter(transferOutInstrumentI2, "<this>");
                        int iIntValue = transferOutInstrumentI2.e.intValue();
                        String string2 = d0.F0(extractedValue.toString()).toString();
                        Integer numM = z.m(string2);
                        if (string2.length() == 0) {
                            transferOutAssetSelectionScreenContract$AssetDraft = new TransferOutAssetSelectionScreenContract$AssetDraft(null, false);
                        } else if (numM == null) {
                            string = string2;
                        } else {
                            int iIntValue2 = numM.intValue();
                            if (iIntValue2 <= iIntValue) {
                                iIntValue = iIntValue2;
                            }
                            transferOutAssetSelectionScreenContract$AssetDraft = new TransferOutAssetSelectionScreenContract$AssetDraft(Integer.valueOf(iIntValue), iIntValue > 0);
                        }
                        oVar.H2(oVar.f2962r, new a08.o(strE0, transferOutAssetSelectionScreenContract$AssetDraft, 27));
                        Integer num = transferOutAssetSelectionScreenContract$AssetDraft.f91637a;
                        String strValueOf = num != null ? String.valueOf(num.intValue()) : null;
                        string = strValueOf == null ? "" : strValueOf;
                    }
                    if (!Intrinsics.f(string, extractedValue)) {
                        maskedTextInputEditText.setText(string);
                        maskedTextInputEditText.setSelection(string.length());
                    }
                }
                break;
            case 6:
                KProperty[] kPropertyArr = PayBillsAndTaxesScreen.T;
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                bg9.b bVarE3 = ((PayBillsAndTaxesScreen) obj3).R2();
                String listId2 = ((InputTextDelegate.Model) obj2).f52580a;
                bg9.r rVar = (bg9.r) bVarE3;
                rVar.getClass();
                Intrinsics.checkNotNullParameter(listId2, "listId");
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                xf9.a aVarI2 = rVar.I2();
                if (aVarI2 != null) {
                    aVarI2.g3(listId2, extractedValue, formattedValue);
                }
                break;
            case 7:
                BillsSearchScreen.Companion aVar2 = BillsSearchScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                bh9.f fVarE3 = ((BillsSearchScreen) obj3).d();
                String listId3 = ((InputTextDelegate.Model) obj2).f52580a;
                bh9.t tVar = (bh9.t) fVarE3;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(listId3, "listId");
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                i2b.a.P(listId3, extractedValue, formattedValue, new a97.i(2, tVar, bh9.t.class, "updateFieldValue", "updateFieldValue(Ljava/lang/String;Ljava/lang/String;)V", 0, 3));
                break;
            case 8:
                KProperty[] kPropertyArr2 = BankAccountSwitchingCardDigitsScreen.R;
                Intrinsics.checkNotNullParameter(listId, "<unused var>");
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                bo2.f fVar = (bo2.f) ((BankAccountSwitchingCardDigitsScreen) obj3).Q.getValue();
                String listId4 = ((InputTextDelegate.Model) obj2).f52580a;
                bo2.k kVar = (bo2.k) fVar;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(listId4, "listId");
                Intrinsics.checkNotNullParameter(extractedValue, "newValue");
                y yVar = kVar.o;
                CardDigits cardDigitsA = ((bo2.d) ((j2) yVar.f22677a).getValue()).f17272a;
                if (Intrinsics.f(listId4, "ID_MAIN_HOLDER_CARD_DIGITS")) {
                    cardDigitsA = CardDigits.a(cardDigitsA, extractedValue, null, 2);
                } else if (Intrinsics.f(listId4, "ID_JOINT_PEER_HOLDER_CARD_DIGITS")) {
                    cardDigitsA = CardDigits.a(cardDigitsA, null, extractedValue, 1);
                }
                kVar.H2(yVar, new bnj.n(cardDigitsA, kVar, c2 == true ? 1 : 0));
                break;
            case 10:
                KProperty[] kPropertyArr3 = StructuredReferenceTransferNoteScreen.S;
                Intrinsics.checkNotNullParameter(listId, "<unused var>");
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                ((c4k.k) ((StructuredReferenceTransferNoteScreen) obj3).R2()).I2(((InputTextDelegate.Model) obj2).f52580a, extractedValue, formattedValue);
                break;
            case 19:
                KProperty[] kPropertyArr4 = BankAccountSwitchingFormScreen.U;
                Intrinsics.checkNotNullParameter(listId, "<unused var>");
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                ((do2.q) ((BankAccountSwitchingFormScreen) obj3).R2()).K2(((InputTextDelegate.Model) obj2).f52580a, extractedValue, formattedValue);
                break;
            case 21:
                KProperty[] kPropertyArr5 = BankTransferAmountScreen.f102060r0;
                Intrinsics.checkNotNullParameter(listId, "<unused var>");
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                ((com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) ((BankTransferAmountScreen) obj3).T2()).E2(((InputTextDelegate.Model) obj2).f52580a, extractedValue, formattedValue);
                break;
            default:
                w0 w0Var = (w0) obj2;
                Intrinsics.checkNotNullParameter(listId, "<unused var>");
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "<unused var>");
                ihm.f fVar2 = ((AmountInputActionsDelegate) obj3).f;
                koi.j jVar = w0Var.e;
                Intrinsics.i(jVar, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.AmountInputActionsDelegate.Model");
                fVar2.onNext(new e0((AmountInputActionsDelegate.Model) jVar, extractedValue, w0Var.f.getInnerEditText().hasFocus()));
                break;
        }
    }

    @Override // fgm.j
    public void f(c1 c1Var) {
        CoroutineContext coroutineContext = (CoroutineContext) this.f2949b;
        Flow flow = (Flow) this.f2950c;
        c1Var.a(new dlm.b(skm.e0.B(b1.f263958a, p0.f264003c.plus(coroutineContext), skm.d0.ATOMIC, new s0(flow, c1Var, null, 7))));
    }

    @Override // yil.a
    public String generate() {
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f2949b;
        com.revolut.retail.feature.impl.userauth.screen.revolut_sso.wrapper.a aVar = (com.revolut.retail.feature.impl.userauth.screen.revolut_sso.wrapper.a) this.f2950c;
        String strB = aVar.f101725p.b();
        ref$ObjectRef.f186409a = strB;
        xjl.i iVar = aVar.f101725p;
        if (strB != null) {
            return iVar.a(strB);
        }
        Intrinsics.r("codeVerifier");
        throw null;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        int i;
        int i2 = this.f2948a;
        Object obj2 = this.f2950c;
        Object obj3 = this.f2949b;
        switch (i2) {
            case 20:
                du2.j jVar = (du2.j) obj2;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(insets, "insets");
                int i3 = du2.i.f117541b[((du2.f) obj3).ordinal()];
                if (i3 == 1) {
                    i = insets.getInsets(WindowInsetsCompat.Type.systemBars()).top;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = jVar.f117546h;
                }
                view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
                return insets;
            default:
                KProperty[] kPropertyArr = AtmDetailsBottomSheetController.Y;
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                Intrinsics.checkNotNullParameter(insets, "insets");
                ((AtmDetailsBottomSheetController) obj3).V = tk2.q.a((View) obj2);
                return insets;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.i) this.f2949b).a((Intent) this.f2950c);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc2) {
        switch (this.f2948a) {
            case 12:
                BarcodeDetectorGoogle.processImage$lambda$2((BarcodeDetectorGoogle) this.f2949b, (SingleEmitter) this.f2950c, exc2);
                break;
            case 13:
                FaceDetectorGoogle.addSuccessAndFailureListeners$lambda$2((FaceDetectorGoogle) this.f2949b, (SingleEmitter) this.f2950c, exc2);
                break;
            default:
                FaceOnDocumentDetectorGoogle.detectWithDegree$lambda$3$lambda$2((FaceOnDocumentDetectorGoogle) this.f2949b, (SingleEmitter) this.f2950c, exc2);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
    public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i5) {
        BottomShadowScrollingViewBehavior bottomShadowScrollingViewBehavior = (BottomShadowScrollingViewBehavior) this.f2949b;
        BottomShadowView bottomShadowView = (BottomShadowView) this.f2950c;
        Intrinsics.checkNotNullParameter(nestedScrollView, "<unused var>");
        bottomShadowView.setAlpha(Math.min(1.0f, i2 / ((Number) bottomShadowScrollingViewBehavior.f59647a.getValue()).intValue()));
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
        ((DefaultSurfaceProcessor) this.f2949b).lambda$onInputSurface$0((SurfaceRequest) this.f2950c, transformationInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d1 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #8 {all -> 0x0056, blocks: (B:11:0x003f, B:13:0x0042, B:14:0x0043, B:22:0x005f, B:62:0x00cd, B:64:0x00d1, B:66:0x00d4, B:70:0x00d8, B:65:0x00d2), top: B:132:0x001b, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d9  */
    /* JADX WARN: Type inference failed for: r0v4, types: [ag.s] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r15v38, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r15v4, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // com.google.android.gms.tasks.Continuation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object then(com.google.android.gms.tasks.Task r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: abf.c.then(com.google.android.gms.tasks.Task):java.lang.Object");
    }
}
