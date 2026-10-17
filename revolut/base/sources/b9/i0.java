package b9;

import android.graphics.Matrix;
import com.caverock.androidsvg.SVGParseException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public abstract class i0 extends s1 implements q1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f13363h = new ArrayList();
    public Boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Matrix f13364j;
    public j0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f13365l;

    @Override // b9.q1
    public final void c(u1 u1Var) throws SVGParseException {
        if (u1Var instanceof c1) {
            this.f13363h.add(u1Var);
            return;
        }
        throw new SVGParseException("Gradient elements cannot contain " + u1Var + " elements.");
    }

    @Override // b9.q1
    public final List getChildren() {
        return this.f13363h;
    }
}
