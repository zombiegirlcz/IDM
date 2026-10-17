package androidx.glance.appwidget;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.widget.RemoteViews;
import androidx.compose.ui.graphics.ColorKt;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.AndroidResourceImageProvider;
import androidx.glance.BackgroundModifier;
import androidx.glance.GlanceModifier;
import androidx.glance.ImageProvider;
import androidx.glance.Visibility;
import androidx.glance.action.ActionModifier;
import androidx.glance.appwidget.action.ApplyActionKt;
import androidx.glance.layout.HeightModifier;
import androidx.glance.layout.PaddingInDp;
import androidx.glance.layout.PaddingModifier;
import androidx.glance.layout.WidthModifier;
import androidx.glance.semantics.SemanticsModifier;
import androidx.glance.semantics.SemanticsProperties;
import androidx.glance.unit.ColorProvider;
import androidx.glance.unit.Dimension;
import androidx.glance.unit.FixedColorProvider;
import androidx.glance.unit.ResourceColorProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002\u001a(\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\rH\u0000\u001a \u0010\u0013\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0002\u001a(\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a(\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a4\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\f\u0010\u001e\u001a\u00020\u0015*\u00020\u001fH\u0002\"\u001a\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006 "}, d2 = {"isFixed", "", "Landroidx/glance/unit/Dimension;", "(Landroidx/glance/unit/Dimension;)Z", "applyBackgroundModifier", "", "context", "Landroid/content/Context;", "rv", "Landroid/widget/RemoteViews;", "modifier", "Landroidx/glance/BackgroundModifier;", "viewDef", "Landroidx/glance/appwidget/InsertedViewInfo;", "applyModifiers", "translationContext", "Landroidx/glance/appwidget/TranslationContext;", "modifiers", "Landroidx/glance/GlanceModifier;", "applyRoundedCorners", "viewId", "", "radius", "applySimpleHeightModifier", "Landroidx/glance/layout/HeightModifier;", "applySimpleWidthModifier", "Landroidx/glance/layout/WidthModifier;", "applySizeModifiers", "widthModifier", "heightModifier", "toViewVisibility", "Landroidx/glance/Visibility;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ApplyModifiersKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Visibility.values().length];
            try {
                iArr[Visibility.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Visibility.Invisible.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Visibility.Gone.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.ApplyModifiersKt$applyModifiers$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "modifier", "Landroidx/glance/GlanceModifier$Element;", "invoke", "(Lkotlin/Unit;Landroidx/glance/GlanceModifier$Element;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function2<Unit, GlanceModifier.Element, Unit> {
        final /* synthetic */ Ref$ObjectRef $actionModifier;
        final /* synthetic */ Ref$ObjectRef $clipToOutline;
        final /* synthetic */ Context $context;
        final /* synthetic */ Ref$ObjectRef $cornerRadius;
        final /* synthetic */ Ref$ObjectRef $enabled;
        final /* synthetic */ Ref$ObjectRef $heightModifier;
        final /* synthetic */ Ref$ObjectRef $paddingModifiers;
        final /* synthetic */ RemoteViews $rv;
        final /* synthetic */ Ref$ObjectRef $semanticsModifier;
        final /* synthetic */ TranslationContext $translationContext;
        final /* synthetic */ InsertedViewInfo $viewDef;
        final /* synthetic */ Ref$ObjectRef $visibility;
        final /* synthetic */ Ref$ObjectRef $widthModifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Context context, RemoteViews remoteViews, InsertedViewInfo insertedViewInfo, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5, Ref$ObjectRef ref$ObjectRef6, TranslationContext translationContext, Ref$ObjectRef ref$ObjectRef7, Ref$ObjectRef ref$ObjectRef8, Ref$ObjectRef ref$ObjectRef9) {
            super(2);
            this.$actionModifier = ref$ObjectRef;
            this.$widthModifier = ref$ObjectRef2;
            this.$heightModifier = ref$ObjectRef3;
            this.$context = context;
            this.$rv = remoteViews;
            this.$viewDef = insertedViewInfo;
            this.$paddingModifiers = ref$ObjectRef4;
            this.$visibility = ref$ObjectRef5;
            this.$cornerRadius = ref$ObjectRef6;
            this.$translationContext = translationContext;
            this.$clipToOutline = ref$ObjectRef7;
            this.$enabled = ref$ObjectRef8;
            this.$semanticsModifier = ref$ObjectRef9;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
            invoke((Unit) obj2, (GlanceModifier.Element) obj3);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull Unit unit, @NotNull GlanceModifier.Element element) {
            PaddingModifier paddingModifierPlus;
            if (element instanceof ActionModifier) {
                if (this.$actionModifier.f186409a != null) {
                }
                this.$actionModifier.f186409a = element;
                return;
            }
            if (element instanceof WidthModifier) {
                this.$widthModifier.f186409a = element;
                return;
            }
            if (element instanceof HeightModifier) {
                this.$heightModifier.f186409a = element;
                return;
            }
            if (element instanceof BackgroundModifier) {
                ApplyModifiersKt.applyBackgroundModifier(this.$context, this.$rv, (BackgroundModifier) element, this.$viewDef);
                return;
            }
            if (element instanceof PaddingModifier) {
                Ref$ObjectRef ref$ObjectRef = this.$paddingModifiers;
                PaddingModifier paddingModifier = (PaddingModifier) ref$ObjectRef.f186409a;
                if (paddingModifier == null || (paddingModifierPlus = paddingModifier.plus((PaddingModifier) element)) == null) {
                    paddingModifierPlus = (PaddingModifier) element;
                }
                ref$ObjectRef.f186409a = paddingModifierPlus;
                return;
            }
            if (element instanceof CornerRadiusModifier) {
                this.$cornerRadius.f186409a = ((CornerRadiusModifier) element).getRadius();
                return;
            }
            if ((element instanceof AppWidgetBackgroundModifier) || (element instanceof AlignmentModifier)) {
                return;
            }
            if (element instanceof EnabledModifier) {
                this.$enabled.f186409a = element;
                return;
            }
            if (element instanceof SemanticsModifier) {
                this.$semanticsModifier.f186409a = element;
                return;
            }
            String str = "Unknown modifier '" + element + "', nothing done.";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyBackgroundModifier(Context context, RemoteViews remoteViews, BackgroundModifier backgroundModifier, InsertedViewInfo insertedViewInfo) {
        int mainViewId = insertedViewInfo.getMainViewId();
        ImageProvider imageProvider = backgroundModifier.getImageProvider();
        if (imageProvider != null) {
            if (imageProvider instanceof AndroidResourceImageProvider) {
                RemoteViewsCompat.setViewBackgroundResource(remoteViews, mainViewId, ((AndroidResourceImageProvider) imageProvider).getResId());
                return;
            }
            return;
        }
        ColorProvider colorProvider = backgroundModifier.getColorProvider();
        if (colorProvider instanceof FixedColorProvider) {
            RemoteViewsCompat.setViewBackgroundColor(remoteViews, mainViewId, ColorKt.m2002toArgb8_81llA(((FixedColorProvider) colorProvider).getColor()));
        } else {
            if (colorProvider instanceof ResourceColorProvider) {
                RemoteViewsCompat.setViewBackgroundColorResource(remoteViews, mainViewId, ((ResourceColorProvider) colorProvider).getResId());
                return;
            }
            String str = "Unexpected background color modifier: " + colorProvider;
        }
    }

    public static final void applyModifiers(@NotNull TranslationContext translationContext, @NotNull RemoteViews remoteViews, @NotNull GlanceModifier glanceModifier, @NotNull InsertedViewInfo insertedViewInfo) {
        List list;
        Context context = translationContext.getContext();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef5 = new Ref$ObjectRef();
        ref$ObjectRef5.f186409a = Visibility.Visible;
        Ref$ObjectRef ref$ObjectRef6 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef7 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef8 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef9 = new Ref$ObjectRef();
        glanceModifier.foldIn(Unit.f186387a, new AnonymousClass1(ref$ObjectRef6, ref$ObjectRef, ref$ObjectRef2, context, remoteViews, insertedViewInfo, ref$ObjectRef3, ref$ObjectRef5, ref$ObjectRef4, translationContext, ref$ObjectRef8, ref$ObjectRef7, ref$ObjectRef9));
        applySizeModifiers(translationContext, remoteViews, (WidthModifier) ref$ObjectRef.f186409a, (HeightModifier) ref$ObjectRef2.f186409a, insertedViewInfo);
        ActionModifier actionModifier = (ActionModifier) ref$ObjectRef6.f186409a;
        if (actionModifier != null) {
            ApplyActionKt.applyAction(translationContext, remoteViews, actionModifier.getAction(), insertedViewInfo.getMainViewId());
        }
        Dimension dimension = (Dimension) ref$ObjectRef4.f186409a;
        if (dimension != null) {
            applyRoundedCorners(remoteViews, insertedViewInfo.getMainViewId(), dimension);
        }
        PaddingModifier paddingModifier = (PaddingModifier) ref$ObjectRef3.f186409a;
        if (paddingModifier != null) {
            PaddingInDp absolute = paddingModifier.toDp(context.getResources()).toAbsolute(translationContext.getIsRtl());
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            remoteViews.setViewPadding(insertedViewInfo.getMainViewId(), UtilsKt.m3506toPixelsD5KLDUw(absolute.getLeft(), displayMetrics), UtilsKt.m3506toPixelsD5KLDUw(absolute.getTop(), displayMetrics), UtilsKt.m3506toPixelsD5KLDUw(absolute.getRight(), displayMetrics), UtilsKt.m3506toPixelsD5KLDUw(absolute.getBottom(), displayMetrics));
        }
        if (ref$ObjectRef8.f186409a != null) {
            throw new ClassCastException();
        }
        SemanticsModifier semanticsModifier = (SemanticsModifier) ref$ObjectRef9.f186409a;
        if (semanticsModifier != null && (list = (List) semanticsModifier.getConfiguration().getOrNull(SemanticsProperties.INSTANCE.getContentDescription())) != null) {
            remoteViews.setContentDescription(insertedViewInfo.getMainViewId(), d0.k0(list, null, null, null, 0, null, 63));
        }
        remoteViews.setViewVisibility(insertedViewInfo.getMainViewId(), toViewVisibility((Visibility) ref$ObjectRef5.f186409a));
    }

    private static final void applyRoundedCorners(RemoteViews remoteViews, int i, Dimension dimension) {
        if (Build.VERSION.SDK_INT >= 31) {
            ApplyModifiersApi31Impl.INSTANCE.applyRoundedCorners(remoteViews, i, dimension);
        }
    }

    public static final void applySimpleHeightModifier(@NotNull Context context, @NotNull RemoteViews remoteViews, @NotNull HeightModifier heightModifier, int i) {
        Dimension height = heightModifier.getHeight();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            if (i2 >= 33 || !v.k(Dimension.Wrap.INSTANCE, Dimension.Expand.INSTANCE).contains(height)) {
                ApplyModifiersApi31Impl.INSTANCE.setViewHeight(remoteViews, i, height);
                return;
            }
            return;
        }
        if (v.k(Dimension.Wrap.INSTANCE, Dimension.Fill.INSTANCE, Dimension.Expand.INSTANCE).contains(LayoutSelectionKt.resolveDimension(height, context))) {
            return;
        }
        throw new IllegalArgumentException("Using a height of " + height + " requires a complex layout before API 31");
    }

    public static final void applySimpleWidthModifier(@NotNull Context context, @NotNull RemoteViews remoteViews, @NotNull WidthModifier widthModifier, int i) {
        Dimension width = widthModifier.getWidth();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            if (i2 >= 33 || !v.k(Dimension.Wrap.INSTANCE, Dimension.Expand.INSTANCE).contains(width)) {
                ApplyModifiersApi31Impl.INSTANCE.setViewWidth(remoteViews, i, width);
                return;
            }
            return;
        }
        if (v.k(Dimension.Wrap.INSTANCE, Dimension.Fill.INSTANCE, Dimension.Expand.INSTANCE).contains(LayoutSelectionKt.resolveDimension(width, context))) {
            return;
        }
        throw new IllegalArgumentException("Using a width of " + width + " requires a complex layout before API 31");
    }

    private static final void applySizeModifiers(TranslationContext translationContext, RemoteViews remoteViews, WidthModifier widthModifier, HeightModifier heightModifier, InsertedViewInfo insertedViewInfo) {
        Context context = translationContext.getContext();
        if (LayoutSelectionKt.isSimple(insertedViewInfo)) {
            if (widthModifier != null) {
                applySimpleWidthModifier(context, remoteViews, widthModifier, insertedViewInfo.getMainViewId());
            }
            if (heightModifier != null) {
                applySimpleHeightModifier(context, remoteViews, heightModifier, insertedViewInfo.getMainViewId());
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            throw new IllegalStateException("There is currently no valid use case where a complex view is used on Android S");
        }
        Dimension width = widthModifier != null ? widthModifier.getWidth() : null;
        Dimension height = heightModifier != null ? heightModifier.getHeight() : null;
        if (isFixed(width) || isFixed(height)) {
            boolean z = (width instanceof Dimension.Fill) || (width instanceof Dimension.Expand);
            boolean z3 = (height instanceof Dimension.Fill) || (height instanceof Dimension.Expand);
            int iInflateViewStub$default = UtilsKt.inflateViewStub$default(remoteViews, translationContext, R$id.sizeViewStub, (z && z3) ? R$layout.size_match_match : z ? R$layout.size_match_wrap : z3 ? R$layout.size_wrap_match : R$layout.size_wrap_wrap, null, 8, null);
            if (width instanceof Dimension.Dp) {
                RemoteViewsCompat.setTextViewWidth(remoteViews, iInflateViewStub$default, applySizeModifiers$toPixels((Dimension.Dp) width, context));
            } else if (width instanceof Dimension.Resource) {
                RemoteViewsCompat.setTextViewWidth(remoteViews, iInflateViewStub$default, applySizeModifiers$toPixels$9((Dimension.Resource) width, context));
            } else {
                if (!((Intrinsics.f(width, Dimension.Expand.INSTANCE) ? true : Intrinsics.f(width, Dimension.Fill.INSTANCE) ? true : Intrinsics.f(width, Dimension.Wrap.INSTANCE)) || width == null)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            Unit unit = Unit.f186387a;
            if (height instanceof Dimension.Dp) {
                RemoteViewsCompat.setTextViewHeight(remoteViews, iInflateViewStub$default, applySizeModifiers$toPixels((Dimension.Dp) height, context));
            } else if (height instanceof Dimension.Resource) {
                RemoteViewsCompat.setTextViewHeight(remoteViews, iInflateViewStub$default, applySizeModifiers$toPixels$9((Dimension.Resource) height, context));
            } else {
                if (!((Intrinsics.f(height, Dimension.Expand.INSTANCE) ? true : Intrinsics.f(height, Dimension.Fill.INSTANCE) ? true : Intrinsics.f(height, Dimension.Wrap.INSTANCE)) || height == null)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    private static final int applySizeModifiers$toPixels(Dimension.Dp dp2, Context context) {
        return UtilsKt.m3505toPixelsD5KLDUw(dp2.getDp(), context);
    }

    private static final int applySizeModifiers$toPixels$9(Dimension.Resource resource, Context context) {
        return context.getResources().getDimensionPixelSize(resource.getRes());
    }

    private static final boolean isFixed(Dimension dimension) {
        boolean z = true;
        if (dimension instanceof Dimension.Dp ? true : dimension instanceof Dimension.Resource) {
            return true;
        }
        if (!(Intrinsics.f(dimension, Dimension.Expand.INSTANCE) ? true : Intrinsics.f(dimension, Dimension.Fill.INSTANCE) ? true : Intrinsics.f(dimension, Dimension.Wrap.INSTANCE)) && dimension != null) {
            z = false;
        }
        if (z) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final int toViewVisibility(Visibility visibility) {
        int i = WhenMappings.$EnumSwitchMapping$0[visibility.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 8;
        }
        throw new NoWhenBranchMatchedException();
    }
}
