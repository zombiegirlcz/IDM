package rof;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import pof.j;
import r40.n0;
import tpi.i;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f255997b;

    public /* synthetic */ d(g gVar, int i) {
        this.f255996a = i;
        this.f255997b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f255996a) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                g gVar = this.f255997b;
                ((rpi.b) gVar.f256004p).N(false);
                com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, gVar.k);
                return Unit.f186387a;
            case 1:
                ((i) this.f255997b.o).W(true);
                return Unit.f186387a;
            case 2:
                String comment = (String) obj2;
                Intrinsics.checkNotNullParameter(comment, "text");
                pof.a aVar = this.f255997b.f256000j;
                j jVar = (j) aVar;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(comment, "comment");
                ((pof.c) jVar.f237987b).w0().set(comment);
                j jVar2 = (j) aVar;
                jVar2.getClass();
                h hVar = new h(new nc0.a(jVar2, 11), 1);
                Intrinsics.checkNotNullExpressionValue(hVar, "defer(...)");
                return hVar;
            case 3:
                ((i) this.f255997b.o).Q();
                return Unit.f186387a;
            case 4:
                this.f255997b.f256001l.setEnabled(((String) obj2).length() <= 64);
                return Unit.f186387a;
            default:
                String text = (String) obj2;
                Intrinsics.checkNotNullParameter(text, "text");
                return this.f255997b.f256001l.s().map(new rea.j(new n0(text, 21), 28));
        }
    }
}
