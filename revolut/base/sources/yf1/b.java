package yf1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ c B;
    public int C;
    public List u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f313112w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f313113x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public qf1.e f313114y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.B = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, this);
    }
}
