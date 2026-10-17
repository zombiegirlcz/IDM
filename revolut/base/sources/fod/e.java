package fod;

import com.revolut.retail.feature.api.trips.models.Trip;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public Object A;
    public Trip B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ List J;
    public final /* synthetic */ a K;
    public final /* synthetic */ LinkedHashMap L;
    public final /* synthetic */ k M;
    public Map u;
    public a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k f136931w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Collection f136932x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Iterator f136933y;
    public ind.e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List list, a aVar, LinkedHashMap linkedHashMap, k kVar, Continuation continuation) {
        super(2, continuation);
        this.J = list;
        this.K = aVar;
        this.L = linkedHashMap;
        this.M = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.J, this.K, this.L, this.M, continuation);
        eVar.I = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0183  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x015d -> B:30:0x0167). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0171 -> B:32:0x0175). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fod.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
