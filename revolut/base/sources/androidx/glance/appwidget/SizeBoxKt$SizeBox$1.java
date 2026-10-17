package androidx.glance.appwidget;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.unit.DpSize;
import androidx.glance.Applier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class SizeBoxKt$SizeBox$1 extends u implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ long $size;
    final /* synthetic */ SizeMode $sizeMode;

    /* JADX INFO: renamed from: androidx.glance.appwidget.SizeBoxKt$SizeBox$1$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends q implements Function0<EmittableSizeBox> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0, EmittableSizeBox.class, "<init>", "<init>()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final EmittableSizeBox invoke() {
            return new EmittableSizeBox();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SizeBoxKt$SizeBox$1(Function2<? super Composer, ? super Integer, Unit> function2, int i, long j2, SizeMode sizeMode) {
        super(2);
        this.$content = function2;
        this.$$dirty = i;
        this.$size = j2;
        this.$sizeMode = sizeMode;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
        invoke((Composer) obj2, ((Number) obj3).intValue());
        return Unit.f186387a;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1209815847, i, -1, "androidx.glance.appwidget.SizeBox.<anonymous> (SizeBox.kt:73)");
        }
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        long j2 = this.$size;
        SizeMode sizeMode = this.$sizeMode;
        Function2<Composer, Integer, Unit> function2 = this.$content;
        int i2 = this.$$dirty;
        composer.startReplaceableGroup(578571862);
        int i3 = i2 & 896;
        composer.startReplaceableGroup(-548224868);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(anonymousClass1);
        } else {
            composer.useNode();
        }
        Composer composerM1662constructorimpl = Updater.m1662constructorimpl(composer);
        Updater.m1665setimpl(composerM1662constructorimpl, DpSize.m3317boximpl(j2), SizeBoxKt$SizeBox$1$2$1.INSTANCE);
        Updater.m1665setimpl(composerM1662constructorimpl, sizeMode, SizeBoxKt$SizeBox$1$2$2.INSTANCE);
        function2.invoke(composer, Integer.valueOf((i3 >> 6) & 14));
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
