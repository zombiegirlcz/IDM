package wwa;

import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import pwa.n;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public int A;
    public n u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f300639w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Ref$ObjectRef f300640x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f300641y;
    public final /* synthetic */ f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.z = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f300641y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(null, null, null, this);
    }
}
