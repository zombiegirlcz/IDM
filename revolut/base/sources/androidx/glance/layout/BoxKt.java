package androidx.glance.layout;

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
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/glance/GlanceModifier;", "modifier", "Landroidx/glance/layout/Alignment;", "contentAlignment", "Lkotlin/Function0;", "", "content", "Box", "(Landroidx/glance/GlanceModifier;Landroidx/glance/layout/Alignment;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class BoxKt {

    /* JADX INFO: renamed from: androidx.glance.layout.BoxKt$Box$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends q implements Function0<EmittableBox> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0, EmittableBox.class, "<init>", "<init>()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final EmittableBox invoke() {
            return new EmittableBox();
        }
    }

    /* JADX INFO: renamed from: androidx.glance.layout.BoxKt$Box$3, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass3 extends u implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ Alignment $contentAlignment;
        final /* synthetic */ GlanceModifier $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(GlanceModifier glanceModifier, Alignment alignment, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.$modifier = glanceModifier;
            this.$contentAlignment = alignment;
            this.$content = function2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
            invoke((Composer) obj2, ((Number) obj3).intValue());
            return Unit.f186387a;
        }

        public final void invoke(Composer composer, int i) {
            BoxKt.Box(this.$modifier, this.$contentAlignment, this.$content, composer, this.$$changed | 1, this.$$default);
        }
    }

    public static final void Box(GlanceModifier glanceModifier, Alignment alignment, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1959221577);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(glanceModifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(alignment) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(function2) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                glanceModifier = GlanceModifier.INSTANCE;
            }
            if (i6 != 0) {
                alignment = Alignment.INSTANCE.getTopStart();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1959221577, i3, -1, "androidx.glance.layout.Box (Box.kt:61)");
            }
            AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(578571862);
            int i21 = i3 & 896;
            composerStartRestartGroup.startReplaceableGroup(-548224868);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(anonymousClass1);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1662constructorimpl = Updater.m1662constructorimpl(composerStartRestartGroup);
            Updater.m1665setimpl(composerM1662constructorimpl, glanceModifier, BoxKt$Box$2$1.INSTANCE);
            Updater.m1665setimpl(composerM1662constructorimpl, alignment, BoxKt$Box$2$2.INSTANCE);
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i21 >> 6) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        GlanceModifier glanceModifier2 = glanceModifier;
        Alignment alignment2 = alignment;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new AnonymousClass3(glanceModifier2, alignment2, function2, i, i2));
    }
}
