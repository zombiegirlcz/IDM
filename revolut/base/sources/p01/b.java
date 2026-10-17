package p01;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements k01.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f231410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pair f231411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f231412c;
    public final l d;
    public final k01.c e;

    public b(s header, Pair pair, l lVar, l lVar2, k01.c clickResponse) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(clickResponse, "clickResponse");
        this.f231410a = header;
        this.f231411b = pair;
        this.f231412c = lVar;
        this.d = lVar2;
        this.e = clickResponse;
    }

    @Override // k01.b
    public final void a(Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1619837105);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1619837105, i2, -1, "com.revolut.core.ui_kit_remote.widget.models.ActionTileWidget.Renderable.compose (ActionTileWidget.kt:69)");
            }
            f.a(this, composerStartRestartGroup, i2 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a(this, i, 0));
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f231410a, bVar.f231410a) && Intrinsics.f(this.f231411b, bVar.f231411b) && this.f231412c.equals(bVar.f231412c) && this.d.equals(bVar.d) && this.e.equals(bVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f231410a.hashCode() * 31;
        Pair pair = this.f231411b;
        return this.e.f179898a.hashCode() + ((this.d.hashCode() + ((this.f231412c.hashCode() + ((iHashCode + (pair == null ? 0 : pair.hashCode())) * 31)) * 31)) * 31);
    }
}
