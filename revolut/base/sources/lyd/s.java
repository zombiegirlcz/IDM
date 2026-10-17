package lyd;

import ble.c1;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7e.b f200800a;

    public s(d7e.b userAccountCreatedDateProvider) {
        Intrinsics.checkNotNullParameter(userAccountCreatedDateProvider, "userAccountCreatedDateProvider");
        this.f200800a = userAccountCreatedDateProvider;
    }

    @Override // lyd.i
    public final t a() {
        return t.CURRENCIES;
    }

    @Override // lyd.i
    public final Flow b() {
        return new c1(new v1(new ll6.i(this.f200800a, (Continuation) null, 27)), 22);
    }

    @Override // lyd.i
    public final Flow c() {
        return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
    }
}
