package com.revolut.core.ui_kit.views.input;

import android.R;
import android.animation.ArgbEvaluator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.autofill.AutofillManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import au0.a2;
import au0.m4;
import au0.p2;
import aw0.o9;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.click.animator.ripple.StateListRippleDrawable;
import com.revolut.core.ui_kit.internal.drawables.CursorDrawable;
import com.revolut.core.ui_kit.internal.views.input.InputTextFieldContainer;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import e8.q;
import efm.r;
import efm.w;
import fp0.d;
import fp0.p;
import ihm.f;
import ix0.c0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jq0.k;
import kli.c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import mx0.c9;
import od0.g;
import or0.m;
import or0.u;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import qv0.h;
import rx0.a;
import rx0.j;
import rx0.l;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0007\u0018\u0000 \u0088\u00022\u00020\u0001:\t\u0089\u0002o<i\u008a\u0002\u008b\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u0011J\r\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010\u0011J\u0015\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0006¢\u0006\u0004\b&\u0010\u0011J\u0015\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020\n¢\u0006\u0004\b(\u0010\u000eJ\u0015\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\b*\u0010\u0011J\u0015\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0006¢\u0006\u0004\b,\u0010\u0011J\u0015\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020\n¢\u0006\u0004\b.\u0010\u000eJ\u0017\u00100\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b3\u00101J\u000f\u00104\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\f2\b\u00107\u001a\u0004\u0018\u000106H\u0007¢\u0006\u0004\b8\u00109J\u0017\u00108\u001a\u00020\f2\b\u00107\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b8\u0010:J\u001f\u0010>\u001a\u00020\f2\b\u0010;\u001a\u0004\u0018\u00010\u00152\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b@\u00105J\u0019\u0010B\u001a\u00020\f2\b\u0010A\u001a\u0004\u0018\u000106H\u0007¢\u0006\u0004\bB\u00109J\u0017\u0010B\u001a\u00020\f2\b\u0010A\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\bB\u0010:J\u0017\u0010D\u001a\u00020\f2\b\u0010C\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\bD\u0010:J\u0017\u0010E\u001a\u00020\f2\b\u0010C\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\bE\u0010:J\u0015\u0010G\u001a\u00020\f2\u0006\u0010F\u001a\u00020\n¢\u0006\u0004\bG\u0010\u000eJ\u0015\u0010I\u001a\u00020\f2\u0006\u0010H\u001a\u00020\n¢\u0006\u0004\bI\u0010\u000eJ\u0017\u0010K\u001a\u00020\f2\u0006\u0010J\u001a\u00020\nH\u0016¢\u0006\u0004\bK\u0010\u000eJ\u0017\u0010L\u001a\u00020\f2\u0006\u0010-\u001a\u00020\nH\u0016¢\u0006\u0004\bL\u0010\u000eJ\u0015\u0010N\u001a\u00020\f2\u0006\u0010M\u001a\u00020\n¢\u0006\u0004\bN\u0010\u000eJ\u0015\u0010P\u001a\u00020\f2\u0006\u0010O\u001a\u00020\n¢\u0006\u0004\bP\u0010\u000eJ\u0017\u0010R\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\nH\u0016¢\u0006\u0004\bR\u0010\u000eJ\u0019\u0010S\u001a\u00020\f2\b\u0010=\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bS\u00101J'\u0010V\u001a\u00020\f2\u0016\u0010U\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001060T\"\u0004\u0018\u000106H\u0007¢\u0006\u0004\bV\u0010WJ\u001b\u0010[\u001a\u00020\f2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0X¢\u0006\u0004\b[\u0010\\J\u0017\u0010_\u001a\u00020\f2\b\u0010^\u001a\u0004\u0018\u00010]¢\u0006\u0004\b_\u0010`J\u0017\u0010c\u001a\u00020\f2\b\u0010b\u001a\u0004\u0018\u00010a¢\u0006\u0004\bc\u0010dJ\u0015\u0010f\u001a\u00020\f2\u0006\u0010e\u001a\u00020\n¢\u0006\u0004\bf\u0010\u000eJ\u0015\u0010h\u001a\u00020\f2\u0006\u0010g\u001a\u00020\n¢\u0006\u0004\bh\u0010\u000eJ\u0015\u0010k\u001a\u00020\f2\u0006\u0010j\u001a\u00020i¢\u0006\u0004\bk\u0010lJ\u0017\u0010n\u001a\u00020\f2\b\u0010m\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\bn\u0010:J\u0017\u0010q\u001a\u00020\f2\b\u0010p\u001a\u0004\u0018\u00010o¢\u0006\u0004\bq\u0010rJ\u0017\u0010t\u001a\u00020\f2\b\u0010s\u001a\u0004\u0018\u000106¢\u0006\u0004\bt\u00109J\u0017\u0010v\u001a\u00020\f2\u0006\u0010-\u001a\u00020\nH\u0000¢\u0006\u0004\bu\u0010\u000eJ\u0017\u0010x\u001a\u00020\f2\u0006\u0010w\u001a\u00020\nH\u0002¢\u0006\u0004\bx\u0010\u000eJ\u0017\u0010y\u001a\u00020\f2\u0006\u0010F\u001a\u00020\nH\u0002¢\u0006\u0004\by\u0010\u000eR\u001b\u0010\u007f\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R \u0010\u0084\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0081\u0001\u0010|\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R \u0010\u0087\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0085\u0001\u0010|\u001a\u0006\b\u0086\u0001\u0010\u0083\u0001R \u0010\u008a\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0088\u0001\u0010|\u001a\u0006\b\u0089\u0001\u0010\u0083\u0001R \u0010\u008f\u0001\u001a\u00030\u008b\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008c\u0001\u0010|\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R \u0010\u0092\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0090\u0001\u0010|\u001a\u0006\b\u0091\u0001\u0010\u0083\u0001R \u0010\u0097\u0001\u001a\u00030\u0093\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0094\u0001\u0010|\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R \u0010\u009a\u0001\u001a\u00030\u0093\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0098\u0001\u0010|\u001a\u0006\b\u0099\u0001\u0010\u0096\u0001R \u0010\u009d\u0001\u001a\u00030\u0093\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009b\u0001\u0010|\u001a\u0006\b\u009c\u0001\u0010\u0096\u0001R \u0010 \u0001\u001a\u00030\u0093\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009e\u0001\u0010|\u001a\u0006\b\u009f\u0001\u0010\u0096\u0001R \u0010¥\u0001\u001a\u00030¡\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¢\u0001\u0010|\u001a\u0006\b£\u0001\u0010¤\u0001R \u0010ª\u0001\u001a\u00030¦\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b§\u0001\u0010|\u001a\u0006\b¨\u0001\u0010©\u0001R \u0010\u00ad\u0001\u001a\u00030¦\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b«\u0001\u0010|\u001a\u0006\b¬\u0001\u0010©\u0001R \u0010°\u0001\u001a\u00030¦\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b®\u0001\u0010|\u001a\u0006\b¯\u0001\u0010©\u0001R \u0010µ\u0001\u001a\u00030±\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b²\u0001\u0010|\u001a\u0006\b³\u0001\u0010´\u0001R \u0010º\u0001\u001a\u00030¶\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b·\u0001\u0010|\u001a\u0006\b¸\u0001\u0010¹\u0001R \u0010½\u0001\u001a\u00030¶\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b»\u0001\u0010|\u001a\u0006\b¼\u0001\u0010¹\u0001R1\u0010Ä\u0001\u001a\u00020\n2\u0007\u0010¾\u0001\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b¿\u0001\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0005\bÃ\u0001\u0010\u000eR0\u0010É\u0001\u001a\u00020\u00062\u0007\u0010¾\u0001\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0005\bÇ\u0001\u0010\u001d\"\u0005\bÈ\u0001\u0010\u0011R8\u0010Ñ\u0001\u001a\u0005\u0018\u00010Ê\u00012\n\u0010¾\u0001\u001a\u0005\u0018\u00010Ê\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R8\u0010Õ\u0001\u001a\u0005\u0018\u00010Ê\u00012\n\u0010¾\u0001\u001a\u0005\u0018\u00010Ê\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÒ\u0001\u0010Ì\u0001\u001a\u0006\bÓ\u0001\u0010Î\u0001\"\u0006\bÔ\u0001\u0010Ð\u0001R4\u0010Ý\u0001\u001a\u00030Ö\u00012\b\u0010¾\u0001\u001a\u00030Ö\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b×\u0001\u0010Ø\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R8\u0010á\u0001\u001a\u0005\u0018\u00010Ê\u00012\n\u0010¾\u0001\u001a\u0005\u0018\u00010Ê\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÞ\u0001\u0010Ì\u0001\u001a\u0006\bß\u0001\u0010Î\u0001\"\u0006\bà\u0001\u0010Ð\u0001R1\u0010å\u0001\u001a\u00020\n2\u0007\u0010¾\u0001\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\bâ\u0001\u0010À\u0001\u001a\u0006\bã\u0001\u0010Â\u0001\"\u0005\bä\u0001\u0010\u000eR\u001f\u0010é\u0001\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bæ\u0001\u0010ç\u0001\u001a\u0005\bè\u0001\u0010\u001dR!\u0010î\u0001\u001a\u00030ê\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bë\u0001\u0010ç\u0001\u001a\u0006\bì\u0001\u0010í\u0001R\u001f\u0010ñ\u0001\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bï\u0001\u0010ç\u0001\u001a\u0005\bð\u0001\u0010\u001dR!\u0010ô\u0001\u001a\u00030ê\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bò\u0001\u0010ç\u0001\u001a\u0006\bó\u0001\u0010í\u0001R!\u0010ù\u0001\u001a\u00030õ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bö\u0001\u0010ç\u0001\u001a\u0006\b÷\u0001\u0010ø\u0001R!\u0010ü\u0001\u001a\u00030õ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bú\u0001\u0010ç\u0001\u001a\u0006\bû\u0001\u0010ø\u0001R!\u0010\u0081\u0002\u001a\u00030ý\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bþ\u0001\u0010ç\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002R\u0013\u0010\u0083\u0002\u001a\u00020z8F¢\u0006\u0007\u001a\u0005\b\u0082\u0002\u0010~R\u0017\u0010\u0085\u0002\u001a\u00020\n8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0084\u0002\u0010Â\u0001R\u0017\u0010\u0087\u0002\u001a\u00020\n8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0086\u0002\u0010Â\u0001¨\u0006\u008c\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/views/input/InputText;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "inputBackgroundVisible", "", "setInputBackgroundVisible", "(Z)V", "textColor", "setUnfocusedLabelColor", "(I)V", "", "getText", "()Ljava/lang/CharSequence;", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "keepStyle", "setText", "(Lcom/revolut/core/ui_kit/models/Clause;Z)V", "index", "setSelection", "getSelectionStart", "()I", "getSelectionEnd", "inputType", "setInputType", "Landroid/text/method/TransformationMethod;", "transformationMethod", "setTransformationMethod", "(Landroid/text/method/TransformationMethod;)V", "imeOptions", "setImeOptions", "singleLine", "setSingleLine", "maxLines", "setMaxLines", "minLines", "setMinLines", "enabled", "setSharingEnabled", "maxLength", "setCounterMaxLength", "(Ljava/lang/Integer;)V", "counterBaseValue", "setCounterBaseValue", "getLabel", "()Lcom/revolut/core/ui_kit/models/Clause;", "", "label", "setLabel", "(Ljava/lang/String;)V", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "placeholder", "Lrx0/j;", "mode", "setPlaceholder", "(Lcom/revolut/core/ui_kit/models/Clause;Lrx0/j;)V", "getPlaceholder", "helperText", "setHelperText", "textClause", "setPrefixText", "setSuffixText", "error", "setError", "enable", "setCounterEnable", "activated", "setActivated", "setEnabled", "mainIconEnabled", "setMainIconEnabled", "secondaryIconEnabled", "setSecondaryIconEnabled", "focusable", "setFocusable", "setTextIsImportantForAutofill", "", "autofillHints", "setTextAutofillHints", "([Ljava/lang/String;)V", "", "Landroid/text/InputFilter;", "filters", "setInputFilters", "(Ljava/util/List;)V", "Landroid/widget/TextView$OnEditorActionListener;", "listener", "setOnEditorActionListener", "(Landroid/widget/TextView$OnEditorActionListener;)V", "Lyz0/b;", "maskingDelegate", "setMaskingDelegate", "(Lyz0/b;)V", "isVisible", "setProgressBarVisible", "scrollable", "setScrollable", "Lrx0/f;", "backgroundStateList", "setBackgroundStateList", "(Lrx0/f;)V", "description", "setCustomContentDescription", "Lrx0/k;", "tags", "setTags", "(Lrx0/k;)V", "e2eTestsCustomId", "setE2ETestsCustomId", "setHorizontalPaddingEnabled$ui_kit_components_release", "setHorizontalPaddingEnabled", "labelAtTop", "setPrefixIconAlpha", "setInputLengthError", "Lcom/revolut/core/ui_kit/views/input/MaskedTextInputEditText;", "b", "Le8/q;", "getTextInputEditText", "()Lcom/revolut/core/ui_kit/views/input/MaskedTextInputEditText;", "textInputEditText", "Landroid/widget/ImageView;", "f", "getQuickClearIconView", "()Landroid/widget/ImageView;", "quickClearIconView", "g", "getMainIconView", "mainIconView", "h", "getSecondaryIconView", "secondaryIconView", "Landroid/widget/ProgressBar;", "i", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar", "j", "getPrefixIcon", "prefixIcon", "Landroidx/appcompat/widget/AppCompatTextView;", "k", "getPrefixText", "()Landroidx/appcompat/widget/AppCompatTextView;", "prefixText", "l", "getSuffixText", "suffixText", "m", "getHelperTextStart", "helperTextStart", "n", "getHelperTextEnd", "helperTextEnd", "Lcom/revolut/core/ui_kit/internal/views/input/InputTextFieldContainer;", "o", "getFieldContainer", "()Lcom/revolut/core/ui_kit/internal/views/input/InputTextFieldContainer;", "fieldContainer", "Landroid/view/View;", "s", "getStartPaddingView", "()Landroid/view/View;", "startPaddingView", "t", "getLabelBarrier", "labelBarrier", "u", "getIconsContainer", "iconsContainer", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "v", "getInputTextShimmer", "()Lcom/facebook/shimmer/ShimmerFrameLayout;", "inputTextShimmer", "Lcom/revolut/core/ui_kit/internal/views/tag/TagView;", "w", "getTagFirst", "()Lcom/revolut/core/ui_kit/internal/views/tag/TagView;", "tagFirst", "x", "getTagSecond", "tagSecond", "value", "Q", "Z", "getShowSystemKeyboardOnFocus", "()Z", "setShowSystemKeyboardOnFocus", "showSystemKeyboardOnFocus", "R", "I", "getUiKitInputType", "setUiKitInputType", "uiKitInputType", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "S", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "getMainIconImage", "()Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "setMainIconImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "mainIconImage", "T", "getPrefixIconImage", "setPrefixIconImage", "prefixIconImage", "Lcom/revolut/core/ui_kit/views/input/InputText$a$a;", "U", "Lcom/revolut/core/ui_kit/views/input/InputText$a$a;", "getPrefixIconMode", "()Lcom/revolut/core/ui_kit/views/input/InputText$a$a;", "setPrefixIconMode", "(Lcom/revolut/core/ui_kit/views/input/InputText$a$a;)V", "prefixIconMode", "V", "getSecondaryIconImage", "setSecondaryIconImage", "secondaryIconImage", "W", "getEnableQuickClear", "setEnableQuickClear", "enableQuickClear", "c0", "Lkotlin/Lazy;", "getFocusedColor", "focusedColor", "Landroid/content/res/ColorStateList;", "d0", "getFocusedColorStateList", "()Landroid/content/res/ColorStateList;", "focusedColorStateList", "h0", "getErrorColor", "errorColor", "i0", "getErrorColorStateList", "errorColorStateList", "Landroidx/dynamicanimation/animation/SpringAnimation;", "p0", "getLabelScaleSpringAnimation", "()Landroidx/dynamicanimation/animation/SpringAnimation;", "labelScaleSpringAnimation", "q0", "getLabelPositionSpringAnimation", "labelPositionSpringAnimation", "", "A0", "getLabelUnfocusedFontSize", "()F", "labelUnfocusedFontSize", "getInnerEditText", "innerEditText", "getHasHelperError", "hasHelperError", "getShouldFadePrefixIcon", "shouldFadePrefixIcon", "Companion", "a", "rx0/i", "SavedState", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InputText extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final TransitionSet G0;
    public final f A;

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    public final Lazy labelUnfocusedFontSize;
    public StaticLayout B;
    public final float B0;
    public Integer C;
    public final float C0;
    public Integer D;
    public final TextPaint D0;
    public boolean E;
    public final HashMap E0;
    public Clause F;
    public boolean F0;
    public Clause G;
    public Clause H;
    public j I;
    public boolean J;
    public String K;
    public String L;
    public boolean M;
    public String N;
    public boolean O;
    public boolean P;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public boolean showSystemKeyboardOnFocus;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public int uiKitInputType;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public Image mainIconImage;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public Image prefixIconImage;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public Companion.AbstractC0443a prefixIconMode;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public Image secondaryIconImage;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public boolean enableQuickClear;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f59085a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q textInputEditText;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f59087b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f59088d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final ArgbEvaluator f59089e0;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q quickClearIconView;
    public int f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q mainIconView;
    public final int g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final q secondaryIconView;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f59092h0;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final q progressBar;
    public final Object i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final q prefixIcon;
    public final f j0;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final q prefixText;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f59094k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final q suffixText;
    public float l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final q helperTextStart;
    public Boolean m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final q helperTextEnd;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final FloatValueHolder f59098n0;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final q fieldContainer;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final FloatValueHolder f59099o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f59100p;
    public final Object p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public StateListRippleDrawable f59101q;
    public final Object q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f59102r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public SpringAnimation f59103r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final q startPaddingView;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f59105s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final q labelBarrier;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final a f59107t0;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final q iconsContainer;
    public final f u0;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final q inputTextShimmer;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final p f59108v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final q tagFirst;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Clause f59110w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final q tagSecond;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Clause f59112x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f f59113y;
    public final l y0;
    public final f z;
    public final float z0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/views/input/InputText$SavedState;", "Landroid/view/View$BaseSavedState;", "Companion", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SparseArray f59114a;

        @NotNull
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(source, "source");
                SavedState savedState = new SavedState(source);
                savedState.f59114a = source.readSparseArray(SavedState.class.getClassLoader());
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            super.writeToParcel(out, i);
            out.writeSparseArray(this.f59114a);
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.input.InputText$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.input.InputText$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0443a {

            /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.input.InputText$a$a$a, reason: collision with other inner class name */
            public static final class C0444a extends AbstractC0443a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0444a f59115a = new C0444a();

                private C0444a() {
                }
            }

            private AbstractC0443a() {
            }

            /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.input.InputText$a$a$b */
            public static final class b extends AbstractC0443a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f59116a;

                public b(boolean z) {
                    this.f59116a = z;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof b) && this.f59116a == ((b) obj2).f59116a;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f59116a);
                }

                public b() {
                    this(false);
                }
            }
        }

        private Companion() {
        }

        public static final d a(Companion companion) {
            companion.getClass();
            return new d(new Color.Solid(R$attr.uikit_colorForeground), new Color.Solid(R$attr.uikit_colorSearchBackground), false);
        }
    }

    public static final class b extends ActionMode.Callback2 {
        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            if (menu != null) {
                menu.removeItem(R.id.cut);
            }
            if (menu != null) {
                menu.removeItem(R.id.copy);
            }
            if (menu != null) {
                menu.removeItem(R.id.shareText);
            }
            if (menu != null) {
                menu.removeItem(R.id.selectAll);
            }
            if (menu == null) {
                return true;
            }
            menu.removeItem(R.id.selectTextMode);
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    static {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new Fade(2));
        transitionSet.addTransition(new Fade(1));
        transitionSet.setInterpolator((TimeInterpolator) new AccelerateDecelerateInterpolator());
        transitionSet.setDuration(200L);
        G0 = transitionSet;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputText(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static float f0(InputText inputText) {
        return inputText.getTextInputEditText().getLayout().getPaint().getTextSize();
    }

    public static void g0(InputText inputText) {
        inputText.getTextInputEditText().setText("");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getErrorColor() {
        return ((Number) this.f59092h0.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ColorStateList getErrorColorStateList() {
        return (ColorStateList) this.i0.getValue();
    }

    private final InputTextFieldContainer getFieldContainer() {
        return (InputTextFieldContainer) this.fieldContainer.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getFocusedColor() {
        return ((Number) this.c0.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ColorStateList getFocusedColorStateList() {
        return (ColorStateList) this.f59088d0.getValue();
    }

    private final boolean getHasHelperError() {
        return this.f59087b0 || this.f59085a0;
    }

    private final AppCompatTextView getHelperTextEnd() {
        return (AppCompatTextView) this.helperTextEnd.f();
    }

    private final AppCompatTextView getHelperTextStart() {
        return (AppCompatTextView) this.helperTextStart.f();
    }

    private final View getIconsContainer() {
        return this.iconsContainer.f();
    }

    private final ShimmerFrameLayout getInputTextShimmer() {
        return (ShimmerFrameLayout) this.inputTextShimmer.f();
    }

    private final View getLabelBarrier() {
        return this.labelBarrier.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final SpringAnimation getLabelPositionSpringAnimation() {
        return (SpringAnimation) this.q0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final SpringAnimation getLabelScaleSpringAnimation() {
        return (SpringAnimation) this.p0.getValue();
    }

    private final float getLabelUnfocusedFontSize() {
        return ((Number) this.labelUnfocusedFontSize.getValue()).floatValue();
    }

    private final ImageView getMainIconView() {
        return (ImageView) this.mainIconView.f();
    }

    private final ImageView getPrefixIcon() {
        return (ImageView) this.prefixIcon.f();
    }

    private final AppCompatTextView getPrefixText() {
        return (AppCompatTextView) this.prefixText.f();
    }

    private final ProgressBar getProgressBar() {
        return (ProgressBar) this.progressBar.f();
    }

    private final ImageView getQuickClearIconView() {
        return (ImageView) this.quickClearIconView.f();
    }

    private final ImageView getSecondaryIconView() {
        return (ImageView) this.secondaryIconView.f();
    }

    private final boolean getShouldFadePrefixIcon() {
        return this.L.length() > 0 && this.prefixIconImage != null && this.G != null && (this.prefixIconMode instanceof Companion.AbstractC0443a.C0444a);
    }

    private final View getStartPaddingView() {
        return this.startPaddingView.f();
    }

    private final AppCompatTextView getSuffixText() {
        return (AppCompatTextView) this.suffixText.f();
    }

    private final TagView getTagFirst() {
        return (TagView) this.tagFirst.f();
    }

    private final TagView getTagSecond() {
        return (TagView) this.tagSecond.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MaskedTextInputEditText getTextInputEditText() {
        return (MaskedTextInputEditText) this.textInputEditText.f();
    }

    public static Unit h0(InputText inputText, float f) {
        inputText.l0 = f;
        if (inputText.L.length() > 0) {
            inputText.getTextInputEditText().setAlpha(kotlin.ranges.f.f(f, 1.0E-6f, 1.0f));
            inputText.getPrefixText().setAlpha(kotlin.ranges.f.f(f, BitmapDescriptorFactory.HUE_RED, 1.0f));
            inputText.getSuffixText().setAlpha(kotlin.ranges.f.f(f, BitmapDescriptorFactory.HUE_RED, 1.0f));
        }
        if (inputText.getShouldFadePrefixIcon()) {
            inputText.getPrefixIcon().setAlpha(kotlin.ranges.f.f(f, BitmapDescriptorFactory.HUE_RED, 1.0f));
        } else {
            inputText.getPrefixIcon().setAlpha(1.0f);
        }
        inputText.getFieldContainer().postInvalidateOnAnimation();
        return Unit.f186387a;
    }

    public static Unit i0(InputText inputText) {
        if (inputText.getLayoutParams().width == -2) {
            inputText.getTextInputEditText().requestLayout();
        }
        return Unit.f186387a;
    }

    public static void j0(InputText inputText, boolean z) {
        CharSequence text;
        if (z) {
            inputText.F0();
        }
        if (!inputText.isActivated()) {
            inputText.getFieldContainer().setActivated(z);
        }
        inputText.L0(true, Boolean.valueOf(z));
        Companion.AbstractC0443a abstractC0443a = inputText.prefixIconMode;
        Companion.AbstractC0443a.b bVar = abstractC0443a instanceof Companion.AbstractC0443a.b ? (Companion.AbstractC0443a.b) abstractC0443a : null;
        if (bVar != null && bVar.f59116a) {
            inputText.getPrefixIcon().setVisibility((inputText.prefixIconImage == null || !z) ? 8 : 0);
        }
        yz0.b maskingDelegate = inputText.getTextInputEditText().getMaskingDelegate();
        if (maskingDelegate == null || (text = maskingDelegate.e()) == null) {
            text = inputText.getTextInputEditText().getText();
        }
        inputText.M0(z, text);
        inputText.j0.onNext(Boolean.valueOf(z));
        if (z) {
            p pVar = inputText.f59108v0;
            View view = pVar.f137029a;
            if (view.isPressed()) {
                return;
            }
            view.setPressed(true);
            fp0.l lVar = pVar.f137032g;
            if (lVar != null) {
                view.removeCallbacks(lVar);
            }
            fp0.l lVar2 = new fp0.l(pVar, 0);
            pVar.f137032g = lVar2;
            view.postDelayed(lVar2, 200L);
        }
    }

    public static void l0(InputText inputText) {
        inputText.getTextInputEditText().requestFocus();
        if (inputText.showSystemKeyboardOnFocus) {
            c.f(inputText.getTextInputEditText());
        }
    }

    public static Unit m0(InputText inputText, float f) {
        inputText.f59094k0 = f;
        inputText.getFieldContainer().postInvalidateOnAnimation();
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n0(com.revolut.core.ui_kit.views.input.InputText r10, android.graphics.Canvas r11) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.input.InputText.n0(com.revolut.core.ui_kit.views.input.InputText, android.graphics.Canvas):void");
    }

    public static final boolean p0(InputText inputText) {
        MaskedTextInputEditText textInputEditText = inputText.getTextInputEditText();
        return textInputEditText.canScrollHorizontally(-1) || textInputEditText.canScrollHorizontally(1) || textInputEditText.canScrollVertically(-1) || textInputEditText.canScrollVertically(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInputLengthError(boolean error) {
        if (this.f59087b0 == error) {
            return;
        }
        this.f59087b0 = error;
        getFieldContainer().setError(getHasHelperError());
        H0();
        E0();
        if (getTextInputEditText().hasFocus()) {
            F0();
        }
        P0();
    }

    private final void setPrefixIconAlpha(boolean labelAtTop) {
        if (getShouldFadePrefixIcon()) {
            getPrefixIcon().setAlpha(labelAtTop ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        } else {
            getPrefixIcon().setAlpha(1.0f);
        }
    }

    public static /* synthetic */ void setText$default(InputText inputText, Clause clause, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = false;
        }
        inputText.setText(clause, z);
    }

    public static SpringAnimation t0(FloatValueHolder floatValueHolder, Function1 function1) {
        SpringAnimation springAnimation = new SpringAnimation(floatValueHolder);
        SpringForce springForce = new SpringForce();
        springForce.setStiffness(300.0f);
        springForce.setDampingRatio(37.0f / (2 * ((float) Math.sqrt(300.0f))));
        springAnimation.setSpring(springForce);
        springAnimation.setMinimumVisibleChange(0.001f);
        springAnimation.addUpdateListener(new k(function1, 1));
        return springAnimation;
    }

    public final void A0(PhoneNumberFormattingTextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "textWatcher");
        MaskedTextInputEditText textInputEditText = getTextInputEditText();
        textInputEditText.getClass();
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        textInputEditText.u.remove(watcher);
    }

    public final void B0() {
        AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            autofillManager.requestAutofill(getTextInputEditText());
        }
    }

    public final void C0(boolean z) {
        if (z) {
            post(new a(this, 0));
            return;
        }
        getTextInputEditText().requestFocus();
        if (this.showSystemKeyboardOnFocus) {
            c.d(getTextInputEditText(), 0L);
        }
    }

    public final void D0() {
        yz0.b maskingDelegate = getTextInputEditText().getMaskingDelegate();
        if (maskingDelegate != null) {
            maskingDelegate.a();
        }
    }

    public final void E0() {
        String strValueOf;
        boolean z = (getHelperTextEnd().getVisibility() == 0) != this.E;
        if (z) {
            ViewParent parent = getParent();
            while (true) {
                if (parent == null) {
                    TransitionManager.beginDelayedTransition(this, G0);
                    break;
                } else if ((parent instanceof RecyclerView) && ((RecyclerView) parent).isComputingLayout()) {
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        if (this.E) {
            Integer num = this.D;
            int length = getTextInputEditText().length() + (num != null ? num.intValue() : 0);
            Integer num2 = this.C;
            AppCompatTextView helperTextEnd = getHelperTextEnd();
            if (num2 != null) {
                strValueOf = length + "/" + num2;
            } else {
                strValueOf = String.valueOf(length);
            }
            helperTextEnd.setText(strValueOf);
            getHelperTextEnd().setTextColor(getHasHelperError() ? getErrorColorStateList() : getFocusedColorStateList());
        } else if (!z) {
            getHelperTextEnd().setText((CharSequence) null);
        }
        getHelperTextEnd().setVisibility(this.E ? 0 : 8);
    }

    public final void F0() {
        if (getHasHelperError()) {
            CursorDrawable.a aVar = com.revolut.core.ui_kit.internal.drawables.a.f56028a;
            int errorColor = getErrorColor();
            com.revolut.core.ui_kit.internal.drawables.a.f56028a.f55949a = errorColor;
            com.revolut.core.ui_kit.internal.drawables.a.f56029b.f56020a = errorColor;
            return;
        }
        CursorDrawable.a aVar2 = com.revolut.core.ui_kit.internal.drawables.a.f56028a;
        int focusedColor = getFocusedColor();
        com.revolut.core.ui_kit.internal.drawables.a.f56028a.f55949a = focusedColor;
        com.revolut.core.ui_kit.internal.drawables.a.f56029b.f56020a = focusedColor;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G0() {
        /*
            r4 = this;
            com.revolut.core.ui_kit.internal.views.input.InputTextFieldContainer r0 = r4.getFieldContainer()
            com.revolut.core.ui_kit.views.input.MaskedTextInputEditText r1 = r4.getTextInputEditText()
            android.text.Editable r1 = r1.getText()
            r2 = 0
            if (r1 == 0) goto L20
            boolean r3 = kotlin.text.d0.W(r1)
            if (r3 != 0) goto L16
            goto L17
        L16:
            r1 = r2
        L17:
            if (r1 == 0) goto L20
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L20
            goto L50
        L20:
            com.revolut.core.ui_kit.views.input.MaskedTextInputEditText r1 = r4.getTextInputEditText()
            java.lang.CharSequence r1 = r1.getHint()
            if (r1 == 0) goto L39
            boolean r3 = kotlin.text.d0.W(r1)
            if (r3 != 0) goto L31
            goto L32
        L31:
            r1 = r2
        L32:
            if (r1 == 0) goto L39
            java.lang.String r1 = r1.toString()
            goto L50
        L39:
            java.lang.String r1 = r4.L
            boolean r3 = kotlin.text.d0.W(r1)
            if (r3 != 0) goto L42
            goto L43
        L42:
            r1 = r2
        L43:
            if (r1 == 0) goto L46
            goto L50
        L46:
            java.lang.String r1 = r4.K
            boolean r3 = kotlin.text.d0.W(r1)
            if (r3 != 0) goto L4f
            r2 = r1
        L4f:
            r1 = r2
        L50:
            r0.setContentDescription(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.input.InputText.G0():void");
    }

    public final void H0() {
        Float fValueOf = Float.valueOf(12.0f);
        Clause clause = this.F;
        boolean z = clause != null;
        boolean z3 = (getHelperTextStart().getVisibility() == 0) != z;
        getHelperTextStart().setMovementMethod(c0.f169220a);
        if (z3) {
            ViewParent parent = getParent();
            while (true) {
                if (parent == null) {
                    TransitionManager.beginDelayedTransition(this, G0);
                    break;
                } else if ((parent instanceof RecyclerView) && ((RecyclerView) parent).isComputingLayout()) {
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (getHasHelperError()) {
                ty0.c cVarB0 = u.k(this).b0();
                ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_16_exclamation_mark_outline, Integer.valueOf(R$attr.uikit_colorStatusDanger), fValueOf, fValueOf, 16);
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                spannableStringBuilder.append((CharSequence) ty0.c.a(cVarB0, imageClause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE));
                spannableStringBuilder.append((CharSequence) " ");
            }
            ty0.c cVarB02 = u.k(this).b0();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            spannableStringBuilder.append((CharSequence) ty0.c.a(cVarB02, clause, context2, new rnb.u(1, this.f59113y, ihm.k.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 11), null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
            getHelperTextStart().setText(spannableStringBuilder);
            getHelperTextStart().setTextColor(getHasHelperError() ? getErrorColorStateList() : getFocusedColorStateList());
        } else if (!z3) {
            getHelperTextStart().setText((CharSequence) null);
        }
        getHelperTextStart().setVisibility(z ? 0 : 8);
    }

    public final void I0() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, this.L.length() == 0 ? 16.0f : 26.0f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK2 = kli.a.k(context2, this.L.length() != 0 ? 8.0f : 16.0f);
        getTextInputEditText().setPadding(getTextInputEditText().getPaddingLeft(), iK, getTextInputEditText().getPaddingRight(), iK2);
        getPrefixText().setPadding(getPrefixText().getPaddingLeft(), iK, getPrefixText().getPaddingRight(), iK2);
        getSuffixText().setPadding(getSuffixText().getPaddingLeft(), iK, getSuffixText().getPaddingRight(), iK2);
    }

    public final void K0() {
        SpannableStringBuilder spannableStringBuilderA;
        j jVar = this.I;
        j jVar2 = j.Inline;
        String str = null;
        if (jVar == jVar2) {
            getTextInputEditText().setDisplayAlwaysVisiblePlaceholderUnfocused$ui_kit_components_release(this.L.length() == 0);
            getTextInputEditText().setAlwaysVisiblePlaceholder(this.G);
            getTextInputEditText().setHint((CharSequence) null);
        } else {
            getTextInputEditText().setAlwaysVisiblePlaceholder(null);
            MaskedTextInputEditText textInputEditText = getTextInputEditText();
            Clause clause = this.G;
            if (clause != null) {
                ty0.c cVarB0 = u.k(this).b0();
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                spannableStringBuilderA = ty0.c.a(cVarB0, clause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
            } else {
                spannableStringBuilderA = null;
            }
            textInputEditText.setHint(spannableStringBuilderA);
        }
        L0(false, null);
        MaskedTextInputEditText textInputEditText2 = getTextInputEditText();
        String str2 = this.N;
        if (str2 == null || d0.W(str2)) {
            str2 = null;
        }
        if (str2 == null) {
            str2 = this.L;
            if (d0.W(str2)) {
                str2 = null;
            }
            if (str2 == null) {
                String str3 = this.K;
                if (!d0.W(str3) && this.I == jVar2) {
                    str = str3;
                }
                str2 = str;
            }
        }
        textInputEditText2.setContentDescription(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L0(boolean r6, java.lang.Boolean r7) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.input.InputText.L0(boolean, java.lang.Boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M0(boolean r4, java.lang.CharSequence r5) {
        /*
            r3 = this;
            boolean r0 = r3.enableQuickClear
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L45
            android.widget.ImageView r0 = r3.getQuickClearIconView()
            if (r4 == 0) goto L29
            com.revolut.core.ui_kit.views.input.MaskedTextInputEditText r4 = r3.getTextInputEditText()
            yz0.b r4 = r4.getMaskingDelegate()
            if (r4 == 0) goto L1f
            java.lang.String r4 = r4.e()
            if (r4 != 0) goto L1e
            goto L1f
        L1e:
            r5 = r4
        L1f:
            if (r5 == 0) goto L29
            int r4 = r5.length()
            if (r4 <= 0) goto L29
            r4 = r2
            goto L2a
        L29:
            r4 = r1
        L2a:
            r0.setVisibility(r4)
            android.widget.ImageView r4 = r3.getMainIconView()
            com.revolut.core.ui_kit_core.displayers.image.Image r5 = r3.mainIconImage
            if (r5 == 0) goto L41
            android.widget.ImageView r5 = r3.getQuickClearIconView()
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L40
            goto L41
        L40:
            r1 = r2
        L41:
            r4.setVisibility(r1)
            return
        L45:
            android.widget.ImageView r4 = r3.getQuickClearIconView()
            r4.setVisibility(r1)
            android.widget.ImageView r4 = r3.getMainIconView()
            com.revolut.core.ui_kit_core.displayers.image.Image r5 = r3.mainIconImage
            if (r5 == 0) goto L55
            r1 = r2
        L55:
            r4.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.input.InputText.M0(boolean, java.lang.CharSequence):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O0() {
        /*
            r7 = this;
            android.content.Context r0 = r7.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = jh.d.k(r0)
            r1 = 0
            if (r0 != 0) goto L13
        L10:
            r0 = r1
            goto L78
        L13:
            rx0.j r0 = r7.I
            rx0.j r2 = rx0.j.Inline
            if (r0 != r2) goto L29
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            java.lang.String r2 = r7.K
            int r3 = r2.length()
            boolean r0 = r0.isRtl(r2, r1, r3)
            if (r0 != 0) goto L29
            r1 = 6
            goto L10
        L29:
            com.revolut.core.ui_kit.views.input.MaskedTextInputEditText r0 = r7.getTextInputEditText()
            java.lang.Object r2 = or0.u.f228038a
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            r4 = 1
            if (r2 < r3) goto L40
            boolean r0 = o2.a.t(r0)
            goto L68
        L40:
            java.lang.Object r2 = or0.u.f228038a
            java.lang.Object r2 = r2.getValue()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            r3 = 0
            if (r2 == 0) goto L50
            java.lang.Object r2 = r2.get(r0)
            goto L51
        L50:
            r2 = r3
        L51:
            boolean r5 = r2 instanceof java.lang.Boolean
            if (r5 == 0) goto L58
            r3 = r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3
        L58:
            if (r3 == 0) goto L5f
            boolean r0 = r3.booleanValue()
            goto L68
        L5f:
            int r0 = r0.getMaxLines()
            if (r0 != r4) goto L67
            r0 = r4
            goto L68
        L67:
            r0 = r1
        L68:
            if (r0 != 0) goto L74
            com.revolut.core.ui_kit.views.input.MaskedTextInputEditText r0 = r7.getTextInputEditText()
            int r0 = r0.getMaxLines()
            if (r0 != r4) goto L10
        L74:
            r0 = 5
            r6 = r1
            r1 = r0
            r0 = r6
        L78:
            com.revolut.core.ui_kit.views.input.MaskedTextInputEditText r2 = r7.getTextInputEditText()
            r2.setTextAlignment(r1)
            com.revolut.core.ui_kit.views.input.MaskedTextInputEditText r1 = r7.getTextInputEditText()
            r1.setTextDirection(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.input.InputText.O0():void");
    }

    public final void P0() {
        String string = (this.f59085a0 || this.f59087b0) ? getContext().getString(R$string.common_accessibility_trait_invalid) : null;
        m.c(getFieldContainer(), string);
        m.c(getTextInputEditText(), string);
    }

    public final void Q0() {
        String string;
        if (getSuffixText().getVisibility() != 8) {
            AppCompatTextView suffixText = getSuffixText();
            Editable text = getTextInputEditText().getText();
            if (text == null || (string = text.toString()) == null) {
                string = "";
            }
            HashMap map = this.E0;
            Object objValueOf = map.get(string);
            if (objValueOf == null) {
                objValueOf = Integer.valueOf(rim.d.c(getTextInputEditText().getPaint().measureText(string)));
                map.put(string, objValueOf);
            }
            suffixText.setPaddingRelative(getTextInputEditText().getPaddingStart() + ((Number) objValueOf).intValue(), suffixText.getPaddingTop(), suffixText.getPaddingRight(), suffixText.getPaddingBottom());
        }
    }

    public final void R0(TextView textView) {
        CharSequence text = textView.getText();
        textView.setVisibility((text == null || text.length() == 0) ? 8 : this.M ? 4 : 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final boolean getEnableQuickClear() {
        return this.enableQuickClear;
    }

    @NotNull
    public final MaskedTextInputEditText getInnerEditText() {
        return getTextInputEditText();
    }

    /* JADX INFO: renamed from: getLabel, reason: from getter */
    public final Clause getH() {
        return this.H;
    }

    public final Image getMainIconImage() {
        return this.mainIconImage;
    }

    /* JADX INFO: renamed from: getPlaceholder, reason: from getter */
    public final Clause getG() {
        return this.G;
    }

    public final Image getPrefixIconImage() {
        return this.prefixIconImage;
    }

    @NotNull
    public final Companion.AbstractC0443a getPrefixIconMode() {
        return this.prefixIconMode;
    }

    public final Image getSecondaryIconImage() {
        return this.secondaryIconImage;
    }

    public final int getSelectionEnd() {
        return getTextInputEditText().getSelectionEnd();
    }

    public final int getSelectionStart() {
        return getTextInputEditText().getSelectionStart();
    }

    public final boolean getShowSystemKeyboardOnFocus() {
        return this.showSystemKeyboardOnFocus;
    }

    public final CharSequence getText() {
        return getTextInputEditText().getText();
    }

    public final int getUiKitInputType() {
        return this.uiKitInputType;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f59107t0);
        this.f59103r0 = null;
        getLabelScaleSpringAnimation().cancel();
        getLabelPositionSpringAnimation().cancel();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        od0.a aVar = od0.a.f224253a;
        if (od0.a.e()) {
            Object obj2 = od0.a.e.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            if (((g) obj2) == g.RELEASE_PLATFORM || od0.a.i() || this.P || this.M) {
                return;
            }
            Editable text = getTextInputEditText().getText();
            if ((text == null || text.length() == 0) && this.H == null && this.G == null) {
                CharSequence text2 = getSuffixText().getText();
                if (text2 == null || text2.length() == 0) {
                    CharSequence text3 = getPrefixText().getText();
                    if (text3 == null || text3.length() == 0) {
                        throw new IllegalStateException("One of these must be non-null/non-empty: textInputEditText.text, label, placeholder");
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (getLayoutParams().width == -2) {
            getFieldContainer().getLayoutParams().width = -2;
            getTextInputEditText().getLayoutParams().width = -2;
        } else {
            getFieldContainer().getLayoutParams().width = 0;
            getTextInputEditText().getLayoutParams().width = 0;
        }
        if (getLayoutDirection() == 1) {
            this.F0 = true;
            if ((this.f59110w0 != null || this.f59112x0 != null) && this.O) {
                TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                if (textDirectionHeuristic.isRtl(getPrefixText().getText(), 0, getPrefixText().getText().length()) || textDirectionHeuristic.isRtl(getSuffixText().getText(), 0, getSuffixText().getText().length())) {
                    u0(getPrefixText(), this.f59110w0);
                    u0(getSuffixText(), this.f59112x0);
                } else {
                    u0(getSuffixText(), this.f59110w0);
                    u0(getPrefixText(), this.f59112x0);
                }
                Q0();
                this.O = false;
            }
            this.F0 = false;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray<Parcelable> sparseArray = savedState.f59114a;
        if (sparseArray != null) {
            Iterator it8 = ViewGroupKt.getChildren(this).iterator();
            while (it8.hasNext()) {
                ((View) it8.next()).restoreHierarchyState(sparseArray);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        Iterator it8 = ViewGroupKt.getChildren(this).iterator();
        while (it8.hasNext()) {
            ((View) it8.next()).saveHierarchyState(sparseArray);
        }
        savedState.f59114a = sparseArray;
        return savedState;
    }

    public final void r0(TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(watcher, "textWatcher");
        MaskedTextInputEditText textInputEditText = getTextInputEditText();
        textInputEditText.getClass();
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        textInputEditText.u.add(watcher);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.F0) {
            return;
        }
        super.requestLayout();
    }

    public final r s() {
        return getTextInputEditText().f59127s;
    }

    public final void s0(boolean z) {
        this.M = z;
        getTextInputEditText().setVisibility(z ? 4 : 0);
        R0(getPrefixText());
        R0(getSuffixText());
        getInputTextShimmer().setVisibility(z ? 0 : 8);
        getFieldContainer().invalidate();
    }

    @Override // android.view.View
    public void setActivated(boolean activated) {
        super.setActivated(activated);
        if (activated) {
            return;
        }
        getFieldContainer().setActivated(getTextInputEditText().isFocused());
    }

    public final void setBackgroundStateList(@NotNull rx0.f backgroundStateList) {
        Intrinsics.checkNotNullParameter(backgroundStateList, "backgroundStateList");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        StateListDrawable stateListDrawableA = backgroundStateList.a(context, this.f59100p);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f59101q = dr0.l.k(dr0.l.f(context2, Companion.a(INSTANCE), stateListDrawableA, null, null, 24), stateListDrawableA, null, 60);
        getFieldContainer().setBackground(this.f59102r ? this.f59101q : null);
        Drawable background = getFieldContainer().getBackground();
        if (background != null) {
            background.jumpToCurrentState();
        }
    }

    public final void setCounterBaseValue(Integer counterBaseValue) {
        this.D = counterBaseValue;
        E0();
    }

    public final void setCounterEnable(boolean enable) {
        this.E = enable;
        E0();
    }

    public final void setCounterMaxLength(Integer maxLength) {
        this.C = maxLength;
        E0();
    }

    public final void setCustomContentDescription(Clause description) {
        String string;
        if (description != null) {
            ty0.c cVarB0 = u.k(this).b0();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            string = ty0.c.a(cVarB0, description, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString();
        } else {
            string = null;
        }
        this.N = string;
    }

    public final void setE2ETestsCustomId(String e2eTestsCustomId) {
        hx7.b.v(getTextInputEditText(), e2eTestsCustomId);
    }

    public final void setEnableQuickClear(boolean z) {
        CharSequence text;
        this.enableQuickClear = z;
        boolean zIsFocused = getTextInputEditText().isFocused();
        yz0.b maskingDelegate = getTextInputEditText().getMaskingDelegate();
        if (maskingDelegate == null || (text = maskingDelegate.e()) == null) {
            text = getTextInputEditText().getText();
        }
        M0(zIsFocused, text);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        getTextInputEditText().setEnabled(enabled);
        getFieldContainer().setEnabled(enabled);
        this.D0.setAlpha((int) (255 * (enabled ? 1.0f : 0.4f)));
    }

    public final void setError(boolean error) {
        if (this.f59085a0 == error) {
            return;
        }
        this.f59085a0 = error;
        getFieldContainer().setError(getHasHelperError());
        H0();
        E0();
        if (getTextInputEditText().hasFocus()) {
            F0();
        }
        P0();
    }

    @Override // android.view.View
    public void setFocusable(boolean focusable) {
        getTextInputEditText().setFocusable(focusable);
        getTextInputEditText().setFocusableInTouchMode(focusable);
        getTextInputEditText().setCursorVisible(focusable);
        getTextInputEditText().setImportantForAccessibility(focusable ? 0 : 2);
        getTextInputEditText().setClickable(focusable);
        getTextInputEditText().setButtonMode(!focusable);
        getFieldContainer().setImportantForAccessibility(focusable ? 2 : 0);
    }

    @yhm.d
    public final void setHelperText(String helperText) {
        setHelperText(helperText != null ? new TextClause(helperText, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null);
    }

    public final void setHorizontalPaddingEnabled$ui_kit_components_release(boolean enabled) {
        int iK;
        if (enabled != this.J) {
            this.J = enabled;
            View startPaddingView = getStartPaddingView();
            ViewGroup.LayoutParams layoutParams = startPaddingView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            int iK2 = 0;
            if (enabled) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iK = kli.a.k(context, 16.0f);
            } else {
                iK = 0;
            }
            layoutParams2.guideBegin = iK;
            startPaddingView.setLayoutParams(layoutParams2);
            View viewFindViewById = findViewById(R$id.inputText_endPadding);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            ViewGroup.LayoutParams layoutParams3 = viewFindViewById.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            if (enabled) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                iK2 = kli.a.k(context2, 12.0f);
            }
            layoutParams4.guideEnd = iK2;
            viewFindViewById.setLayoutParams(layoutParams4);
        }
    }

    public final void setImeOptions(int imeOptions) {
        getTextInputEditText().setImeOptions(imeOptions);
    }

    public final void setInputBackgroundVisible(boolean inputBackgroundVisible) {
        this.f59102r = inputBackgroundVisible;
        getFieldContainer().setBackground(this.f59102r ? this.f59101q : null);
    }

    public final void setInputFilters(@NotNull List<? extends InputFilter> filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        getTextInputEditText().setFilters((InputFilter[]) filters.toArray(new InputFilter[0]));
    }

    public final void setInputType(int inputType) {
        if ((inputType & BERTags.FLAGS) == 0) {
            getTextInputEditText().setInputType(inputType);
            return;
        }
        Typeface typeface = getTextInputEditText().getTypeface();
        getTextInputEditText().setInputType(inputType);
        getTextInputEditText().setTypeface(typeface);
    }

    @yhm.d
    public final void setLabel(String label) {
        setLabel(label != null ? new TextClause(label, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null);
    }

    public final void setMainIconEnabled(boolean mainIconEnabled) {
        getMainIconView().setEnabled(mainIconEnabled);
        getMainIconView().setAlpha(mainIconEnabled ? 1.0f : 0.4f);
    }

    public final void setMainIconImage(Image image) {
        this.mainIconImage = image;
        getMainIconView().setVisibility((image == null || getQuickClearIconView().getVisibility() == 0) ? 8 : 0);
        yy0.f.e(u.k(this).Q(), image, getMainIconView(), null, null, 12);
    }

    public final void setMaskingDelegate(yz0.b maskingDelegate) {
        getTextInputEditText().setMaskingDelegate(maskingDelegate);
    }

    public final void setMaxLines(int maxLines) {
        getTextInputEditText().setMaxLines(maxLines);
        O0();
    }

    public final void setMinLines(int minLines) {
        getTextInputEditText().setMinLines(minLines);
    }

    public final void setOnEditorActionListener(TextView.OnEditorActionListener listener) {
        getTextInputEditText().setOnEditorActionListener(listener);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPlaceholder(com.revolut.core.ui_kit.models.Clause r10, @org.jetbrains.annotations.NotNull rx0.j r11) {
        /*
            r9 = this;
            java.lang.String r0 = "mode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r9.G = r10
            if (r10 == 0) goto L2b
            wy0.a r0 = or0.u.k(r9)
            ty0.c r1 = r0.b0()
            android.content.Context r3 = r9.getContext()
            java.lang.String r0 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            r7 = 0
            r8 = 252(0xfc, float:3.53E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r10
            android.text.SpannableStringBuilder r10 = ty0.c.a(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r10 = r10.toString()
            if (r10 != 0) goto L2d
        L2b:
            java.lang.String r10 = ""
        L2d:
            r9.K = r10
            r9.I = r11
            r9.O0()
            r9.K0()
            r9.G0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.input.InputText.setPlaceholder(com.revolut.core.ui_kit.models.Clause, rx0.j):void");
    }

    public final void setPrefixIconImage(Image image) {
        this.prefixIconImage = image;
        v0();
    }

    public final void setPrefixIconMode(@NotNull Companion.AbstractC0443a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.prefixIconMode = value;
        v0();
        L0(false, null);
    }

    public final void setPrefixText(Clause textClause) {
        u0(getPrefixText(), textClause);
        this.f59110w0 = textClause;
        this.O = true;
    }

    public final void setProgressBarVisible(boolean isVisible) {
        getProgressBar().setVisibility(isVisible ? 0 : 8);
    }

    public final void setScrollable(boolean scrollable) {
        if (scrollable) {
            getTextInputEditText().setOnTouchListener(this.y0);
        } else {
            getTextInputEditText().setOnTouchListener(null);
        }
    }

    public final void setSecondaryIconEnabled(boolean secondaryIconEnabled) {
        getSecondaryIconView().setEnabled(secondaryIconEnabled);
        getSecondaryIconView().setAlpha(secondaryIconEnabled ? 1.0f : 0.4f);
    }

    public final void setSecondaryIconImage(Image image) {
        this.secondaryIconImage = image;
        getSecondaryIconView().setVisibility(image != null ? 0 : 8);
        yy0.f.e(u.k(this).Q(), image, getSecondaryIconView(), null, null, 12);
    }

    public final void setSelection(int index) {
        getTextInputEditText().setSelection(index);
    }

    public final void setSharingEnabled(boolean enabled) {
        if (enabled) {
            getTextInputEditText().setCustomSelectionActionModeCallback(null);
        } else {
            getTextInputEditText().setCustomSelectionActionModeCallback(new b());
        }
    }

    public final void setShowSystemKeyboardOnFocus(boolean z) {
        this.showSystemKeyboardOnFocus = z;
        getTextInputEditText().setUiKitShowSoftInputOnFocus(z);
    }

    public final void setSingleLine(boolean singleLine) {
        if (!(getTextInputEditText().getTransformationMethod() instanceof PasswordTransformationMethod)) {
            getTextInputEditText().setSingleLine(singleLine);
        }
        O0();
    }

    public final void setSuffixText(Clause textClause) {
        u0(getSuffixText(), textClause);
        this.f59112x0 = textClause;
        Q0();
        this.O = true;
    }

    public final void setTags(rx0.k tags) {
        TagView tagFirst = getTagFirst();
        tagFirst.setOnClickListener(null);
        tagFirst.setVisibility(8);
        TagView tagSecond = getTagSecond();
        tagSecond.setOnClickListener(null);
        tagSecond.setVisibility(8);
    }

    public final void setText(Clause clause, boolean keepStyle) {
        getTextInputEditText().setTextSafely(clause, keepStyle, new rx0.b(this, 0));
        G0();
    }

    public final void setTextAutofillHints(@NotNull String... autofillHints) {
        Intrinsics.checkNotNullParameter(autofillHints, "autofillHints");
        getTextInputEditText().setAutofillHints((String[]) Arrays.copyOf(autofillHints, autofillHints.length));
    }

    public final void setTextIsImportantForAutofill(Integer mode) {
        getTextInputEditText().setImportantForAutofill(mode != null ? mode.intValue() : 2);
    }

    public final void setTransformationMethod(@NotNull TransformationMethod transformationMethod) {
        Intrinsics.checkNotNullParameter(transformationMethod, "transformationMethod");
        getTextInputEditText().setTransformationMethod(transformationMethod);
    }

    public final void setUiKitInputType(int i) {
        this.uiKitInputType = i;
        getTextInputEditText().setUiKitInputType(i);
    }

    public final void setUnfocusedLabelColor(int textColor) {
        this.f0 = textColor;
        getFieldContainer().invalidate();
    }

    public final void u0(AppCompatTextView appCompatTextView, Clause clause) {
        ty0.c.b(u.k(this).b0(), clause, appCompatTextView, null, null, 12);
        R0(appCompatTextView);
    }

    public final void v0() {
        boolean z = getShouldFadePrefixIcon() || (this.prefixIconMode instanceof Companion.AbstractC0443a.b);
        ImageView prefixIcon = getPrefixIcon();
        int paddingLeft = getPrefixIcon().getPaddingLeft();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, z ? 24.0f : 16.0f);
        int paddingRight = getPrefixIcon().getPaddingRight();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        prefixIcon.setPadding(paddingLeft, iK, paddingRight, kli.a.k(context2, z ? 8.0f : 16.0f));
        Image image = this.prefixIconImage;
        boolean z3 = image != null;
        yy0.f.e(u.k(this).Q(), image, getPrefixIcon(), null, null, 12);
        if (getShouldFadePrefixIcon()) {
            getPrefixIcon().setVisibility(z3 ? 0 : 8);
            setPrefixIconAlpha(Intrinsics.f(this.m0, Boolean.TRUE));
            return;
        }
        Companion.AbstractC0443a abstractC0443a = this.prefixIconMode;
        Companion.AbstractC0443a.b bVar = abstractC0443a instanceof Companion.AbstractC0443a.b ? (Companion.AbstractC0443a.b) abstractC0443a : null;
        if (bVar == null || !bVar.f59116a) {
            getPrefixIcon().setAlpha(1.0f);
            getPrefixIcon().setVisibility(z3 ? 0 : 8);
        } else {
            getPrefixIcon().setAlpha(1.0f);
            getPrefixIcon().setVisibility((hasFocus() && z3) ? 0 : 8);
        }
    }

    public final void w0(Outline outline) {
        Intrinsics.checkNotNullParameter(outline, "outline");
        getFieldContainer().getOutlineProvider().getOutline(getFieldContainer(), outline);
    }

    public final r x0() {
        r rVarStartWith = this.j0.startWith((w) r.fromCallable(new nc0.a(this, 28)));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }

    public final r y0() {
        return new j01.b(getMainIconView());
    }

    public final r z0() {
        return new j01.b(getSecondaryIconView());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputText(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setHelperText(Clause helperText) {
        this.F = helperText;
        H0();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setLabel(com.revolut.core.ui_kit.models.Clause r10) {
        /*
            r9 = this;
            r9.H = r10
            if (r10 == 0) goto L26
            wy0.a r0 = or0.u.k(r9)
            ty0.c r1 = r0.b0()
            android.content.Context r3 = r9.getContext()
            java.lang.String r0 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            r7 = 0
            r8 = 252(0xfc, float:3.53E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r10
            android.text.SpannableStringBuilder r10 = ty0.c.a(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r10 = r10.toString()
            if (r10 != 0) goto L28
        L26:
            java.lang.String r10 = ""
        L28:
            r9.L = r10
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            int r1 = r10.length()
            r2 = 0
            boolean r10 = r0.isRtl(r10, r2, r1)
            android.text.TextPaint r0 = r9.D0
            float r1 = r0.getTextSize()
            com.revolut.core.ui_kit.views.input.MaskedTextInputEditText r3 = r9.getInnerEditText()
            android.text.TextPaint r3 = r3.getPaint()
            float r3 = r3.getTextSize()
            r0.setTextSize(r3)
            java.lang.String r3 = r9.L
            int r4 = r3.length()
            java.lang.String r5 = r9.L
            float r5 = android.text.Layout.getDesiredWidth(r5, r0)
            int r6 = rim.d.c(r5)
            float r7 = (float) r6
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 < 0) goto L60
            goto L62
        L60:
            int r6 = r6 + 1
        L62:
            android.text.StaticLayout$Builder r2 = android.text.StaticLayout.Builder.obtain(r3, r2, r4, r0, r6)
            if (r10 == 0) goto L6b
            android.text.Layout$Alignment r10 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L6d
        L6b:
            android.text.Layout$Alignment r10 = android.text.Layout.Alignment.ALIGN_NORMAL
        L6d:
            android.text.StaticLayout$Builder r10 = r2.setAlignment(r10)
            com.revolut.core.ui_kit.views.input.MaskedTextInputEditText r2 = r9.getTextInputEditText()
            float r2 = r2.getLineSpacingExtra()
            com.revolut.core.ui_kit.views.input.MaskedTextInputEditText r3 = r9.getTextInputEditText()
            float r3 = r3.getLineSpacingMultiplier()
            android.text.StaticLayout$Builder r10 = r10.setLineSpacing(r2, r3)
            r2 = 1
            android.text.StaticLayout$Builder r10 = r10.setIncludePad(r2)
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
            android.text.StaticLayout$Builder r10 = r10.setEllipsize(r3)
            android.text.StaticLayout$Builder r10 = r10.setMaxLines(r2)
            android.text.StaticLayout r10 = r10.build()
            r9.B = r10
            r0.setTextSize(r1)
            r9.I0()
            r9.K0()
            r9.G0()
            float r10 = r9.z0
            r0.setTextSize(r10)
            com.revolut.core.ui_kit.views.input.MaskedTextInputEditText r10 = r9.getTextInputEditText()
            java.lang.String r1 = r9.L
            float r0 = android.text.Layout.getDesiredWidth(r1, r0)
            int r1 = rim.d.c(r0)
            float r2 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto Lbf
            goto Lc1
        Lbf:
            int r1 = r1 + 1
        Lc1:
            r10.setMinimumWidth(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.input.InputText.setLabel(com.revolut.core.ui_kit.models.Clause):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputText(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.textInputEditText = kli.a.J(R$id.inputText_EditText, this);
        this.quickClearIconView = kli.a.J(R$id.inputText_quickClearIconView, this);
        this.mainIconView = kli.a.J(R$id.inputText_mainIconView, this);
        this.secondaryIconView = kli.a.J(R$id.inputText_secondaryIconView, this);
        this.progressBar = kli.a.J(R$id.inputText_progressBar, this);
        this.prefixIcon = kli.a.J(R$id.inputText_prefixIcon, this);
        this.prefixText = kli.a.J(R$id.inputText_prefixText, this);
        this.suffixText = kli.a.J(R$id.inputText_suffixText, this);
        this.helperTextStart = kli.a.J(R$id.inputText_helperStart, this);
        this.helperTextEnd = kli.a.J(R$id.inputText_helperEnd, this);
        this.fieldContainer = kli.a.J(R$id.inputText_fieldContainer, this);
        float fA = h.EXTRA_LARGE.a();
        this.f59100p = fA;
        this.f59102r = true;
        this.startPaddingView = kli.a.J(R$id.inputText_startPadding, this);
        this.labelBarrier = kli.a.J(R$id.inputText_labelBarrier, this);
        this.iconsContainer = kli.a.J(R$id.inputText_iconsContainer, this);
        this.inputTextShimmer = kli.a.J(R$id.inputText_shimmer, this);
        this.tagFirst = kli.a.J(R$id.inputText_tagFirst, this);
        this.tagSecond = kli.a.J(R$id.inputText_tagSecond, this);
        this.f59113y = v0.a.d("create(...)");
        this.z = v0.a.d("create(...)");
        this.A = v0.a.d("create(...)");
        this.I = j.OnFocus;
        this.K = "";
        this.L = "";
        this.showSystemKeyboardOnFocus = true;
        this.prefixIconMode = Companion.AbstractC0443a.C0444a.f59115a;
        this.c0 = te0.w.y0(new lu0.a(context, 24));
        this.f59088d0 = te0.w.y0(new lu0.a(context, 25));
        this.f59089e0 = new ArgbEvaluator();
        this.f0 = kli.a.s(R$attr.uikit_colorGreyTone50, context);
        this.g0 = kli.a.s(R$attr.uikit_colorGreyTone50, context);
        this.f59092h0 = te0.w.y0(new lu0.a(context, 26));
        this.i0 = te0.w.y0(new lu0.a(context, 27));
        this.j0 = v0.a.d("create(...)");
        this.f59098n0 = new FloatValueHolder();
        this.f59099o0 = new FloatValueHolder();
        this.p0 = te0.w.y0(new rx0.b(this, 1));
        this.q0 = te0.w.y0(new rx0.b(this, 2));
        this.f59107t0 = new a(this, 1);
        this.u0 = v0.a.d("create(...)");
        a2 a2Var = new a2(this, 10);
        this.y0 = new l(this);
        this.z0 = kli.a.k(context, 12.0f);
        this.labelUnfocusedFontSize = yhm.j.b(new rx0.b(this, 3));
        float fL = kli.a.l(context, 7.0f);
        this.B0 = fL;
        this.C0 = kli.a.l(context, 16.0f) - (fL / 2);
        this.E0 = new HashMap();
        View.inflate(context, R$layout.internal_view_input_text, this);
        rx0.f fVar = rx0.f.DEFAULT;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        StateListDrawable stateListDrawableA = fVar.a(context2, fA);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Companion companion = INSTANCE;
        this.f59101q = dr0.l.k(dr0.l.f(context3, Companion.a(companion), stateListDrawableA, null, null, 24), stateListDrawableA, null, 60);
        getFieldContainer().setBackground(this.f59102r ? this.f59101q : null);
        getFieldContainer().setError(getHasHelperError());
        getTextInputEditText().a(new m4(this, 12));
        getTextInputEditText().addTextChangedListener(a2Var);
        getQuickClearIconView().setOnClickListener(new c9(this, 15));
        fp0.m mVar = p.Companion;
        InputTextFieldContainer fieldContainer = getFieldContainer();
        gp0.g gVar = new gp0.g(Companion.a(companion));
        mVar.getClass();
        p pVarA = fp0.m.a(fieldContainer, gVar);
        this.f59108v0 = pVarA;
        p.b(pVarA, true);
        View view = pVarA.f137029a;
        m.a(view);
        view.setOnClickListener(new p2(this, 11));
        getFieldContainer().setOnDrawLabel(new rnb.u(1, this, InputText.class, "drawLabel", "drawLabel(Landroid/graphics/Canvas;)V", 0, 10));
        I0();
        L0(false, null);
        H0();
        setFocusable(true);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(getTextInputEditText().getPaint());
        jb3.l.d(textPaint, context, R$attr.internal_textAppearanceBody1);
        this.D0 = textPaint;
        setHorizontalPaddingEnabled$ui_kit_components_release(true);
    }

    public /* synthetic */ InputText(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
