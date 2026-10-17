package pxa;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.c {
    public List u;
    public Function1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f240588w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f240589x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f240590y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f240590y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f240589x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f240590y.Z2(null, null, this);
    }
}
