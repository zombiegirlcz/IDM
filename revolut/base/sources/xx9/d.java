package xx9;

import com.revolut.data.model.Data;
import com.revolut.feature.referrals.promo.api.invitation.models.ReferralsInvitationModel;
import e4k.m0;
import efm.w;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements kfm.o, kfm.g, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f309414b;

    public /* synthetic */ d(int i, Function1 function1) {
        this.f309413a = i;
        this.f309414b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f309413a) {
            case 11:
                ((t9f.n) this.f309414b).invoke(obj2);
                break;
            default:
                ((n) this.f309414b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f309413a) {
            case 0:
                c cVar = (c) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) cVar.invoke(p0);
            case 1:
                xub.e eVar = (xub.e) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (g) eVar.invoke(p0);
            case 2:
                c cVar2 = (c) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) cVar2.invoke(p0);
            case 3:
                c cVar3 = (c) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) cVar3.invoke(p0);
            case 4:
                xwd.o oVar = (xwd.o) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) oVar.invoke(p0);
            case 5:
                xub.e eVar2 = (xub.e) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) eVar2.invoke(p0);
            case 6:
                xub.e eVar3 = (xub.e) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) eVar3.invoke(p0);
            case 7:
                f fVar = (f) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h) fVar.invoke(p0);
            case 8:
                n nVar = (n) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) nVar.invoke(p0);
            case 9:
                n nVar2 = (n) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) nVar2.invoke(p0);
            case 10:
                n nVar3 = (n) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) nVar3.invoke(p0);
            case 11:
            case 14:
            case 17:
            case 24:
            case 27:
            default:
                xpe.c cVar4 = (xpe.c) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (xy7.d) cVar4.invoke(p0);
            case 12:
                f fVar2 = (f) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) fVar2.invoke(p0);
            case 13:
                f fVar3 = (f) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) fVar3.invoke(p0);
            case 15:
                f fVar4 = (f) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) fVar4.invoke(p0);
            case 16:
                n nVar4 = (n) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) nVar4.invoke(p0);
            case 18:
                f fVar5 = (f) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) fVar5.invoke(p0);
            case 19:
                n nVar5 = (n) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) nVar5.invoke(p0);
            case 20:
                n nVar6 = (n) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) nVar6.invoke(p0);
            case 21:
                n nVar7 = (n) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) nVar7.invoke(p0);
            case 22:
                xw9.c cVar5 = (xw9.c) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) cVar5.invoke(p0);
            case 23:
                xpe.c cVar6 = (xpe.c) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) cVar6.invoke(p0);
            case 25:
                m0 m0Var = (m0) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) m0Var.invoke(p0);
            case 26:
                xpe.c cVar7 = (xpe.c) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) cVar7.invoke(p0);
            case 28:
                f fVar6 = (f) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ReferralsInvitationModel) fVar6.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f309413a) {
            case 14:
                f fVar = (f) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) fVar.invoke(p0)).booleanValue();
            case 24:
                f fVar2 = (f) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) fVar2.invoke(p0)).booleanValue();
            default:
                f fVar3 = (f) this.f309414b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) fVar3.invoke(p0)).booleanValue();
        }
    }
}
