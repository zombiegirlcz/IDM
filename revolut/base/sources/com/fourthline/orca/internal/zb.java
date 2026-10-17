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
public final class zb implements mh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cc f35555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private pc f35556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35557c;
    private final Lazy d;

    public zb(cc flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f35555a = flowConfig;
        this.f35557c = "NavigationDestination.ContactsFlow::class.java";
        this.d = yhm.j.b(new ht1(this, 13));
    }

    @Override // com.fourthline.orca.internal.mh0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cc d() {
        return this.f35555a;
    }

    @Override // com.fourthline.orca.internal.mh0
    public String e() {
        return this.f35557c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dc a(zb zbVar) {
        pc pcVar = zbVar.f35556b;
        if (pcVar != null) {
            return pcVar.b();
        }
        Intrinsics.r("subComponent");
        throw null;
    }

    @Override // com.fourthline.orca.internal.mh0
    public oy b() {
        return (oy) this.d.getValue();
    }

    @Override // com.fourthline.orca.internal.mh0
    public Function1 c() {
        return new ss1(this, 11);
    }

    @Override // com.fourthline.orca.internal.mh0
    public void a(bj0 orcaSubcomponent) {
        Intrinsics.checkNotNullParameter(orcaSubcomponent, "orcaSubcomponent");
        if (orcaSubcomponent instanceof hy) {
            this.f35556b = ((hy) orcaSubcomponent).p().a(new ec(d())).build();
        } else {
            wz.a("Contacts is not a supported Flow for subtype of OrcaSubcomponent.");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(zb zbVar, NavGraphBuilder navGraphBuilder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        NavGraphBuilderKt.composable$default(navGraphBuilder, q80.f.a.f32246b.c(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(767532983, true, new kj1(zbVar, 4)), 254, null);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(zb zbVar, AnimatedContentScope composable, NavBackStackEntry it8, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(767532983, i, -1, "com.fourthline.orca.kyc.internal.flow.contacts.ContactsFlow.configureNavGraphBuilder.<anonymous>.<anonymous> (ContactsFlow.kt:40)");
        }
        pc pcVar = zbVar.f35556b;
        if (pcVar != null) {
            k00.a(pcVar, it8, composer, i & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.f186387a;
        }
        Intrinsics.r("subComponent");
        throw null;
    }
}
