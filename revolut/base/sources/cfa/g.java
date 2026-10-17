package cfa;

import c7e.i;
import com.revolut.feature.tab.accounts.api.remove_account.RemoveAccountContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends nda.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final nda.b f23668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z1 f23669m;

    public g(nda.b contentProvider) {
        Intrinsics.checkNotNullParameter(contentProvider, "contentProvider");
        this.f23668l = contentProvider;
        this.f23669m = q.b(1, 1, ukm.f.DROP_OLDEST);
    }

    public final z1 Z2(RemoveAccountContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        N2(o2(new tfe.a(inputData)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new i(this, inputData, 12));
        return this.f23669m;
    }
}
