package androidx.glance.appwidget;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.glance.Applier;
import androidx.glance.Emittable;
import androidx.glance.EmittableWithChildren;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"IgnoreResult", "", "(Landroidx/compose/runtime/Composer;I)V", "shouldIgnoreResult", "", "Landroidx/glance/Emittable;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class IgnoreResultKt {

    /* JADX INFO: renamed from: androidx.glance.appwidget.IgnoreResultKt$IgnoreResult$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends q implements Function0<EmittableIgnoreResult> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0, EmittableIgnoreResult.class, "<init>", "<init>()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final EmittableIgnoreResult invoke() {
            return new EmittableIgnoreResult();
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.IgnoreResultKt$IgnoreResult$3, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass3 extends u implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
            invoke((Composer) obj2, ((Number) obj3).intValue());
            return Unit.f186387a;
        }

        public final void invoke(Composer composer, int i) {
            IgnoreResultKt.IgnoreResult(composer, this.$$changed | 1);
        }
    }

    public static final void IgnoreResult(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1257244356);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1257244356, i, -1, "androidx.glance.appwidget.IgnoreResult (IgnoreResult.kt:34)");
            }
            AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-1115894518);
            composerStartRestartGroup.startReplaceableGroup(1886828752);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(new IgnoreResultKt$IgnoreResult$$inlined$GlanceNode$1(anonymousClass1));
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m1662constructorimpl(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new AnonymousClass3(i));
    }

    public static final boolean shouldIgnoreResult(@NotNull Emittable emittable) {
        if (emittable instanceof EmittableIgnoreResult) {
            return true;
        }
        if (!(emittable instanceof EmittableWithChildren)) {
            return false;
        }
        List<Emittable> children = ((EmittableWithChildren) emittable).getChildren();
        if ((children instanceof Collection) && children.isEmpty()) {
            return false;
        }
        Iterator<T> it8 = children.iterator();
        while (it8.hasNext()) {
            if (shouldIgnoreResult((Emittable) it8.next())) {
                return true;
            }
        }
        return false;
    }
}
