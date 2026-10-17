package com.revolut.feature.in_app_calls.flow;

import android.os.Build;
import be7.k;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.in_app_calls.R$string;
import com.revolut.feature.in_app_calls.flow.InAppCallsFlowContract$Step;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Explanation;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.kompot.navigable.flow.FlowStep;
import g75.i;
import gaa.g;
import ge7.d;
import ge7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends h implements ge7.b {

    @NotNull
    private static final d Companion = new d();
    public final InAppCallsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f74810p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y80.a f74811q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final PermissionsControllerContract$Permission f74812r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final PermissionsControllerContract$Permission f74813s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f74814t;
    public final qki.d u;

    public c(InAppCallsFlowContract$InputData inputData, k inAppCallsInteractor, y80.a permissionProvider) {
        FlowStep flowStep;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inAppCallsInteractor, "inAppCallsInteractor");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        this.o = inputData;
        this.f74810p = inAppCallsInteractor;
        this.f74811q = permissionProvider;
        this.f74812r = new PermissionsControllerContract$Permission("android.permission.RECORD_AUDIO", null, new PermissionsControllerContract$Explanation.PromptScreen(new TextLocalisedClause(R$string.in_app_calls_screen_permission_microphone_denied_title, null, null, 14), new TextLocalisedClause(R$string.in_app_calls_screen_permission_microphone_denied_subtitle, null, null, 14), new TextLocalisedClause(R$string.in_app_calls_screen_permission_microphone_denied_open_settings, null, null, 14), new GlyphImage(R$drawable.uikit_icn_24_no_microphone, null, null, 6), null), true, 2);
        PermissionsControllerContract$Explanation.None none = PermissionsControllerContract$Explanation.None.f80324a;
        this.f74813s = new PermissionsControllerContract$Permission("android.permission.BLUETOOTH_CONNECT", none, none, false);
        int i = e.f143268a[inputData.f74803a.ordinal()];
        if (i != 1) {
            flowStep = InAppCallsFlowContract$Step.InProgress.f74805a;
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!permissionProvider.c("android.permission.RECORD_AUDIO") || (Build.VERSION.SDK_INT >= 31 && !permissionProvider.a())) {
                flowStep = InAppCallsFlowContract$Step.RecordAudioPermission.f74806a;
            }
        } else {
            flowStep = InAppCallsFlowContract$Step.Ringing.f74807a;
        }
        this.f74814t = cp5.d.a(this, flowStep, f0.f322471a, new i(this, 23));
        this.u = hx7.e.b(this, InAppCallsFlowContract$State.f74804a);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(((com.revolut.feature.in_app_calls.b) this.f74810p).f74794b), null, null, new g(this, null, 14), 3);
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.u;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74814t;
    }
}
