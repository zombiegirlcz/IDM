package xe0;

import android.content.Context;
import az0.l1;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements ue0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f304516a;

    public c(Context context, String fileName, xql.a migrator, qm.e encryptionProvider, ye0.b storageSizeChecker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(migrator, "migrator");
        Intrinsics.checkNotNullParameter(encryptionProvider, "encryptionProvider");
        Intrinsics.checkNotNullParameter(storageSizeChecker, "storageSizeChecker");
        this.f304516a = j.b(new l1(context, fileName, encryptionProvider, migrator, storageSizeChecker, 9));
    }

    @Override // ue0.c
    public final Flow C0(String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        return q.k(new ve0.b(this, key, type, (Continuation) null, 3));
    }

    @Override // ue0.c
    public boolean I0(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ij.e eVarEdit = a().edit();
        eVarEdit.i(key);
        return eVarEdit.commit();
    }

    public final ij.a a() {
        Object value = this.f304516a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ij.a) value;
    }

    @Override // od0.e
    public void clear() {
        ij.e eVarEdit = a().edit();
        eVarEdit.a();
        eVarEdit.commit();
    }

    @Override // ue0.c
    public final Set keys() {
        Set setB = a().b();
        Intrinsics.checkNotNullExpressionValue(setB, "keys(...)");
        return setB;
    }

    @Override // ue0.c
    public Object v0(Object obj2, String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(obj2, "default");
        Object objT2 = T2(key, type);
        return objT2 == null ? obj2 : objT2;
    }
}
