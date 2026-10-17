package com.revolut.feature_retail_user_declarations.contact_selection;

import cp5.d;
import iv0.p;
import ivh.c;
import j2c.n;
import jai.f;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements f {

    @NotNull
    public static final jai.h Companion = new jai.h();
    public final jai.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jvh.a f97533p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f97534q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f97535r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f97536s;

    public b(jai.b inputData, jvh.a workflowInteractor, c errorHandlerExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        this.o = inputData;
        this.f97533p = workflowInteractor;
        this.f97534q = errorHandlerExtension;
        Lazy lazyY0 = w.y0(new p(this, 22));
        this.f97535r = lazyY0;
        this.f97536s = d.a(this, (ContactSelectionWorkflowContract$Step) lazyY0.getValue(), f0.f322471a, new n(this, 24));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f97536s;
    }
}
