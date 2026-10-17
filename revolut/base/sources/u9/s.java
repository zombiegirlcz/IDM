package u9;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import v9.o0;

/* JADX INFO: loaded from: classes16.dex */
public final class s extends o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f278289c = 0;
    public final Serializable d;

    public s(JavaType javaType, String str) {
        super(Object.class);
        this.d = str;
    }

    @Override // k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        switch (this.f278289c) {
            case 0:
                vVar.A((String) this.d);
                throw null;
            default:
                if (vVar.f182201a.n(k9.u.WRITE_ENUMS_USING_TO_STRING)) {
                    hVar.o(obj2.toString());
                    return;
                }
                Enum r3 = (Enum) obj2;
                if (vVar.f182201a.n(k9.u.WRITE_ENUM_KEYS_USING_INDEX)) {
                    hVar.o(String.valueOf(r3.ordinal()));
                    return;
                } else {
                    hVar.n(((com.fasterxml.jackson.core.q[]) ((k9.c) this.d).f182180b)[r3.ordinal()]);
                    return;
                }
        }
    }

    public s(Class cls, k9.c cVar) {
        super(cls, 0);
        this.d = cVar;
    }
}
