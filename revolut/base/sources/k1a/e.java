package k1a;

import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public RecurringSplit u;
    public ArrayList v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f180180w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f180181x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f180182y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f180181x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f180180w = obj2;
        this.f180182y |= Integer.MIN_VALUE;
        return this.f180181x.f(null, null, this);
    }
}
