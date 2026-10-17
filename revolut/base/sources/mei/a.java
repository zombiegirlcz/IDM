package mei;

import java.util.Set;
import zhm.a1;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f204683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f204684c;

    public /* synthetic */ a(g gVar, Set set, int i) {
        this.f204682a = i;
        this.f204683b = gVar;
        this.f204684c = set;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f204682a) {
            case 0:
                g gVar = this.f204683b;
                ne0.d dVar = gVar.f204692b;
                Set set = (Set) dVar.get("TEMPORARILY_CLOSED_TILES");
                if (set == null) {
                    set = h0.f322473a;
                }
                dVar.f("TEMPORARILY_CLOSED_TILES", a1.l(set, this.f204684c));
                gVar.d.c(null, (1 & 2) == 0, new md0.c(10));
                break;
            default:
                g gVar2 = this.f204683b;
                ne0.d dVar2 = gVar2.f204692b;
                Set set2 = (Set) dVar2.get("TEMPORARILY_CLOSED_TILES");
                if (set2 == null) {
                    set2 = h0.f322473a;
                }
                dVar2.f("TEMPORARILY_CLOSED_TILES", a1.k(set2, this.f204684c));
                gVar2.d.c(null, (1 & 2) == 0, new md0.c(11));
                break;
        }
    }
}
