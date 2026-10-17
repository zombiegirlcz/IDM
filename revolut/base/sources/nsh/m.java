package nsh;

import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends gim.c {
    public WidgetContext u;
    public ArrayList v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f218883w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f218884x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f218885y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, gim.c cVar) {
        super(cVar);
        this.f218884x = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f218883w = obj2;
        this.f218885y |= Integer.MIN_VALUE;
        return o.f3(this.f218884x, null, this);
    }
}
