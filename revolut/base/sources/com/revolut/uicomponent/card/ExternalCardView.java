package com.revolut.uicomponent.card;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import bzl.e;
import bzl.k;
import com.revolut.uicomponent.R$drawable;
import com.revolut.uicomponent.R$id;
import com.revolut.uicomponent.R$layout;
import com.revolut.uicomponent.R$styleable;
import com.revolut.uicomponent.card.ExternalCardView;
import com.revolut.uicomponent.text.masked.MaskedAppCompatEditText;
import com.revolut.uicomponent.widgets.support_edit_text.MultipleDrawableMaterialEditText;
import com.revolut.uicomponent.widgets.support_edit_text.RevolutTextInputLayout;
import java.util.ArrayList;
import java.util.Locale;
import jul.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qyl.a;
import qyl.c;
import qyl.f;
import qyl.g;
import qyl.h;
import qyl.i;
import qyl.l;
import te0.w;
import yhm.d;
import zp0.n;
import zp0.p;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0004°\u0001µ\u0001\b\u0007\u0018\u00002\u00020\u0001:\u0003º\u00019B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u000fJ\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u001f\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010$\u001a\n \u001a*\u0004\u0018\u00010 0 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R#\u0010'\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001eR#\u0010*\u001a\n \u001a*\u0004\u0018\u00010 0 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010#R#\u0010/\u001a\n \u001a*\u0004\u0018\u00010+0+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010.R#\u00102\u001a\n \u001a*\u0004\u0018\u00010 0 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u001c\u001a\u0004\b1\u0010#R#\u00105\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u001c\u001a\u0004\b4\u0010\u001eR#\u00108\u001a\n \u001a*\u0004\u0018\u00010 0 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u001c\u001a\u0004\b7\u0010#R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010G\u001a\u00020\u00112\u0006\u0010A\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010\u0014R*\u0010K\u001a\u00020\u00112\u0006\u0010A\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010C\u001a\u0004\bI\u0010E\"\u0004\bJ\u0010\u0014R*\u0010S\u001a\u00020L2\u0006\u0010A\u001a\u00020L8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR*\u0010W\u001a\u00020\u00112\u0006\u0010A\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010C\u001a\u0004\bU\u0010E\"\u0004\bV\u0010\u0014R*\u0010[\u001a\u00020L2\u0006\u0010A\u001a\u00020L8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010N\u001a\u0004\bY\u0010P\"\u0004\bZ\u0010RR*\u0010_\u001a\u00020L2\u0006\u0010A\u001a\u00020L8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010N\u001a\u0004\b]\u0010P\"\u0004\b^\u0010RR*\u0010c\u001a\u00020L2\u0006\u0010A\u001a\u00020L8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010N\u001a\u0004\ba\u0010P\"\u0004\bb\u0010RR*\u0010k\u001a\u00020d2\u0006\u0010A\u001a\u00020d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR*\u0010o\u001a\u00020L2\u0006\u0010A\u001a\u00020L8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010N\u001a\u0004\bm\u0010P\"\u0004\bn\u0010RR*\u0010s\u001a\u00020\u00112\u0006\u0010A\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010C\u001a\u0004\bq\u0010E\"\u0004\br\u0010\u0014R*\u0010w\u001a\u00020\u00112\u0006\u0010A\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010C\u001a\u0004\bu\u0010E\"\u0004\bv\u0010\u0014R*\u0010{\u001a\u00020\u00112\u0006\u0010A\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010C\u001a\u0004\by\u0010E\"\u0004\bz\u0010\u0014R*\u0010\u007f\u001a\u00020\u00112\u0006\u0010A\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010C\u001a\u0004\b}\u0010E\"\u0004\b~\u0010\u0014R.\u0010\u0083\u0001\u001a\u00020L2\u0006\u0010A\u001a\u00020L8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010N\u001a\u0005\b\u0081\u0001\u0010P\"\u0005\b\u0082\u0001\u0010RR5\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010A\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R.\u0010\u008e\u0001\u001a\u00020L2\u0006\u0010A\u001a\u00020L8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010N\u001a\u0005\b\u008c\u0001\u0010P\"\u0005\b\u008d\u0001\u0010RR.\u0010\u0092\u0001\u001a\u00020L2\u0006\u0010A\u001a\u00020L8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010N\u001a\u0005\b\u0090\u0001\u0010P\"\u0005\b\u0091\u0001\u0010RR.\u0010\u0096\u0001\u001a\u00020L2\u0006\u0010A\u001a\u00020L8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010N\u001a\u0005\b\u0094\u0001\u0010P\"\u0005\b\u0095\u0001\u0010RR.\u0010\u009a\u0001\u001a\u00020\u00112\u0006\u0010A\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0097\u0001\u0010C\u001a\u0005\b\u0098\u0001\u0010E\"\u0005\b\u0099\u0001\u0010\u0014R.\u0010\u009e\u0001\u001a\u00020L2\u0006\u0010A\u001a\u00020L8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u009b\u0001\u0010N\u001a\u0005\b\u009c\u0001\u0010P\"\u0005\b\u009d\u0001\u0010RR.\u0010¢\u0001\u001a\u00020L2\u0006\u0010A\u001a\u00020L8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u009f\u0001\u0010N\u001a\u0005\b \u0001\u0010P\"\u0005\b¡\u0001\u0010RR.\u0010¦\u0001\u001a\u00020L2\u0006\u0010A\u001a\u00020L8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b£\u0001\u0010N\u001a\u0005\b¤\u0001\u0010P\"\u0005\b¥\u0001\u0010RR.\u0010ª\u0001\u001a\u00020\u00112\u0006\u0010A\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b§\u0001\u0010C\u001a\u0005\b¨\u0001\u0010E\"\u0005\b©\u0001\u0010\u0014R \u0010¯\u0001\u001a\u00030«\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¬\u0001\u0010\u001c\u001a\u0006\b\u00ad\u0001\u0010®\u0001R \u0010´\u0001\u001a\u00030°\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b±\u0001\u0010\u001c\u001a\u0006\b²\u0001\u0010³\u0001R \u0010¹\u0001\u001a\u00030µ\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¶\u0001\u0010\u001c\u001a\u0006\b·\u0001\u0010¸\u0001R,\u0010»\u0001\u001a\u0005\u0018\u00010º\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001¨\u0006Á\u0001"}, d2 = {"Lcom/revolut/uicomponent/card/ExternalCardView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "brandIcon", "", "setBrandIcon", "(I)V", "setCurrentFocusCard", "()V", "setCurrentExpiryDate", "", "requireToOpenKeyboard", "setCurrentFocusCvv", "(Z)V", "setCurrentFocusPostcode", "Landroid/widget/TextView;", "getCardNumberView", "()Landroid/widget/TextView;", "Lcom/revolut/uicomponent/widgets/support_edit_text/MultipleDrawableMaterialEditText;", "kotlin.jvm.PlatformType", "c", "Lkotlin/Lazy;", "getCardNumberText", "()Lcom/revolut/uicomponent/widgets/support_edit_text/MultipleDrawableMaterialEditText;", "cardNumberText", "Lcom/revolut/uicomponent/widgets/support_edit_text/RevolutTextInputLayout;", "d", "getCardNumberTextWrapper", "()Lcom/revolut/uicomponent/widgets/support_edit_text/RevolutTextInputLayout;", "cardNumberTextWrapper", "e", "getCardZip", "cardZip", "f", "getCardZipWrapper", "cardZipWrapper", "Lcom/revolut/uicomponent/text/masked/MaskedAppCompatEditText;", "g", "getCardExpirationDate", "()Lcom/revolut/uicomponent/text/masked/MaskedAppCompatEditText;", "cardExpirationDate", "h", "getCardExpirationDateWrapper", "cardExpirationDateWrapper", "i", "getCardCvc", "cardCvc", "j", "getCardCvcWrapper", "cardCvcWrapper", "Lqyl/i;", "k", "Lqyl/i;", "getListener", "()Lqyl/i;", "setListener", "(Lqyl/i;)V", "listener", "value", "l", "Z", "getShowCameraIcon", "()Z", "setShowCameraIcon", "showCameraIcon", "m", "getShowNfcIcon", "setShowNfcIcon", "showNfcIcon", "", "n", "Ljava/lang/String;", "getCardNumber", "()Ljava/lang/String;", "setCardNumber", "(Ljava/lang/String;)V", "cardNumber", "o", "getCardNumberEditable", "setCardNumberEditable", "cardNumberEditable", "p", "getCardNumberHint", "setCardNumberHint", "cardNumberHint", "q", "getCardNumberFloatingHint", "setCardNumberFloatingHint", "cardNumberFloatingHint", "r", "getCardNumberError", "setCardNumberError", "cardNumberError", "Lgzl/e;", "s", "Lgzl/e;", "getCardNumberSoftError", "()Lgzl/e;", "setCardNumberSoftError", "(Lgzl/e;)V", "cardNumberSoftError", "t", "getPostcode", "setPostcode", "postcode", "u", "getPostcodeError", "setPostcodeError", "postcodeError", "v", "getPostcodeVisible", "setPostcodeVisible", "postcodeVisible", "w", "getExpiryDateVisible", "setExpiryDateVisible", "expiryDateVisible", "x", "getCvvVisible", "setCvvVisible", "cvvVisible", "y", "getPostcodeHint", "setPostcodeHint", "postcodeHint", "z", "Ljava/lang/Integer;", "getCardNumberLength", "()Ljava/lang/Integer;", "setCardNumberLength", "(Ljava/lang/Integer;)V", "cardNumberLength", "A", "getExpireDate", "setExpireDate", "expireDate", "B", "getExpireDateFloatingHint", "setExpireDateFloatingHint", "expireDateFloatingHint", "C", "getExpireDateHint", "setExpireDateHint", "expireDateHint", "D", "getExpireDateError", "setExpireDateError", "expireDateError", "E", "getCvv", "setCvv", "cvv", "F", "getCvvHint", "setCvvHint", "cvvHint", "G", "getCvvFloatingHint", "setCvvFloatingHint", "cvvFloatingHint", "H", "getCvvError", "setCvvError", "cvvError", "Lbzl/k;", "I", "getCardNumberWatcher", "()Lbzl/k;", "cardNumberWatcher", "qyl/k", "K", "getCvvWatcher", "()Lqyl/k;", "cvvWatcher", "qyl/l", "L", "getPostcodeWatcher", "()Lqyl/l;", "postcodeWatcher", "Lqyl/h;", "brandIconCallback", "Lqyl/h;", "getBrandIconCallback", "()Lqyl/h;", "setBrandIconCallback", "(Lqyl/h;)V", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class ExternalCardView extends LinearLayout {
    public static final /* synthetic */ int V = 0;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public String expireDate;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public String expireDateFloatingHint;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String expireDateHint;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public boolean expireDateError;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String cvv;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String cvvHint;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String cvvFloatingHint;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public boolean cvvError;
    public final Object I;
    public final e J;
    public final Object K;
    public final Object L;
    public final jpc.e M;
    public final jpc.e N;
    public final o O;
    public final c P;
    public final c Q;
    public final f R;
    public final f S;
    public final f T;
    public final f U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f107142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qyl.d f107143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f107144c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f107145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f107146h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f107147j;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public i listener;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean showCameraIcon;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean showNfcIcon;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public String cardNumber;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean cardNumberEditable;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public String cardNumberHint;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public String cardNumberFloatingHint;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public String cardNumberError;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public gzl.e cardNumberSoftError;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public String postcode;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public boolean postcodeError;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean postcodeVisible;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public boolean expiryDateVisible;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public boolean cvvVisible;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public String postcodeHint;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public Integer cardNumberLength;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExternalCardView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    public static void a(ExternalCardView externalCardView, boolean z) {
        i iVar = externalCardView.listener;
        if (iVar != null) {
            ((ihm.f) ((com.revolut.uicomponent.products.d) iVar).f107223a.k.getValue()).onNext(Boolean.valueOf(z));
        }
        MultipleDrawableMaterialEditText cardCvc = externalCardView.getCardCvc();
        Intrinsics.checkNotNullExpressionValue(cardCvc, "<get-cardCvc>(...)");
        cj9.c.I(cardCvc, z ? R$drawable.ic_card_cvv_hint_32dp : 0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    public static void b(ExternalCardView externalCardView, boolean z) {
        i iVar = externalCardView.listener;
        if (iVar != null) {
            ((ihm.f) ((com.revolut.uicomponent.products.d) iVar).f107223a.f107178j.getValue()).onNext(Boolean.valueOf(z));
        }
        MaskedAppCompatEditText cardExpirationDate = externalCardView.getCardExpirationDate();
        Intrinsics.checkNotNullExpressionValue(cardExpirationDate, "<get-cardExpirationDate>(...)");
        cj9.c.I(cardExpirationDate, z ? R$drawable.ic_card_expiry_date_32dp : 0);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    public static void c(ExternalCardView externalCardView, boolean z) {
        externalCardView.e(z, String.valueOf(externalCardView.getCardNumberText().getText()));
        i iVar = externalCardView.listener;
        if (iVar != null) {
            ((ihm.f) ((com.revolut.uicomponent.products.d) iVar).f107223a.i.getValue()).onNext(Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final MultipleDrawableMaterialEditText getCardCvc() {
        return (MultipleDrawableMaterialEditText) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final RevolutTextInputLayout getCardCvcWrapper() {
        return (RevolutTextInputLayout) this.f107147j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final MaskedAppCompatEditText getCardExpirationDate() {
        return (MaskedAppCompatEditText) this.f107145g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final RevolutTextInputLayout getCardExpirationDateWrapper() {
        return (RevolutTextInputLayout) this.f107146h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final MultipleDrawableMaterialEditText getCardNumberText() {
        return (MultipleDrawableMaterialEditText) this.f107144c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final RevolutTextInputLayout getCardNumberTextWrapper() {
        return (RevolutTextInputLayout) this.d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final k getCardNumberWatcher() {
        return (k) this.I.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final MultipleDrawableMaterialEditText getCardZip() {
        return (MultipleDrawableMaterialEditText) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final RevolutTextInputLayout getCardZipWrapper() {
        return (RevolutTextInputLayout) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final qyl.k getCvvWatcher() {
        return (qyl.k) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final l getPostcodeWatcher() {
        return (l) this.L.getValue();
    }

    public final void e(boolean z, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0 || !z) {
            ArrayList arrayList = new ArrayList();
            if (this.showCameraIcon) {
                arrayList.add(Integer.valueOf(R$drawable.uic_ic_camera_m));
            }
            if (this.showNfcIcon) {
                arrayList.add(Integer.valueOf(R$drawable.uic_ic_nfc_m));
            }
            getCardNumberText().setCompoundRightDrawablesWithIntrinsicBounds(arrayList);
        }
    }

    public final h getBrandIconCallback() {
        return null;
    }

    @NotNull
    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final boolean getCardNumberEditable() {
        return this.cardNumberEditable;
    }

    @NotNull
    public final String getCardNumberError() {
        return this.cardNumberError;
    }

    @NotNull
    public final String getCardNumberFloatingHint() {
        return this.cardNumberFloatingHint;
    }

    @NotNull
    public final String getCardNumberHint() {
        return this.cardNumberHint;
    }

    public final Integer getCardNumberLength() {
        return this.cardNumberLength;
    }

    @NotNull
    public final gzl.e getCardNumberSoftError() {
        return this.cardNumberSoftError;
    }

    @NotNull
    public final TextView getCardNumberView() {
        MultipleDrawableMaterialEditText cardNumberText = getCardNumberText();
        Intrinsics.checkNotNullExpressionValue(cardNumberText, "<get-cardNumberText>(...)");
        return cardNumberText;
    }

    @NotNull
    public final String getCvv() {
        return this.cvv;
    }

    public final boolean getCvvError() {
        return this.cvvError;
    }

    @NotNull
    public final String getCvvFloatingHint() {
        return this.cvvFloatingHint;
    }

    @NotNull
    public final String getCvvHint() {
        return this.cvvHint;
    }

    public final boolean getCvvVisible() {
        return this.cvvVisible;
    }

    @NotNull
    public final String getExpireDate() {
        return this.expireDate;
    }

    public final boolean getExpireDateError() {
        return this.expireDateError;
    }

    @NotNull
    public final String getExpireDateFloatingHint() {
        return this.expireDateFloatingHint;
    }

    @NotNull
    public final String getExpireDateHint() {
        return this.expireDateHint;
    }

    public final boolean getExpiryDateVisible() {
        return this.expiryDateVisible;
    }

    public final i getListener() {
        return this.listener;
    }

    @NotNull
    public final String getPostcode() {
        return this.postcode;
    }

    public final boolean getPostcodeError() {
        return this.postcodeError;
    }

    @NotNull
    public final String getPostcodeHint() {
        return this.postcodeHint;
    }

    public final boolean getPostcodeVisible() {
        return this.postcodeVisible;
    }

    public final boolean getShowCameraIcon() {
        return this.showCameraIcon;
    }

    public final boolean getShowNfcIcon() {
        return this.showNfcIcon;
    }

    public final void setBrandIcon(int brandIcon) {
        Drawable[] compoundDrawables = getCardNumberText().getCompoundDrawables();
        Intrinsics.checkNotNullExpressionValue(compoundDrawables, "getCompoundDrawables(...)");
        getCardNumberText().setCompoundDrawablesWithIntrinsicBounds(brandIcon != 0 ? ResourcesCompat.getDrawable(getResources(), brandIcon, getContext().getTheme()) : compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    public final void setBrandIconCallback(h hVar) {
    }

    public final void setCardNumber(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.cardNumber = value;
        MultipleDrawableMaterialEditText cardNumberText = getCardNumberText();
        Intrinsics.checkNotNullExpressionValue(cardNumberText, "<get-cardNumberText>(...)");
        cj9.c.J(cardNumberText, value);
    }

    public final void setCardNumberEditable(boolean z) {
        this.cardNumberEditable = z;
        getCardNumberText().setFocusable(z);
    }

    public final void setCardNumberError(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.cardNumberError = value;
        getCardNumberTextWrapper().setError(value);
    }

    public final void setCardNumberFloatingHint(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.cardNumberFloatingHint = value;
        jpc.e eVar = this.M;
        eVar.d = value;
        eVar.j0(((EditText) eVar.f177256b).getText().toString());
    }

    public final void setCardNumberHint(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.cardNumberHint = value;
        ((EditText) this.M.f177256b).setHint(value);
    }

    public final void setCardNumberLength(Integer num) {
        this.cardNumberLength = num;
        if (num != null) {
            getCardNumberText().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(num.intValue())});
        }
    }

    public final void setCardNumberSoftError(@NotNull gzl.e value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.cardNumberSoftError = value;
        getCardNumberTextWrapper().setSoftError(value);
    }

    public final void setCurrentExpiryDate() {
        getCardExpirationDate().e(this.S);
    }

    public final void setCurrentFocusCard() {
        getCardNumberText().e(this.R);
        MultipleDrawableMaterialEditText cardNumberText = getCardNumberText();
        Editable text = getCardNumberText().getText();
        cardNumberText.setSelection(text != null ? text.length() : 0);
        e0m.e.e(getCardNumberText());
    }

    public final void setCurrentFocusCvv(boolean requireToOpenKeyboard) {
        getCardCvc().e(this.T);
        MultipleDrawableMaterialEditText cardCvc = getCardCvc();
        Editable text = getCardCvc().getText();
        cardCvc.setSelection(text != null ? text.length() : 0);
        if (requireToOpenKeyboard) {
            e0m.e.e(getCardCvc());
        }
    }

    public final void setCurrentFocusPostcode() {
        getCardZip().e(this.U);
        MultipleDrawableMaterialEditText cardZip = getCardZip();
        Editable text = getCardZip().getText();
        cardZip.setSelection(text != null ? text.length() : 0);
    }

    public final void setCvv(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.cvv = value;
        MultipleDrawableMaterialEditText cardCvc = getCardCvc();
        Intrinsics.checkNotNullExpressionValue(cardCvc, "<get-cardCvc>(...)");
        cj9.c.J(cardCvc, value);
    }

    public final void setCvvError(boolean z) {
        this.cvvError = z;
        getCardCvcWrapper().setError(this.cvvError ? " " : null);
    }

    public final void setCvvFloatingHint(@NotNull String floatingHint) {
        Intrinsics.checkNotNullParameter(floatingHint, "value");
        this.cvvFloatingHint = floatingHint;
        c cVar = this.P;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(floatingHint, "floatingHint");
        cVar.f250302c = floatingHint;
        cVar.a(cVar.f250300a.hasFocus());
    }

    public final void setCvvHint(@NotNull String editTextHint) {
        Intrinsics.checkNotNullParameter(editTextHint, "value");
        this.cvvHint = editTextHint;
        c cVar = this.P;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(editTextHint, "editTextHint");
        cVar.d = editTextHint;
        cVar.a(cVar.f250300a.hasFocus());
    }

    public final void setCvvVisible(boolean z) {
        this.cvvVisible = z;
        MultipleDrawableMaterialEditText cardCvc = getCardCvc();
        Intrinsics.checkNotNullExpressionValue(cardCvc, "<get-cardCvc>(...)");
        w01.k.e(cardCvc, z);
        RevolutTextInputLayout cardCvcWrapper = getCardCvcWrapper();
        Intrinsics.checkNotNullExpressionValue(cardCvcWrapper, "<get-cardCvcWrapper>(...)");
        w01.k.e(cardCvcWrapper, z);
    }

    public final void setExpireDate(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.expireDate = value;
        MaskedAppCompatEditText cardExpirationDate = getCardExpirationDate();
        Intrinsics.checkNotNullExpressionValue(cardExpirationDate, "<get-cardExpirationDate>(...)");
        cj9.c.J(cardExpirationDate, value);
    }

    public final void setExpireDateError(boolean z) {
        this.expireDateError = z;
        getCardExpirationDateWrapper().setError(z ? " " : null);
    }

    public final void setExpireDateFloatingHint(@NotNull String floatingHint) {
        Intrinsics.checkNotNullParameter(floatingHint, "value");
        this.expireDateFloatingHint = floatingHint;
        c cVar = this.Q;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(floatingHint, "floatingHint");
        cVar.f250302c = floatingHint;
        cVar.a(cVar.f250300a.hasFocus());
    }

    public final void setExpireDateHint(@NotNull String editTextHint) {
        Intrinsics.checkNotNullParameter(editTextHint, "value");
        this.expireDateHint = editTextHint;
        c cVar = this.Q;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(editTextHint, "editTextHint");
        cVar.d = editTextHint;
        cVar.a(cVar.f250300a.hasFocus());
    }

    public final void setExpiryDateVisible(boolean z) {
        this.expiryDateVisible = z;
        MaskedAppCompatEditText cardExpirationDate = getCardExpirationDate();
        Intrinsics.checkNotNullExpressionValue(cardExpirationDate, "<get-cardExpirationDate>(...)");
        w01.k.e(cardExpirationDate, z);
        RevolutTextInputLayout cardExpirationDateWrapper = getCardExpirationDateWrapper();
        Intrinsics.checkNotNullExpressionValue(cardExpirationDateWrapper, "<get-cardExpirationDateWrapper>(...)");
        w01.k.e(cardExpirationDateWrapper, z);
    }

    public final void setListener(i iVar) {
        this.listener = iVar;
    }

    public final void setPostcode(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.postcode = value;
        MultipleDrawableMaterialEditText cardZip = getCardZip();
        Intrinsics.checkNotNullExpressionValue(cardZip, "<get-cardZip>(...)");
        l textWatcher = getPostcodeWatcher();
        Intrinsics.checkNotNullParameter(cardZip, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(textWatcher, "textWatcher");
        if (!Intrinsics.f(cardZip.getText().toString(), value)) {
            cardZip.removeTextChangedListener(textWatcher);
            cardZip.setText(value);
            cardZip.addTextChangedListener(textWatcher);
        }
        MultipleDrawableMaterialEditText cardZip2 = getCardZip();
        Editable text = getCardZip().getText();
        cardZip2.setSelection(text != null ? text.length() : 0);
    }

    public final void setPostcodeError(boolean z) {
        this.postcodeError = z;
        getCardZipWrapper().setError(z ? " " : null);
    }

    public final void setPostcodeHint(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.postcodeHint = value;
        jpc.e eVar = this.N;
        ((EditText) eVar.f177256b).setHint(value);
        eVar.d = value;
        eVar.j0(((EditText) eVar.f177256b).getText().toString());
    }

    public final void setPostcodeVisible(boolean z) {
        this.postcodeVisible = z;
        MultipleDrawableMaterialEditText cardZip = getCardZip();
        Intrinsics.checkNotNullExpressionValue(cardZip, "<get-cardZip>(...)");
        w01.k.e(cardZip, z);
        RevolutTextInputLayout cardZipWrapper = getCardZipWrapper();
        Intrinsics.checkNotNullExpressionValue(cardZipWrapper, "<get-cardZipWrapper>(...)");
        w01.k.e(cardZipWrapper, z);
    }

    public final void setShowCameraIcon(boolean z) {
        this.showCameraIcon = z;
        e(getCardNumberText().hasFocus(), getCardNumberText().getText());
    }

    public final void setShowNfcIcon(boolean z) {
        this.showNfcIcon = z;
        e(getCardNumberText().hasFocus(), getCardNumberText().getText());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExternalCardView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [android.view.View$OnFocusChangeListener, qyl.f] */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.view.View$OnFocusChangeListener, qyl.f] */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View$OnFocusChangeListener, qyl.f] */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.view.View$OnFocusChangeListener, qyl.f] */
    public ExternalCardView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f107143b = new qyl.d();
        final int i2 = 0;
        this.f107144c = w.y0(new Function0(this) { // from class: qyl.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExternalCardView f250304b;

            {
                this.f250304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                ExternalCardView externalCardView = this.f250304b;
                switch (i3) {
                    case 0:
                        int i5 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_number_text);
                    case 1:
                        int i6 = ExternalCardView.V;
                        return (MaskedAppCompatEditText) externalCardView.findViewById(R$id.card_expiration_date);
                    case 2:
                        int i21 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_expiration_date_wrapper);
                    case 3:
                        int i22 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_cvc);
                    case 4:
                        int i32 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_cvc_wrapper);
                    case 5:
                        int i33 = ExternalCardView.V;
                        return new bzl.k(new g(externalCardView, 1));
                    case 6:
                        int i43 = ExternalCardView.V;
                        return new k(externalCardView);
                    case 7:
                        int i59 = ExternalCardView.V;
                        return new l(externalCardView);
                    case 8:
                        int i66 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_number_text_wrapper);
                    case 9:
                        int i74 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_zip);
                    default:
                        int i92 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_zip_wrapper);
                }
            }
        });
        final int i3 = 8;
        this.d = w.y0(new Function0(this) { // from class: qyl.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExternalCardView f250304b;

            {
                this.f250304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                ExternalCardView externalCardView = this.f250304b;
                switch (i32) {
                    case 0:
                        int i5 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_number_text);
                    case 1:
                        int i6 = ExternalCardView.V;
                        return (MaskedAppCompatEditText) externalCardView.findViewById(R$id.card_expiration_date);
                    case 2:
                        int i21 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_expiration_date_wrapper);
                    case 3:
                        int i22 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_cvc);
                    case 4:
                        int i322 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_cvc_wrapper);
                    case 5:
                        int i33 = ExternalCardView.V;
                        return new bzl.k(new g(externalCardView, 1));
                    case 6:
                        int i43 = ExternalCardView.V;
                        return new k(externalCardView);
                    case 7:
                        int i59 = ExternalCardView.V;
                        return new l(externalCardView);
                    case 8:
                        int i66 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_number_text_wrapper);
                    case 9:
                        int i74 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_zip);
                    default:
                        int i92 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_zip_wrapper);
                }
            }
        });
        final int i5 = 9;
        this.e = w.y0(new Function0(this) { // from class: qyl.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExternalCardView f250304b;

            {
                this.f250304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i5;
                ExternalCardView externalCardView = this.f250304b;
                switch (i32) {
                    case 0:
                        int i59 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_number_text);
                    case 1:
                        int i6 = ExternalCardView.V;
                        return (MaskedAppCompatEditText) externalCardView.findViewById(R$id.card_expiration_date);
                    case 2:
                        int i21 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_expiration_date_wrapper);
                    case 3:
                        int i22 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_cvc);
                    case 4:
                        int i322 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_cvc_wrapper);
                    case 5:
                        int i33 = ExternalCardView.V;
                        return new bzl.k(new g(externalCardView, 1));
                    case 6:
                        int i43 = ExternalCardView.V;
                        return new k(externalCardView);
                    case 7:
                        int i592 = ExternalCardView.V;
                        return new l(externalCardView);
                    case 8:
                        int i66 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_number_text_wrapper);
                    case 9:
                        int i74 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_zip);
                    default:
                        int i92 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_zip_wrapper);
                }
            }
        });
        final int i6 = 10;
        this.f = w.y0(new Function0(this) { // from class: qyl.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExternalCardView f250304b;

            {
                this.f250304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i6;
                ExternalCardView externalCardView = this.f250304b;
                switch (i32) {
                    case 0:
                        int i59 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_number_text);
                    case 1:
                        int i66 = ExternalCardView.V;
                        return (MaskedAppCompatEditText) externalCardView.findViewById(R$id.card_expiration_date);
                    case 2:
                        int i21 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_expiration_date_wrapper);
                    case 3:
                        int i22 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_cvc);
                    case 4:
                        int i322 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_cvc_wrapper);
                    case 5:
                        int i33 = ExternalCardView.V;
                        return new bzl.k(new g(externalCardView, 1));
                    case 6:
                        int i43 = ExternalCardView.V;
                        return new k(externalCardView);
                    case 7:
                        int i592 = ExternalCardView.V;
                        return new l(externalCardView);
                    case 8:
                        int i662 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_number_text_wrapper);
                    case 9:
                        int i74 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_zip);
                    default:
                        int i92 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_zip_wrapper);
                }
            }
        });
        final int i21 = 1;
        this.f107145g = w.y0(new Function0(this) { // from class: qyl.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExternalCardView f250304b;

            {
                this.f250304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i21;
                ExternalCardView externalCardView = this.f250304b;
                switch (i32) {
                    case 0:
                        int i59 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_number_text);
                    case 1:
                        int i66 = ExternalCardView.V;
                        return (MaskedAppCompatEditText) externalCardView.findViewById(R$id.card_expiration_date);
                    case 2:
                        int i212 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_expiration_date_wrapper);
                    case 3:
                        int i22 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_cvc);
                    case 4:
                        int i322 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_cvc_wrapper);
                    case 5:
                        int i33 = ExternalCardView.V;
                        return new bzl.k(new g(externalCardView, 1));
                    case 6:
                        int i43 = ExternalCardView.V;
                        return new k(externalCardView);
                    case 7:
                        int i592 = ExternalCardView.V;
                        return new l(externalCardView);
                    case 8:
                        int i662 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_number_text_wrapper);
                    case 9:
                        int i74 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_zip);
                    default:
                        int i92 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_zip_wrapper);
                }
            }
        });
        final int i22 = 2;
        this.f107146h = w.y0(new Function0(this) { // from class: qyl.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExternalCardView f250304b;

            {
                this.f250304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i22;
                ExternalCardView externalCardView = this.f250304b;
                switch (i32) {
                    case 0:
                        int i59 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_number_text);
                    case 1:
                        int i66 = ExternalCardView.V;
                        return (MaskedAppCompatEditText) externalCardView.findViewById(R$id.card_expiration_date);
                    case 2:
                        int i212 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_expiration_date_wrapper);
                    case 3:
                        int i222 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_cvc);
                    case 4:
                        int i322 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_cvc_wrapper);
                    case 5:
                        int i33 = ExternalCardView.V;
                        return new bzl.k(new g(externalCardView, 1));
                    case 6:
                        int i43 = ExternalCardView.V;
                        return new k(externalCardView);
                    case 7:
                        int i592 = ExternalCardView.V;
                        return new l(externalCardView);
                    case 8:
                        int i662 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_number_text_wrapper);
                    case 9:
                        int i74 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_zip);
                    default:
                        int i92 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_zip_wrapper);
                }
            }
        });
        final int i32 = 3;
        this.i = w.y0(new Function0(this) { // from class: qyl.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExternalCardView f250304b;

            {
                this.f250304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i322 = i32;
                ExternalCardView externalCardView = this.f250304b;
                switch (i322) {
                    case 0:
                        int i59 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_number_text);
                    case 1:
                        int i66 = ExternalCardView.V;
                        return (MaskedAppCompatEditText) externalCardView.findViewById(R$id.card_expiration_date);
                    case 2:
                        int i212 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_expiration_date_wrapper);
                    case 3:
                        int i222 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_cvc);
                    case 4:
                        int i3222 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_cvc_wrapper);
                    case 5:
                        int i33 = ExternalCardView.V;
                        return new bzl.k(new g(externalCardView, 1));
                    case 6:
                        int i43 = ExternalCardView.V;
                        return new k(externalCardView);
                    case 7:
                        int i592 = ExternalCardView.V;
                        return new l(externalCardView);
                    case 8:
                        int i662 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_number_text_wrapper);
                    case 9:
                        int i74 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_zip);
                    default:
                        int i92 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_zip_wrapper);
                }
            }
        });
        final int i33 = 4;
        this.f107147j = w.y0(new Function0(this) { // from class: qyl.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExternalCardView f250304b;

            {
                this.f250304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i322 = i33;
                ExternalCardView externalCardView = this.f250304b;
                switch (i322) {
                    case 0:
                        int i59 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_number_text);
                    case 1:
                        int i66 = ExternalCardView.V;
                        return (MaskedAppCompatEditText) externalCardView.findViewById(R$id.card_expiration_date);
                    case 2:
                        int i212 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_expiration_date_wrapper);
                    case 3:
                        int i222 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_cvc);
                    case 4:
                        int i3222 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_cvc_wrapper);
                    case 5:
                        int i332 = ExternalCardView.V;
                        return new bzl.k(new g(externalCardView, 1));
                    case 6:
                        int i43 = ExternalCardView.V;
                        return new k(externalCardView);
                    case 7:
                        int i592 = ExternalCardView.V;
                        return new l(externalCardView);
                    case 8:
                        int i662 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_number_text_wrapper);
                    case 9:
                        int i74 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_zip);
                    default:
                        int i92 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_zip_wrapper);
                }
            }
        });
        a listener = new a(this, 1);
        this.cardNumber = "";
        this.cardNumberEditable = true;
        this.cardNumberHint = "";
        this.cardNumberFloatingHint = "";
        this.cardNumberError = "";
        gzl.e.Companion.getClass();
        this.cardNumberSoftError = new gzl.e();
        this.postcode = "";
        this.postcodeHint = "";
        this.expireDate = "";
        this.expireDateFloatingHint = "";
        this.expireDateHint = "";
        this.cvv = "";
        this.cvvHint = "";
        this.cvvFloatingHint = "";
        final int i43 = 5;
        this.I = w.y0(new Function0(this) { // from class: qyl.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExternalCardView f250304b;

            {
                this.f250304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i322 = i43;
                ExternalCardView externalCardView = this.f250304b;
                switch (i322) {
                    case 0:
                        int i59 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_number_text);
                    case 1:
                        int i66 = ExternalCardView.V;
                        return (MaskedAppCompatEditText) externalCardView.findViewById(R$id.card_expiration_date);
                    case 2:
                        int i212 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_expiration_date_wrapper);
                    case 3:
                        int i222 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_cvc);
                    case 4:
                        int i3222 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_cvc_wrapper);
                    case 5:
                        int i332 = ExternalCardView.V;
                        return new bzl.k(new g(externalCardView, 1));
                    case 6:
                        int i432 = ExternalCardView.V;
                        return new k(externalCardView);
                    case 7:
                        int i592 = ExternalCardView.V;
                        return new l(externalCardView);
                    case 8:
                        int i662 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_number_text_wrapper);
                    case 9:
                        int i74 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_zip);
                    default:
                        int i92 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_zip_wrapper);
                }
            }
        });
        this.J = new e();
        final int i59 = 6;
        this.K = w.y0(new Function0(this) { // from class: qyl.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExternalCardView f250304b;

            {
                this.f250304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i322 = i59;
                ExternalCardView externalCardView = this.f250304b;
                switch (i322) {
                    case 0:
                        int i592 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_number_text);
                    case 1:
                        int i66 = ExternalCardView.V;
                        return (MaskedAppCompatEditText) externalCardView.findViewById(R$id.card_expiration_date);
                    case 2:
                        int i212 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_expiration_date_wrapper);
                    case 3:
                        int i222 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_cvc);
                    case 4:
                        int i3222 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_cvc_wrapper);
                    case 5:
                        int i332 = ExternalCardView.V;
                        return new bzl.k(new g(externalCardView, 1));
                    case 6:
                        int i432 = ExternalCardView.V;
                        return new k(externalCardView);
                    case 7:
                        int i5922 = ExternalCardView.V;
                        return new l(externalCardView);
                    case 8:
                        int i662 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_number_text_wrapper);
                    case 9:
                        int i74 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_zip);
                    default:
                        int i92 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_zip_wrapper);
                }
            }
        });
        final int i66 = 7;
        this.L = w.y0(new Function0(this) { // from class: qyl.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExternalCardView f250304b;

            {
                this.f250304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i322 = i66;
                ExternalCardView externalCardView = this.f250304b;
                switch (i322) {
                    case 0:
                        int i592 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_number_text);
                    case 1:
                        int i662 = ExternalCardView.V;
                        return (MaskedAppCompatEditText) externalCardView.findViewById(R$id.card_expiration_date);
                    case 2:
                        int i212 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_expiration_date_wrapper);
                    case 3:
                        int i222 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_cvc);
                    case 4:
                        int i3222 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_cvc_wrapper);
                    case 5:
                        int i332 = ExternalCardView.V;
                        return new bzl.k(new g(externalCardView, 1));
                    case 6:
                        int i432 = ExternalCardView.V;
                        return new k(externalCardView);
                    case 7:
                        int i5922 = ExternalCardView.V;
                        return new l(externalCardView);
                    case 8:
                        int i6622 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_number_text_wrapper);
                    case 9:
                        int i74 = ExternalCardView.V;
                        return (MultipleDrawableMaterialEditText) externalCardView.findViewById(R$id.card_zip);
                    default:
                        int i92 = ExternalCardView.V;
                        return (RevolutTextInputLayout) externalCardView.findViewById(R$id.card_zip_wrapper);
                }
            }
        });
        ?? r102 = new View.OnFocusChangeListener(this) { // from class: qyl.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExternalCardView f250306b;

            {
                this.f250306b = this;
            }

            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                switch (i2) {
                    case 0:
                        ExternalCardView.c(this.f250306b, z);
                        break;
                    case 1:
                        ExternalCardView.b(this.f250306b, z);
                        break;
                    case 2:
                        ExternalCardView.a(this.f250306b, z);
                        break;
                    default:
                        i iVar = this.f250306b.listener;
                        if (iVar != null) {
                            ((ihm.f) ((com.revolut.uicomponent.products.d) iVar).f107223a.f107179l.getValue()).onNext(Boolean.valueOf(z));
                        }
                        break;
                }
            }
        };
        this.R = r102;
        ?? r112 = new View.OnFocusChangeListener(this) { // from class: qyl.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExternalCardView f250306b;

            {
                this.f250306b = this;
            }

            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                switch (i21) {
                    case 0:
                        ExternalCardView.c(this.f250306b, z);
                        break;
                    case 1:
                        ExternalCardView.b(this.f250306b, z);
                        break;
                    case 2:
                        ExternalCardView.a(this.f250306b, z);
                        break;
                    default:
                        i iVar = this.f250306b.listener;
                        if (iVar != null) {
                            ((ihm.f) ((com.revolut.uicomponent.products.d) iVar).f107223a.f107179l.getValue()).onNext(Boolean.valueOf(z));
                        }
                        break;
                }
            }
        };
        this.S = r112;
        ?? r122 = new View.OnFocusChangeListener(this) { // from class: qyl.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExternalCardView f250306b;

            {
                this.f250306b = this;
            }

            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                switch (i22) {
                    case 0:
                        ExternalCardView.c(this.f250306b, z);
                        break;
                    case 1:
                        ExternalCardView.b(this.f250306b, z);
                        break;
                    case 2:
                        ExternalCardView.a(this.f250306b, z);
                        break;
                    default:
                        i iVar = this.f250306b.listener;
                        if (iVar != null) {
                            ((ihm.f) ((com.revolut.uicomponent.products.d) iVar).f107223a.f107179l.getValue()).onNext(Boolean.valueOf(z));
                        }
                        break;
                }
            }
        };
        this.T = r122;
        ?? r132 = new View.OnFocusChangeListener(this) { // from class: qyl.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExternalCardView f250306b;

            {
                this.f250306b = this;
            }

            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                switch (i32) {
                    case 0:
                        ExternalCardView.c(this.f250306b, z);
                        break;
                    case 1:
                        ExternalCardView.b(this.f250306b, z);
                        break;
                    case 2:
                        ExternalCardView.a(this.f250306b, z);
                        break;
                    default:
                        i iVar = this.f250306b.listener;
                        if (iVar != null) {
                            ((ihm.f) ((com.revolut.uicomponent.products.d) iVar).f107223a.f107179l.getValue()).onNext(Boolean.valueOf(z));
                        }
                        break;
                }
            }
        };
        this.U = r132;
        if (attributeSet != null) {
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R$styleable.ExternalCardView);
            try {
                this.f107142a = typedArrayObtainAttributes.getBoolean(R$styleable.ExternalCardView_isCvvOnlyMode, false);
            } finally {
                typedArrayObtainAttributes.recycle();
            }
        }
        View.inflate(context, this.f107142a ? R$layout.view_external_card_cvv_only_mode : R$layout.view_external_card, this);
        setOrientation(1);
        setGravity(17);
        getCardNumberText().addTextChangedListener(getCardNumberWatcher());
        getCardNumberText().a(r102);
        getCardCvc().addTextChangedListener(getCvvWatcher());
        getCardCvc().a(r122);
        MultipleDrawableMaterialEditText cardNumberText = getCardNumberText();
        cardNumberText.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        cardNumberText.f148164c.add(listener);
        MultipleDrawableMaterialEditText cardNumberText2 = getCardNumberText();
        Intrinsics.checkNotNullExpressionValue(cardNumberText2, "<get-cardNumberText>(...)");
        RevolutTextInputLayout cardNumberTextWrapper = getCardNumberTextWrapper();
        Intrinsics.checkNotNullExpressionValue(cardNumberTextWrapper, "<get-cardNumberTextWrapper>(...)");
        this.M = new jpc.e(cardNumberText2, cardNumberTextWrapper);
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        MultipleDrawableMaterialEditText cardNumberText3 = getCardNumberText();
        Intrinsics.checkNotNullExpressionValue(cardNumberText3, "<get-cardNumberText>(...)");
        this.O = new o(context, resources, cardNumberText3);
        e(getCardNumberText().hasFocus(), getCardNumberText().getText());
        getCardNumberText().addTextChangedListener(new g(this, i2));
        MaskedAppCompatEditText cardExpirationDate = getCardExpirationDate();
        Intrinsics.checkNotNullExpressionValue(cardExpirationDate, "<get-cardExpirationDate>(...)");
        RevolutTextInputLayout cardExpirationDateWrapper = getCardExpirationDateWrapper();
        Intrinsics.checkNotNullExpressionValue(cardExpirationDateWrapper, "<get-cardExpirationDateWrapper>(...)");
        this.Q = new c(cardExpirationDateWrapper, cardExpirationDate);
        Locale UK = Locale.UK;
        Intrinsics.checkNotNullExpressionValue(UK, "UK");
        MaskedAppCompatEditText cardExpirationDate2 = getCardExpirationDate();
        Intrinsics.checkNotNullExpressionValue(cardExpirationDate2, "<get-cardExpirationDate>(...)");
        n nVar = p.Companion;
        Intrinsics.checkNotNullExpressionValue(UK, "UK");
        nVar.getClass();
        p pVar = new p(UK, cardExpirationDate2, new b3.a(this, i33), n.a("MMyy", UK), false, false, null, true, 320);
        getCardExpirationDate().setInputType(16);
        getCardExpirationDate().setMaskingDelegate(pVar);
        getCardExpirationDate().a(r112);
        MultipleDrawableMaterialEditText cardCvc = getCardCvc();
        Intrinsics.checkNotNullExpressionValue(cardCvc, "<get-cardCvc>(...)");
        RevolutTextInputLayout cardCvcWrapper = getCardCvcWrapper();
        Intrinsics.checkNotNullExpressionValue(cardCvcWrapper, "<get-cardCvcWrapper>(...)");
        this.P = new c(cardCvcWrapper, cardCvc);
        getCardZip().addTextChangedListener(getPostcodeWatcher());
        getCardZip().a(r132);
        MultipleDrawableMaterialEditText cardZip = getCardZip();
        Intrinsics.checkNotNullExpressionValue(cardZip, "<get-cardZip>(...)");
        RevolutTextInputLayout cardZipWrapper = getCardZipWrapper();
        Intrinsics.checkNotNullExpressionValue(cardZipWrapper, "<get-cardZipWrapper>(...)");
        this.N = new jpc.e(cardZip, cardZipWrapper);
        Resources resources2 = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        MultipleDrawableMaterialEditText cardZip2 = getCardZip();
        Intrinsics.checkNotNullExpressionValue(cardZip2, "<get-cardZip>(...)");
        new o(context, resources2, cardZip2);
        getCardZip().setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(10)});
    }

    public /* synthetic */ ExternalCardView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
