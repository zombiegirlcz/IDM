package androidx.glance.appwidget;

import a0.d;
import android.R;
import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.compose.ui.unit.Dp;
import androidx.glance.GlanceModifier;
import androidx.glance.layout.Alignment;
import androidx.glance.layout.HeightModifier;
import androidx.glance.layout.WidthModifier;
import androidx.glance.unit.Dimension;
import ehe.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u001a\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u001a\u001aK\u0010\u001b\u001a\u00020\n*\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\"\u001a$\u0010#\u001a\u00020\n*\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u001a&\u0010$\u001a\u00020\n*\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010%\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u001a\u0014\u0010&\u001a\u00020'*\u00020'2\u0006\u0010(\u001a\u00020)H\u0000\u001a,\u0010*\u001a\u00020\u0003*\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0003\u001a\f\u0010,\u001a\u00020\u0016*\u00020'H\u0002\u001a\f\u0010-\u001a\u00020\u0016*\u00020\u0016H\u0002\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0018\u0010\b\u001a\u00020\t*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"LayoutMap", "", "Landroidx/glance/appwidget/LayoutType;", "", "RootAliasTypeCount", "TopLevelLayoutsCount", "getTopLevelLayoutsCount", "()I", "isSimple", "", "Landroidx/glance/appwidget/InsertedViewInfo;", "(Landroidx/glance/appwidget/InsertedViewInfo;)Z", "createRootView", "Landroidx/glance/appwidget/RemoteViewsInfo;", "translationContext", "Landroidx/glance/appwidget/TranslationContext;", "modifier", "Landroidx/glance/GlanceModifier;", "aliasIndex", "makeViewStubSelector", "Landroidx/glance/appwidget/SizeSelector;", "width", "Landroidx/glance/appwidget/LayoutSize;", "height", "selectLayout33", "type", "(Landroidx/glance/appwidget/LayoutType;Landroidx/glance/GlanceModifier;)Ljava/lang/Integer;", "insertContainerView", "Landroid/widget/RemoteViews;", "numChildren", "horizontalAlignment", "Landroidx/glance/layout/Alignment$Horizontal;", "verticalAlignment", "Landroidx/glance/layout/Alignment$Vertical;", "insertContainerView-nVsUan0", "insertView", "insertViewInternal", "childLayout", "resolveDimension", "Landroidx/glance/unit/Dimension;", "context", "Landroid/content/Context;", "selectChild", "pos", "toSpecSize", "toViewStubSize", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class LayoutSelectionKt {

    @NotNull
    private static final Map<LayoutType, Integer> LayoutMap = r0.k(new Pair(LayoutType.Text, Integer.valueOf(R$layout.glance_text)), new Pair(LayoutType.List, Integer.valueOf(R$layout.glance_list)), new Pair(LayoutType.CheckBox, Integer.valueOf(R$layout.glance_check_box)), new Pair(LayoutType.CheckBoxBackport, Integer.valueOf(R$layout.glance_check_box_backport)), new Pair(LayoutType.Button, Integer.valueOf(R$layout.glance_button)), new Pair(LayoutType.Swtch, Integer.valueOf(R$layout.glance_swtch)), new Pair(LayoutType.SwtchBackport, Integer.valueOf(R$layout.glance_swtch_backport)), new Pair(LayoutType.Frame, Integer.valueOf(R$layout.glance_frame)), new Pair(LayoutType.ImageCrop, Integer.valueOf(R$layout.glance_image_crop)), new Pair(LayoutType.ImageCropDecorative, Integer.valueOf(R$layout.glance_image_crop_decorative)), new Pair(LayoutType.ImageFit, Integer.valueOf(R$layout.glance_image_fit)), new Pair(LayoutType.ImageFitDecorative, Integer.valueOf(R$layout.glance_image_fit_decorative)), new Pair(LayoutType.ImageFillBounds, Integer.valueOf(R$layout.glance_image_fill_bounds)), new Pair(LayoutType.ImageFillBoundsDecorative, Integer.valueOf(R$layout.glance_image_fill_bounds_decorative)), new Pair(LayoutType.LinearProgressIndicator, Integer.valueOf(R$layout.glance_linear_progress_indicator)), new Pair(LayoutType.CircularProgressIndicator, Integer.valueOf(R$layout.glance_circular_progress_indicator)), new Pair(LayoutType.VerticalGridOneColumn, Integer.valueOf(R$layout.glance_vertical_grid_one_column)), new Pair(LayoutType.VerticalGridTwoColumns, Integer.valueOf(R$layout.glance_vertical_grid_two_columns)), new Pair(LayoutType.VerticalGridThreeColumns, Integer.valueOf(R$layout.glance_vertical_grid_three_columns)), new Pair(LayoutType.VerticalGridFourColumns, Integer.valueOf(R$layout.glance_vertical_grid_four_columns)), new Pair(LayoutType.VerticalGridFiveColumns, Integer.valueOf(R$layout.glance_vertical_grid_five_columns)), new Pair(LayoutType.VerticalGridAutoFit, Integer.valueOf(R$layout.glance_vertical_grid_auto_fit)), new Pair(LayoutType.RadioButton, Integer.valueOf(R$layout.glance_radio_button)), new Pair(LayoutType.RadioButtonBackport, Integer.valueOf(R$layout.glance_radio_button_backport)));
    private static final int RootAliasTypeCount;
    private static final int TopLevelLayoutsCount;

    static {
        int size = GeneratedLayoutsKt.getGeneratedRootLayoutShifts().size();
        RootAliasTypeCount = size;
        TopLevelLayoutsCount = Build.VERSION.SDK_INT >= 31 ? GeneratedLayoutsKt.getRootAliasCount() : GeneratedLayoutsKt.getRootAliasCount() / size;
    }

    @NotNull
    public static final RemoteViewsInfo createRootView(@NotNull TranslationContext translationContext, @NotNull GlanceModifier glanceModifier, int i) {
        Object objResolveDimension;
        Object objResolveDimension2;
        Dimension height;
        Dimension width;
        Context context = translationContext.getContext();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            if (i >= GeneratedLayoutsKt.getRootAliasCount()) {
                throw new IllegalArgumentException(("Index of the root view cannot be more than " + GeneratedLayoutsKt.getRootAliasCount() + ", currently " + i).toString());
            }
            LayoutSize layoutSize = LayoutSize.Wrap;
            SizeSelector sizeSelector = new SizeSelector(layoutSize, layoutSize);
            RemoteViews remoteViews = RemoteViewsTranslatorKt.remoteViews(translationContext, GeneratedLayoutsKt.getFirstRootAlias() + i);
            WidthModifier widthModifier = (WidthModifier) glanceModifier.foldIn(null, LayoutSelectionKt$createRootView$lambda$3$$inlined$findModifier$1.INSTANCE);
            if (widthModifier != null) {
                ApplyModifiersKt.applySimpleWidthModifier(context, remoteViews, widthModifier, R$id.rootView);
            }
            HeightModifier heightModifier = (HeightModifier) glanceModifier.foldIn(null, LayoutSelectionKt$createRootView$lambda$3$$inlined$findModifier$2.INSTANCE);
            if (heightModifier != null) {
                ApplyModifiersKt.applySimpleHeightModifier(context, remoteViews, heightModifier, R$id.rootView);
            }
            if (i2 >= 33) {
                remoteViews.removeAllViews(R$id.rootView);
            }
            return new RemoteViewsInfo(remoteViews, new InsertedViewInfo(R$id.rootView, 0, i2 >= 33 ? r0.g() : q0.c(new Pair(0, q0.c(new Pair(sizeSelector, Integer.valueOf(R$id.rootStubId))))), 2, null));
        }
        int i3 = RootAliasTypeCount;
        if (i3 * i >= GeneratedLayoutsKt.getRootAliasCount()) {
            throw new IllegalArgumentException(("Index of the root view cannot be more than " + (GeneratedLayoutsKt.getRootAliasCount() / 4) + ", currently " + i).toString());
        }
        WidthModifier widthModifier2 = (WidthModifier) glanceModifier.foldIn(null, LayoutSelectionKt$createRootView$$inlined$findModifier$1.INSTANCE);
        if (widthModifier2 == null || (width = widthModifier2.getWidth()) == null || (objResolveDimension = resolveDimension(width, context)) == null) {
            objResolveDimension = Dimension.Wrap.INSTANCE;
        }
        HeightModifier heightModifier2 = (HeightModifier) glanceModifier.foldIn(null, LayoutSelectionKt$createRootView$$inlined$findModifier$2.INSTANCE);
        if (heightModifier2 == null || (height = heightModifier2.getHeight()) == null || (objResolveDimension2 = resolveDimension(height, context)) == null) {
            objResolveDimension2 = Dimension.Wrap.INSTANCE;
        }
        Dimension.Fill fill = Dimension.Fill.INSTANCE;
        LayoutSize layoutSize2 = Intrinsics.f(objResolveDimension, fill) ? LayoutSize.MatchParent : LayoutSize.Wrap;
        LayoutSize layoutSize3 = Intrinsics.f(objResolveDimension2, fill) ? LayoutSize.MatchParent : LayoutSize.Wrap;
        SizeSelector sizeSelectorMakeViewStubSelector = makeViewStubSelector(layoutSize2, layoutSize3);
        Integer num = GeneratedLayoutsKt.getGeneratedRootLayoutShifts().get(sizeSelectorMakeViewStubSelector);
        if (num != null) {
            return new RemoteViewsInfo(RemoteViewsTranslatorKt.remoteViews(translationContext, n.a(i3, i, GeneratedLayoutsKt.getFirstRootAlias(), num.intValue())), new InsertedViewInfo(0, 0, q0.c(new Pair(0, q0.c(new Pair(sizeSelectorMakeViewStubSelector, Integer.valueOf(R$id.rootStubId))))), 3, null));
        }
        throw new IllegalStateException("Cannot find root element for size [" + layoutSize2 + ", " + layoutSize3 + ']');
    }

    public static final int getTopLevelLayoutsCount() {
        return TopLevelLayoutsCount;
    }

    @NotNull
    /* JADX INFO: renamed from: insertContainerView-nVsUan0, reason: not valid java name */
    public static final InsertedViewInfo m3493insertContainerViewnVsUan0(@NotNull RemoteViews remoteViews, @NotNull TranslationContext translationContext, @NotNull LayoutType layoutType, int i, @NotNull GlanceModifier glanceModifier, Alignment.Horizontal horizontal, Alignment.Vertical vertical) {
        if (i > 10) {
            String str = "Truncated " + layoutType + " container from " + i + " to 10 elements";
            new IllegalArgumentException(layoutType + " container cannot have more than 10 elements");
        }
        int i2 = i > 10 ? 10 : i;
        Integer numSelectLayout33 = selectLayout33(layoutType, glanceModifier);
        if (numSelectLayout33 == null) {
            ContainerInfo containerInfo = GeneratedLayoutsKt.getGeneratedContainers().get(new ContainerSelector(layoutType, i2, horizontal, vertical, null));
            numSelectLayout33 = containerInfo != null ? Integer.valueOf(containerInfo.getLayoutId()) : null;
            if (numSelectLayout33 == null) {
                throw new IllegalArgumentException("Cannot find container " + layoutType + " with " + i + " children");
            }
        }
        int iIntValue = numSelectLayout33.intValue();
        Map<Integer, Map<SizeSelector, Integer>> map = GeneratedLayoutsKt.getGeneratedChildren().get(layoutType);
        if (map == null) {
            throw new IllegalArgumentException("Cannot find generated children for " + layoutType);
        }
        InsertedViewInfo insertedViewInfoCopy$default = InsertedViewInfo.copy$default(insertViewInternal(remoteViews, translationContext, iIntValue, glanceModifier), 0, 0, map, 3, null);
        if (Build.VERSION.SDK_INT >= 33) {
            remoteViews.removeAllViews(insertedViewInfoCopy$default.getMainViewId());
        }
        return insertedViewInfoCopy$default;
    }

    @NotNull
    public static final InsertedViewInfo insertView(@NotNull RemoteViews remoteViews, @NotNull TranslationContext translationContext, @NotNull LayoutType layoutType, @NotNull GlanceModifier glanceModifier) {
        Integer numSelectLayout33 = selectLayout33(layoutType, glanceModifier);
        if (numSelectLayout33 != null || (numSelectLayout33 = LayoutMap.get(layoutType)) != null) {
            return insertViewInternal(remoteViews, translationContext, numSelectLayout33.intValue(), glanceModifier);
        }
        throw new IllegalArgumentException("Cannot use `insertView` with a container like " + layoutType);
    }

    private static final InsertedViewInfo insertViewInternal(RemoteViews remoteViews, TranslationContext translationContext, int i, GlanceModifier glanceModifier) {
        Dimension width;
        Dimension height;
        int itemPosition = translationContext.getItemPosition();
        Integer numValueOf = null;
        WidthModifier widthModifier = (WidthModifier) glanceModifier.foldIn(null, LayoutSelectionKt$insertViewInternal$$inlined$findModifier$1.INSTANCE);
        if (widthModifier == null || (width = widthModifier.getWidth()) == null) {
            width = Dimension.Wrap.INSTANCE;
        }
        HeightModifier heightModifier = (HeightModifier) glanceModifier.foldIn(null, LayoutSelectionKt$insertViewInternal$$inlined$findModifier$2.INSTANCE);
        if (heightModifier == null || (height = heightModifier.getHeight()) == null) {
            height = Dimension.Wrap.INSTANCE;
        }
        if (!glanceModifier.all(LayoutSelectionKt$insertViewInternal$specifiedViewId$1.INSTANCE)) {
            if (translationContext.getIsBackgroundSpecified().getAndSet(true)) {
                throw new IllegalStateException("At most one view can be set as AppWidgetBackground.");
            }
            numValueOf = Integer.valueOf(R.id.background);
        }
        Integer num = numValueOf;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            int iIntValue = num != null ? num.intValue() : translationContext.nextViewId();
            RemoteViewsTranslatorKt.addChildView(remoteViews, translationContext.getParentContext().getMainViewId(), LayoutSelectionApi31Impl.INSTANCE.remoteViews(translationContext.getContext().getPackageName(), i, iIntValue), itemPosition);
            return new InsertedViewInfo(iIntValue, 0, null, 6, null);
        }
        if (i2 >= 31) {
            Dimension.Expand expand = Dimension.Expand.INSTANCE;
            return new InsertedViewInfo(UtilsKt.inflateViewStub(remoteViews, translationContext, selectChild(remoteViews, translationContext, itemPosition, Intrinsics.f(width, expand) ? LayoutSize.Expand : LayoutSize.Wrap, Intrinsics.f(height, expand) ? LayoutSize.Expand : LayoutSize.Wrap), i, num), 0, null, 6, null);
        }
        Context context = translationContext.getContext();
        LayoutSize specSize = toSpecSize(resolveDimension(width, context));
        LayoutSize specSize2 = toSpecSize(resolveDimension(height, context));
        int iSelectChild = selectChild(remoteViews, translationContext, itemPosition, specSize, specSize2);
        LayoutSize layoutSize = LayoutSize.Fixed;
        if (specSize != layoutSize && specSize2 != layoutSize) {
            return new InsertedViewInfo(UtilsKt.inflateViewStub(remoteViews, translationContext, iSelectChild, i, num), 0, null, 6, null);
        }
        LayoutInfo layoutInfo = GeneratedLayoutsKt.getGeneratedComplexLayouts().get(new SizeSelector(specSize, specSize2));
        if (layoutInfo != null) {
            return new InsertedViewInfo(UtilsKt.inflateViewStub(remoteViews, translationContext, R$id.glanceViewStub, i, num), UtilsKt.inflateViewStub$default(remoteViews, translationContext, iSelectChild, layoutInfo.getLayoutId(), null, 8, null), null, 4, null);
        }
        throw new IllegalArgumentException("Could not find complex layout for width=" + specSize + ", height=" + specSize2);
    }

    public static final boolean isSimple(@NotNull InsertedViewInfo insertedViewInfo) {
        return insertedViewInfo.getComplexViewId() == -1;
    }

    private static final SizeSelector makeViewStubSelector(LayoutSize layoutSize, LayoutSize layoutSize2) {
        return new SizeSelector(toViewStubSize(layoutSize), toViewStubSize(layoutSize2));
    }

    @NotNull
    public static final Dimension resolveDimension(@NotNull Dimension dimension, @NotNull Context context) {
        if (!(dimension instanceof Dimension.Resource)) {
            return dimension;
        }
        float dimension2 = context.getResources().getDimension(((Dimension.Resource) dimension).getRes());
        int i = (int) dimension2;
        return i != -2 ? i != -1 ? new Dimension.Dp(Dp.m3297constructorimpl(dimension2 / context.getResources().getDisplayMetrics().density), null) : Dimension.Fill.INSTANCE : Dimension.Wrap.INSTANCE;
    }

    private static final int selectChild(RemoteViews remoteViews, TranslationContext translationContext, int i, LayoutSize layoutSize, LayoutSize layoutSize2) {
        SizeSelector sizeSelectorMakeViewStubSelector = makeViewStubSelector(layoutSize, layoutSize2);
        Map<SizeSelector, Integer> map = translationContext.getParentContext().getChildren().get(Integer.valueOf(i));
        if (map == null) {
            throw new IllegalStateException(d.n("Parent doesn't have child position ", i));
        }
        Integer num = map.get(sizeSelectorMakeViewStubSelector);
        if (num == null) {
            throw new IllegalStateException("No child for position " + i + " and size " + layoutSize + " x " + layoutSize2);
        }
        int iIntValue = num.intValue();
        Collection<Integer> collectionValues = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collectionValues) {
            if (((Number) obj2).intValue() != iIntValue) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            UtilsKt.inflateViewStub(remoteViews, translationContext, ((Number) it8.next()).intValue(), R$layout.glance_deleted_view, Integer.valueOf(R$id.deletedViewId));
        }
        return iIntValue;
    }

    private static final Integer selectLayout33(LayoutType layoutType, GlanceModifier glanceModifier) {
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        AlignmentModifier alignmentModifier = (AlignmentModifier) glanceModifier.foldIn(null, LayoutSelectionKt$selectLayout33$$inlined$findModifier$1.INSTANCE);
        WidthModifier widthModifier = (WidthModifier) glanceModifier.foldIn(null, LayoutSelectionKt$selectLayout33$$inlined$findModifier$2.INSTANCE);
        boolean zF = widthModifier != null ? Intrinsics.f(widthModifier.getWidth(), Dimension.Expand.INSTANCE) : false;
        HeightModifier heightModifier = (HeightModifier) glanceModifier.foldIn(null, LayoutSelectionKt$selectLayout33$$inlined$findModifier$3.INSTANCE);
        boolean zF2 = heightModifier != null ? Intrinsics.f(heightModifier.getHeight(), Dimension.Expand.INSTANCE) : false;
        if (alignmentModifier != null) {
            LayoutInfo layoutInfo = GeneratedLayoutsKt.getGeneratedBoxChildren().get(new BoxChildSelector(layoutType, alignmentModifier.getAlignment().getHorizontal(), alignmentModifier.getAlignment().getVertical(), null));
            if (layoutInfo != null) {
                return Integer.valueOf(layoutInfo.getLayoutId());
            }
            throw new IllegalArgumentException("Cannot find " + layoutType + " with alignment " + alignmentModifier.getAlignment());
        }
        if (!zF && !zF2) {
            return null;
        }
        LayoutInfo layoutInfo2 = GeneratedLayoutsKt.getGeneratedRowColumnChildren().get(new RowColumnChildSelector(layoutType, zF, zF2));
        if (layoutInfo2 != null) {
            return Integer.valueOf(layoutInfo2.getLayoutId());
        }
        throw new IllegalArgumentException("Cannot find " + layoutType + " with defaultWeight set");
    }

    private static final LayoutSize toSpecSize(Dimension dimension) {
        if (dimension instanceof Dimension.Wrap) {
            return LayoutSize.Wrap;
        }
        if (dimension instanceof Dimension.Expand) {
            return LayoutSize.Expand;
        }
        if (dimension instanceof Dimension.Fill) {
            return LayoutSize.MatchParent;
        }
        if (dimension instanceof Dimension.Dp ? true : dimension instanceof Dimension.Resource) {
            return LayoutSize.Fixed;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final LayoutSize toViewStubSize(LayoutSize layoutSize) {
        return layoutSize == LayoutSize.Fixed ? LayoutSize.Wrap : layoutSize;
    }
}
