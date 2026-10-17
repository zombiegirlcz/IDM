package bpc;

import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import kotlin.jvm.internal.Intrinsics;
import m1h.t;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements m1h.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f17583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qmc.b f17584b;

    public j(i dialogMapper, qmc.b roboContextProvider) {
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(roboContextProvider, "roboContextProvider");
        this.f17583a = dialogMapper;
        this.f17584b = roboContextProvider;
    }

    @Override // m1h.l
    public final m1h.m a(TransferSubjectId transferSubjectId, t view, j60.a bottomExpandableDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        g gVar = new g(bottomExpandableDialogControllerExtension, this.f17583a, this.f17584b);
        return new m1h.m(gVar, new c(gVar, view));
    }
}
