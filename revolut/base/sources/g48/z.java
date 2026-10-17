package g48;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class z {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f140417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f140418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f140419c;
    public final cl3.a d;
    public final k38.a e;
    public final o38.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x48.k f140420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w38.t f140421h;

    public z(r0 jointAccountsInteractor, wsg.n walletInteractor, ang.f userInteractor, cl3.a contactsInteractor, k38.a initialArticleNavigationDecorator, o38.a jointNavigationProvider, x48.k jointMcyNavigationResolver, w38.t pendingAccountBottomSheetProvider) {
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(initialArticleNavigationDecorator, "initialArticleNavigationDecorator");
        Intrinsics.checkNotNullParameter(jointNavigationProvider, "jointNavigationProvider");
        Intrinsics.checkNotNullParameter(jointMcyNavigationResolver, "jointMcyNavigationResolver");
        Intrinsics.checkNotNullParameter(pendingAccountBottomSheetProvider, "pendingAccountBottomSheetProvider");
        this.f140417a = jointAccountsInteractor;
        this.f140418b = walletInteractor;
        this.f140419c = userInteractor;
        this.d = contactsInteractor;
        this.e = initialArticleNavigationDecorator;
        this.f = jointNavigationProvider;
        this.f140420g = jointMcyNavigationResolver;
        this.f140421h = pendingAccountBottomSheetProvider;
    }

    public final ufm.i a(Function1 function1) {
        ufm.i iVar = new ufm.i(te0.w.o0(skm.p0.f264003c, new s(this, null, 0)), new g1i.i0(27, new g0f.f(function1, this, 29)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final ufm.i b() {
        return ((l48.e) this.f).b();
    }

    public final ufm.i c(AccountId.Joint joint, TabAccountsInitialPayload.Action action) {
        efm.d0 d0VarJ = osg.b.j(this.f140418b, null, null, io3.i.INTERNAL, null, null, joint, 27);
        int i = 0;
        k kVar = new k(i, new j(this, action, i));
        d0VarJ.getClass();
        ufm.i iVar = new ufm.i(d0VarJ, kVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final ufm.i d() {
        ufm.i iVar = new ufm.i(te0.w.o0(skm.p0.f264003c, new s(this, null, 1)), new g1i.i0(26, new g(this, 1)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final ufm.i e(boolean z, Function2 function2) {
        ufm.i iVar = new ufm.i(te0.w.o0(skm.p0.f264003c, new s(this, null, 2)), new g1i.i0(23, new h(this, z, function2, 0)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
