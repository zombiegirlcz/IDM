package androidx.glance.appwidget;

import android.widget.RemoteViews;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.glance.Applier;
import androidx.glance.GlanceModifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0007¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Landroid/widget/RemoteViews;", "remoteViews", "Landroidx/glance/GlanceModifier;", "modifier", "", "AndroidRemoteViews", "(Landroid/widget/RemoteViews;Landroidx/glance/GlanceModifier;Landroidx/compose/runtime/Composer;II)V", "", "containerViewId", "Lkotlin/Function0;", "content", "(Landroid/widget/RemoteViews;ILandroidx/glance/GlanceModifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class AndroidRemoteViewsKt {

    /* JADX INFO: renamed from: androidx.glance.appwidget.AndroidRemoteViewsKt$AndroidRemoteViews$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ GlanceModifier $modifier;
        final /* synthetic */ RemoteViews $remoteViews;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RemoteViews remoteViews, GlanceModifier glanceModifier, int i, int i2) {
            super(2);
            this.$remoteViews = remoteViews;
            this.$modifier = glanceModifier;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
            invoke((Composer) obj2, ((Number) obj3).intValue());
            return Unit.f186387a;
        }

        public final void invoke(Composer composer, int i) {
            AndroidRemoteViewsKt.AndroidRemoteViews(this.$remoteViews, this.$modifier, composer, this.$$changed | 1, this.$$default);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.AndroidRemoteViewsKt$AndroidRemoteViews$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends q implements Function0<EmittableAndroidRemoteViews> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0, EmittableAndroidRemoteViews.class, "<init>", "<init>()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final EmittableAndroidRemoteViews invoke() {
            return new EmittableAndroidRemoteViews();
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.AndroidRemoteViewsKt$AndroidRemoteViews$4, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass4 extends u implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ int $containerViewId;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ GlanceModifier $modifier;
        final /* synthetic */ RemoteViews $remoteViews;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(RemoteViews remoteViews, int i, GlanceModifier glanceModifier, Function2<? super Composer, ? super Integer, Unit> function2, int i2, int i3) {
            super(2);
            this.$remoteViews = remoteViews;
            this.$containerViewId = i;
            this.$modifier = glanceModifier;
            this.$content = function2;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
            invoke((Composer) obj2, ((Number) obj3).intValue());
            return Unit.f186387a;
        }

        public final void invoke(Composer composer, int i) {
            AndroidRemoteViewsKt.AndroidRemoteViews(this.$remoteViews, this.$containerViewId, this.$modifier, this.$content, composer, this.$$changed | 1, this.$$default);
        }
    }

    public static final void AndroidRemoteViews(@NotNull RemoteViews remoteViews, GlanceModifier glanceModifier, Composer composer, int i, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-647353345);
        if ((i2 & 2) != 0) {
            glanceModifier = GlanceModifier.INSTANCE;
        }
        GlanceModifier glanceModifier2 = glanceModifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-647353345, i, -1, "androidx.glance.appwidget.AndroidRemoteViews (AndroidRemoteViews.kt:34)");
        }
        AndroidRemoteViews(remoteViews, -1, glanceModifier2, ComposableSingletons$AndroidRemoteViewsKt.INSTANCE.m3489getLambda1$glance_appwidget_release(), composerStartRestartGroup, ((i << 3) & 896) | 3080, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new AnonymousClass1(remoteViews, glanceModifier2, i, i2));
    }

    public static final void AndroidRemoteViews(@NotNull RemoteViews remoteViews, int i, GlanceModifier glanceModifier, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2, int i3) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1388408952);
        if ((i3 & 4) != 0) {
            glanceModifier = GlanceModifier.INSTANCE;
        }
        GlanceModifier glanceModifier2 = glanceModifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1388408952, i2, -1, "androidx.glance.appwidget.AndroidRemoteViews (AndroidRemoteViews.kt:53)");
        }
        AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(578571862);
        int i5 = (i2 >> 3) & 896;
        composerStartRestartGroup.startReplaceableGroup(-548224868);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(anonymousClass2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1662constructorimpl = Updater.m1662constructorimpl(composerStartRestartGroup);
        Updater.m1665setimpl(composerM1662constructorimpl, remoteViews, AndroidRemoteViewsKt$AndroidRemoteViews$3$1.INSTANCE);
        AndroidRemoteViewsKt$AndroidRemoteViews$3$2 androidRemoteViewsKt$AndroidRemoteViews$3$2 = AndroidRemoteViewsKt$AndroidRemoteViews$3$2.INSTANCE;
        if (composerM1662constructorimpl.getInserting() || !Intrinsics.f(composerM1662constructorimpl.rememberedValue(), Integer.valueOf(i))) {
            composerM1662constructorimpl.updateRememberedValue(Integer.valueOf(i));
            composerM1662constructorimpl.apply(Integer.valueOf(i), androidRemoteViewsKt$AndroidRemoteViews$3$2);
        }
        Updater.m1665setimpl(composerM1662constructorimpl, glanceModifier2, AndroidRemoteViewsKt$AndroidRemoteViews$3$3.INSTANCE);
        function2.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 6) & 14));
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new AnonymousClass4(remoteViews, i, glanceModifier2, function2, i2, i3));
    }
}
