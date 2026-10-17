package nhm;

import java.util.function.Function;

/* JADX INFO: loaded from: classes14.dex */
public final class o extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f215608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f215609b;

    public o(p pVar, Function function) {
        this.f215608a = pVar;
        this.f215609b = function;
    }

    @Override // nhm.a
    public final Object a() {
        return this.f215609b.apply(this.f215608a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f215608a.hasNext();
    }
}
