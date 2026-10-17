package t43;

import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import st9.e;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f267873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f267874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f267875c;

    public /* synthetic */ b(boolean z, Object obj2, int i) {
        this.f267873a = i;
        this.f267874b = z;
        this.f267875c = obj2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f267873a) {
            case 0:
                List list = (List) this.f267875c;
                x33.a aVar = (x33.a) obj3;
                boolean z = this.f267874b;
                return cim.b.b(z ? Boolean.TRUE : Boolean.valueOf(list.contains(aVar.f302630a.f65523a.f163145a)), z ? Boolean.TRUE : Boolean.valueOf(list.contains(((x33.a) obj2).f302630a.f65523a.f163145a)));
            default:
                boolean z3 = !Intrinsics.f(((e) obj2).f265545g.b(), ((hr9.b) this.f267875c).f154791a.b());
                boolean z4 = this.f267874b;
                return cim.b.b(Boolean.valueOf(!(z3 ^ z4)), Boolean.valueOf(!((!Intrinsics.f(((e) obj3).f265545g.b(), r0.b())) ^ z4)));
        }
    }
}
