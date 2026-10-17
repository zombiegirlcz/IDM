package wc2;

import com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public RegisterAlias$Alias u;
    public Function1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f296317w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f296318x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f296319y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f296318x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f296317w = obj2;
        this.f296319y |= Integer.MIN_VALUE;
        return this.f296318x.s0(null, null, null, this);
    }
}
