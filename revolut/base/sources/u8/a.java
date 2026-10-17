package u8;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.collection.SimpleArrayMap;
import c8.o;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import e8.p;
import java.util.Map;
import l8.n;
import l8.s;
import l8.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import y8.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f277983a;
    public Drawable d;
    public int e;
    public Drawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f277986g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f277989l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f277990m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f277993q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Resources.Theme f277994r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f277995s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f277996t;
    public boolean v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f277984b = p.d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.h f277985c = com.bumptech.glide.h.NORMAL;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f277987h = true;
    public int i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f277988j = -1;
    public c8.g k = x8.c.f303251a;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c8.k f277991n = new c8.k();
    public y8.c o = new y8.c();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Class f277992p = Object.class;
    public boolean u = true;

    public static boolean o(int i, int i2) {
        return (i & i2) != 0;
    }

    public final a A(c8.j jVar) {
        if (this.f277995s) {
            return clone().A(jVar);
        }
        this.f277991n.f22068a.remove(jVar);
        C();
        return this;
    }

    public final a B(n nVar, l8.d dVar, boolean z) {
        a aVarK = z ? K(nVar, dVar) : u(nVar, dVar);
        aVarK.u = true;
        return aVarK;
    }

    public final void C() {
        if (this.f277993q) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public a D(c8.j jVar, Object obj2) {
        if (this.f277995s) {
            return clone().D(jVar, obj2);
        }
        y8.f.b(jVar);
        y8.f.b(obj2);
        this.f277991n.f22068a.put(jVar, obj2);
        C();
        return this;
    }

    public a E(c8.g gVar) {
        if (this.f277995s) {
            return clone().E(gVar);
        }
        this.k = gVar;
        this.f277983a |= 1024;
        C();
        return this;
    }

    public a F(boolean z) {
        if (this.f277995s) {
            return clone().F(true);
        }
        this.f277987h = !z;
        this.f277983a |= 256;
        C();
        return this;
    }

    public a G(Resources.Theme theme) {
        if (this.f277995s) {
            return clone().G(theme);
        }
        this.f277994r = theme;
        if (theme != null) {
            this.f277983a |= 32768;
            return D(n8.d.f213179b, theme);
        }
        this.f277983a &= -32769;
        return A(n8.d.f213179b);
    }

    public a H(o oVar) {
        return I(oVar, true);
    }

    public final a I(o oVar, boolean z) {
        if (this.f277995s) {
            return clone().I(oVar, z);
        }
        s sVar = new s(oVar, z);
        J(Bitmap.class, oVar, z);
        J(Drawable.class, sVar, z);
        J(BitmapDrawable.class, sVar, z);
        J(GifDrawable.class, new p8.c(oVar), z);
        C();
        return this;
    }

    public final a J(Class cls, o oVar, boolean z) {
        if (this.f277995s) {
            return clone().J(cls, oVar, z);
        }
        y8.f.b(oVar);
        this.o.put(cls, oVar);
        int i = this.f277983a;
        this.f277983a = 67584 | i;
        this.u = false;
        if (z) {
            this.f277983a = i | 198656;
            this.f277989l = true;
        }
        C();
        return this;
    }

    public final a K(n nVar, l8.d dVar) {
        if (this.f277995s) {
            return clone().K(nVar, dVar);
        }
        i(nVar);
        return H(dVar);
    }

    public a L(o... oVarArr) {
        if (oVarArr.length > 1) {
            return I(new c8.h(oVarArr), true);
        }
        if (oVarArr.length == 1) {
            return H(oVarArr[0]);
        }
        C();
        return this;
    }

    public a M() {
        if (this.f277995s) {
            return clone().M();
        }
        this.v = true;
        this.f277983a |= PKIFailureInfo.badCertTemplate;
        C();
        return this;
    }

    public a a(a aVar) {
        if (this.f277995s) {
            return clone().a(aVar);
        }
        int i = aVar.f277983a;
        if (o(aVar.f277983a, PKIFailureInfo.badCertTemplate)) {
            this.v = aVar.v;
        }
        if (o(aVar.f277983a, 4)) {
            this.f277984b = aVar.f277984b;
        }
        if (o(aVar.f277983a, 8)) {
            this.f277985c = aVar.f277985c;
        }
        if (o(aVar.f277983a, 16)) {
            this.d = aVar.d;
            this.e = 0;
            this.f277983a &= -33;
        }
        if (o(aVar.f277983a, 32)) {
            this.e = aVar.e;
            this.d = null;
            this.f277983a &= -17;
        }
        if (o(aVar.f277983a, 64)) {
            this.f = aVar.f;
            this.f277986g = 0;
            this.f277983a &= -129;
        }
        if (o(aVar.f277983a, 128)) {
            this.f277986g = aVar.f277986g;
            this.f = null;
            this.f277983a &= -65;
        }
        if (o(aVar.f277983a, 256)) {
            this.f277987h = aVar.f277987h;
        }
        if (o(aVar.f277983a, 512)) {
            this.f277988j = aVar.f277988j;
            this.i = aVar.i;
        }
        if (o(aVar.f277983a, 1024)) {
            this.k = aVar.k;
        }
        if (o(aVar.f277983a, 4096)) {
            this.f277992p = aVar.f277992p;
        }
        if (o(aVar.f277983a, 8192)) {
            this.f277990m = aVar.f277990m;
            this.f277983a &= -16385;
        }
        if (o(aVar.f277983a, 16384)) {
            this.f277990m = null;
            this.f277983a &= -8193;
        }
        if (o(aVar.f277983a, 32768)) {
            this.f277994r = aVar.f277994r;
        }
        if (o(aVar.f277983a, 131072)) {
            this.f277989l = aVar.f277989l;
        }
        if (o(aVar.f277983a, 2048)) {
            this.o.putAll((Map) aVar.o);
            this.u = aVar.u;
        }
        if (o(aVar.f277983a, 524288)) {
            this.f277996t = aVar.f277996t;
        }
        this.f277983a |= aVar.f277983a;
        this.f277991n.f22068a.putAll((SimpleArrayMap) aVar.f277991n.f22068a);
        C();
        return this;
    }

    public a b() {
        if (this.f277993q && !this.f277995s) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f277995s = true;
        return p();
    }

    @Override // 
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            c8.k kVar = new c8.k();
            aVar.f277991n = kVar;
            kVar.f22068a.putAll((SimpleArrayMap) this.f277991n.f22068a);
            y8.c cVar = new y8.c();
            aVar.o = cVar;
            cVar.putAll((Map) this.o);
            aVar.f277993q = false;
            aVar.f277995s = false;
            return aVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public a e(Class cls) {
        if (this.f277995s) {
            return clone().e(cls);
        }
        this.f277992p = cls;
        this.f277983a |= 4096;
        C();
        return this;
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof a) {
            return n((a) obj2);
        }
        return false;
    }

    public a f() {
        return D(l8.p.i, Boolean.FALSE);
    }

    public a g(p pVar) {
        if (this.f277995s) {
            return clone().g(pVar);
        }
        this.f277984b = pVar;
        this.f277983a |= 4;
        C();
        return this;
    }

    public a h() {
        return D(p8.h.f233812b, Boolean.TRUE);
    }

    public int hashCode() {
        char[] cArr = l.f311609a;
        return l.h(l.h(l.h(l.h(l.h(l.h(l.h(l.g(this.f277996t ? 1 : 0, l.g(0, l.g(1, l.g(this.f277989l ? 1 : 0, l.g(this.f277988j, l.g(this.i, l.g(this.f277987h ? 1 : 0, l.h(l.g(0, l.h(l.g(this.f277986g, l.h(l.g(this.e, l.g(Float.floatToIntBits(1.0f), 17)), this.d)), this.f)), this.f277990m)))))))), this.f277984b), this.f277985c), this.f277991n), this.o), this.f277992p), this.k), this.f277994r);
    }

    public a i(n nVar) {
        return D(n.f, nVar);
    }

    public a j(int i) {
        if (this.f277995s) {
            return clone().j(i);
        }
        this.e = i;
        int i2 = this.f277983a | 32;
        this.d = null;
        this.f277983a = i2 & (-17);
        C();
        return this;
    }

    public a k(Drawable drawable) {
        if (this.f277995s) {
            return clone().k(drawable);
        }
        this.d = drawable;
        int i = this.f277983a | 16;
        this.e = 0;
        this.f277983a = i & (-33);
        C();
        return this;
    }

    public a l(Drawable drawable) {
        if (this.f277995s) {
            return clone().l(drawable);
        }
        this.f277990m = drawable;
        this.f277983a = (this.f277983a | 8192) & (-16385);
        C();
        return this;
    }

    public a m() {
        return B(n.f192738a, new u(), true);
    }

    public final boolean n(a aVar) {
        aVar.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && this.e == aVar.e && l.b(this.d, aVar.d) && this.f277986g == aVar.f277986g && l.b(this.f, aVar.f) && l.b(this.f277990m, aVar.f277990m) && this.f277987h == aVar.f277987h && this.i == aVar.i && this.f277988j == aVar.f277988j && this.f277989l == aVar.f277989l && this.f277996t == aVar.f277996t && this.f277984b.equals(aVar.f277984b) && this.f277985c == aVar.f277985c && this.f277991n.equals(aVar.f277991n) && this.o.equals(aVar.o) && this.f277992p.equals(aVar.f277992p) && this.k.equals(aVar.k) && l.b(this.f277994r, aVar.f277994r);
    }

    public a p() {
        this.f277993q = true;
        return this;
    }

    public a q(boolean z) {
        if (this.f277995s) {
            return clone().q(z);
        }
        this.f277996t = z;
        this.f277983a |= 524288;
        C();
        return this;
    }

    public a r() {
        return u(n.f192740c, new l8.g());
    }

    public a s() {
        return B(n.f192739b, new l8.h(), false);
    }

    public a t() {
        return B(n.f192738a, new u(), false);
    }

    public final a u(n nVar, l8.d dVar) {
        if (this.f277995s) {
            return clone().u(nVar, dVar);
        }
        i(nVar);
        return I(dVar, false);
    }

    public a v() {
        return w(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public a w(int i, int i2) {
        if (this.f277995s) {
            return clone().w(i, i2);
        }
        this.f277988j = i;
        this.i = i2;
        this.f277983a |= 512;
        C();
        return this;
    }

    public a x(int i) {
        if (this.f277995s) {
            return clone().x(i);
        }
        this.f277986g = i;
        int i2 = this.f277983a | 128;
        this.f = null;
        this.f277983a = i2 & (-65);
        C();
        return this;
    }

    public a y(Drawable drawable) {
        if (this.f277995s) {
            return clone().y(drawable);
        }
        this.f = drawable;
        int i = this.f277983a | 64;
        this.f277986g = 0;
        this.f277983a = i & (-129);
        C();
        return this;
    }

    public a z(com.bumptech.glide.h hVar) {
        if (this.f277995s) {
            return clone().z(hVar);
        }
        y8.f.c(hVar, "Argument must not be null");
        this.f277985c = hVar;
        this.f277983a |= 8;
        C();
        return this;
    }
}
