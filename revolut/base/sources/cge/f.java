package cge;

import com.revolut.feature.tab.accounts.api.mode.TabAccountsMode;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pzl.s;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements qfe.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rge.b f23952a;

    public f(rge.b registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f23952a = registry;
    }

    @Override // qfe.d
    public final Object a(ProductAccountDescriptor$Value.Main main, ProductAccountDescriptor$Value.Main main2, s sVar) {
        Object objA = this.f23952a.b(TabAccountsMode.Home.f89466a).d().a(main, main2, sVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }
}
