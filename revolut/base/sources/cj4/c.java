package cj4;

import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.c {
    public jt3.a u;
    public CreditApplicationPluginFlowContract$Configuration v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Function0 f24598w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f24599x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f24600y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f24600y = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f24599x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f24600y.Z2(null, null, null, null, this);
    }
}
