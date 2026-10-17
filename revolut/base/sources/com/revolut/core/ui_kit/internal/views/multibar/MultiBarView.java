package com.revolut.core.ui_kit.internal.views.multibar;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import az0.o0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.revolut.core.ui_kit.R$styleable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vt0.f;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.v;
import zhm.w;
import zt0.a;
import zt0.c;
import zt0.d;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 ð\u00012\u00020\u0001:\u0002ñ\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010$\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u001eH\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010&\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b&\u0010\u001dJ\u001f\u0010+\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b0\u0010\u001dJ\u001f\u00103\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001eH\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u001eH\u0002¢\u0006\u0004\b7\u00106J\u0017\u00109\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u001eH\u0002¢\u0006\u0004\b9\u0010:JG\u0010A\u001a\u00020\n2\u0006\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020\u001eH\u0002¢\u0006\u0004\bA\u0010BJS\u0010I\u001a\u00020\n*\u00020\u00112\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010JJK\u0010M\u001a\u00020\n*\u00020\u00112\u0006\u0010K\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u0006H\u0002¢\u0006\u0004\bM\u0010NJK\u0010O\u001a\u00020\n*\u00020\u00112\u0006\u0010K\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u0006H\u0002¢\u0006\u0004\bO\u0010NJ+\u0010P\u001a\u00020\n*\u00020\u00112\u0006\u0010>\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u0006H\u0002¢\u0006\u0004\bP\u0010QJ;\u0010S\u001a\u00020\n*\u00020\u00112\u0006\u0010F\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020C2\u0006\u0010R\u001a\u00020\u001eH\u0002¢\u0006\u0004\bS\u0010TJA\u0010Y\u001a\u00020\n2\u0006\u0010K\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010X\u001a\u0004\u0018\u00010WH\u0002¢\u0006\u0004\bY\u0010ZJ+\u0010\\\u001a\u00020\n*\u00020\u00112\u0006\u0010>\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020\u001e2\u0006\u0010[\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\\\u0010]J-\u0010_\u001a\u00020\n*\u00020\u00112\b\u0010^\u001a\u0004\u0018\u00010'2\u0006\u0010G\u001a\u00020\u001e2\u0006\u0010[\u001a\u00020\u001eH\u0002¢\u0006\u0004\b_\u0010`J\u001f\u0010a\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\ba\u0010bJ/\u0010d\u001a\u00020\n2\u0006\u0010c\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u001eH\u0002¢\u0006\u0004\bd\u0010eJ#\u0010f\u001a\u00020\n*\u00020\u00112\u0006\u0010U\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u0006H\u0002¢\u0006\u0004\bf\u0010gJ\u001f\u0010i\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020'2\u0006\u0010h\u001a\u00020)H\u0002¢\u0006\u0004\bi\u0010jJg\u0010s\u001a\u00020\n*\u00020\u00112\u0006\u0010(\u001a\u00020'2\u0006\u0010k\u001a\u00020\u001e2\u0006\u0010[\u001a\u00020\u001e2\b\b\u0002\u0010m\u001a\u00020l2\u0006\u0010h\u001a\u00020)2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010n2\b\b\u0002\u0010p\u001a\u00020\u001e2\b\b\u0002\u0010q\u001a\u00020\u001e2\b\b\u0002\u0010r\u001a\u00020\u001eH\u0002¢\u0006\u0004\bs\u0010tJ\u001f\u0010u\u001a\u00020-2\u0006\u0010(\u001a\u00020'2\u0006\u0010h\u001a\u00020)H\u0002¢\u0006\u0004\bu\u0010/J\u0017\u0010x\u001a\n w*\u0004\u0018\u00010v0vH\u0002¢\u0006\u0004\bx\u0010yJ\u0015\u0010#\u001a\u0004\u0018\u00010\u001e*\u00020\u001aH\u0002¢\u0006\u0004\b#\u0010zJ\u0013\u0010!\u001a\u00020\u001e*\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010{R'\u0010}\u001a\u0004\u0018\u00010|8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R)\u0010\u0083\u0001\u001a\u00020n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R)\u0010\u0089\u0001\u001a\u00020n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u0084\u0001\u001a\u0006\b\u008a\u0001\u0010\u0086\u0001\"\u0006\b\u008b\u0001\u0010\u0088\u0001R'\u0010o\u001a\u00020n8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bo\u0010\u0084\u0001\u001a\u0006\b\u008c\u0001\u0010\u0086\u0001\"\u0006\b\u008d\u0001\u0010\u0088\u0001R)\u0010\u008e\u0001\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R)\u0010\u0094\u0001\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u008f\u0001\u001a\u0006\b\u0095\u0001\u0010\u0091\u0001\"\u0006\b\u0096\u0001\u0010\u0093\u0001R)\u0010\u0097\u0001\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u008f\u0001\u001a\u0006\b\u0098\u0001\u0010\u0091\u0001\"\u0006\b\u0099\u0001\u0010\u0093\u0001R(\u0010\u009a\u0001\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0005\b\u009c\u0001\u00106\"\u0006\b\u009d\u0001\u0010\u009e\u0001R(\u0010\u009f\u0001\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u009f\u0001\u0010\u009b\u0001\u001a\u0005\b \u0001\u00106\"\u0006\b¡\u0001\u0010\u009e\u0001R(\u0010¢\u0001\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¢\u0001\u0010\u009b\u0001\u001a\u0005\b£\u0001\u00106\"\u0006\b¤\u0001\u0010\u009e\u0001R(\u0010¥\u0001\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¥\u0001\u0010\u009b\u0001\u001a\u0005\b¦\u0001\u00106\"\u0006\b§\u0001\u0010\u009e\u0001R(\u0010¨\u0001\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¨\u0001\u0010\u009b\u0001\u001a\u0005\b©\u0001\u00106\"\u0006\bª\u0001\u0010\u009e\u0001R(\u0010«\u0001\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b«\u0001\u0010\u009b\u0001\u001a\u0005\b¬\u0001\u00106\"\u0006\b\u00ad\u0001\u0010\u009e\u0001R(\u0010®\u0001\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b®\u0001\u0010\u009b\u0001\u001a\u0005\b¯\u0001\u00106\"\u0006\b°\u0001\u0010\u009e\u0001R(\u0010±\u0001\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b±\u0001\u0010\u009b\u0001\u001a\u0005\b²\u0001\u00106\"\u0006\b³\u0001\u0010\u009e\u0001R'\u0010I\u001a\u00020l8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bI\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R)\u0010¹\u0001\u001a\u00020l8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¹\u0001\u0010´\u0001\u001a\u0006\bº\u0001\u0010¶\u0001\"\u0006\b»\u0001\u0010¸\u0001R\u0017\u0010¼\u0001\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010\u0084\u0001R\u0018\u0010¾\u0001\u001a\u00030½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0019\u0010À\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010\u009b\u0001R\u0018\u0010Â\u0001\u001a\u00030Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u0018\u0010Ä\u0001\u001a\u00030Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Ã\u0001R\u0018\u0010Æ\u0001\u001a\u00030Å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R8\u0010Ê\u0001\u001a\u0005\u0018\u00010È\u00012\n\u0010É\u0001\u001a\u0005\u0018\u00010È\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R!\u0010Ð\u0001\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R;\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\r\u0010É\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0005\b\u001b\u0010Ñ\u0001\u001a\u0006\bÒ\u0001\u0010Ó\u0001\"\u0005\bÔ\u0001\u0010\u001dR)\u0010Õ\u0001\u001a\u00020l8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÕ\u0001\u0010´\u0001\u001a\u0006\bÖ\u0001\u0010¶\u0001\"\u0006\b×\u0001\u0010¸\u0001R'\u0010Ú\u0001\u001a\u0010\u0012\u0004\u0012\u00020W\u0012\u0005\u0012\u00030Ù\u00010Ø\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R$\u0010Ý\u0001\u001a\u000f\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020-0Ü\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0001\u0010Û\u0001R\u0017\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010Þ\u0001R\u0017\u0010#\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b#\u0010\u009b\u0001R\u0017\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b!\u0010\u009b\u0001R\u0019\u0010ß\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010\u009b\u0001R\u0017\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001f\u0010\u009b\u0001R\u0017\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0010\u009b\u0001R\u0019\u0010à\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010Þ\u0001R\u0019\u0010á\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010Þ\u0001R*\u0010â\u0001\u001a\u00020\u00062\u0007\u0010É\u0001\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\u0010\n\u0006\bâ\u0001\u0010Þ\u0001\"\u0006\bã\u0001\u0010ä\u0001R\u001a\u0010æ\u0001\u001a\u00030å\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u0019\u0010è\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0001\u0010Þ\u0001R\u0019\u0010é\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0001\u0010Þ\u0001R\u0019\u0010ê\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bê\u0001\u0010\u009b\u0001R*\u0010ë\u0001\u001a\u00020\u001e2\u0007\u0010É\u0001\u001a\u00020\u001e8\u0002@BX\u0082\u000e¢\u0006\u0010\n\u0006\bë\u0001\u0010\u009b\u0001\"\u0006\bì\u0001\u0010\u009e\u0001R\u0017\u0010ï\u0001\u001a\u00020\u00068BX\u0082\u0004¢\u0006\b\u001a\u0006\bí\u0001\u0010î\u0001¨\u0006ò\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/multibar/MultiBarView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "startRevealAnimation", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/content/res/TypedArray;", "attributes", "setupAttributes", "(Landroid/content/res/TypedArray;)V", "", "Lzt0/c;", "items", "initValuesForCalculations", "(Ljava/util/List;)V", "", "marksTextHeight", "marksSubtitleHeight", "minNegativeValue", "iconSize", "maxPositiveValue", "calculateVerticalPaddings", "(FFFIF)V", "setupStaticLayouts", "", "text", "Landroid/text/TextPaint;", "titlePaint", "addStaticLayoutToCacheIfNotExists", "(Ljava/lang/String;Landroid/text/TextPaint;)V", "Landroid/text/StaticLayout;", "getStaticLayout", "(Ljava/lang/String;Landroid/text/TextPaint;)Landroid/text/StaticLayout;", "setupDrawablesIfNeeded", "size", "measureSpec", "calcSize", "(II)I", "calculateBarsOffsetX", "()F", "calculateFinalBarsHeight", "maxBarsHeight", "calculateZeroLineOffsetFromTop", "(F)F", "barsOffsetX", "i", "itemWidth", "item", "pxPerValueUnitRatio", "zeroLineOffsetFromTop", "drawBarWithMarks", "(FIFLandroid/graphics/Canvas;Lzt0/c;FF)V", "Lzt0/a;", "fraction", "xPos", "barTop", "textPosX", "barBottom", "drawMarksOnBarPeaks", "(Landroid/graphics/Canvas;Lzt0/a;FILandroid/graphics/Canvas;Lzt0/c;FII)V", "iconLeft", "iconRight", "drawMarksForPositiveValue", "(Landroid/graphics/Canvas;IIILandroid/graphics/Canvas;Lzt0/c;FI)V", "drawMarksForNegativeValue", "drawMarksBelowBars", "(Landroid/graphics/Canvas;Lzt0/c;FI)V", "barHeight", "drawBar", "(Landroid/graphics/Canvas;IIFLzt0/a;F)V", "top", "bottom", "", "icon", "drawIcon", "(IIIILandroid/graphics/Canvas;Ljava/lang/Object;)V", "posY", "drawTitle", "(Landroid/graphics/Canvas;Lzt0/c;FF)V", "subtitle", "drawSubtitleIfShould", "(Landroid/graphics/Canvas;Ljava/lang/String;FF)V", "drawZeroLineIfShould", "(FLandroid/graphics/Canvas;)V", "finalBarsHeight", "drawTooltipIfShould", "(FFLandroid/graphics/Canvas;F)V", "setupVerticalClip", "(Landroid/graphics/Canvas;II)V", "textPaint", "measureTextHeight", "(Ljava/lang/String;Landroid/text/TextPaint;)F", "posX", "", "centered", "Landroid/graphics/Paint;", "tooltipBgPaint", "paddingVert", "paddingHor", "cornerRadius", "drawTextInBox", "(Landroid/graphics/Canvas;Ljava/lang/String;FFZLandroid/text/TextPaint;Landroid/graphics/Paint;FFF)V", "createTextStaticLayout", "Landroid/animation/ObjectAnimator;", "kotlin.jvm.PlatformType", "dropValues", "()Landroid/animation/ObjectAnimator;", "(Lzt0/c;)Ljava/lang/Float;", "(Lzt0/c;)F", "Lzt0/b;", "drawableProvider", "Lzt0/b;", "getDrawableProvider", "()Lzt0/b;", "setDrawableProvider", "(Lzt0/b;)V", "tooltipLinePaint", "Landroid/graphics/Paint;", "getTooltipLinePaint", "()Landroid/graphics/Paint;", "setTooltipLinePaint", "(Landroid/graphics/Paint;)V", "zeroLinePaint", "getZeroLinePaint", "setZeroLinePaint", "getTooltipBgPaint", "setTooltipBgPaint", "tooltipTextPaint", "Landroid/text/TextPaint;", "getTooltipTextPaint", "()Landroid/text/TextPaint;", "setTooltipTextPaint", "(Landroid/text/TextPaint;)V", "marksTextPaint", "getMarksTextPaint", "setMarksTextPaint", "marksSubtitlePaint", "getMarksSubtitlePaint", "setMarksSubtitlePaint", "tooltipOffsetLeft", "F", "getTooltipOffsetLeft", "setTooltipOffsetLeft", "(F)V", "marksPaddingVert", "getMarksPaddingVert", "setMarksPaddingVert", "tooltipPaddingVert", "getTooltipPaddingVert", "setTooltipPaddingVert", "tooltipPaddingHor", "getTooltipPaddingHor", "setTooltipPaddingHor", "tooltipBoxCornerRadius", "getTooltipBoxCornerRadius", "setTooltipBoxCornerRadius", "barCornerAngle", "getBarCornerAngle", "setBarCornerAngle", "barWidth", "getBarWidth", "setBarWidth", "barGap", "getBarGap", "setBarGap", "Z", "getDrawMarksOnBarPeaks", "()Z", "setDrawMarksOnBarPeaks", "(Z)V", "hideTooltipOnOverlap", "getHideTooltipOnOverlap", "setHideTooltipOnOverlap", "paint", "Landroid/graphics/Rect;", "clipRect", "Landroid/graphics/Rect;", "firstMarksRectLeft", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", "drawnTextRect", "Landroid/graphics/Path;", "tooltipPath", "Landroid/graphics/Path;", "Lzt0/d;", "value", "tooltip", "Lzt0/d;", "getTooltip", "()Lzt0/d;", "setTooltip", "(Lzt0/d;)V", "itemsBeingSet", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "revealAnimationEnabled", "getRevealAnimationEnabled", "setRevealAnimationEnabled", "", "Landroid/graphics/drawable/Drawable;", "iconsToDrawables", "Ljava/util/Map;", "", "staticLayoutsCache", "I", "valuesAmplitude", "barsPaddingTop", "barsPaddingBottom", "progress", "setProgress", "(I)V", "Landroid/view/animation/OvershootInterpolator;", "barInterpolator", "Landroid/view/animation/OvershootInterpolator;", "barAnimationDelayStep", "barAnimationDuration", "barStartAlpha", "graphScale", "setGraphScale", "getAnimationTotalDuration", "()I", "animationTotalDuration", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MultiBarView extends FrameLayout {
    private static final int DEFAULT_ANIMATION_BAR_INFLATE_TIME = 400;
    private static final int DEFAULT_ANIMATION_PER_BAR_DELAY = 75;
    private static final float DEFAULT_BAR_GAP = 10.0f;
    private static final float DEFAULT_BAR_WIDTH = 100.0f;
    private static final float DEFAULT_LINE_GAP = 1.0f;
    private static final float DEFAULT_LINE_WIDTH = 1.0f;
    private static final float DEFAULT_PADDING = 10.0f;
    private static final float DEFAULT_RADIUS = 15.0f;
    private static final float DEFAULT_TEXT_SIZE = 10.0f;
    private static final float GRAPH_OVERSHOOT_ASPECT = 1.0f;
    private static final float GRAPH_OVERSHOOT_ASPECT_FRACTION = 0.1f;
    private static final int MARKS_ATTACHED_TO_BARS_VERT_PADDING = 5;
    private static final float MARKS_VERTICAL_PADDING_BOTTOM_ADJUSTMENT = 3.0f;
    private static final float MARKS_VERTICAL_PADDING_FOR_TOP_ADJUSTMENT = 0.6666667f;
    private static final int MIN_GRAPH_PADDING = 16;
    private int barAnimationDelayStep;
    private int barAnimationDuration;
    private float barCornerAngle;
    private float barGap;

    @NotNull
    private OvershootInterpolator barInterpolator;
    private float barStartAlpha;
    private float barWidth;
    private int barsPaddingBottom;
    private int barsPaddingTop;

    @NotNull
    private final Rect clipRect;
    private boolean drawMarksOnBarPeaks;
    private zt0.b drawableProvider;

    @NotNull
    private final RectF drawnTextRect;
    private float firstMarksRectLeft;
    private float graphScale;
    private boolean hideTooltipOnOverlap;
    private int iconSize;

    @NotNull
    private Map<Object, ? extends Drawable> iconsToDrawables;

    @NotNull
    private List<c> items;
    private List<c> itemsBeingSet;
    private float marksPaddingVert;
    private float marksSubtitleHeight;

    @NotNull
    private TextPaint marksSubtitlePaint;
    private float marksTextHeight;

    @NotNull
    private TextPaint marksTextPaint;
    private float maxPositiveValue;
    private float minNegativeValue;

    @NotNull
    private final Paint paint;
    private int progress;

    @NotNull
    private final RectF rect;
    private boolean revealAnimationEnabled;

    @NotNull
    private final Map<String, StaticLayout> staticLayoutsCache;
    private d tooltip;

    @NotNull
    private Paint tooltipBgPaint;
    private float tooltipBoxCornerRadius;

    @NotNull
    private Paint tooltipLinePaint;
    private float tooltipOffsetLeft;
    private float tooltipPaddingHor;
    private float tooltipPaddingVert;

    @NotNull
    private final Path tooltipPath;

    @NotNull
    private TextPaint tooltipTextPaint;
    private float valuesAmplitude;

    @NotNull
    private Paint zeroLinePaint;

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj2, Object obj3) {
            return cim.b.b(Float.valueOf(((a) obj3).f325001a), Float.valueOf(((a) obj2).f325001a));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiBarView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void addStaticLayoutToCacheIfNotExists(String text, TextPaint titlePaint) {
        Map<String, StaticLayout> map = this.staticLayoutsCache;
        String str = text + titlePaint;
        if (map.get(str) == null) {
            map.put(str, createTextStaticLayout(text, titlePaint));
        }
    }

    private final int calcSize(int size, int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size2 = View.MeasureSpec.getSize(measureSpec);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? size : size2 : Math.min(size, size2);
    }

    private final float calculateBarsOffsetX() {
        return (getMeasuredWidth() - (((this.items.size() - 1) * this.barGap) + (this.items.size() * this.barWidth))) / 2;
    }

    private final float calculateFinalBarsHeight() {
        return ((getMeasuredHeight() - this.barsPaddingBottom) - this.barsPaddingTop) * ((this.maxPositiveValue <= BitmapDescriptorFactory.HUE_RED || this.minNegativeValue >= BitmapDescriptorFactory.HUE_RED) ? 0.9f : 0.8f);
    }

    private final void calculateVerticalPaddings(float marksTextHeight, float marksSubtitleHeight, float minNegativeValue, int iconSize, float maxPositiveValue) {
        float f = marksSubtitleHeight + marksTextHeight;
        boolean z = this.drawMarksOnBarPeaks;
        int i = 16;
        this.barsPaddingBottom = z ? minNegativeValue < BitmapDescriptorFactory.HUE_RED ? (int) (10 + f + iconSize) : 16 : (int) ((2 * this.marksPaddingVert) + marksTextHeight);
        if (!z) {
            i = 0;
        } else if (maxPositiveValue > BitmapDescriptorFactory.HUE_RED) {
            i = (int) (10 + f + iconSize);
        }
        this.barsPaddingTop = i;
    }

    private final float calculateZeroLineOffsetFromTop(float maxBarsHeight) {
        float measuredHeight = ((getMeasuredHeight() - maxBarsHeight) - ((!this.drawMarksOnBarPeaks || this.minNegativeValue >= BitmapDescriptorFactory.HUE_RED) ? 0.0f : ((getMeasuredHeight() - this.barsPaddingBottom) - this.barsPaddingTop) * 0.1f)) - this.barsPaddingBottom;
        float f = this.valuesAmplitude;
        return f == BitmapDescriptorFactory.HUE_RED ? (this.maxPositiveValue == BitmapDescriptorFactory.HUE_RED && this.minNegativeValue == BitmapDescriptorFactory.HUE_RED) ? maxBarsHeight / 2 : measuredHeight : ((this.maxPositiveValue / f) * maxBarsHeight) + measuredHeight;
    }

    private final StaticLayout createTextStaticLayout(String text, TextPaint textPaint) {
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(text, 0, text.length(), textPaint, (int) textPaint.measureText(text)).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
        return staticLayoutBuild;
    }

    private final void drawBar(Canvas canvas, int i, int i2, float f, a aVar, float f4) {
        setupVerticalClip(canvas, i, i2);
        float f5 = i;
        float f6 = f + this.barWidth;
        float f32 = i2;
        float f35 = this.barCornerAngle;
        Paint paint = this.paint;
        int i3 = aVar.f325002b;
        int i5 = aVar.f325002b;
        paint.setColor(i3);
        Unit unit = Unit.f186387a;
        canvas.drawRoundRect(f, f5, f6, f32, f35, f35, paint);
        if (this.drawMarksOnBarPeaks) {
            float f36 = this.barCornerAngle;
            if (f4 > f36) {
                if (aVar.f325001a > BitmapDescriptorFactory.HUE_RED) {
                    float f37 = f32 - f36;
                    float f41 = this.barWidth + f;
                    Paint paint2 = this.paint;
                    paint2.setColor(i5);
                    canvas.drawRect(f, f37, f41, f32, paint2);
                    return;
                }
                float f42 = f5 + f36;
                float f57 = this.barWidth + f;
                Paint paint3 = this.paint;
                paint3.setColor(i5);
                canvas.drawRect(f, f42, f57, f5, paint3);
            }
        }
    }

    private final void drawBarWithMarks(float barsOffsetX, int i, float itemWidth, Canvas canvas, c item, float pxPerValueUnitRatio, float zeroLineOffsetFromTop) {
        c cVar;
        c cVar2 = item;
        float f = (i * itemWidth) + barsOffsetX;
        float interpolation = this.barInterpolator.getInterpolation(Math.min(Math.max(this.progress - (this.barAnimationDelayStep * i), 0), this.barAnimationDuration) / this.barAnimationDuration) * this.graphScale;
        for (a aVar : d0.P0(cVar2.f325004b, new b())) {
            float fAbs = Math.abs(aVar.f325001a) * pxPerValueUnitRatio;
            Pair pair = aVar.f325001a > BitmapDescriptorFactory.HUE_RED ? new Pair(Integer.valueOf(Math.max((int) (zeroLineOffsetFromTop - (fAbs * interpolation)), 0)), Integer.valueOf((int) zeroLineOffsetFromTop)) : new Pair(Integer.valueOf((int) zeroLineOffsetFromTop), Integer.valueOf((int) ((fAbs * interpolation) + zeroLineOffsetFromTop)));
            int iIntValue = ((Number) pair.f186385a).intValue();
            int iIntValue2 = ((Number) pair.f186386b).intValue();
            canvas.save();
            float f4 = f;
            drawBar(canvas, iIntValue, iIntValue2, f4, aVar, fAbs);
            f = f4;
            canvas.restore();
            float f5 = (this.barWidth / 2) + f;
            if (this.drawMarksOnBarPeaks) {
                cVar = cVar2;
                drawMarksOnBarPeaks(canvas, aVar, f, iIntValue, canvas, cVar, f5, i, iIntValue2);
            } else {
                cVar = cVar2;
                drawMarksBelowBars(canvas, cVar, f5, i);
            }
            cVar2 = cVar;
        }
    }

    private final void drawIcon(int iconLeft, int top, int iconRight, int bottom, Canvas canvas, Object icon) {
        Drawable drawable = this.iconsToDrawables.get(icon);
        if (drawable != null) {
            drawable.setBounds(iconLeft, top, iconRight, bottom);
            drawable.draw(canvas);
        }
    }

    private final void drawMarksBelowBars(Canvas canvas, c cVar, float f, int i) {
        drawTitle(canvas, cVar, f, getMeasuredHeight() - (this.barsPaddingBottom / 2));
        if (i == 0) {
            this.firstMarksRectLeft = f;
        }
        cVar.getClass();
    }

    private final void drawMarksForNegativeValue(Canvas canvas, int i, int i2, int i3, Canvas canvas2, c cVar, float f, int i5) {
        int i6 = i2 + (-((int) (this.marksTextPaint.getFontMetrics().top / MARKS_VERTICAL_PADDING_BOTTOM_ADJUSTMENT)));
        int i21 = i6 + this.iconSize;
        cVar.getClass();
        drawIcon(i, i6, i3, i21, canvas2, null);
        float f4 = 2;
        drawTitle(canvas, cVar, f, (this.marksTextHeight / f4) + (this.iconSize != 0 ? r1 : 0) + i2 + r11);
        if (i5 == 0) {
            this.firstMarksRectLeft = this.drawnTextRect.left;
        }
        drawSubtitleIfShould(canvas, null, f, (this.marksSubtitleHeight / f4) + i2 + (this.iconSize != 0 ? r1 / 2 : (-r1) / 2) + r11 + this.marksTextHeight);
        if (i5 == 0) {
            float f5 = this.drawnTextRect.left;
            if (f5 < this.firstMarksRectLeft) {
                this.firstMarksRectLeft = f5;
            }
        }
    }

    private final void drawMarksForPositiveValue(Canvas canvas, int i, int i2, int i3, Canvas canvas2, c cVar, float f, int i5) {
        int i6 = (int) (this.marksTextPaint.getFontMetrics().bottom * MARKS_VERTICAL_PADDING_FOR_TOP_ADJUSTMENT);
        float f4 = i2;
        float f5 = (f4 - this.marksSubtitleHeight) - this.marksTextHeight;
        cVar.getClass();
        drawIcon(i, (int) (f5 - this.iconSize), i3, (int) f5, canvas2, null);
        float f6 = 2;
        drawTitle(canvas, cVar, f, ((f4 - this.marksSubtitleHeight) - (this.marksTextHeight / f6)) - (i6 / 2.0f));
        if (i5 == 0) {
            this.firstMarksRectLeft = this.drawnTextRect.left;
        }
        drawSubtitleIfShould(canvas, null, f, (f4 - (this.marksSubtitleHeight / f6)) - i6);
        if (i5 == 0) {
            float f32 = this.drawnTextRect.left;
            if (f32 < this.firstMarksRectLeft) {
                this.firstMarksRectLeft = f32;
            }
        }
    }

    private final void drawMarksOnBarPeaks(Canvas canvas, a aVar, float f, int i, Canvas canvas2, c cVar, float f4, int i2, int i3) {
        this.marksSubtitlePaint.setColor(aVar.f325002b);
        float f5 = this.barWidth;
        int i5 = ((int) (f5 - this.iconSize)) / 2;
        int i6 = ((int) f) + i5;
        int i21 = (int) ((f + f5) - i5);
        if (aVar.f325001a > BitmapDescriptorFactory.HUE_RED) {
            drawMarksForPositiveValue(canvas, i6, i, i21, canvas2, cVar, f4, i2);
        } else {
            drawMarksForNegativeValue(canvas, i6, i3, i21, canvas2, cVar, f4, i2);
        }
    }

    private final void drawSubtitleIfShould(Canvas canvas, String str, float f, float f4) {
        if (str != null) {
            drawTextInBox$default(this, canvas, str, f, f4, true, this.marksSubtitlePaint, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, DefaultFrameSampler.DESIRED_FRAME_WIDTH, null);
        }
    }

    private final void drawTextInBox(Canvas canvas, String str, float f, float f4, boolean z, TextPaint textPaint, Paint paint, float f5, float f6, float f32) {
        int iMeasureText = (int) textPaint.measureText(str);
        StaticLayout staticLayout = getStaticLayout(str, textPaint);
        float height = staticLayout.getHeight() / 2;
        float f35 = f4 - height;
        float f36 = z ? (-iMeasureText) / 2 : 0;
        float f37 = f + f36;
        float f41 = iMeasureText + f + f36;
        float f42 = height + f4;
        if (paint != null) {
            RectF rectF = this.rect;
            rectF.top = f35 - f5;
            rectF.left = f37;
            rectF.right = (2 * f6) + f41;
            rectF.bottom = f42 + f5;
            canvas.drawRoundRect(rectF, f32, f32, paint);
        }
        canvas.save();
        canvas.translate(f + (iMeasureText / 2) + f36 + f6, f35);
        staticLayout.draw(canvas);
        canvas.restore();
        this.drawnTextRect.set(f37, f35, f41, f42);
    }

    public static /* synthetic */ void drawTextInBox$default(MultiBarView multiBarView, Canvas canvas, String str, float f, float f4, boolean z, TextPaint textPaint, Paint paint, float f5, float f6, float f32, int i, Object obj2) {
        float f35;
        MultiBarView multiBarView2;
        Canvas canvas2;
        String str2;
        float f36;
        float f37;
        TextPaint textPaint2;
        boolean z3 = (i & 8) != 0 ? false : z;
        Paint paint2 = (i & 32) != 0 ? null : paint;
        float f41 = (i & 64) != 0 ? 0.0f : f5;
        float f42 = (i & 128) != 0 ? 0.0f : f6;
        if ((i & 256) != 0) {
            f35 = 0.0f;
            canvas2 = canvas;
            str2 = str;
            f36 = f;
            f37 = f4;
            textPaint2 = textPaint;
            multiBarView2 = multiBarView;
        } else {
            f35 = f32;
            multiBarView2 = multiBarView;
            canvas2 = canvas;
            str2 = str;
            f36 = f;
            f37 = f4;
            textPaint2 = textPaint;
        }
        multiBarView2.drawTextInBox(canvas2, str2, f36, f37, z3, textPaint2, paint2, f41, f42, f35);
    }

    private final void drawTitle(Canvas canvas, c cVar, float f, float f4) {
        drawTextInBox$default(this, canvas, cVar.f325003a, f, f4, true, this.marksTextPaint, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, DefaultFrameSampler.DESIRED_FRAME_WIDTH, null);
    }

    private final void drawTooltipIfShould(float finalBarsHeight, float zeroLineOffsetFromTop, Canvas canvas, float barsOffsetX) {
        d dVar = this.tooltip;
        if (dVar != null) {
            float f = dVar.f325006a;
            String str = dVar.f325007b;
            int i = dVar.f325008c;
            int i2 = dVar.d;
            int i3 = dVar.e;
            float f4 = this.valuesAmplitude;
            float f5 = f4 == BitmapDescriptorFactory.HUE_RED ? 0.0f : finalBarsHeight / f4;
            float fAbs = f > BitmapDescriptorFactory.HUE_RED ? zeroLineOffsetFromTop - (f * f5) : (Math.abs(f) * f5) + zeroLineOffsetFromTop;
            boolean z = ((int) (this.tooltipTextPaint.measureText(str) + ((((float) 2) * this.tooltipPaddingHor) + this.tooltipOffsetLeft))) > ((int) Math.min(this.firstMarksRectLeft, barsOffsetX));
            if (this.hideTooltipOnOverlap && z) {
                return;
            }
            this.tooltipPath.reset();
            this.tooltipPath.moveTo(BitmapDescriptorFactory.HUE_RED, fAbs);
            this.tooltipPath.lineTo(getMeasuredWidth(), fAbs);
            Path path = this.tooltipPath;
            Paint paint = this.tooltipLinePaint;
            paint.setColor(i);
            Unit unit = Unit.f186387a;
            canvas.drawPath(path, paint);
            float f6 = fAbs;
            float f32 = this.tooltipOffsetLeft;
            TextPaint textPaint = this.tooltipTextPaint;
            textPaint.setColor(i2);
            Paint paint2 = this.tooltipBgPaint;
            paint2.setColor(i3);
            drawTextInBox$default(this, canvas, str, f32, f6, false, textPaint, paint2, this.tooltipPaddingVert, this.tooltipPaddingHor, this.tooltipBoxCornerRadius, 8, null);
        }
    }

    private final void drawZeroLineIfShould(float zeroLineOffsetFromTop, Canvas canvas) {
        if (this.drawMarksOnBarPeaks) {
            canvas.drawLine(BitmapDescriptorFactory.HUE_RED, zeroLineOffsetFromTop, getMeasuredWidth(), zeroLineOffsetFromTop, this.zeroLinePaint);
        }
    }

    private final ObjectAnimator dropValues() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "graphScale", 1.0f, BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setInterpolator(new BounceInterpolator());
        objectAnimatorOfFloat.addListener(new f(this, 8));
        objectAnimatorOfFloat.start();
        return objectAnimatorOfFloat;
    }

    private final int getAnimationTotalDuration() {
        return ((this.items.size() - 1) * this.barAnimationDelayStep) + this.barAnimationDuration;
    }

    private final StaticLayout getStaticLayout(String text, TextPaint titlePaint) {
        StaticLayout staticLayout = this.staticLayoutsCache.get(text + titlePaint);
        if (staticLayout != null) {
            return staticLayout;
        }
        throw new IllegalArgumentException("All StaticLayouts should be created before onDraw");
    }

    private final void initValuesForCalculations(List<c> items) {
        List<c> list = items;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it8 = list.iterator();
            while (it8.hasNext()) {
                ((c) it8.next()).getClass();
            }
        }
        this.iconSize = 0;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it9 = list.iterator();
        while (it9.hasNext()) {
            Float fMaxPositiveValue = maxPositiveValue((c) it9.next());
            if (fMaxPositiveValue != null) {
                arrayList.add(fMaxPositiveValue);
            }
        }
        Float fQ0 = d0.q0(arrayList);
        float fFloatValue = BitmapDescriptorFactory.HUE_RED;
        float fFloatValue2 = fQ0 != null ? fQ0.floatValue() : 0.0f;
        d dVar = this.tooltip;
        this.maxPositiveValue = Math.max(fFloatValue2, dVar != null ? dVar.f325006a : 0.0f);
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        Iterator<T> it10 = list.iterator();
        while (it10.hasNext()) {
            arrayList2.add(Float.valueOf(minNegativeValue((c) it10.next())));
        }
        Float fW0 = d0.w0(arrayList2);
        float fFloatValue3 = fW0 != null ? fW0.floatValue() : 0.0f;
        d dVar2 = this.tooltip;
        float fMin = Math.min(fFloatValue3, dVar2 != null ? dVar2.f325006a : 0.0f);
        this.minNegativeValue = fMin;
        this.valuesAmplitude = Math.abs(fMin) + this.maxPositiveValue;
        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
        Iterator<T> it11 = list.iterator();
        while (it11.hasNext()) {
            arrayList3.add(((c) it11.next()).f325003a);
        }
        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
        Iterator it12 = arrayList3.iterator();
        while (it12.hasNext()) {
            arrayList4.add(Float.valueOf(measureTextHeight((String) it12.next(), this.marksTextPaint)));
        }
        Float fQ02 = d0.q0(arrayList4);
        this.marksTextHeight = fQ02 != null ? fQ02.floatValue() : 0.0f;
        ArrayList arrayList5 = new ArrayList();
        Iterator<T> it13 = list.iterator();
        while (it13.hasNext()) {
            ((c) it13.next()).getClass();
        }
        ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
        Iterator it14 = arrayList5.iterator();
        while (it14.hasNext()) {
            arrayList6.add(Float.valueOf(measureTextHeight((String) it14.next(), this.marksSubtitlePaint)));
        }
        Float fQ03 = d0.q0(arrayList6);
        if (fQ03 != null) {
            fFloatValue = fQ03.floatValue();
        }
        float f = fFloatValue;
        this.marksSubtitleHeight = f;
        calculateVerticalPaddings(this.marksTextHeight, f, this.minNegativeValue, this.iconSize, this.maxPositiveValue);
    }

    private final Float maxPositiveValue(c cVar) {
        List list = cVar.f325004b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            float f = ((a) it8.next()).f325001a;
            if (f <= BitmapDescriptorFactory.HUE_RED) {
                f = 0.0f;
            }
            arrayList.add(Float.valueOf(f));
        }
        return d0.q0(arrayList);
    }

    private final float measureTextHeight(String text, TextPaint textPaint) {
        return getStaticLayout(text, textPaint).getHeight();
    }

    private final float minNegativeValue(c cVar) {
        List list = cVar.f325004b;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            float f = ((a) it8.next()).f325001a;
            Float fValueOf = f < BitmapDescriptorFactory.HUE_RED ? Float.valueOf(f) : null;
            if (fValueOf != null) {
                arrayList.add(fValueOf);
            }
        }
        Float fW0 = d0.w0(arrayList);
        return fW0 != null ? fW0.floatValue() : BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setGraphScale(float f) {
        this.graphScale = f;
        postInvalidate();
    }

    private final void setProgress(int i) {
        this.progress = i;
        postInvalidate();
    }

    private final void setupAttributes(TypedArray attributes) {
        this.marksTextPaint.setColor(attributes.getColor(R$styleable.MultiBarView_internal_marksTextColor, -3355444));
        this.barWidth = attributes.getDimension(R$styleable.MultiBarView_internal_barWidth, 100.0f);
        this.barGap = attributes.getDimension(R$styleable.MultiBarView_internal_barGap, 10.0f);
        this.barCornerAngle = attributes.getDimension(R$styleable.MultiBarView_internal_barRadius, DEFAULT_RADIUS);
        this.marksTextPaint.setTextSize(attributes.getDimension(R$styleable.MultiBarView_internal_marksTextSize, 10.0f));
        this.marksSubtitlePaint.setTextSize(attributes.getDimension(R$styleable.MultiBarView_internal_marksTextSize, 10.0f));
        this.marksPaddingVert = attributes.getDimension(R$styleable.MultiBarView_internal_marksVerticalPadding, 10.0f);
        this.tooltipPaddingHor = attributes.getDimension(R$styleable.MultiBarView_internal_tooltipHorizontalPadding, 10.0f);
        this.tooltipPaddingVert = attributes.getDimension(R$styleable.MultiBarView_internal_tooltipVerticalPadding, 10.0f);
        this.tooltipOffsetLeft = attributes.getDimension(R$styleable.MultiBarView_internal_tooltipLeftOffset, 10.0f);
        this.tooltipBoxCornerRadius = attributes.getDimension(R$styleable.MultiBarView_internal_tooltipBoxCornerRadius, DEFAULT_RADIUS);
        this.tooltipLinePaint.setStrokeWidth(attributes.getDimension(R$styleable.MultiBarView_internal_tooltipLineWidth, 1.0f));
        this.tooltipTextPaint.setTextSize(attributes.getDimension(R$styleable.MultiBarView_internal_tooltipTextSize, 10.0f));
        this.tooltipLinePaint.setPathEffect(new DashPathEffect(new float[]{attributes.getDimension(R$styleable.MultiBarView_internal_tooltipLineDashSolid, 1.0f), attributes.getDimension(R$styleable.MultiBarView_internal_tooltipLineDashGap, 1.0f)}, BitmapDescriptorFactory.HUE_RED));
        this.drawMarksOnBarPeaks = attributes.getBoolean(R$styleable.MultiBarView_internal_showMarksOnBarPeaks, false);
        this.hideTooltipOnOverlap = attributes.getBoolean(R$styleable.MultiBarView_internal_hideTooltipOnOverlap, false);
        this.zeroLinePaint.setStrokeWidth(attributes.getDimension(R$styleable.MultiBarView_internal_zeroLineWidth, 1.0f));
        this.zeroLinePaint.setColor(attributes.getColor(R$styleable.MultiBarView_internal_zeroLineColor, -3355444));
    }

    private final void setupDrawablesIfNeeded(List<c> items) {
        if (items.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it8 = items.iterator();
        while (it8.hasNext()) {
            ((c) it8.next()).getClass();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            it9.next();
        }
        this.iconsToDrawables = r0.t(arrayList2);
    }

    private final void setupStaticLayouts(List<c> items) {
        for (c cVar : items) {
            this.marksTextPaint.setColor(cVar.f325005c);
            addStaticLayoutToCacheIfNotExists(cVar.f325003a, this.marksTextPaint);
        }
    }

    private final void setupVerticalClip(Canvas canvas, int i, int i2) {
        Rect rect = this.clipRect;
        rect.top = i;
        rect.bottom = i2;
        canvas.clipRect(rect);
    }

    public final float getBarCornerAngle() {
        return this.barCornerAngle;
    }

    public final float getBarGap() {
        return this.barGap;
    }

    public final float getBarWidth() {
        return this.barWidth;
    }

    public final boolean getDrawMarksOnBarPeaks() {
        return this.drawMarksOnBarPeaks;
    }

    public final zt0.b getDrawableProvider() {
        return null;
    }

    public final boolean getHideTooltipOnOverlap() {
        return this.hideTooltipOnOverlap;
    }

    @NotNull
    public final List<c> getItems() {
        return this.items;
    }

    public final float getMarksPaddingVert() {
        return this.marksPaddingVert;
    }

    @NotNull
    public final TextPaint getMarksSubtitlePaint() {
        return this.marksSubtitlePaint;
    }

    @NotNull
    public final TextPaint getMarksTextPaint() {
        return this.marksTextPaint;
    }

    public final boolean getRevealAnimationEnabled() {
        return this.revealAnimationEnabled;
    }

    public final d getTooltip() {
        return this.tooltip;
    }

    @NotNull
    public final Paint getTooltipBgPaint() {
        return this.tooltipBgPaint;
    }

    public final float getTooltipBoxCornerRadius() {
        return this.tooltipBoxCornerRadius;
    }

    @NotNull
    public final Paint getTooltipLinePaint() {
        return this.tooltipLinePaint;
    }

    public final float getTooltipOffsetLeft() {
        return this.tooltipOffsetLeft;
    }

    public final float getTooltipPaddingHor() {
        return this.tooltipPaddingHor;
    }

    public final float getTooltipPaddingVert() {
        return this.tooltipPaddingVert;
    }

    @NotNull
    public final TextPaint getTooltipTextPaint() {
        return this.tooltipTextPaint;
    }

    @NotNull
    public final Paint getZeroLinePaint() {
        return this.zeroLinePaint;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Rect rect = this.clipRect;
        rect.left = 0;
        rect.right = getMeasuredWidth();
        float fCalculateBarsOffsetX = calculateBarsOffsetX();
        float fCalculateFinalBarsHeight = calculateFinalBarsHeight();
        float fCalculateZeroLineOffsetFromTop = calculateZeroLineOffsetFromTop(fCalculateFinalBarsHeight);
        float f = this.valuesAmplitude;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            f4 = fCalculateFinalBarsHeight / f;
        }
        float f5 = f4;
        float f6 = this.barWidth + this.barGap;
        int i = 0;
        for (Object obj2 : this.items) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            drawBarWithMarks(fCalculateBarsOffsetX, i, f6, canvas, (c) obj2, f5, fCalculateZeroLineOffsetFromTop);
            i = i2;
        }
        drawZeroLineIfShould(fCalculateZeroLineOffsetFromTop, canvas);
        drawTooltipIfShould(fCalculateFinalBarsHeight, fCalculateZeroLineOffsetFromTop, canvas, fCalculateBarsOffsetX);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(calcSize(getSuggestedMinimumWidth(), widthMeasureSpec), calcSize(getSuggestedMinimumHeight(), heightMeasureSpec));
    }

    public final void setBarCornerAngle(float f) {
        this.barCornerAngle = f;
    }

    public final void setBarGap(float f) {
        this.barGap = f;
    }

    public final void setBarWidth(float f) {
        this.barWidth = f;
    }

    public final void setDrawMarksOnBarPeaks(boolean z) {
        this.drawMarksOnBarPeaks = z;
    }

    public final void setDrawableProvider(zt0.b bVar) {
    }

    public final void setHideTooltipOnOverlap(boolean z) {
        this.hideTooltipOnOverlap = z;
    }

    public final void setItems(@NotNull List<c> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.f(this.itemsBeingSet, value)) {
            return;
        }
        setupDrawablesIfNeeded(value);
        setupStaticLayouts(value);
        initValuesForCalculations(value);
        if (this.items.isEmpty()) {
            this.items = value;
            startRevealAnimation();
        } else {
            ObjectAnimator objectAnimatorDropValues = dropValues();
            Intrinsics.checkNotNullExpressionValue(objectAnimatorDropValues, "dropValues(...)");
            objectAnimatorDropValues.addListener(new o0(this, value, 16));
        }
    }

    public final void setMarksPaddingVert(float f) {
        this.marksPaddingVert = f;
    }

    public final void setMarksSubtitlePaint(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "<set-?>");
        this.marksSubtitlePaint = textPaint;
    }

    public final void setMarksTextPaint(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "<set-?>");
        this.marksTextPaint = textPaint;
    }

    public final void setRevealAnimationEnabled(boolean z) {
        this.revealAnimationEnabled = z;
    }

    public final void setTooltip(d dVar) {
        String str;
        this.tooltip = dVar;
        if (dVar != null && (str = dVar.f325007b) != null) {
            addStaticLayoutToCacheIfNotExists(str, this.tooltipTextPaint);
        }
        postInvalidate();
    }

    public final void setTooltipBgPaint(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<set-?>");
        this.tooltipBgPaint = paint;
    }

    public final void setTooltipBoxCornerRadius(float f) {
        this.tooltipBoxCornerRadius = f;
    }

    public final void setTooltipLinePaint(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<set-?>");
        this.tooltipLinePaint = paint;
    }

    public final void setTooltipOffsetLeft(float f) {
        this.tooltipOffsetLeft = f;
    }

    public final void setTooltipPaddingHor(float f) {
        this.tooltipPaddingHor = f;
    }

    public final void setTooltipPaddingVert(float f) {
        this.tooltipPaddingVert = f;
    }

    public final void setTooltipTextPaint(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "<set-?>");
        this.tooltipTextPaint = textPaint;
    }

    public final void setZeroLinePaint(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<set-?>");
        this.zeroLinePaint = paint;
    }

    public final void startRevealAnimation() {
        long animationTotalDuration = this.revealAnimationEnabled ? getAnimationTotalDuration() : 0L;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<MultiBarView, Float>) View.ALPHA, this.barStartAlpha, 1.0f);
        objectAnimatorOfFloat.setDuration(animationTotalDuration);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.start();
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "progress", 0, getAnimationTotalDuration());
        objectAnimatorOfInt.setDuration(animationTotalDuration);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiBarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBarView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.tooltipLinePaint = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        this.zeroLinePaint = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(-3355444);
        Paint.Style style2 = Paint.Style.FILL;
        paint3.setStyle(style2);
        this.tooltipBgPaint = paint3;
        TextPaint textPaint = new TextPaint();
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        textPaint.setAntiAlias(true);
        this.tooltipTextPaint = textPaint;
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setTextAlign(align);
        textPaint2.setAntiAlias(true);
        this.marksTextPaint = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        textPaint3.setTextAlign(align);
        textPaint3.setAntiAlias(true);
        this.marksSubtitlePaint = textPaint3;
        this.tooltipOffsetLeft = 10.0f;
        this.marksPaddingVert = 10.0f;
        this.tooltipPaddingVert = 10.0f;
        this.tooltipPaddingHor = 10.0f;
        this.tooltipBoxCornerRadius = DEFAULT_RADIUS;
        this.barCornerAngle = 10.0f;
        this.barWidth = 100.0f;
        this.barGap = 10.0f;
        Paint paint4 = new Paint();
        paint4.setStyle(style2);
        this.paint = paint4;
        this.clipRect = new Rect();
        this.rect = new RectF();
        this.drawnTextRect = new RectF();
        this.tooltipPath = new Path();
        int[] MultiBarView = R$styleable.MultiBarView;
        Intrinsics.checkNotNullExpressionValue(MultiBarView, "MultiBarView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, MultiBarView, i, 0);
        setupAttributes(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        this.items = f0.f322471a;
        this.iconsToDrawables = r0.g();
        this.staticLayoutsCache = new LinkedHashMap();
        setWillNotDraw(false);
        setProgress(getAnimationTotalDuration());
        this.barInterpolator = new OvershootInterpolator();
        this.barAnimationDelayStep = 75;
        this.barAnimationDuration = DEFAULT_ANIMATION_BAR_INFLATE_TIME;
        this.graphScale = 1.0f;
    }

    public /* synthetic */ MultiBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
