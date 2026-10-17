package ai0;

import an.f;
import androidx.room.RxRoom;
import com.google.android.gms.maps.GoogleMap;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.impl.ui.spaces.AccountSpacesScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.e0;
import efm.g0;
import efm.h0;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import le.u1;
import mx0.r9;
import mx0.s9;
import mx0.u9;
import rp0.u0;
import yna.w;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class j implements GoogleMap.OnCameraMoveStartedListener, kfm.p, kfm.o, g0, kfm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5154b;

    public /* synthetic */ j(Object obj2, int i) {
        this.f5153a = i;
        this.f5154b = obj2;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f5153a) {
            case 3:
                afa.q qVar = (afa.q) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (u0) qVar.invoke(p0);
            case 4:
                aik.d dVar = (aik.d) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) dVar.invoke(p0);
            case 5:
                aik.d dVar2 = (aik.d) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) dVar2.invoke(p0);
            case 6:
                afa.q qVar2 = (afa.q) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) qVar2.invoke(p0);
            case 7:
                aik.d dVar3 = (aik.d) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (byte[]) dVar3.invoke(p0);
            case 8:
                ak7.g gVar = (ak7.g) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (byte[]) gVar.invoke(p0);
            case 9:
                afa.q qVar3 = (afa.q) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (byte[]) qVar3.invoke(p0);
            case 10:
                aik.d dVar4 = (aik.d) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) dVar4.invoke(p0);
            case 11:
                afa.q qVar4 = (afa.q) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) qVar4.invoke(p0);
            case 12:
                amf.i iVar = (amf.i) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (an.e) iVar.invoke(p0);
            case 13:
                amf.i iVar2 = (amf.i) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                iVar2.invoke(p0);
                return f.a.f6504a;
            case 14:
                amf.i iVar3 = (amf.i) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (an.i) iVar3.invoke(p0);
            case 15:
                an4.f fVar = (an4.f) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) fVar.invoke(p0);
            case 16:
                amf.i iVar4 = (amf.i) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) iVar4.invoke(p0);
            case 17:
                amf.i iVar5 = (amf.i) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) iVar5.invoke(p0);
            case 18:
                a08.e eVar = (a08.e) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) eVar.invoke(p0);
            case 19:
            default:
                aoa.g gVar2 = (aoa.g) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) gVar2.invoke(p0);
            case 20:
                amf.i iVar6 = (amf.i) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) iVar6.invoke(p0);
            case 21:
                amf.i iVar7 = (amf.i) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) iVar7.invoke(p0);
            case 22:
                a31.m mVar = (a31.m) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) mVar.invoke(p0);
            case 23:
                an4.f fVar2 = (an4.f) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) fVar2.invoke(p0);
            case 24:
                amf.i iVar8 = (amf.i) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (anf.q) iVar8.invoke(p0);
            case 25:
                amf.i iVar9 = (amf.i) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) iVar9.invoke(p0);
            case 26:
                amh.j jVar = (amh.j) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) jVar.invoke(p0);
            case 27:
                anf.p pVar = (anf.p) this.f5154b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Integer) pVar.invoke(p0);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener
    public void onCameraMoveStarted(int i) {
        wt0.a aVar = (wt0.a) this.f5154b;
        u9 u9Var = (u9) u1.u(Integer.valueOf(i), wt0.b.f299761a);
        aVar.d = u9Var;
        aVar.f299760c.invoke(new s9(r9.MOVE_STARTED, u9Var));
    }

    @Override // efm.g0
    public void subscribe(e0 e0Var) throws Exception {
        RxRoom.Companion.createSingle$lambda$6((Callable) this.f5154b, (ufm.a) e0Var);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f5153a;
        Object obj2 = this.f5154b;
        switch (i) {
            case 1:
                KProperty[] kPropertyArr = AccountSpacesScreen.Y;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((agh.h) obj2).invoke(p0)).booleanValue();
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((aik.d) obj2).invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.d
    public boolean test(Object p0, Object p17) {
        an4.g gVar = (an4.g) this.f5154b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return ((Boolean) gVar.invoke(p0, p17)).booleanValue();
    }
}
