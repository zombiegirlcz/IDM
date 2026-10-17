package uoe;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.event_appearance.api.models.WelcomeAppearance;
import efm.h0;
import efm.w;
import kfm.g;
import kfm.o;
import kfm.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tx0.g4;
import uif.d;
import up5.f;
import up5.h;
import up5.i;
import up5.l;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements o, g, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f281638b;

    public /* synthetic */ a(int i, Function1 function1) {
        this.f281637a = i;
        this.f281638b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f281637a) {
            case 2:
                ((g4) this.f281638b).invoke(obj2);
                break;
            case 14:
                ((f) this.f281638b).invoke(obj2);
                break;
            case 16:
                ((f) this.f281638b).invoke(obj2);
                break;
            case 21:
                ((f) this.f281638b).invoke(obj2);
                break;
            case 26:
                ((f) this.f281638b).invoke(obj2);
                break;
            default:
                ((f) this.f281638b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f281637a) {
            case 0:
                d dVar = (d) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                dVar.invoke(p0);
                return Boolean.TRUE;
            case 1:
                um7.d dVar2 = (um7.d) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (WelcomeAppearance) dVar2.invoke(p0);
            case 2:
            case 11:
            case 14:
            case 16:
            case 17:
            case 21:
            default:
                h hVar = (h) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) hVar.invoke(p0);
            case 3:
                umc.c cVar = (umc.c) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) cVar.invoke(p0);
            case 4:
                f fVar = (f) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) fVar.invoke(p0);
            case 5:
                umc.c cVar2 = (umc.c) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) cVar2.invoke(p0);
            case 6:
                l lVar = (l) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) lVar.invoke(p0);
            case 7:
                f fVar2 = (f) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) fVar2.invoke(p0);
            case 8:
                f fVar3 = (f) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) fVar3.invoke(p0);
            case 9:
                f fVar4 = (f) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) fVar4.invoke(p0);
            case 10:
                umc.c cVar3 = (umc.c) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) cVar3.invoke(p0);
            case 12:
                h hVar2 = (h) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) hVar2.invoke(p0);
            case 13:
                f fVar5 = (f) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) fVar5.invoke(p0);
            case 15:
                f fVar6 = (f) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) fVar6.invoke(p0);
            case 18:
                f fVar7 = (f) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) fVar7.invoke(p0);
            case 19:
                f fVar8 = (f) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) fVar8.invoke(p0);
            case 20:
                f fVar9 = (f) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) fVar9.invoke(p0);
            case 22:
                i iVar = (i) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) iVar.invoke(p0);
            case 23:
                d dVar3 = (d) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) dVar3.invoke(p0);
            case 24:
                f fVar10 = (f) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) fVar10.invoke(p0);
            case 25:
                f fVar11 = (f) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) fVar11.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f281637a) {
            case 11:
                h hVar = (h) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) hVar.invoke(p0)).booleanValue();
            case 17:
                h hVar2 = (h) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) hVar2.invoke(p0)).booleanValue();
            default:
                h hVar3 = (h) this.f281638b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) hVar3.invoke(p0)).booleanValue();
        }
    }
}
