package androidx.glance.appwidget;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.widget.RemoteViewsCompat;
import androidx.glance.Emittable;
import androidx.glance.EmittableImage;
import androidx.glance.appwidget.SizeMode;
import androidx.glance.appwidget.translators.ImageTranslatorKt;
import androidx.glance.appwidget.translators.TextTranslatorKt;
import androidx.glance.layout.Alignment;
import androidx.glance.layout.EmittableBox;
import androidx.glance.layout.EmittableColumn;
import androidx.glance.layout.EmittableRow;
import androidx.glance.layout.EmittableSpacer;
import androidx.glance.text.EmittableText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\u001aS\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0016\u001a\u001d\u0010\u0018\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001b\u001a\u00020\u001a*\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u001e\u001a\u00020\u001a*\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a!\u0010!\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010 \u001a\u00020\u0002H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0019\u0010&\u001a\u00020\u0002*\u00020#H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a\u0019\u0010&\u001a\u00020\u0002*\u00020'H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010%\u001a\u0013\u0010&\u001a\u00020\u0002*\u00020)H\u0000¢\u0006\u0004\b&\u0010*\u001a#\u0010,\u001a\u00020\u001a*\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-\u001a#\u0010/\u001a\u00020\u001a*\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020.H\u0002¢\u0006\u0004\b/\u00100\u001a#\u00102\u001a\u00020\u001a*\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u000201H\u0002¢\u0006\u0004\b2\u00103\u001a\u001d\u00104\u001a\u00020\u001a2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b4\u00105\u001a#\u00107\u001a\u00020\u001a*\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108\u001a#\u0010:\u001a\u00020\u001a*\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;\u001a1\u0010>\u001a\u00020\u001a*\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010=\u001a\u00020<2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0000¢\u0006\u0004\b>\u0010?\u001a+\u0010C\u001a\u00020\u001a*\u00020\r2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\u0002H\u0000¢\u0006\u0004\bC\u0010D\u001a\u0013\u0010E\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\bE\u0010F\"*\u0010H\u001a\u0004\u0018\u00010G8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bH\u0010I\u0012\u0004\bN\u0010O\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M\"\u0018\u0010P\u001a\u00020G*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006R"}, d2 = {"Landroid/content/Context;", "context", "", "appWidgetId", "Landroidx/glance/appwidget/RemoteViewsRoot;", "element", "Landroidx/glance/appwidget/LayoutConfiguration;", "layoutConfiguration", "rootViewIndex", "Landroidx/compose/ui/unit/DpSize;", "layoutSize", "Landroid/content/ComponentName;", "actionBroadcastReceiver", "Landroid/widget/RemoteViews;", "translateComposition-KpG6l20", "(Landroid/content/Context;ILandroidx/glance/appwidget/RemoteViewsRoot;Landroidx/glance/appwidget/LayoutConfiguration;IJLandroid/content/ComponentName;)Landroid/widget/RemoteViews;", "translateComposition", "Landroidx/glance/appwidget/TranslationContext;", "translationContext", "", "Landroidx/glance/Emittable;", "children", "(Landroidx/glance/appwidget/TranslationContext;Ljava/util/List;I)Landroid/widget/RemoteViews;", "views", "combineLandscapeAndPortrait", "(Ljava/util/List;)Landroid/widget/RemoteViews;", "", "translateChild", "(Landroid/widget/RemoteViews;Landroidx/glance/appwidget/TranslationContext;Landroidx/glance/Emittable;)V", "Landroidx/glance/appwidget/EmittableSizeBox;", "translateEmittableSizeBox", "(Landroid/widget/RemoteViews;Landroidx/glance/appwidget/TranslationContext;Landroidx/glance/appwidget/EmittableSizeBox;)V", "layoutId", "remoteViews", "(Landroidx/glance/appwidget/TranslationContext;I)Landroid/widget/RemoteViews;", "Landroidx/glance/layout/Alignment$Horizontal;", "toGravity-uMT2-20", "(I)I", "toGravity", "Landroidx/glance/layout/Alignment$Vertical;", "toGravity-Je2gTW8", "Landroidx/glance/layout/Alignment;", "(Landroidx/glance/layout/Alignment;)I", "Landroidx/glance/layout/EmittableBox;", "translateEmittableBox", "(Landroid/widget/RemoteViews;Landroidx/glance/appwidget/TranslationContext;Landroidx/glance/layout/EmittableBox;)V", "Landroidx/glance/layout/EmittableRow;", "translateEmittableRow", "(Landroid/widget/RemoteViews;Landroidx/glance/appwidget/TranslationContext;Landroidx/glance/layout/EmittableRow;)V", "Landroidx/glance/layout/EmittableColumn;", "translateEmittableColumn", "(Landroid/widget/RemoteViews;Landroidx/glance/appwidget/TranslationContext;Landroidx/glance/layout/EmittableColumn;)V", "checkSelectableGroupChildren", "(Ljava/util/List;)V", "Landroidx/glance/appwidget/EmittableAndroidRemoteViews;", "translateEmittableAndroidRemoteViews", "(Landroid/widget/RemoteViews;Landroidx/glance/appwidget/TranslationContext;Landroidx/glance/appwidget/EmittableAndroidRemoteViews;)V", "Landroidx/glance/layout/EmittableSpacer;", "translateEmittableSpacer", "(Landroid/widget/RemoteViews;Landroidx/glance/appwidget/TranslationContext;Landroidx/glance/layout/EmittableSpacer;)V", "Landroidx/glance/appwidget/InsertedViewInfo;", "parentDef", "setChildren", "(Landroid/widget/RemoteViews;Landroidx/glance/appwidget/TranslationContext;Landroidx/glance/appwidget/InsertedViewInfo;Ljava/util/List;)V", "viewId", "childView", "stableId", "addChildView", "(Landroid/widget/RemoteViews;ILandroid/widget/RemoteViews;I)V", "copy", "(Landroid/widget/RemoteViews;)Landroid/widget/RemoteViews;", "", "forceRtl", "Ljava/lang/Boolean;", "getForceRtl", "()Ljava/lang/Boolean;", "setForceRtl", "(Ljava/lang/Boolean;)V", "getForceRtl$annotations", "()V", "isRtl", "(Landroid/content/Context;)Z", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class RemoteViewsTranslatorKt {
    private static Boolean forceRtl;

    public static final void addChildView(@NotNull RemoteViews remoteViews, int i, @NotNull RemoteViews remoteViews2, int i2) {
        if (Build.VERSION.SDK_INT >= 31) {
            RemoteViewsTranslatorApi31Impl.INSTANCE.addChildView(remoteViews, i, remoteViews2, i2);
        } else {
            remoteViews.addView(i, remoteViews2);
        }
    }

    private static final void checkSelectableGroupChildren(List<? extends Emittable> list) {
        List<? extends Emittable> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        for (Emittable emittable : list2) {
        }
    }

    private static final RemoteViews combineLandscapeAndPortrait(List<? extends RemoteViews> list) {
        int size = list.size();
        if (size == 1) {
            return list.get(0);
        }
        if (size == 2) {
            return new RemoteViews(list.get(0), list.get(1));
        }
        throw new IllegalArgumentException("There must be between 1 and 2 views.");
    }

    private static final RemoteViews copy(RemoteViews remoteViews) {
        return RemoteViewsTranslatorApi28Impl.INSTANCE.copyRemoteViews(remoteViews);
    }

    private static final boolean isRtl(Context context) {
        Boolean bool = forceRtl;
        return bool != null ? bool.booleanValue() : context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    @NotNull
    public static final RemoteViews remoteViews(@NotNull TranslationContext translationContext, int i) {
        return new RemoteViews(translationContext.getContext().getPackageName(), i);
    }

    public static final void setChildren(@NotNull RemoteViews remoteViews, @NotNull TranslationContext translationContext, @NotNull InsertedViewInfo insertedViewInfo, @NotNull List<? extends Emittable> list) {
        int i = 0;
        for (Object obj2 : d0.V0(list, 10)) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            translateChild(remoteViews, translationContext.forChild(insertedViewInfo, i), (Emittable) obj2);
            i = i2;
        }
    }

    public static final int toGravity(@NotNull Alignment alignment) {
        return m3494toGravityJe2gTW8(alignment.getVertical()) | m3495toGravityuMT220(alignment.getHorizontal());
    }

    /* JADX INFO: renamed from: toGravity-Je2gTW8, reason: not valid java name */
    public static final int m3494toGravityJe2gTW8(int i) {
        Alignment.Vertical.Companion companion = Alignment.Vertical.INSTANCE;
        if (Alignment.Vertical.m3530equalsimpl0(i, companion.m3536getTopmnfRV0w())) {
            return 48;
        }
        if (Alignment.Vertical.m3530equalsimpl0(i, companion.m3534getBottommnfRV0w())) {
            return 80;
        }
        if (Alignment.Vertical.m3530equalsimpl0(i, companion.m3535getCenterVerticallymnfRV0w())) {
            return 16;
        }
        String str = "Unknown vertical alignment: " + ((Object) Alignment.Vertical.m3532toStringimpl(i));
        return 48;
    }

    /* JADX INFO: renamed from: toGravity-uMT2-20, reason: not valid java name */
    public static final int m3495toGravityuMT220(int i) {
        Alignment.Horizontal.Companion companion = Alignment.Horizontal.INSTANCE;
        if (Alignment.Horizontal.m3520equalsimpl0(i, companion.m3526getStartPGIyAqw())) {
            return 8388611;
        }
        if (Alignment.Horizontal.m3520equalsimpl0(i, companion.m3525getEndPGIyAqw())) {
            return 8388613;
        }
        if (Alignment.Horizontal.m3520equalsimpl0(i, companion.m3524getCenterHorizontallyPGIyAqw())) {
            return 1;
        }
        String str = "Unknown horizontal alignment: " + ((Object) Alignment.Horizontal.m3522toStringimpl(i));
        return 8388611;
    }

    public static final void translateChild(@NotNull RemoteViews remoteViews, @NotNull TranslationContext translationContext, @NotNull Emittable emittable) {
        if (emittable instanceof EmittableBox) {
            translateEmittableBox(remoteViews, translationContext, (EmittableBox) emittable);
            return;
        }
        if (emittable instanceof EmittableRow) {
            translateEmittableRow(remoteViews, translationContext, (EmittableRow) emittable);
            return;
        }
        if (emittable instanceof EmittableColumn) {
            translateEmittableColumn(remoteViews, translationContext, (EmittableColumn) emittable);
            return;
        }
        if (emittable instanceof EmittableText) {
            TextTranslatorKt.translateEmittableText(remoteViews, translationContext, (EmittableText) emittable);
            return;
        }
        if (emittable instanceof EmittableAndroidRemoteViews) {
            translateEmittableAndroidRemoteViews(remoteViews, translationContext, (EmittableAndroidRemoteViews) emittable);
            return;
        }
        if (emittable instanceof EmittableSpacer) {
            translateEmittableSpacer(remoteViews, translationContext, (EmittableSpacer) emittable);
            return;
        }
        if (emittable instanceof EmittableImage) {
            ImageTranslatorKt.translateEmittableImage(remoteViews, translationContext, (EmittableImage) emittable);
        } else if (emittable instanceof EmittableSizeBox) {
            translateEmittableSizeBox(remoteViews, translationContext, (EmittableSizeBox) emittable);
        } else {
            throw new IllegalArgumentException("Unknown element type " + emittable.getClass().getCanonicalName());
        }
    }

    @NotNull
    public static final RemoteViews translateComposition(@NotNull TranslationContext translationContext, @NotNull List<? extends Emittable> list, int i) {
        List<? extends Emittable> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it8 = list2.iterator();
            while (it8.hasNext()) {
                if (!(((Emittable) it8.next()) instanceof EmittableSizeBox)) {
                    Emittable emittable = (Emittable) d0.K0(list);
                    RemoteViewsInfo remoteViewsInfoCreateRootView = LayoutSelectionKt.createRootView(translationContext, emittable.getModifier(), i);
                    RemoteViews remoteViews = remoteViewsInfoCreateRootView.getRemoteViews();
                    translateChild(remoteViews, translationContext.forRoot(remoteViewsInfoCreateRootView), emittable);
                    return remoteViews;
                }
            }
        }
        Object objB0 = d0.b0(list);
        Intrinsics.i(objB0, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
        SizeMode sizeMode = ((EmittableSizeBox) objB0).getSizeMode();
        List<? extends Emittable> list3 = list;
        ArrayList arrayList = new ArrayList(w.t(list3, 10));
        for (Emittable emittable2 : list3) {
            Intrinsics.i(emittable2, "null cannot be cast to non-null type androidx.glance.appwidget.EmittableSizeBox");
            long size = ((EmittableSizeBox) emittable2).getSize();
            RemoteViewsInfo remoteViewsInfoCreateRootView2 = LayoutSelectionKt.createRootView(translationContext, emittable2.getModifier(), i);
            RemoteViews remoteViews2 = remoteViewsInfoCreateRootView2.getRemoteViews();
            translateChild(remoteViews2, translationContext.m3503forRootAndSize6HolHcs(remoteViewsInfoCreateRootView2, size), emittable2);
            arrayList.add(new Pair(AppWidgetUtilsKt.m3488toSizeFEaSLcWc(size), remoteViews2));
        }
        if (sizeMode instanceof SizeMode.Single) {
            return (RemoteViews) ((Pair) d0.K0(arrayList)).f186386b;
        }
        if (!Intrinsics.f(sizeMode, SizeMode.Exact.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.INSTANCE.createRemoteViews(r0.t(arrayList));
        }
        if (arrayList.size() != 1 && arrayList.size() != 2) {
            throw new IllegalArgumentException("unsupported views size");
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            arrayList2.add((RemoteViews) ((Pair) it9.next()).f186386b);
        }
        return combineLandscapeAndPortrait(arrayList2);
    }

    @NotNull
    /* JADX INFO: renamed from: translateComposition-KpG6l20, reason: not valid java name */
    public static final RemoteViews m3496translateCompositionKpG6l20(@NotNull Context context, int i, @NotNull RemoteViewsRoot remoteViewsRoot, LayoutConfiguration layoutConfiguration, int i2, long j2, ComponentName componentName) {
        return translateComposition(new TranslationContext(context, i, isRtl(context), layoutConfiguration, -1, false, null, null, null, j2, 0, 0, false, null, componentName, 15840, null), remoteViewsRoot.getChildren(), i2);
    }

    private static final void translateEmittableAndroidRemoteViews(RemoteViews remoteViews, TranslationContext translationContext, EmittableAndroidRemoteViews emittableAndroidRemoteViews) {
        RemoteViews remoteViewsCopy;
        if (emittableAndroidRemoteViews.getChildren().isEmpty()) {
            remoteViewsCopy = emittableAndroidRemoteViews.getRemoteViews();
        } else {
            if (emittableAndroidRemoteViews.getContainerViewId() == -1) {
                throw new IllegalStateException("To add children to an `AndroidRemoteViews`, its `containerViewId` must be set.");
            }
            remoteViewsCopy = copy(emittableAndroidRemoteViews.getRemoteViews());
            remoteViewsCopy.removeAllViews(emittableAndroidRemoteViews.getContainerViewId());
            int i = 0;
            for (Object obj2 : emittableAndroidRemoteViews.getChildren()) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                Emittable emittable = (Emittable) obj2;
                RemoteViewsInfo remoteViewsInfoCreateRootView = LayoutSelectionKt.createRootView(translationContext, emittable.getModifier(), i);
                RemoteViews remoteViews2 = remoteViewsInfoCreateRootView.getRemoteViews();
                translateChild(remoteViews2, translationContext.forRoot(remoteViewsInfoCreateRootView), emittable);
                addChildView(remoteViewsCopy, emittableAndroidRemoteViews.getContainerViewId(), remoteViews2, i);
                i = i2;
            }
        }
        InsertedViewInfo insertedViewInfoInsertView = LayoutSelectionKt.insertView(remoteViews, translationContext, LayoutType.Frame, emittableAndroidRemoteViews.getModifier());
        ApplyModifiersKt.applyModifiers(translationContext, remoteViews, emittableAndroidRemoteViews.getModifier(), insertedViewInfoInsertView);
        remoteViews.removeAllViews(insertedViewInfoInsertView.getMainViewId());
        addChildView(remoteViews, insertedViewInfoInsertView.getMainViewId(), remoteViewsCopy, 0);
    }

    private static final void translateEmittableBox(RemoteViews remoteViews, TranslationContext translationContext, EmittableBox emittableBox) {
        InsertedViewInfo insertedViewInfoM3493insertContainerViewnVsUan0 = LayoutSelectionKt.m3493insertContainerViewnVsUan0(remoteViews, translationContext, LayoutType.Box, emittableBox.getChildren().size(), emittableBox.getModifier(), Alignment.Horizontal.m3517boximpl(emittableBox.getContentAlignment().getHorizontal()), Alignment.Vertical.m3527boximpl(emittableBox.getContentAlignment().getVertical()));
        ApplyModifiersKt.applyModifiers(translationContext, remoteViews, emittableBox.getModifier(), insertedViewInfoM3493insertContainerViewnVsUan0);
        for (Emittable emittable : emittableBox.getChildren()) {
            emittable.setModifier(emittable.getModifier().then(new AlignmentModifier(emittableBox.getContentAlignment())));
        }
        setChildren(remoteViews, translationContext, insertedViewInfoM3493insertContainerViewnVsUan0, emittableBox.getChildren());
    }

    private static final void translateEmittableColumn(RemoteViews remoteViews, TranslationContext translationContext, EmittableColumn emittableColumn) {
        InsertedViewInfo insertedViewInfoM3493insertContainerViewnVsUan0 = LayoutSelectionKt.m3493insertContainerViewnVsUan0(remoteViews, translationContext, (Build.VERSION.SDK_INT < 31 || !RadioButtonKt.isSelectableGroup(emittableColumn.getModifier())) ? LayoutType.Column : LayoutType.RadioColumn, emittableColumn.getChildren().size(), emittableColumn.getModifier(), Alignment.Horizontal.m3517boximpl(emittableColumn.getHorizontalAlignment()), null);
        RemoteViewsCompat.setLinearLayoutGravity(remoteViews, insertedViewInfoM3493insertContainerViewnVsUan0.getMainViewId(), toGravity(new Alignment(emittableColumn.getHorizontalAlignment(), emittableColumn.getVerticalAlignment(), null)));
        ApplyModifiersKt.applyModifiers(translationContext.canUseSelectableGroup(), remoteViews, emittableColumn.getModifier(), insertedViewInfoM3493insertContainerViewnVsUan0);
        setChildren(remoteViews, translationContext, insertedViewInfoM3493insertContainerViewnVsUan0, emittableColumn.getChildren());
        if (RadioButtonKt.isSelectableGroup(emittableColumn.getModifier())) {
            checkSelectableGroupChildren(emittableColumn.getChildren());
        }
    }

    private static final void translateEmittableRow(RemoteViews remoteViews, TranslationContext translationContext, EmittableRow emittableRow) {
        InsertedViewInfo insertedViewInfoM3493insertContainerViewnVsUan0 = LayoutSelectionKt.m3493insertContainerViewnVsUan0(remoteViews, translationContext, (Build.VERSION.SDK_INT < 31 || !RadioButtonKt.isSelectableGroup(emittableRow.getModifier())) ? LayoutType.Row : LayoutType.RadioRow, emittableRow.getChildren().size(), emittableRow.getModifier(), null, Alignment.Vertical.m3527boximpl(emittableRow.getVerticalAlignment()));
        RemoteViewsCompat.setLinearLayoutGravity(remoteViews, insertedViewInfoM3493insertContainerViewnVsUan0.getMainViewId(), toGravity(new Alignment(emittableRow.getHorizontalAlignment(), emittableRow.getVerticalAlignment(), null)));
        ApplyModifiersKt.applyModifiers(translationContext.canUseSelectableGroup(), remoteViews, emittableRow.getModifier(), insertedViewInfoM3493insertContainerViewnVsUan0);
        setChildren(remoteViews, translationContext, insertedViewInfoM3493insertContainerViewnVsUan0, emittableRow.getChildren());
        if (RadioButtonKt.isSelectableGroup(emittableRow.getModifier())) {
            checkSelectableGroupChildren(emittableRow.getChildren());
        }
    }

    public static final void translateEmittableSizeBox(@NotNull RemoteViews remoteViews, @NotNull TranslationContext translationContext, @NotNull EmittableSizeBox emittableSizeBox) {
        if (emittableSizeBox.getChildren().size() > 1) {
            throw new IllegalArgumentException(("Size boxes can only have at most one child " + emittableSizeBox.getChildren().size() + ". The normalization of the composition tree failed.").toString());
        }
        Emittable emittable = (Emittable) d0.d0(emittableSizeBox.getChildren());
        if (emittable != null) {
            translateChild(remoteViews, translationContext, emittable);
        }
    }

    private static final void translateEmittableSpacer(RemoteViews remoteViews, TranslationContext translationContext, EmittableSpacer emittableSpacer) {
        ApplyModifiersKt.applyModifiers(translationContext, remoteViews, emittableSpacer.getModifier(), LayoutSelectionKt.insertView(remoteViews, translationContext, LayoutType.Frame, emittableSpacer.getModifier()));
    }
}
