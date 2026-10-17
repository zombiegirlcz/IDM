package fy1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ g B;
    public int C;
    public n02.b u;
    public ApmDescriptor v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f138841w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ky1.a f138842x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f138843y;
    public ArrayList z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, gim.c cVar) {
        super(cVar);
        this.B = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, null, null, this);
    }
}
