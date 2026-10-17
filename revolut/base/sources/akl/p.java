package akl;

import btb.r;
import java.util.Objects;
import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;
import retrofit2.Response;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class p implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6069b;

    public /* synthetic */ p(Object obj2, int i) {
        this.f6068a = i;
        this.f6069b = obj2;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj2) {
        int i = this.f6068a;
        Object obj3 = this.f6069b;
        switch (i) {
            case 0:
                return ((Boolean) ((afa.q) obj3).invoke(obj2)).booleanValue();
            case 1:
                return ((Boolean) ((ak7.g) obj3).invoke(obj2)).booleanValue();
            case 2:
                return ((Boolean) ((btb.m) obj3).invoke(obj2)).booleanValue();
            case 3:
                r.a aVar = btb.r.Companion;
                return ((Boolean) ((bt9.t) obj3).invoke(obj2)).booleanValue();
            case 4:
                return ((Boolean) ((aqd.g) obj3).invoke(obj2)).booleanValue();
            case 5:
                return ((Boolean) ((jb8.a) obj3).invoke(obj2)).booleanValue();
            case 6:
                return ((Boolean) ((k7c.n) obj3).invoke(obj2)).booleanValue();
            case 7:
                return ((Boolean) ((k7c.n) obj3).invoke(obj2)).booleanValue();
            case 8:
                return ((Boolean) ((k7c.n) obj3).invoke(obj2)).booleanValue();
            case 9:
                return ((Boolean) ((Function1) obj3).invoke((Response) obj2)).booleanValue();
            case 10:
                return ((Boolean) ((l3d.a) obj3).invoke(obj2)).booleanValue();
            case 11:
                return ((Boolean) ((jeg.i) obj3).invoke(obj2)).booleanValue();
            case 12:
                return ((Boolean) ((jeg.i) obj3).invoke(obj2)).booleanValue();
            case 13:
                return ((Boolean) ((jeg.i) obj3).invoke(obj2)).booleanValue();
            case 14:
                return ((Boolean) ((lul.d) obj3).invoke(obj2)).booleanValue();
            case 15:
                return ((Boolean) ((jeg.i) obj3).invoke(obj2)).booleanValue();
            case 16:
                return ((Boolean) ((jeg.i) obj3).invoke(obj2)).booleanValue();
            case 17:
                nhm.s sVar = (nhm.s) obj3;
                mhm.d dVar = (mhm.d) obj2;
                sVar.getClass();
                Object obj4 = dVar.f205589a;
                nhm.b bVar = ((nhm.l) sVar).f215602a;
                bVar.getClass();
                return ((Boolean) bVar.b(0, Objects.hashCode(obj4), obj4).map(new bpd.a(dVar, 11)).F5(Boolean.FALSE)).booleanValue();
            case 18:
                return ((Boolean) ((nj8.b) obj3).invoke(obj2)).booleanValue();
            case 19:
                return ((Class) obj3).isAssignableFrom(((Throwable) obj2).getClass());
            case 20:
                return ((Boolean) ((pth.i) obj3).invoke(obj2)).booleanValue();
            case 21:
                return ((Boolean) ((pth.i) obj3).invoke(obj2)).booleanValue();
            case 22:
                return ((Boolean) ((skd.b) obj3).invoke(obj2)).booleanValue();
            case 23:
                return ((Boolean) ((jci.h) obj3).invoke(obj2)).booleanValue();
            case 24:
                return ((Boolean) ((nxc.a) obj3).invoke(obj2)).booleanValue();
            case 25:
                return ((Boolean) ((sx4.b) obj3).invoke(obj2)).booleanValue();
            case 26:
                return ((Boolean) ((sx4.b) obj3).invoke(obj2)).booleanValue();
            case 27:
                return ((Boolean) ((uo7.k) obj3).invoke(obj2)).booleanValue();
            case 28:
                return ((Boolean) ((vh2.j) obj3).invoke(obj2)).booleanValue();
            default:
                return ((Boolean) ((wyc.p) obj3).invoke(obj2)).booleanValue();
        }
    }
}
