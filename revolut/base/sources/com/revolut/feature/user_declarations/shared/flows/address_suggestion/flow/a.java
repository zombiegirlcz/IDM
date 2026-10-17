package com.revolut.feature.user_declarations.shared.flows.address_suggestion.flow;

import com.revolut.feature.user_declarations.shared.flows.address_suggestion.flow.AddressSuggestionFlowContract$Step;
import com.revolut.shared.feature.user_declarations.api.navigation.AddressSuggestionControllerDescriptor$InputData;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import plb.g;
import png.b;
import png.c;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements b {

    @NotNull
    public static final c Companion = new c();
    public final AddressSuggestionControllerDescriptor$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jvh.a f94616p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ivh.c f94617q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f94618r;

    public a(AddressSuggestionControllerDescriptor$InputData inputData, jvh.a workflowInteractor, ivh.c workflowsErrorHandlerExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(workflowsErrorHandlerExtension, "workflowsErrorHandlerExtension");
        this.o = inputData;
        this.f94616p = workflowInteractor;
        this.f94617q = workflowsErrorHandlerExtension;
        g gVar = new g(this, 7);
        this.f94618r = d.a(this, AddressSuggestionFlowContract$Step.AddressSuggestion.f94615a, f0.f322471a, gVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f94618r;
    }
}
