package com.revolut.controller_extensions.keyboardsuggestions;

import com.revolut.kompot.navigable.a;
import d01.g;
import efm.r;
import iz0.e;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.i;
import vkm.q0;
import yji.d;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/controller_extensions/keyboardsuggestions/KeyboardSuggestionsControllerExtension;", "Lyji/d;", "", "controller_extensions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class KeyboardSuggestionsControllerExtension extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f51200c;
    public final LinkedHashMap d;

    public KeyboardSuggestionsControllerExtension(a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f51200c = controller;
        this.d = new LinkedHashMap();
    }

    public final void Q(String sourceId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        g gVarE0 = jh.d.f(this.f51200c.m2()).e0();
        if (gVarE0 != null) {
            ((e) gVarE0).c(sourceId);
        }
    }

    public final Flow R(String sourceId) {
        r rVarD;
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        g gVarE0 = jh.d.f(this.f51200c.m2()).e0();
        return (gVarE0 == null || (rVarD = ((e) gVarE0).d(sourceId)) == null) ? i.f290039a : new q0(rd0.e.b(rVarD), new p60.a(this, sourceId, null), 1);
    }

    public final void S(String sourceId, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        g gVarE0 = jh.d.f(this.f51200c.m2()).e0();
        if (gVarE0 != null) {
            ((e) gVarE0).g(sourceId, items);
        }
    }
}
