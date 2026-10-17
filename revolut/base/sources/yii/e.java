package yii;

import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ulm.p0;
import yhm.j;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements ue0.c {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f314333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f314334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f314335c;

    public e(String versionKey, ue0.c storage) {
        Intrinsics.checkNotNullParameter(versionKey, "versionKey");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f314333a = versionKey;
        this.f314334b = storage;
        this.f314335c = j.b(new p0(this, 13));
    }

    @Override // ue0.c
    public final void G(Object value, String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        a().G(value, key, type);
    }

    @Override // ue0.c
    public final boolean I0(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return a().I0(key);
    }

    @Override // ue0.c
    public final Object T2(String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        return a().T2(key, type);
    }

    public final ue0.c a() {
        return (ue0.c) this.f314335c.getValue();
    }

    @Override // od0.e
    public final void clear() {
        a().clear();
    }

    @Override // ue0.c
    public final Set keys() {
        return a().keys();
    }

    @Override // ue0.c
    public final Object v0(Object obj2, String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(obj2, "default");
        return a().v0(obj2, key, type);
    }
}
