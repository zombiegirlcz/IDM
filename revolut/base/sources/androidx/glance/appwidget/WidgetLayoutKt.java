package androidx.glance.appwidget;

import a0.d;
import android.content.Context;
import android.os.Build;
import androidx.glance.Emittable;
import androidx.glance.EmittableImage;
import androidx.glance.EmittableWithChildren;
import androidx.glance.GlanceModifier;
import androidx.glance.ImageKt;
import androidx.glance.appwidget.proto.LayoutProto$ContentScale;
import androidx.glance.appwidget.proto.LayoutProto$DimensionType;
import androidx.glance.appwidget.proto.LayoutProto$HorizontalAlignment;
import androidx.glance.appwidget.proto.LayoutProto$LayoutNode;
import androidx.glance.appwidget.proto.LayoutProto$LayoutType;
import androidx.glance.appwidget.proto.LayoutProto$NodeIdentity;
import androidx.glance.appwidget.proto.LayoutProto$VerticalAlignment;
import androidx.glance.layout.Alignment;
import androidx.glance.layout.ContentScale;
import androidx.glance.layout.EmittableBox;
import androidx.glance.layout.EmittableColumn;
import androidx.glance.layout.EmittableRow;
import androidx.glance.layout.EmittableSpacer;
import androidx.glance.layout.HeightModifier;
import androidx.glance.layout.WidthModifier;
import androidx.glance.text.EmittableText;
import androidx.glance.unit.Dimension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\t*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0010\u001a\u00020\t*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0013\u001a\u00020\t*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001e\u001a\u00020\u001b*\u00020\u001aH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u001e\u001a\u00020 *\u00020\u001fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010$\u001a\u00020#*\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010\u001e\u001a\u00020'*\u00020&2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001e\u0010(\"\u0018\u0010,\u001a\u00020&*\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\"\u0018\u0010.\u001a\u00020&*\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006/"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/glance/Emittable;", "element", "Landroidx/glance/appwidget/proto/LayoutProto$LayoutNode;", "createNode", "(Landroid/content/Context;Landroidx/glance/Emittable;)Landroidx/glance/appwidget/proto/LayoutProto$LayoutNode;", "Landroidx/glance/appwidget/proto/LayoutProto$LayoutNode$Builder;", "Landroidx/glance/EmittableImage;", "", "setImageNode", "(Landroidx/glance/appwidget/proto/LayoutProto$LayoutNode$Builder;Landroidx/glance/EmittableImage;)V", "Landroidx/glance/layout/EmittableColumn;", "setColumnNode", "(Landroidx/glance/appwidget/proto/LayoutProto$LayoutNode$Builder;Landroidx/glance/layout/EmittableColumn;)V", "Landroidx/glance/layout/EmittableRow;", "setRowNode", "(Landroidx/glance/appwidget/proto/LayoutProto$LayoutNode$Builder;Landroidx/glance/layout/EmittableRow;)V", "Landroidx/glance/layout/EmittableBox;", "setBoxNode", "(Landroidx/glance/appwidget/proto/LayoutProto$LayoutNode$Builder;Landroidx/glance/layout/EmittableBox;)V", "", "appWidgetId", "", "layoutDatastoreKey", "(I)Ljava/lang/String;", "Landroidx/glance/layout/Alignment$Vertical;", "Landroidx/glance/appwidget/proto/LayoutProto$VerticalAlignment;", "toProto-Je2gTW8", "(I)Landroidx/glance/appwidget/proto/LayoutProto$VerticalAlignment;", "toProto", "Landroidx/glance/layout/Alignment$Horizontal;", "Landroidx/glance/appwidget/proto/LayoutProto$HorizontalAlignment;", "toProto-uMT2-20", "(I)Landroidx/glance/appwidget/proto/LayoutProto$HorizontalAlignment;", "Landroidx/glance/appwidget/proto/LayoutProto$LayoutType;", "getLayoutType", "(Landroidx/glance/Emittable;)Landroidx/glance/appwidget/proto/LayoutProto$LayoutType;", "Landroidx/glance/unit/Dimension;", "Landroidx/glance/appwidget/proto/LayoutProto$DimensionType;", "(Landroidx/glance/unit/Dimension;Landroid/content/Context;)Landroidx/glance/appwidget/proto/LayoutProto$DimensionType;", "Landroidx/glance/GlanceModifier;", "getWidthModifier", "(Landroidx/glance/GlanceModifier;)Landroidx/glance/unit/Dimension;", "widthModifier", "getHeightModifier", "heightModifier", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class WidgetLayoutKt {
    @NotNull
    public static final LayoutProto$LayoutNode createNode(@NotNull Context context, @NotNull Emittable emittable) {
        LayoutProto$LayoutNode.Builder builderNewBuilder = LayoutProto$LayoutNode.newBuilder();
        builderNewBuilder.setType(getLayoutType(emittable));
        builderNewBuilder.setWidth(toProto(getWidthModifier(emittable.getModifier()), context));
        builderNewBuilder.setHeight(toProto(getHeightModifier(emittable.getModifier()), context));
        builderNewBuilder.setHasAction(emittable.getModifier().foldIn(null, WidgetLayoutKt$createNode$lambda$1$$inlined$findModifier$1.INSTANCE) != null);
        if (emittable.getModifier().foldIn(null, WidgetLayoutKt$createNode$lambda$1$$inlined$findModifier$2.INSTANCE) != null) {
            builderNewBuilder.setIdentity(LayoutProto$NodeIdentity.BACKGROUND_NODE);
        }
        if (emittable instanceof EmittableImage) {
            setImageNode(builderNewBuilder, (EmittableImage) emittable);
        } else if (emittable instanceof EmittableColumn) {
            setColumnNode(builderNewBuilder, (EmittableColumn) emittable);
        } else if (emittable instanceof EmittableRow) {
            setRowNode(builderNewBuilder, (EmittableRow) emittable);
        } else if (emittable instanceof EmittableBox) {
            setBoxNode(builderNewBuilder, (EmittableBox) emittable);
        }
        if (emittable instanceof EmittableWithChildren) {
            List<Emittable> children = ((EmittableWithChildren) emittable).getChildren();
            ArrayList arrayList = new ArrayList(w.t(children, 10));
            Iterator<T> it8 = children.iterator();
            while (it8.hasNext()) {
                arrayList.add(createNode(context, (Emittable) it8.next()));
            }
            builderNewBuilder.addAllChildren(arrayList);
        }
        return (LayoutProto$LayoutNode) builderNewBuilder.build();
    }

    private static final Dimension getHeightModifier(GlanceModifier glanceModifier) {
        Dimension height;
        HeightModifier heightModifier = (HeightModifier) glanceModifier.foldIn(null, WidgetLayoutKt$special$$inlined$findModifier$2.INSTANCE);
        return (heightModifier == null || (height = heightModifier.getHeight()) == null) ? Dimension.Wrap.INSTANCE : height;
    }

    private static final LayoutProto$LayoutType getLayoutType(Emittable emittable) {
        if (emittable instanceof EmittableBox) {
            return LayoutProto$LayoutType.BOX;
        }
        if (emittable instanceof EmittableRow) {
            return RadioButtonKt.isSelectableGroup(emittable.getModifier()) ? LayoutProto$LayoutType.RADIO_ROW : LayoutProto$LayoutType.ROW;
        }
        if (emittable instanceof EmittableColumn) {
            return RadioButtonKt.isSelectableGroup(emittable.getModifier()) ? LayoutProto$LayoutType.RADIO_COLUMN : LayoutProto$LayoutType.COLUMN;
        }
        if (emittable instanceof EmittableText) {
            return LayoutProto$LayoutType.TEXT;
        }
        if (emittable instanceof EmittableAndroidRemoteViews) {
            return LayoutProto$LayoutType.ANDROID_REMOTE_VIEWS;
        }
        if (emittable instanceof EmittableSpacer) {
            return LayoutProto$LayoutType.SPACER;
        }
        if (emittable instanceof EmittableImage) {
            return LayoutProto$LayoutType.IMAGE;
        }
        if (emittable instanceof RemoteViewsRoot) {
            return LayoutProto$LayoutType.REMOTE_VIEWS_ROOT;
        }
        if (emittable instanceof EmittableSizeBox) {
            return LayoutProto$LayoutType.SIZE_BOX;
        }
        throw new IllegalArgumentException("Unknown element type " + emittable.getClass().getCanonicalName());
    }

    private static final Dimension getWidthModifier(GlanceModifier glanceModifier) {
        Dimension width;
        WidthModifier widthModifier = (WidthModifier) glanceModifier.foldIn(null, WidgetLayoutKt$special$$inlined$findModifier$1.INSTANCE);
        return (widthModifier == null || (width = widthModifier.getWidth()) == null) ? Dimension.Wrap.INSTANCE : width;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String layoutDatastoreKey(int i) {
        return d.n("appWidgetLayout-", i);
    }

    private static final void setBoxNode(LayoutProto$LayoutNode.Builder builder, EmittableBox emittableBox) {
        builder.setHorizontalAlignment(m3508toProtouMT220(emittableBox.getContentAlignment().getHorizontal()));
        builder.setVerticalAlignment(m3507toProtoJe2gTW8(emittableBox.getContentAlignment().getVertical()));
    }

    private static final void setColumnNode(LayoutProto$LayoutNode.Builder builder, EmittableColumn emittableColumn) {
        builder.setHorizontalAlignment(m3508toProtouMT220(emittableColumn.getHorizontalAlignment()));
    }

    private static final void setImageNode(LayoutProto$LayoutNode.Builder builder, EmittableImage emittableImage) {
        LayoutProto$ContentScale layoutProto$ContentScale;
        int contentScale = emittableImage.getContentScale();
        ContentScale.Companion companion = ContentScale.INSTANCE;
        if (ContentScale.m3543equalsimpl0(contentScale, companion.m3549getFitAe3V0ko())) {
            layoutProto$ContentScale = LayoutProto$ContentScale.FIT;
        } else if (ContentScale.m3543equalsimpl0(contentScale, companion.m3547getCropAe3V0ko())) {
            layoutProto$ContentScale = LayoutProto$ContentScale.CROP;
        } else {
            if (!ContentScale.m3543equalsimpl0(contentScale, companion.m3548getFillBoundsAe3V0ko())) {
                throw new IllegalStateException(("Unknown content scale " + ((Object) ContentScale.m3545toStringimpl(emittableImage.getContentScale()))).toString());
            }
            layoutProto$ContentScale = LayoutProto$ContentScale.FILL_BOUNDS;
        }
        builder.setImageScale(layoutProto$ContentScale);
        builder.setHasImageDescription(!ImageKt.isDecorative(emittableImage));
    }

    private static final void setRowNode(LayoutProto$LayoutNode.Builder builder, EmittableRow emittableRow) {
        builder.setVerticalAlignment(m3507toProtoJe2gTW8(emittableRow.getVerticalAlignment()));
    }

    private static final LayoutProto$DimensionType toProto(Dimension dimension, Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return WidgetLayoutImpl31.INSTANCE.toProto(dimension);
        }
        Dimension dimensionResolveDimension = LayoutSelectionKt.resolveDimension(dimension, context);
        if (dimensionResolveDimension instanceof Dimension.Dp) {
            return LayoutProto$DimensionType.EXACT;
        }
        if (dimensionResolveDimension instanceof Dimension.Wrap) {
            return LayoutProto$DimensionType.WRAP;
        }
        if (dimensionResolveDimension instanceof Dimension.Fill) {
            return LayoutProto$DimensionType.FILL;
        }
        if (dimensionResolveDimension instanceof Dimension.Expand) {
            return LayoutProto$DimensionType.EXPAND;
        }
        throw new IllegalStateException("After resolution, no other type should be present");
    }

    /* JADX INFO: renamed from: toProto-Je2gTW8, reason: not valid java name */
    private static final LayoutProto$VerticalAlignment m3507toProtoJe2gTW8(int i) {
        Alignment.Vertical.Companion companion = Alignment.Vertical.INSTANCE;
        if (Alignment.Vertical.m3530equalsimpl0(i, companion.m3536getTopmnfRV0w())) {
            return LayoutProto$VerticalAlignment.TOP;
        }
        if (Alignment.Vertical.m3530equalsimpl0(i, companion.m3535getCenterVerticallymnfRV0w())) {
            return LayoutProto$VerticalAlignment.CENTER_VERTICALLY;
        }
        if (Alignment.Vertical.m3530equalsimpl0(i, companion.m3534getBottommnfRV0w())) {
            return LayoutProto$VerticalAlignment.BOTTOM;
        }
        throw new IllegalStateException(("unknown vertical alignment " + ((Object) Alignment.Vertical.m3532toStringimpl(i))).toString());
    }

    /* JADX INFO: renamed from: toProto-uMT2-20, reason: not valid java name */
    private static final LayoutProto$HorizontalAlignment m3508toProtouMT220(int i) {
        Alignment.Horizontal.Companion companion = Alignment.Horizontal.INSTANCE;
        if (Alignment.Horizontal.m3520equalsimpl0(i, companion.m3526getStartPGIyAqw())) {
            return LayoutProto$HorizontalAlignment.START;
        }
        if (Alignment.Horizontal.m3520equalsimpl0(i, companion.m3524getCenterHorizontallyPGIyAqw())) {
            return LayoutProto$HorizontalAlignment.CENTER_HORIZONTALLY;
        }
        if (Alignment.Horizontal.m3520equalsimpl0(i, companion.m3525getEndPGIyAqw())) {
            return LayoutProto$HorizontalAlignment.END;
        }
        throw new IllegalStateException(("unknown horizontal alignment " + ((Object) Alignment.Horizontal.m3522toStringimpl(i))).toString());
    }
}
