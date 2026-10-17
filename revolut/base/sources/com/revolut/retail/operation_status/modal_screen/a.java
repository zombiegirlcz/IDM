package com.revolut.retail.operation_status.modal_screen;

import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.operation_status.modal_screen.StatusViewScreenContract$Configuration;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f104339a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExplicitActivityDestination f104340b = new ExplicitActivityDestination(StatusViewScreenActivity.class);

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ActivityNavigateCommand a(a aVar, StatusViewConfiguration statusViewConfiguration, NaviCommand naviCommand, CompositeCommand compositeCommand, NaviCommand naviCommand2, String str, int i) {
        int i2 = 7;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        NaviCommand primaryButtonCommand = (i & 2) != 0 ? new FinishCommand(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i2) : naviCommand;
        NaviCommand secondaryButtonCommand = (i & 8) != 0 ? new FinishCommand(objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, i2) : compositeCommand;
        NaviCommand finishCommand = (i & 32) != 0 ? new FinishCommand(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, i2) : naviCommand2;
        f0 clauseClickCommands = f0.f322471a;
        String str2 = (i & 128) == 0 ? str : null;
        boolean z = (i & 256) == 0;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(statusViewConfiguration, "statusViewConfiguration");
        Intrinsics.checkNotNullParameter(primaryButtonCommand, "primaryButtonCommand");
        Intrinsics.checkNotNullParameter(secondaryButtonCommand, "secondaryButtonCommand");
        Intrinsics.checkNotNullParameter(finishCommand, "finishCommand");
        Intrinsics.checkNotNullParameter(clauseClickCommands, "clauseClickCommands");
        if (str2 == null) {
            str2 = "STATUS_VIEW_SCREEN_FLOW";
        }
        return new ActivityNavigateCommand(f104340b, new StatusViewScreenContract$Configuration.Basic(str2, statusViewConfiguration, primaryButtonCommand, null, secondaryButtonCommand, null, finishCommand, clauseClickCommands, z), null, null, 0, null, null, null, null, false, 1020);
    }
}
