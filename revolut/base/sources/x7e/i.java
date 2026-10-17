package x7e;

import com.revolut.feature.subaccount.impl.ui.create.screen.permission.UserPermissionSelectorScreenContract$InputData;
import java.util.ArrayList;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;
import zhm.w;
import zm3.l;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f303184p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f303185q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p stateMapper, UserPermissionSelectorScreenContract$InputData inputData, j60.a bottomExpandableDialogControllerExtension) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        this.f303184p = bottomExpandableDialogControllerExtension;
        this.f303185q = new e(inputData.f89052a, h0.f322473a);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f303185q;
    }

    public final void y2() {
        List<l> list = ((e) t2()).f303180a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (l lVar : list) {
            arrayList.add(new h6e.a(lVar, ((e) t2()).f303181b.contains(lVar.getCode())));
        }
        v2(new f(arrayList));
    }
}
