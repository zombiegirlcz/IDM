package com.revolut.feature.restricted_access;

import com.revolut.core.network.exceptions.NetworkException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreenContract$InputData$Legacy;
import com.revolut.feature.full_screen_prompt.navigation.PromptRetailBridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sri.m;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends fsi.c implements qf0.a {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qf0.c f82056h;
    public final m i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(qf0.c exceptionsOverseer, m navigator) {
        super(new fsi.b("RestrictedAccessGuardian"));
        Intrinsics.checkNotNullParameter(exceptionsOverseer, "exceptionsOverseer");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f82056h = exceptionsOverseer;
        this.i = navigator;
    }

    @Override // qf0.a
    public final Object P(Exception exc2, Continuation continuation) {
        boolean z;
        if ((exc2 instanceof NetworkException) && ((NetworkException) exc2).f51449b == 451) {
            this.i.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new PromptRetailBridgeDestination(new FullScreenPromptScreenContract$InputData$Legacy(new TextLocalisedClause(R$string.fincrime_sanctioned_region_prompt_title, null, null, 14), new TextLocalisedClause(R$string.fincrime_sanctioned_region_prompt_subtitle, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D281", null, null, null, 30), null, null, 16777164)), false, (Integer) null, 335577088, 41)));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // fsi.a
    public final void onStart() {
        this.f82056h.b(this);
    }

    @Override // fsi.c, fsi.a
    public final void onStop() {
        super.onStop();
        this.f82056h.a(this);
    }
}
