package vz0;

import b9.g3;
import b9.m2;
import b9.n1;
import b9.o0;
import b9.z;
import c8.k;
import c8.m;
import com.caverock.androidsvg.SVGParseException;
import e8.e0;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements m {
    @Override // c8.m
    public final boolean a(Object obj2, k options) {
        InputStream source = (InputStream) obj2;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(options, "options");
        return true;
    }

    @Override // c8.m
    public final e0 b(Object obj2, int i, int i2, k options) throws IOException {
        InputStream source = (InputStream) obj2;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(options, "options");
        try {
            m2 m2VarF = new g3().f(source);
            float f = i;
            n1 n1Var = m2VarF.f13407a;
            if (n1Var == null) {
                throw new IllegalArgumentException("SVG document is empty");
            }
            n1Var.f13418r = new o0(f);
            float f4 = i2;
            n1 n1Var2 = m2VarF.f13407a;
            if (n1Var2 == null) {
                throw new IllegalArgumentException("SVG document is empty");
            }
            n1Var2.f13419s = new o0(f4);
            z zVar = z.f13515c;
            n1 n1Var3 = m2VarF.f13407a;
            if (n1Var3 == null) {
                throw new IllegalArgumentException("SVG document is empty");
            }
            n1Var3.f13496n = zVar;
            return new k8.c(m2VarF);
        } catch (SVGParseException e) {
            throw new IOException("Cannot load SVG from stream", e);
        }
    }
}
