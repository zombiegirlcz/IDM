package com.revolut.core.ui_kit.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import au0.a2;
import au0.l4;
import au0.p2;
import au0.r2;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.drawables.DynamicInsetDrawable;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.internal.views.AnimatedImageSwitcher;
import com.revolut.core.ui_kit.internal.views.chat.RealtimeWaveformView;
import com.revolut.core.ui_kit.internal.views.chat.WaveformSeekBarView;
import com.revolut.core.ui_kit.internal.views.navbar.NavBarContentCenterView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import et0.p0;
import ip0.v7;
import ix0.f2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kl.b0;
import kl.c0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kx7.o0;
import mx0.a4;
import mx0.b4;
import mx0.c4;
import mx0.d4;
import mx0.e4;
import mx0.f4;
import mx0.h4;
import mx0.i4;
import mx0.j4;
import mx0.m4;
import mx0.r3;
import mx0.s2;
import mx0.w3;
import mx0.x3;
import mx0.y3;
import mx0.z2;
import mx0.z3;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\b*\u0002Æ\u0001\u0018\u0000 Ë\u00012\u00020\u00012\u00020\u0002:\u0007\u0016FÌ\u0001)\u001dKB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u000fJ\u0015\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u000fJ\u001b\u0010\u001f\u001a\u00020\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\r2\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\r2\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b$\u0010#J\u0015\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020%¢\u0006\u0004\b-\u0010(J)\u00101\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010.2\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010/¢\u0006\u0004\b1\u00102J/\u00105\u001a\u00020\r2\u000e\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010\u001c2\u0010\b\u0002\u00100\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010/¢\u0006\u0004\b5\u00106J\r\u00108\u001a\u000207¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u0007¢\u0006\u0004\b;\u0010\u0012J\u0015\u0010=\u001a\u00020\r2\u0006\u0010<\u001a\u00020\u0007¢\u0006\u0004\b=\u0010\u0012J\u0017\u0010B\u001a\u00020\r2\u0006\u0010?\u001a\u00020>H\u0000¢\u0006\u0004\b@\u0010AJ!\u0010D\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020\u000bH\u0007¢\u0006\u0004\bD\u0010EJ\u0015\u0010H\u001a\u00020\r2\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020P8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010L\u001a\u0004\bR\u0010SR\u001b\u0010Y\u001a\u00020U8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bV\u0010L\u001a\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010L\u001a\u0004\b\\\u0010]R\u001b\u0010a\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010L\u001a\u0004\b`\u0010]R\u001b\u0010f\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010L\u001a\u0004\bd\u0010eR\u001b\u0010k\u001a\u00020g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010L\u001a\u0004\bi\u0010jR\u001b\u0010p\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010L\u001a\u0004\bn\u0010oR\u001b\u0010u\u001a\u00020q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u0010L\u001a\u0004\bs\u0010tR\u001b\u0010x\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010L\u001a\u0004\bw\u0010oR\u001b\u0010{\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\by\u0010L\u001a\u0004\bz\u0010]R\u001b\u0010~\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b|\u0010L\u001a\u0004\b}\u0010]R\u001f\u0010\u0083\u0001\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0080\u0001\u0010L\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R \u0010\u0088\u0001\u001a\u00030\u0084\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0085\u0001\u0010L\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001e\u0010\u008b\u0001\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010L\u001a\u0005\b\u008a\u0001\u0010oR \u0010\u0090\u0001\u001a\u00030\u008c\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008d\u0001\u0010L\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R \u0010\u0095\u0001\u001a\u00030\u0091\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0092\u0001\u0010L\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R \u0010\u0098\u0001\u001a\u00030\u0091\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0096\u0001\u0010L\u001a\u0006\b\u0097\u0001\u0010\u0094\u0001R \u0010\u009b\u0001\u001a\u00030\u0091\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0099\u0001\u0010L\u001a\u0006\b\u009a\u0001\u0010\u0094\u0001R,\u0010£\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R,\u0010«\u0001\u001a\u0005\u0018\u00010¤\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R \u0010°\u0001\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001R \u0010³\u0001\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b±\u0001\u0010\u00ad\u0001\u001a\u0006\b²\u0001\u0010¯\u0001R!\u0010¸\u0001\u001a\u00030´\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bµ\u0001\u0010\u00ad\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R!\u0010½\u0001\u001a\u00030¹\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bº\u0001\u0010\u00ad\u0001\u001a\u0006\b»\u0001\u0010¼\u0001R,\u0010Å\u0001\u001a\u0005\u0018\u00010¾\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b¿\u0001\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0006\bÃ\u0001\u0010Ä\u0001R!\u0010Ê\u0001\u001a\u00030Æ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÇ\u0001\u0010\u00ad\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001¨\u0006Í\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/views/ChatInputView;", "Landroid/widget/FrameLayout;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "blocked", "", "setVoiceMessagesBlocked", "(Z)V", "color", "setBaseInputBackground", "(I)V", "enabled", "setReflectiveSurfaceEnabled", "setEnabled", "Lmx0/e4;", "state", "setFixedState", "(Lmx0/e4;)V", "setStartButtonRotationEnabled", "setSpaciousLayoutEnabled", "", "Lmx0/b4;", "actions", "setInputActions", "(Ljava/util/List;)V", "drawableRes", "setStartIconAttr", "(Ljava/lang/Integer;)V", "setInnerStartIconAttr", "Lcom/revolut/core/ui_kit/models/Clause;", "inputText", "setInput", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lmx0/a4;", "setInputState", "(Lmx0/a4;)V", "hint", "setHint", "Lgw0/q;", "Lkotlin/Function0;", "onEnd", "setReplyContent", "(Lgw0/q;Lkotlin/jvm/functions/Function0;)V", "Lgw0/h;", "items", "setAttachments", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "", "getInputText", "()Ljava/lang/String;", "maxLines", "setMaxInputLines", "maxLength", "setMaxInputLength", "Lmx0/r3;", "listener", "setHeightListener$ui_kit_components_release", "(Lmx0/r3;)V", "setHeightListener", "withAnimation", "setState", "(Lmx0/e4;Z)V", "Lmx0/c4;", "mode", "setMode", "(Lmx0/c4;)V", "Landroidx/constraintlayout/motion/widget/MotionLayout;", "a", "Le8/q;", "getRoot", "()Landroidx/constraintlayout/motion/widget/MotionLayout;", "root", "Lcom/revolut/core/ui_kit/views/input/MaskedTextInputEditText;", "b", "getInput$ui_kit_components_release", "()Lcom/revolut/core/ui_kit/views/input/MaskedTextInputEditText;", "input", "Landroidx/constraintlayout/widget/ConstraintLayout;", "c", "getInputContainer$ui_kit_components_release", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "inputContainer", "Landroid/widget/ImageView;", "d", "getStartButton", "()Landroid/widget/ImageView;", "startButton", "e", "getInnerStartIcon", "innerStartIcon", "Landroidx/appcompat/widget/AppCompatTextView;", "f", "getRecordAudioHoldHintView", "()Landroidx/appcompat/widget/AppCompatTextView;", "recordAudioHoldHintView", "Landroid/widget/ImageButton;", "g", "getClear", "()Landroid/widget/ImageButton;", "clear", "Landroid/widget/TextView;", "h", "getCancelHintView", "()Landroid/widget/TextView;", "cancelHintView", "Lcom/revolut/core/ui_kit/internal/views/chat/RealtimeWaveformView;", "i", "getRealtimeWaveformView", "()Lcom/revolut/core/ui_kit/internal/views/chat/RealtimeWaveformView;", "realtimeWaveformView", "j", "getTimerView", "timerView", "k", "getDotView", "dotView", "l", "getBinInputActionView", "binInputActionView", "Lcom/revolut/core/ui_kit/internal/views/AnimatedImageSwitcher;", "m", "getPlayPauseInputActionView", "()Lcom/revolut/core/ui_kit/internal/views/AnimatedImageSwitcher;", "playPauseInputActionView", "Lcom/revolut/core/ui_kit/internal/views/chat/WaveformSeekBarView;", "n", "getWaveformSeekBar", "()Lcom/revolut/core/ui_kit/internal/views/chat/WaveformSeekBarView;", "waveformSeekBar", "o", "getWaveformSeekBarTimer", "waveformSeekBarTimer", "Landroid/widget/LinearLayout;", "p", "getTopContentWrapper", "()Landroid/widget/LinearLayout;", "topContentWrapper", "Landroidx/constraintlayout/widget/Guideline;", "q", "getTopGuideline", "()Landroidx/constraintlayout/widget/Guideline;", "topGuideline", "r", "getEndGuideline", "endGuideline", "s", "getStartGuideline", "startGuideline", "Lmx0/m4;", "t", "Lmx0/m4;", "getReplyToView$ui_kit_components_release", "()Lmx0/m4;", "setReplyToView$ui_kit_components_release", "(Lmx0/m4;)V", "replyToView", "Let0/p;", "u", "Let0/p;", "getAttachmentCarouselView$ui_kit_components_release", "()Let0/p;", "setAttachmentCarouselView$ui_kit_components_release", "(Let0/p;)V", "attachmentCarouselView", "H", "Lkotlin/Lazy;", "getInputHintEnabledColor", "()I", "inputHintEnabledColor", "I", "getInputHintDisabledColor", "inputHintDisabledColor", "Landroid/animation/Animator;", "U", "getDotViewPulseAnimator", "()Landroid/animation/Animator;", "dotViewPulseAnimator", "Let0/e;", "V", "getBinAnimatorFactory", "()Let0/e;", "binAnimatorFactory", "Landroid/os/Parcelable;", "x0", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "mx0/j4", "D0", "getRecordAudioActionTouchListener", "()Lmx0/j4;", "recordAudioActionTouchListener", "Companion", "mx0/d4", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatInputView extends FrameLayout implements TrackableItem {

    @NotNull
    private static final a Companion = new a();
    public static final /* synthetic */ int I0 = 0;
    public boolean A;
    public int A0;
    public final int B;
    public int B0;
    public final int C;
    public boolean C0;
    public final int D;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    public final Lazy recordAudioActionTouchListener;
    public final int E;
    public final b0 E0;
    public final int F;
    public final c0 F0;
    public final int G;
    public final h4 G0;
    public final Object H;
    public final iv0.s H0;
    public final Object I;
    public final ihm.f J;
    public final ihm.f K;
    public final ihm.f L;
    public final ihm.f M;
    public final ihm.f N;
    public final ihm.f O;
    public final ihm.f P;
    public final ihm.f Q;
    public final ihm.f R;
    public final ihm.b S;
    public fp0.p T;
    public final Object U;
    public final Object V;
    public AnimatorSet W;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final e8.q root;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final jq0.t f58446a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final e8.q input;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public d4 f58448b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final e8.q inputContainer;
    public final ihm.b c0;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final e8.q startButton;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ihm.b f58450d0;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final e8.q innerStartIcon;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public c4 f58451e0;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final e8.q recordAudioHoldHintView;
    public boolean f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final e8.q clear;
    public boolean g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final e8.q cancelHintView;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f58454h0;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final e8.q realtimeWaveformView;
    public final a2 i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final e8.q timerView;
    public final b4[] j0;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final e8.q dotView;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public k0.b f58456k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final e8.q binInputActionView;
    public final Long[] l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final e8.q playPauseInputActionView;
    public urg.a m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final e8.q waveformSeekBar;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public oo0.d f58460n0;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final e8.q waveformSeekBarTimer;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public oo0.g f58461o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final e8.q topContentWrapper;
    public boolean p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final e8.q topGuideline;
    public int q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final e8.q endGuideline;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f58465r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final e8.q startGuideline;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f58467s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public m4 replyToView;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f58469t0;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public et0.p attachmentCarouselView;
    public r3 u0;
    public et0.a v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f58470v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p0 f58471w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f58472w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AnimatedImageSwitcher[] f58473x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f58475y;
    public DynamicInsetDrawable y0;
    public boolean z;
    public boolean z0;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatInputView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static ViewPropertyAnimator A(ChatInputView chatInputView, View view, long j2, TimeInterpolator timeInterpolator, int i) {
        long j3 = (i & 2) != 0 ? 0L : 2000L;
        if ((i & 4) != 0) {
            timeInterpolator = jq0.r.f177392a;
        }
        chatInputView.getClass();
        return y(view, j2, j3, timeInterpolator);
    }

    public static ResourceImage K(int i) {
        return new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
    }

    public static Image L(b4 b4Var) {
        int i = f4.d[b4Var.ordinal()];
        if (i == 1) {
            return K(R$drawable.uikit_icn_24_clip);
        }
        if (i == 2) {
            return K(R$drawable.uikit_icn_20_keyboard_sticker);
        }
        if (i == 3) {
            return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_arrow_thin_up, Integer.valueOf(R$attr.uikit_colorOnAccentNeutral), R$attr.uikit_colorAccentNeutral, 4.0f, null, null, 48);
        }
        if (i == 4) {
            return K(R$drawable.uikit_icn_24_keyboard);
        }
        if (i == 5) {
            return K(R$drawable.uikit_icn_24_microphone);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void a(ChatInputView chatInputView) {
        chatInputView.getTimerView().setVisibility(8);
    }

    public static void b(ChatInputView chatInputView) {
        chatInputView.getWaveformSeekBarTimer().setVisibility(8);
    }

    public static void d(ChatInputView chatInputView) {
        chatInputView.getRealtimeWaveformView().setVisibility(8);
    }

    public static et0.e e(ChatInputView chatInputView) {
        return new et0.e(chatInputView.getWaveformSeekBar(), chatInputView.getDotView(), chatInputView.getDotViewPulseAnimator(), chatInputView.getBinInputActionView());
    }

    public static void f(ChatInputView chatInputView) {
        chatInputView.getTimerView().setVisibility(8);
    }

    public static void g(ChatInputView chatInputView) {
        chatInputView.getDotView().setVisibility(8);
        chatInputView.getDotViewPulseAnimator().cancel();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final et0.e getBinAnimatorFactory() {
        return (et0.e) this.V.getValue();
    }

    private final ImageView getBinInputActionView() {
        return (ImageView) this.binInputActionView.f();
    }

    private final TextView getCancelHintView() {
        return (TextView) this.cancelHintView.f();
    }

    private final ImageButton getClear() {
        return (ImageButton) this.clear.f();
    }

    private final ImageView getDotView() {
        return (ImageView) this.dotView.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Animator getDotViewPulseAnimator() {
        Object value = this.U.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Animator) value;
    }

    private final Guideline getEndGuideline() {
        return (Guideline) this.endGuideline.f();
    }

    private final ImageView getInnerStartIcon() {
        return (ImageView) this.innerStartIcon.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getInputHintDisabledColor() {
        return ((Number) this.I.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getInputHintEnabledColor() {
        return ((Number) this.H.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AnimatedImageSwitcher getPlayPauseInputActionView() {
        return (AnimatedImageSwitcher) this.playPauseInputActionView.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RealtimeWaveformView getRealtimeWaveformView() {
        return (RealtimeWaveformView) this.realtimeWaveformView.f();
    }

    private final j4 getRecordAudioActionTouchListener() {
        return (j4) this.recordAudioActionTouchListener.getValue();
    }

    private final AppCompatTextView getRecordAudioHoldHintView() {
        return (AppCompatTextView) this.recordAudioHoldHintView.f();
    }

    private final MotionLayout getRoot() {
        return (MotionLayout) this.root.f();
    }

    private final ImageView getStartButton() {
        return (ImageView) this.startButton.f();
    }

    private final Guideline getStartGuideline() {
        return (Guideline) this.startGuideline.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTimerView() {
        return (TextView) this.timerView.f();
    }

    private final LinearLayout getTopContentWrapper() {
        return (LinearLayout) this.topContentWrapper.f();
    }

    private final Guideline getTopGuideline() {
        return (Guideline) this.topGuideline.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WaveformSeekBarView getWaveformSeekBar() {
        return (WaveformSeekBarView) this.waveformSeekBar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getWaveformSeekBarTimer() {
        return (TextView) this.waveformSeekBarTimer.f();
    }

    public static void i(ChatInputView chatInputView) {
        chatInputView.getCancelHintView().setVisibility(8);
    }

    public static void j(ChatInputView chatInputView) {
        chatInputView.getDotView().setVisibility(8);
        chatInputView.getDotViewPulseAnimator().cancel();
    }

    public static ObjectAnimator k(ChatInputView chatInputView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(chatInputView.getDotView(), "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        return objectAnimatorOfFloat;
    }

    public static void l(ChatInputView chatInputView) {
        chatInputView.getBinInputActionView().setVisibility(8);
    }

    public static void m(ChatInputView chatInputView) {
        boolean z = chatInputView.p0;
        ihm.b bVar = chatInputView.f58450d0;
        if (z) {
            chatInputView.O.onNext(Unit.f186387a);
            return;
        }
        int i = f4.f209696b[chatInputView.f58448b0.ordinal()];
        od0.i iVar = od0.i.f224256b;
        switch (i) {
            case 1:
            case 2:
                chatInputView.performHapticFeedback(1);
                CharSequence text = chatInputView.getRecordAudioHoldHintView().getText();
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                if (text.length() == 0) {
                    ty0.c.b(or0.u.k(chatInputView).b0(), new TextLocalisedClause(R$string.chat_input_text_hint_hold_to_record, null, null, 14), chatInputView.getRecordAudioHoldHintView(), null, null, 12);
                }
                chatInputView.Z(d4.HOLD_HINT, false);
                Runnable runnable = chatInputView.f58456k0;
                if (runnable != null) {
                    chatInputView.f58456k0 = null;
                    chatInputView.removeCallbacks(runnable);
                }
                k0.b bVar2 = new k0.b(chatInputView, d4.IDLE, 17);
                chatInputView.f58456k0 = bVar2;
                chatInputView.postDelayed(bVar2, 2000L);
                return;
            case 3:
            case 4:
                int i2 = jli.h.f175850a;
                return;
            case 5:
                urg.a aVar = chatInputView.m0;
                if (aVar == null) {
                    Intrinsics.r("recordAudioViewModel");
                    throw null;
                }
                aVar.j3();
                od0.i.Companion.getClass();
                bVar.onNext(iVar);
                chatInputView.Z(d4.IDLE, false);
                return;
            case 6:
                oo0.g gVar = chatInputView.f58461o0;
                if (gVar != null) {
                    urg.a aVar2 = chatInputView.m0;
                    if (aVar2 == null) {
                        Intrinsics.r("recordAudioViewModel");
                        throw null;
                    }
                    aVar2.f3(gVar);
                }
                chatInputView.f58461o0 = null;
                od0.i.Companion.getClass();
                bVar.onNext(iVar);
                chatInputView.Z(d4.IDLE, false);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static void n(ChatInputView chatInputView) {
        chatInputView.getCancelHintView().setVisibility(8);
    }

    public static void o(ChatInputView chatInputView) {
        A(chatInputView, chatInputView.getCancelHintView(), 300L, null, 4).alpha(BitmapDescriptorFactory.HUE_RED).withEndAction(new w3(chatInputView, 13)).start();
    }

    public static void p(ChatInputView chatInputView) {
        chatInputView.getRealtimeWaveformView().setVisibility(8);
    }

    public static void q(ChatInputView chatInputView) {
        chatInputView.getWaveformSeekBar().setVisibility(8);
    }

    public static void r(ChatInputView chatInputView) {
        chatInputView.getRecordAudioHoldHintView().setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setAttachments$default(ChatInputView chatInputView, List list, Function0 function0, int i, Object obj2) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        chatInputView.setAttachments(list, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setReplyContent$default(ChatInputView chatInputView, gw0.q qVar, Function0 function0, int i, Object obj2) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        chatInputView.setReplyContent(qVar, function0);
    }

    public static /* synthetic */ void setState$default(ChatInputView chatInputView, e4 e4Var, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = true;
        }
        chatInputView.setState(e4Var, z);
    }

    public static ViewPropertyAnimator y(View view, long j2, long j3, TimeInterpolator timeInterpolator) {
        ViewPropertyAnimator interpolator = view.animate().setDuration(j2).setStartDelay(j3).setInterpolator(timeInterpolator);
        Intrinsics.checkNotNullExpressionValue(interpolator, "setInterpolator(...)");
        return interpolator;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(com.revolut.core.ui_kit.internal.views.AnimatedImageSwitcher r22, mx0.b4 r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.ChatInputView.B(com.revolut.core.ui_kit.internal.views.AnimatedImageSwitcher, mx0.b4, boolean):void");
    }

    public final void C() {
        boolean z = this.f58451e0 == c4.CHAT && this.B0 != 0;
        fp0.p pVarA = this.T;
        if (z || pVarA != null) {
            if (pVarA == null) {
                fp0.m mVar = fp0.p.Companion;
                ImageView innerStartIcon = getInnerStartIcon();
                gp0.h hVar = new gp0.h(new gp0.f((gp0.c) null, 3), fp0.f.f137022a);
                mVar.getClass();
                pVarA = fp0.m.a(innerStartIcon, hVar);
                this.T = pVarA;
            }
            fp0.p.b(pVarA, z);
            View view = pVarA.f137029a;
            or0.m.a(view);
            if (z) {
                view.setOnClickListener(new p2(this, 6));
            } else {
                or0.u.o(view);
            }
        }
    }

    public final void D() {
        float fL;
        if (this.z) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            fL = kli.a.l(context, 24.0f);
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            fL = kli.a.l(context2, 20.0f);
        }
        iv0.s sVar = this.H0;
        if (sVar.f168696a != fL) {
            sVar.f168696a = fL;
            getInputContainer$ui_kit_components_release().invalidateOutline();
        }
        if (!this.z0) {
            ColorStateList colorStateList = getContext().getColorStateList(R$color.internal_color_chat_input);
            Intrinsics.checkNotNullExpressionValue(colorStateList, "getColorStateList(...)");
            float[] fArr = new float[8];
            zhm.p.o(fArr, fL, 0, 8);
            ShapeDrawable baseDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            baseDrawable.setTintList(colorStateList);
            Intrinsics.checkNotNullParameter(baseDrawable, "baseDrawable");
            this.y0 = new DynamicInsetDrawable(baseDrawable);
            getInputContainer$ui_kit_components_release().setBackground(this.y0);
            getStartButton().setBackgroundResource(com.revolut.core.ui_kit.R$drawable.internal_oval_ripple);
            return;
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        RoundedBackgroundDrawable baseDrawable2 = new RoundedBackgroundDrawable(context3, 0, true);
        baseDrawable2.f((int) fL);
        Intrinsics.checkNotNullParameter(baseDrawable2, "baseDrawable");
        this.y0 = new DynamicInsetDrawable(baseDrawable2);
        getInputContainer$ui_kit_components_release().setBackground(this.y0);
        ImageView startButton = getStartButton();
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        startButton.setBackground(new RoundedBackgroundDrawable(context4, 0, true));
        f0();
    }

    public final void E(boolean z) {
        int iK;
        int iK2;
        boolean z3 = this.A;
        int i = this.D;
        if (z3) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iK = kli.a.k(context, 16.0f);
        } else {
            int i2 = f4.f209697c[this.f58451e0.ordinal()];
            int i3 = this.E;
            if (i2 == 1) {
                int i5 = 0;
                for (AnimatedImageSwitcher animatedImageSwitcher : this.f58473x) {
                    if (animatedImageSwitcher.getVisibility() == 0) {
                        i5++;
                    }
                }
                if (i5 > 0) {
                    iK = (i5 * i) + i3;
                } else {
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    iK = kli.a.k(context2, 16.0f);
                }
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iK = i3 + i;
            }
        }
        int i6 = iK;
        if (this.A) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            iK2 = kli.a.k(context3, 16.0f);
        } else if (this.B0 != 0) {
            ViewGroup.LayoutParams layoutParams = getStartGuideline().getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            iK2 = ((ConstraintLayout.LayoutParams) layoutParams).guideBegin + i;
        } else {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            iK2 = kli.a.k(context4, 16.0f);
        }
        int i21 = iK2;
        MaskedTextInputEditText.g(getInput$ui_kit_components_release(), i21, i6, z, 10);
        or0.u.z(getRecordAudioHoldHintView(), i21, 0, i6, 0, z, 10);
    }

    public final void F() {
        int i;
        int i2;
        int i3;
        int i5 = f4.f209697c[this.f58451e0.ordinal()];
        boolean z = true;
        if (i5 == 1) {
            i = this.B0;
            i2 = 6;
            z = false;
            i3 = 6;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_search;
            i2 = 3;
            i3 = 1;
        }
        getInput$ui_kit_components_release().setSingleLine(z);
        getInput$ui_kit_components_release().setMaxLines(i3);
        getInput$ui_kit_components_release().setImeOptions(i2);
        setInnerStartIconAttr(Integer.valueOf(i));
        C();
    }

    public final void H() {
        int iK;
        boolean z = this.z;
        requestLayout();
        MaskedTextInputEditText input$ui_kit_components_release = getInput$ui_kit_components_release();
        if (z) {
            input$ui_kit_components_release.setVerticalScrollBarEnabled(true);
            input$ui_kit_components_release.setScrollbarFadingEnabled(true);
            input$ui_kit_components_release.setVerticalFadingEdgeEnabled(true);
            input$ui_kit_components_release.setScrollBarStyle(0);
            if (Build.VERSION.SDK_INT >= 29) {
                GradientDrawable gradientDrawableK = v7.k(0);
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gradientDrawableK.setColor(kli.a.s(R$attr.uikit_colorGreyTone20, context));
                gradientDrawableK.setCornerRadius(1000.0f);
                input$ui_kit_components_release.setVerticalScrollbarThumbDrawable(gradientDrawableK);
            }
        } else {
            input$ui_kit_components_release.setVerticalScrollBarEnabled(false);
            input$ui_kit_components_release.setVerticalFadingEdgeEnabled(false);
        }
        float f = this.z ? 48.0f : 40.0f;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK2 = kli.a.k(context2, f);
        int i = this.C * 2;
        int iMax = Math.max(this.B + i, iK2);
        int[] constraintSetIds = getRoot().getConstraintSetIds();
        Intrinsics.h(constraintSetIds);
        for (int i2 : constraintSetIds) {
            ConstraintSet constraintSet = getRoot().getConstraintSet(i2);
            constraintSet.constrainHeight(R$id.chatInputView_startIcon, iK2);
            constraintSet.constrainWidth(R$id.chatInputView_startIcon, iK2);
            if (isLaidOut()) {
                getRoot().updateState(i2, constraintSet);
            }
        }
        getInputContainer$ui_kit_components_release().setMinHeight(iMax);
        getTopGuideline().setGuidelineEnd(iMax);
        if (!this.A || !z) {
            int i3 = iMax - i;
            int i5 = MaskedTextInputEditText.f59117y;
            if (i3 != input$ui_kit_components_release.getMinHeight()) {
                input$ui_kit_components_release.setMinHeight(i3);
            }
        }
        if (z) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            iK = kli.a.k(context3, 4.0f);
        } else {
            iK = 0;
        }
        getEndGuideline().setGuidelineEnd(iK);
        getStartGuideline().setGuidelineBegin(iK);
        D();
        E(false);
    }

    public final void I() {
        Image imageI;
        int i = this.A0;
        if (i == 0) {
            imageI = null;
        } else if (this.z0) {
            imageI = new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246);
        } else {
            imageI = LayeredImage.INSTANCE.i(i, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorForeground_10);
        }
        yy0.f.e(or0.u.k(this).Q(), imageI, getStartButton(), null, null, 12);
    }

    public final void J() {
        urg.a aVar = this.m0;
        if (aVar == null) {
            return;
        }
        aVar.Z2();
        oo0.g gVar = this.f58461o0;
        if (gVar != null) {
            urg.a aVar2 = this.m0;
            if (aVar2 == null) {
                Intrinsics.r("recordAudioViewModel");
                throw null;
            }
            aVar2.c3(gVar);
            this.f58461o0 = null;
        }
        od0.i.Companion.getClass();
        this.f58450d0.onNext(od0.i.f224256b);
        Z(d4.IDLE, false);
    }

    public final void M(boolean z) {
        if (getCancelHintView().getVisibility() == 8) {
            return;
        }
        if (!z) {
            A(this, getCancelHintView(), 300L, null, 6).alpha(BitmapDescriptorFactory.HUE_RED).withEndAction(new w3(this, 3)).start();
        } else {
            getCancelHintView().animate().cancel();
            getCancelHintView().setVisibility(8);
        }
    }

    public final void N(boolean z) {
        if (getDotView().getVisibility() == 8) {
            return;
        }
        if (!z) {
            A(this, getDotView(), 300L, null, 6).scaleX(BitmapDescriptorFactory.HUE_RED).scaleY(BitmapDescriptorFactory.HUE_RED).withEndAction(new w3(this, 12)).start();
            return;
        }
        getDotView().animate().cancel();
        getDotView().setVisibility(8);
        getDotViewPulseAnimator().cancel();
    }

    public final void O(boolean z) {
        Interpolator anticipateOvershootInterpolator;
        float f;
        et0.a aVar = this.v;
        if (aVar != null) {
            p0 p0Var = this.f58471w;
            if (p0Var == null) {
                Intrinsics.r("handsFreePopupView");
                throw null;
            }
            if (p0Var.getVisibility() != 8) {
                if (!z) {
                    p0 p0Var2 = this.f58471w;
                    if (p0Var2 == null) {
                        Intrinsics.r("handsFreePopupView");
                        throw null;
                    }
                    if (p0Var2.f129090g) {
                        p0Var2.setPivotY(p0Var2.getHeight() / 2.0f);
                        anticipateOvershootInterpolator = jq0.r.f177392a;
                        f = 1.0f;
                    } else {
                        float height = p0Var2.getHeight();
                        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
                        p0Var2.setPivotY(height + kli.a.k(r6, 16.0f));
                        anticipateOvershootInterpolator = new AnticipateOvershootInterpolator();
                        f = 0.0f;
                    }
                    TimeInterpolator timeInterpolator = anticipateOvershootInterpolator;
                    p0 p0Var3 = this.f58471w;
                    if (p0Var3 == null) {
                        Intrinsics.r("handsFreePopupView");
                        throw null;
                    }
                    p0Var3.setVisibility(0);
                    p0 p0Var4 = this.f58471w;
                    if (p0Var4 != null) {
                        A(this, p0Var4, 300L, timeInterpolator, 2).alpha(f).scaleX(BitmapDescriptorFactory.HUE_RED).scaleY(BitmapDescriptorFactory.HUE_RED).withEndAction(new k0.b(this, aVar, 16)).start();
                        return;
                    } else {
                        Intrinsics.r("handsFreePopupView");
                        throw null;
                    }
                }
                p0 p0Var5 = this.f58471w;
                if (p0Var5 == null) {
                    Intrinsics.r("handsFreePopupView");
                    throw null;
                }
                p0Var5.animate().cancel();
                p0 p0Var6 = this.f58471w;
                if (p0Var6 == null) {
                    Intrinsics.r("handsFreePopupView");
                    throw null;
                }
                p0Var6.setVisibility(8);
                f2 f2Var = aVar.d;
                View view = f2Var.f169234a;
                if (f2Var.d) {
                    f2Var.d = false;
                    view.removeOnAttachStateChangeListener(f2Var);
                    f2Var.onViewDetachedFromWindow(view);
                }
            }
        }
    }

    public final void P(boolean z) {
        if (this.C0) {
            return;
        }
        this.C0 = true;
        boolean z3 = this.B0 != 0;
        ImageView innerStartIcon = getInnerStartIcon();
        if (!z && z3) {
            A(this, innerStartIcon, 200L, jq0.r.e, 2).alpha(BitmapDescriptorFactory.HUE_RED).scaleX(0.9f).scaleY(0.9f).withEndAction(new kt0.d(innerStartIcon, 16)).start();
            return;
        }
        innerStartIcon.animate().cancel();
        innerStartIcon.setAlpha(BitmapDescriptorFactory.HUE_RED);
        innerStartIcon.setScaleX(0.9f);
        innerStartIcon.setScaleY(0.9f);
        if (z && z3) {
            innerStartIcon.setVisibility(4);
        }
    }

    public final void Q(boolean z) {
        if (getInput$ui_kit_components_release().getVisibility() == 4) {
            return;
        }
        if (!z) {
            getInput$ui_kit_components_release().setPivotX(BitmapDescriptorFactory.HUE_RED);
            getInput$ui_kit_components_release().setPivotY(getInput$ui_kit_components_release().getHeight() / 2.0f);
            A(this, getInput$ui_kit_components_release(), 200L, jq0.r.e, 2).alpha(BitmapDescriptorFactory.HUE_RED).scaleX(0.9f).scaleY(0.9f).withEndAction(new w3(this, 10)).start();
        } else {
            getInput$ui_kit_components_release().animate().cancel();
            getInput$ui_kit_components_release().setAlpha(BitmapDescriptorFactory.HUE_RED);
            getInput$ui_kit_components_release().setScaleX(0.9f);
            getInput$ui_kit_components_release().setScaleY(0.9f);
            getInput$ui_kit_components_release().setVisibility(4);
        }
    }

    public final void R(boolean z) {
        if (getRecordAudioHoldHintView().getVisibility() == 8) {
            return;
        }
        if (z) {
            getRecordAudioHoldHintView().setVisibility(8);
            return;
        }
        getRecordAudioHoldHintView().setPivotX(BitmapDescriptorFactory.HUE_RED);
        getRecordAudioHoldHintView().setPivotY(getRecordAudioHoldHintView().getHeight() / 2.0f);
        A(this, getRecordAudioHoldHintView(), 200L, jq0.r.e, 2).alpha(BitmapDescriptorFactory.HUE_RED).scaleX(0.9f).scaleY(0.9f).withEndAction(new w3(this, 0)).start();
    }

    public final void S(boolean z) {
        if (getPlayPauseInputActionView().getVisibility() == 8) {
            return;
        }
        AnimatedImageSwitcher playPauseInputActionView = getPlayPauseInputActionView();
        if (playPauseInputActionView.getInAnimation() == null) {
            playPauseInputActionView.setInAnimation(oq0.a.a());
            playPauseInputActionView.setOutAnimation(oq0.a.b());
            playPauseInputActionView.setAnimateFirstView(this.f58475y);
            playPauseInputActionView.setAnimateFirstView(true);
        }
        if (z) {
            getPlayPauseInputActionView().setVisibility(8);
            getPlayPauseInputActionView().setImage(null);
        } else {
            getPlayPauseInputActionView().getOutAnimation().setAnimationListener(new z2(this, 1));
            getPlayPauseInputActionView().setImage(null);
        }
    }

    public final void U(boolean z) {
        if (getTimerView().getVisibility() == 8) {
            return;
        }
        if (z) {
            getTimerView().animate().cancel();
            getTimerView().setVisibility(8);
        } else {
            ViewPropertyAnimator viewPropertyAnimatorAlpha = A(this, getTimerView(), 300L, null, 6).alpha(BitmapDescriptorFactory.HUE_RED);
            Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
            viewPropertyAnimatorAlpha.translationX(-kli.a.k(r0, 12.0f)).withEndAction(new w3(this, 11)).start();
        }
    }

    public final void V(boolean z) {
        if (getRealtimeWaveformView().getVisibility() == 8) {
            return;
        }
        if (!z) {
            A(this, getRealtimeWaveformView(), 300L, null, 6).alpha(BitmapDescriptorFactory.HUE_RED).withEndAction(new w3(this, 2)).start();
        } else {
            getRealtimeWaveformView().animate().cancel();
            getRealtimeWaveformView().setVisibility(8);
        }
    }

    public final void W(boolean z) {
        if (getWaveformSeekBar().getVisibility() == 8) {
            return;
        }
        if (!z) {
            A(this, getWaveformSeekBar(), 300L, null, 6).alpha(BitmapDescriptorFactory.HUE_RED).withEndAction(new w3(this, 5)).start();
        } else {
            getWaveformSeekBar().animate().cancel();
            getWaveformSeekBar().setVisibility(8);
        }
    }

    public final void X(boolean z) {
        if (getWaveformSeekBarTimer().getVisibility() == 8) {
            return;
        }
        if (!z) {
            A(this, getWaveformSeekBarTimer(), 300L, null, 6).alpha(BitmapDescriptorFactory.HUE_RED).withEndAction(new w3(this, 4)).start();
        } else {
            getWaveformSeekBarTimer().animate().cancel();
            getWaveformSeekBarTimer().setVisibility(8);
        }
    }

    public final void Y() {
        if (getBinInputActionView().getDrawable() == null) {
            ImageView binInputActionView = getBinInputActionView();
            int i = this.G;
            binInputActionView.setPadding(i, i, i, i);
            yy0.f.e(or0.u.k(this).Q(), K(R$drawable.uikit_icn_24_delete), getBinInputActionView(), null, null, 12);
            getBinInputActionView().setOnClickListener(new z3(this, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05e1  */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r11v10, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r1v57, types: [android.view.View, com.revolut.core.ui_kit.internal.views.chat.RealtimeWaveformView] */
    /* JADX WARN: Type inference failed for: r28v0, types: [android.view.View, com.revolut.core.ui_kit.views.ChatInputView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [int] */
    /* JADX WARN: Type inference failed for: r2v78 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(mx0.d4 r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 2432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.ChatInputView.Z(mx0.d4, boolean):void");
    }

    public final void a0() {
        if (this.f58472w0) {
            return;
        }
        DynamicInsetDrawable dynamicInsetDrawable = this.y0;
        int i = this.f58467s0 - this.q0;
        int i2 = this.f58469t0 - this.f58465r0;
        int i3 = i + i2;
        if (this.f58470v0 != i3) {
            if (dynamicInsetDrawable != null) {
                int i5 = dynamicInsetDrawable.f55766a;
                int i6 = dynamicInsetDrawable.f55768c;
                int i21 = dynamicInsetDrawable.d;
                if (dynamicInsetDrawable.f55767b != i3) {
                    dynamicInsetDrawable.f55766a = i5;
                    dynamicInsetDrawable.f55767b = i3;
                    dynamicInsetDrawable.f55768c = i6;
                    dynamicInsetDrawable.d = i21;
                    if (dynamicInsetDrawable.e) {
                        dynamicInsetDrawable.c();
                        dynamicInsetDrawable.invalidateSelf();
                    }
                }
            }
            this.f58470v0 = i3;
            this.H0.e.top = i3;
            getInputContainer$ui_kit_components_release().invalidateOutline();
        }
        m4 m4Var = this.replyToView;
        if (m4Var != null) {
            m4Var.setCompensationTranslationY(i2);
        }
        r3 r3Var = this.u0;
        if (r3Var != null) {
            int i22 = this.q0 + this.f58465r0;
            jq0.t tVar = this.f58446a0;
            View view = tVar.f177400a;
            int height = (view.getVisibility() == 8 ? 0 : view.getHeight() - ((int) tVar.f)) - getTopContentWrapper().getHeight();
            r3Var.a(i22, height >= 0 ? height : 0);
        }
    }

    public final efm.r b0() {
        efm.r rVarFilter = getInput$ui_kit_components_release().f59127s.filter(new s2(new x3(this, 5), 8));
        i4 i4Var = i4.f;
        efm.r map = rVarFilter.map(new o0(13));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final void c0() {
        getInput$ui_kit_components_release().requestFocus();
        kli.c.d(getInput$ui_kit_components_release(), 0L);
    }

    public final void d0(TextView textView, long j2) {
        char c2;
        if (Intrinsics.f(textView, getWaveformSeekBarTimer())) {
            c2 = 0;
        } else if (!Intrinsics.f(textView, getTimerView())) {
            return;
        } else {
            c2 = 1;
        }
        long j3 = j2 / ((long) 1000);
        Long[] lArr = this.l0;
        if (lArr[c2].longValue() != j3) {
            lArr[c2] = Long.valueOf(j3);
            long j5 = 60;
            String str = String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3 / j5), Long.valueOf(j3 % j5)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView.setText(str);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f58475y = true;
        super.draw(canvas);
    }

    public final void e0() {
        Editable text = getInput$ui_kit_components_release().getText();
        getClear().setVisibility((text != null && text.length() > 0) && this.f58451e0 == c4.SEARCH ? 0 : 8);
    }

    public final void f0() {
        if (this.z0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iD = io0.a.d(0.1f, kli.a.s(R$attr.uikit_colorForeground, context));
            if (!isEnabled()) {
                iD = io0.a.b(0.5f, iD);
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iS = kli.a.s(R$attr.uikit_colorForeground, context2);
            DynamicInsetDrawable dynamicInsetDrawable = this.y0;
            Drawable drawable = dynamicInsetDrawable != null ? dynamicInsetDrawable.getDrawable() : null;
            RoundedBackgroundDrawable roundedBackgroundDrawable = drawable instanceof RoundedBackgroundDrawable ? (RoundedBackgroundDrawable) drawable : null;
            if (roundedBackgroundDrawable != null) {
                roundedBackgroundDrawable.d(iS, iD);
            }
            Drawable background = getStartButton().getBackground();
            RoundedBackgroundDrawable roundedBackgroundDrawable2 = background instanceof RoundedBackgroundDrawable ? (RoundedBackgroundDrawable) background : null;
            if (roundedBackgroundDrawable2 != null) {
                roundedBackgroundDrawable2.d(iS, iD);
            }
        }
    }

    public final void g0(oo0.a aVar) {
        AnimatedImageSwitcher playPauseInputActionView = getPlayPauseInputActionView();
        if (playPauseInputActionView.getInAnimation() == null) {
            playPauseInputActionView.setInAnimation(oq0.a.a());
            playPauseInputActionView.setOutAnimation(oq0.a.b());
            playPauseInputActionView.setAnimateFirstView(this.f58475y);
            playPauseInputActionView.setAnimateFirstView(true);
        }
        if (aVar == oo0.a.PLAYING || aVar == oo0.a.LOADING) {
            getPlayPauseInputActionView().setImage(K(R$drawable.uikit_icn_24_pause));
        } else {
            getPlayPauseInputActionView().setImage(K(R$drawable.uikit_icn_24_play));
        }
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getF53153g() {
        return this.analyticsContext;
    }

    /* JADX INFO: renamed from: getAttachmentCarouselView$ui_kit_components_release, reason: from getter */
    public final et0.p getAttachmentCarouselView() {
        return this.attachmentCarouselView;
    }

    @NotNull
    public final MaskedTextInputEditText getInput$ui_kit_components_release() {
        return (MaskedTextInputEditText) this.input.f();
    }

    @NotNull
    public final ConstraintLayout getInputContainer$ui_kit_components_release() {
        return (ConstraintLayout) this.inputContainer.f();
    }

    @NotNull
    public final String getInputText() {
        return String.valueOf(getInput$ui_kit_components_release().getText());
    }

    /* JADX INFO: renamed from: getReplyToView$ui_kit_components_release, reason: from getter */
    public final m4 getReplyToView() {
        return this.replyToView;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (!getFitsSystemWindows() && !((Boolean) jo0.g.f176835s.getValue()).booleanValue()) {
            WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(insets);
            Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
            return windowInsetsOnApplyWindowInsets;
        }
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
        int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
        Insets insets2 = windowInsetsCompat.getInsets(iSystemBars);
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), insets2.bottom);
        Insets insetsOf = Insets.of(insets2.left, insets2.top, insets2.right, 0);
        Intrinsics.checkNotNullExpressionValue(insetsOf, "of(...)");
        WindowInsets windowInsets = new WindowInsetsCompat.Builder(windowInsetsCompat).setInsets(iSystemBars, insetsOf).build().toWindowInsets();
        return windowInsets == null ? insets : windowInsets;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r0 = 1
            r2.f58472w0 = r0
            super.onLayout(r3, r4, r5, r6, r7)
            r3 = r2
            et0.p r4 = r3.attachmentCarouselView
            r5 = 0
            r6 = 8
            r7 = 0
            if (r4 == 0) goto L23
            int r1 = r4.getVisibility()
            if (r1 != r6) goto L17
            r1 = r0
            goto L18
        L17:
            r1 = r7
        L18:
            if (r1 != 0) goto L1b
            goto L1c
        L1b:
            r4 = r5
        L1c:
            if (r4 == 0) goto L23
            int r4 = r4.getHeight()
            goto L24
        L23:
            r4 = r7
        L24:
            r3.f58469t0 = r4
            mx0.m4 r4 = r3.replyToView
            if (r4 == 0) goto L3c
            int r1 = r4.getVisibility()
            if (r1 != r6) goto L31
            goto L32
        L31:
            r0 = r7
        L32:
            if (r0 != 0) goto L35
            r5 = r4
        L35:
            if (r5 == 0) goto L3c
            int r4 = r5.getHeight()
            goto L3d
        L3c:
            r4 = r7
        L3d:
            r3.f58467s0 = r4
            r3.f58472w0 = r7
            r2.a0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.ChatInputView.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009d, code lost:
    
        r0 = null;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            com.revolut.core.ui_kit.views.input.MaskedTextInputEditText r0 = r7.getInput$ui_kit_components_release()
            android.text.Layout r0 = r0.getLayout()
            boolean r1 = r7.z
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1b
            if (r0 == 0) goto L1b
            int r0 = r0.getLineCount()
            if (r0 <= r3) goto L1b
            r0 = r3
            goto L1c
        L1b:
            r0 = r2
        L1c:
            if (r0 == 0) goto L23
            boolean r1 = r7.A
            if (r1 != 0) goto L23
            goto L39
        L23:
            if (r0 != 0) goto Lb6
            com.revolut.core.ui_kit.views.input.MaskedTextInputEditText r1 = r7.getInput$ui_kit_components_release()
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L35
            int r1 = r1.length()
            if (r1 != 0) goto Lb6
        L35:
            boolean r1 = r7.A
            if (r1 == 0) goto Lb6
        L39:
            r7.A = r0
            int r1 = r7.C
            if (r0 == 0) goto L4f
            android.content.Context r4 = r7.getContext()
            java.lang.String r5 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r5 = 1111490560(0x42400000, float:48.0)
            int r4 = kli.a.k(r4, r5)
            goto L50
        L4f:
            r4 = r1
        L50:
            com.revolut.core.ui_kit.views.input.MaskedTextInputEditText r5 = r7.getInput$ui_kit_components_release()
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            java.lang.String r6 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r5 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r5
            r5.bottomMargin = r4
            r7.E(r3)
            if (r0 == 0) goto L68
            r0 = r2
            goto L73
        L68:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r7.getInputContainer$ui_kit_components_release()
            int r0 = r0.getMinHeight()
            int r1 = r1 * 2
            int r0 = r0 - r1
        L73:
            com.revolut.core.ui_kit.views.input.MaskedTextInputEditText r1 = r7.getInput$ui_kit_components_release()
            int r4 = r1.getMinHeight()
            if (r0 != r4) goto L7e
            goto L85
        L7e:
            r1.f59122m = r3
            r1.setMinHeight(r0)
            r1.f59122m = r2
        L85:
            com.revolut.core.ui_kit.views.input.MaskedTextInputEditText r0 = r7.getInput$ui_kit_components_release()
            r0.forceLayout()
            com.revolut.core.ui_kit.views.input.MaskedTextInputEditText r0 = r7.getInput$ui_kit_components_release()
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto L9c
            android.view.View r0 = (android.view.View) r0
            goto L9d
        L9c:
            r0 = r2
        L9d:
            if (r0 == 0) goto Lb3
            boolean r1 = r0.equals(r7)
            if (r1 != 0) goto Lb3
            r0.forceLayout()
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L9c
            android.view.View r0 = (android.view.View) r0
            goto L9d
        Lb3:
            super.onMeasure(r8, r9)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.ChatInputView.onMeasure(int, int):void");
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    public final void setAttachmentCarouselView$ui_kit_components_release(et0.p pVar) {
        this.attachmentCarouselView = pVar;
    }

    public final void setAttachments(List<? extends gw0.h> items, Function0<Unit> onEnd) {
        List<? extends gw0.h> list = items;
        if ((list == null || list.isEmpty()) && this.attachmentCarouselView == null) {
            if (onEnd != null) {
                onEnd.invoke();
                return;
            }
            return;
        }
        if (this.attachmentCarouselView == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            et0.p pVar = new et0.p(context, null, 6, 0);
            pVar.setId(View.generateViewId());
            pVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            pVar.setOnItemClickListener(new x3(this, 2));
            pVar.setOnCloseClickListener(new x3(this, 3));
            this.attachmentCarouselView = pVar;
            getTopContentWrapper().addView(this.attachmentCarouselView);
        }
        et0.p pVar2 = this.attachmentCarouselView;
        if (pVar2 != null) {
            pVar2.setModel(new et0.r(isLaidOut(), items, onEnd, new x3(this, 4)));
        }
    }

    public final void setBaseInputBackground(int color) {
        DynamicInsetDrawable dynamicInsetDrawable = this.y0;
        ShapeDrawable shapeDrawable = null;
        Drawable drawable = dynamicInsetDrawable != null ? dynamicInsetDrawable.getDrawable() : null;
        ShapeDrawable shapeDrawable2 = drawable instanceof ShapeDrawable ? (ShapeDrawable) drawable : null;
        if (shapeDrawable2 == null) {
            Drawable background = getInputContainer$ui_kit_components_release().getBackground();
            if (background instanceof ShapeDrawable) {
                shapeDrawable = (ShapeDrawable) background;
            }
        } else {
            shapeDrawable = shapeDrawable2;
        }
        if (shapeDrawable != null) {
            shapeDrawable.setTintMode(PorterDuff.Mode.SRC_OVER);
            shapeDrawable.getPaint().setColor(color);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        if (isEnabled() != enabled) {
            super.setEnabled(enabled);
            getInputContainer$ui_kit_components_release().setEnabled(enabled);
            getInput$ui_kit_components_release().setEnabled(enabled);
            getInput$ui_kit_components_release().setHintTextColor(enabled ? getInputHintEnabledColor() : getInputHintDisabledColor());
            AnimatedImageSwitcher[] animatedImageSwitcherArr = this.f58473x;
            int length = animatedImageSwitcherArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                animatedImageSwitcherArr[i].setVisibility((!enabled || this.j0[i2] == null) ? 8 : 0);
                i++;
                i2 = i3;
            }
            E(false);
            if (this.z0) {
                f0();
            }
        }
    }

    public final void setFixedState(@NotNull e4 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f0 = true;
        setState(state, false);
    }

    public final void setHeightListener$ui_kit_components_release(@NotNull r3 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.u0 = listener;
        x3 listener2 = new x3(this, 0);
        jq0.t tVar = this.f58446a0;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(listener2, "listener");
        tVar.d = listener2;
    }

    public final void setHint(@NotNull Clause hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        MaskedTextInputEditText input$ui_kit_components_release = getInput$ui_kit_components_release();
        ty0.c cVarB0 = or0.u.k(this).b0();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        input$ui_kit_components_release.setHint(ty0.c.a(cVarB0, hint, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE));
    }

    public final void setInnerStartIconAttr(Integer drawableRes) {
        int iIntValue = drawableRes != null ? drawableRes.intValue() : 0;
        if (this.B0 == iIntValue) {
            return;
        }
        this.B0 = iIntValue;
        ResourceImage resourceImage = iIntValue != 0 ? new ResourceImage(iIntValue, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null;
        ImageView innerStartIcon = getInnerStartIcon();
        yy0.f.e(or0.u.k(this).Q(), resourceImage, innerStartIcon, null, null, 12);
        if (resourceImage == null) {
            innerStartIcon.setVisibility(8);
        } else {
            innerStartIcon.setVisibility(this.C0 ? 4 : 0);
        }
        C();
        E(false);
    }

    public final void setInput(@NotNull Clause inputText) {
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        MaskedTextInputEditText.setTextSafely$default(getInput$ui_kit_components_release(), inputText, false, null, 4, null);
        e0();
        if (this.f58451e0 == c4.SEARCH) {
            MaskedTextInputEditText input$ui_kit_components_release = getInput$ui_kit_components_release();
            Editable text = getInput$ui_kit_components_release().getText();
            input$ui_kit_components_release.setSelection(text != null ? text.length() : 0);
        }
    }

    public final void setInputActions(@NotNull List<? extends b4> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        AnimatedImageSwitcher[] animatedImageSwitcherArr = this.f58473x;
        int iMax = Math.max(animatedImageSwitcherArr.length - actions.size(), 0);
        int length = animatedImageSwitcherArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            AnimatedImageSwitcher animatedImageSwitcher = animatedImageSwitcherArr[i];
            int i3 = i2 + 1;
            b4 b4Var = i2 < iMax ? null : (b4) d0.e0(i2 - iMax, actions);
            b4 b4Var2 = b4.RECORD_AUDIO;
            if (b4Var == b4Var2) {
                Intrinsics.checkNotNullParameter(animatedImageSwitcherArr, "<this>");
                if (i2 != animatedImageSwitcherArr.length - 1) {
                    throw new IllegalStateException(a0.d.r(kotlin.jvm.internal.o0.f186429a.b(b4Var2.getClass()).m(), " can only be set as the last action").toString());
                }
            }
            b4[] b4VarArr = this.j0;
            if (b4VarArr[i2] != b4Var) {
                b4VarArr[i2] = b4Var;
                B(animatedImageSwitcher, b4Var, false);
                int i5 = b4Var == null ? -1 : f4.d[b4Var.ordinal()];
                if (i5 == -1) {
                    or0.u.o(animatedImageSwitcher);
                    animatedImageSwitcher.setOnTouchListener(null);
                } else if (i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4) {
                    animatedImageSwitcher.setOnClickListener(new kp0.l(this, b4Var, 8));
                    animatedImageSwitcher.setOnTouchListener(null);
                } else {
                    if (i5 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    animatedImageSwitcher.setOnClickListener(new z3(this, 4));
                    animatedImageSwitcher.setOnTouchListener(getRecordAudioActionTouchListener());
                }
            }
            i++;
            i2 = i3;
        }
    }

    public final void setInputState(@NotNull a4 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        String str = state.f209576a;
        int i = state.f209578c;
        int i2 = state.f209577b;
        if (!Intrinsics.f(str, String.valueOf(getInput$ui_kit_components_release().getText()))) {
            setInput(new TextClause(state.f209576a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            Editable text = getInput$ui_kit_components_release().getText();
            int length = text != null ? text.length() : 0;
            getInput$ui_kit_components_release().setSelection(kotlin.ranges.f.g(i2, 0, length), kotlin.ranges.f.g(i, 0, length));
            return;
        }
        if (i2 == getInput$ui_kit_components_release().getSelectionStart() && i == getInput$ui_kit_components_release().getSelectionEnd()) {
            return;
        }
        Editable text2 = getInput$ui_kit_components_release().getText();
        int length2 = text2 != null ? text2.length() : 0;
        getInput$ui_kit_components_release().setSelection(kotlin.ranges.f.g(i2, 0, length2), kotlin.ranges.f.g(i, 0, length2));
    }

    public final void setMaxInputLength(int maxLength) {
        InputFilter[] filters = getInput$ui_kit_components_release().getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
        ArrayList arrayList = new ArrayList();
        for (InputFilter inputFilter : filters) {
            if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                arrayList.add(inputFilter);
            }
        }
        getInput$ui_kit_components_release().setFilters((InputFilter[]) d0.F0(new InputFilter.LengthFilter(maxLength), arrayList).toArray(new InputFilter[0]));
    }

    public final void setMaxInputLines(int maxLines) {
        getInput$ui_kit_components_release().setMaxLines(maxLines);
    }

    public final void setMode(@NotNull c4 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (this.f58451e0 == mode) {
            return;
        }
        this.f58451e0 = mode;
        F();
    }

    public final void setReflectiveSurfaceEnabled(boolean enabled) {
        if (this.z0 == enabled) {
            return;
        }
        this.z0 = enabled;
        D();
        I();
    }

    public final void setReplyContent(gw0.q state, Function0<Unit> onEnd) {
        if (state != null && this.replyToView == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            m4 m4Var = new m4(context, null, 6, 0);
            m4Var.setId(View.generateViewId());
            Context context2 = m4Var.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iK = kli.a.k(context2, 16.0f);
            Context context3 = m4Var.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            m4Var.setPaddingRelative(m4Var.getPaddingStart(), kli.a.k(context3, 12.0f), m4Var.getPaddingEnd(), m4Var.getPaddingBottom());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int i = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            layoutParams.setMarginStart(iK);
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i;
            layoutParams.setMarginEnd(iK);
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i2;
            m4Var.setLayoutParams(layoutParams);
            m4Var.setOnCloseClickListener(new y3(this, 0));
            m4Var.setHeightListener(new x3(this, 1));
            this.replyToView = m4Var;
            getTopContentWrapper().addView(this.replyToView, 0);
        }
        m4 m4Var2 = this.replyToView;
        if (m4Var2 != null) {
            m4Var2.setAnimate(isLaidOut());
            m4Var2.setContent(state, onEnd);
        } else if (onEnd != null) {
            onEnd.invoke();
        }
    }

    public final void setReplyToView$ui_kit_components_release(m4 m4Var) {
        this.replyToView = m4Var;
    }

    public final void setSpaciousLayoutEnabled(boolean enabled) {
        if (enabled == this.z) {
            return;
        }
        this.z = enabled;
        H();
    }

    public final void setStartButtonRotationEnabled(boolean enabled) {
        this.g0 = enabled;
        if (enabled) {
            return;
        }
        getStartButton().animate().cancel();
        getStartButton().setRotationX(BitmapDescriptorFactory.HUE_RED);
    }

    public final void setStartIconAttr(Integer drawableRes) {
        int iIntValue = drawableRes != null ? drawableRes.intValue() : 0;
        if (this.A0 == iIntValue) {
            return;
        }
        this.A0 = iIntValue;
        I();
    }

    public final void setState(@NotNull e4 state, boolean withAnimation) {
        Intrinsics.checkNotNullParameter(state, "state");
        ihm.b bVar = this.S;
        if (bVar.f() == state) {
            return;
        }
        getStartButton().setEnabled(false);
        int i = f4.f209695a[state.ordinal()];
        if (i == 1 || i == 2) {
            getStartButton().setEnabled(true);
            if (this.g0) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (jq0.a.a(context)) {
                    getStartButton().animate().rotationXBy(180.0f).setDuration(150L).start();
                }
            }
            MotionLayout root = getRoot();
            int i2 = R$id.textAndLeftButtonVisible;
            if (withAnimation) {
                root.transitionToState(i2);
            } else {
                root.jumpToState(i2);
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.g0) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                if (jq0.a.a(context2)) {
                    getStartButton().animate().rotationX(BitmapDescriptorFactory.HUE_RED).setDuration(150L).start();
                }
            }
            MotionLayout root2 = getRoot();
            int i3 = R$id.onlyTextVisible;
            if (withAnimation) {
                root2.transitionToState(i3);
            } else {
                root2.jumpToState(i3);
            }
        }
        bVar.onNext(state);
    }

    public final void setVoiceMessagesBlocked(boolean blocked) {
        if (this.p0 == blocked) {
            return;
        }
        this.p0 = blocked;
        if (blocked) {
            int i = f4.f209696b[this.f58448b0.ordinal()];
            if (i == 2) {
                Z(d4.IDLE, false);
                return;
            }
            if (i == 3 || i == 5) {
                urg.a aVar = this.m0;
                if (aVar != null) {
                    aVar.i3();
                } else {
                    Intrinsics.r("recordAudioViewModel");
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatInputView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatInputView(@NotNull Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.root = kli.a.J(R$id.chatInputView_root, this);
        this.input = kli.a.J(R$id.chatInputView_input, this);
        this.inputContainer = kli.a.J(R$id.chatInputView_inputContainer, this);
        this.startButton = kli.a.J(R$id.chatInputView_startIcon, this);
        this.innerStartIcon = kli.a.J(R$id.chatInputView_leftInnerIcon, this);
        this.recordAudioHoldHintView = kli.a.J(R$id.chatInputView_holdHint, this);
        this.clear = kli.a.J(R$id.chatInputView_clear, this);
        this.cancelHintView = kli.a.J(R$id.chatInputView_cancelHint, this);
        this.realtimeWaveformView = kli.a.J(R$id.chatInputView_realtimeWaveform, this);
        this.timerView = kli.a.J(R$id.chatInputView_timer, this);
        this.dotView = kli.a.J(R$id.chatInputView_dot, this);
        this.binInputActionView = kli.a.J(R$id.chatInputView_iconBin, this);
        this.playPauseInputActionView = kli.a.J(R$id.chatInputView_iconSwitcherPlayPause, this);
        this.waveformSeekBar = kli.a.J(R$id.chatInputView_waveformSeekBar, this);
        this.waveformSeekBarTimer = kli.a.J(R$id.chatInputView_waveformSeekBarTimer, this);
        this.topContentWrapper = kli.a.J(R$id.chatInputView_topContentWrapper, this);
        this.topGuideline = kli.a.J(R$id.topGuideline, this);
        this.endGuideline = kli.a.J(R$id.endGuideline, this);
        this.startGuideline = kli.a.J(R$id.startGuideline, this);
        this.C = kli.a.k(context, 8.0f);
        this.D = kli.a.k(context, 40.0f);
        this.E = kli.a.k(context, 8.0f);
        this.F = kli.a.k(context, 4.0f);
        this.G = kli.a.k(context, 8.0f);
        this.H = te0.w.y0(new lu0.a(context, 8));
        int i5 = 9;
        this.I = te0.w.y0(new lu0.a(context, i5));
        this.J = v0.a.d("create(...)");
        this.K = v0.a.d("create(...)");
        this.L = v0.a.d("create(...)");
        this.M = v0.a.d("create(...)");
        this.N = v0.a.d("create(...)");
        this.O = v0.a.d("create(...)");
        this.P = v0.a.d("create(...)");
        this.Q = v0.a.d("create(...)");
        this.R = v0.a.d("create(...)");
        ihm.b bVarE = ihm.b.e(e4.ONLY_TEXT);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.S = bVarE;
        this.U = te0.w.y0(new y3(this, 1));
        int i6 = 2;
        this.V = te0.w.y0(new y3(this, i6));
        this.f58446a0 = new jq0.t(this);
        d4 d4Var = d4.IDLE;
        this.f58448b0 = d4Var;
        ihm.b bVarE2 = ihm.b.e(d4Var);
        Intrinsics.checkNotNullExpressionValue(bVarE2, "createDefault(...)");
        this.c0 = bVarE2;
        od0.i.Companion.getClass();
        ihm.b bVarE3 = ihm.b.e(od0.i.f224256b);
        Intrinsics.checkNotNullExpressionValue(bVarE3, "createDefault(...)");
        this.f58450d0 = bVarE3;
        this.f58451e0 = c4.CHAT;
        this.g0 = true;
        this.f58454h0 = true;
        this.i0 = new a2(this, 5);
        Long[] lArr = new Long[2];
        for (int i21 = 0; i21 < 2; i21++) {
            lArr[i21] = -1L;
        }
        this.l0 = lArr;
        this.recordAudioActionTouchListener = yhm.j.b(new mhd.b(this, context, 25));
        this.E0 = new b0(this, 19);
        this.F0 = new c0(this, 20);
        this.G0 = new h4(this);
        iv0.s sVar = new iv0.s(kli.a.l(context, 20.0f), true);
        this.H0 = sVar;
        View.inflate(context, R$layout.internal_view_chat_input_layout, this);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setBackgroundColor(kli.a.s(R$attr.uikit_colorGroupedBackground, context2));
        getInput$ui_kit_components_release().addTextChangedListener(this.i0);
        getInput$ui_kit_components_release().a(new au0.m4(this, i5));
        getInput$ui_kit_components_release().setOnClickListener(new z3(this, i6));
        getInput$ui_kit_components_release().setOnEditorActionListener(new l4(this, 2));
        getInputContainer$ui_kit_components_release().setOnClickListener(new z3(this, 3));
        sVar.e.top = this.f58470v0;
        getInputContainer$ui_kit_components_release().setOutlineProvider(sVar);
        getInputContainer$ui_kit_components_release().setClipToOutline(true);
        View viewFindViewById = findViewById(R$id.chatInputView_iconSwitcher1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = findViewById(R$id.chatInputView_iconSwitcher2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        AnimatedImageSwitcher[] animatedImageSwitcherArr = {viewFindViewById, viewFindViewById2};
        this.f58473x = animatedImageSwitcherArr;
        this.j0 = new b4[2];
        for (int i22 = 0; i22 < 2; i22++) {
            NavBarContentCenterView navBarContentCenterView = animatedImageSwitcherArr[i22];
            navBarContentCenterView.setInAnimation(oq0.a.a());
            navBarContentCenterView.setOutAnimation(oq0.a.b());
            navBarContentCenterView.setAnimateFirstView(this.f58475y);
        }
        getStartButton().setOnClickListener(new z3(this, 6));
        getClear().setOnTouchListener(new j01.e(new View[]{getClear()}));
        ImageButton clear = getClear();
        or0.m.a(clear);
        clear.setOnClickListener(new r2(this, this, 17));
        MaskedTextInputEditText input$ui_kit_components_release = getInput$ui_kit_components_release();
        Intrinsics.checkNotNullParameter(input$ui_kit_components_release, "<this>");
        Paint.FontMetricsInt fontMetricsInt = input$ui_kit_components_release.getPaint().getFontMetricsInt();
        if (input$ui_kit_components_release.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
            i3 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.descent;
            i3 = fontMetricsInt.ascent;
        }
        this.B = input$ui_kit_components_release.getPaddingBottom() + input$ui_kit_components_release.getPaddingTop() + (i2 - i3);
        F();
        H();
    }

    public /* synthetic */ ChatInputView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
