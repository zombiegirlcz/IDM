package androidx.glance.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.glance.Applier;
import androidx.glance.GlanceModifier;
import androidx.glance.GlanceNodeKt$GlanceNode$$inlined$ComposeNode$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Spacer", "", "modifier", "Landroidx/glance/GlanceModifier;", "(Landroidx/glance/GlanceModifier;Landroidx/compose/runtime/Composer;II)V", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class SpacerKt {

    /* JADX INFO: renamed from: androidx.glance.layout.SpacerKt$Spacer$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends q implements Function0<EmittableSpacer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0, EmittableSpacer.class, "<init>", "<init>()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final EmittableSpacer invoke() {
            return new EmittableSpacer();
        }
    }

    /* JADX INFO: renamed from: androidx.glance.layout.SpacerKt$Spacer$3, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass3 extends u implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ GlanceModifier $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(GlanceModifier glanceModifier, int i, int i2) {
            super(2);
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
            SpacerKt.Spacer(this.$modifier, composer, this.$$changed | 1, this.$$default);
        }
    }

    public static final void Spacer(GlanceModifier glanceModifier, Composer composer, int i, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1380468206);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(glanceModifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                glanceModifier = GlanceModifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1380468206, i, -1, "androidx.glance.layout.Spacer (Spacer.kt:43)");
            }
            AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-1115894518);
            composerStartRestartGroup.startReplaceableGroup(1886828752);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(new GlanceNodeKt$GlanceNode$$inlined$ComposeNode$1(anonymousClass1));
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m1665setimpl(Updater.m1662constructorimpl(composerStartRestartGroup), glanceModifier, SpacerKt$Spacer$2$1.INSTANCE);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new AnonymousClass3(glanceModifier, i, i2));
    }
}
