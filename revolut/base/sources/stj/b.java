package stj;

import d0j.m;
import d0j.q;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import tzl.l;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends l {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f265604g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h rewardsHubInteractor) {
        super(0);
        Intrinsics.checkNotNullParameter(rewardsHubInteractor, "rewardsHubInteractor");
        this.f265604g = rewardsHubInteractor;
    }

    @Override // tzl.l
    public final boolean b(Object obj2, Object obj3, Object obj4) {
        String str;
        String key = (String) obj2;
        q qVar = (q) obj3;
        Intrinsics.checkNotNullParameter(key, "key");
        return (qVar == null || (str = qVar.f110427c) == null || str.length() <= 0) ? false : true;
    }

    @Override // tzl.l
    public final /* bridge */ /* synthetic */ Object c(Object obj2) {
        return "";
    }

    @Override // tzl.l
    public final Object e(Object obj2, Object obj3) {
        String str;
        String currentKey = (String) obj2;
        q qVar = (q) obj3;
        Intrinsics.checkNotNullParameter(currentKey, "currentKey");
        return (qVar == null || (str = qVar.f110427c) == null) ? currentKey : str;
    }

    @Override // tzl.l
    public final Flow g(Object obj2, Object obj3, Object obj4) {
        String key = (String) obj2;
        m mVar = (m) obj4;
        Intrinsics.checkNotNullParameter(key, "key");
        if (mVar == null) {
            mVar = m.ACTIVE;
        }
        if (key.length() == 0) {
            key = null;
        }
        d0j.l params = new d0j.l(mVar, key);
        h hVar = this.f265604g;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        mtj.q qVar = (mtj.q) hVar.f265610a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return qVar.f208898j.b(params, loadingStrategy);
    }
}
