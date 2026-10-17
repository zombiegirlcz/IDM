package ix0;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableScatterSet f169291a = ScatterSetKt.mutableScatterSetOf();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.b f169292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f169293c;

    public s1() {
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f169292b = bVarE;
        this.f169293c = bVarE;
    }

    public final boolean a() {
        Object objF = this.f169292b.f();
        Intrinsics.h(objF);
        return ((Boolean) objF).booleanValue();
    }

    public abstract void b();

    public abstract void c();

    public final void d(Object token) {
        Intrinsics.checkNotNullParameter(token, "token");
        MutableScatterSet mutableScatterSet = this.f169291a;
        if (mutableScatterSet.add(token) && mutableScatterSet.get_size() == 1) {
            b();
            this.f169292b.onNext(Boolean.TRUE);
        }
    }

    public final void e(Object token) {
        Intrinsics.checkNotNullParameter(token, "token");
        MutableScatterSet mutableScatterSet = this.f169291a;
        if (mutableScatterSet.remove(token) && mutableScatterSet.isEmpty()) {
            c();
            this.f169292b.onNext(Boolean.FALSE);
        }
    }
}
