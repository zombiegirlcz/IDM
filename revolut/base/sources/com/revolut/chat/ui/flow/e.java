package com.revolut.chat.ui.flow;

import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yhm.j;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends h implements a50.c {
    public final ChatFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q30.a f51159p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j30.c f51160q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nf3.a f51161r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Lazy f51162s;

    public e(ChatFlowContract$InputData inputData, q30.a chatIntroInteractor, j30.c chatFeatureToggles, nf3.a chatAssistantResourcesConfig) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(chatIntroInteractor, "chatIntroInteractor");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(chatAssistantResourcesConfig, "chatAssistantResourcesConfig");
        this.o = inputData;
        this.f51159p = chatIntroInteractor;
        this.f51160q = chatFeatureToggles;
        this.f51161r = chatAssistantResourcesConfig;
        this.f51162s = j.b(new a2g.a(this, 1));
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
        X1(new kii.c(null, null, new TextLocalisedClause(R$string.chat_common_error, null, null, 14), null, null, null, false, 1019));
        return true;
    }

    @Override // yki.g
    public final yki.b s() {
        return (yki.b) this.f51162s.getValue();
    }
}
