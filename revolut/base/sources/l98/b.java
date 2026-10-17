package l98;

import com.revolut.retail.core.navigation.NaviCommand;
import h93.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.c {
    public f0 A;
    public /* synthetic */ Object B;
    public final /* synthetic */ f C;
    public int D;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f193109w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b93.b f193110x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public NaviCommand f193111y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, gim.c cVar) {
        super(cVar);
        this.C = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.b(null, null, null, null, null, this);
    }
}
