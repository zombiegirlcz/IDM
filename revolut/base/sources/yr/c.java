package yr;

import java.io.File;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends gim.c {
    public final /* synthetic */ d A;
    public int B;
    public kotlin.time.d u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f316044w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public File f316045x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f316046y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.A = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(this);
    }
}
