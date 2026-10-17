package fqe;

import com.revolut.feature.teen_profile.api.models.TeenProfile;
import gim.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import r10.v;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends i implements Function2 {
    public Iterator A;
    public TeenProfile B;
    public ArrayList C;
    public fo3.c D;
    public int E;
    public int F;
    public int G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ List J;
    public final /* synthetic */ Map K;
    public final /* synthetic */ v L;
    public final /* synthetic */ xi0.b M;
    public List u;
    public Set v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Map f137258w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public v f137259x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public xi0.b f137260y;
    public Collection z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List list, Map map, v vVar, xi0.b bVar, Continuation continuation) {
        super(2, continuation);
        this.J = list;
        this.K = map;
        this.L = vVar;
        this.M = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.J, this.K, this.L, this.M, continuation);
        fVar.I = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0148  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0097 -> B:37:0x0140). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0134 -> B:36:0x0136). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fqe.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
