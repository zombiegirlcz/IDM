package pn3;

import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import efm.r;
import ihm.f;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import om4.l0;
import yji.l;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s70.a f237660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y80.a f237661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f237662c;

    public b(s70.a intentProvider, y80.a permissionProvider) {
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        this.f237660a = intentProvider;
        this.f237661b = permissionProvider;
        this.f237662c = v0.a.d("create(...)");
    }

    public final boolean a() {
        y80.a aVar = this.f237661b;
        return aVar.c("android.permission.READ_CONTACTS") && aVar.c("android.permission.WRITE_CONTACTS");
    }

    public final r b() {
        r rVarStartWith = this.f237662c.startWith(Boolean.valueOf(a()));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }

    public final void c(l model, Function1 onResult) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        PermissionsFlowContract$Explanation.None none = PermissionsFlowContract$Explanation.None.f98339a;
        l.i2(model, new PermissionsFlow(r0.k(new Pair("android.permission.READ_CONTACTS", none), new Pair("android.permission.WRITE_CONTACTS", none))), null, new l0(this, 23, onResult, model), 1);
    }

    public final void d(l model, Function1 onAnswer, Function0 onDeniedDoNotAsk) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onAnswer, "onAnswer");
        Intrinsics.checkNotNullParameter(onDeniedDoNotAsk, "onDeniedDoNotAsk");
        PermissionsFlowContract$Explanation.None none = PermissionsFlowContract$Explanation.None.f98339a;
        l.i2(model, new PermissionsFlow(r0.k(new Pair("android.permission.READ_CONTACTS", none), new Pair("android.permission.WRITE_CONTACTS", none))), null, new l0(this, 24, onDeniedDoNotAsk, onAnswer), 1);
    }

    public final void e() {
        this.f237662c.onNext(Boolean.valueOf(a()));
    }
}
