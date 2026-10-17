package com.revolut.retail.common.ui.activity.delegate.keyboardsuggestions;

import android.app.Activity;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import d01.g;
import efm.r;
import fsi.b;
import fsi.c;
import iz0.e;
import jh.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sp5.h;
import spi.a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00042\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/common/ui/activity/delegate/keyboardsuggestions/KeyboardSuggestionsDelegate;", "Lfsi/c;", "Lspi/a;", "", "Companion", "a", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class KeyboardSuggestionsDelegate extends c implements a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f98559j = new b("KEYBOARD_SUGGESTIONS_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Activity f98560h;
    public AnalyticsContext i;

    /* JADX INFO: renamed from: com.revolut.retail.common.ui.activity.delegate.keyboardsuggestions.KeyboardSuggestionsDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardSuggestionsDelegate(Activity activity) {
        super(f98559j);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f98560h = activity;
    }

    public final void N() {
        g gVarE0 = d.f(this.f98560h).e0();
        if (gVarE0 != null) {
            e eVar = (e) gVarE0;
            Intrinsics.checkNotNullParameter("legacy_source_id", "sourceId");
            iz0.d dVar = eVar.f;
            String str = dVar.f169811a.f169808a;
            iz0.c cVar = dVar.f169811a;
            iz0.c cVar2 = new iz0.c(cVar.f169810c, str, cVar.f169809b);
            iz0.c cVar3 = dVar.f169812b;
            eVar.e(new iz0.d(cVar2, new iz0.c(cVar3.f169810c, "legacy_source_id", cVar3.f169809b)));
        }
    }

    public final r s() {
        r rVarD;
        g gVarE0 = d.f(this.f98560h).e0();
        if (gVarE0 != null && (rVarD = ((e) gVarE0).d("legacy_source_id")) != null) {
            r rVarDoOnNext = rVarD.doOnNext(new h(9, new sl5.a(this, 13)));
            if (rVarDoOnNext != null) {
                return rVarDoOnNext;
            }
        }
        r rVarEmpty = r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }
}
