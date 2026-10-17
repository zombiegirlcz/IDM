package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.reflect.KDeclarationContainer;

/* JADX INFO: loaded from: classes13.dex */
public class a implements o, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public a(int i, Class cls, String str, String str2, int i2) {
        this(i, i2, cls, h.NO_RECEIVER, str, str2);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.isTopLevel == aVar.isTopLevel && this.arity == aVar.arity && this.flags == aVar.flags && Intrinsics.f(this.receiver, aVar.receiver) && Intrinsics.f(this.owner, aVar.owner) && this.name.equals(aVar.name) && this.signature.equals(aVar.signature);
    }

    @Override // kotlin.jvm.internal.o
    public int getArity() {
        return this.arity;
    }

    public KDeclarationContainer getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? o0.f186429a.c(cls) : o0.f186429a.b(cls);
    }

    public int hashCode() {
        Object obj2 = this.receiver;
        int iHashCode = (obj2 != null ? obj2.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((p.a.c(p.a.c((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.name), 31, this.signature) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return o0.f186429a.l(this);
    }

    public a(int i, int i2, Class cls, Object obj2, String str, String str2) {
        this.receiver = obj2;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i2 & 1) == 1;
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
