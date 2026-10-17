package uk0;

import gim.i;
import ite.d;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tk0.g;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class a implements mk0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f280638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f280639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f280640c;

    public a(mk0.a source, b modifier) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.f280638a = source;
        this.f280639b = modifier;
        this.f280640c = j.b(new d(this, 28));
    }

    @Override // mk0.a
    public final Object a(g key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return k().a(key);
    }

    @Override // mk0.p
    public final Object b(i iVar) {
        Object objB = k().b(iVar);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
    }

    @Override // mk0.a
    public final Object c(ArrayList arrayList, i iVar) {
        Object objC = k().c(arrayList, iVar);
        return objC == fim.a.COROUTINE_SUSPENDED ? objC : Unit.f186387a;
    }

    @Override // mk0.a
    public final a d(b modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        return new a(this, modifier);
    }

    @Override // mk0.a
    public final Object e(g gVar, Object obj2, Continuation continuation) {
        Object objE = k().e(gVar, obj2, continuation);
        return objE == fim.a.COROUTINE_SUSPENDED ? objE : Unit.f186387a;
    }

    @Override // mk0.a
    public final Flow f(g key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return k().f(key);
    }

    @Override // mk0.a
    public final void g(g key, Serializable value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        k().g(key, value);
    }

    @Override // mk0.a
    public final Object h(g key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return k().h(key);
    }

    @Override // mk0.p
    public final Object i(i iVar) {
        Object objI = k().i(iVar);
        return objI == fim.a.COROUTINE_SUSPENDED ? objI : Unit.f186387a;
    }

    @Override // mk0.a
    public final Flow j(g key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return k().j(key);
    }

    public final mk0.a k() {
        return (mk0.a) this.f280640c.getValue();
    }
}
