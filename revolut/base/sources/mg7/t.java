package mg7;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes22.dex */
public final class t extends gim.c {
    public String A;
    public String B;
    public String C;
    public Collection D;
    public int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ u H;
    public int I;
    public String u;
    public Collection v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f205184w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public gf7.k f205185x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f205186y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, gim.c cVar) {
        super(cVar);
        this.H = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.G = obj2;
        this.I |= Integer.MIN_VALUE;
        return u.I2(this.H, null, this);
    }
}
