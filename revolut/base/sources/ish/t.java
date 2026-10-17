package ish;

import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends gim.c {
    public int A;
    public WidgetContext u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f168284w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f168285x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f168286y;
    public final /* synthetic */ z z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z zVar, gim.c cVar) {
        super(cVar);
        this.z = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f168286y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.h(null, 0, 0, this);
    }
}
