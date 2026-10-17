package com.revolut.feature.robo.impl.ui.screen.templates;

import emc.e;
import kotlin.jvm.internal.Intrinsics;
import zjh.f;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TemplatesScreenContract$Input f85217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f85218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f85219c;

    public a(TemplatesScreenContract$Input input, f portfolioInteractor, e templatesInteractor) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        this.f85217a = input;
        this.f85218b = portfolioInteractor;
        this.f85219c = templatesInteractor;
    }
}
