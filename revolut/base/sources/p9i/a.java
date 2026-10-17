package p9i;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import ne0.l;
import ne0.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements j {

    @NotNull
    public static final C1298a Companion = new C1298a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f234322a;

    /* JADX INFO: renamed from: p9i.a$a, reason: collision with other inner class name */
    public static final class C1298a {
        private C1298a() {
        }
    }

    public a() {
        n.Companion.getClass();
        this.f234322a = l.a(100, 10L);
    }

    @Override // od0.e
    public final void clear() {
        this.f234322a.clear();
    }

    @Override // ne0.j
    public final boolean contains(Object obj2) {
        String key = (String) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f234322a.contains(key);
    }

    @Override // ne0.j
    public final void f(Object obj2, Object value) {
        String key = (String) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f234322a.f(key, value);
    }

    @Override // ne0.j
    public final Object get(Object obj2) {
        String key = (String) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f234322a.get(key);
    }

    @Override // ne0.j
    public final List getAll() {
        return this.f234322a.getAll();
    }

    @Override // ne0.j
    public final Object remove(Object obj2) {
        String key = (String) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f234322a.remove(key);
    }

    @Override // ne0.j
    public final void t1(Collection values, Function1 keySelector) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        this.f234322a.t1(values, keySelector);
    }
}
