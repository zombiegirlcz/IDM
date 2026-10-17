package androidx.glance.appwidget;

import android.content.ComponentName;
import android.content.Context;
import androidx.compose.ui.unit.DpSize;
import ch.qos.logback.core.CoreConstants;
import j6.a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b&\b\u0080\b\u0018\u00002\u00020\u0001B\u009c\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J#\u0010(\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\r\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010)J²\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b0\u0010\u001dJ\u001a\u00102\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b\u0007\u0010:R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b>\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b\u000b\u0010:R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\b\u0011\u0010FR \u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\bJ\u0010\u001dR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u00107\u001a\u0004\bK\u0010\u001dR\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u00109\u001a\u0004\bL\u0010:R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010P\u001a\u0004\bQ\u0010R\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, d2 = {"Landroidx/glance/appwidget/TranslationContext;", "", "Landroid/content/Context;", "context", "", "appWidgetId", "", "isRtl", "Landroidx/glance/appwidget/LayoutConfiguration;", "layoutConfiguration", "itemPosition", "isLazyCollectionDescendant", "Ljava/util/concurrent/atomic/AtomicInteger;", "lastViewId", "Landroidx/glance/appwidget/InsertedViewInfo;", "parentContext", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isBackgroundSpecified", "Landroidx/compose/ui/unit/DpSize;", "layoutSize", "layoutCollectionViewId", "layoutCollectionItemId", "canUseSelectableGroup", "actionTargetId", "Landroid/content/ComponentName;", "actionBroadcastReceiver", "<init>", "(Landroid/content/Context;IZLandroidx/glance/appwidget/LayoutConfiguration;IZLjava/util/concurrent/atomic/AtomicInteger;Landroidx/glance/appwidget/InsertedViewInfo;Ljava/util/concurrent/atomic/AtomicBoolean;JIIZLjava/lang/Integer;Landroid/content/ComponentName;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "nextViewId", "()I", "parent", "pos", "forChild", "(Landroidx/glance/appwidget/InsertedViewInfo;I)Landroidx/glance/appwidget/TranslationContext;", "Landroidx/glance/appwidget/RemoteViewsInfo;", "root", "forRoot", "(Landroidx/glance/appwidget/RemoteViewsInfo;)Landroidx/glance/appwidget/TranslationContext;", "forRootAndSize-6HolHcs", "(Landroidx/glance/appwidget/RemoteViewsInfo;J)Landroidx/glance/appwidget/TranslationContext;", "forRootAndSize", "()Landroidx/glance/appwidget/TranslationContext;", "copy-tbIExKY", "(Landroid/content/Context;IZLandroidx/glance/appwidget/LayoutConfiguration;IZLjava/util/concurrent/atomic/AtomicInteger;Landroidx/glance/appwidget/InsertedViewInfo;Ljava/util/concurrent/atomic/AtomicBoolean;JIIZLjava/lang/Integer;Landroid/content/ComponentName;)Landroidx/glance/appwidget/TranslationContext;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "I", "getAppWidgetId", "Z", "()Z", "Landroidx/glance/appwidget/LayoutConfiguration;", "getLayoutConfiguration", "()Landroidx/glance/appwidget/LayoutConfiguration;", "getItemPosition", "Ljava/util/concurrent/atomic/AtomicInteger;", "getLastViewId", "()Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/glance/appwidget/InsertedViewInfo;", "getParentContext", "()Landroidx/glance/appwidget/InsertedViewInfo;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "J", "getLayoutSize-MYxV2XQ", "()J", "getLayoutCollectionViewId", "getLayoutCollectionItemId", "getCanUseSelectableGroup", "Ljava/lang/Integer;", "getActionTargetId", "()Ljava/lang/Integer;", "Landroid/content/ComponentName;", "getActionBroadcastReceiver", "()Landroid/content/ComponentName;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TranslationContext {
    private final ComponentName actionBroadcastReceiver;
    private final Integer actionTargetId;
    private final int appWidgetId;
    private final boolean canUseSelectableGroup;

    @NotNull
    private final Context context;

    @NotNull
    private final AtomicBoolean isBackgroundSpecified;
    private final boolean isLazyCollectionDescendant;
    private final boolean isRtl;
    private final int itemPosition;

    @NotNull
    private final AtomicInteger lastViewId;
    private final int layoutCollectionItemId;
    private final int layoutCollectionViewId;
    private final LayoutConfiguration layoutConfiguration;
    private final long layoutSize;

    @NotNull
    private final InsertedViewInfo parentContext;

    public /* synthetic */ TranslationContext(Context context, int i, boolean z, LayoutConfiguration layoutConfiguration, int i2, boolean z3, AtomicInteger atomicInteger, InsertedViewInfo insertedViewInfo, AtomicBoolean atomicBoolean, long j2, int i3, int i5, boolean z4, Integer num, ComponentName componentName, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, z, layoutConfiguration, i2, z3, atomicInteger, insertedViewInfo, atomicBoolean, j2, i3, i5, z4, num, componentName);
    }

    /* JADX INFO: renamed from: copy-tbIExKY$default, reason: not valid java name */
    public static /* synthetic */ TranslationContext m3501copytbIExKY$default(TranslationContext translationContext, Context context, int i, boolean z, LayoutConfiguration layoutConfiguration, int i2, boolean z3, AtomicInteger atomicInteger, InsertedViewInfo insertedViewInfo, AtomicBoolean atomicBoolean, long j2, int i3, int i5, boolean z4, Integer num, ComponentName componentName, int i6, Object obj2) {
        return translationContext.m3502copytbIExKY((i6 & 1) != 0 ? translationContext.context : context, (i6 & 2) != 0 ? translationContext.appWidgetId : i, (i6 & 4) != 0 ? translationContext.isRtl : z, (i6 & 8) != 0 ? translationContext.layoutConfiguration : layoutConfiguration, (i6 & 16) != 0 ? translationContext.itemPosition : i2, (i6 & 32) != 0 ? translationContext.isLazyCollectionDescendant : z3, (i6 & 64) != 0 ? translationContext.lastViewId : atomicInteger, (i6 & 128) != 0 ? translationContext.parentContext : insertedViewInfo, (i6 & 256) != 0 ? translationContext.isBackgroundSpecified : atomicBoolean, (i6 & 512) != 0 ? translationContext.layoutSize : j2, (i6 & 1024) != 0 ? translationContext.layoutCollectionViewId : i3, (i6 & 2048) != 0 ? translationContext.layoutCollectionItemId : i5, (i6 & 4096) != 0 ? translationContext.canUseSelectableGroup : z4, (i6 & 8192) != 0 ? translationContext.actionTargetId : num, (i6 & 16384) != 0 ? translationContext.actionBroadcastReceiver : componentName);
    }

    @NotNull
    public final TranslationContext canUseSelectableGroup() {
        return m3501copytbIExKY$default(this, null, 0, false, null, 0, false, null, null, null, 0L, 0, 0, true, null, null, 28671, null);
    }

    @NotNull
    /* JADX INFO: renamed from: copy-tbIExKY, reason: not valid java name */
    public final TranslationContext m3502copytbIExKY(@NotNull Context context, int appWidgetId, boolean isRtl, LayoutConfiguration layoutConfiguration, int itemPosition, boolean isLazyCollectionDescendant, @NotNull AtomicInteger lastViewId, @NotNull InsertedViewInfo parentContext, @NotNull AtomicBoolean isBackgroundSpecified, long layoutSize, int layoutCollectionViewId, int layoutCollectionItemId, boolean canUseSelectableGroup, Integer actionTargetId, ComponentName actionBroadcastReceiver) {
        return new TranslationContext(context, appWidgetId, isRtl, layoutConfiguration, itemPosition, isLazyCollectionDescendant, lastViewId, parentContext, isBackgroundSpecified, layoutSize, layoutCollectionViewId, layoutCollectionItemId, canUseSelectableGroup, actionTargetId, actionBroadcastReceiver, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TranslationContext)) {
            return false;
        }
        TranslationContext translationContext = (TranslationContext) other;
        return Intrinsics.f(this.context, translationContext.context) && this.appWidgetId == translationContext.appWidgetId && this.isRtl == translationContext.isRtl && Intrinsics.f(this.layoutConfiguration, translationContext.layoutConfiguration) && this.itemPosition == translationContext.itemPosition && this.isLazyCollectionDescendant == translationContext.isLazyCollectionDescendant && Intrinsics.f(this.lastViewId, translationContext.lastViewId) && Intrinsics.f(this.parentContext, translationContext.parentContext) && Intrinsics.f(this.isBackgroundSpecified, translationContext.isBackgroundSpecified) && DpSize.m3320equalsimpl0(this.layoutSize, translationContext.layoutSize) && this.layoutCollectionViewId == translationContext.layoutCollectionViewId && this.layoutCollectionItemId == translationContext.layoutCollectionItemId && this.canUseSelectableGroup == translationContext.canUseSelectableGroup && Intrinsics.f(this.actionTargetId, translationContext.actionTargetId) && Intrinsics.f(this.actionBroadcastReceiver, translationContext.actionBroadcastReceiver);
    }

    @NotNull
    public final TranslationContext forChild(@NotNull InsertedViewInfo parent, int pos) {
        return m3501copytbIExKY$default(this, null, 0, false, null, pos, false, null, parent, null, 0L, 0, 0, false, null, null, 32623, null);
    }

    @NotNull
    public final TranslationContext forRoot(@NotNull RemoteViewsInfo root) {
        return m3501copytbIExKY$default(forChild(root.getView(), 0), null, 0, false, null, 0, false, new AtomicInteger(1), null, new AtomicBoolean(false), 0L, 0, 0, false, null, null, 32447, null);
    }

    @NotNull
    /* JADX INFO: renamed from: forRootAndSize-6HolHcs, reason: not valid java name */
    public final TranslationContext m3503forRootAndSize6HolHcs(@NotNull RemoteViewsInfo root, long layoutSize) {
        return m3501copytbIExKY$default(forChild(root.getView(), 0), null, 0, false, null, 0, false, new AtomicInteger(1), null, new AtomicBoolean(false), layoutSize, 0, 0, false, null, null, 31935, null);
    }

    public final ComponentName getActionBroadcastReceiver() {
        return this.actionBroadcastReceiver;
    }

    public final Integer getActionTargetId() {
        return this.actionTargetId;
    }

    public final int getAppWidgetId() {
        return this.appWidgetId;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final int getItemPosition() {
        return this.itemPosition;
    }

    public final int getLayoutCollectionItemId() {
        return this.layoutCollectionItemId;
    }

    public final int getLayoutCollectionViewId() {
        return this.layoutCollectionViewId;
    }

    /* JADX INFO: renamed from: getLayoutSize-MYxV2XQ, reason: not valid java name and from getter */
    public final long getLayoutSize() {
        return this.layoutSize;
    }

    @NotNull
    public final InsertedViewInfo getParentContext() {
        return this.parentContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iB = a.b(this.appWidgetId, this.context.hashCode() * 31, 31);
        boolean z = this.isRtl;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iB + r2) * 31;
        LayoutConfiguration layoutConfiguration = this.layoutConfiguration;
        int iB2 = a.b(this.itemPosition, (i + (layoutConfiguration == null ? 0 : layoutConfiguration.hashCode())) * 31, 31);
        boolean z3 = this.isLazyCollectionDescendant;
        ?? r23 = z3;
        if (z3) {
            r23 = 1;
        }
        int iB3 = a.b(this.layoutCollectionItemId, a.b(this.layoutCollectionViewId, (DpSize.m3323hashCodeimpl(this.layoutSize) + ((this.isBackgroundSpecified.hashCode() + ((this.parentContext.hashCode() + ((this.lastViewId.hashCode() + ((iB2 + r23) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31);
        boolean z4 = this.canUseSelectableGroup;
        int i2 = (iB3 + (z4 ? 1 : z4)) * 31;
        Integer num = this.actionTargetId;
        int iHashCode = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        ComponentName componentName = this.actionBroadcastReceiver;
        return iHashCode + (componentName != null ? componentName.hashCode() : 0);
    }

    @NotNull
    /* JADX INFO: renamed from: isBackgroundSpecified, reason: from getter */
    public final AtomicBoolean getIsBackgroundSpecified() {
        return this.isBackgroundSpecified;
    }

    /* JADX INFO: renamed from: isLazyCollectionDescendant, reason: from getter */
    public final boolean getIsLazyCollectionDescendant() {
        return this.isLazyCollectionDescendant;
    }

    /* JADX INFO: renamed from: isRtl, reason: from getter */
    public final boolean getIsRtl() {
        return this.isRtl;
    }

    public final int nextViewId() {
        return this.lastViewId.incrementAndGet();
    }

    @NotNull
    public String toString() {
        return "TranslationContext(context=" + this.context + ", appWidgetId=" + this.appWidgetId + ", isRtl=" + this.isRtl + ", layoutConfiguration=" + this.layoutConfiguration + ", itemPosition=" + this.itemPosition + ", isLazyCollectionDescendant=" + this.isLazyCollectionDescendant + ", lastViewId=" + this.lastViewId + ", parentContext=" + this.parentContext + ", isBackgroundSpecified=" + this.isBackgroundSpecified + ", layoutSize=" + ((Object) DpSize.m3324toStringimpl(this.layoutSize)) + ", layoutCollectionViewId=" + this.layoutCollectionViewId + ", layoutCollectionItemId=" + this.layoutCollectionItemId + ", canUseSelectableGroup=" + this.canUseSelectableGroup + ", actionTargetId=" + this.actionTargetId + ", actionBroadcastReceiver=" + this.actionBroadcastReceiver + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private TranslationContext(Context context, int i, boolean z, LayoutConfiguration layoutConfiguration, int i2, boolean z3, AtomicInteger atomicInteger, InsertedViewInfo insertedViewInfo, AtomicBoolean atomicBoolean, long j2, int i3, int i5, boolean z4, Integer num, ComponentName componentName) {
        this.context = context;
        this.appWidgetId = i;
        this.isRtl = z;
        this.layoutConfiguration = layoutConfiguration;
        this.itemPosition = i2;
        this.isLazyCollectionDescendant = z3;
        this.lastViewId = atomicInteger;
        this.parentContext = insertedViewInfo;
        this.isBackgroundSpecified = atomicBoolean;
        this.layoutSize = j2;
        this.layoutCollectionViewId = i3;
        this.layoutCollectionItemId = i5;
        this.canUseSelectableGroup = z4;
        this.actionTargetId = num;
        this.actionBroadcastReceiver = componentName;
    }

    public /* synthetic */ TranslationContext(Context context, int i, boolean z, LayoutConfiguration layoutConfiguration, int i2, boolean z3, AtomicInteger atomicInteger, InsertedViewInfo insertedViewInfo, AtomicBoolean atomicBoolean, long j2, int i3, int i5, boolean z4, Integer num, ComponentName componentName, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, z, layoutConfiguration, i2, (i6 & 32) != 0 ? false : z3, (i6 & 64) != 0 ? new AtomicInteger(1) : atomicInteger, (i6 & 128) != 0 ? new InsertedViewInfo(0, 0, null, 7, null) : insertedViewInfo, (i6 & 256) != 0 ? new AtomicBoolean(false) : atomicBoolean, (i6 & 512) != 0 ? DpSize.INSTANCE.m3327getZeroMYxV2XQ() : j2, (i6 & 1024) != 0 ? -1 : i3, (i6 & 2048) != 0 ? -1 : i5, (i6 & 4096) != 0 ? false : z4, (i6 & 8192) != 0 ? null : num, (i6 & 16384) != 0 ? null : componentName, null);
    }
}
