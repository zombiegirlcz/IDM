package joh;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177006a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f177007b;

    public h(w wVar, i iVar) {
        this.f177007b = wVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f177006a) {
            case 0:
                nph.d tabTitleMapper = new nph.d();
                Intrinsics.checkNotNullParameter(tabTitleMapper, "tabTitleMapper");
                lph.j jVar = new lph.j();
                w wVar = this.f177007b;
                ugl.c cVarD = wVar.f.d();
                vc.s.j(cVarD);
                return new lph.d(jVar, cVarD, new nph.b(new ooh.d()), wVar.d.g());
            default:
                Context context = this.f177007b.f177067a;
                loh.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return new koh.d(sri.o.c(context, null, null, 14));
        }
    }

    public h(w wVar) {
        this.f177007b = wVar;
    }
}
