package p9;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes16.dex */
public abstract class k extends f {
    public final q[] d;

    public k(i0 i0Var, q qVar, q[] qVarArr) {
        super(i0Var, qVar);
        this.d = qVarArr;
    }

    public final j u(int i) {
        JavaType javaTypeV = v(i);
        q[] qVarArr = this.d;
        return new j(this, javaTypeV, this.f234212b, (qVarArr == null || i < 0 || i >= qVarArr.length) ? null : qVarArr[i], i);
    }

    public abstract JavaType v(int i);
}
