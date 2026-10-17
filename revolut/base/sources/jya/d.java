package jya;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import pwa.k;
import pwa.n;
import tzl.l;
import vkm.v1;
import vkm.y;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends l {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wwa.b f179356g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wwa.b interactor) {
        super(0);
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f179356g = interactor;
    }

    @Override // tzl.l
    public final boolean b(Object obj2, Object obj3, Object obj4) {
        String key = (String) obj2;
        k kVar = (k) obj3;
        Intrinsics.checkNotNullParameter(key, "key");
        return (kVar == null || kVar.f240368b == null) ? false : true;
    }

    @Override // tzl.l
    public final /* bridge */ /* synthetic */ Object c(Object obj2) {
        return "";
    }

    @Override // tzl.l
    public final Object e(Object obj2, Object obj3) {
        String str;
        String currentKey = (String) obj2;
        k kVar = (k) obj3;
        Intrinsics.checkNotNullParameter(currentKey, "currentKey");
        return (kVar == null || (str = kVar.f240368b) == null) ? currentKey : str;
    }

    @Override // tzl.l
    public final Flow g(Object obj2, Object obj3, Object obj4) {
        String key = (String) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        Continuation continuation = null;
        return new y(new y(new v1(new i4g.d(this, key, (n) obj4, continuation, 15)), new c(4, null)), new im2.b(3, 2, continuation));
    }
}
