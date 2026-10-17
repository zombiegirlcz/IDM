package v9;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBase;

/* JADX INFO: loaded from: classes16.dex */
public class q extends o0 {
    public static final q d = new q(0);
    public static final q e = new q(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f286941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(JavaType javaType) {
        super(javaType);
        this.f286941c = 6;
    }

    @Override // k9.k
    public boolean d(k9.v vVar, Object obj2) {
        switch (this.f286941c) {
            case 1:
                return false;
            case 2:
                return ((byte[]) obj2).length == 0;
            case 3:
            case 5:
            default:
                return super.d(vVar, obj2);
            case 4:
                return ((char[]) obj2).length == 0;
            case 6:
                return true;
        }
    }

    @Override // k9.k
    public void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        switch (this.f286941c) {
            case 0:
                hVar.p();
                break;
            case 1:
                hVar.B(((TypeBase) ((k9.i) obj2)).V0());
                break;
            case 2:
                byte[] bArr = (byte[]) obj2;
                hVar.j(vVar.f182201a.f203599b.f203593g, bArr, 0, bArr.length);
                break;
            case 3:
                String string = obj2.toString();
                e9.a aVar = (e9.a) hVar;
                aVar.E("write raw value");
                aVar.v(string);
                break;
            case 4:
                char[] cArr = (char[]) obj2;
                if (vVar.f182201a.n(k9.u.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                    int length = cArr.length;
                    hVar.y(cArr);
                    int length2 = cArr.length;
                    for (int i = 0; i < length2; i++) {
                        hVar.C(cArr, i, 1);
                    }
                    hVar.l();
                } else {
                    hVar.C(cArr, 0, cArr.length);
                }
                break;
            case 5:
                hVar.o((String) obj2);
                break;
            default:
                hVar.z();
                hVar.i(obj2);
                hVar.m();
                break;
        }
    }

    @Override // k9.k
    public void h(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar, r9.c cVar) {
        f9.d dVarE;
        switch (this.f286941c) {
            case 0:
                hVar.p();
                break;
            case 1:
                TypeBase typeBase = (TypeBase) ((k9.i) obj2);
                typeBase.getClass();
                f9.d dVar = new f9.d(typeBase, com.fasterxml.jackson.core.n.VALUE_STRING);
                cVar.e(hVar, dVar);
                hVar.B(typeBase.V0());
                cVar.f(hVar, dVar);
                break;
            case 2:
                byte[] bArr = (byte[]) obj2;
                f9.d dVarE2 = cVar.e(hVar, cVar.d(bArr, com.fasterxml.jackson.core.n.VALUE_EMBEDDED_OBJECT));
                hVar.j(vVar.f182201a.f203599b.f203593g, bArr, 0, bArr.length);
                cVar.f(hVar, dVarE2);
                break;
            case 3:
                f9.d dVarE3 = cVar.e(hVar, cVar.d(obj2, com.fasterxml.jackson.core.n.VALUE_EMBEDDED_OBJECT));
                f(obj2, hVar, vVar);
                cVar.f(hVar, dVarE3);
                break;
            case 4:
                char[] cArr = (char[]) obj2;
                if (vVar.f182201a.n(k9.u.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                    dVarE = cVar.e(hVar, cVar.d(cArr, com.fasterxml.jackson.core.n.START_ARRAY));
                    int length = cArr.length;
                    for (int i = 0; i < length; i++) {
                        hVar.C(cArr, i, 1);
                    }
                } else {
                    dVarE = cVar.e(hVar, cVar.d(cArr, com.fasterxml.jackson.core.n.VALUE_STRING));
                    hVar.C(cArr, 0, cArr.length);
                }
                cVar.f(hVar, dVarE);
                break;
            case 5:
            default:
                super.h(obj2, hVar, vVar, cVar);
                break;
            case 6:
                cVar.f(hVar, cVar.e(hVar, cVar.d(obj2, com.fasterxml.jackson.core.n.START_OBJECT)));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Class cls, int i, int i2) {
        super(cls, i);
        this.f286941c = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i) {
        super(Object.class);
        this.f286941c = i;
        switch (i) {
            case 1:
                super(k9.i.class);
                break;
            case 2:
                super(byte[].class);
                break;
            case 3:
            default:
                break;
            case 4:
                super(char[].class);
                break;
            case 5:
                super(String.class, 0);
                break;
        }
    }
}
