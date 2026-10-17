package ve0;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import java.util.Set;
import je0.d;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ue0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f288099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f288100b;

    public c(Context context, String fileName, d mapper, xql.a migrator, ye0.b bVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(migrator, "migrator");
        this.f288099a = mapper;
        this.f288100b = j.b(new r5.c(context, fileName, migrator, bVar, 5));
    }

    @Override // ue0.c
    public final Flow C0(String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        return q.k(new b(this, key, type, (Continuation) null, 0));
    }

    @Override // ue0.c
    public final void G(Object value, String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        a().edit().putString(key, (String) this.f288099a.c(value, type)).commit();
    }

    @Override // ue0.c
    public final boolean I0(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return a().edit().remove(key).commit();
    }

    @Override // ue0.c
    public final Object T2(String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        return b(key, type);
    }

    public final SharedPreferences a() {
        Object value = this.f288100b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    public final Object b(String str, Type type) {
        String string = a().getString(str, null);
        if (string != null) {
            if (d0.W(string)) {
                string = null;
            }
            if (string != null) {
                return this.f288099a.b(string, type);
            }
        }
        return null;
    }

    @Override // od0.e
    public final void clear() {
        a().edit().clear().commit();
    }

    @Override // ue0.c
    public final Set keys() {
        return a().getAll().keySet();
    }

    @Override // ue0.c
    public final Object v0(Object obj2, String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(obj2, "default");
        Object objB = b(key, type);
        return objB == null ? obj2 : objB;
    }
}
