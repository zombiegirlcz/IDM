package ci2;

import com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.c {
    public RegisterAlias$Alias u;
    public Function1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f24350w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f24351x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f24352y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f24351x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f24350w = obj2;
        this.f24352y |= Integer.MIN_VALUE;
        return this.f24351x.s0(null, null, null, this);
    }
}
