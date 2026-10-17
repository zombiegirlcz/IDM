package h7;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class h extends kotlin.jvm.internal.u implements Function0 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f149785h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, int i) {
        super(0);
        this.f = i;
        this.f149785h = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f) {
            case 0:
                j jVar = (j) this.f149785h;
                d7.j jVarD = jVar.d();
                float fA = BitmapDescriptorFactory.HUE_RED;
                if (jVarD != null) {
                    if (jVar.g() < BitmapDescriptorFactory.HUE_RED) {
                        u uVarC = jVar.c();
                        if (uVarC != null) {
                            fA = uVarC.b(jVarD);
                        }
                    } else {
                        u uVarC2 = jVar.c();
                        fA = uVarC2 != null ? uVarC2.a(jVarD) : 1.0f;
                    }
                }
                return Float.valueOf(fA);
            case 1:
                j jVar2 = (j) this.f149785h;
                return Float.valueOf((((Boolean) jVar2.d.getValue()).booleanValue() && jVar2.e() % 2 == 0) ? -jVar2.g() : jVar2.g());
            case 2:
                j jVar3 = (j) this.f149785h;
                return Boolean.valueOf(jVar3.e() == ((Number) jVar3.f149794c.getValue()).intValue() && jVar3.f() == ((Number) jVar3.f149799m.getValue()).floatValue());
            default:
                w9m.b bVar = (w9m.b) this.f149785h;
                nkm.d0 d0VarX = nkm.y.x(zhm.d0.Q(bVar.f295763a.getLayoutInfo().getVisibleItemsInfo()), w9m.a.f);
                Iterator it8 = d0VarX.f216835a.iterator();
                Object obj2 = null;
                while (it8.hasNext()) {
                    Object objInvoke = d0VarX.f216836b.invoke(it8.next());
                    w9m.c cVar = (w9m.c) objInvoke;
                    if (cVar.f295766a.getOffset() <= ((Number) bVar.f295764b.invoke(bVar, cVar)).intValue()) {
                        obj2 = objInvoke;
                    }
                }
                return (w9m.c) obj2;
        }
    }
}
