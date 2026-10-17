package opl;

import akl.f0;
import cli.g;
import cli.k;
import cli.y;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.disconnect.ConnectedClientDisconnectBottomSheetContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends h implements dli.b {
    public final ConnectedClientDisconnectBottomSheetContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f0 f227690p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f227691q;

    public d(ConnectedClientDisconnectBottomSheetContract$InputData inputData, f0 repository, f stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f227690p = repository;
        this.f227691q = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f227691q;
    }
}
