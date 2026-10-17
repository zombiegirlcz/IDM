package com.fourthline.orca.internal;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.content.NavBackStackEntry;
import androidx.content.NavGraphBuilder;
import androidx.content.compose.NavGraphBuilderKt;
import com.fourthline.orca.internal.q80;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class hh implements mh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final um f29260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private kq f29261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29262c;
    private final Lazy d;

    public hh(um flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f29260a = flowConfig;
        this.f29262c = "NavigationDestination.Document::class.java";
        this.d = yhm.j.b(new ym1(this, 0));
    }

    @Override // com.fourthline.orca.internal.mh0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public um d() {
        return this.f29260a;
    }

    @Override // com.fourthline.orca.internal.mh0
    public oy b() {
        return (oy) this.d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l31 b(hh hhVar) {
        kq kqVar = hhVar.f29261b;
        if (kqVar != null) {
            return kqVar.D();
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    @Override // com.fourthline.orca.internal.mh0
    public void a(bj0 orcaSubcomponent) {
        Intrinsics.checkNotNullParameter(orcaSubcomponent, "orcaSubcomponent");
        kq kqVar = orcaSubcomponent instanceof kq ? (kq) orcaSubcomponent : null;
        if (kqVar != null) {
            this.f29261b = kqVar;
        } else {
            wz.a("Document Component is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    @Override // com.fourthline.orca.internal.mh0
    public Function1 c() {
        return new mp1(this, 11);
    }

    @Override // com.fourthline.orca.internal.mh0
    public String e() {
        return this.f29262c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Lazy lazy, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-743719889, i, -1, "com.fourthline.orca.document.internal.DocumentComponentFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (DocumentComponentFlow.kt:40)");
        }
        l00.a(a(lazy), it8, composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(hh hhVar, NavGraphBuilder navGraphBuilder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Lazy lazyB = yhm.j.b(new ym1(hhVar, 1));
        NavGraphBuilderKt.composable$default(navGraphBuilder, new q80.g.a(null, 1, null).c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(535238264, true, new qk1(lazyB, 1)), 254, null);
        NavGraphBuilderKt.composable$default(navGraphBuilder, new q80.h.b(null, 1, null).c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-743719889, true, new qk1(lazyB, 2)), 254, null);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eo a(hh hhVar) {
        kq kqVar = hhVar.f29261b;
        if (kqVar != null) {
            return kqVar.c().build();
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    private static final eo a(Lazy lazy) {
        return (eo) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(Lazy lazy, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(535238264, i, -1, "com.fourthline.orca.document.internal.DocumentComponentFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (DocumentComponentFlow.kt:36)");
        }
        l00.b(a(lazy), it8, composer, i & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f186387a;
    }
}
