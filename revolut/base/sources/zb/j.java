package zb;

import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f320780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f320781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wb.e f320782c;

    public j(String str, byte[] bArr, wb.e eVar) {
        this.f320780a = str;
        this.f320781b = bArr;
        this.f320782c = eVar;
    }

    public static jpf.a a() {
        jpf.a aVar = new jpf.a();
        wb.e eVar = wb.e.DEFAULT;
        if (eVar == null) {
            throw new NullPointerException("Null priority");
        }
        aVar.f177269c = eVar;
        return aVar;
    }

    public final j b(wb.e eVar) {
        jpf.a aVarA = a();
        aVarA.x(this.f320780a);
        if (eVar == null) {
            throw new NullPointerException("Null priority");
        }
        aVarA.f177269c = eVar;
        aVarA.f177268b = this.f320781b;
        return aVarA.j();
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof j) {
            j jVar = (j) obj2;
            if (this.f320780a.equals(jVar.f320780a)) {
                if (Arrays.equals(this.f320781b, jVar instanceof j ? jVar.f320781b : jVar.f320781b) && this.f320782c.equals(jVar.f320782c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f320780a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f320781b)) * 1000003) ^ this.f320782c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f320781b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb6 = new StringBuilder("TransportContext(");
        sb6.append(this.f320780a);
        sb6.append(", ");
        sb6.append(this.f320782c);
        sb6.append(", ");
        return v0.a.i(sb6, strEncodeToString, ")");
    }
}
