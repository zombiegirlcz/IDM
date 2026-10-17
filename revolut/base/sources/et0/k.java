package et0;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.SelectableInfo;
import androidx.compose.foundation.text.selection.SelectionAdjustmentKt;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.LinearProgressWithAmountDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit.views.code.CodeEditor;
import com.revolut.sso.api.R$string;
import k50.j4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f129057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f129058c;

    public /* synthetic */ k(int i, Object obj2, int i2) {
        this.f129056a = i2;
        this.f129057b = i;
        this.f129058c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f129056a;
        int iMax = this.f129057b;
        Object obj2 = this.f129058c;
        switch (i) {
            case 0:
                ((l) obj2).i.invoke(Integer.valueOf(iMax));
                return Unit.f186387a;
            case 1:
                return Integer.valueOf((((LinearProgressWithAmountDelegate.Model) obj2).f52678j.f54089a.size() - 1) * iMax);
            case 2:
                ((j4) obj2).X1(new mii.i("tooltip_message_copied", new TextLocalisedClause(iMax, null, null, 14), null, null, 28));
                return Unit.f186387a;
            case 3:
                OverlappedIconsView.Companion companion = OverlappedIconsView.INSTANCE;
                KeyEvent.Callback childAt = ((RecyclerView) obj2).getChildAt(iMax);
                if (childAt instanceof ix0.h0) {
                    return (ix0.h0) childAt;
                }
                return null;
            case 4:
                return new AnalyticsContext(m72.b.h("app_unlock_cache", com.bumptech.glide.c.g(new gvi.n(iMax, (String) obj2, 2)), AnalyticsContext.INSTANCE));
            case 5:
                CodeEditor codeEditor = (CodeEditor) obj2;
                codeEditor.G = false;
                CharSequence text = codeEditor.f[iMax].getText();
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                if (text.length() == 0) {
                    iMax = Math.max(iMax - 1, 0);
                }
                codeEditor.l0(iMax, "");
                codeEditor.i0();
                codeEditor.f0(codeEditor.autoFocusEnabled);
                codeEditor.g0();
                return Unit.f186387a;
            case 6:
                tpl.s sVar = (tpl.s) obj2;
                r70.c.b(sVar.f273433q, 3);
                sVar.X1(new mii.f("IDENTITY_DOCUMENT_COPIED", new TextLocalisedClause(R$string.revolut_sso_document_copied, zhm.u.c(sVar.f273436t.b(new TextLocalisedClause(iMax, null, null, 14)).toString()), null, 12), null, null, null, null, 124));
                return Unit.f186387a;
            default:
                return Integer.valueOf(SelectionAdjustmentKt.updateSelectionBoundary$lambda$0((SelectableInfo) obj2, iMax));
        }
    }

    public /* synthetic */ k(Object obj2, int i, int i2) {
        this.f129056a = i2;
        this.f129058c = obj2;
        this.f129057b = i;
    }
}
