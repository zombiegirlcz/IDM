package p01;

import android.text.SpannableStringBuilder;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements k01.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f231431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f231432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k01.c f231433c;

    public h(s header, SpannableStringBuilder spannableStringBuilder, k01.c clickResponse) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(clickResponse, "clickResponse");
        this.f231431a = header;
        this.f231432b = spannableStringBuilder;
        this.f231433c = clickResponse;
    }

    @Override // k01.b
    public final void a(Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1066416333);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1066416333, i2, -1, "com.revolut.core.ui_kit_remote.widget.models.BalanceTileWidget.Renderable.compose (BalanceTileWidget.kt:52)");
            }
            k.a(this, composerStartRestartGroup, i2 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new g(this, i, 0));
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f231431a, hVar.f231431a) && Intrinsics.f(this.f231432b, hVar.f231432b) && this.f231433c.equals(hVar.f231433c);
    }

    public final int hashCode() {
        int iHashCode = this.f231431a.hashCode() * 31;
        CharSequence charSequence = this.f231432b;
        return this.f231433c.f179898a.hashCode() + ((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31);
    }
}
