package kk8;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.c {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ k C;
    public int D;
    public Map u;
    public Map v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f184512w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Map f184513x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f184514y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.C = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.d(null, this);
    }
}
