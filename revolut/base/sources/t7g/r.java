package t7g;

import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Lazy[] f268686j = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new t73.h(9)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f268688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f268689c;
    public final String d;
    public final int e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f268690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f268691h;
    public final Integer i;

    public /* synthetic */ r(int i, String str, f fVar, f fVar2, String str2, int i2, List list, i iVar, i iVar2, Integer num) {
        if (219 != (i & Constants.TAG_KSL_ID)) {
            j1.f(p.f268685a.getDescriptor(), i, Constants.TAG_KSL_ID);
            throw null;
        }
        this.f268687a = str;
        this.f268688b = fVar;
        if ((i & 4) == 0) {
            this.f268689c = null;
        } else {
            this.f268689c = fVar2;
        }
        this.d = str2;
        this.e = i2;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        this.f268690g = iVar;
        this.f268691h = iVar2;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f268687a, rVar.f268687a) && Intrinsics.f(this.f268688b, rVar.f268688b) && Intrinsics.f(this.f268689c, rVar.f268689c) && Intrinsics.f(this.d, rVar.d) && this.e == rVar.e && Intrinsics.f(this.f, rVar.f) && Intrinsics.f(this.f268690g, rVar.f268690g) && Intrinsics.f(this.f268691h, rVar.f268691h) && Intrinsics.f(this.i, rVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f268688b.hashCode() + (this.f268687a.hashCode() * 31)) * 31;
        f fVar = this.f268689c;
        int iB = j6.a.b(this.e, p.a.c((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.d), 31);
        List list = this.f;
        int iHashCode2 = (this.f268691h.hashCode() + ((this.f268690g.hashCode() + ((iB + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31;
        Integer num = this.i;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
