package g7;

/* JADX INFO: loaded from: classes.dex */
public final class i extends k {
    @Override // g7.e
    public final Object g(s7.a aVar, float f) {
        return Float.valueOf(n(aVar, f));
    }

    public final float m() {
        return n(b(), d());
    }

    public final float n(s7.a aVar, float f) {
        float f4;
        Object obj2 = aVar.f260482b;
        Object obj3 = aVar.f260482b;
        if (obj2 == null || aVar.f260483c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        s7.c cVar = this.e;
        if (cVar != null) {
            f4 = f;
            Float f5 = (Float) cVar.b(aVar.f260484g, aVar.f260485h.floatValue(), (Float) obj3, (Float) aVar.f260483c, f4, e(), this.d);
            if (f5 != null) {
                return f5.floatValue();
            }
        } else {
            f4 = f;
        }
        if (aVar.i == -3987645.8f) {
            aVar.i = ((Float) obj3).floatValue();
        }
        float f6 = aVar.i;
        if (aVar.f260486j == -3987645.8f) {
            aVar.f260486j = ((Float) aVar.f260483c).floatValue();
        }
        return r7.g.f(f6, aVar.f260486j, f4);
    }
}
