package n3a;

import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import efm.r;
import ihm.f;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moe.c;
import yji.l;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s70.a f211974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y80.a f211975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f211976c;

    public b(s70.a intentProvider, y80.a permissionProvider) {
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        this.f211974a = intentProvider;
        this.f211975b = permissionProvider;
        this.f211976c = v0.a.d("create(...)");
    }

    public final r a() {
        y80.a aVar = this.f211975b;
        r rVarStartWith = this.f211976c.startWith(Boolean.valueOf(aVar.c("android.permission.READ_CONTACTS") && aVar.c("android.permission.WRITE_CONTACTS")));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }

    public final void b(l model, Function1 onResult) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        PermissionsFlowContract$Explanation.None none = PermissionsFlowContract$Explanation.None.f98339a;
        l.i2(model, new PermissionsFlow(r0.k(new Pair("android.permission.READ_CONTACTS", none), new Pair("android.permission.WRITE_CONTACTS", none))), null, new c(this, 25, onResult, model), 1);
    }
}
