package u9;

import com.fasterxml.jackson.databind.JavaType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final av0.b[] f278285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f278286b;

    public o(HashMap map) {
        int size = map.size();
        int i = 8;
        while (i < (size <= 64 ? size + size : size + (size >> 2))) {
            i += i;
        }
        this.f278286b = i - 1;
        av0.b[] bVarArr = new av0.b[i];
        for (Map.Entry entry : map.entrySet()) {
            x9.s sVar = (x9.s) entry.getKey();
            int i2 = sVar.f303529a & this.f278286b;
            bVarArr[i2] = new av0.b(bVarArr[i2], sVar, (k9.k) entry.getValue());
        }
        this.f278285a = bVarArr;
    }

    public final k9.k a(JavaType javaType) {
        av0.b bVar = this.f278285a[(javaType.f26183b - 1) & this.f278286b];
        if (bVar == null) {
            return null;
        }
        if (!bVar.f9866a && javaType.equals((JavaType) bVar.e)) {
            return (k9.k) bVar.f9867b;
        }
        while (true) {
            bVar = (av0.b) bVar.f9868c;
            if (bVar == null) {
                return null;
            }
            if (!bVar.f9866a && javaType.equals((JavaType) bVar.e)) {
                return (k9.k) bVar.f9867b;
            }
        }
    }

    public final k9.k b(Class cls) {
        av0.b bVar = this.f278285a[cls.getName().hashCode() & this.f278286b];
        if (bVar == null) {
            return null;
        }
        if (((Class) bVar.d) == cls && !bVar.f9866a) {
            return (k9.k) bVar.f9867b;
        }
        while (true) {
            bVar = (av0.b) bVar.f9868c;
            if (bVar == null) {
                return null;
            }
            if (((Class) bVar.d) == cls && !bVar.f9866a) {
                return (k9.k) bVar.f9867b;
            }
        }
    }
}
