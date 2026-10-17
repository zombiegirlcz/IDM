package p1j;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.c {
    public boolean A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ i E;
    public int F;
    public Object u;
    public TextDelegate.Model v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextDelegate.Model f231952w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextDelegate.Model f231953x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextDelegate.Model f231954y;
    public List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.E = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.D = obj2;
        this.F |= Integer.MIN_VALUE;
        return this.E.b(null, false, this);
    }
}
