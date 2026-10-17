package p9;

import java.util.HashSet;

/* JADX INFO: loaded from: classes16.dex */
public final class w extends jji.e {
    public final HashSet e;

    public w(k9.t tVar, a aVar) {
        super(tVar, (String) null);
        this.e = new HashSet();
        Class cls = aVar.f234183c;
        RuntimeException runtimeException = q9.a.d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        q9.a aVar2 = q9.a.f243173c;
        aVar2.getClass();
        try {
            Object[] objArr = (Object[]) aVar2.f243174a.invoke(cls, null);
            int length = objArr.length;
            String[] strArr = new String[length];
            for (int i = 0; i < objArr.length; i++) {
                try {
                    strArr[i] = (String) aVar2.f243175b.invoke(objArr[i], null);
                } catch (Exception e) {
                    throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i), Integer.valueOf(objArr.length), x9.f.s(cls)), e);
                }
            }
            for (int i2 = 0; i2 < length; i2++) {
                this.e.add(strArr[i2]);
            }
        } catch (Exception unused) {
            throw new IllegalArgumentException("Failed to access RecordComponents of type " + x9.f.s(cls));
        }
    }

    @Override // jji.e
    public final String d(g gVar, String str) {
        return this.e.contains(str) ? str : super.d(gVar, str);
    }
}
