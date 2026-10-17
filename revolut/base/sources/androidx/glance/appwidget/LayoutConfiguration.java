package androidx.glance.appwidget;

import android.content.Context;
import androidx.glance.Emittable;
import androidx.glance.appwidget.proto.LayoutProto$LayoutConfig;
import androidx.glance.appwidget.proto.LayoutProto$LayoutDefinition;
import androidx.glance.appwidget.proto.LayoutProto$LayoutNode;
import androidx.glance.state.GlanceState;
import fim.a;
import gim.d;
import gim.i;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014BS\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u0011\u0010\u0011\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/glance/appwidget/LayoutConfiguration;", "", "context", "Landroid/content/Context;", "layoutConfig", "", "Landroidx/glance/appwidget/proto/LayoutProto$LayoutNode;", "", "nextIndex", "appWidgetId", "usedLayoutIds", "", "existingLayoutIds", "(Landroid/content/Context;Ljava/util/Map;IILjava/util/Set;Ljava/util/Set;)V", "addLayout", "layoutRoot", "Landroidx/glance/Emittable;", "save", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LayoutConfiguration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int appWidgetId;

    @NotNull
    private final Context context;

    @NotNull
    private final Set<Integer> existingLayoutIds;

    @NotNull
    private final Map<LayoutProto$LayoutNode, Integer> layoutConfig;
    private int nextIndex;

    @NotNull
    private final Set<Integer> usedLayoutIds;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/glance/appwidget/LayoutConfiguration$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "appWidgetId", "Landroidx/glance/appwidget/LayoutConfiguration;", "load$glance_appwidget_release", "(Landroid/content/Context;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object load$glance_appwidget_release(@org.jetbrains.annotations.NotNull android.content.Context r10, int r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.glance.appwidget.LayoutConfiguration> r12) {
            /*
                Method dump skipped, instruction units count: 222
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.LayoutConfiguration.Companion.load$glance_appwidget_release(android.content.Context, int, kotlin.coroutines.Continuation):java.lang.Object");
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.LayoutConfiguration$save$2, reason: invalid class name */
    @d(c = "androidx.glance.appwidget.LayoutConfiguration$save$2", f = "WidgetLayout.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/glance/appwidget/proto/LayoutProto$LayoutConfig;", "config"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<LayoutProto$LayoutConfig, Continuation<? super LayoutProto$LayoutConfig>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = LayoutConfiguration.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj2;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull LayoutProto$LayoutConfig layoutProto$LayoutConfig, Continuation<? super LayoutProto$LayoutConfig> continuation) {
            return ((AnonymousClass2) create(layoutProto$LayoutConfig, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            LayoutProto$LayoutConfig.Builder builder = ((LayoutProto$LayoutConfig) this.L$0).toBuilder();
            LayoutConfiguration layoutConfiguration = LayoutConfiguration.this;
            LayoutProto$LayoutConfig.Builder builder2 = builder;
            builder2.setNextIndex(builder2.getNextIndex());
            builder2.clearLayout();
            for (Map.Entry entry : layoutConfiguration.layoutConfig.entrySet()) {
                LayoutProto$LayoutNode layoutProto$LayoutNode = (LayoutProto$LayoutNode) entry.getKey();
                int iIntValue = ((Number) entry.getValue()).intValue();
                if (layoutConfiguration.usedLayoutIds.contains(new Integer(iIntValue))) {
                    LayoutProto$LayoutDefinition.Builder builderNewBuilder = LayoutProto$LayoutDefinition.newBuilder();
                    builderNewBuilder.setLayout(layoutProto$LayoutNode);
                    builderNewBuilder.setLayoutIndex(iIntValue);
                    builder2.addLayout(builderNewBuilder);
                }
            }
            return builder2.build();
        }
    }

    private LayoutConfiguration(Context context, Map<LayoutProto$LayoutNode, Integer> map, int i, int i2, Set<Integer> set, Set<Integer> set2) {
        this.context = context;
        this.layoutConfig = map;
        this.nextIndex = i;
        this.appWidgetId = i2;
        this.usedLayoutIds = set;
        this.existingLayoutIds = set2;
    }

    public final int addLayout(@NotNull Emittable layoutRoot) {
        LayoutProto$LayoutNode layoutProto$LayoutNodeCreateNode = WidgetLayoutKt.createNode(this.context, layoutRoot);
        synchronized (this) {
            Integer num = this.layoutConfig.get(layoutProto$LayoutNodeCreateNode);
            if (num != null) {
                int iIntValue = num.intValue();
                this.usedLayoutIds.add(Integer.valueOf(iIntValue));
                return iIntValue;
            }
            int topLevelLayoutsCount = this.nextIndex;
            while (this.existingLayoutIds.contains(Integer.valueOf(topLevelLayoutsCount))) {
                topLevelLayoutsCount = (topLevelLayoutsCount + 1) % LayoutSelectionKt.getTopLevelLayoutsCount();
                if (topLevelLayoutsCount == this.nextIndex) {
                    throw new IllegalArgumentException("Cannot assign a valid layout index to the new layout: no free index left.");
                }
            }
            this.nextIndex = (topLevelLayoutsCount + 1) % LayoutSelectionKt.getTopLevelLayoutsCount();
            this.usedLayoutIds.add(Integer.valueOf(topLevelLayoutsCount));
            this.existingLayoutIds.add(Integer.valueOf(topLevelLayoutsCount));
            this.layoutConfig.put(layoutProto$LayoutNodeCreateNode, Integer.valueOf(topLevelLayoutsCount));
            return topLevelLayoutsCount;
        }
    }

    public final Object save(@NotNull Continuation<? super Unit> continuation) {
        Object objUpdateValue = GlanceState.INSTANCE.updateValue(this.context, LayoutStateDefinition.INSTANCE, WidgetLayoutKt.layoutDatastoreKey(this.appWidgetId), new AnonymousClass2(null), continuation);
        return objUpdateValue == a.COROUTINE_SUSPENDED ? objUpdateValue : Unit.f186387a;
    }

    public /* synthetic */ LayoutConfiguration(Context context, Map map, int i, int i2, Set set, Set set2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, map, i, i2, (i3 & 16) != 0 ? new LinkedHashSet() : set, (i3 & 32) != 0 ? new LinkedHashSet() : set2);
    }
}
