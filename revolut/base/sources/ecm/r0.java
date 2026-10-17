package ecm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f124864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f124865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[][] f124866c;

    public r0(List list, b bVar, Object[][] objArr) {
        this.f124864a = (List) Preconditions.checkNotNull(list, "addresses are not set");
        this.f124865b = (b) Preconditions.checkNotNull(bVar, "attrs");
        this.f124866c = (Object[][]) Preconditions.checkNotNull(objArr, "customOptions");
    }

    public static gpk.c b() {
        gpk.c cVar = new gpk.c();
        cVar.f145464b = b.f124779b;
        cVar.f145465c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        return cVar;
    }

    public final Object a(q1 q1Var) {
        Preconditions.checkNotNull(q1Var, "key");
        int i = 0;
        while (true) {
            Object[][] objArr = this.f124866c;
            if (i >= objArr.length) {
                q1Var.getClass();
                return null;
            }
            if (q1Var.equals(objArr[i][0])) {
                return objArr[i][1];
            }
            i++;
        }
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("addrs", this.f124864a).add("attrs", this.f124865b).add("customOptions", Arrays.deepToString(this.f124866c)).toString();
    }
}
