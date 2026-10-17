package d8e;

import com.revolut.feature.subaccount.api.models.Subaccount;
import org.joda.time.LocalDate;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.c {
    public int A;
    public Subaccount u;
    public p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LocalDate f112227w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public jli.c f112228x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f112229y;
    public final /* synthetic */ com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.z = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f112229y = obj2;
        this.A |= Integer.MIN_VALUE;
        return com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a.P2(this.z, this);
    }
}
