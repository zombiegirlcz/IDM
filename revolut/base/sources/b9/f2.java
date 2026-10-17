package b9;

import com.caverock.androidsvg.SVGParseException;

/* JADX INFO: loaded from: classes16.dex */
public abstract class f2 extends p1 {
    @Override // b9.p1, b9.q1
    public final void c(u1 u1Var) throws SVGParseException {
        if (u1Var instanceof e2) {
            this.i.add(u1Var);
            return;
        }
        throw new SVGParseException("Text content elements cannot contain " + u1Var + " elements.");
    }
}
