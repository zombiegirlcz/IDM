package com.revolut.core.ui_kit.views.pin;

import ald.o;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewGroupKt;
import aw0.v1;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.internal.views.pincode.DotsView;
import com.revolut.core.ui_kit.internal.views.pincode.DynamicDotsView;
import com.revolut.core.ui_kit.internal.views.pincode.FingerPrintView;
import com.revolut.core.ui_kit.internal.views.pincode.PlaceholderDotsView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ImageWithAnimatedBackgroundView;
import com.revolut.core.ui_kit.views.KeypadView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import e8.q;
import foh.i;
import ix0.c0;
import ix0.h2;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import mx0.n8;
import mx0.r8;
import or0.m;
import or0.u;
import org.jetbrains.annotations.NotNull;
import rp0.z1;
import rr0.d;
import rr0.g;
import vc.s;
import yhm.j;
import yhm.k;
import yuc.p;
import yx0.e;
import yx0.f;
import yy0.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 Í\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\rÎ\u0001Ï\u0001Ð\u0001Ñ\u0001Ò\u0001\u001c\u0015NB'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\u00122\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b(\u0010#J#\u0010+\u001a\u00020\u00122\b\u0010)\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b+\u0010,J\u001d\u0010.\u001a\u00020\u00122\u0006\u0010-\u001a\u00020 2\u0006\u0010)\u001a\u00020 ¢\u0006\u0004\b.\u0010,J\u0015\u00101\u001a\u00020\u00122\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b3\u0010#J\u0015\u00105\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u000204¢\u0006\u0004\b5\u00106J\r\u00108\u001a\u000207¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0019\u0010@\u001a\u00020\u00122\b\u0010?\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0004\b@\u0010AJ\u0019\u0010D\u001a\u00020\u00122\b\u0010C\u001a\u0004\u0018\u00010BH\u0002¢\u0006\u0004\bD\u0010EJ\u0019\u0010H\u001a\u00020\u00122\b\u0010G\u001a\u0004\u0018\u00010FH\u0002¢\u0006\u0004\bH\u0010IJ\u0019\u0010J\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\bJ\u0010#J\u0019\u0010K\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\bK\u0010#J\u0019\u0010L\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\bL\u0010#R$\u0010T\u001a\u0004\u0018\u00010M8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001b\u0010Z\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001b\u0010_\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010W\u001a\u0004\b]\u0010^R\u001b\u0010d\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010W\u001a\u0004\bb\u0010cR\u001b\u0010g\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010W\u001a\u0004\bf\u0010cR\u001b\u0010l\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010W\u001a\u0004\bj\u0010kR\u001b\u0010o\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010W\u001a\u0004\bn\u0010kR\u001b\u0010r\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010W\u001a\u0004\bq\u0010kR\u001b\u0010w\u001a\u00020s8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bt\u0010W\u001a\u0004\bu\u0010vR\u001b\u0010|\u001a\u00020x8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\by\u0010W\u001a\u0004\bz\u0010{R\u001d\u0010\u0081\u0001\u001a\u00020}8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b~\u0010W\u001a\u0005\b\u007f\u0010\u0080\u0001R \u0010\u0086\u0001\u001a\u00030\u0082\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0083\u0001\u0010W\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010\u008b\u0001\u001a\u00030\u0087\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0088\u0001\u0010W\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001e\u0010\u008e\u0001\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010W\u001a\u0005\b\u008d\u0001\u0010kR\u001e\u0010\u0091\u0001\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010W\u001a\u0005\b\u0090\u0001\u0010kR\u001e\u0010\u0094\u0001\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010W\u001a\u0005\b\u0093\u0001\u0010kR\u001e\u0010\u0097\u0001\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010W\u001a\u0005\b\u0096\u0001\u0010kR\u001e\u0010\u009a\u0001\u001a\u00020h8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010W\u001a\u0005\b\u0099\u0001\u0010kR!\u0010 \u0001\u001a\u00030\u009b\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R#\u0010¥\u0001\u001a\u0005\u0018\u00010¡\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¢\u0001\u0010\u009d\u0001\u001a\u0006\b£\u0001\u0010¤\u0001R0\u0010«\u0001\u001a\u0012\u0012\r\u0012\u000b §\u0001*\u0004\u0018\u00010\u00120\u00120¦\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¨\u0001\u0010\u009d\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R0\u0010®\u0001\u001a\u0012\u0012\r\u0012\u000b §\u0001*\u0004\u0018\u00010\u00120\u00120¦\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¬\u0001\u0010\u009d\u0001\u001a\u0006\b\u00ad\u0001\u0010ª\u0001R0\u0010±\u0001\u001a\u0012\u0012\r\u0012\u000b §\u0001*\u0004\u0018\u000107070¦\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¯\u0001\u0010\u009d\u0001\u001a\u0006\b°\u0001\u0010ª\u0001R0\u0010´\u0001\u001a\u0012\u0012\r\u0012\u000b §\u0001*\u0004\u0018\u000107070¦\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b²\u0001\u0010\u009d\u0001\u001a\u0006\b³\u0001\u0010ª\u0001R0\u0010·\u0001\u001a\u0012\u0012\r\u0012\u000b §\u0001*\u0004\u0018\u000104040¦\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bµ\u0001\u0010\u009d\u0001\u001a\u0006\b¶\u0001\u0010ª\u0001R0\u0010º\u0001\u001a\u0012\u0012\r\u0012\u000b §\u0001*\u0004\u0018\u00010\u00120\u00120¦\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¸\u0001\u0010\u009d\u0001\u001a\u0006\b¹\u0001\u0010ª\u0001R0\u0010½\u0001\u001a\u0012\u0012\r\u0012\u000b §\u0001*\u0004\u0018\u00010\u00120\u00120¦\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b»\u0001\u0010\u009d\u0001\u001a\u0006\b¼\u0001\u0010ª\u0001R2\u0010Á\u0001\u001a\u0014\u0012\u000f\u0012\r §\u0001*\u0005\u0018\u00010¾\u00010¾\u00010¦\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¿\u0001\u0010\u009d\u0001\u001a\u0006\bÀ\u0001\u0010ª\u0001R0\u0010Ä\u0001\u001a\u0012\u0012\r\u0012\u000b §\u0001*\u0004\u0018\u00010\u00190\u00190¦\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÂ\u0001\u0010\u009d\u0001\u001a\u0006\bÃ\u0001\u0010ª\u0001R.\u0010É\u0001\u001a\u0010\u0012\u0005\u0012\u00030¾\u0001\u0012\u0004\u0012\u00020\u00120Å\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÆ\u0001\u0010\u009d\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001R\u0017\u0010Ì\u0001\u001a\u00020>8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010Ë\u0001¨\u0006Ó\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/views/pin/PinCodeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lsy0/a;", "Lrr0/d;", "Lur0/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Mode;", "mode", "Lcom/revolut/core/ui_kit/views/pin/PinCodeView$BiometricBehaviorMode;", "biometricBehaviorMode", "", "setMode", "(Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Mode;Lcom/revolut/core/ui_kit/views/pin/PinCodeView$BiometricBehaviorMode;)V", "Lcom/revolut/core/ui_kit/views/pin/c;", "displayer", "setPinCodeTipDisplayer", "(Lcom/revolut/core/ui_kit/views/pin/c;)V", "Lmx0/n8;", "setKeypadMode", "(Lmx0/n8;)V", "Lyx0/f;", "hinter", "setPinCodeHinter", "(Lyx0/f;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "setWarningText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "amount", "setDotsSelected", "(Ljava/lang/Integer;)V", "extraActionText", "setExtraBottomInfo", "actionText", "message", "setBottomInfo", "(Lcom/revolut/core/ui_kit/models/Clause;Lcom/revolut/core/ui_kit/models/Clause;)V", "labelText", "setFingerPrintModeInfo", "Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Header;", "header", "setHeader", "(Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Header;)V", "setDescription", "Lcom/revolut/core/ui_kit/views/pin/PinCodeView$a;", "setBiometricModeAndInvalidate", "(Lcom/revolut/core/ui_kit/views/pin/PinCodeView$a;)V", "", "getCurrentPinCode", "()Ljava/lang/String;", "Landroid/view/View;", "dotsView", "setWarningBelowDots", "(Landroid/view/View;)V", "Lyy0/h;", "image", "setKeyboardActionImage", "(Lyy0/h;)V", "Lcom/revolut/core/ui_kit_core/displayers/media/Media;", "overlay", "setOverlay", "(Lcom/revolut/core/ui_kit_core/displayers/media/Media;)V", "Lcom/revolut/core/ui_kit/views/ImageWithAnimatedBackgroundView$Model;", "model", "setHeaderImage", "(Lcom/revolut/core/ui_kit/views/ImageWithAnimatedBackgroundView$Model;)V", "setTitle", "setSubtitle", "setShortTitle", "Landroid/os/Parcelable;", "b", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "Lcom/revolut/core/ui_kit/views/ImageWithAnimatedBackgroundView;", "f", "Le8/q;", "getAvatar", "()Lcom/revolut/core/ui_kit/views/ImageWithAnimatedBackgroundView;", "avatar", "Lcom/revolut/core/ui_kit/internal/views/UiKitMediaView;", "g", "getAvatarOverlay", "()Lcom/revolut/core/ui_kit/internal/views/UiKitMediaView;", "avatarOverlay", "Lcom/revolut/core/ui_kit/views/LargeActionButton;", "h", "getExtraBottomAction", "()Lcom/revolut/core/ui_kit/views/LargeActionButton;", "extraBottomAction", "i", "getBottomAction", "bottomAction", "Landroid/widget/TextView;", "j", "getBottomMessage", "()Landroid/widget/TextView;", "bottomMessage", "k", "getDescription", "description", "l", "getDotsHint", "dotsHint", "Lcom/revolut/core/ui_kit/internal/views/pincode/DynamicDotsView;", "m", "getDynamicDots", "()Lcom/revolut/core/ui_kit/internal/views/pincode/DynamicDotsView;", "dynamicDots", "Lcom/revolut/core/ui_kit/internal/views/pincode/FingerPrintView;", "n", "getFingerprint", "()Lcom/revolut/core/ui_kit/internal/views/pincode/FingerPrintView;", "fingerprint", "Lcom/revolut/core/ui_kit/internal/views/pincode/DotsView;", "o", "getFixedDots", "()Lcom/revolut/core/ui_kit/internal/views/pincode/DotsView;", "fixedDots", "Lcom/revolut/core/ui_kit/views/KeypadView;", "p", "getKeypad", "()Lcom/revolut/core/ui_kit/views/KeypadView;", "keypad", "Lcom/revolut/core/ui_kit/internal/views/pincode/PlaceholderDotsView;", "q", "getPlaceholderDots", "()Lcom/revolut/core/ui_kit/internal/views/pincode/PlaceholderDotsView;", "placeholderDots", "r", "getShortTitle", "shortTitle", "s", "getSubtitle", "subtitle", "t", "getTitle", "title", "u", "getWarning", "warning", "v", "getFingerprintLabel", "fingerprintLabel", "Lyx0/b;", "y", "Lkotlin/Lazy;", "getDynamicDotsHintAnimationController", "()Lyx0/b;", "dynamicDotsHintAnimationController", "Lrp0/z1;", "E", "getTipPopupDisplayer", "()Lrp0/z1;", "tipPopupDisplayer", "Lihm/f;", "kotlin.jvm.PlatformType", "G", "getSubtitleClickSubject", "()Lihm/f;", "subtitleClickSubject", "H", "getDescriptionClickSubject", "descriptionClickSubject", "I", "getPinCodeInsertedSubject", "pinCodeInsertedSubject", "J", "getPinCodeChangedSubject", "pinCodeChangedSubject", "K", "getAdditionalAuthClickSubject", "additionalAuthClickSubject", "L", "getStateIsDefaultSubject", "stateIsDefaultSubject", "M", "getPinCodeWasClearedSubject", "pinCodeWasClearedSubject", "Lty0/a;", "N", "getOnBottomInfoClauseClickSubject", "onBottomInfoClauseClickSubject", "O", "getKeypadModeChangedSubject", "keypadModeChangedSubject", "Lkotlin/Function1;", "P", "getOnBottomInfoClick", "()Lkotlin/jvm/functions/Function1;", "onBottomInfoClick", "getClearKeypadActionImage", "()Lyy0/h;", "clearKeypadActionImage", "Companion", "Header", "a", "yx0/e", "BiometricBehaviorMode", "Mode", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PinCodeView extends ConstraintLayout implements TrackableItem, sy0.a, d, ur0.b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final g A;
    public boolean B;
    public Mode C;
    public f D;
    public final Object E;
    public c F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final h Q;
    public final h R;
    public final h S;
    public a T;
    public final androidx.view.d U;
    public BiometricBehaviorMode V;
    public h2 W;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q avatar;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q avatarOverlay;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final q extraBottomAction;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final q bottomAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final q bottomMessage;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final q description;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final q dotsHint;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final q dynamicDots;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final q fingerprint;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final q fixedDots;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final q keypad;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final q placeholderDots;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final q shortTitle;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final q subtitle;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final q title;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final q warning;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final q fingerprintLabel;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f59596w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public iu0.d f59597x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f59598y;
    public final LinkedHashSet z;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/views/pin/PinCodeView$BiometricBehaviorMode;", "Landroid/os/Parcelable;", "Legacy", "Focus", "Lcom/revolut/core/ui_kit/views/pin/PinCodeView$BiometricBehaviorMode$Focus;", "Lcom/revolut/core/ui_kit/views/pin/PinCodeView$BiometricBehaviorMode$Legacy;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface BiometricBehaviorMode extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/views/pin/PinCodeView$BiometricBehaviorMode$Focus;", "Lcom/revolut/core/ui_kit/views/pin/PinCodeView$BiometricBehaviorMode;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Focus implements BiometricBehaviorMode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Focus f59599a = new Focus();

            @NotNull
            public static final Parcelable.Creator<Focus> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Focus.f59599a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Focus[i];
                }
            }

            private Focus() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/views/pin/PinCodeView$BiometricBehaviorMode$Legacy;", "Lcom/revolut/core/ui_kit/views/pin/PinCodeView$BiometricBehaviorMode;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Legacy implements BiometricBehaviorMode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Legacy f59600a = new Legacy();

            @NotNull
            public static final Parcelable.Creator<Legacy> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Legacy.f59600a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Legacy[i];
                }
            }

            private Legacy() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Header;", "Landroid/os/Parcelable;", "<init>", "()V", "Title", "TitleImage", "Empty", "Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Header$Empty;", "Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Header$Title;", "Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Header$TitleImage;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Header implements Parcelable {

        /* JADX INFO: loaded from: classes20.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Header$Empty;", "Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Header;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Empty extends Header {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Empty f59601a = new Empty();

            @NotNull
            public static final Parcelable.Creator<Empty> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Empty.f59601a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Empty[i];
                }
            }

            private Empty() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Header$TitleImage;", "Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Header;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TitleImage extends Header {

            @NotNull
            public static final Parcelable.Creator<TitleImage> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f59605a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ImageWithAnimatedBackgroundView.Model f59606b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Media f59607c;
            public final Clause d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new TitleImage((Clause) parcel.readParcelable(TitleImage.class.getClassLoader()), parcel.readInt() == 0 ? null : ImageWithAnimatedBackgroundView.Model.CREATOR.createFromParcel(parcel), (Media) parcel.readParcelable(TitleImage.class.getClassLoader()), (Clause) parcel.readParcelable(TitleImage.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TitleImage[i];
                }
            }

            public TitleImage(Clause title, ImageWithAnimatedBackgroundView.Model model, Media media, Clause clause) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.f59605a = title;
                this.f59606b = model;
                this.f59607c = media;
                this.d = clause;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof TitleImage)) {
                    return false;
                }
                TitleImage titleImage = (TitleImage) obj2;
                return Intrinsics.f(this.f59605a, titleImage.f59605a) && Intrinsics.f(this.f59606b, titleImage.f59606b) && Intrinsics.f(this.f59607c, titleImage.f59607c) && Intrinsics.f(this.d, titleImage.d);
            }

            public final int hashCode() {
                int iHashCode = this.f59605a.hashCode() * 31;
                ImageWithAnimatedBackgroundView.Model model = this.f59606b;
                int iHashCode2 = (iHashCode + (model == null ? 0 : model.hashCode())) * 31;
                Media media = this.f59607c;
                int iHashCode3 = (iHashCode2 + (media == null ? 0 : media.hashCode())) * 31;
                Clause clause = this.d;
                return iHashCode3 + (clause != null ? clause.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f59605a, i);
                ImageWithAnimatedBackgroundView.Model model = this.f59606b;
                if (model == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    model.writeToParcel(dest, i);
                }
                dest.writeParcelable(this.f59607c, i);
                dest.writeParcelable(this.d, i);
            }
        }

        private Header() {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Header$Title;", "Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Header;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Title extends Header {

            @NotNull
            public static final Parcelable.Creator<Title> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f59602a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Clause f59603b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Clause f59604c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Title((Clause) parcel.readParcelable(Title.class.getClassLoader()), (Clause) parcel.readParcelable(Title.class.getClassLoader()), (Clause) parcel.readParcelable(Title.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Title[i];
                }
            }

            public Title(Clause title, Clause clause, Clause clause2) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.f59602a = title;
                this.f59603b = clause;
                this.f59604c = clause2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Title)) {
                    return false;
                }
                Title title = (Title) obj2;
                return Intrinsics.f(this.f59602a, title.f59602a) && Intrinsics.f(this.f59603b, title.f59603b) && Intrinsics.f(this.f59604c, title.f59604c);
            }

            public final int hashCode() {
                int iHashCode = this.f59602a.hashCode() * 31;
                Clause clause = this.f59603b;
                int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
                Clause clause2 = this.f59604c;
                return iHashCode2 + (clause2 != null ? clause2.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f59602a, i);
                dest.writeParcelable(this.f59603b, i);
                dest.writeParcelable(this.f59604c, i);
            }

            public /* synthetic */ Title(int i, Clause clause, TextLocalisedClause textLocalisedClause) {
                this(clause, (i & 2) != 0 ? null : textLocalisedClause, (Clause) null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Mode;", "Landroid/os/Parcelable;", "Legacy", "Placeholder", "Dynamic", "Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Mode$Dynamic;", "Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Mode$Legacy;", "Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Mode$Placeholder;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Mode extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Mode$Dynamic;", "Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Mode;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Dynamic implements Mode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Dynamic f59608a = new Dynamic();

            @NotNull
            public static final Parcelable.Creator<Dynamic> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Dynamic.f59608a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Dynamic[i];
                }
            }

            private Dynamic() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Mode$Legacy;", "Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Mode;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @yhm.d
        public static final class Legacy implements Mode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Legacy f59609a = new Legacy();

            @NotNull
            public static final Parcelable.Creator<Legacy> CREATOR = new a();

            /* JADX INFO: loaded from: classes20.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Legacy.f59609a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Legacy[i];
                }
            }

            private Legacy() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Mode$Placeholder;", "Lcom/revolut/core/ui_kit/views/pin/PinCodeView$Mode;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Placeholder implements Mode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f59610a;

            @NotNull
            public static final Parcelable.Creator<Placeholder> CREATOR = new b();

            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Placeholder(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Placeholder[i];
                }
            }

            public Placeholder(int i) {
                this.f59610a = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Placeholder) && this.f59610a == ((Placeholder) obj2).f59610a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f59610a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f59610a);
            }
        }
    }

    public static abstract class a {

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.pin.PinCodeView$a$a, reason: collision with other inner class name */
        public static final class C0445a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0445a f59611a = new C0445a();

            private C0445a() {
            }

            @Override // com.revolut.core.ui_kit.views.pin.PinCodeView.a
            public final e a() {
                return e.NONE;
            }
        }

        private a() {
        }

        public abstract e a();
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.pin.PinCodeView$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinCodeView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Unit f0(com.revolut.core.ui_kit.views.pin.PinCodeView r5) {
        /*
            rr0.g r0 = r5.A
            r0.b0()
            com.revolut.core.ui_kit.views.pin.PinCodeView$a r0 = r5.T
            boolean r0 = r0 instanceof com.revolut.core.ui_kit.views.pin.PinCodeView.a.C0445a
            r1 = 0
            java.lang.String r2 = "dotsController"
            if (r0 != 0) goto L1e
            iu0.d r0 = r5.f59597x
            if (r0 == 0) goto L1a
            boolean r0 = r0.b()
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L1a:
            kotlin.jvm.internal.Intrinsics.r(r2)
            throw r1
        L1e:
            r0 = 0
        L1f:
            com.revolut.core.ui_kit.views.pin.PinCodeView$Mode r3 = r5.C
            boolean r4 = r3 instanceof com.revolut.core.ui_kit.views.pin.PinCodeView.Mode.Dynamic
            if (r4 == 0) goto L35
            iu0.d r0 = r5.f59597x
            if (r0 == 0) goto L31
            java.lang.String r0 = r0.a()
            r5.A0(r0)
            goto L5c
        L31:
            kotlin.jvm.internal.Intrinsics.r(r2)
            throw r1
        L35:
            boolean r1 = r3 instanceof com.revolut.core.ui_kit.views.pin.PinCodeView.Mode.Legacy
            if (r1 == 0) goto L49
            if (r0 == 0) goto L45
            ihm.f r0 = r5.getAdditionalAuthClickSubject()
            com.revolut.core.ui_kit.views.pin.PinCodeView$a r5 = r5.T
            r0.onNext(r5)
            goto L5c
        L45:
            r5.p0()
            goto L5c
        L49:
            boolean r1 = r3 instanceof com.revolut.core.ui_kit.views.pin.PinCodeView.Mode.Placeholder
            if (r1 == 0) goto L5f
            if (r0 == 0) goto L59
            ihm.f r0 = r5.getAdditionalAuthClickSubject()
            com.revolut.core.ui_kit.views.pin.PinCodeView$a r5 = r5.T
            r0.onNext(r5)
            goto L5c
        L59:
            r5.B0()
        L5c:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L5f:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.pin.PinCodeView.f0(com.revolut.core.ui_kit.views.pin.PinCodeView):kotlin.Unit");
    }

    public static Unit g0(PinCodeView pinCodeView, Unit it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        ihm.f pinCodeWasClearedSubject = pinCodeView.getPinCodeWasClearedSubject();
        Unit unit = Unit.f186387a;
        pinCodeWasClearedSubject.onNext(unit);
        pinCodeView.L0();
        return unit;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ihm.f getAdditionalAuthClickSubject() {
        return (ihm.f) this.K.getValue();
    }

    private final ImageWithAnimatedBackgroundView getAvatar() {
        return (ImageWithAnimatedBackgroundView) this.avatar.f();
    }

    private final UiKitMediaView getAvatarOverlay() {
        return (UiKitMediaView) this.avatarOverlay.f();
    }

    private final LargeActionButton getBottomAction() {
        return (LargeActionButton) this.bottomAction.f();
    }

    private final TextView getBottomMessage() {
        return (TextView) this.bottomMessage.f();
    }

    private final h getClearKeypadActionImage() {
        ResourceImage resourceImage;
        Mode mode = this.C;
        if (mode instanceof Mode.Legacy) {
            resourceImage = new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        } else {
            if (!(mode instanceof Mode.Dynamic) && !(mode instanceof Mode.Placeholder)) {
                throw new NoWhenBranchMatchedException();
            }
            resourceImage = new ResourceImage(R$drawable.uikit_icn_24_arrow_backspace, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        }
        return new h(new TextLocalisedClause(R$string.uikit_keypad_delete_accessibility_label, null, null, 14), resourceImage);
    }

    private final TextView getDescription() {
        return (TextView) this.description.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ihm.f getDescriptionClickSubject() {
        return (ihm.f) this.H.getValue();
    }

    private final TextView getDotsHint() {
        return (TextView) this.dotsHint.f();
    }

    private final DynamicDotsView getDynamicDots() {
        return (DynamicDotsView) this.dynamicDots.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final yx0.b getDynamicDotsHintAnimationController() {
        return (yx0.b) this.f59598y.getValue();
    }

    private final LargeActionButton getExtraBottomAction() {
        return (LargeActionButton) this.extraBottomAction.f();
    }

    private final FingerPrintView getFingerprint() {
        return (FingerPrintView) this.fingerprint.f();
    }

    private final DotsView getFixedDots() {
        return (DotsView) this.fixedDots.f();
    }

    private final KeypadView getKeypad() {
        return (KeypadView) this.keypad.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ihm.f getKeypadModeChangedSubject() {
        return (ihm.f) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ihm.f getOnBottomInfoClauseClickSubject() {
        return (ihm.f) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Function1<ty0.a, Unit> getOnBottomInfoClick() {
        return (Function1) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ihm.f getPinCodeChangedSubject() {
        return (ihm.f) this.J.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ihm.f getPinCodeInsertedSubject() {
        return (ihm.f) this.I.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ihm.f getPinCodeWasClearedSubject() {
        return (ihm.f) this.M.getValue();
    }

    private final PlaceholderDotsView getPlaceholderDots() {
        return (PlaceholderDotsView) this.placeholderDots.f();
    }

    private final TextView getShortTitle() {
        return (TextView) this.shortTitle.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ihm.f getStateIsDefaultSubject() {
        return (ihm.f) this.L.getValue();
    }

    private final TextView getSubtitle() {
        return (TextView) this.subtitle.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ihm.f getSubtitleClickSubject() {
        return (ihm.f) this.G.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final z1 getTipPopupDisplayer() {
        return (z1) this.E.getValue();
    }

    private final TextView getTitle() {
        return (TextView) this.title.f();
    }

    private final TextView getWarning() {
        return (TextView) this.warning.f();
    }

    public static Unit h0(PinCodeView pinCodeView, ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        u.k(pinCodeView).n0().a(pinCodeView.getBottomMessage(), pinCodeView, null);
        pinCodeView.getOnBottomInfoClauseClickSubject().onNext(clickData);
        return Unit.f186387a;
    }

    public static yx0.b i0(PinCodeView pinCodeView) {
        return new yx0.b(pinCodeView.getDynamicDots(), pinCodeView.getDotsHint());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Unit j0(com.revolut.core.ui_kit.views.pin.PinCodeView r3) {
        /*
            rr0.g r0 = r3.A
            r0.b0()
            com.revolut.core.ui_kit.views.pin.PinCodeView$a r0 = r3.T
            boolean r0 = r0 instanceof com.revolut.core.ui_kit.views.pin.PinCodeView.a.C0445a
            if (r0 != 0) goto L1e
            iu0.d r0 = r3.f59597x
            if (r0 == 0) goto L17
            boolean r0 = r0.b()
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L17:
            java.lang.String r3 = "dotsController"
            kotlin.jvm.internal.Intrinsics.r(r3)
            r3 = 0
            throw r3
        L1e:
            r0 = 0
        L1f:
            com.revolut.core.ui_kit.views.pin.PinCodeView$Mode r1 = r3.C
            boolean r2 = r1 instanceof com.revolut.core.ui_kit.views.pin.PinCodeView.Mode.Dynamic
            if (r2 == 0) goto L35
            if (r0 == 0) goto L31
            ihm.f r0 = r3.getAdditionalAuthClickSubject()
            com.revolut.core.ui_kit.views.pin.PinCodeView$a r3 = r3.T
            r0.onNext(r3)
            goto L44
        L31:
            r3.B0()
            goto L44
        L35:
            boolean r3 = r1 instanceof com.revolut.core.ui_kit.views.pin.PinCodeView.Mode.Legacy
            if (r3 != 0) goto L44
            boolean r3 = r1 instanceof com.revolut.core.ui_kit.views.pin.PinCodeView.Mode.Placeholder
            if (r3 == 0) goto L3e
            goto L44
        L3e:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L44:
            kotlin.Unit r3 = kotlin.Unit.f186387a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.pin.PinCodeView.j0(com.revolut.core.ui_kit.views.pin.PinCodeView):kotlin.Unit");
    }

    public static final void n0(PinCodeView pinCodeView, String str) {
        pinCodeView.getPinCodeChangedSubject().onNext(str);
        if (str.length() == 0) {
            pinCodeView.F0(true);
        } else {
            pinCodeView.getDynamicDotsHintAnimationController().a(pinCodeView.C instanceof Mode.Dynamic);
        }
        pinCodeView.L0();
    }

    public static /* synthetic */ void setBottomInfo$default(PinCodeView pinCodeView, Clause clause, Clause clause2, int i, Object obj2) {
        if ((i & 2) != 0) {
            clause2 = null;
        }
        pinCodeView.setBottomInfo(clause, clause2);
    }

    public static /* synthetic */ void setDotsSelected$default(PinCodeView pinCodeView, Integer num, int i, Object obj2) {
        if ((i & 1) != 0) {
            num = null;
        }
        pinCodeView.setDotsSelected(num);
    }

    private final void setHeaderImage(ImageWithAnimatedBackgroundView.Model model) {
        getAvatar().setModel(model);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setKeyboardActionImage(yy0.h r7) {
        /*
            r6 = this;
            com.revolut.core.ui_kit.views.pin.PinCodeView$Mode r0 = r6.C
            boolean r1 = r0 instanceof com.revolut.core.ui_kit.views.pin.PinCodeView.Mode.Dynamic
            r2 = 0
            if (r1 == 0) goto L58
            yx0.f r0 = r6.D
            r1 = 0
            r3 = 1
            java.lang.String r4 = "dotsController"
            if (r0 == 0) goto L2c
            iu0.d r5 = r6.f59597x
            if (r5 == 0) goto L28
            java.lang.String r4 = r5.a()
            com.revolut.utils.PinCodeHinter r0 = (com.revolut.utils.PinCodeHinter) r0
            java.lang.String r5 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            int r4 = r4.length()
            int r0 = r0.f107331a
            if (r4 < r0) goto L37
            goto L36
        L28:
            kotlin.jvm.internal.Intrinsics.r(r4)
            throw r2
        L2c:
            iu0.d r0 = r6.f59597x
            if (r0 == 0) goto L54
            boolean r0 = r0.b()
            if (r0 != 0) goto L37
        L36:
            r1 = r3
        L37:
            com.revolut.core.ui_kit.views.KeypadView r0 = r6.getKeypad()
            r0.setStartActionImage(r7)
            com.revolut.core.ui_kit.views.KeypadView r7 = r6.getKeypad()
            if (r1 == 0) goto L46
            yy0.h r2 = r6.S
        L46:
            r7.setEndActionImage(r2)
            com.revolut.core.ui_kit.views.KeypadView r7 = r6.getKeypad()
            java.lang.String r0 = "submit"
            r7.setTag(r0)
            return
        L54:
            kotlin.jvm.internal.Intrinsics.r(r4)
            throw r2
        L58:
            boolean r1 = r0 instanceof com.revolut.core.ui_kit.views.pin.PinCodeView.Mode.Legacy
            if (r1 == 0) goto L72
            com.revolut.core.ui_kit.views.KeypadView r0 = r6.getKeypad()
            r0.setStartActionImage(r2)
            com.revolut.core.ui_kit.views.KeypadView r0 = r6.getKeypad()
            r0.setEndActionImage(r7)
            com.revolut.core.ui_kit.views.KeypadView r7 = r6.getKeypad()
            r7.setTag(r2)
            return
        L72:
            boolean r0 = r0 instanceof com.revolut.core.ui_kit.views.pin.PinCodeView.Mode.Placeholder
            if (r0 == 0) goto L8c
            com.revolut.core.ui_kit.views.KeypadView r0 = r6.getKeypad()
            r0.setStartActionImage(r2)
            com.revolut.core.ui_kit.views.KeypadView r0 = r6.getKeypad()
            r0.setEndActionImage(r7)
            com.revolut.core.ui_kit.views.KeypadView r7 = r6.getKeypad()
            r7.setTag(r2)
            return
        L8c:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.pin.PinCodeView.setKeyboardActionImage(yy0.h):void");
    }

    public static /* synthetic */ void setMode$default(PinCodeView pinCodeView, Mode mode, BiometricBehaviorMode biometricBehaviorMode, int i, Object obj2) {
        if ((i & 2) != 0) {
            biometricBehaviorMode = BiometricBehaviorMode.Legacy.f59600a;
        }
        pinCodeView.setMode(mode, biometricBehaviorMode);
    }

    private final void setOverlay(Media overlay) {
        ((jz0.b) u.k(this).a0()).b(overlay, getAvatarOverlay(), null);
    }

    private final void setShortTitle(Clause clause) {
        ty0.c.b(u.k(this).b0(), clause, getShortTitle(), null, null, 12);
        u.c(getShortTitle(), clause);
    }

    private final void setSubtitle(Clause clause) {
        ty0.c.b(u.k(this).b0(), clause, getSubtitle(), null, null, 12);
        u.c(getSubtitle(), clause);
    }

    private final void setTitle(Clause clause) {
        ty0.c.b(u.k(this).b0(), clause, getTitle(), null, null, 12);
        u.c(getTitle(), clause);
    }

    private final void setWarningBelowDots(View dotsView) {
        TextView warning = getWarning();
        ViewGroup.LayoutParams layoutParams = warning.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.topToBottom = dotsView.getId();
        layoutParams2.bottomToBottom = getKeypad().getId();
        layoutParams2.verticalBias = 0.04f;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = kli.a.k(context, 16.0f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = kli.a.k(context2, 16.0f);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = kli.a.k(context3, 16.0f);
        warning.setLayoutParams(layoutParams2);
    }

    public final void A0(String str) {
        Mode mode = this.C;
        if (mode instanceof Mode.Legacy) {
            getPinCodeInsertedSubject().onNext(str);
        } else {
            if (!(mode instanceof Mode.Dynamic) && !(mode instanceof Mode.Placeholder)) {
                throw new NoWhenBranchMatchedException();
            }
            if (F0(true)) {
                return;
            }
            getPinCodeInsertedSubject().onNext(str);
        }
    }

    public final void B0() {
        yx0.d dVar;
        iu0.d dVar2 = this.f59597x;
        if (dVar2 == null) {
            Intrinsics.r("dotsController");
            throw null;
        }
        StringBuilder sb6 = dVar2.d;
        if (sb6.length() != 0) {
            dVar2.f168428a.c();
            Intrinsics.checkNotNullExpressionValue(sb6.deleteCharAt(sb6.length() - 1), "deleteCharAt(...)");
            o oVar = dVar2.f;
            if (oVar != null) {
                oVar.invoke(dVar2.a());
            }
            if (sb6.length() == 0 && (dVar = dVar2.f168431g) != null) {
                dVar.invoke(Unit.f186387a);
            }
        }
        C0();
    }

    public final void C0() {
        iu0.d dVar = this.f59597x;
        if (dVar == null) {
            Intrinsics.r("dotsController");
            throw null;
        }
        if (!dVar.b()) {
            setKeyboardActionImage(getClearKeypadActionImage());
            return;
        }
        if (this.T.a() == e.FACE_ID) {
            setKeyboardActionImage(this.Q);
        } else if (this.T.a() == e.FINGERPRINT) {
            setKeyboardActionImage(this.R);
        } else {
            setKeyboardActionImage(null);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View, iu0.b] */
    public final void D0() {
        Mode mode = this.C;
        int i = 0;
        if (mode instanceof Mode.Dynamic) {
            this.f59596w = getDynamicDots();
            this.f59597x = new iu0.d(getDynamicDots(), 12, false);
            getFixedDots().setVisibility(8);
            getDynamicDots().setVisibility(0);
            getPlaceholderDots().setVisibility(8);
            TextView warning = getWarning();
            ViewGroup.LayoutParams layoutParams = warning.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ViewGroup.LayoutParams layoutParams3 = getDynamicDots().getLayoutParams();
            Intrinsics.i(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams2.topToBottom = layoutParams4.topToBottom;
            layoutParams2.bottomToTop = layoutParams4.bottomToTop;
            layoutParams2.verticalBias = layoutParams4.verticalBias;
            warning.setLayoutParams(layoutParams2);
        } else if (mode instanceof Mode.Legacy) {
            this.f59596w = getFixedDots();
            this.f59597x = new iu0.d(getFixedDots(), 4, true);
            getFixedDots().setVisibility(0);
            getDynamicDots().setVisibility(8);
            getPlaceholderDots().setVisibility(8);
            setWarningBelowDots(getFixedDots());
        } else {
            if (!(mode instanceof Mode.Placeholder)) {
                throw new NoWhenBranchMatchedException();
            }
            PlaceholderDotsView placeholderDots = getPlaceholderDots();
            int i2 = ((Mode.Placeholder) mode).f59610a;
            placeholderDots.setPlaceholderLength(i2);
            this.f59596w = placeholderDots;
            this.f59597x = new iu0.d(getPlaceholderDots(), i2, true);
            getFixedDots().setVisibility(8);
            getDynamicDots().setVisibility(8);
            getPlaceholderDots().setVisibility(0);
            setWarningBelowDots(getPlaceholderDots());
        }
        KeypadView keypad = getKeypad();
        ?? r4 = this.f59596w;
        if (r4 == 0) {
            Intrinsics.r("dots");
            throw null;
        }
        this.W = new h2(keypad, r4.getView(), getBottomAction());
        BiometricBehaviorMode biometricBehaviorMode = this.V;
        if (Intrinsics.f(biometricBehaviorMode, BiometricBehaviorMode.Focus.f59599a)) {
            h2 h2Var = this.W;
            if (h2Var == null) {
                Intrinsics.r("contentViewList");
                throw null;
            }
            h2Var.d(false);
        } else {
            if (!Intrinsics.f(biometricBehaviorMode, BiometricBehaviorMode.Legacy.f59600a)) {
                throw new NoWhenBranchMatchedException();
            }
            h2 h2Var2 = this.W;
            if (h2Var2 == null) {
                Intrinsics.r("contentViewList");
                throw null;
            }
            h2Var2.d(true);
        }
        iu0.d dVar = this.f59597x;
        if (dVar == null) {
            Intrinsics.r("dotsController");
            throw null;
        }
        dVar.e = new o(1, this, PinCodeView.class, "onPinCodeInserted", "onPinCodeInserted(Ljava/lang/String;)V", 0, 17);
        iu0.d dVar2 = this.f59597x;
        if (dVar2 == null) {
            Intrinsics.r("dotsController");
            throw null;
        }
        dVar2.f = new o(1, this, PinCodeView.class, "onPinCodeChanged", "onPinCodeChanged(Ljava/lang/String;)V", 0, 18);
        iu0.d dVar3 = this.f59597x;
        if (dVar3 != null) {
            dVar3.f168431g = new yx0.d(this, i);
        } else {
            Intrinsics.r("dotsController");
            throw null;
        }
    }

    public final void E0() {
        r8 r8Var;
        C0();
        Mode mode = this.C;
        if (mode instanceof Mode.Legacy) {
            r8Var = r8.REGULAR;
        } else {
            if (!(mode instanceof Mode.Dynamic) && !(mode instanceof Mode.Placeholder)) {
                throw new NoWhenBranchMatchedException();
            }
            r8Var = r8.REGULAR_FULLSCREEN;
        }
        getKeypad().setupStyle(r8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F0(boolean r14) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.pin.PinCodeView.F0(boolean):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.View, iu0.b] */
    public final void G0(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        LinkedHashSet linkedHashSet = this.z;
        if (linkedHashSet.add(token) && linkedHashSet.size() == 1) {
            getBottomAction().setEnabled(false);
            getDescription().setEnabled(false);
            getSubtitle().setEnabled(false);
            L0();
            if (this.C instanceof Mode.Legacy) {
                setKeyboardActionImage(null);
            }
            ?? r2 = this.f59596w;
            if (r2 != 0) {
                r2.e();
            } else {
                Intrinsics.r("dots");
                throw null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View, iu0.b] */
    public final void H0(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        LinkedHashSet linkedHashSet = this.z;
        if (linkedHashSet.remove(token) && linkedHashSet.size() == 0) {
            getBottomAction().setEnabled(true);
            getDescription().setEnabled(true);
            getSubtitle().setEnabled(true);
            L0();
            C0();
            ?? r2 = this.f59596w;
            if (r2 != 0) {
                r2.f();
            } else {
                Intrinsics.r("dots");
                throw null;
            }
        }
    }

    public final void I0() {
        if (getFingerprint().getVisibility() == 0) {
            getFingerprint().b();
        }
    }

    public final void K0(boolean z) {
        BiometricBehaviorMode biometricBehaviorMode = this.V;
        if (!(biometricBehaviorMode instanceof BiometricBehaviorMode.Focus)) {
            if (!(biometricBehaviorMode instanceof BiometricBehaviorMode.Legacy)) {
                throw new NoWhenBranchMatchedException();
            }
            h2 h2Var = this.W;
            if (h2Var != null) {
                h2Var.d(true);
                return;
            } else {
                Intrinsics.r("contentViewList");
                throw null;
            }
        }
        if (isLaidOut()) {
            h2 h2Var2 = this.W;
            if (h2Var2 != null) {
                h2Var2.a(z, false);
                return;
            } else {
                Intrinsics.r("contentViewList");
                throw null;
            }
        }
        h2 h2Var3 = this.W;
        if (h2Var3 != null) {
            h2Var3.d(z);
        } else {
            Intrinsics.r("contentViewList");
            throw null;
        }
    }

    @Override // rr0.d
    public final void L(boolean z) {
        if (z) {
            G0("loading_button");
        } else {
            H0("loading_button");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L0() {
        /*
            r6 = this;
            com.revolut.core.ui_kit.views.KeypadView r0 = r6.getKeypad()
            boolean r1 = r6.B
            java.util.LinkedHashSet r2 = r6.z
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L2b
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L2b
            iu0.d r1 = r6.f59597x
            if (r1 == 0) goto L24
            java.lang.String r5 = r1.a()
            int r5 = r5.length()
            int r1 = r1.f168429b
            if (r5 >= r1) goto L2b
            r1 = r4
            goto L2c
        L24:
            java.lang.String r0 = "dotsController"
            kotlin.jvm.internal.Intrinsics.r(r0)
            r0 = 0
            throw r0
        L2b:
            r1 = r3
        L2c:
            r0.setNumbersEnabled$ui_kit_components_release(r1)
            com.revolut.core.ui_kit.views.KeypadView r0 = r6.getKeypad()
            boolean r1 = r6.B
            if (r1 != 0) goto L3e
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L3e
            r3 = r4
        L3e:
            com.revolut.core.ui_kit.views.pin.PinCodeView$Mode r1 = r6.C
            boolean r1 = r1 instanceof com.revolut.core.ui_kit.views.pin.PinCodeView.Mode.Legacy
            r0.setActionsEnabled$ui_kit_components_release(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.pin.PinCodeView.L0():void");
    }

    @Override // sy0.a
    public final rr0.f V() {
        return this.A.V();
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public Parcelable getAnalyticsContext() {
        return this.analyticsContext;
    }

    @NotNull
    public final String getCurrentPinCode() {
        iu0.d dVar = this.f59597x;
        if (dVar != null) {
            return dVar.a();
        }
        Intrinsics.r("dotsController");
        throw null;
    }

    @NotNull
    public final TextView getFingerprintLabel() {
        return (TextView) this.fingerprintLabel.f();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [android.view.View, iu0.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, iu0.b] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, iu0.b] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.View, iu0.b] */
    public final void o0() {
        if (!isAttachedToWindow()) {
            p0();
            return;
        }
        Mode mode = this.C;
        if (Intrinsics.f(mode, Mode.Legacy.f59609a)) {
            p0();
            ?? r06 = this.f59596w;
            if (r06 == 0) {
                Intrinsics.r("dots");
                throw null;
            }
            if (r06.getView().getVisibility() == 0) {
                ?? r09 = this.f59596w;
                if (r09 != 0) {
                    r09.b();
                    return;
                } else {
                    Intrinsics.r("dots");
                    throw null;
                }
            }
            return;
        }
        if (!(mode instanceof Mode.Dynamic) && !(mode instanceof Mode.Placeholder)) {
            throw new NoWhenBranchMatchedException();
        }
        ?? r010 = this.f59596w;
        if (r010 == 0) {
            Intrinsics.r("dots");
            throw null;
        }
        if (r010.getView().getVisibility() != 0) {
            p0();
            return;
        }
        ?? r011 = this.f59596w;
        if (r011 == 0) {
            Intrinsics.r("dots");
            throw null;
        }
        r011.b();
        Handler handler = getHandler();
        if (handler != null) {
            handler.postDelayed(this.U, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        c cVar = this.F;
        if (cVar != null) {
            ((je9.f) cVar).a();
        }
        super.onDetachedFromWindow();
    }

    public final void p0() {
        iu0.d dVar = this.f59597x;
        if (dVar == null) {
            Intrinsics.r("dotsController");
            throw null;
        }
        w.g(dVar.d);
        dVar.f168428a.a();
        yx0.d dVar2 = dVar.f168431g;
        if (dVar2 != null) {
            dVar2.invoke(Unit.f186387a);
        }
        C0();
    }

    public final void q0() {
        getBottomAction().setEnabled(false);
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            i.e(getChildAt(i5), colorScheme, i, i2, i3);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(colorScheme.a(), context);
        getTitle().setTextColor(iS);
        getSubtitle().setTextColor(iS);
        getShortTitle().setTextColor(iS);
        getDescription().setTextColor(iS);
        getBottomMessage().setTextColor(iS);
    }

    public final void r0() {
        getTitle().setVisibility(0);
        getSubtitle().setVisibility(0);
        getFingerprint().setVisibility(8);
        K0(true);
        getStateIsDefaultSubject().onNext(Unit.f186387a);
    }

    public final ihm.f s0() {
        return getAdditionalAuthClickSubject();
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    public final void setBiometricModeAndInvalidate(@NotNull a mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.T = mode;
        iu0.d dVar = this.f59597x;
        if (dVar == null) {
            Intrinsics.r("dotsController");
            throw null;
        }
        if (dVar.b()) {
            C0();
            if (mode instanceof a.C0445a) {
                F0(false);
            }
        }
        if (mode instanceof a.C0445a) {
            getTitle().setVisibility(0);
            getSubtitle().setVisibility(0);
            getFingerprint().setVisibility(8);
            K0(true);
            getStateIsDefaultSubject().onNext(Unit.f186387a);
            return;
        }
        if (!(mode instanceof com.revolut.core.ui_kit.views.pin.a)) {
            if (!(mode instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            getFingerprint().setVisibility(8);
            getDynamicDotsHintAnimationController().a(this.C instanceof Mode.Dynamic);
            K0(false);
            return;
        }
        FingerPrintView fingerprint = getFingerprint();
        AnimatorSet animatorSet = fingerprint.f57447a;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        for (View view : ViewGroupKt.getChildren(fingerprint)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        getFingerprint().setVisibility(0);
        getDotsHint().setVisibility(8);
        h2 h2Var = this.W;
        if (h2Var == null) {
            Intrinsics.r("contentViewList");
            throw null;
        }
        h2Var.d(false);
    }

    public final void setBottomInfo(Clause actionText, Clause message) {
        getBottomAction().setText(actionText);
        LargeActionButton bottomAction = getBottomAction();
        Object obj2 = u.f228038a;
        Intrinsics.checkNotNullParameter(bottomAction, "<this>");
        bottomAction.setVisibility(actionText != null ? 0 : 8);
        bottomAction.setClickable(actionText != null);
        ty0.c.b(u.k(this).b0(), message, getBottomMessage(), getOnBottomInfoClick(), null, 8);
        u.c(getBottomMessage(), message);
        getBottomMessage().setMovementMethod(c0.f169220a);
    }

    public final void setDescription(Clause clause) {
        ty0.c.b(u.k(this).b0(), clause, getDescription(), null, null, 12);
        u.c(getDescription(), clause);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, iu0.b] */
    public final void setDotsSelected(Integer amount) {
        getDynamicDotsHintAnimationController().a(this.C instanceof Mode.Dynamic);
        ?? r06 = this.f59596w;
        if (r06 != 0) {
            r06.setDotsSelected(amount);
        } else {
            Intrinsics.r("dots");
            throw null;
        }
    }

    public final void setExtraBottomInfo(Clause extraActionText) {
        getExtraBottomAction().setText(extraActionText);
        LargeActionButton extraBottomAction = getExtraBottomAction();
        Object obj2 = u.f228038a;
        Intrinsics.checkNotNullParameter(extraBottomAction, "<this>");
        extraBottomAction.setVisibility(extraActionText != null ? 0 : 8);
        extraBottomAction.setClickable(extraActionText != null);
    }

    public final void setFingerPrintModeInfo(@NotNull Clause labelText, @NotNull Clause actionText) {
        Intrinsics.checkNotNullParameter(labelText, "labelText");
        Intrinsics.checkNotNullParameter(actionText, "actionText");
        FingerPrintView fingerprint = getFingerprint();
        fingerprint.setLabelText(labelText);
        fingerprint.setBackActionText(actionText);
    }

    public final void setHeader(@NotNull Header header) {
        Intrinsics.checkNotNullParameter(header, "header");
        if (header instanceof Header.Title) {
            int i = R$id.PinCodeView_dots;
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(this);
            constraintSet.setVerticalBias(i, 0.2f);
            constraintSet.applyTo(this);
            Header.Title title = (Header.Title) header;
            setTitle(title.f59602a);
            Clause clause = title.f59603b;
            if (this.C instanceof Mode.Placeholder) {
                clause = null;
            }
            setSubtitle(clause);
            setShortTitle(null);
            setHeaderImage(null);
            setOverlay(null);
            setDescription(title.f59604c);
            return;
        }
        if (header instanceof Header.TitleImage) {
            int i2 = R$id.PinCodeView_dots;
            ConstraintSet constraintSet2 = new ConstraintSet();
            constraintSet2.clone(this);
            constraintSet2.setVerticalBias(i2, 0.5f);
            constraintSet2.applyTo(this);
            setTitle(null);
            setSubtitle(null);
            Header.TitleImage titleImage = (Header.TitleImage) header;
            setShortTitle(titleImage.f59605a);
            setHeaderImage(titleImage.f59606b);
            setOverlay(titleImage.f59607c);
            setDescription(titleImage.d);
            return;
        }
        if (!(header instanceof Header.Empty)) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = R$id.PinCodeView_dots;
        ConstraintSet constraintSet3 = new ConstraintSet();
        constraintSet3.clone(this);
        constraintSet3.setVerticalBias(i3, 0.06f);
        constraintSet3.applyTo(this);
        setTitle(null);
        setSubtitle(null);
        setShortTitle(null);
        setHeaderImage(null);
        setOverlay(null);
        setDescription(null);
    }

    public final void setKeypadMode(@NotNull n8 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (getKeypad().getF58707y() == mode) {
            return;
        }
        c cVar = this.F;
        if (cVar != null) {
            ((je9.f) cVar).b(mode, this.T);
        }
        getKeypad().setMode(mode);
    }

    public final void setMode(@NotNull Mode mode, @NotNull BiometricBehaviorMode biometricBehaviorMode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(biometricBehaviorMode, "biometricBehaviorMode");
        this.C = mode;
        this.V = biometricBehaviorMode;
        D0();
        E0();
        F0(false);
    }

    public final void setPinCodeHinter(@NotNull f hinter) {
        Intrinsics.checkNotNullParameter(hinter, "hinter");
        this.D = hinter;
        F0(false);
    }

    public final void setPinCodeTipDisplayer(@NotNull c displayer) {
        Intrinsics.checkNotNullParameter(displayer, "displayer");
        this.F = displayer;
        if (displayer != null) {
            ((je9.f) displayer).c(getTipPopupDisplayer());
        }
    }

    public final void setWarningText(Clause clause) {
        this.B = clause != null;
        if (clause != null) {
            p0();
            getDynamicDotsHintAnimationController().a(this.C instanceof Mode.Dynamic);
            if (this.C instanceof Mode.Legacy) {
                setKeyboardActionImage(null);
            }
        } else {
            C0();
            F0(true);
        }
        ty0.c.b(u.k(this).b0(), clause, getWarning(), null, null, 12);
        u.c(getWarning(), clause);
        L0();
    }

    public final ihm.f t0() {
        return getBottomAction().o;
    }

    public final ihm.f u0() {
        return getFingerprint().a();
    }

    public final ihm.f v0() {
        return getExtraBottomAction().o;
    }

    public final ihm.f w0() {
        return getPinCodeChangedSubject();
    }

    public final ihm.f x0() {
        return getPinCodeInsertedSubject();
    }

    public final ihm.f y0() {
        return getPinCodeWasClearedSubject();
    }

    public final ihm.f z0() {
        return getStateIsDefaultSubject();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinCodeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCodeView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.avatar = kli.a.J(R$id.PinCodeView_avatar, this);
        this.avatarOverlay = kli.a.J(R$id.PinCodeView_avatarOverlay, this);
        this.extraBottomAction = kli.a.J(R$id.PinCodeView_extraBottomAction, this);
        this.bottomAction = kli.a.J(R$id.PinCodeView_bottomAction, this);
        this.bottomMessage = kli.a.J(R$id.PinCodeView_bottomMessage, this);
        this.description = kli.a.J(R$id.PinCodeView_description, this);
        this.dotsHint = kli.a.J(R$id.PinCodeView_dotsHint, this);
        this.dynamicDots = kli.a.J(R$id.PinCodeView_dynamicDots, this);
        this.fingerprint = kli.a.J(R$id.PinCodeView_fingerprint, this);
        this.fixedDots = kli.a.J(R$id.PinCodeView_dots, this);
        this.keypad = kli.a.J(R$id.PinCodeView_keypad, this);
        this.placeholderDots = kli.a.J(R$id.PinCodeView_placeholderDots, this);
        this.shortTitle = kli.a.J(R$id.PinCodeView_short_title, this);
        this.subtitle = kli.a.J(R$id.PinCodeView_subtitle, this);
        this.title = kli.a.J(R$id.PinCodeView_title, this);
        this.warning = kli.a.J(R$id.PinCodeView_warning, this);
        this.fingerprintLabel = kli.a.J(R$id.FingerPrintView_label, this);
        final int i2 = 0;
        this.f59598y = te0.w.y0(new Function0(this) { // from class: yx0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinCodeView f317523b;

            {
                this.f317523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                PinCodeView pinCodeView = this.f317523b;
                switch (i3) {
                    case 0:
                        return PinCodeView.i0(pinCodeView);
                    case 1:
                        return PinCodeView.j0(pinCodeView);
                    case 2:
                        return PinCodeView.f0(pinCodeView);
                    default:
                        PinCodeView.Companion companion = PinCodeView.INSTANCE;
                        return new p(pinCodeView, 13);
                }
            }
        });
        this.z = new LinkedHashSet();
        g gVarB = s.b(this, false);
        gVarB.i = false;
        this.A = gVarB;
        this.C = Mode.Dynamic.f59608a;
        this.E = te0.w.y0(new a01.c(context, 19));
        k kVar = k.NONE;
        this.G = j.c(kVar, new xl3.a(8));
        this.H = j.c(kVar, new xl3.a(9));
        this.I = j.c(kVar, new xl3.a(10));
        this.J = j.c(kVar, new xl3.a(11));
        this.K = j.c(kVar, new xl3.a(12));
        this.L = j.c(kVar, new xl3.a(4));
        this.M = j.c(kVar, new xl3.a(5));
        this.N = j.c(kVar, new xl3.a(6));
        this.O = j.c(kVar, new xl3.a(7));
        final int i3 = 3;
        this.P = j.c(kVar, new Function0(this) { // from class: yx0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinCodeView f317523b;

            {
                this.f317523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                PinCodeView pinCodeView = this.f317523b;
                switch (i32) {
                    case 0:
                        return PinCodeView.i0(pinCodeView);
                    case 1:
                        return PinCodeView.j0(pinCodeView);
                    case 2:
                        return PinCodeView.f0(pinCodeView);
                    default:
                        PinCodeView.Companion companion = PinCodeView.INSTANCE;
                        return new p(pinCodeView, 13);
                }
            }
        });
        this.Q = new h(new TextLocalisedClause(R$string.uikit_pin_pad_face_unlock_accessibility_label, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_face_id, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        this.R = new h(new TextLocalisedClause(R$string.uikit_pin_pad_fingerprint_unlock_accessibility_label, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_fingerprint, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        this.S = new h(new TextLocalisedClause(R$string.uikit_keypad_submit_accessibility_label, null, null, 14), LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_arrow_thin_right, Integer.valueOf(R$attr.uikit_colorOnAccent), R$attr.uikit_colorAccent, 12.0f, null, null, 48));
        a.C0445a c0445a = a.C0445a.f59611a;
        this.T = c0445a;
        this.U = new androidx.view.d(this, 26);
        this.V = BiometricBehaviorMode.Legacy.f59600a;
        View.inflate(context, R$layout.internal_view_pincode_view, this);
        hx7.b.v(getWarning(), "pin_code_warning");
        getAvatarOverlay().setVideoPlayerSize(Float.valueOf(84.0f));
        D0();
        TextView subtitle = getSubtitle();
        m.a(subtitle);
        subtitle.setOnClickListener(new yx0.g(this, this, 0));
        TextView description = getDescription();
        m.a(description);
        final int i5 = 1;
        description.setOnClickListener(new yx0.g(this, this, i5));
        getKeypad().setOnStartActionClickListener(new Function0(this) { // from class: yx0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinCodeView f317523b;

            {
                this.f317523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i5;
                PinCodeView pinCodeView = this.f317523b;
                switch (i32) {
                    case 0:
                        return PinCodeView.i0(pinCodeView);
                    case 1:
                        return PinCodeView.j0(pinCodeView);
                    case 2:
                        return PinCodeView.f0(pinCodeView);
                    default:
                        PinCodeView.Companion companion = PinCodeView.INSTANCE;
                        return new p(pinCodeView, 13);
                }
            }
        });
        final int i6 = 2;
        getKeypad().setOnEndActionClickListener(new Function0(this) { // from class: yx0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PinCodeView f317523b;

            {
                this.f317523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i6;
                PinCodeView pinCodeView = this.f317523b;
                switch (i32) {
                    case 0:
                        return PinCodeView.i0(pinCodeView);
                    case 1:
                        return PinCodeView.j0(pinCodeView);
                    case 2:
                        return PinCodeView.f0(pinCodeView);
                    default:
                        PinCodeView.Companion companion = PinCodeView.INSTANCE;
                        return new p(pinCodeView, 13);
                }
            }
        });
        int i21 = 1;
        getKeypad().setOnNumberClickListener(new yx0.d(this, i21));
        getKeypad().setModeChangedListener(new o(i21, getKeypadModeChangedSubject(), ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 19));
        setBiometricModeAndInvalidate(c0445a);
        E0();
        setClipChildren(false);
    }

    public /* synthetic */ PinCodeView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
