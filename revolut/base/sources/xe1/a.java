package xe1;

import cd1.e;
import dj0.d;
import gim.c;
import hd.r;
import kotlin.jvm.functions.Function1;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends c {
    public final /* synthetic */ r A;
    public int B;
    public l u;
    public Function1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Function1 f304521w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d f304522x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e f304523y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r rVar, c cVar) {
        super(cVar);
        this.A = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.q(null, null, null, this);
    }
}
