package ue0;

import ard.c0;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.z1;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements c {

    @NotNull
    public static final C1544a Companion = new C1544a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f279284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f279285b;

    /* JADX INFO: renamed from: ue0.a$a, reason: collision with other inner class name */
    public static final class C1544a {
        private C1544a() {
        }
    }

    @yhm.d
    public a() {
        this(0);
    }

    @Override // ue0.c
    public final Flow C0(String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        return new c0(this.f279285b, this, key, type, 23);
    }

    @Override // ue0.c
    public final void G(Object value, String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f279284a.put(key, value);
        this.f279285b.k(Unit.f186387a);
    }

    @Override // ue0.c
    public final boolean I0(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f279284a.remove(key);
        this.f279285b.k(Unit.f186387a);
        return true;
    }

    @Override // ue0.c
    public final Object T2(String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        Object obj2 = this.f279284a.get(key);
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // od0.e
    public final void clear() {
        this.f279284a.clear();
        this.f279285b.k(Unit.f186387a);
    }

    @Override // ue0.c
    public final Set keys() {
        Set setKeySet = this.f279284a.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        return setKeySet;
    }

    @Override // ue0.c
    public final Object v0(Object obj2, String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(obj2, "default");
        Object objT2 = T2(key, type);
        return objT2 == null ? obj2 : objT2;
    }

    public a(int i) {
        this.f279284a = new ConcurrentHashMap();
        z1 z1VarA = ta6.a.a(1);
        z1VarA.k(Unit.f186387a);
        this.f279285b = z1VarA;
    }
}
