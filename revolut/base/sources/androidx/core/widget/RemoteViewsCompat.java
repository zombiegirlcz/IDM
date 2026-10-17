package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002+,B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u00020\t*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\t*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ%\u0010\u0012\u001a\u00020\t*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0012\u0010\u000eJ%\u0010\u0014\u001a\u00020\t*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u000eJ'\u0010\u0016\u001a\u00020\t*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0015\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0016\u0010\u000eJ%\u0010\u0018\u001a\u00020\t*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0018\u0010\u000eJ'\u0010\u0019\u001a\u00020\t*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0015\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0019\u0010\u000eJ%\u0010\u001b\u001a\u00020\t*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\t*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001d\u0010\u000eJ'\u0010\u001e\u001a\u00020\t*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001e\u0010\u000eJ'\u0010\u001f\u001a\u00020\t*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001f\u0010\u000eJ%\u0010!\u001a\u00020\t*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0007H\u0007¢\u0006\u0004\b!\u0010\u000bJ%\u0010#\u001a\u00020\t*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0007¢\u0006\u0004\b#\u0010\u000eJ'\u0010%\u001a\u00020\t*\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010$\u001a\u00020\u0005H\u0007¢\u0006\u0004\b%\u0010\u000eJ\u001f\u0010)\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*¨\u0006-"}, d2 = {"Landroidx/core/widget/RemoteViewsCompat;", "", "<init>", "()V", "Landroid/widget/RemoteViews;", "", "viewId", "", "adjustViewBounds", "", "setImageViewAdjustViewBounds", "(Landroid/widget/RemoteViews;IZ)V", "color", "setImageViewColorFilter", "(Landroid/widget/RemoteViews;II)V", "resId", "setImageViewColorFilterResource", "alpha", "setImageViewImageAlpha", "gravity", "setLinearLayoutGravity", "pixels", "setTextViewHeight", "maxLines", "setTextViewMaxLines", "setTextViewWidth", "", "setViewAlpha", "(Landroid/widget/RemoteViews;IF)V", "setViewBackgroundColor", "setViewBackgroundColorResource", "setViewBackgroundResource", "clipToOutline", "setViewClipToOutline", "inflatedId", "setViewStubInflatedId", "layoutResource", "setViewStubLayoutResource", "minSdk", "", "method", "requireSdk", "(ILjava/lang/String;)V", "Api31Impl", "RemoteCollectionItems", "core-remoteviews_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RemoteViewsCompat {

    @NotNull
    public static final RemoteViewsCompat INSTANCE = new RemoteViewsCompat();

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J,\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\bH\u0007J,\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\bH\u0007J,\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\bH\u0007J,\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\bH\u0007J6\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0013\u001a\u00020\b2\b\b\u0001\u0010\u0014\u001a\u00020\bH\u0007J,\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J6\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0017H\u0007J,\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\bH\u0007J,\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\bH\u0007J2\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\bH\u0007J,\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\bH\u0007J,\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\bH\u0007J6\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001fH\u0007J2\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\bH\u0007J,\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\bH\u0007J,\u0010!\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\bH\u0007¨\u0006\""}, d2 = {"Landroidx/core/widget/RemoteViewsCompat$Api31Impl;", "", "()V", "setBlendMode", "", "rv", "Landroid/widget/RemoteViews;", "id", "", "method", "", "mode", "Landroid/graphics/BlendMode;", "setCharSequence", "resId", "setCharSequenceAttr", "setColor", "setColorAttr", "setColorInt", "notNight", "night", "setColorStateList", "colorStateList", "Landroid/content/res/ColorStateList;", "setColorStateListAttr", "setFloatDimen", "value", "", "unit", "setFloatDimenAttr", "setIcon", "Landroid/graphics/drawable/Icon;", "setIntDimen", "setIntDimenAttr", "core-remoteviews_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api31Impl {

        @NotNull
        public static final Api31Impl INSTANCE = new Api31Impl();

        private Api31Impl() {
        }

        public static final void setBlendMode(@NotNull RemoteViews rv4, int id10, @NotNull String method, BlendMode mode) {
            Intrinsics.checkNotNullParameter(rv4, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv4.setBlendMode(id10, method, mode);
        }

        public static final void setCharSequence(@NotNull RemoteViews rv4, int id10, @NotNull String method, int resId) {
            Intrinsics.checkNotNullParameter(rv4, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv4.setCharSequence(id10, method, resId);
        }

        public static final void setCharSequenceAttr(@NotNull RemoteViews rv4, int id10, @NotNull String method, int resId) {
            Intrinsics.checkNotNullParameter(rv4, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv4.setCharSequenceAttr(id10, method, resId);
        }

        public static final void setColor(@NotNull RemoteViews rv4, int id10, @NotNull String method, int resId) {
            Intrinsics.checkNotNullParameter(rv4, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv4.setColor(id10, method, resId);
        }

        public static final void setColorAttr(@NotNull RemoteViews rv4, int id10, @NotNull String method, int resId) {
            Intrinsics.checkNotNullParameter(rv4, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv4.setColorAttr(id10, method, resId);
        }

        public static final void setColorInt(@NotNull RemoteViews rv4, int id10, @NotNull String method, int notNight, int night) {
            Intrinsics.checkNotNullParameter(rv4, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv4.setColorInt(id10, method, notNight, night);
        }

        public static final void setColorStateList(@NotNull RemoteViews rv4, int id10, @NotNull String method, ColorStateList colorStateList) {
            Intrinsics.checkNotNullParameter(rv4, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv4.setColorStateList(id10, method, colorStateList);
        }

        public static final void setColorStateListAttr(@NotNull RemoteViews rv4, int id10, @NotNull String method, int resId) {
            Intrinsics.checkNotNullParameter(rv4, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv4.setColorStateListAttr(id10, method, resId);
        }

        public static final void setFloatDimen(@NotNull RemoteViews rv4, int id10, @NotNull String method, float value, int unit) {
            Intrinsics.checkNotNullParameter(rv4, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv4.setFloatDimen(id10, method, value, unit);
        }

        public static final void setFloatDimenAttr(@NotNull RemoteViews rv4, int id10, @NotNull String method, int resId) {
            Intrinsics.checkNotNullParameter(rv4, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv4.setFloatDimenAttr(id10, method, resId);
        }

        public static final void setIcon(@NotNull RemoteViews rv4, int id10, @NotNull String method, Icon notNight, Icon night) {
            Intrinsics.checkNotNullParameter(rv4, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv4.setIcon(id10, method, notNight, night);
        }

        public static final void setIntDimen(@NotNull RemoteViews rv4, int id10, @NotNull String method, float value, int unit) {
            Intrinsics.checkNotNullParameter(rv4, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv4.setIntDimen(id10, method, value, unit);
        }

        public static final void setIntDimenAttr(@NotNull RemoteViews rv4, int id10, @NotNull String method, int resId) {
            Intrinsics.checkNotNullParameter(rv4, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv4.setIntDimenAttr(id10, method, resId);
        }

        public static final void setColorStateList(@NotNull RemoteViews rv4, int id10, @NotNull String method, ColorStateList notNight, ColorStateList night) {
            Intrinsics.checkNotNullParameter(rv4, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv4.setColorStateList(id10, method, notNight, night);
        }

        public static final void setFloatDimen(@NotNull RemoteViews rv4, int id10, @NotNull String method, int resId) {
            Intrinsics.checkNotNullParameter(rv4, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv4.setFloatDimen(id10, method, resId);
        }

        public static final void setIntDimen(@NotNull RemoteViews rv4, int id10, @NotNull String method, int resId) {
            Intrinsics.checkNotNullParameter(rv4, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv4.setIntDimen(id10, method, resId);
        }

        public static final void setColorStateList(@NotNull RemoteViews rv4, int id10, @NotNull String method, int resId) {
            Intrinsics.checkNotNullParameter(rv4, "rv");
            Intrinsics.checkNotNullParameter(method, "method");
            rv4.setColorStateList(id10, method, resId);
        }
    }

    private RemoteViewsCompat() {
    }

    private final void requireSdk(int minSdk, String method) {
        if (Build.VERSION.SDK_INT >= minSdk) {
            return;
        }
        throw new IllegalArgumentException((method + " is only available on SDK " + minSdk + " and higher").toString());
    }

    public static final void setImageViewAdjustViewBounds(@NotNull RemoteViews remoteViews, int i, boolean z) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        remoteViews.setBoolean(i, "setAdjustViewBounds", z);
    }

    public static final void setImageViewColorFilter(@NotNull RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        remoteViews.setInt(i, "setColorFilter", i2);
    }

    public static final void setImageViewColorFilterResource(@NotNull RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        Api31Impl.setColor(remoteViews, i, "setColorFilter", i2);
    }

    public static final void setImageViewImageAlpha(@NotNull RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        remoteViews.setInt(i, "setImageAlpha", i2);
    }

    public static final void setLinearLayoutGravity(@NotNull RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        remoteViews.setInt(i, "setGravity", i2);
    }

    public static final void setTextViewHeight(@NotNull RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        remoteViews.setInt(i, "setHeight", i2);
    }

    public static final void setTextViewMaxLines(@NotNull RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        remoteViews.setInt(i, "setMaxLines", i2);
    }

    public static final void setTextViewWidth(@NotNull RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        remoteViews.setInt(i, "setWidth", i2);
    }

    public static final void setViewAlpha(@NotNull RemoteViews remoteViews, int i, float f) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        INSTANCE.requireSdk(31, "setAlpha");
        remoteViews.setFloat(i, "setAlpha", f);
    }

    public static final void setViewBackgroundColor(@NotNull RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        remoteViews.setInt(i, "setBackgroundColor", i2);
    }

    public static final void setViewBackgroundColorResource(@NotNull RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            Api31Impl.setColor(remoteViews, i, "setBackgroundColor", i2);
        } else {
            remoteViews.setInt(i, "setBackgroundResource", i2);
        }
    }

    public static final void setViewBackgroundResource(@NotNull RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        remoteViews.setInt(i, "setBackgroundResource", i2);
    }

    public static final void setViewClipToOutline(@NotNull RemoteViews remoteViews, int i, boolean z) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        INSTANCE.requireSdk(31, "setClipToOutline");
        remoteViews.setBoolean(i, "setClipToOutline", z);
    }

    public static final void setViewStubInflatedId(@NotNull RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        INSTANCE.requireSdk(16, "setInflatedId");
        remoteViews.setInt(i, "setInflatedId", i2);
    }

    public static final void setViewStubLayoutResource(@NotNull RemoteViews remoteViews, int i, int i2) {
        Intrinsics.checkNotNullParameter(remoteViews, "<this>");
        INSTANCE.requireSdk(16, "setLayoutResource");
        remoteViews.setInt(i, "setLayoutResource", i2);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0013\u0018\u0000 #2\u00020\u0001:\u0001#B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006$"}, d2 = {"Landroidx/core/widget/RemoteViewsCompat$RemoteCollectionItems;", "", "", "ids", "", "Landroid/widget/RemoteViews;", "views", "", "hasStableIds", "", "viewTypeCount", "<init>", "([J[Landroid/widget/RemoteViews;ZI)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "position", "", "getItemId", "(I)J", "getItemView", "(I)Landroid/widget/RemoteViews;", "()Z", "mIds", "[J", "mViews", "[Landroid/widget/RemoteViews;", "mHasStableIds", "Z", "mViewTypeCount", "I", "getItemCount", "()I", "itemCount", "getViewTypeCount", "Companion", "core-remoteviews_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RemoteCollectionItems {

        @NotNull
        private static final Companion Companion = new Companion(null);
        private final boolean mHasStableIds;

        @NotNull
        private final long[] mIds;
        private final int mViewTypeCount;

        @NotNull
        private final RemoteViews[] mViews;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/widget/RemoteViewsCompat$RemoteCollectionItems$Companion;", "", "<init>", "()V", "core-remoteviews_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public RemoteCollectionItems(@NotNull long[] ids, @NotNull RemoteViews[] views, boolean z, int i) {
            Intrinsics.checkNotNullParameter(ids, "ids");
            Intrinsics.checkNotNullParameter(views, "views");
            this.mIds = ids;
            this.mViews = views;
            this.mHasStableIds = z;
            this.mViewTypeCount = i;
            if (ids.length != views.length) {
                throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
            }
            if (i < 1) {
                throw new IllegalArgumentException("View type count must be >= 1");
            }
            ArrayList arrayList = new ArrayList(views.length);
            for (RemoteViews remoteViews : views) {
                arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
            }
            int size = d0.U(arrayList).size();
            if (size > i) {
                throw new IllegalArgumentException(a.m("View type count is set to ", i, size, ", but the collection contains ", " different layout ids").toString());
            }
        }

        public final int getItemCount() {
            return this.mIds.length;
        }

        public final long getItemId(int position) {
            return this.mIds[position];
        }

        @NotNull
        public final RemoteViews getItemView(int position) {
            return this.mViews[position];
        }

        /* JADX INFO: renamed from: getViewTypeCount, reason: from getter */
        public final int getMViewTypeCount() {
            return this.mViewTypeCount;
        }

        /* JADX INFO: renamed from: hasStableIds, reason: from getter */
        public final boolean getMHasStableIds() {
            return this.mHasStableIds;
        }

        public RemoteCollectionItems(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            long[] jArr = new long[i];
            this.mIds = jArr;
            parcel.readLongArray(jArr);
            Parcelable.Creator CREATOR = RemoteViews.CREATOR;
            Intrinsics.checkNotNullExpressionValue(CREATOR, "CREATOR");
            RemoteViews[] remoteViewsArr = new RemoteViews[i];
            parcel.readTypedArray(remoteViewsArr, CREATOR);
            Intrinsics.checkNotNullParameter(remoteViewsArr, "<this>");
            for (int i2 = 0; i2 < i; i2++) {
                if (remoteViewsArr[i2] == null) {
                    throw new IllegalArgumentException("null element found in " + remoteViewsArr + CoreConstants.DOT);
                }
            }
            this.mViews = remoteViewsArr;
            this.mHasStableIds = parcel.readInt() == 1;
            this.mViewTypeCount = parcel.readInt();
        }
    }
}
